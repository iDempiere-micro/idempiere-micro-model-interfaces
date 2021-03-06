package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_SerNoCtlExclude
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_SerNoCtlExclude {

    /**
     * TableName=M_SerNoCtlExclude
     */
    String Table_Name = "M_SerNoCtlExclude";

    /**
     * AD_Table_ID=811
     */
    int Table_ID = 811;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);


    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name IsSOTrx
     */
    String COLUMNNAME_IsSOTrx = "IsSOTrx";
    /**
     * Column name M_SerNoCtl_ID
     */
    String COLUMNNAME_M_SerNoCtl_ID = "M_SerNoCtl_ID";

    /**
     * Get Table. Database Table information
     */
    int getRowTableId();

    /**
     * Get Sales Transaction. This is a Sales Transaction
     */
    boolean isSOTrx();

}
