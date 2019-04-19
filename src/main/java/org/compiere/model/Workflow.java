package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for AD_Workflow
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface Workflow {

    /**
     * TableName=AD_Workflow
     */
    String Table_Name = "AD_Workflow";

    /**
     * AD_Table_ID=117
     */
    int Table_ID = 117;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);


    /**
     * Column name AccessLevel
     */
    String COLUMNNAME_AccessLevel = "AccessLevel";
    /**
     * Column name AD_CtxHelp_ID
     */
    String COLUMNNAME_AD_CtxHelp_ID = "AD_CtxHelp_ID";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name AD_WF_Node_ID
     */
    String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
    /**
     * Column name AD_WF_Responsible_ID
     */
    String COLUMNNAME_AD_WF_Responsible_ID = "AD_WF_Responsible_ID";
    /**
     * Column name AD_Workflow_ID
     */
    String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
    /**
     * Column name AD_WorkflowProcessor_ID
     */
    String COLUMNNAME_AD_WorkflowProcessor_ID = "AD_WorkflowProcessor_ID";
    /**
     * Column name Author
     */
    String COLUMNNAME_Author = "Author";
    /**
     * Column name Cost
     */
    String COLUMNNAME_Cost = "Cost";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DocValueLogic
     */
    String COLUMNNAME_DocValueLogic = "DocValueLogic";
    /**
     * Column name Duration
     */
    String COLUMNNAME_Duration = "Duration";
    /**
     * Column name DurationUnit
     */
    String COLUMNNAME_DurationUnit = "DurationUnit";
    /**
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsBetaFunctionality
     */
    String COLUMNNAME_IsBetaFunctionality = "IsBetaFunctionality";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name IsValid
     */
    String COLUMNNAME_IsValid = "IsValid";
    /**
     * Column name Priority
     */
    String COLUMNNAME_Priority = "Priority";
    /**
     * Column name PublishStatus
     */
    String COLUMNNAME_PublishStatus = "PublishStatus";
    /**
     * Column name S_Resource_ID
     */
    String COLUMNNAME_S_Resource_ID = "S_Resource_ID";
    /**
     * Column name ValidFrom
     */
    String COLUMNNAME_ValidFrom = "ValidFrom";
    /**
     * Column name ValidTo
     */
    String COLUMNNAME_ValidTo = "ValidTo";
    /**
     * Column name Version
     */
    String COLUMNNAME_Version = "Version";
    /**
     * Column name WaitingTime
     */
    String COLUMNNAME_WaitingTime = "WaitingTime";
    /**
     * Column name WorkflowType
     */
    String COLUMNNAME_WorkflowType = "WorkflowType";
    /**
     * Column name WorkingTime
     */
    String COLUMNNAME_WorkingTime = "WorkingTime";

    /**
     * Set Data Access Level. Access Level required
     */
    void setWFAccessLevel(String AccessLevel);

    /**
     * Get Table. Database Table information
     */
    int getDBTableId();

    /**
     * Set Table. Database Table information
     */
    void setDBTableId(int AD_Table_ID);

    /**
     * Get Node. Workflow Node (activity), step or process
     */
    int getWorkflowNodeId();

    /**
     * Get Workflow Responsible. Responsible for Workflow Execution
     */
    int getWorkflowResponsibleId();

    /**
     * Get Workflow. Workflow or combination of tasks
     */
    int getWorkflowId();

    /**
     * Set Author. Author/Creator of the Entity
     */
    void setAuthor(String Author);

    /**
     * Set Cost. Cost information
     */
    void setCost(BigDecimal Cost);

    /**
     * Get Document Value Logic. Logic to determine Workflow Start - If true, a workflow process is
     * started for the document
     */
    String getDocValueLogic();

    /**
     * Set Duration. Normal Duration in Duration Unit
     */
    void setDuration(int Duration);

    /**
     * Get Duration Unit. Unit of Duration
     */
    String getDurationUnit();

    /**
     * Set Duration Unit. Unit of Duration
     */
    void setDurationUnit(String DurationUnit);

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    void setEntityType(String EntityType);

    /**
     * Set Beta Functionality. This functionality is considered Beta
     */
    void setIsBetaFunctionality(boolean IsBetaFunctionality);

    /**
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Set Valid. Element is valid
     */
    void setIsValid(boolean IsValid);

    /**
     * Get Valid. Element is valid
     */
    boolean isValid();

    /**
     * Get Priority. Indicates if this request is of a high, medium or low priority.
     */
    int getPriority();

    /**
     * Set Publication Status. Status of Publication
     */
    void setPublishStatus(String PublishStatus);

    /**
     * Get Valid from. Valid from including this date (first day)
     */
    Timestamp getValidFrom();

    /**
     * Get Valid to. Valid to including this date (last day)
     */
    Timestamp getValidTo();

    /**
     * Set Version. Version of the table definition
     */
    void setVersion(int Version);

    /**
     * Set Waiting Time. Workflow Simulation Waiting time
     */
    void setWaitingTime(int WaitingTime);

    /**
     * Get Workflow Type. Type of Workflow
     */
    String getWorkflowType();

    /**
     * Set Working Time. Workflow Simulation Execution Time
     */
    void setWorkingTime(int WorkingTime);

}
