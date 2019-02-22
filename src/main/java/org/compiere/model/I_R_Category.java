package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for R_Category
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_Category {

    /**
     * TableName=R_Category
     */
    String Table_Name = "R_Category";

    /**
     * AD_Table_ID=772
     */
    int Table_ID = 772;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name R_Category_ID
     */
    String COLUMNNAME_R_Category_ID = "R_Category_ID";
    /**
     * Column name R_Category_UU
     */
    String COLUMNNAME_R_Category_UU = "R_Category_UU";

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

}
