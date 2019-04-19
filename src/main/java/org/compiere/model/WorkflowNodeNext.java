package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_WF_NodeNext
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface WorkflowNodeNext {

    /**
     * TableName=AD_WF_NodeNext
     */
    String Table_Name = "AD_WF_NodeNext";

    /**
     * AD_Table_ID=131
     */
    int Table_ID = 131;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);


    /**
     * Column name AD_WF_Next_ID
     */
    String COLUMNNAME_AD_WF_Next_ID = "AD_WF_Next_ID";
    /**
     * Column name AD_WF_Node_ID
     */
    String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
    /**
     * Column name AD_WF_NodeNext_ID
     */
    String COLUMNNAME_AD_WF_NodeNext_ID = "AD_WF_NodeNext_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name IsStdUserWorkflow
     */
    String COLUMNNAME_IsStdUserWorkflow = "IsStdUserWorkflow";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";

    /**
     * Get Next Node. Next Node in workflow
     */
    int getWorkflowNextId();

    /**
     * Set Next Node. Next Node in workflow
     */
    void setWorkflowNextId(int AD_WF_Next_ID);

    /**
     * Get Node. Workflow Node (activity), step or process
     */
    int getWorkflowNodeId();

    /**
     * Set Node. Workflow Node (activity), step or process
     */
    void setWorkflowNodeId(int AD_WF_Node_ID);

    /**
     * Get Node Transition. Workflow Node Transition
     */
    int getWorkflowNodeNextId();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    void setEntityType(String EntityType);

    /**
     * Set Std User Workflow. Standard Manual User Approval Workflow
     */
    void setIsStdUserWorkflow(boolean IsStdUserWorkflow);

    /**
     * Get Std User Workflow. Standard Manual User Approval Workflow
     */
    boolean isStdUserWorkflow();

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

}
