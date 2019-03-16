package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for A_Asset_Type
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Type {

    /**
     * TableName=A_Asset_Type
     */
    String Table_Name = "A_Asset_Type";

    /**
     * AD_Table_ID=53276
     */
    int Table_ID = 53276;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name IsDepreciable
     */
    String COLUMNNAME_IsDepreciable = "IsDepreciable";
    /**
     * Column name IsInPosession
     */
    String COLUMNNAME_IsInPosession = "IsInPosession";
    /**
     * Column name IsOwned
     */
    String COLUMNNAME_IsOwned = "IsOwned";

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getSearchKey();

}
