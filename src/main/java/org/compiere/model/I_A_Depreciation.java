package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for A_Depreciation
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Depreciation {

    /**
     * TableName=A_Depreciation
     */
    String Table_Name = "A_Depreciation";

    /**
     * AD_Table_ID=53112
     */
    int Table_ID = 53112;

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);


    /**
     * Column name DepreciationType
     */
    String COLUMNNAME_DepreciationType = "DepreciationType";

    /**
     * Get DepreciationType
     */
    String getDepreciationType();

}
