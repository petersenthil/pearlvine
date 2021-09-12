package com.pearlvinechennai.app.modules.notification2.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pearlvinechennai.app.modules.notification2.`data`.model.Notification2Model
import com.pearlvinechennai.app.modules.notification2.`data`.model.Notification3RowModel
import kotlin.collections.MutableList

public class Notification2VM : ViewModel() {
  public val notification2Model: MutableLiveData<Notification2Model> =
      MutableLiveData(Notification2Model())

  public val recyclerViewList: MutableLiveData<MutableList<Notification3RowModel>> =
      MutableLiveData(mutableListOf())
}
