package com.pearlvinechennai.app.modules.notification2.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.RowNotification3Binding
import com.pearlvinechennai.app.modules.notification2.`data`.model.Notification3RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<Notification3RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowNotification3VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Notification3RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowNotification3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_notification3,parent,false)
    return RowNotification3VH(view)
  }

  public override fun onBindViewHolder(holder: RowNotification3VH, position: Int): Unit {
    val notification3RowModel = Notification3RowModel()
    // TODO uncomment following line after integration with data source
    // val notification3RowModel = list[position]
    holder.binding.notification3RowModel = notification3RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Notification3RowModel
    ): Unit {
    }
  }

  public inner class RowNotification3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowNotification3Binding = RowNotification3Binding.bind(itemView)
  }
}
