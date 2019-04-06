package org.compiere.model;

import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for R_Request
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_Request extends IPO {

    /**
     * AD_Table_ID=417
     */
    int Table_ID = 417;

    /**
     * TableName=R_Request
     */
    String Table_Name = "R_Request";

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);


    /**
     * Column name A_Asset_ID
     */
    String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
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
     * Column name DateLastAlert
     */
    String COLUMNNAME_DateLastAlert = "DateLastAlert";
    /**
     * Column name DateNextAction
     */
    String COLUMNNAME_DateNextAction = "DateNextAction";
    /**
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name DueType
     */
    String COLUMNNAME_DueType = "DueType";
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
     * Column name R_Category_ID
     */
    String COLUMNNAME_R_Category_ID = "R_Category_ID";
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
     * Column name Summary
     */
    String COLUMNNAME_Summary = "Summary";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getBusinessPartnerId();

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
     * Get Date next action. Date that this request should be acted on
     */
    Timestamp getDateNextAction();

    /**
     * Set Date next action. Date that this request should be acted on
     */
    void setDateNextAction(Timestamp DateNextAction);

    /**
     * Get Document No. Document sequence number of the document
     */
    String getDocumentNo();

    /**
     * Set Due type. Status of the next action for this Request
     */
    void setDueType(String DueType);

    /**
     * Set Escalated. This request has been escalated
     */
    void setIsEscalated(boolean IsEscalated);

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
     * Get Change Request. BOM (Engineering) Change Request
     */
    int getChangeRequestId();

    /**
     * Set Change Request. BOM (Engineering) Change Request
     */
    void setChangeRequestId(int M_ChangeRequest_ID);

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
     * Set Request Amount. Amount associated with this request
     */
    void setRequestAmt(BigDecimal RequestAmt);

    /**
     * Get Result. Result of the action taken
     */
    String getResult();

    /**
     * Get Group. Request Group
     */
    int getGroupId();

    /**
     * Get Request. Request from a Business Partner or Prospect
     */
    int getRequestId();

    /**
     * Get Request Type. Type of request (e.g. Inquiry, Complaint, ..)
     */
    int getRequestTypeId();

    /**
     * Set Request Type. Type of request (e.g. Inquiry, Complaint, ..)
     */
    void setRequestTypeId(int R_RequestType_ID);

    /**
     * Get Status. Request Status
     */
    int getStatusId();

    /**
     * Set Status. Request Status
     */
    void setStatusId(int R_Status_ID);

    /**
     * Get Sales Representative. Sales Representative or Company Agent
     */
    int getSalesRepresentativeId();

    /**
     * Set Sales Representative. Sales Representative or Company Agent
     */
    void setSalesRepresentativeId(int SalesRep_ID);

    /**
     * Get Start Date. First effective day (inclusive)
     */
    Timestamp getStartDate();

    /**
     * Set Start Date. First effective day (inclusive)
     */
    void setStartDate(Timestamp StartDate);

    /**
     * Get Summary. Textual summary of this request
     */
    String getSummary();

    /**
     * Set Summary. Textual summary of this request
     */
    void setSummary(String Summary);

}
