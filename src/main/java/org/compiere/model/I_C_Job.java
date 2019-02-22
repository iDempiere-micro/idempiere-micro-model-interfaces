package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_Job
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Job {

    /**
     * TableName=C_Job
     */
    String Table_Name = "C_Job";

    /**
     * AD_Table_ID=789
     */
    int Table_ID = 789;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name C_JobCategory_ID
     */
    String COLUMNNAME_C_JobCategory_ID = "C_JobCategory_ID";
    /**
     * Column name C_Job_ID
     */
    String COLUMNNAME_C_Job_ID = "C_Job_ID";
    /**
     * Column name C_Job_UU
     */
    String COLUMNNAME_C_Job_UU = "C_Job_UU";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsEmployee
     */
    String COLUMNNAME_IsEmployee = "IsEmployee";

    /**
     * Get Position Category. Job Position Category
     */
    int getC_JobCategory_ID();

}
