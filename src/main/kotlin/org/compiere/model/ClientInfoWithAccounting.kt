package org.compiere.model

interface ClientInfoWithAccounting : ClientInfo {
    /**
     * Get currency Id
     */
    val currencyId: Int
}