package com.pearlvinechennai.app.modules.favoriteproduct.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.RowFavoriteProduct1Binding
import com.pearlvinechennai.app.modules.favoriteproduct.`data`.model.FavoriteProduct1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<FavoriteProduct1RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowFavoriteProduct1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<FavoriteProduct1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFavoriteProduct1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_favorite_product1,parent,false)
    return RowFavoriteProduct1VH(view)
  }

  public override fun onBindViewHolder(holder: RowFavoriteProduct1VH, position: Int): Unit {
    val favoriteProduct1RowModel = FavoriteProduct1RowModel()
    // TODO uncomment following line after integration with data source
    // val favoriteProduct1RowModel = list[position]
    holder.binding.favoriteProduct1RowModel = favoriteProduct1RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: FavoriteProduct1RowModel
    ): Unit {
    }
  }

  public inner class RowFavoriteProduct1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowFavoriteProduct1Binding = RowFavoriteProduct1Binding.bind(itemView)
    init {
      binding.linear.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, FavoriteProduct1RowModel())
      }
    }
  }
}
