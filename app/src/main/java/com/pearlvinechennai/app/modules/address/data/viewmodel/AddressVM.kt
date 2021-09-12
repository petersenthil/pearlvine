package com.pearlvinechennai.app.modules.address.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pearlvinechennai.app.modules.address.`data`.model.Address1RowModel
import com.pearlvinechennai.app.modules.address.`data`.model.AddressModel
import kotlin.collections.MutableList

public class AddressVM : ViewModel() {
  public val addressModel: MutableLiveData<AddressModel> = MutableLiveData(AddressModel())

  public val recyclerViewList: MutableLiveData<MutableList<Address1RowModel>> =
      MutableLiveData(mutableListOf())
}
