package com.pearlvinechennai.app.modules.splash.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.ActivitySplashBinding
import com.pearlvinechennai.app.modules.login.ui.LoginActivity
import com.pearlvinechennai.app.modules.splash.`data`.viewmodel.SplashVM
import kotlin.String
import kotlin.Unit

public class SplashActivity : AppCompatActivity() {
  private lateinit var binding: ActivitySplashBinding

  private val viewModel: SplashVM by viewModels<SplashVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_splash)
    binding.lifecycleOwner = this
    binding.splashVM = viewModel
    val destIntent = LoginActivity.getIntent(this, null)
    startActivity(destIntent)
  }

  public companion object {
    public const val TAG: String = "SPLASH_ACTIVITY"
  }
}
