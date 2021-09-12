package com.pearlvinechennai.app.modules.reviewproduct.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.RowReviewProduct1Binding
import com.pearlvinechennai.app.modules.reviewproduct.`data`.model.ReviewProduct1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<ReviewProduct1RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowReviewProduct1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<ReviewProduct1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowReviewProduct1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_review_product1,parent,false)
    return RowReviewProduct1VH(view)
  }

  public override fun onBindViewHolder(holder: RowReviewProduct1VH, position: Int): Unit {
    val reviewProduct1RowModel = ReviewProduct1RowModel()
    // TODO uncomment following line after integration with data source
    // val reviewProduct1RowModel = list[position]
    holder.binding.reviewProduct1RowModel = reviewProduct1RowModel
  }

  public override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: ReviewProduct1RowModel
    ): Unit {
    }
  }

  public inner class RowReviewProduct1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowReviewProduct1Binding = RowReviewProduct1Binding.bind(itemView)
  }
}
