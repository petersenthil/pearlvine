package com.pearlvinechennai.app.modules.favoriteproduct.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.ActivityFavoriteProductBinding
import com.pearlvinechennai.app.modules.favoriteproduct.`data`.model.FavoriteProduct1RowModel
import com.pearlvinechennai.app.modules.favoriteproduct.`data`.viewmodel.FavoriteProductVM
import com.pearlvinechennai.app.modules.productdetail.ui.ProductDetailActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class FavoriteProductActivity : AppCompatActivity() {
  private lateinit var binding: ActivityFavoriteProductBinding

  private val viewModel: FavoriteProductVM by viewModels<FavoriteProductVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: FavoriteProduct1RowModel
  ): Unit {
    when(view.id) {
        R.id.linear ->  {
          val destIntent = ProductDetailActivity.getIntent(this, null)
          startActivity(destIntent)
        }


        }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_favorite_product)
    val recyclerViewAdapter =
                        RecyclerViewAdapter(viewModel.recyclerViewList.value?:mutableListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                object : RecyclerViewAdapter.OnItemClickListener {
                    override fun onItemClick(view:View, position:Int, item :
        FavoriteProduct1RowModel) {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    viewModel.recyclerViewList.observe(this) {
                    recyclerViewAdapter.updateData(it)
                }
    binding.lifecycleOwner = this
    binding.favoriteProductVM = viewModel
  }

  public companion object {
    public const val TAG: String = "FAVORITE_PRODUCT_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FavoriteProductActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
