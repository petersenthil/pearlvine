package com.pearlvinechennai.app.modules.order.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pearlvinechennai.app.modules.order.`data`.model.Order1RowModel
import com.pearlvinechennai.app.modules.order.`data`.model.OrderModel
import kotlin.collections.MutableList

public class OrderVM : ViewModel() {
  public val orderModel: MutableLiveData<OrderModel> = MutableLiveData(OrderModel())

  public val recyclerViewList: MutableLiveData<MutableList<Order1RowModel>> =
      MutableLiveData(mutableListOf())
}
