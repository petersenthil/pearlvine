package com.pearlvinechennai.app.modules.choosecreditordebitcard.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.ActivityChooseCreditOrDebitCardBinding
import com.pearlvinechennai.app.modules.choosecreditordebitcard.`data`.viewmodel.ChooseCreditOrDebitCardVM
import com.pearlvinechennai.app.modules.successscreen.ui.SuccessScreenActivity
import kotlin.String
import kotlin.Unit

public class ChooseCreditOrDebitCardActivity : AppCompatActivity() {
  private lateinit var binding: ActivityChooseCreditOrDebitCardBinding

  private val viewModel: ChooseCreditOrDebitCardVM by viewModels<ChooseCreditOrDebitCardVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_choose_credit_or_debit_card)
    binding.lifecycleOwner = this
    binding.chooseCreditOrDebitCardVM = viewModel
    binding.btnPay76686.setOnClickListener {

      val destIntent = SuccessScreenActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public companion object {
    public const val TAG: String = "CHOOSE_CREDIT_OR_DEBIT_CARD_ACTIVITY"
  }
}
