package software.hsharp.services

import org.compiere.model.I_C_BPartner
import org.compiere.model.I_C_ContactActivity
import software.hsharp.core.services.BaseDataService
import java.sql.Timestamp

/**
 * Contact Activity Service
 */
interface ContactActivityService : BaseDataService<I_C_ContactActivity> {
    /**
     * Create Contact activity for a [businessPartner]; takes the first business opportunity or creates one.
     */
    fun createContactActivity(
        businessPartner: I_C_BPartner,
        startDate: Timestamp,
        description: String,
        contactActivityType: String
    ): I_C_ContactActivity
}