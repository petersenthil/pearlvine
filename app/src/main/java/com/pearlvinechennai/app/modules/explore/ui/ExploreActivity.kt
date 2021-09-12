package com.pearlvinechennai.app.modules.explore.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.ActivityExploreBinding
import com.pearlvinechennai.app.modules.explore.`data`.model.Explore1RowModel
import com.pearlvinechennai.app.modules.explore.`data`.model.Explore2RowModel
import com.pearlvinechennai.app.modules.explore.`data`.viewmodel.ExploreVM
import com.pearlvinechennai.app.modules.notification.ui.NotificationActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ExploreActivity : AppCompatActivity() {
  private lateinit var binding: ActivityExploreBinding

  private val viewModel: ExploreVM by viewModels<ExploreVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Explore1RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public fun onClickRecyclerView1(
    view: View,
    position: Int,
    item: Explore2RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_explore)
    val recyclerViewAdapter =
                    RecyclerViewAdapter(viewModel.recyclerViewList.value?:mutableListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item : Explore1RowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    viewModel.recyclerViewList.observe(this) {
                recyclerViewAdapter.updateData(it)
            }
    val recyclerView1Adapter =
                    RecyclerView1Adapter(viewModel.recyclerView1List.value?:mutableListOf())
    binding.recyclerView1.adapter = recyclerView1Adapter
    recyclerView1Adapter.setOnItemClickListener(
            object : RecyclerView1Adapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item : Explore2RowModel) {
                    onClickRecyclerView1(view, position, item)
                }
            }
            )
    viewModel.recyclerView1List.observe(this) {
                recyclerView1Adapter.updateData(it)
            }
    binding.lifecycleOwner = this
    binding.exploreVM = viewModel
    binding.image1.setOnClickListener {

      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public companion object {
    public const val TAG: String = "EXPLORE_ACTIVITY"
  }
}
