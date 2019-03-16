package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_PaymentBatch
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_PaymentBatch {

    /**
     * AD_Table_ID=411
     */
    int Table_ID = 411;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


    /**
     * Column name C_PaymentBatch_ID
     */
    String COLUMNNAME_C_PaymentBatch_ID = "C_PaymentBatch_ID";
    /**
     * Column name C_PaymentProcessor_ID
     */
    String COLUMNNAME_C_PaymentProcessor_ID = "C_PaymentProcessor_ID";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";

    /**
     * Get Payment Batch. Payment batch for EFT
     */
    int getC_PaymentBatch_ID();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

}
