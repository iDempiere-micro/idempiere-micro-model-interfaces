package software.hsharp.services

import org.compiere.model.BusinessOpportunity
import org.compiere.model.I_C_BPartner
import org.compiere.model.I_C_Opportunity

/**
 * A service to work with business opportunities [I_C_Opportunity]
 */
interface BusinessOpportunityService {
    /**
     * Will return a first business opportunity on a business partner [businessPartner] if exists.
     * If a business partner [businessPartner] has not business opportunities,
     * one with the remaining parameters of [getBusinessOpportunityForBusinessPartner] is created.
     */
    fun getBusinessOpportunityForBusinessPartner(
        forBusinessPartner: I_C_BPartner,
        newBusinessOpportunity: BusinessOpportunity
    ): I_C_Opportunity
}