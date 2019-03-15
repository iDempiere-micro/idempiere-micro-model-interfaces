package org.compiere.model

import org.idempiere.icommon.model.IPO

/**
 * A universal category you can put e.g. business partner to.
 */
interface CrmCategory : IPO {
    val name: String
    val searchKey: String
}