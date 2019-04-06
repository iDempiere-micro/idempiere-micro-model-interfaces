package org.compiere.model

import java.util.Locale

interface ClientWithAccounting : I_AD_Client {
    val currencyId: Int
    val acctSchema: I_C_AcctSchema
    val info: ClientInfoWithAccounting
    val locale: Locale
    val isClientAccountingImmediate: Boolean
}