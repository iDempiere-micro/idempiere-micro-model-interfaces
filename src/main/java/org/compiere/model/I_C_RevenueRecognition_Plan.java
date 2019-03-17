package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_RevenueRecognition_Plan
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_RevenueRecognition_Plan {

    /**
     * AD_Table_ID=443
     */
    int Table_ID = 443;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


    /**
     * Column name C_AcctSchema_ID
     */
    String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name C_InvoiceLine_ID
     */
    String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
    /**
     * Column name C_RevenueRecognition_ID
     */
    String COLUMNNAME_C_RevenueRecognition_ID = "C_RevenueRecognition_ID";
    /**
     * Column name P_Revenue_Acct
     */
    String COLUMNNAME_P_Revenue_Acct = "P_Revenue_Acct";
    /**
     * Column name RecognizedAmt
     */
    String COLUMNNAME_RecognizedAmt = "RecognizedAmt";
    /**
     * Column name TotalAmt
     */
    String COLUMNNAME_TotalAmt = "TotalAmt";
    /**
     * Column name UnEarnedRevenue_Acct
     */
    String COLUMNNAME_UnEarnedRevenue_Acct = "UnEarnedRevenue_Acct";

    /**
     * Set Accounting Schema. Rules for accounting
     */
    void setAccountingSchemaId(int C_AcctSchema_ID);

    /**
     * Set Currency. The Currency for this record
     */
    void setCurrencyId(int C_Currency_ID);

    /**
     * Set Invoice Line. Invoice Detail Line
     */
    void setInvoiceLineId(int C_InvoiceLine_ID);

    /**
     * Set Revenue Recognition. Method for recording revenue
     */
    void setRevenueRecognitionId(int C_RevenueRecognition_ID);

    /**
     * Set Product Revenue. Account for Product Revenue (Sales Account)
     */
    void setRevenueAccount(int P_Revenue_Acct);

    /**
     * Set Recognized Amount
     */
    void setRecognizedAmt(BigDecimal RecognizedAmt);

    /**
     * Set Total Amount. Total Amount
     */
    void setTotalAmt(BigDecimal TotalAmt);

    /**
     * Set Unearned Revenue. Account for unearned revenue
     */
    void setUnEarnedRevenueAccount(int UnEarnedRevenue_Acct);

}
