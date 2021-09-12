package com.pearlvinechennai.app.modules.account.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.RowAccount1Binding
import com.pearlvinechennai.app.modules.account.`data`.model.Account1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<Account1RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowAccount1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Account1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowAccount1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_account1,parent,false)
    return RowAccount1VH(view)
  }

  public override fun onBindViewHolder(holder: RowAccount1VH, position: Int): Unit {
    val account1RowModel = Account1RowModel()
    // TODO uncomment following line after integration with data source
    // val account1RowModel = list[position]
    holder.binding.account1RowModel = account1RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Account1RowModel
    ): Unit {
    }
  }

  public inner class RowAccount1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowAccount1Binding = RowAccount1Binding.bind(itemView)
    init {
      binding.frame.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Account1RowModel())
      }
    }
  }
}
