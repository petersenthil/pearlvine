package com.pearlvinechennai.app.modules.offerscreen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.RowOfferScreen1Binding
import com.pearlvinechennai.app.modules.offerscreen.`data`.model.OfferScreen1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<OfferScreen1RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowOfferScreen1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<OfferScreen1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowOfferScreen1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_offer_screen1,parent,false)
    return RowOfferScreen1VH(view)
  }

  public override fun onBindViewHolder(holder: RowOfferScreen1VH, position: Int): Unit {
    val offerScreen1RowModel = OfferScreen1RowModel()
    // TODO uncomment following line after integration with data source
    // val offerScreen1RowModel = list[position]
    holder.binding.offerScreen1RowModel = offerScreen1RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: OfferScreen1RowModel
    ): Unit {
    }
  }

  public inner class RowOfferScreen1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowOfferScreen1Binding = RowOfferScreen1Binding.bind(itemView)
    init {
      binding.linear.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, OfferScreen1RowModel())
      }
    }
  }
}
