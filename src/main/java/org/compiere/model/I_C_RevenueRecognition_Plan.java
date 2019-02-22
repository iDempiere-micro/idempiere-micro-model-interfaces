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
     * TableName=C_RevenueRecognition_Plan
     */
    String Table_Name = "C_RevenueRecognition_Plan";

    /**
     * AD_Table_ID=443
     */
    int Table_ID = 443;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);

    /** Load Meta Data */

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
     * Column name C_RevenueRecognition_Plan_ID
     */
    String COLUMNNAME_C_RevenueRecognition_Plan_ID = "C_RevenueRecognition_Plan_ID";
    /**
     * Column name C_RevenueRecognition_Plan_UU
     */
    String COLUMNNAME_C_RevenueRecognition_Plan_UU = "C_RevenueRecognition_Plan_UU";
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
     * Get Accounting Schema. Rules for accounting
     */
    int getC_AcctSchema_ID();

    /**
     * Set Accounting Schema. Rules for accounting
     */
    void setC_AcctSchema_ID(int C_AcctSchema_ID);

    /**
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

    /**
     * Set Currency. The Currency for this record
     */
    void setC_Currency_ID(int C_Currency_ID);

    /**
     * Get Invoice Line. Invoice Detail Line
     */
    int getC_InvoiceLine_ID();

    /**
     * Set Invoice Line. Invoice Detail Line
     */
    void setC_InvoiceLine_ID(int C_InvoiceLine_ID);

    /**
     * Get Revenue Recognition. Method for recording revenue
     */
    int getC_RevenueRecognition_ID();

    /**
     * Set Revenue Recognition. Method for recording revenue
     */
    void setC_RevenueRecognition_ID(int C_RevenueRecognition_ID);

    /**
     * Get Product Revenue. Account for Product Revenue (Sales Account)
     */
    int getP_Revenue_Acct();

    /**
     * Set Product Revenue. Account for Product Revenue (Sales Account)
     */
    void setP_Revenue_Acct(int P_Revenue_Acct);

    /**
     * Set Recognized Amount
     */
    void setRecognizedAmt(BigDecimal RecognizedAmt);

    /**
     * Set Total Amount. Total Amount
     */
    void setTotalAmt(BigDecimal TotalAmt);

    /**
     * Get Unearned Revenue. Account for unearned revenue
     */
    int getUnEarnedRevenue_Acct();

    /**
     * Set Unearned Revenue. Account for unearned revenue
     */
    void setUnEarnedRevenue_Acct(int UnEarnedRevenue_Acct);

}
