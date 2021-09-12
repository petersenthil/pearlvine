package com.pearlvinechennai.app.modules.listcategory.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pearlvinechennai.app.modules.listcategory.`data`.model.ListCategory1RowModel
import com.pearlvinechennai.app.modules.listcategory.`data`.model.ListCategoryModel
import kotlin.collections.MutableList

public class ListCategoryVM : ViewModel() {
  public val listCategoryModel: MutableLiveData<ListCategoryModel> =
      MutableLiveData(ListCategoryModel())

  public val recyclerViewList: MutableLiveData<MutableList<ListCategory1RowModel>> =
      MutableLiveData(mutableListOf())
}
