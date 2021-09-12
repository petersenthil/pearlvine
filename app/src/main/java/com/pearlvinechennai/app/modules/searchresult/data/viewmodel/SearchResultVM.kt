package com.pearlvinechennai.app.modules.searchresult.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pearlvinechennai.app.modules.searchresult.`data`.model.SearchResult1RowModel
import com.pearlvinechennai.app.modules.searchresult.`data`.model.SearchResultModel
import kotlin.collections.MutableList

public class SearchResultVM : ViewModel() {
  public val searchResultModel: MutableLiveData<SearchResultModel> =
      MutableLiveData(SearchResultModel())

  public val recyclerViewList: MutableLiveData<MutableList<SearchResult1RowModel>> =
      MutableLiveData(mutableListOf())
}
