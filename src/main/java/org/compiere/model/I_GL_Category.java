package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for GL_Category
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_GL_Category {

    /**
     * TableName=GL_Category
     */
    String Table_Name = "GL_Category";

    /**
     * AD_Table_ID=218
     */
    int Table_ID = 218;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);


    /**
     * Column name CategoryType
     */
    String COLUMNNAME_CategoryType = "CategoryType";
    /**
     * Column name GL_Category_ID
     */
    String COLUMNNAME_GL_Category_ID = "GL_Category_ID";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";

    /**
     * Get Category Type. Source of the Journal with this category
     */
    String getCategoryType();

    /**
     * Set Category Type. Source of the Journal with this category
     */
    void setCategoryType(String CategoryType);

    /**
     * Get GL Category. General Ledger Category
     */
    int getGLCategoryId();

    /**
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    boolean isDefault();

}
