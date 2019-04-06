package org.compiere.model

interface ClientInfoWithAccounting : I_AD_ClientInfo {
    /**
     * Get currency Id
     */
    val currencyId: Int
}