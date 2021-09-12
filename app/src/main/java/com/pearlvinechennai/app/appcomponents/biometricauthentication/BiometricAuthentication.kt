package com.pearlvinechennai.app.appcomponents.biometricauthentication

import androidx.biometric.BiometricManager
import androidx.biometric.BiometricPrompt
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity
import java.util.concurrent.Executor


/** This class will be used in the biometric authentication
*  how to use:
*   BiometricAuthentication(this,{ result ->  },{ message: String, code: Int ->  })
* */
class BiometricAuthentication(
    private val context: FragmentActivity,
    onSuccess: (result: BiometricPrompt.AuthenticationResult) -> Unit,
    private val onError: (message: String, errorCode: Int) -> Unit
) {

    private val executor: Executor = ContextCompat.getMainExecutor(context)
    private lateinit var biometricPrompt: BiometricPrompt

    /**
     *  This CallBack function will return CallBack of biometric authentication
     *  if callback returns error, it will give errString and errCode which can be handle by onError Callback
     *  if callback return success the authentication result will be passes and that will be handle onSuccess callback
     * */
    private val authenticationCallBack = object : BiometricPrompt.AuthenticationCallback() {
        override fun onAuthenticationError(errorCode: Int, errString: CharSequence) {
            super.onAuthenticationError(errorCode, errString)
            onError(errString as String, errorCode)
        }

        override fun onAuthenticationSucceeded(result: BiometricPrompt.AuthenticationResult) {
            super.onAuthenticationSucceeded(result)
            onSuccess(result)
        }
    }

    /**
     * This function will check for whether bio-metric authentication using authenticators (BIOMETRIC_STRONG and DEVICE_CREDENTIAL) is supported or not.
     *  (BIOMETRIC_STRONG and DEVICE_CREDENTIAL) authenticators are not supported in API(28-29), it will give error that can be handle by the onError callback
     *  @return it will return authentication Code
     *  how to use :
     *       val authenticationCode = [Object_Of_Class].canAuthenticate()
     **/
    fun canAuthenticate(): Int {
        val biometricManager = BiometricManager.from(context)
        return biometricManager.canAuthenticate(BiometricManager.Authenticators.BIOMETRIC_STRONG)
    }

    /** This function will be used to handle the canAuthenticate() response (authenticationCode)
     *  @param code will be the authenticationCode
     *  @param title to be shown as title
     *  @param subTitle to be shown as subTitle
     *  @param negativeBtnText to be shown on negative button
     *  if authenticationCode is success (0) then it will call openBiometric() method to open biometric prompt else it will give error that can be handle by onError
     *  how to use :
     *       [Object_Of_Class].handleCanAuthenticateResult(authenticationCode,title,subTitle,negativeBtnText)
     * */
    fun handleCanAuthenticateResult(
        code: Int,
        title: String,
        subTitle: String,
        negativeBtnText: String
    ) {
        when (code) {
            BiometricManager.BIOMETRIC_SUCCESS -> {
                openBiometric(title, subTitle, negativeBtnText)
            }
            BiometricManager.BIOMETRIC_ERROR_NONE_ENROLLED -> {
                onError("BIOMETRIC_ERROR_NONE_ENROLLED", code)
            }
            BiometricManager.BIOMETRIC_ERROR_UNSUPPORTED -> {
                onError("BIOMETRIC_ERROR_UNSUPPORTED", code)
            }
            BiometricManager.BIOMETRIC_ERROR_SECURITY_UPDATE_REQUIRED -> {
                onError("BIOMETRIC_ERROR_SECURITY_UPDATE_REQUIRED", code)
            }
            BiometricManager.BIOMETRIC_ERROR_NO_HARDWARE -> {
                onError("BIOMETRIC_ERROR_NO_HARDWARE", code)
            }
            BiometricManager.BIOMETRIC_ERROR_HW_UNAVAILABLE -> {
                onError("BIOMETRIC_ERROR_HW_UNAVAILABLE", code)
            }
            BiometricManager.BIOMETRIC_STATUS_UNKNOWN -> {
                onError("BIOMETRIC_STATUS_UNKNOWN", code)
            }
        }
    }


    /**
     *  This function will open the bioMetric prompt
     *  @Param title to be shown as title
     *  @Param subTitle to be shown as subTitle
     *  @Param negativeBtnText to be shown on negative button
     *  this function will call the authenticationCallBack
     * */
    private fun openBiometric(
        title: String,
        subTitle: String,
        negativeBtnText: String
    ) {
        val builder = BiometricPrompt.PromptInfo.Builder()
            .setTitle(title)
            .setSubtitle(subTitle)
            .setNegativeButtonText(negativeBtnText)
            .build()

        biometricPrompt = BiometricPrompt(context, executor, authenticationCallBack)
        biometricPrompt.authenticate(builder)
    }
}