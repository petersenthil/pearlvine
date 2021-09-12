package com.pearlvinechennai.app.modules.successscreen.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pearlvinechennai.app.modules.successscreen.`data`.model.SuccessScreenModel

public class SuccessScreenVM : ViewModel() {
  public val successScreenModel: MutableLiveData<SuccessScreenModel> =
      MutableLiveData(SuccessScreenModel())
}
