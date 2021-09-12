package com.pearlvinechennai.app.modules.notification.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.RowNotification1Binding
import com.pearlvinechennai.app.modules.notification.`data`.model.Notification1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<Notification1RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowNotification1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Notification1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowNotification1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_notification1,parent,false)
    return RowNotification1VH(view)
  }

  public override fun onBindViewHolder(holder: RowNotification1VH, position: Int): Unit {
    val notification1RowModel = Notification1RowModel()
    // TODO uncomment following line after integration with data source
    // val notification1RowModel = list[position]
    holder.binding.notification1RowModel = notification1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Notification1RowModel
    ): Unit {
    }
  }

  public inner class RowNotification1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowNotification1Binding = RowNotification1Binding.bind(itemView)
    init {
      binding.frame.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Notification1RowModel())
      }
    }
  }
}
