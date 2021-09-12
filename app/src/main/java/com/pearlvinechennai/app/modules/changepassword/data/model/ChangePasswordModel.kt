package com.pearlvinechennai.app.modules.changepassword.`data`.model

import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.appcomponents.di.MyApp
import kotlin.String

public data class ChangePasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtChangePassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_change_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOldPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_old_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNewPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_new_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNewPasswordAg: String? =
      MyApp.getInstance().resources.getString(R.string.msg_new_password_ag)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etMsgValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etMsg1Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etMsg2Value: String? = null
)
