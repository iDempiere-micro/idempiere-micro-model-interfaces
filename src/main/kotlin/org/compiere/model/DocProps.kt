package org.compiere.model

import java.math.BigDecimal

/**
 * Posting Document properties.
 */
interface DocProps {
    /**
     * Get Doc Status
     * @return Document Status
     */
    /**
     * Set Doc Status
     * @param newStatus new Status
     */
    var docStatus: String

    /**************************************************************************
     * Get Summary
     * @return Summary of Document
     */
    val summary: String

    /**
     * Get Document No
     * @return Document No
     */
    val documentNo: String

    /**
     * Get Document Info
     * @return Type and Document No
     */
    val documentInfo: String

    /**
     * Get Process Message
     * @return clear text message
     */
    val processMsg: String?

    /**
     * Get Document Owner
     * @return AD_User_ID
     */
    val documentUserId: Int

    /**
     * Get Document Currency
     * @return C_Currency_ID
     */
    val currencyId: Int

    /**
     * Get Document Approval Amount
     * @return amount
     */
    val approvalAmt: BigDecimal

    /**
     * Get Doc Action
     * @return Document Action
     */
    val docAction: String
}