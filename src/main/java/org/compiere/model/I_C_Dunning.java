package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_Dunning
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Dunning {

    /**
     * TableName=C_Dunning
     */
    String Table_Name = "C_Dunning";

    /**
     * AD_Table_ID=301
     */
    int Table_ID = 301;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name C_Dunning_ID
     */
    String COLUMNNAME_C_Dunning_ID = "C_Dunning_ID";
    /**
     * Column name C_Dunning_UU
     */
    String COLUMNNAME_C_Dunning_UU = "C_Dunning_UU";
    /**
     * Column name CreateLevelsSequentially
     */
    String COLUMNNAME_CreateLevelsSequentially = "CreateLevelsSequentially";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name SendDunningLetter
     */
    String COLUMNNAME_SendDunningLetter = "SendDunningLetter";

}
