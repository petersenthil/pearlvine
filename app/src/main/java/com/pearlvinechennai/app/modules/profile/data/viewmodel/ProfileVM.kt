package com.pearlvinechennai.app.modules.profile.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pearlvinechennai.app.modules.profile.`data`.model.Profile1RowModel
import com.pearlvinechennai.app.modules.profile.`data`.model.ProfileModel
import kotlin.collections.MutableList

public class ProfileVM : ViewModel() {
  public val profileModel: MutableLiveData<ProfileModel> = MutableLiveData(ProfileModel())

  public val recyclerViewList: MutableLiveData<MutableList<Profile1RowModel>> =
      MutableLiveData(mutableListOf())
}
