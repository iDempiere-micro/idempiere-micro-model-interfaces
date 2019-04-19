package org.compiere.model

import java.util.Locale

interface ClientWithAccounting : Client {
    val currencyId: Int
    val acctSchema: AccountingSchema
    val info: ClientInfoWithAccounting
    val locale: Locale
    val isClientAccountingImmediate: Boolean
}