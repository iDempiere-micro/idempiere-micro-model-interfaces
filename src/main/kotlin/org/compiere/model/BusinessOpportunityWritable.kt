package org.compiere.model

import java.math.BigDecimal
import java.sql.Timestamp

/**
 * Core paramaters of a business opportunity (writable)
 */
interface BusinessOpportunityWritable : BusinessOpportunity {
    /** Expected Close Date
     */
    override var expectedCloseDate: Timestamp
    /**
     * Currency
     */
    override var currency: I_C_Currency?
    /**
     * Sales stage
     */
    override var salesStage: I_C_SalesStage?
    /**
     * Success close probability
     */
    override var probability: BigDecimal
    /**
     * Amount in [currency]
     */
    override var amount: BigDecimal
}