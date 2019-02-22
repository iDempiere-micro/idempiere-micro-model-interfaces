package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_ProjectType
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_ProjectType {

    /**
     * TableName=C_ProjectType
     */
    String Table_Name = "C_ProjectType";

    /**
     * AD_Table_ID=575
     */
    int Table_ID = 575;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name C_ProjectType_ID
     */
    String COLUMNNAME_C_ProjectType_ID = "C_ProjectType_ID";
    /**
     * Column name C_ProjectType_UU
     */
    String COLUMNNAME_C_ProjectType_UU = "C_ProjectType_UU";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name ProjectCategory
     */
    String COLUMNNAME_ProjectCategory = "ProjectCategory";

    /**
     * Get Project Type. Type of the project
     */
    int getC_ProjectType_ID();

    /**
     * Get Project Category. Project Category
     */
    String getProjectCategory();

}
