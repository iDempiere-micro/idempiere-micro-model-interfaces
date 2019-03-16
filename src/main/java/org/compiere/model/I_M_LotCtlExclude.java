package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_LotCtlExclude
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_LotCtlExclude {

    /**
     * TableName=M_LotCtlExclude
     */
    String Table_Name = "M_LotCtlExclude";

    /**
     * AD_Table_ID=810
     */
    int Table_ID = 810;

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
     * Column name M_LotCtl_ID
     */
    String COLUMNNAME_M_LotCtl_ID = "M_LotCtl_ID";

    /**
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    /**
     * Get Sales Transaction. This is a Sales Transaction
     */
    boolean isSOTrx();

}
