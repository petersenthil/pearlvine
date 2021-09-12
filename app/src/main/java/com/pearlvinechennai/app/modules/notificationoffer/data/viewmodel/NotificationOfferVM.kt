package com.pearlvinechennai.app.modules.notificationoffer.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pearlvinechennai.app.modules.notificationoffer.`data`.model.NotificationOffer1RowModel
import com.pearlvinechennai.app.modules.notificationoffer.`data`.model.NotificationOfferModel
import kotlin.collections.MutableList

public class NotificationOfferVM : ViewModel() {
  public val notificationOfferModel: MutableLiveData<NotificationOfferModel> =
      MutableLiveData(NotificationOfferModel())

  public val recyclerViewList: MutableLiveData<MutableList<NotificationOffer1RowModel>> =
      MutableLiveData(mutableListOf())
}
