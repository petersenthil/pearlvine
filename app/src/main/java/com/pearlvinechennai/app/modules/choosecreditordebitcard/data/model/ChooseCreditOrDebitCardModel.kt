package com.pearlvinechennai.app.modules.choosecreditordebitcard.`data`.model

import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.appcomponents.di.MyApp
import kotlin.String

public data class ChooseCreditOrDebitCardModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtChooseCard: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_choose_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt63269124: String? = MyApp.getInstance().resources.getString(R.string.msg_6326_9124)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCardHolder: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_card_holder)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCardSave: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_save)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDominicOvo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dominic_ovo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt192042: String? = MyApp.getInstance().resources.getString(R.string.lbl_19_2042)

)
