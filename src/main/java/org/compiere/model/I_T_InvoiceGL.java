package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for T_InvoiceGL
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_T_InvoiceGL {

    /**
     * TableName=T_InvoiceGL
     */
    String Table_Name = "T_InvoiceGL";

    /**
     * AD_Table_ID=803
     */
    int Table_ID = 803;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);



    /**
     * Column name AD_PInstance_ID
     */
    String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
    /**
     * Column name AmtRevalCrDiff
     */
    String COLUMNNAME_AmtRevalCrDiff = "AmtRevalCrDiff";
    /**
     * Column name AmtRevalDrDiff
     */
    String COLUMNNAME_AmtRevalDrDiff = "AmtRevalDrDiff";
    /**
     * Column name C_ConversionTypeReval_ID
     */
    String COLUMNNAME_C_ConversionTypeReval_ID = "C_ConversionTypeReval_ID";
    /**
     * Column name C_DocTypeReval_ID
     */
    String COLUMNNAME_C_DocTypeReval_ID = "C_DocTypeReval_ID";
    /**
     * Column name C_Invoice_ID
     */
    String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
    /**
     * Column name Fact_Acct_ID
     */
    String COLUMNNAME_Fact_Acct_ID = "Fact_Acct_ID";

    /**
     * Get Revaluated Difference Cr. Revaluated Cr Amount Difference
     */
    BigDecimal getAmtRevalCrDiff();

    /**
     * Get Revaluated Difference Dr. Revaluated Dr Amount Difference
     */
    BigDecimal getAmtRevalDrDiff();

    /**
     * Get Invoice. Invoice Identifier
     */
    int getC_Invoice_ID();

    /**
     * Get Accounting Fact
     */
    int getFact_Acct_ID();

}
