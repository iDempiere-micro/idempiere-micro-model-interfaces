package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for S_ExpenseType
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_S_ExpenseType {

    /**
     * AD_Table_ID=481
     */
    int Table_ID = 481;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);



    /**
     * Column name C_TaxCategory_ID
     */
    String COLUMNNAME_C_TaxCategory_ID = "C_TaxCategory_ID";
    /**
     * Column name C_UOM_ID
     */
    String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name M_Product_Category_ID
     */
    String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
    /**
     * Column name S_ExpenseType_ID
     */
    String COLUMNNAME_S_ExpenseType_ID = "S_ExpenseType_ID";

    /**
     * Get Tax Category. Tax Category
     */
    int getC_TaxCategory_ID();

    /**
     * Get UOM. Unit of Measure
     */
    int getC_UOM_ID();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Get Product Category. Category of a Product
     */
    int getM_Product_Category_ID();

    /**
     * Get Expense Type. Expense report type
     */
    int getS_ExpenseType_ID();

}
