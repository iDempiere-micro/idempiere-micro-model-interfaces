package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_POSTenderType
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_POSTenderType {

    /**
     * TableName=C_POSTenderType
     */
    String Table_Name = "C_POSTenderType";

    /**
     * AD_Table_ID=200017
     */
    int Table_ID = 200017;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name C_POSTenderType_ID
     */
    String COLUMNNAME_C_POSTenderType_ID = "C_POSTenderType_ID";
    /**
     * Column name C_POSTenderType_UU
     */
    String COLUMNNAME_C_POSTenderType_UU = "C_POSTenderType_UU";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsGuarantee
     */
    String COLUMNNAME_IsGuarantee = "IsGuarantee";
    /**
     * Column name IsPostDated
     */
    String COLUMNNAME_IsPostDated = "IsPostDated";
    /**
     * Column name TenderType
     */
    String COLUMNNAME_TenderType = "TenderType";

    /**
     * Get Guarantee. Guarantee for a Credit
     */
    boolean isGuarantee();

}
