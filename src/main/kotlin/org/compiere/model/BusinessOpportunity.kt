package org.compiere.model

import java.math.BigDecimal
import java.sql.Timestamp

/**
 * Core paramaters of a business opportunity
 */
interface BusinessOpportunity {
    /** Expected Close Date
     */
    val expectedCloseDate: Timestamp
    /**
     * Currency
     */
    val currency: I_C_Currency?
    /**
     * Sales stage
     */
    val salesStage: I_C_SalesStage?
    /**
     * Success close probability
     */
    val probability: BigDecimal
    /**
     * Amount in [currency]
     */
    val amount: BigDecimal
}