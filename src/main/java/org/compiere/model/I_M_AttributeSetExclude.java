package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_AttributeSetExclude
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_AttributeSetExclude {

    /**
     * TableName=M_AttributeSetExclude
     */
    String Table_Name = "M_AttributeSetExclude";

    /**
     * AD_Table_ID=809
     */
    int Table_ID = 809;

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
     * Column name M_AttributeSetExclude_ID
     */
    String COLUMNNAME_M_AttributeSetExclude_ID = "M_AttributeSetExclude_ID";
    /**
     * Column name M_AttributeSetExclude_UU
     */
    String COLUMNNAME_M_AttributeSetExclude_UU = "M_AttributeSetExclude_UU";
    /**
     * Column name M_AttributeSet_ID
     */
    String COLUMNNAME_M_AttributeSet_ID = "M_AttributeSet_ID";

    /**
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    /**
     * Get Sales Transaction. This is a Sales Transaction
     */
    boolean isSOTrx();

    /**
     * Get Attribute Set. Product Attribute Set
     */
    int getMAttributeSet_ID();

}
