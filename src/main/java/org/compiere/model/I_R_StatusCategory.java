package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for R_StatusCategory
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_StatusCategory {

    /**
     * TableName=R_StatusCategory
     */
    String Table_Name = "R_StatusCategory";

    /**
     * AD_Table_ID=844
     */
    int Table_ID = 844;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);


    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name R_StatusCategory_ID
     */
    String COLUMNNAME_R_StatusCategory_ID = "R_StatusCategory_ID";

    /**
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Status Category. Request Status Category
     */
    int getStatusCategoryId();

}
