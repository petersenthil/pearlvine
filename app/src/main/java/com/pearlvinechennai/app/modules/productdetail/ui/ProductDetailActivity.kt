package com.pearlvinechennai.app.modules.productdetail.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.ActivityProductDetailBinding
import com.pearlvinechennai.app.modules.cart.ui.CartActivity
import com.pearlvinechennai.app.modules.productdetail.`data`.model.ProductDetail1RowModel
import com.pearlvinechennai.app.modules.productdetail.`data`.viewmodel.ProductDetailVM
import com.pearlvinechennai.app.modules.reviewproduct.ui.ReviewProductActivity
import com.pearlvinechennai.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ProductDetailActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProductDetailBinding

  private val viewModel: ProductDetailVM by viewModels<ProductDetailVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: ProductDetail1RowModel
  ): Unit {
    when(view.id) {


            }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_product_detail)
    val recyclerViewAdapter =
                               
        RecyclerViewAdapter(viewModel.recyclerViewList.value?:mutableListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                        object : RecyclerViewAdapter.OnItemClickListener {
                            override fun onItemClick(view:View, position:Int, item :
            ProductDetail1RowModel)
                {
                                onClickRecyclerView(view, position, item)
                            }
                        }
                        )
    viewModel.recyclerViewList.observe(this) {
                            recyclerViewAdapter.updateData(it)
                        }
    binding.lifecycleOwner = this
    binding.productDetailVM = viewModel
    binding.txtSeeMore.setOnClickListener {

              val destIntent = ReviewProductActivity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.btnAddToCart.setOnClickListener {

              val destIntent = CartActivity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.image1.setOnClickListener {

              val destIntent = SearchActivity.getIntent(this, null)
              startActivity(destIntent)

            }
  }

  public companion object {
    public const val TAG: String = "PRODUCT_DETAIL_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProductDetailActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
