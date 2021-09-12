package com.pearlvinechennai.app.modules.successscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.ActivitySuccessScreenBinding
import com.pearlvinechennai.app.modules.order.ui.OrderActivity
import com.pearlvinechennai.app.modules.successscreen.`data`.viewmodel.SuccessScreenVM
import kotlin.String
import kotlin.Unit

public class SuccessScreenActivity : AppCompatActivity() {
  private lateinit var binding: ActivitySuccessScreenBinding

  private val viewModel: SuccessScreenVM by viewModels<SuccessScreenVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_success_screen)
    binding.lifecycleOwner = this
    binding.successScreenVM = viewModel
    binding.btnBackToOrder.setOnClickListener {

      val destIntent = OrderActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public companion object {
    public const val TAG: String = "SUCCESS_SCREEN_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SuccessScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
