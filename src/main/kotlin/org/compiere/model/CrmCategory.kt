package org.compiere.model

import org.idempiere.icommon.model.IPO

/**
 * A universal category you can put e.g. business partner to.
 */
interface CrmCategory : IPO {
    /**
     * Category name
     */
    val name: String
    /**
     * Category search key
     */
    val searchKey: String
}