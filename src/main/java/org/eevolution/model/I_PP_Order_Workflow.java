package org.eevolution.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for PP_Order_Workflow
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_PP_Order_Workflow {

    /**
     * TableName=PP_Order_Workflow
     */
    public static final String Table_Name = "PP_Order_Workflow";

    /**
     * AD_Table_ID=53029
     */
    public static final int Table_ID = 53029;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name AccessLevel
     */
    public static final String COLUMNNAME_AccessLevel = "AccessLevel";
    /**
     * Column name AD_Org_ID
     */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Table_ID
     */
    public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name AD_WF_Node_ID
     */
    public static final String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
    /**
     * Column name AD_WF_Responsible_ID
     */
    public static final String COLUMNNAME_AD_WF_Responsible_ID = "AD_WF_Responsible_ID";
    /**
     * Column name AD_Workflow_ID
     */
    public static final String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
    /**
     * Column name AD_WorkflowProcessor_ID
     */
    public static final String COLUMNNAME_AD_WorkflowProcessor_ID = "AD_WorkflowProcessor_ID";
    /**
     * Column name Author
     */
    public static final String COLUMNNAME_Author = "Author";
    /**
     * Column name Cost
     */
    public static final String COLUMNNAME_Cost = "Cost";
    /**
     * Column name Created
     */
    public static final String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Description
     */
    public static final String COLUMNNAME_Description = "Description";
    /**
     * Column name DocumentNo
     */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name Duration
     */
    public static final String COLUMNNAME_Duration = "Duration";
    /**
     * Column name DurationUnit
     */
    public static final String COLUMNNAME_DurationUnit = "DurationUnit";
    /**
     * Column name EntityType
     */
    public static final String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name Help
     */
    public static final String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsDefault
     */
    public static final String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name Limit
     */
    public static final String COLUMNNAME_Limit = "Limit";
    /**
     * Column name MovingTime
     */
    public static final String COLUMNNAME_MovingTime = "MovingTime";
    /**
     * Column name OverlapUnits
     */
    public static final String COLUMNNAME_OverlapUnits = "OverlapUnits";
    /**
     * Column name PP_Order_ID
     */
    public static final String COLUMNNAME_PP_Order_ID = "PP_Order_ID";
    /**
     * Column name PP_Order_Node_ID
     */
    public static final String COLUMNNAME_PP_Order_Node_ID = "PP_Order_Node_ID";
    /**
     * Column name PP_Order_Workflow_ID
     */
    public static final String COLUMNNAME_PP_Order_Workflow_ID = "PP_Order_Workflow_ID";
    /**
     * Column name PP_Order_Workflow_UU
     */
    public static final String COLUMNNAME_PP_Order_Workflow_UU = "PP_Order_Workflow_UU";
    /**
     * Column name Priority
     */
    public static final String COLUMNNAME_Priority = "Priority";
    /**
     * Column name ProcessType
     */
    public static final String COLUMNNAME_ProcessType = "ProcessType";
    /**
     * Column name PublishStatus
     */
    public static final String COLUMNNAME_PublishStatus = "PublishStatus";
    /**
     * Column name QtyBatchSize
     */
    public static final String COLUMNNAME_QtyBatchSize = "QtyBatchSize";
    /**
     * Column name QueuingTime
     */
    public static final String COLUMNNAME_QueuingTime = "QueuingTime";
    /**
     * Column name SetupTime
     */
    public static final String COLUMNNAME_SetupTime = "SetupTime";
    /**
     * Column name S_Resource_ID
     */
    public static final String COLUMNNAME_S_Resource_ID = "S_Resource_ID";
    /**
     * Column name UnitsCycles
     */
    public static final String COLUMNNAME_UnitsCycles = "UnitsCycles";
    /**
     * Column name Updated
     */
    public static final String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name ValidateWorkflow
     */
    public static final String COLUMNNAME_ValidateWorkflow = "ValidateWorkflow";
    /**
     * Column name ValidFrom
     */
    public static final String COLUMNNAME_ValidFrom = "ValidFrom";
    /**
     * Column name ValidTo
     */
    public static final String COLUMNNAME_ValidTo = "ValidTo";
    /**
     * Column name Value
     */
    public static final String COLUMNNAME_Value = "Value";
    /**
     * Column name Version
     */
    public static final String COLUMNNAME_Version = "Version";
    /**
     * Column name WaitingTime
     */
    public static final String COLUMNNAME_WaitingTime = "WaitingTime";
    /**
     * Column name WorkflowType
     */
    public static final String COLUMNNAME_WorkflowType = "WorkflowType";
    /**
     * Column name WorkingTime
     */
    public static final String COLUMNNAME_WorkingTime = "WorkingTime";
    /**
     * Column name Yield
     */
    public static final String COLUMNNAME_Yield = "Yield";

    /**
     * Get Data Access Level. Access Level required
     */
    public String getAccessLevel();

    /**
     * Set Data Access Level. Access Level required
     */
    public void setAccessLevel(String AccessLevel);

    /**
     * Get Organization. Organizational entity within client
     */
    public int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    public void setOrgId(int AD_Org_ID);

    /**
     * Get Table. Database Table information
     */
    public int getAD_Table_ID();

    /**
     * Set Table. Database Table information
     */
    public void setAD_Table_ID(int AD_Table_ID);

    public org.compiere.model.I_AD_Table getAD_Table() throws RuntimeException;

    /**
     * Get Node. Workflow Node (activity), step or process
     */
    public int getAD_WF_Node_ID();

    /**
     * Set Node. Workflow Node (activity), step or process
     */
    public void setAD_WF_Node_ID(int AD_WF_Node_ID);

    public org.compiere.model.I_AD_WF_Node getAD_WF_Node() throws RuntimeException;

    /**
     * Get Workflow Responsible. Responsible for Workflow Execution
     */
    public int getAD_WF_Responsible_ID();

    /**
     * Set Workflow Responsible. Responsible for Workflow Execution
     */
    public void setAD_WF_Responsible_ID(int AD_WF_Responsible_ID);

    public org.compiere.model.I_AD_WF_Responsible getAD_WF_Responsible() throws RuntimeException;

    /**
     * Get Workflow. Workflow or combination of tasks
     */
    public int getAD_Workflow_ID();

    /**
     * Set Workflow. Workflow or combination of tasks
     */
    public void setAD_Workflow_ID(int AD_Workflow_ID);

    public org.compiere.model.I_AD_Workflow getAD_Workflow() throws RuntimeException;

    /**
     * Get Workflow Processor. Workflow Processor Server
     */
    public int getAD_WorkflowProcessor_ID();

    /**
     * Set Workflow Processor. Workflow Processor Server
     */
    public void setAD_WorkflowProcessor_ID(int AD_WorkflowProcessor_ID);

    public org.compiere.model.I_AD_WorkflowProcessor getAD_WorkflowProcessor()
            throws RuntimeException;

    /**
     * Get Author. Author/Creator of the Entity
     */
    public String getAuthor();

    /**
     * Set Author. Author/Creator of the Entity
     */
    public void setAuthor(String Author);

    /**
     * Get Cost. Cost information
     */
    public BigDecimal getCost();

    /**
     * Set Cost. Cost information
     */
    public void setCost(BigDecimal Cost);

    /**
     * Get Created. Date this record was created
     */
    public Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    public int getCreatedBy();

    /**
     * Get Description. Optional short description of the record
     */
    public String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    public void setDescription(String Description);

    /**
     * Get Document No. Document sequence number of the document
     */
    public String getDocumentNo();

    /**
     * Set Document No. Document sequence number of the document
     */
    public void setDocumentNo(String DocumentNo);

    /**
     * Get Duration. Normal Duration in Duration Unit
     */
    public int getDuration();

    /**
     * Set Duration. Normal Duration in Duration Unit
     */
    public void setDuration(int Duration);

    /**
     * Get Duration Unit. Unit of Duration
     */
    public String getDurationUnit();

    /**
     * Set Duration Unit. Unit of Duration
     */
    public void setDurationUnit(String DurationUnit);

    /**
     * Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    public String getEntityType();

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    public void setEntityType(String EntityType);

    /**
     * Get Comment/Help. Comment or Hint
     */
    public String getHelp();

    /**
     * Set Comment/Help. Comment or Hint
     */
    public void setHelp(String Help);

    /**
     * Set Active. The record is active in the system
     */
    public void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    public boolean isActive();

    /**
     * Set Default. Default value
     */
    public void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    public boolean isDefault();

    /**
     * Get Duration Limit. Maximum Duration in Duration Unit
     */
    public int getLimit();

    /**
     * Set Duration Limit. Maximum Duration in Duration Unit
     */
    public void setLimit(int Limit);

    /**
     * Get Moving Time
     */
    public int getMovingTime();

    /**
     * Set Moving Time
     */
    public void setMovingTime(int MovingTime);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    public String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    public void setName(String Name);

    /**
     * Get Overlap Units. Overlap Units are number of units that must be completed before they are
     * moved the next activity
     */
    public BigDecimal getOverlapUnits();

    /**
     * Set Overlap Units. Overlap Units are number of units that must be completed before they are
     * moved the next activity
     */
    public void setOverlapUnits(BigDecimal OverlapUnits);

    /**
     * Get Manufacturing Order. Manufacturing Order
     */
    public int getPP_Order_ID();

    /**
     * Set Manufacturing Order. Manufacturing Order
     */
    public void setPP_Order_ID(int PP_Order_ID);

    public org.eevolution.model.I_PP_Order getPP_Order() throws RuntimeException;

    /**
     * Get Manufacturing Order Activity. Workflow Node (activity), step or process
     */
    public int getPP_Order_Node_ID();

    /**
     * Set Manufacturing Order Activity. Workflow Node (activity), step or process
     */
    public void setPP_Order_Node_ID(int PP_Order_Node_ID);

    public org.eevolution.model.I_PP_Order_Node getPP_Order_Node() throws RuntimeException;

    /**
     * Get Manufacturing Order Workflow
     */
    public int getPP_Order_Workflow_ID();

    /**
     * Set Manufacturing Order Workflow
     */
    public void setPP_Order_Workflow_ID(int PP_Order_Workflow_ID);

    /**
     * Get PP_Order_Workflow_UU
     */
    public String getPP_Order_Workflow_UU();

    /**
     * Set PP_Order_Workflow_UU
     */
    public void setPP_Order_Workflow_UU(String PP_Order_Workflow_UU);

    /**
     * Get Priority. Indicates if this request is of a high, medium or low priority.
     */
    public int getPriority();

    /**
     * Set Priority. Indicates if this request is of a high, medium or low priority.
     */
    public void setPriority(int Priority);

    /**
     * Get Process Type
     */
    public String getProcessType();

    /**
     * Set Process Type
     */
    public void setProcessType(String ProcessType);

    /**
     * Get Publication Status. Status of Publication
     */
    public String getPublishStatus();

    /**
     * Set Publication Status. Status of Publication
     */
    public void setPublishStatus(String PublishStatus);

    /**
     * Get Qty Batch Size
     */
    public BigDecimal getQtyBatchSize();

    /**
     * Set Qty Batch Size
     */
    public void setQtyBatchSize(BigDecimal QtyBatchSize);

    /**
     * Get Queuing Time. Queue time is the time a job waits at a work center before begin handled.
     */
    public int getQueuingTime();

    /**
     * Set Queuing Time. Queue time is the time a job waits at a work center before begin handled.
     */
    public void setQueuingTime(int QueuingTime);

    /**
     * Get Setup Time. Setup time before starting Production
     */
    public int getSetupTime();

    /**
     * Set Setup Time. Setup time before starting Production
     */
    public void setSetupTime(int SetupTime);

    /**
     * Get Resource. Resource
     */
    public int getResourceID();

    /**
     * Set Resource. Resource
     */
    public void setResourceID(int S_Resource_ID);

    public org.compiere.model.I_S_Resource getS_Resource() throws RuntimeException;

    /**
     * Get Units by Cycles. The Units by Cycles are defined for process type Flow Repetitive Dedicated
     * and indicated the product to be manufactured on a production line for duration unit.
     */
    public BigDecimal getUnitsCycles();

    /**
     * Set Units by Cycles. The Units by Cycles are defined for process type Flow Repetitive Dedicated
     * and indicated the product to be manufactured on a production line for duration unit.
     */
    public void setUnitsCycles(BigDecimal UnitsCycles);

    /**
     * Get Updated. Date this record was updated
     */
    public Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    public int getUpdatedBy();

    /**
     * Get Validate Workflow
     */
    public String getValidateWorkflow();

    /**
     * Set Validate Workflow
     */
    public void setValidateWorkflow(String ValidateWorkflow);

    /**
     * Get Valid from. Valid from including this date (first day)
     */
    public Timestamp getValidFrom();

    /**
     * Set Valid from. Valid from including this date (first day)
     */
    public void setValidFrom(Timestamp ValidFrom);

    /**
     * Get Valid to. Valid to including this date (last day)
     */
    public Timestamp getValidTo();

    /**
     * Set Valid to. Valid to including this date (last day)
     */
    public void setValidTo(Timestamp ValidTo);

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    public String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    public void setValue(String Value);

    /**
     * Get Version. Version of the table definition
     */
    public int getVersion();

    /**
     * Set Version. Version of the table definition
     */
    public void setVersion(int Version);

    /**
     * Get Waiting Time. Workflow Simulation Waiting time
     */
    public int getWaitingTime();

    /**
     * Set Waiting Time. Workflow Simulation Waiting time
     */
    public void setWaitingTime(int WaitingTime);

    /**
     * Get Workflow Type. Type of Workflow
     */
    public String getWorkflowType();

    /**
     * Set Workflow Type. Type of Workflow
     */
    public void setWorkflowType(String WorkflowType);

    /**
     * Get Working Time. Workflow Simulation Execution Time
     */
    public int getWorkingTime();

    /**
     * Set Working Time. Workflow Simulation Execution Time
     */
    public void setWorkingTime(int WorkingTime);

    /**
     * Get Yield %. The Yield is the percentage of a lot that is expected to be of acceptable wuality
     * may fall below 100 percent
     */
    public int getYield();

    /**
     * Set Yield %. The Yield is the percentage of a lot that is expected to be of acceptable wuality
     * may fall below 100 percent
     */
    public void setYield(int Yield);
}
