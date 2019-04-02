package software.hsharp.services

import org.compiere.model.CreateBusinessPartnerInput
import org.compiere.model.I_C_BPartner
import software.hsharp.core.services.BaseDataService

/**
 * Business Partner service
 */
interface BusinessPartnerService : BaseDataService<I_C_BPartner> {
    /**
     * Create a business partner
     */
    fun createBusinessPartner(businessPartner: CreateBusinessPartnerInput): I_C_BPartner
}