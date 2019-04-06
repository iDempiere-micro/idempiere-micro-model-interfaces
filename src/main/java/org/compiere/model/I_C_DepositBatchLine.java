package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_DepositBatchLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_DepositBatchLine {

    /**
     * AD_Table_ID=200057
     */
    int Table_ID = 200057;

    /**
     * TableName=C_DepositBatchLine
     */
    String Table_Name = "C_DepositBatchLine";

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name C_DepositBatch_ID
     */
    String COLUMNNAME_C_DepositBatch_ID = "C_DepositBatch_ID";
    /**
     * Column name C_Payment_ID
     */
    String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name PayAmt
     */
    String COLUMNNAME_PayAmt = "PayAmt";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";

    /**
     * Get Deposit Batch
     */
    int getDepositBatchId();

    /**
     * Set Deposit Batch
     */
    void setDepositBatchId(int C_DepositBatch_ID);

    /**
     * Get Payment. Payment identifier
     */
    int getPaymentId();

    /**
     * Set Payment. Payment identifier
     */
    void setPaymentId(int C_Payment_ID);

    /**
     * Get Line No. Unique line for this document
     */
    int getLine();

    /**
     * Set Line No. Unique line for this document
     */
    void setLine(int Line);

    /**
     * Set Payment amount. Amount being paid
     */
    void setPayAmt(BigDecimal PayAmt);

}
