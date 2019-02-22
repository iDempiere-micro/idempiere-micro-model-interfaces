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

    /** Load Meta Data */

    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name IsSOTrx
     */
    String COLUMNNAME_IsSOTrx = "IsSOTrx";
    /**
     * Column name M_SerNoCtlExclude_ID
     */
    String COLUMNNAME_M_SerNoCtlExclude_ID = "M_SerNoCtlExclude_ID";
    /**
     * Column name M_SerNoCtlExclude_UU
     */
    String COLUMNNAME_M_SerNoCtlExclude_UU = "M_SerNoCtlExclude_UU";
    /**
     * Column name M_SerNoCtl_ID
     */
    String COLUMNNAME_M_SerNoCtl_ID = "M_SerNoCtl_ID";

    /**
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    /**
     * Get Sales Transaction. This is a Sales Transaction
     */
    boolean isSOTrx();

    /**
     * Get Serial No Control. Product Serial Number Control
     */
    int getM_SerNoCtl_ID();

}
