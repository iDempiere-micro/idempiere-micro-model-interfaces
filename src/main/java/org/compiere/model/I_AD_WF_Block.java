package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_WF_Block
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_WF_Block {

    /**
     * TableName=AD_WF_Block
     */
    String Table_Name = "AD_WF_Block";

    /**
     * AD_Table_ID=647
     */
    int Table_ID = 647;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_WF_Block_ID
     */
    String COLUMNNAME_AD_WF_Block_ID = "AD_WF_Block_ID";
    /**
     * Column name AD_WF_Block_UU
     */
    String COLUMNNAME_AD_WF_Block_UU = "AD_WF_Block_UU";
    /**
     * Column name AD_Workflow_ID
     */
    String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";

    /**
     * Get Workflow. Workflow or combination of tasks
     */
    int getAD_Workflow_ID();

}
