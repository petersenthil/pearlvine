package com.pearlvinechennai.app.modules.listcategory.`data`.model

import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.appcomponents.di.MyApp
import kotlin.String

public data class ListCategory1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtShirt: String? = MyApp.getInstance().resources.getString(R.string.lbl_shirt)

)
