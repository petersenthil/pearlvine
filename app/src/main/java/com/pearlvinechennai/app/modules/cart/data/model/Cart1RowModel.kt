package com.pearlvinechennai.app.modules.cart.`data`.model

import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.appcomponents.di.MyApp
import kotlin.String

public data class Cart1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtNikeAirZoomP: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_zoom_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt29943: String? = MyApp.getInstance().resources.getString(R.string.lbl_299_43)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)

)
