package com.pearlvinechennai.app.modules.addaddress.`data`.model

import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.appcomponents.di.MyApp
import kotlin.String

public data class AddAddressModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAddAddress: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_add_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCountryOrRegi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_country_or_regi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFirstName: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_first_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLastName: String? = MyApp.getInstance().resources.getString(R.string.lbl_last_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtStreetAddress: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_street_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtStreetAddress1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_street_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCity: String? = MyApp.getInstance().resources.getString(R.string.lbl_city)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtStateProvince: String? =
      MyApp.getInstance().resources.getString(R.string.msg_state_province)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtZipCode: String? = MyApp.getInstance().resources.getString(R.string.lbl_zip_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPhoneNumber: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_phone_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterTheCountValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterTheFirstValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterTheLastValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterTheStreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterTheStree1Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterTheCityValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterTheStateValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterTheZipCValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etEnterThePhoneValue: String? = null
)
