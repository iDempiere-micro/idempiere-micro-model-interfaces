package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for AD_WF_Activity
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_WF_Activity {

    /**
     * TableName=AD_WF_Activity
     */
    String Table_Name = "AD_WF_Activity";

    /**
     * AD_Table_ID=644
     */
    int Table_ID = 644;

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);



    /**
     * Column name AD_Message_ID
     */
    String COLUMNNAME_AD_Message_ID = "AD_Message_ID";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name AD_WF_Activity_ID
     */
    String COLUMNNAME_AD_WF_Activity_ID = "AD_WF_Activity_ID";
    /**
     * Column name AD_WF_Node_ID
     */
    String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
    /**
     * Column name AD_WF_Process_ID
     */
    String COLUMNNAME_AD_WF_Process_ID = "AD_WF_Process_ID";
    /**
     * Column name AD_WF_Responsible_ID
     */
    String COLUMNNAME_AD_WF_Responsible_ID = "AD_WF_Responsible_ID";
    /**
     * Column name AD_Workflow_ID
     */
    String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
    /**
     * Column name EndWaitTime
     */
    String COLUMNNAME_EndWaitTime = "EndWaitTime";
    /**
     * Column name Priority
     */
    String COLUMNNAME_Priority = "Priority";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Record_ID
     */
    String COLUMNNAME_Record_ID = "Record_ID";
    /**
     * Column name TextMsg
     */
    String COLUMNNAME_TextMsg = "TextMsg";
    /**
     * Column name WFState
     */
    String COLUMNNAME_WFState = "WFState";

    /**
     * Get Table. Database Table information
     */
    int getDBTableId();

    /**
     * Set Table. Database Table information
     */
    void setDBTableId(int AD_Table_ID);

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getUserId();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setUserId(int AD_User_ID);

    /**
     * Get Workflow Activity. Workflow Activity
     */
    int getWorkflowActivityId();

    /**
     * Get Node. Workflow Node (activity), step or process
     */
    int getWorkflowNodeId();

    /**
     * Set Node. Workflow Node (activity), step or process
     */
    void setWorkflowNodeId(int AD_WF_Node_ID);

    /**
     * Get Workflow Process. Actual Workflow Process Instance
     */
    int getWorkflowProcessId();

    /**
     * Set Workflow Process. Actual Workflow Process Instance
     */
    void setWorkflowProcessId(int AD_WF_Process_ID);

    /**
     * Get Workflow Responsible. Responsible for Workflow Execution
     */
    int getWorkflowResponsibleId();

    /**
     * Set Workflow Responsible. Responsible for Workflow Execution
     */
    void setWorkflowResponsibleId(int AD_WF_Responsible_ID);

    /**
     * Set Workflow. Workflow or combination of tasks
     */
    void setWorkflowId(int AD_Workflow_ID);

    /**
     * Set End Wait. End of sleep time
     */
    void setEndWaitTime(Timestamp EndWaitTime);

    /**
     * Get Priority. Indicates if this request is of a high, medium or low priority.
     */
    int getPriority();

    /**
     * Set Priority. Indicates if this request is of a high, medium or low priority.
     */
    void setPriority(int Priority);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Record ID. Direct internal record ID
     */
    int getRecordId();

    /**
     * Set Record ID. Direct internal record ID
     */
    void setRecordId(int Record_ID);

    /**
     * Get Text Message. Text Message
     */
    String getTextMsg();

    /**
     * Set Text Message. Text Message
     */
    void setTextMsg(String TextMsg);

    /**
     * Get Workflow State. State of the execution of the workflow
     */
    String getWorkflowState();

    /**
     * Set Workflow State. State of the execution of the workflow
     */
    void setWorkflowState(String WFState);
}
