package com.pearlvinechennai.app.modules.account.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.ActivityAccountBinding
import com.pearlvinechennai.app.modules.account.`data`.model.Account1RowModel
import com.pearlvinechennai.app.modules.account.`data`.viewmodel.AccountVM
import com.pearlvinechennai.app.modules.notification.ui.NotificationActivity
import com.pearlvinechennai.app.modules.profile.ui.ProfileActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class AccountActivity : AppCompatActivity() {
  private lateinit var binding: ActivityAccountBinding

  private val viewModel: AccountVM by viewModels<AccountVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Account1RowModel
  ): Unit {
    when(view.id) {
    R.id.frame ->  {
      onClickRecyclerViewFrame(view, position, item)
    }


    }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_account)
    val recyclerViewAdapter =
                        RecyclerViewAdapter(viewModel.recyclerViewList.value?:mutableListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                object : RecyclerViewAdapter.OnItemClickListener {
                    override fun onItemClick(view:View, position:Int, item : Account1RowModel) {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    viewModel.recyclerViewList.observe(this) {
                    recyclerViewAdapter.updateData(it)
                }
    binding.lifecycleOwner = this
    binding.accountVM = viewModel
    binding.image.setOnClickListener {

      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public fun onClickRecyclerViewFrame(
    view: View,
    position: Int,
    item: Account1RowModel
  ): Unit {
    when(0) {
    0 ->  {
    }


    1 ->  {
    }
    2 ->  {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    }
  }

  public companion object {
    public const val TAG: String = "ACCOUNT_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AccountActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
