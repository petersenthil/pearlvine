package com.pearlvinechennai.app.modules.registerform.`data`.model

import com.pearlvinechennai.app.R
import com.pearlvinechennai.app.appcomponents.di.MyApp
import kotlin.String

public data class RegisterFormModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtLetSGetStart: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_get_start)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreateAnNewA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_an_new_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHaveAnAccount: String? =
      MyApp.getInstance().resources.getString(R.string.msg_have_an_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etFullNameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etYourEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etPasswordValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etPasswordAgainValue: String? = null
)
