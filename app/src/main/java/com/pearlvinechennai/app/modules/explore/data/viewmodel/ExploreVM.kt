package com.pearlvinechennai.app.modules.explore.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pearlvinechennai.app.modules.explore.`data`.model.Explore1RowModel
import com.pearlvinechennai.app.modules.explore.`data`.model.Explore2RowModel
import com.pearlvinechennai.app.modules.explore.`data`.model.ExploreModel
import kotlin.collections.MutableList

public class ExploreVM : ViewModel() {
  public val exploreModel: MutableLiveData<ExploreModel> = MutableLiveData(ExploreModel())

  public val recyclerViewList: MutableLiveData<MutableList<Explore1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerView1List: MutableLiveData<MutableList<Explore2RowModel>> =
      MutableLiveData(mutableListOf())
}
