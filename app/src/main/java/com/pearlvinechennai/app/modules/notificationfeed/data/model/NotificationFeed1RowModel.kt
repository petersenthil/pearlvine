package com.pearlvinechennai.app.modules.notificationfeed.`data`.model

import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.appcomponents.di.MyApp
import kotlin.String

public data class NotificationFeed1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtNewProduct: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_new_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNikeAirZoomP: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_zoom_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtJune320155: String? =
      MyApp.getInstance().resources.getString(R.string.msg_june_3_2015_5)

)
