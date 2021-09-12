package com.pearlvinechennai.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.ActivityLoginBinding
import com.pearlvinechennai.app.extensions.alert
import com.pearlvinechennai.app.extensions.neutralButton
import com.pearlvinechennai.app.modules.dashboard.ui.DashboardActivity
import com.pearlvinechennai.app.modules.login.`data`.viewmodel.LoginVM
import com.pearlvinechennai.app.modules.registerform.ui.RegisterFormActivity
import kotlin.String
import kotlin.Unit

public class LoginActivity : AppCompatActivity() {
  private lateinit var binding: ActivityLoginBinding

  private val viewModel: LoginVM by viewModels<LoginVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_login)
    binding.lifecycleOwner = this
    binding.loginVM = viewModel
    binding.linear3.setOnClickListener {
        this@LoginActivity.alert("Login","""Login with facebook"""){
        neutralButton{
        }
        }
        }
    binding.txtDonTHaveAnA.setOnClickListener {

          val destIntent = RegisterFormActivity.getIntent(this, null)
          startActivity(destIntent)

        }
    binding.txtDonTHaveAnA.setOnClickListener {

          val destIntent = RegisterFormActivity.getIntent(this, null)
          startActivity(destIntent)

        }
    binding.btnSignIn.setOnClickListener {

          val destIntent = DashboardActivity.getIntent(this, null)
          startActivity(destIntent)

        }
    binding.btnSignIn.setOnClickListener {

          val destIntent = DashboardActivity.getIntent(this, null)
          startActivity(destIntent)

        }
    binding.linear2.setOnClickListener {
        this@LoginActivity.alert("Login","""Login with google"""){
        neutralButton{
        }
        }
        }
  }

  public companion object {
    public const val TAG: String = "LOGIN_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
