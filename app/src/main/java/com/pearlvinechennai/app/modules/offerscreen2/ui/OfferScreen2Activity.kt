package com.pearlvinechennai.app.modules.offerscreen2.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.ActivityOfferScreen2Binding
import com.pearlvinechennai.app.modules.notification.ui.NotificationActivity
import com.pearlvinechennai.app.modules.offerscreen2.`data`.viewmodel.OfferScreen2VM
import kotlin.String
import kotlin.Unit

public class OfferScreen2Activity : AppCompatActivity() {
  private lateinit var binding: ActivityOfferScreen2Binding

  private val viewModel: OfferScreen2VM by viewModels<OfferScreen2VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_offer_screen2)
    binding.lifecycleOwner = this
    binding.offerScreen2VM = viewModel
    binding.image.setOnClickListener {

      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public companion object {
    public const val TAG: String = "OFFER_SCREEN2ACTIVITY"
  }
}
