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

    /** Load Meta Data */

    /**
     * Column name A_Depreciation_ID
     */
    String COLUMNNAME_A_Depreciation_ID = "A_Depreciation_ID";
    /**
     * Column name A_Depreciation_UU
     */
    String COLUMNNAME_A_Depreciation_UU = "A_Depreciation_UU";
    /**
     * Column name DepreciationType
     */
    String COLUMNNAME_DepreciationType = "DepreciationType";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Text
     */
    String COLUMNNAME_Text = "Text";

    /**
     * Get DepreciationType
     */
    String getDepreciationType();

}
