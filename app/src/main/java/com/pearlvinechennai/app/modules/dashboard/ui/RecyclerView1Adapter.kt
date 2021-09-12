package com.pearlvinechennai.app.modules.dashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.RowDashboard2Binding
import com.pearlvinechennai.app.modules.dashboard.`data`.model.Dashboard2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerView1Adapter(
  public var list: List<Dashboard2RowModel>
) : RecyclerView.Adapter<RecyclerView1Adapter.RowDashboard2VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Dashboard2RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDashboard2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_dashboard2,parent,false)
    return RowDashboard2VH(view)
  }

  public override fun onBindViewHolder(holder: RowDashboard2VH, position: Int): Unit {
    val dashboard2RowModel = Dashboard2RowModel()
    // TODO uncomment following line after integration with data source
    // val dashboard2RowModel = list[position]
    holder.binding.dashboard2RowModel = dashboard2RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Dashboard2RowModel
    ): Unit {
    }
  }

  public inner class RowDashboard2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowDashboard2Binding = RowDashboard2Binding.bind(itemView)
  }
}
