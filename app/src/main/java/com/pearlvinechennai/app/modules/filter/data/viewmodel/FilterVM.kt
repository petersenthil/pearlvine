package com.pearlvinechennai.app.modules.filter.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pearlvinechennai.app.modules.filter.`data`.model.FilterModel

public class FilterVM : ViewModel() {
  public val filterModel: MutableLiveData<FilterModel> = MutableLiveData(FilterModel())
}
