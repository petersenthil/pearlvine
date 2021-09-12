package com.pearlvinechennai.app.modules.explore.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.RowExplore2Binding
import com.pearlvinechennai.app.modules.explore.`data`.model.Explore2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerView1Adapter(
  public var list: List<Explore2RowModel>
) : RecyclerView.Adapter<RecyclerView1Adapter.RowExplore2VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Explore2RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowExplore2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_explore2,parent,false)
    return RowExplore2VH(view)
  }

  public override fun onBindViewHolder(holder: RowExplore2VH, position: Int): Unit {
    val explore2RowModel = Explore2RowModel()
    // TODO uncomment following line after integration with data source
    // val explore2RowModel = list[position]
    holder.binding.explore2RowModel = explore2RowModel
  }

  public override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Explore2RowModel
    ): Unit {
    }
  }

  public inner class RowExplore2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowExplore2Binding = RowExplore2Binding.bind(itemView)
  }
}
