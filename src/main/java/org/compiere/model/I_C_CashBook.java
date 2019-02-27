package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_CashBook
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_CashBook {

    /**
     * TableName=C_CashBook
     */
    String Table_Name = "C_CashBook";

    /**
     * AD_Table_ID=408
     */
    int Table_ID = 408;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);



    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_CashBook_ID
     */
    String COLUMNNAME_C_CashBook_ID = "C_CashBook_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

    /**
     * Get Cash Book. Cash Book for recording petty cash transactions
     */
    int getC_CashBook_ID();

    /**
     * Get Currency. The Currency for this record
     */
    int getCurrencyId();

    /**
     * Set Currency. The Currency for this record
     */
    void setCurrencyId(int C_Currency_ID);

}
