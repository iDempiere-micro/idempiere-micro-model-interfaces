package org.eevolution.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for PP_Order_Node
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PP_Order_Node {

    /**
     * TableName=PP_Order_Node
     */
    String Table_Name = "PP_Order_Node";

    /**
     * AD_Table_ID=53022
     */
    int Table_ID = 53022;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name Action
     */
    String COLUMNNAME_Action = "Action";
    /**
     * Column name AD_Column_ID
     */
    String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
    /**
     * Column name AD_Form_ID
     */
    String COLUMNNAME_AD_Form_ID = "AD_Form_ID";
    /**
     * Column name AD_Image_ID
     */
    String COLUMNNAME_AD_Image_ID = "AD_Image_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Process_ID
     */
    String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
    /**
     * Column name AD_Task_ID
     */
    String COLUMNNAME_AD_Task_ID = "AD_Task_ID";
    /**
     * Column name AD_WF_Block_ID
     */
    String COLUMNNAME_AD_WF_Block_ID = "AD_WF_Block_ID";
    /**
     * Column name AD_WF_Node_ID
     */
    String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
    /**
     * Column name AD_WF_Responsible_ID
     */
    String COLUMNNAME_AD_WF_Responsible_ID = "AD_WF_Responsible_ID";
    /**
     * Column name AD_Window_ID
     */
    String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
    /**
     * Column name AD_Workflow_ID
     */
    String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
    /**
     * Column name AttributeName
     */
    String COLUMNNAME_AttributeName = "AttributeName";
    /**
     * Column name AttributeValue
     */
    String COLUMNNAME_AttributeValue = "AttributeValue";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
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
     * Column name DateFinish
     */
    String COLUMNNAME_DateFinish = "DateFinish";
    /**
     * Column name DateFinishSchedule
     */
    String COLUMNNAME_DateFinishSchedule = "DateFinishSchedule";
    /**
     * Column name DateStart
     */
    String COLUMNNAME_DateStart = "DateStart";
    /**
     * Column name DateStartSchedule
     */
    String COLUMNNAME_DateStartSchedule = "DateStartSchedule";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DocAction
     */
    String COLUMNNAME_DocAction = "DocAction";
    /**
     * Column name DocStatus
     */
    String COLUMNNAME_DocStatus = "DocStatus";
    /**
     * Column name Duration
     */
    String COLUMNNAME_Duration = "Duration";
    /**
     * Column name DurationReal
     */
    String COLUMNNAME_DurationReal = "DurationReal";
    /**
     * Column name DurationRequiered
     */
    String COLUMNNAME_DurationRequiered = "DurationRequiered";
    /**
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name FinishMode
     */
    String COLUMNNAME_FinishMode = "FinishMode";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsCentrallyMaintained
     */
    String COLUMNNAME_IsCentrallyMaintained = "IsCentrallyMaintained";
    /**
     * Column name IsMilestone
     */
    String COLUMNNAME_IsMilestone = "IsMilestone";
    /**
     * Column name IsSubcontracting
     */
    String COLUMNNAME_IsSubcontracting = "IsSubcontracting";
    /**
     * Column name JoinElement
     */
    String COLUMNNAME_JoinElement = "JoinElement";
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
     * Column name PP_Order_ID
     */
    String COLUMNNAME_PP_Order_ID = "PP_Order_ID";
    /**
     * Column name PP_Order_Node_ID
     */
    String COLUMNNAME_PP_Order_Node_ID = "PP_Order_Node_ID";
    /**
     * Column name PP_Order_Node_UU
     */
    String COLUMNNAME_PP_Order_Node_UU = "PP_Order_Node_UU";
    /**
     * Column name PP_Order_Workflow_ID
     */
    String COLUMNNAME_PP_Order_Workflow_ID = "PP_Order_Workflow_ID";
    /**
     * Column name Priority
     */
    String COLUMNNAME_Priority = "Priority";
    /**
     * Column name QtyDelivered
     */
    String COLUMNNAME_QtyDelivered = "QtyDelivered";
    /**
     * Column name QtyReject
     */
    String COLUMNNAME_QtyReject = "QtyReject";
    /**
     * Column name QtyRequiered
     */
    String COLUMNNAME_QtyRequiered = "QtyRequiered";
    /**
     * Column name QtyScrap
     */
    String COLUMNNAME_QtyScrap = "QtyScrap";
    /**
     * Column name QueuingTime
     */
    String COLUMNNAME_QueuingTime = "QueuingTime";
    /**
     * Column name SetupTime
     */
    String COLUMNNAME_SetupTime = "SetupTime";
    /**
     * Column name SetupTimeReal
     */
    String COLUMNNAME_SetupTimeReal = "SetupTimeReal";
    /**
     * Column name SetupTimeRequiered
     */
    String COLUMNNAME_SetupTimeRequiered = "SetupTimeRequiered";
    /**
     * Column name SplitElement
     */
    String COLUMNNAME_SplitElement = "SplitElement";
    /**
     * Column name S_Resource_ID
     */
    String COLUMNNAME_S_Resource_ID = "S_Resource_ID";
    /**
     * Column name StartMode
     */
    String COLUMNNAME_StartMode = "StartMode";
    /**
     * Column name SubflowExecution
     */
    String COLUMNNAME_SubflowExecution = "SubflowExecution";
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
     * Column name WaitingTime
     */
    String COLUMNNAME_WaitingTime = "WaitingTime";
    /**
     * Column name Workflow_ID
     */
    String COLUMNNAME_Workflow_ID = "Workflow_ID";
    /**
     * Column name WorkingTime
     */
    String COLUMNNAME_WorkingTime = "WorkingTime";
    /**
     * Column name XPosition
     */
    String COLUMNNAME_XPosition = "XPosition";
    /**
     * Column name Yield
     */
    String COLUMNNAME_Yield = "Yield";
    /**
     * Column name YPosition
     */
    String COLUMNNAME_YPosition = "YPosition";

    /**
     * Get Action. Indicates the Action to be performed
     */
    String getAction();

    /**
     * Set Action. Indicates the Action to be performed
     */
    void setAction(String Action);

    /**
     * Get Column. Column in the table
     */
    int getTableColumnId();

    /**
     * Set Column. Column in the table
     */
    void setTableColumnId(int AD_Column_ID);

    org.compiere.model.I_AD_Column getAD_Column() throws RuntimeException;


    /**
     * Get Image. Image or Icon
     */
    int getAD_ImageId();

    /**
     * Set Image. Image or Icon
     */
    void setAD_ImageId(int AD_Image_ID);

    org.compiere.model.I_AD_Image getAD_Image() throws RuntimeException;

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int AD_Org_ID);

    /**
     * Get Process. Process or Report
     */
    int getProcessId();

    /**
     * Set Process. Process or Report
     */
    void setProcessId(int AD_Process_ID);

    org.compiere.model.I_AD_Process getProcess() throws RuntimeException;

    /**
     * Get OS Task. Operation System Task
     */
    int getTaskId();

    /**
     * Set OS Task. Operation System Task
     */
    void setTaskId(int AD_Task_ID);

    org.compiere.model.I_AD_Task getTask() throws RuntimeException;

    /**
     * Get Workflow Block. Workflow Transaction Execution Block
     */
    int getWorkflowBlockId();

    /**
     * Set Workflow Block. Workflow Transaction Execution Block
     */
    void setWorkflowBlockId(int AD_WF_Block_ID);

    org.compiere.model.I_AD_WF_Block getWorkflowBlock() throws RuntimeException;

    /**
     * Get Node. Workflow Node (activity), step or process
     */
    int getWorkflowNodeId();

    /**
     * Set Node. Workflow Node (activity), step or process
     */
    void setWorkflowNodeId(int AD_WF_Node_ID);

    org.compiere.model.I_AD_WF_Node getWorkflowNode() throws RuntimeException;

    /**
     * Get Workflow Responsible. Responsible for Workflow Execution
     */
    int getWorkflowResponsibleId();

    /**
     * Set Workflow Responsible. Responsible for Workflow Execution
     */
    void setWorkflowResponsibleId(int AD_WF_Responsible_ID);

    org.compiere.model.I_AD_WF_Responsible getWorkflowResponsible() throws RuntimeException;

    /**
     * Get Workflow. Workflow or combination of tasks
     */
    int getAD_WorkflowId();

    /**
     * Set Workflow. Workflow or combination of tasks
     */
    void setAD_WorkflowId(int AD_Workflow_ID);

    org.compiere.model.I_AD_Workflow getAD_Workflow() throws RuntimeException;

    /**
     * Get Attribute Name. Name of the Attribute
     */
    String getAttributeName();

    /**
     * Set Attribute Name. Name of the Attribute
     */
    void setAttributeName(String AttributeName);

    /**
     * Get Attribute Value. Value of the Attribute
     */
    String getAttributeValue();

    /**
     * Set Attribute Value. Value of the Attribute
     */
    void setAttributeValue(String AttributeValue);

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getBusinessPartnerId();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setBusinessPartnerId(int C_BPartner_ID);

    org.compiere.model.I_C_BPartner getBPartner() throws RuntimeException;

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
     * Get Finish Date. Finish or (planned) completion date
     */
    Timestamp getDateFinish();

    /**
     * Set Finish Date. Finish or (planned) completion date
     */
    void setDateFinish(Timestamp DateFinish);

    /**
     * Get Date Finish Schedule. Scheduled Finish date for this Order
     */
    Timestamp getDateFinishSchedule();

    /**
     * Set Date Finish Schedule. Scheduled Finish date for this Order
     */
    void setDateFinishSchedule(Timestamp DateFinishSchedule);

    /**
     * Get Date Start. Date Start for this Order
     */
    Timestamp getDateStart();

    /**
     * Set Date Start. Date Start for this Order
     */
    void setDateStart(Timestamp DateStart);

    /**
     * Get Date Start Schedule. Scheduled start date for this Order
     */
    Timestamp getDateStartSchedule();

    /**
     * Set Date Start Schedule. Scheduled start date for this Order
     */
    void setDateStartSchedule(Timestamp DateStartSchedule);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Document Action. The targeted status of the document
     */
    String getDocAction();

    /**
     * Set Document Action. The targeted status of the document
     */
    void setDocAction(String DocAction);

    /**
     * Get Document Status. The current status of the document
     */
    String getDocStatus();

    /**
     * Set Document Status. The current status of the document
     */
    void setDocStatus(String DocStatus);

    /**
     * Get Duration. Normal Duration in Duration Unit
     */
    int getDuration();

    /**
     * Set Duration. Normal Duration in Duration Unit
     */
    void setDuration(int Duration);

    /**
     * Get Duration Real
     */
    int getDurationReal();

    /**
     * Set Duration Real
     */
    void setDurationReal(int DurationReal);

    /**
     * Get Duration Requiered
     */
    int getDurationRequiered();

    /**
     * Set Duration Requiered
     */
    void setDurationRequiered(int DurationRequiered);

    /**
     * Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    String getEntityType();

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    void setEntityType(String EntityType);

    /**
     * Get Finish Mode. Workflow Activity Finish Mode
     */
    String getFinishMode();

    /**
     * Set Finish Mode. Workflow Activity Finish Mode
     */
    void setFinishMode(String FinishMode);

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
     * Set Centrally maintained. Information maintained in System Element table
     */
    void setIsCentrallyMaintained(boolean IsCentrallyMaintained);

    /**
     * Get Centrally maintained. Information maintained in System Element table
     */
    boolean isCentrallyMaintained();

    /**
     * Set Is Milestone
     */
    void setIsMilestone(boolean IsMilestone);

    /**
     * Get Is Milestone
     */
    boolean isMilestone();

    /**
     * Set Is Subcontracting
     */
    void setIsSubcontracting(boolean IsSubcontracting);

    /**
     * Get Is Subcontracting
     */
    boolean isSubcontracting();

    /**
     * Get Join Element. Semantics for multiple incoming Transitions
     */
    String getJoinElement();

    /**
     * Set Join Element. Semantics for multiple incoming Transitions
     */
    void setJoinElement(String JoinElement);

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
    int getOverlapUnits();

    /**
     * Set Overlap Units. Overlap Units are number of units that must be completed before they are
     * moved the next activity
     */
    void setOverlapUnits(int OverlapUnits);

    /**
     * Get Manufacturing Order. Manufacturing Order
     */
    int getPP_OrderId();

    /**
     * Set Manufacturing Order. Manufacturing Order
     */
    void setPP_OrderId(int PP_Order_ID);

    org.eevolution.model.I_PP_Order getPP_Order() throws RuntimeException;

    /**
     * Get Manufacturing Order Activity. Workflow Node (activity), step or process
     */
    int getPP_Order_NodeId();

    /**
     * Set Manufacturing Order Activity. Workflow Node (activity), step or process
     */
    void setPP_Order_NodeId(int PP_Order_Node_ID);

    /**
     * Get PP_Order_Node_UU
     */
    String getPP_Order_Node_UU();

    /**
     * Set PP_Order_Node_UU
     */
    void setPP_Order_Node_UU(String PP_Order_Node_UU);

    /**
     * Get Manufacturing Order Workflow
     */
    int getPP_Order_WorkflowId();

    /**
     * Set Manufacturing Order Workflow
     */
    void setPP_Order_WorkflowId(int PP_Order_Workflow_ID);

    org.eevolution.model.I_PP_Order_Workflow getPP_Order_Workflow() throws RuntimeException;

    /**
     * Get Priority. Indicates if this request is of a high, medium or low priority.
     */
    int getPriority();

    /**
     * Set Priority. Indicates if this request is of a high, medium or low priority.
     */
    void setPriority(int Priority);

    /**
     * Get Delivered Quantity. Delivered Quantity
     */
    BigDecimal getQtyDelivered();

    /**
     * Set Delivered Quantity. Delivered Quantity
     */
    void setQtyDelivered(BigDecimal QtyDelivered);

    /**
     * Get Qty Reject
     */
    BigDecimal getQtyReject();

    /**
     * Set Qty Reject
     */
    void setQtyReject(BigDecimal QtyReject);

    /**
     * Get Qty Requiered
     */
    BigDecimal getQtyRequiered();

    /**
     * Set Qty Requiered
     */
    void setQtyRequiered(BigDecimal QtyRequiered);

    /**
     * Get Scrap %. Scrap % Quantity for this componet
     */
    BigDecimal getQtyScrap();

    /**
     * Set Scrap %. Scrap % Quantity for this componet
     */
    void setQtyScrap(BigDecimal QtyScrap);

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
     * Get Setup Time Real
     */
    int getSetupTimeReal();

    /**
     * Set Setup Time Real
     */
    void setSetupTimeReal(int SetupTimeReal);

    /**
     * Get Setup Time Requiered
     */
    int getSetupTimeRequiered();

    /**
     * Set Setup Time Requiered
     */
    void setSetupTimeRequiered(int SetupTimeRequiered);

    /**
     * Get Split Element. Semantics for multiple outgoing Transitions
     */
    String getSplitElement();

    /**
     * Set Split Element. Semantics for multiple outgoing Transitions
     */
    void setSplitElement(String SplitElement);

    /**
     * Get Resource. Resource
     */
    int getResourceID();

    /**
     * Set Resource. Resource
     */
    void setResourceID(int S_Resource_ID);

    org.compiere.model.I_S_Resource getS_Resource() throws RuntimeException;

    /**
     * Get Start Mode. Workflow Activity Start Mode
     */
    String getStartMode();

    /**
     * Set Start Mode. Workflow Activity Start Mode
     */
    void setStartMode(String StartMode);

    /**
     * Get Subflow Execution. Mode how the sub-workflow is executed
     */
    String getSubflowExecution();

    /**
     * Set Subflow Execution. Mode how the sub-workflow is executed
     */
    void setSubflowExecution(String SubflowExecution);

    /**
     * Get Units by Cycles. The Units by Cycles are defined for process type Flow Repetitive Dedicated
     * and indicated the product to be manufactured on a production line for duration unit.
     */
    int getUnitsCycles();

    /**
     * Set Units by Cycles. The Units by Cycles are defined for process type Flow Repetitive Dedicated
     * and indicated the product to be manufactured on a production line for duration unit.
     */
    void setUnitsCycles(int UnitsCycles);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

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
     * Get Waiting Time. Workflow Simulation Waiting time
     */
    int getWaitingTime();

    /**
     * Set Waiting Time. Workflow Simulation Waiting time
     */
    void setWaitingTime(int WaitingTime);

    /**
     * Get Workflow. Workflow or tasks
     */
    int getWorkflowId();

    /**
     * Set Workflow. Workflow or tasks
     */
    void setWorkflowId(int Workflow_ID);

    org.compiere.model.I_AD_Workflow getWorkflow() throws RuntimeException;

    /**
     * Get Working Time. Workflow Simulation Execution Time
     */
    int getWorkingTime();

    /**
     * Set Working Time. Workflow Simulation Execution Time
     */
    void setWorkingTime(int WorkingTime);

    /**
     * Get X Position. Absolute X (horizontal) position in 1/72 of an inch
     */
    int getXPosition();

    /**
     * Set X Position. Absolute X (horizontal) position in 1/72 of an inch
     */
    void setXPosition(int XPosition);

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

    /**
     * Get Y Position. Absolute Y (vertical) position in 1/72 of an inch
     */
    int getYPosition();

    /**
     * Set Y Position. Absolute Y (vertical) position in 1/72 of an inch
     */
    void setYPosition(int YPosition);
}
