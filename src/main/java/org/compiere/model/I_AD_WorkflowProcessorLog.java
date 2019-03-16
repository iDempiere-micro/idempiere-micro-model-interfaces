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


    /**
     * Column name AD_WorkflowProcessor_ID
     */
    String COLUMNNAME_AD_WorkflowProcessor_ID = "AD_WorkflowProcessor_ID";
    /**
     * Column name IsError
     */
    String COLUMNNAME_IsError = "IsError";
    /**
     * Column name Summary
     */
    String COLUMNNAME_Summary = "Summary";

    /**
     * Set Workflow Processor. Workflow Processor Server
     */
    void setWorkflowProcessorId(int AD_WorkflowProcessor_ID);

    /**
     * Set Error. An Error occurred in the execution
     */
    void setIsError(boolean IsError);

    /**
     * Set Summary. Textual summary of this request
     */
    void setSummary(String Summary);

}
