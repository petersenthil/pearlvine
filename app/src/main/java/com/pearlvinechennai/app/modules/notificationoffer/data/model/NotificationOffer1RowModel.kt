package com.pearlvinechennai.app.modules.notificationoffer.`data`.model

import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.appcomponents.di.MyApp
import kotlin.String

public data class NotificationOffer1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtTheBestTitle: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_the_best_title)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCulpaCillumCo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_culpa_cillum_co)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtApril302014: String? =
      MyApp.getInstance().resources.getString(R.string.msg_april_30_2014)

)
