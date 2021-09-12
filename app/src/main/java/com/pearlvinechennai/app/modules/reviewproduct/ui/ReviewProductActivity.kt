package com.pearlvinechennai.app.modules.reviewproduct.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.ActivityReviewProductBinding
import com.pearlvinechennai.app.modules.reviewproduct.`data`.model.ReviewProduct1RowModel
import com.pearlvinechennai.app.modules.reviewproduct.`data`.viewmodel.ReviewProductVM
import com.pearlvinechennai.app.modules.writereviewfill.ui.WriteReviewFillActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ReviewProductActivity : AppCompatActivity() {
  private lateinit var binding: ActivityReviewProductBinding

  private val viewModel: ReviewProductVM by viewModels<ReviewProductVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: ReviewProduct1RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_review_product)
    val recyclerViewAdapter =
                        RecyclerViewAdapter(viewModel.recyclerViewList.value?:mutableListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                object : RecyclerViewAdapter.OnItemClickListener {
                    override fun onItemClick(view:View, position:Int, item : ReviewProduct1RowModel)
        {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    viewModel.recyclerViewList.observe(this) {
                    recyclerViewAdapter.updateData(it)
                }
    binding.lifecycleOwner = this
    binding.reviewProductVM = viewModel
    binding.btnWriteReview.setOnClickListener {

      val destIntent = WriteReviewFillActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public companion object {
    public const val TAG: String = "REVIEW_PRODUCT_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ReviewProductActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
