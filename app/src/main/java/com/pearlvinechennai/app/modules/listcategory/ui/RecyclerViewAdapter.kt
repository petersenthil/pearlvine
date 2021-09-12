package com.pearlvinechennai.app.modules.listcategory.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.RowListCategory1Binding
import com.pearlvinechennai.app.modules.listcategory.`data`.model.ListCategory1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<ListCategory1RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowListCategory1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<ListCategory1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListCategory1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_list_category1,parent,false)
    return RowListCategory1VH(view)
  }

  public override fun onBindViewHolder(holder: RowListCategory1VH, position: Int): Unit {
    val listCategory1RowModel = ListCategory1RowModel()
    // TODO uncomment following line after integration with data source
    // val listCategory1RowModel = list[position]
    holder.binding.listCategory1RowModel = listCategory1RowModel
  }

  public override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: ListCategory1RowModel
    ): Unit {
    }
  }

  public inner class RowListCategory1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowListCategory1Binding = RowListCategory1Binding.bind(itemView)
  }
}
