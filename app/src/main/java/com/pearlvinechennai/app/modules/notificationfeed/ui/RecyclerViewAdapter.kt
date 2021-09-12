package com.pearlvinechennai.app.modules.notificationfeed.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.RowNotificationFeed1Binding
import com.pearlvinechennai.app.modules.notificationfeed.`data`.model.NotificationFeed1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<NotificationFeed1RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowNotificationFeed1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<NotificationFeed1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowNotificationFeed1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_notification_feed1,parent,false)
    return RowNotificationFeed1VH(view)
  }

  public override fun onBindViewHolder(holder: RowNotificationFeed1VH, position: Int): Unit {
    val notificationFeed1RowModel = NotificationFeed1RowModel()
    // TODO uncomment following line after integration with data source
    // val notificationFeed1RowModel = list[position]
    holder.binding.notificationFeed1RowModel = notificationFeed1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: NotificationFeed1RowModel
    ): Unit {
    }
  }

  public inner class RowNotificationFeed1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowNotificationFeed1Binding = RowNotificationFeed1Binding.bind(itemView)
  }
}
