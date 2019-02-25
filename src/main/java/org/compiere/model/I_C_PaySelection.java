package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for C_PaySelection
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_PaySelection {

    /**
     * TableName=C_PaySelection
     */
    String Table_Name = "C_PaySelection";

    /**
     * AD_Table_ID=426
     */
    int Table_ID = 426;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);



    /**
     * Column name C_BankAccount_ID
     */
    String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
    /**
     * Column name C_PaySelection_ID
     */
    String COLUMNNAME_C_PaySelection_ID = "C_PaySelection_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsApproved
     */
    String COLUMNNAME_IsApproved = "IsApproved";
    /**
     * Column name PayDate
     */
    String COLUMNNAME_PayDate = "PayDate";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name TotalAmt
     */
    String COLUMNNAME_TotalAmt = "TotalAmt";

    /**
     * Get Bank Account. Account at the Bank
     */
    int getC_BankAccount_ID();

    /**
     * Get Payment Selection. Payment Selection
     */
    int getC_PaySelection_ID();

    /**
     * Set Approved. Indicates if this document requires approval
     */
    void setIsApproved(boolean IsApproved);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Get Payment date. Date Payment made
     */
    Timestamp getPayDate();

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Set Total Amount. Total Amount
     */
    void setTotalAmt(BigDecimal TotalAmt);

}
