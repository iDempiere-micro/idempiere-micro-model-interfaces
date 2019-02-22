package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_WorkflowProcessorLog
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_WorkflowProcessorLog {

    /**
     * TableName=AD_WorkflowProcessorLog
     */
    String Table_Name = "AD_WorkflowProcessorLog";

    /**
     * AD_Table_ID=696
     */
    int Table_ID = 696;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_WorkflowProcessor_ID
     */
    String COLUMNNAME_AD_WorkflowProcessor_ID = "AD_WorkflowProcessor_ID";
    /**
     * Column name AD_WorkflowProcessorLog_ID
     */
    String COLUMNNAME_AD_WorkflowProcessorLog_ID = "AD_WorkflowProcessorLog_ID";
    /**
     * Column name AD_WorkflowProcessorLog_UU
     */
    String COLUMNNAME_AD_WorkflowProcessorLog_UU = "AD_WorkflowProcessorLog_UU";
    /**
     * Column name BinaryData
     */
    String COLUMNNAME_BinaryData = "BinaryData";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsError
     */
    String COLUMNNAME_IsError = "IsError";
    /**
     * Column name Reference
     */
    String COLUMNNAME_Reference = "Reference";
    /**
     * Column name Summary
     */
    String COLUMNNAME_Summary = "Summary";
    /**
     * Column name TextMsg
     */
    String COLUMNNAME_TextMsg = "TextMsg";

    /**
     * Get Workflow Processor. Workflow Processor Server
     */
    int getAD_WorkflowProcessor_ID();

    /**
     * Set Workflow Processor. Workflow Processor Server
     */
    void setAD_WorkflowProcessor_ID(int AD_WorkflowProcessor_ID);

    /**
     * Set Error. An Error occurred in the execution
     */
    void setIsError(boolean IsError);

    /**
     * Set Summary. Textual summary of this request
     */
    void setSummary(String Summary);

}
