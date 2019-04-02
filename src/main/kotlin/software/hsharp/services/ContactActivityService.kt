package software.hsharp.services

import org.compiere.model.I_C_BPartner
import org.compiere.model.I_C_ContactActivity
import java.sql.Timestamp

interface ContactActivityService {
    fun createContactActivity(
        businessPartner: I_C_BPartner,
        startDate: Timestamp,
        description: String,
        contactActivityType: String
    ): I_C_ContactActivity
}