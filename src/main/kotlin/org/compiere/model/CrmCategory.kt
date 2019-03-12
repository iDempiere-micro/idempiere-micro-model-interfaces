package org.compiere.model

import org.idempiere.icommon.model.IPO

interface CrmCategory : IPO {
    val name: String
    val searchKey: String
}