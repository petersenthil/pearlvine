package com.pearlvinechennai.app.modules.notification.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.ActivityNotificationBinding
import com.pearlvinechennai.app.modules.notification.`data`.model.Notification1RowModel
import com.pearlvinechennai.app.modules.notification.`data`.viewmodel.NotificationVM
import com.pearlvinechennai.app.modules.notification2.ui.Notification2Activity
import com.pearlvinechennai.app.modules.notificationfeed.ui.NotificationFeedActivity
import com.pearlvinechennai.app.modules.notificationoffer.ui.NotificationOfferActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class NotificationActivity : AppCompatActivity() {
  private lateinit var binding: ActivityNotificationBinding

  private val viewModel: NotificationVM by viewModels<NotificationVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Notification1RowModel
  ): Unit {
    when(view.id) {
                        R.id.frame ->  {
                          onClickRecyclerViewFrame(view, position, item)
                        }


                        }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_notification)
    val recyclerViewAdapter =
                                       
                RecyclerViewAdapter(viewModel.recyclerViewList.value?:mutableListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                                object : RecyclerViewAdapter.OnItemClickListener {
                                    override fun onItemClick(view:View, position:Int, item :
                    Notification1RowModel)
                        {
                                        onClickRecyclerView(view, position, item)
                                    }
                                }
                                )
    viewModel.recyclerViewList.observe(this) {
                                    recyclerViewAdapter.updateData(it)
                                }
    binding.lifecycleOwner = this
    binding.notificationVM = viewModel
  }

  public fun onClickRecyclerViewFrame(
    view: View,
    position: Int,
    item: Notification1RowModel
  ): Unit {
    when(0) {
                        0 ->  {
                          val destIntent = Notification2Activity.getIntent(this, null)
                          startActivity(destIntent)
                        }


                        1 ->  {
                          val destIntent = NotificationFeedActivity.getIntent(this, null)
                          startActivity(destIntent)
                        }
                        2 ->  {
                          val destIntent = NotificationOfferActivity.getIntent(this, null)
                          startActivity(destIntent)
                        }
                        }
  }

  public companion object {
    public const val TAG: String = "NOTIFICATION_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
