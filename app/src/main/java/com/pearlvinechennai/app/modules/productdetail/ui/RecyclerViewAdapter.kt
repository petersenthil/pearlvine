package com.pearlvinechennai.app.modules.productdetail.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.RowProductDetail1Binding
import com.pearlvinechennai.app.modules.productdetail.`data`.model.ProductDetail1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<ProductDetail1RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowProductDetail1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<ProductDetail1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowProductDetail1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_product_detail1,parent,false)
    return RowProductDetail1VH(view)
  }

  public override fun onBindViewHolder(holder: RowProductDetail1VH, position: Int): Unit {
    val productDetail1RowModel = ProductDetail1RowModel()
    // TODO uncomment following line after integration with data source
    // val productDetail1RowModel = list[position]
    holder.binding.productDetail1RowModel = productDetail1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: ProductDetail1RowModel
    ): Unit {
    }
  }

  public inner class RowProductDetail1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowProductDetail1Binding = RowProductDetail1Binding.bind(itemView)
  }
}
