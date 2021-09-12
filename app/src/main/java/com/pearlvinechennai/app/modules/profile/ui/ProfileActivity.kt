package com.pearlvinechennai.app.modules.profile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.databinding.ActivityProfileBinding
import com.pearlvinechennai.app.modules.changepassword.ui.ChangePasswordActivity
import com.pearlvinechennai.app.modules.profile.`data`.model.Profile1RowModel
import com.pearlvinechennai.app.modules.profile.`data`.viewmodel.ProfileVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ProfileActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileBinding

  private val viewModel: ProfileVM by viewModels<ProfileVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Profile1RowModel
  ): Unit {
    when(view.id) {
        R.id.frame ->  {
          val destIntent = ChangePasswordActivity.getIntent(this, null)
          startActivity(destIntent)
        }


        }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_profile)
    val recyclerViewAdapter =
                        RecyclerViewAdapter(viewModel.recyclerViewList.value?:mutableListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                object : RecyclerViewAdapter.OnItemClickListener {
                    override fun onItemClick(view:View, position:Int, item : Profile1RowModel) {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    viewModel.recyclerViewList.observe(this) {
                    recyclerViewAdapter.updateData(it)
                }
    binding.lifecycleOwner = this
    binding.profileVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
