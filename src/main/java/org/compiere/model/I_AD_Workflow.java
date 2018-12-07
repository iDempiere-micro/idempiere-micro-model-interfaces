package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Workflow
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Workflow {

    /**
     * TableName=AD_Workflow
     */
    String Table_Name = "AD_Workflow";

    /**
     * AD_Table_ID=117
     */
    int Table_ID = 117;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AccessLevel
     */
    String COLUMNNAME_AccessLevel = "AccessLevel";
    /**
     * Column name AD_CtxHelp_ID
     */
    String COLUMNNAME_AD_CtxHelp_ID = "AD_CtxHelp_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
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
     * Column name AD_Workflow_UU
     */
    String COLUMNNAME_AD_Workflow_UU = "AD_Workflow_UU";
    /**
     * Column name Author
     */
    String COLUMNNAME_Author = "Author";
    /**
     * Column name Cost
     */
    String COLUMNNAME_Cost = "Cost";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
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
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
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
     * Column name Limit
     */
    String COLUMNNAME_Limit = "Limit";
    /**
     * Column name MovingTime
     */
    String COLUMNNAME_MovingTime = "MovingTime";
    /**
     * Column name OverlapUnits
     */
    String COLUMNNAME_OverlapUnits = "OverlapUnits";
    /**
     * Column name Priority
     */
    String COLUMNNAME_Priority = "Priority";
    /**
     * Column name ProcessType
     */
    String COLUMNNAME_ProcessType = "ProcessType";
    /**
     * Column name PublishStatus
     */
    String COLUMNNAME_PublishStatus = "PublishStatus";
    /**
     * Column name QtyBatchSize
     */
    String COLUMNNAME_QtyBatchSize = "QtyBatchSize";
    /**
     * Column name QueuingTime
     */
    String COLUMNNAME_QueuingTime = "QueuingTime";
    /**
     * Column name SetupTime
     */
    String COLUMNNAME_SetupTime = "SetupTime";
    /**
     * Column name S_Resource_ID
     */
    String COLUMNNAME_S_Resource_ID = "S_Resource_ID";
    /**
     * Column name UnitsCycles
     */
    String COLUMNNAME_UnitsCycles = "UnitsCycles";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name ValidateWorkflow
     */
    String COLUMNNAME_ValidateWorkflow = "ValidateWorkflow";
    /**
     * Column name ValidFrom
     */
    String COLUMNNAME_ValidFrom = "ValidFrom";
    /**
     * Column name ValidTo
     */
    String COLUMNNAME_ValidTo = "ValidTo";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";
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
     * Column name Yield
     */
    String COLUMNNAME_Yield = "Yield";

    /**
     * Get Data Access Level. Access Level required
     */
    String getWFAccessLevel();

    /**
     * Set Data Access Level. Access Level required
     */
    void setWFAccessLevel(String AccessLevel);

    /**
     * Get Context Help
     */
    int getAD_CtxHelp_ID();

    /**
     * Set Context Help
     */
    void setAD_CtxHelp_ID(int AD_CtxHelp_ID);

    I_AD_CtxHelp getAD_CtxHelp() throws RuntimeException;

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    /**
     * Set Table. Database Table information
     */
    void setAD_Table_ID(int AD_Table_ID);

    I_AD_Table getAD_Table() throws RuntimeException;

    /**
     * Get Node. Workflow Node (activity), step or process
     */
    int getAD_WF_Node_ID();

    /**
     * Set Node. Workflow Node (activity), step or process
     */
    void setAD_WF_Node_ID(int AD_WF_Node_ID);

    I_AD_WF_Node getAD_WF_Node() throws RuntimeException;

    /**
     * Get Workflow Responsible. Responsible for Workflow Execution
     */
    int getAD_WF_Responsible_ID();

    /**
     * Set Workflow Responsible. Responsible for Workflow Execution
     */
    void setAD_WF_Responsible_ID(int AD_WF_Responsible_ID);

    I_AD_WF_Responsible getAD_WF_Responsible() throws RuntimeException;

    /**
     * Get Workflow. Workflow or combination of tasks
     */
    int getAD_Workflow_ID();

    /**
     * Set Workflow. Workflow or combination of tasks
     */
    void setAD_Workflow_ID(int AD_Workflow_ID);

    /**
     * Get Workflow Processor. Workflow Processor Server
     */
    int getAD_WorkflowProcessor_ID();

    /**
     * Set Workflow Processor. Workflow Processor Server
     */
    void setAD_WorkflowProcessor_ID(int AD_WorkflowProcessor_ID);

    I_AD_WorkflowProcessor getAD_WorkflowProcessor() throws RuntimeException;

    /**
     * Get AD_Workflow_UU
     */
    String getAD_Workflow_UU();

    /**
     * Set AD_Workflow_UU
     */
    void setAD_Workflow_UU(String AD_Workflow_UU);

    /**
     * Get Author. Author/Creator of the Entity
     */
    String getAuthor();

    /**
     * Set Author. Author/Creator of the Entity
     */
    void setAuthor(String Author);

    /**
     * Get Cost. Cost information
     */
    BigDecimal getCost();

    /**
     * Set Cost. Cost information
     */
    void setCost(BigDecimal Cost);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Document No. Document sequence number of the document
     */
    String getDocumentNo();

    /**
     * Set Document No. Document sequence number of the document
     */
    void setDocumentNo(String DocumentNo);

    /**
     * Get Document Value Logic. Logic to determine Workflow Start - If true, a workflow process is
     * started for the document
     */
    String getDocValueLogic();

    /**
     * Set Document Value Logic. Logic to determine Workflow Start - If true, a workflow process is
     * started for the document
     */
    void setDocValueLogic(String DocValueLogic);

    /**
     * Get Duration. Normal Duration in Duration Unit
     */
    int getDuration();

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
     * Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    String getEntityType();

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    void setEntityType(String EntityType);

    /**
     * Get Comment/Help. Comment or Hint
     */
    String getHelp();

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Beta Functionality. This functionality is considered Beta
     */
    void setIsBetaFunctionality(boolean IsBetaFunctionality);

    /**
     * Get Beta Functionality. This functionality is considered Beta
     */
    boolean isBetaFunctionality();

    /**
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    boolean isDefault();

    /**
     * Set Valid. Element is valid
     */
    void setIsValid(boolean IsValid);

    /**
     * Get Valid. Element is valid
     */
    boolean isValid();

    /**
     * Get Duration Limit. Maximum Duration in Duration Unit
     */
    int getLimit();

    /**
     * Set Duration Limit. Maximum Duration in Duration Unit
     */
    void setLimit(int Limit);

    /**
     * Get Moving Time
     */
    int getMovingTime();

    /**
     * Set Moving Time
     */
    void setMovingTime(int MovingTime);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Overlap Units. Overlap Units are number of units that must be completed before they are
     * moved the next activity
     */
    BigDecimal getOverlapUnits();

    /**
     * Set Overlap Units. Overlap Units are number of units that must be completed before they are
     * moved the next activity
     */
    void setOverlapUnits(BigDecimal OverlapUnits);

    /**
     * Get Priority. Indicates if this request is of a high, medium or low priority.
     */
    int getPriority();

    /**
     * Set Priority. Indicates if this request is of a high, medium or low priority.
     */
    void setPriority(int Priority);

    /**
     * Get Process Type
     */
    String getProcessType();

    /**
     * Set Process Type
     */
    void setProcessType(String ProcessType);

    /**
     * Get Publication Status. Status of Publication
     */
    String getPublishStatus();

    /**
     * Set Publication Status. Status of Publication
     */
    void setPublishStatus(String PublishStatus);

    /**
     * Get Qty Batch Size
     */
    BigDecimal getQtyBatchSize();

    /**
     * Set Qty Batch Size
     */
    void setQtyBatchSize(BigDecimal QtyBatchSize);

    /**
     * Get Queuing Time. Queue time is the time a job waits at a work center before begin handled.
     */
    int getQueuingTime();

    /**
     * Set Queuing Time. Queue time is the time a job waits at a work center before begin handled.
     */
    void setQueuingTime(int QueuingTime);

    /**
     * Get Setup Time. Setup time before starting Production
     */
    int getSetupTime();

    /**
     * Set Setup Time. Setup time before starting Production
     */
    void setSetupTime(int SetupTime);

    /**
     * Get Resource. Resource
     */
    int getS_Resource_ID();

    /**
     * Set Resource. Resource
     */
    void setS_Resource_ID(int S_Resource_ID);

    I_S_Resource getS_Resource() throws RuntimeException;

    /**
     * Get Units by Cycles. The Units by Cycles are defined for process type Flow Repetitive Dedicated
     * and indicated the product to be manufactured on a production line for duration unit.
     */
    BigDecimal getUnitsCycles();

    /**
     * Set Units by Cycles. The Units by Cycles are defined for process type Flow Repetitive Dedicated
     * and indicated the product to be manufactured on a production line for duration unit.
     */
    void setUnitsCycles(BigDecimal UnitsCycles);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Validate Workflow
     */
    String getValidateWorkflow();

    /**
     * Set Validate Workflow
     */
    void setValidateWorkflow(String ValidateWorkflow);

    /**
     * Get Valid from. Valid from including this date (first day)
     */
    Timestamp getValidFrom();

    /**
     * Set Valid from. Valid from including this date (first day)
     */
    void setValidFrom(Timestamp ValidFrom);

    /**
     * Get Valid to. Valid to including this date (last day)
     */
    Timestamp getValidTo();

    /**
     * Set Valid to. Valid to including this date (last day)
     */
    void setValidTo(Timestamp ValidTo);

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);

    /**
     * Get Version. Version of the table definition
     */
    int getVersion();

    /**
     * Set Version. Version of the table definition
     */
    void setVersion(int Version);

    /**
     * Get Waiting Time. Workflow Simulation Waiting time
     */
    int getWaitingTime();

    /**
     * Set Waiting Time. Workflow Simulation Waiting time
     */
    void setWaitingTime(int WaitingTime);

    /**
     * Get Workflow Type. Type of Workflow
     */
    String getWorkflowType();

    /**
     * Set Workflow Type. Type of Workflow
     */
    void setWorkflowType(String WorkflowType);

    /**
     * Get Working Time. Workflow Simulation Execution Time
     */
    int getWorkingTime();

    /**
     * Set Working Time. Workflow Simulation Execution Time
     */
    void setWorkingTime(int WorkingTime);

    /**
     * Get Yield %. The Yield is the percentage of a lot that is expected to be of acceptable wuality
     * may fall below 100 percent
     */
    int getYield();

    /**
     * Set Yield %. The Yield is the percentage of a lot that is expected to be of acceptable wuality
     * may fall below 100 percent
     */
    void setYield(int Yield);
}
