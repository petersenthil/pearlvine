package com.pearlvinechennai.app.modules.creditcardanddebit.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.ActivityCreditCardAndDebitBinding
import com.pearlvinechennai.app.modules.addcard.ui.AddCardActivity
import com.pearlvinechennai.app.modules.creditcardanddebit.`data`.model.CreditCardAndDebit1RowModel
import com.pearlvinechennai.app.modules.creditcardanddebit.`data`.viewmodel.CreditCardAndDebitVM
import com.pearlvinechennai.app.modules.lailyfafebrinacard.ui.LailyfaFebrinaCardActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class CreditCardAndDebitActivity : AppCompatActivity() {
  private lateinit var binding: ActivityCreditCardAndDebitBinding

  private val viewModel: CreditCardAndDebitVM by viewModels<CreditCardAndDebitVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: CreditCardAndDebit1RowModel
  ): Unit {
    when(view.id) {
            R.id.frame ->  {
              onClickRecyclerViewFrame(view, position, item)
            }


            }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_credit_card_and_debit)
    val recyclerViewAdapter =
                            RecyclerViewAdapter(viewModel.recyclerViewList.value?:mutableListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                    object : RecyclerViewAdapter.OnItemClickListener {
                        override fun onItemClick(view:View, position:Int, item :
                CreditCardAndDebit1RowModel) {
                            onClickRecyclerView(view, position, item)
                        }
                    }
                    )
    viewModel.recyclerViewList.observe(this) {
                        recyclerViewAdapter.updateData(it)
                    }
    binding.lifecycleOwner = this
    binding.creditCardAndDebitVM = viewModel
    binding.btnAddCard.setOnClickListener {

              val destIntent = AddCardActivity.getIntent(this, null)
              startActivity(destIntent)

            }
  }

  public fun onClickRecyclerViewFrame(
    view: View,
    position: Int,
    item: CreditCardAndDebit1RowModel
  ): Unit {
    when(0) {
            0 ->  {
              val destIntent = LailyfaFebrinaCardActivity.getIntent(this, null)
              startActivity(destIntent)
            }


            1 ->  {
              val destIntent = LailyfaFebrinaCardActivity.getIntent(this, null)
              startActivity(destIntent)
            }
            }
  }

  public companion object {
    public const val TAG: String = "CREDIT_CARD_AND_DEBIT_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreditCardAndDebitActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
