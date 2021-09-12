package com.pearlvinechennai.app.modules.notificationoffer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.ActivityNotificationOfferBinding
import com.pearlvinechennai.app.modules.notificationoffer.`data`.model.NotificationOffer1RowModel
import com.pearlvinechennai.app.modules.notificationoffer.`data`.viewmodel.NotificationOfferVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class NotificationOfferActivity : AppCompatActivity() {
  private lateinit var binding: ActivityNotificationOfferBinding

  private val viewModel: NotificationOfferVM by viewModels<NotificationOfferVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: NotificationOffer1RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_notification_offer)
    val recyclerViewAdapter =
                        RecyclerViewAdapter(viewModel.recyclerViewList.value?:mutableListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                object : RecyclerViewAdapter.OnItemClickListener {
                    override fun onItemClick(view:View, position:Int, item :
        NotificationOffer1RowModel)
            {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    viewModel.recyclerViewList.observe(this) {
                    recyclerViewAdapter.updateData(it)
                }
    binding.lifecycleOwner = this
    binding.notificationOfferVM = viewModel
  }

  public companion object {
    public const val TAG: String = "NOTIFICATION_OFFER_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationOfferActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
