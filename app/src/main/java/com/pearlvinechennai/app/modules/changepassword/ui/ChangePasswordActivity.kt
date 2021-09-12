package com.pearlvinechennai.app.modules.changepassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.ActivityChangePasswordBinding
import com.pearlvinechennai.app.modules.account.ui.AccountActivity
import com.pearlvinechennai.app.modules.changepassword.`data`.viewmodel.ChangePasswordVM
import kotlin.String
import kotlin.Unit

public class ChangePasswordActivity : AppCompatActivity() {
  private lateinit var binding: ActivityChangePasswordBinding

  private val viewModel: ChangePasswordVM by viewModels<ChangePasswordVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_change_password)
    binding.lifecycleOwner = this
    binding.changePasswordVM = viewModel
    binding.btnSave.setOnClickListener {

          val destIntent = AccountActivity.getIntent(this, null)
          startActivity(destIntent)

        }
  }

  public companion object {
    public const val TAG: String = "CHANGE_PASSWORD_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChangePasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
