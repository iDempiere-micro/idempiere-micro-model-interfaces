package software.hsharp.services

import org.compiere.model.I_C_BPartner
import org.compiere.model.I_C_Currency
import org.compiere.model.I_C_Opportunity
import org.compiere.model.I_C_SalesStage
import java.math.BigDecimal
import java.sql.Timestamp

interface BusinessOpportunityService {
    fun getBusinessOpportunityForBusinessPartner(
        businessPartner: I_C_BPartner,
        expectedCloseData: Timestamp,
        currency: I_C_Currency,
        salesStage: I_C_SalesStage,
        probability: BigDecimal,
        amount: BigDecimal
    ): I_C_Opportunity
}