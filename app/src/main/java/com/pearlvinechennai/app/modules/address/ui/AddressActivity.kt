package com.pearlvinechennai.app.modules.address.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.ActivityAddressBinding
import com.pearlvinechennai.app.modules.address.`data`.model.Address1RowModel
import com.pearlvinechennai.app.modules.address.`data`.viewmodel.AddressVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class AddressActivity : AppCompatActivity() {
  private lateinit var binding: ActivityAddressBinding

  private val viewModel: AddressVM by viewModels<AddressVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Address1RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_address)
    val recyclerViewAdapter =
                    RecyclerViewAdapter(viewModel.recyclerViewList.value?:mutableListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item : Address1RowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    viewModel.recyclerViewList.observe(this) {
                recyclerViewAdapter.updateData(it)
            }
    binding.lifecycleOwner = this
    binding.addressVM = viewModel
  }

  public companion object {
    public const val TAG: String = "ADDRESS_ACTIVITY"
  }
}
