package software.hsharp.services

import org.compiere.model.CreateBusinessPartnerInput
import org.compiere.model.I_C_BPartner
import software.hsharp.core.models.BaseDataService

interface BusinessPartnerService : BaseDataService<I_C_BPartner> {
    fun createBusinessPartner(businessPartner: CreateBusinessPartnerInput): I_C_BPartner
}