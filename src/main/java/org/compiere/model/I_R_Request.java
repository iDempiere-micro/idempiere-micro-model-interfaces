package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;
import org.idempiere.icommon.model.IPO;

/**
 * Generated Interface for R_Request
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_Request extends IPO {

    /**
     * TableName=R_Request
     */
    String Table_Name = "R_Request";

    /**
     * AD_Table_ID=417
     */
    int Table_ID = 417;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /**
     * Column name A_Asset_ID
     */
    String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Role_ID
     */
    String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name C_Activity_ID
     */
    String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_Campaign_ID
     */
    String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
    /**
     * Column name C_Invoice_ID
     */
    String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
    /**
     * Column name C_InvoiceRequest_ID
     */
    String COLUMNNAME_C_InvoiceRequest_ID = "C_InvoiceRequest_ID";
    /**
     * Column name CloseDate
     */
    String COLUMNNAME_CloseDate = "CloseDate";
    /**
     * Column name ConfidentialType
     */
    String COLUMNNAME_ConfidentialType = "ConfidentialType";
    /**
     * Column name ConfidentialTypeEntry
     */
    String COLUMNNAME_ConfidentialTypeEntry = "ConfidentialTypeEntry";
    /**
     * Column name C_Order_ID
     */
    String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name C_Payment_ID
     */
    String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DateCompletePlan
     */
    String COLUMNNAME_DateCompletePlan = "DateCompletePlan";
    /**
     * Column name DateLastAction
     */
    String COLUMNNAME_DateLastAction = "DateLastAction";
    /**
     * Column name DateLastAlert
     */
    String COLUMNNAME_DateLastAlert = "DateLastAlert";
    /**
     * Column name DateNextAction
     */
    String COLUMNNAME_DateNextAction = "DateNextAction";
    /**
     * Column name DateStartPlan
     */
    String COLUMNNAME_DateStartPlan = "DateStartPlan";
    /**
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name DueType
     */
    String COLUMNNAME_DueType = "DueType";
    /**
     * Column name EndTime
     */
    String COLUMNNAME_EndTime = "EndTime";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsEscalated
     */
    String COLUMNNAME_IsEscalated = "IsEscalated";
    /**
     * Column name IsInvoiced
     */
    String COLUMNNAME_IsInvoiced = "IsInvoiced";
    /**
     * Column name IsSelfService
     */
    String COLUMNNAME_IsSelfService = "IsSelfService";
    /**
     * Column name LastResult
     */
    String COLUMNNAME_LastResult = "LastResult";
    /**
     * Column name M_ChangeRequest_ID
     */
    String COLUMNNAME_M_ChangeRequest_ID = "M_ChangeRequest_ID";
    /**
     * Column name M_FixChangeNotice_ID
     */
    String COLUMNNAME_M_FixChangeNotice_ID = "M_FixChangeNotice_ID";
    /**
     * Column name M_InOut_ID
     */
    String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_ProductSpent_ID
     */
    String COLUMNNAME_M_ProductSpent_ID = "M_ProductSpent_ID";
    /**
     * Column name M_RMA_ID
     */
    String COLUMNNAME_M_RMA_ID = "M_RMA_ID";
    /**
     * Column name NextAction
     */
    String COLUMNNAME_NextAction = "NextAction";
    /**
     * Column name Priority
     */
    String COLUMNNAME_Priority = "Priority";
    /**
     * Column name PriorityUser
     */
    String COLUMNNAME_PriorityUser = "PriorityUser";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name QtyInvoiced
     */
    String COLUMNNAME_QtyInvoiced = "QtyInvoiced";
    /**
     * Column name QtyPlan
     */
    String COLUMNNAME_QtyPlan = "QtyPlan";
    /**
     * Column name QtySpent
     */
    String COLUMNNAME_QtySpent = "QtySpent";
    /**
     * Column name R_Category_ID
     */
    String COLUMNNAME_R_Category_ID = "R_Category_ID";
    /**
     * Column name Record_ID
     */
    String COLUMNNAME_Record_ID = "Record_ID";
    /**
     * Column name RequestAmt
     */
    String COLUMNNAME_RequestAmt = "RequestAmt";
    /**
     * Column name Result
     */
    String COLUMNNAME_Result = "Result";
    /**
     * Column name R_Group_ID
     */
    String COLUMNNAME_R_Group_ID = "R_Group_ID";
    /**
     * Column name R_MailText_ID
     */
    String COLUMNNAME_R_MailText_ID = "R_MailText_ID";
    /**
     * Column name R_Request_ID
     */
    String COLUMNNAME_R_Request_ID = "R_Request_ID";
    /**
     * Column name R_RequestRelated_ID
     */
    String COLUMNNAME_R_RequestRelated_ID = "R_RequestRelated_ID";
    /**
     * Column name R_RequestType_ID
     */
    String COLUMNNAME_R_RequestType_ID = "R_RequestType_ID";
    /**
     * Column name R_Request_UU
     */
    String COLUMNNAME_R_Request_UU = "R_Request_UU";
    /**
     * Column name R_Resolution_ID
     */
    String COLUMNNAME_R_Resolution_ID = "R_Resolution_ID";
    /**
     * Column name R_StandardResponse_ID
     */
    String COLUMNNAME_R_StandardResponse_ID = "R_StandardResponse_ID";
    /**
     * Column name R_Status_ID
     */
    String COLUMNNAME_R_Status_ID = "R_Status_ID";
    /**
     * Column name SalesRep_ID
     */
    String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
    /**
     * Column name StartDate
     */
    String COLUMNNAME_StartDate = "StartDate";
    /**
     * Column name StartTime
     */
    String COLUMNNAME_StartTime = "StartTime";
    /**
     * Column name Summary
     */
    String COLUMNNAME_Summary = "Summary";
    /**
     * Column name TaskStatus
     */
    String COLUMNNAME_TaskStatus = "TaskStatus";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Asset. Asset used internally or by customers
     */
    int getA_Asset_ID();

    /**
     * Set Asset. Asset used internally or by customers
     */
    void setA_Asset_ID(int A_Asset_ID);

    I_A_Asset getA_Asset() throws RuntimeException;

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Role. Responsibility Role
     */
    int getAD_Role_ID();

    /**
     * Set Role. Responsibility Role
     */
    void setAD_Role_ID(int AD_Role_ID);

    I_AD_Role getAD_Role() throws RuntimeException;

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
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setAD_User_ID(int AD_User_ID);

    I_AD_User getAD_User() throws RuntimeException;

    /**
     * Get Activity. Business Activity
     */
    int getC_Activity_ID();

    /**
     * Set Activity. Business Activity
     */
    void setC_Activity_ID(int C_Activity_ID);

    I_C_Activity getC_Activity() throws RuntimeException;

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setC_BPartner_ID(int C_BPartner_ID);

    I_C_BPartner getC_BPartner() throws RuntimeException;

    /**
     * Get Campaign. Marketing Campaign
     */
    int getC_Campaign_ID();

    /**
     * Set Campaign. Marketing Campaign
     */
    void setC_Campaign_ID(int C_Campaign_ID);

    I_C_Campaign getC_Campaign() throws RuntimeException;

    /**
     * Get Invoice. Invoice Identifier
     */
    int getC_Invoice_ID();

    /**
     * Set Invoice. Invoice Identifier
     */
    void setC_Invoice_ID(int C_Invoice_ID);

    I_C_Invoice getC_Invoice() throws RuntimeException;

    /**
     * Get Request Invoice. The generated invoice for this request
     */
    int getC_InvoiceRequest_ID();

    /**
     * Set Request Invoice. The generated invoice for this request
     */
    void setC_InvoiceRequest_ID(int C_InvoiceRequest_ID);

    I_C_Invoice getC_InvoiceRequest() throws RuntimeException;

    /**
     * Get Close Date. Close Date
     */
    Timestamp getCloseDate();

    /**
     * Set Close Date. Close Date
     */
    void setCloseDate(Timestamp CloseDate);

    /**
     * Get Confidentiality. Type of Confidentiality
     */
    String getConfidentialType();

    /**
     * Set Confidentiality. Type of Confidentiality
     */
    void setConfidentialType(String ConfidentialType);

    /**
     * Get Entry Confidentiality. Confidentiality of the individual entry
     */
    String getConfidentialTypeEntry();

    /**
     * Set Entry Confidentiality. Confidentiality of the individual entry
     */
    void setConfidentialTypeEntry(String ConfidentialTypeEntry);

    /**
     * Get Order. Order
     */
    int getC_Order_ID();

    /**
     * Set Order. Order
     */
    void setC_Order_ID(int C_Order_ID);

    I_C_Order getC_Order() throws RuntimeException;

    /**
     * Get Payment. Payment identifier
     */
    int getC_Payment_ID();

    /**
     * Set Payment. Payment identifier
     */
    void setC_Payment_ID(int C_Payment_ID);

    I_C_Payment getC_Payment() throws RuntimeException;

    /**
     * Get Project. Financial Project
     */
    int getC_Project_ID();

    /**
     * Set Project. Financial Project
     */
    void setC_Project_ID(int C_Project_ID);

    I_C_Project getC_Project() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Complete Plan. Planned Completion Date
     */
    Timestamp getDateCompletePlan();

    /**
     * Set Complete Plan. Planned Completion Date
     */
    void setDateCompletePlan(Timestamp DateCompletePlan);

    /**
     * Get Date last action. Date this request was last acted on
     */
    Timestamp getDateLastAction();

    /**
     * Set Date last action. Date this request was last acted on
     */
    void setDateLastAction(Timestamp DateLastAction);

    /**
     * Get Last Alert. Date when last alert were sent
     */
    Timestamp getDateLastAlert();

    /**
     * Set Last Alert. Date when last alert were sent
     */
    void setDateLastAlert(Timestamp DateLastAlert);

    /**
     * Get Date next action. Date that this request should be acted on
     */
    Timestamp getDateNextAction();

    /**
     * Set Date next action. Date that this request should be acted on
     */
    void setDateNextAction(Timestamp DateNextAction);

    /**
     * Get Start Plan. Planned Start Date
     */
    Timestamp getDateStartPlan();

    /**
     * Set Start Plan. Planned Start Date
     */
    void setDateStartPlan(Timestamp DateStartPlan);

    /**
     * Get Document No. Document sequence number of the document
     */
    String getDocumentNo();

    /**
     * Set Document No. Document sequence number of the document
     */
    void setDocumentNo(String DocumentNo);

    /**
     * Get Due type. Status of the next action for this Request
     */
    String getDueType();

    /**
     * Set Due type. Status of the next action for this Request
     */
    void setDueType(String DueType);

    /**
     * Get End Time. End of the time span
     */
    Timestamp getEndTime();

    /**
     * Set End Time. End of the time span
     */
    void setEndTime(Timestamp EndTime);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Escalated. This request has been escalated
     */
    void setIsEscalated(boolean IsEscalated);

    /**
     * Get Escalated. This request has been escalated
     */
    boolean isEscalated();

    /**
     * Set Invoiced. Is this invoiced?
     */
    void setIsInvoiced(boolean IsInvoiced);

    /**
     * Get Invoiced. Is this invoiced?
     */
    boolean isInvoiced();

    /**
     * Set Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
     */
    void setIsSelfService(boolean IsSelfService);

    /**
     * Get Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
     */
    boolean isSelfService();

    /**
     * Get Last Result. Result of last contact
     */
    String getLastResult();

    /**
     * Set Last Result. Result of last contact
     */
    void setLastResult(String LastResult);

    /**
     * Get Change Request. BOM (Engineering) Change Request
     */
    int getM_ChangeRequest_ID();

    /**
     * Set Change Request. BOM (Engineering) Change Request
     */
    void setM_ChangeRequest_ID(int M_ChangeRequest_ID);

    I_M_ChangeRequest getM_ChangeRequest() throws RuntimeException;

    /**
     * Get Fixed in. Fixed in Change Notice
     */
    int getM_FixChangeNotice_ID();

    /**
     * Set Fixed in. Fixed in Change Notice
     */
    void setM_FixChangeNotice_ID(int M_FixChangeNotice_ID);

    I_M_ChangeNotice getM_FixChangeNotice() throws RuntimeException;

    /**
     * Get Shipment/Receipt. Material Shipment Document
     */
    int getM_InOut_ID();

    /**
     * Set Shipment/Receipt. Material Shipment Document
     */
    void setM_InOut_ID(int M_InOut_ID);

    I_M_InOut getM_InOut() throws RuntimeException;

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    void setM_Product_ID(int M_Product_ID);

    I_M_Product getM_Product() throws RuntimeException;

    /**
     * Get Product Used. Product/Resource/Service used in Request
     */
    int getM_ProductSpent_ID();

    /**
     * Set Product Used. Product/Resource/Service used in Request
     */
    void setM_ProductSpent_ID(int M_ProductSpent_ID);

    I_M_Product getM_ProductSpent() throws RuntimeException;

    /**
     * Get RMA. Return Material Authorization
     */
    int getM_RMA_ID();

    /**
     * Set RMA. Return Material Authorization
     */
    void setM_RMA_ID(int M_RMA_ID);

    I_M_RMA getM_RMA() throws RuntimeException;

    /**
     * Get Next action. Next Action to be taken
     */
    String getNextAction();

    /**
     * Set Next action. Next Action to be taken
     */
    void setNextAction(String NextAction);

    /**
     * Get Priority. Indicates if this request is of a high, medium or low priority.
     */
    String getPriority();

    /**
     * Set Priority. Indicates if this request is of a high, medium or low priority.
     */
    void setPriority(String Priority);

    /**
     * Get User Importance. Priority of the issue for the User
     */
    String getPriorityUser();

    /**
     * Set User Importance. Priority of the issue for the User
     */
    void setPriorityUser(String PriorityUser);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Quantity Invoiced. Invoiced Quantity
     */
    BigDecimal getQtyInvoiced();

    /**
     * Set Quantity Invoiced. Invoiced Quantity
     */
    void setQtyInvoiced(BigDecimal QtyInvoiced);

    /**
     * Get Quantity Plan. Planned Quantity
     */
    BigDecimal getQtyPlan();

    /**
     * Set Quantity Plan. Planned Quantity
     */
    void setQtyPlan(BigDecimal QtyPlan);

    /**
     * Get Quantity Used. Quantity used for this event
     */
    BigDecimal getQtySpent();

    /**
     * Set Quantity Used. Quantity used for this event
     */
    void setQtySpent(BigDecimal QtySpent);

    /**
     * Get Category. Request Category
     */
    int getR_Category_ID();

    /**
     * Set Category. Request Category
     */
    void setR_Category_ID(int R_Category_ID);

    I_R_Category getR_Category() throws RuntimeException;

    /**
     * Get Record ID. Direct internal record ID
     */
    int getRecord_ID();

    /**
     * Set Record ID. Direct internal record ID
     */
    void setRecord_ID(int Record_ID);

    /**
     * Get Request Amount. Amount associated with this request
     */
    BigDecimal getRequestAmt();

    /**
     * Set Request Amount. Amount associated with this request
     */
    void setRequestAmt(BigDecimal RequestAmt);

    /**
     * Get Result. Result of the action taken
     */
    String getResult();

    /**
     * Set Result. Result of the action taken
     */
    void setResult(String Result);

    /**
     * Get Group. Request Group
     */
    int getR_Group_ID();

    /**
     * Set Group. Request Group
     */
    void setR_Group_ID(int R_Group_ID);

    I_R_Group getR_Group() throws RuntimeException;

    /**
     * Get Mail Template. Text templates for mailings
     */
    int getR_MailText_ID();

    /**
     * Set Mail Template. Text templates for mailings
     */
    void setR_MailText_ID(int R_MailText_ID);

    I_R_MailText getR_MailText() throws RuntimeException;

    /**
     * Get Request. Request from a Business Partner or Prospect
     */
    int getR_Request_ID();

    /**
     * Set Request. Request from a Business Partner or Prospect
     */
    void setR_Request_ID(int R_Request_ID);

    /**
     * Get Related Request. Related Request (Master Issue, ..)
     */
    int getR_RequestRelated_ID();

    /**
     * Set Related Request. Related Request (Master Issue, ..)
     */
    void setR_RequestRelated_ID(int R_RequestRelated_ID);

    I_R_Request getR_RequestRelated() throws RuntimeException;

    /**
     * Get Request Type. Type of request (e.g. Inquiry, Complaint, ..)
     */
    int getR_RequestType_ID();

    /**
     * Set Request Type. Type of request (e.g. Inquiry, Complaint, ..)
     */
    void setR_RequestType_ID(int R_RequestType_ID);

    I_R_RequestType getR_RequestType() throws RuntimeException;

    /**
     * Get R_Request_UU
     */
    String getR_Request_UU();

    /**
     * Set R_Request_UU
     */
    void setR_Request_UU(String R_Request_UU);

    /**
     * Get Resolution. Request Resolution
     */
    int getR_Resolution_ID();

    /**
     * Set Resolution. Request Resolution
     */
    void setR_Resolution_ID(int R_Resolution_ID);

    I_R_Resolution getR_Resolution() throws RuntimeException;

    /**
     * Get Standard Response. Request Standard Response
     */
    int getR_StandardResponse_ID();

    /**
     * Set Standard Response. Request Standard Response
     */
    void setR_StandardResponse_ID(int R_StandardResponse_ID);

    I_R_StandardResponse getR_StandardResponse() throws RuntimeException;

    /**
     * Get Status. Request Status
     */
    int getR_Status_ID();

    /**
     * Set Status. Request Status
     */
    void setR_Status_ID(int R_Status_ID);

    I_R_Status getR_Status() throws RuntimeException;

    /**
     * Get Sales Representative. Sales Representative or Company Agent
     */
    int getSalesRep_ID();

    /**
     * Set Sales Representative. Sales Representative or Company Agent
     */
    void setSalesRep_ID(int SalesRep_ID);

    I_AD_User getSalesRep() throws RuntimeException;

    /**
     * Get Start Date. First effective day (inclusive)
     */
    Timestamp getStartDate();

    /**
     * Set Start Date. First effective day (inclusive)
     */
    void setStartDate(Timestamp StartDate);

    /**
     * Get Start Time. Time started
     */
    Timestamp getStartTime();

    /**
     * Set Start Time. Time started
     */
    void setStartTime(Timestamp StartTime);

    /**
     * Get Summary. Textual summary of this request
     */
    String getSummary();

    /**
     * Set Summary. Textual summary of this request
     */
    void setSummary(String Summary);

    /**
     * Get Task Status. Status of the Task
     */
    String getTaskStatus();

    /**
     * Set Task Status. Status of the Task
     */
    void setTaskStatus(String TaskStatus);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
