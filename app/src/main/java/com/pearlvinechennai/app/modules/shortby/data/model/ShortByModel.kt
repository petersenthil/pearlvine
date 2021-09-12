package com.pearlvinechennai.app.modules.shortby.`data`.model

import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.appcomponents.di.MyApp
import kotlin.String

public data class ShortByModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtShoryBy: String? = MyApp.getInstance().resources.getString(R.string.lbl_shory_by)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBestMatch: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_best_match)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTimeEndingSo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_time_ending_so)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTimeNewlyLis: String? =
      MyApp.getInstance().resources.getString(R.string.msg_time_newly_lis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPriceShippin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_price_shippin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPriceShippin1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_price_shippin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDistanceNeare: String? =
      MyApp.getInstance().resources.getString(R.string.msg_distance_neare)

)
