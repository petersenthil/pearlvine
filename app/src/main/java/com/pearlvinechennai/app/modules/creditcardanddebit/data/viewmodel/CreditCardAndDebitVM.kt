package com.pearlvinechennai.app.modules.creditcardanddebit.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pearlvinechennai.app.modules.creditcardanddebit.`data`.model.CreditCardAndDebit1RowModel
import com.pearlvinechennai.app.modules.creditcardanddebit.`data`.model.CreditCardAndDebitModel
import kotlin.collections.MutableList

public class CreditCardAndDebitVM : ViewModel() {
  public val creditCardAndDebitModel: MutableLiveData<CreditCardAndDebitModel> =
      MutableLiveData(CreditCardAndDebitModel())

  public val recyclerViewList: MutableLiveData<MutableList<CreditCardAndDebit1RowModel>> =
      MutableLiveData(mutableListOf())
}
