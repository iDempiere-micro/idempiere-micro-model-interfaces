package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_SalesRegion
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_SalesRegion {

    /**
     * AD_Table_ID=230
     */
    int Table_ID = 230;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name C_SalesRegion_ID
     */
    String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
    /**
     * Column name SalesRep_ID
     */
    String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

    /**
     * Get Sales Region. Sales coverage region
     */
    int getSalesRegionId();

}
