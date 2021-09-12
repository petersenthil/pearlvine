package com.pearlvinechennai.app.modules.reviewproduct.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pearlvinechennai.app.modules.reviewproduct.`data`.model.ReviewProduct1RowModel
import com.pearlvinechennai.app.modules.reviewproduct.`data`.model.ReviewProductModel
import kotlin.collections.MutableList

public class ReviewProductVM : ViewModel() {
  public val reviewProductModel: MutableLiveData<ReviewProductModel> =
      MutableLiveData(ReviewProductModel())

  public val recyclerViewList: MutableLiveData<MutableList<ReviewProduct1RowModel>> =
      MutableLiveData(mutableListOf())
}
