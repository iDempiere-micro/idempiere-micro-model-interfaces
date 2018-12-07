package org.eevolution.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.compiere.model.*;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PP_Order_Node
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_PP_Order_Node {

    /**
     * TableName=PP_Order_Node
     */
    public static final String Table_Name = "PP_Order_Node";

    /**
     * AD_Table_ID=53022
     */
    public static final int Table_ID = 53022;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name Action
     */
    public static final String COLUMNNAME_Action = "Action";
    /**
     * Column name AD_Column_ID
     */
    public static final String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
    /**
     * Column name AD_Form_ID
     */
    public static final String COLUMNNAME_AD_Form_ID = "AD_Form_ID";
    /**
     * Column name AD_Image_ID
     */
    public static final String COLUMNNAME_AD_Image_ID = "AD_Image_ID";
    /**
     * Column name AD_Org_ID
     */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Process_ID
     */
    public static final String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
    /**
     * Column name AD_Task_ID
     */
    public static final String COLUMNNAME_AD_Task_ID = "AD_Task_ID";
    /**
     * Column name AD_WF_Block_ID
     */
    public static final String COLUMNNAME_AD_WF_Block_ID = "AD_WF_Block_ID";
    /**
     * Column name AD_WF_Node_ID
     */
    public static final String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
    /**
     * Column name AD_WF_Responsible_ID
     */
    public static final String COLUMNNAME_AD_WF_Responsible_ID = "AD_WF_Responsible_ID";
    /**
     * Column name AD_Window_ID
     */
    public static final String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
    /**
     * Column name AD_Workflow_ID
     */
    public static final String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
    /**
     * Column name AttributeName
     */
    public static final String COLUMNNAME_AttributeName = "AttributeName";
    /**
     * Column name AttributeValue
     */
    public static final String COLUMNNAME_AttributeValue = "AttributeValue";
    /**
     * Column name C_BPartner_ID
     */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
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
     * Column name DateFinish
     */
    public static final String COLUMNNAME_DateFinish = "DateFinish";
    /**
     * Column name DateFinishSchedule
     */
    public static final String COLUMNNAME_DateFinishSchedule = "DateFinishSchedule";
    /**
     * Column name DateStart
     */
    public static final String COLUMNNAME_DateStart = "DateStart";
    /**
     * Column name DateStartSchedule
     */
    public static final String COLUMNNAME_DateStartSchedule = "DateStartSchedule";
    /**
     * Column name Description
     */
    public static final String COLUMNNAME_Description = "Description";
    /**
     * Column name DocAction
     */
    public static final String COLUMNNAME_DocAction = "DocAction";
    /**
     * Column name DocStatus
     */
    public static final String COLUMNNAME_DocStatus = "DocStatus";
    /**
     * Column name Duration
     */
    public static final String COLUMNNAME_Duration = "Duration";
    /**
     * Column name DurationReal
     */
    public static final String COLUMNNAME_DurationReal = "DurationReal";
    /**
     * Column name DurationRequiered
     */
    public static final String COLUMNNAME_DurationRequiered = "DurationRequiered";
    /**
     * Column name EntityType
     */
    public static final String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name FinishMode
     */
    public static final String COLUMNNAME_FinishMode = "FinishMode";
    /**
     * Column name Help
     */
    public static final String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsCentrallyMaintained
     */
    public static final String COLUMNNAME_IsCentrallyMaintained = "IsCentrallyMaintained";
    /**
     * Column name IsMilestone
     */
    public static final String COLUMNNAME_IsMilestone = "IsMilestone";
    /**
     * Column name IsSubcontracting
     */
    public static final String COLUMNNAME_IsSubcontracting = "IsSubcontracting";
    /**
     * Column name JoinElement
     */
    public static final String COLUMNNAME_JoinElement = "JoinElement";
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
     * Column name PP_Order_Node_UU
     */
    public static final String COLUMNNAME_PP_Order_Node_UU = "PP_Order_Node_UU";
    /**
     * Column name PP_Order_Workflow_ID
     */
    public static final String COLUMNNAME_PP_Order_Workflow_ID = "PP_Order_Workflow_ID";
    /**
     * Column name Priority
     */
    public static final String COLUMNNAME_Priority = "Priority";
    /**
     * Column name QtyDelivered
     */
    public static final String COLUMNNAME_QtyDelivered = "QtyDelivered";
    /**
     * Column name QtyReject
     */
    public static final String COLUMNNAME_QtyReject = "QtyReject";
    /**
     * Column name QtyRequiered
     */
    public static final String COLUMNNAME_QtyRequiered = "QtyRequiered";
    /**
     * Column name QtyScrap
     */
    public static final String COLUMNNAME_QtyScrap = "QtyScrap";
    /**
     * Column name QueuingTime
     */
    public static final String COLUMNNAME_QueuingTime = "QueuingTime";
    /**
     * Column name SetupTime
     */
    public static final String COLUMNNAME_SetupTime = "SetupTime";
    /**
     * Column name SetupTimeReal
     */
    public static final String COLUMNNAME_SetupTimeReal = "SetupTimeReal";
    /**
     * Column name SetupTimeRequiered
     */
    public static final String COLUMNNAME_SetupTimeRequiered = "SetupTimeRequiered";
    /**
     * Column name SplitElement
     */
    public static final String COLUMNNAME_SplitElement = "SplitElement";
    /**
     * Column name S_Resource_ID
     */
    public static final String COLUMNNAME_S_Resource_ID = "S_Resource_ID";
    /**
     * Column name StartMode
     */
    public static final String COLUMNNAME_StartMode = "StartMode";
    /**
     * Column name SubflowExecution
     */
    public static final String COLUMNNAME_SubflowExecution = "SubflowExecution";
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
     * Column name WaitingTime
     */
    public static final String COLUMNNAME_WaitingTime = "WaitingTime";
    /**
     * Column name Workflow_ID
     */
    public static final String COLUMNNAME_Workflow_ID = "Workflow_ID";
    /**
     * Column name WorkingTime
     */
    public static final String COLUMNNAME_WorkingTime = "WorkingTime";
    /**
     * Column name XPosition
     */
    public static final String COLUMNNAME_XPosition = "XPosition";
    /**
     * Column name Yield
     */
    public static final String COLUMNNAME_Yield = "Yield";
    /**
     * Column name YPosition
     */
    public static final String COLUMNNAME_YPosition = "YPosition";

    /**
     * Get Action. Indicates the Action to be performed
     */
    public String getAction();

    /**
     * Set Action. Indicates the Action to be performed
     */
    public void setAction(String Action);

    /**
     * Get Column. Column in the table
     */
    public int getAD_Column_ID();

    /**
     * Set Column. Column in the table
     */
    public void setAD_Column_ID(int AD_Column_ID);

    public org.compiere.model.I_AD_Column getAD_Column() throws RuntimeException;

    /**
     * Get Special Form. Special Form
     */
    public int getAD_Form_ID();

    /**
     * Set Special Form. Special Form
     */
    public void setAD_Form_ID(int AD_Form_ID);

    public org.compiere.model.I_AD_Form getAD_Form() throws RuntimeException;

    /**
     * Get Image. Image or Icon
     */
    public int getAD_Image_ID();

    /**
     * Set Image. Image or Icon
     */
    public void setAD_Image_ID(int AD_Image_ID);

    public org.compiere.model.I_AD_Image getAD_Image() throws RuntimeException;

    /**
     * Set Organization. Organizational entity within client
     */
    public void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    public int getOrgId();

    /**
     * Get Process. Process or Report
     */
    public int getAD_Process_ID();

    /**
     * Set Process. Process or Report
     */
    public void setAD_Process_ID(int AD_Process_ID);

    public org.compiere.model.I_AD_Process getAD_Process() throws RuntimeException;

    /**
     * Get OS Task. Operation System Task
     */
    public int getAD_Task_ID();

    /**
     * Set OS Task. Operation System Task
     */
    public void setAD_Task_ID(int AD_Task_ID);

    public org.compiere.model.I_AD_Task getAD_Task() throws RuntimeException;

    /**
     * Get Workflow Block. Workflow Transaction Execution Block
     */
    public int getAD_WF_Block_ID();

    /**
     * Set Workflow Block. Workflow Transaction Execution Block
     */
    public void setAD_WF_Block_ID(int AD_WF_Block_ID);

    public org.compiere.model.I_AD_WF_Block getAD_WF_Block() throws RuntimeException;

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
     * Get Window. Data entry or display window
     */
    public int getAD_Window_ID();

    /**
     * Set Window. Data entry or display window
     */
    public void setAD_Window_ID(int AD_Window_ID);

    public org.compiere.model.I_AD_Window getAD_Window() throws RuntimeException;

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
     * Get Attribute Name. Name of the Attribute
     */
    public String getAttributeName();

    /**
     * Set Attribute Name. Name of the Attribute
     */
    public void setAttributeName(String AttributeName);

    /**
     * Get Attribute Value. Value of the Attribute
     */
    public String getAttributeValue();

    /**
     * Set Attribute Value. Value of the Attribute
     */
    public void setAttributeValue(String AttributeValue);

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    public int getC_BPartner_ID();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    public void setC_BPartner_ID(int C_BPartner_ID);

    public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

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
     * Get Finish Date. Finish or (planned) completion date
     */
    public Timestamp getDateFinish();

    /**
     * Set Finish Date. Finish or (planned) completion date
     */
    public void setDateFinish(Timestamp DateFinish);

    /**
     * Get Date Finish Schedule. Scheduled Finish date for this Order
     */
    public Timestamp getDateFinishSchedule();

    /**
     * Set Date Finish Schedule. Scheduled Finish date for this Order
     */
    public void setDateFinishSchedule(Timestamp DateFinishSchedule);

    /**
     * Get Date Start. Date Start for this Order
     */
    public Timestamp getDateStart();

    /**
     * Set Date Start. Date Start for this Order
     */
    public void setDateStart(Timestamp DateStart);

    /**
     * Get Date Start Schedule. Scheduled start date for this Order
     */
    public Timestamp getDateStartSchedule();

    /**
     * Set Date Start Schedule. Scheduled start date for this Order
     */
    public void setDateStartSchedule(Timestamp DateStartSchedule);

    /**
     * Get Description. Optional short description of the record
     */
    public String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    public void setDescription(String Description);

    /**
     * Get Document Action. The targeted status of the document
     */
    public String getDocAction();

    /**
     * Set Document Action. The targeted status of the document
     */
    public void setDocAction(String DocAction);

    /**
     * Get Document Status. The current status of the document
     */
    public String getDocStatus();

    /**
     * Set Document Status. The current status of the document
     */
    public void setDocStatus(String DocStatus);

    /**
     * Get Duration. Normal Duration in Duration Unit
     */
    public int getDuration();

    /**
     * Set Duration. Normal Duration in Duration Unit
     */
    public void setDuration(int Duration);

    /**
     * Get Duration Real
     */
    public int getDurationReal();

    /**
     * Set Duration Real
     */
    public void setDurationReal(int DurationReal);

    /**
     * Get Duration Requiered
     */
    public int getDurationRequiered();

    /**
     * Set Duration Requiered
     */
    public void setDurationRequiered(int DurationRequiered);

    /**
     * Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    public String getEntityType();

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    public void setEntityType(String EntityType);

    /**
     * Get Finish Mode. Workflow Activity Finish Mode
     */
    public String getFinishMode();

    /**
     * Set Finish Mode. Workflow Activity Finish Mode
     */
    public void setFinishMode(String FinishMode);

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
     * Set Centrally maintained. Information maintained in System Element table
     */
    public void setIsCentrallyMaintained(boolean IsCentrallyMaintained);

    /**
     * Get Centrally maintained. Information maintained in System Element table
     */
    public boolean isCentrallyMaintained();

    /**
     * Set Is Milestone
     */
    public void setIsMilestone(boolean IsMilestone);

    /**
     * Get Is Milestone
     */
    public boolean isMilestone();

    /**
     * Set Is Subcontracting
     */
    public void setIsSubcontracting(boolean IsSubcontracting);

    /**
     * Get Is Subcontracting
     */
    public boolean isSubcontracting();

    /**
     * Get Join Element. Semantics for multiple incoming Transitions
     */
    public String getJoinElement();

    /**
     * Set Join Element. Semantics for multiple incoming Transitions
     */
    public void setJoinElement(String JoinElement);

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
    public int getOverlapUnits();

    /**
     * Set Overlap Units. Overlap Units are number of units that must be completed before they are
     * moved the next activity
     */
    public void setOverlapUnits(int OverlapUnits);

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

    /**
     * Get PP_Order_Node_UU
     */
    public String getPP_Order_Node_UU();

    /**
     * Set PP_Order_Node_UU
     */
    public void setPP_Order_Node_UU(String PP_Order_Node_UU);

    /**
     * Get Manufacturing Order Workflow
     */
    public int getPP_Order_Workflow_ID();

    /**
     * Set Manufacturing Order Workflow
     */
    public void setPP_Order_Workflow_ID(int PP_Order_Workflow_ID);

    public org.eevolution.model.I_PP_Order_Workflow getPP_Order_Workflow() throws RuntimeException;

    /**
     * Get Priority. Indicates if this request is of a high, medium or low priority.
     */
    public int getPriority();

    /**
     * Set Priority. Indicates if this request is of a high, medium or low priority.
     */
    public void setPriority(int Priority);

    /**
     * Get Delivered Quantity. Delivered Quantity
     */
    public BigDecimal getQtyDelivered();

    /**
     * Set Delivered Quantity. Delivered Quantity
     */
    public void setQtyDelivered(BigDecimal QtyDelivered);

    /**
     * Get Qty Reject
     */
    public BigDecimal getQtyReject();

    /**
     * Set Qty Reject
     */
    public void setQtyReject(BigDecimal QtyReject);

    /**
     * Get Qty Requiered
     */
    public BigDecimal getQtyRequiered();

    /**
     * Set Qty Requiered
     */
    public void setQtyRequiered(BigDecimal QtyRequiered);

    /**
     * Get Scrap %. Scrap % Quantity for this componet
     */
    public BigDecimal getQtyScrap();

    /**
     * Set Scrap %. Scrap % Quantity for this componet
     */
    public void setQtyScrap(BigDecimal QtyScrap);

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
     * Get Setup Time Real
     */
    public int getSetupTimeReal();

    /**
     * Set Setup Time Real
     */
    public void setSetupTimeReal(int SetupTimeReal);

    /**
     * Get Setup Time Requiered
     */
    public int getSetupTimeRequiered();

    /**
     * Set Setup Time Requiered
     */
    public void setSetupTimeRequiered(int SetupTimeRequiered);

    /**
     * Get Split Element. Semantics for multiple outgoing Transitions
     */
    public String getSplitElement();

    /**
     * Set Split Element. Semantics for multiple outgoing Transitions
     */
    public void setSplitElement(String SplitElement);

    /**
     * Get Resource. Resource
     */
    public int getS_Resource_ID();

    /**
     * Set Resource. Resource
     */
    public void setS_Resource_ID(int S_Resource_ID);

    public org.compiere.model.I_S_Resource getS_Resource() throws RuntimeException;

    /**
     * Get Start Mode. Workflow Activity Start Mode
     */
    public String getStartMode();

    /**
     * Set Start Mode. Workflow Activity Start Mode
     */
    public void setStartMode(String StartMode);

    /**
     * Get Subflow Execution. Mode how the sub-workflow is executed
     */
    public String getSubflowExecution();

    /**
     * Set Subflow Execution. Mode how the sub-workflow is executed
     */
    public void setSubflowExecution(String SubflowExecution);

    /**
     * Get Units by Cycles. The Units by Cycles are defined for process type Flow Repetitive Dedicated
     * and indicated the product to be manufactured on a production line for duration unit.
     */
    public int getUnitsCycles();

    /**
     * Set Units by Cycles. The Units by Cycles are defined for process type Flow Repetitive Dedicated
     * and indicated the product to be manufactured on a production line for duration unit.
     */
    public void setUnitsCycles(int UnitsCycles);

    /**
     * Get Updated. Date this record was updated
     */
    public Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    public int getUpdatedBy();

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
     * Get Waiting Time. Workflow Simulation Waiting time
     */
    public int getWaitingTime();

    /**
     * Set Waiting Time. Workflow Simulation Waiting time
     */
    public void setWaitingTime(int WaitingTime);

    /**
     * Get Workflow. Workflow or tasks
     */
    public int getWorkflow_ID();

    /**
     * Set Workflow. Workflow or tasks
     */
    public void setWorkflow_ID(int Workflow_ID);

    public org.compiere.model.I_AD_Workflow getWorkflow() throws RuntimeException;

    /**
     * Get Working Time. Workflow Simulation Execution Time
     */
    public int getWorkingTime();

    /**
     * Set Working Time. Workflow Simulation Execution Time
     */
    public void setWorkingTime(int WorkingTime);

    /**
     * Get X Position. Absolute X (horizontal) position in 1/72 of an inch
     */
    public int getXPosition();

    /**
     * Set X Position. Absolute X (horizontal) position in 1/72 of an inch
     */
    public void setXPosition(int XPosition);

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

    /**
     * Get Y Position. Absolute Y (vertical) position in 1/72 of an inch
     */
    public int getYPosition();

    /**
     * Set Y Position. Absolute Y (vertical) position in 1/72 of an inch
     */
    public void setYPosition(int YPosition);
}
