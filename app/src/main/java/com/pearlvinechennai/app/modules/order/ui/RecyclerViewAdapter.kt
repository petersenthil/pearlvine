package com.pearlvinechennai.app.modules.order.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.RowOrder1Binding
import com.pearlvinechennai.app.modules.order.`data`.model.Order1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<Order1RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowOrder1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Order1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowOrder1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_order1,parent,false)
    return RowOrder1VH(view)
  }

  public override fun onBindViewHolder(holder: RowOrder1VH, position: Int): Unit {
    val order1RowModel = Order1RowModel()
    // TODO uncomment following line after integration with data source
    // val order1RowModel = list[position]
    holder.binding.order1RowModel = order1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Order1RowModel
    ): Unit {
    }
  }

  public inner class RowOrder1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowOrder1Binding = RowOrder1Binding.bind(itemView)
  }
}
