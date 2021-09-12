package com.pearlvinechennai.app.modules.favoriteproduct.`data`.model

import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.appcomponents.di.MyApp
import kotlin.String

public data class FavoriteProductModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFavoriteProduc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_favorite_produc)

)
