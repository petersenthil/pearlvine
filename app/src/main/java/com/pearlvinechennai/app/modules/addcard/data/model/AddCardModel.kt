package com.pearlvinechennai.app.modules.addcard.`data`.model

import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.appcomponents.di.MyApp
import kotlin.String

public data class AddCardModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAddCard: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCardNumber: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_card_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtExpirationDate: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_expiration_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSecurityCode: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_security_code)
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
  public var etEnterCardNumbValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etExpirationDateValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etSecurityCodeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterCardNumb1Value: String? = null
)
