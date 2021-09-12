package com.pearlvinechennai.app.modules.notification2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.ActivityNotification2Binding
import com.pearlvinechennai.app.modules.notification2.`data`.model.Notification3RowModel
import com.pearlvinechennai.app.modules.notification2.`data`.viewmodel.Notification2VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class Notification2Activity : AppCompatActivity() {
  private lateinit var binding: ActivityNotification2Binding

  private val viewModel: Notification2VM by viewModels<Notification2VM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Notification3RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_notification2)
    val recyclerViewAdapter =
                        RecyclerViewAdapter(viewModel.recyclerViewList.value?:mutableListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                object : RecyclerViewAdapter.OnItemClickListener {
                    override fun onItemClick(view:View, position:Int, item : Notification3RowModel)
        {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    viewModel.recyclerViewList.observe(this) {
                    recyclerViewAdapter.updateData(it)
                }
    binding.lifecycleOwner = this
    binding.notification2VM = viewModel
  }

  public companion object {
    public const val TAG: String = "NOTIFICATION2ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Notification2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
