package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_SubAcct
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_SubAcct {

    /**
     * TableName=C_SubAcct
     */
    String Table_Name = "C_SubAcct";

    /**
     * AD_Table_ID=825
     */
    int Table_ID = 825;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name C_ElementValue_ID
     */
    String COLUMNNAME_C_ElementValue_ID = "C_ElementValue_ID";
    /**
     * Column name C_SubAcct_ID
     */
    String COLUMNNAME_C_SubAcct_ID = "C_SubAcct_ID";
    /**
     * Column name C_SubAcct_UU
     */
    String COLUMNNAME_C_SubAcct_UU = "C_SubAcct_UU";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";

    /**
     * Get Account Element. Account Element
     */
    int getC_ElementValue_ID();

}
