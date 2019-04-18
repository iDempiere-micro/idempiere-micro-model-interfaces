package org.compiere.model;

import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;

/**
 * Generated Interface for R_RequestType
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_RequestType extends IPO {

    /**
     * TableName=R_RequestType
     */
    String Table_Name = "R_RequestType";

    /**
     * AD_Table_ID=529
     */
    int Table_ID = 529;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);


    /**
     * Column name AutoDueDateDays
     */
    String COLUMNNAME_AutoDueDateDays = "AutoDueDateDays";
    /**
     * Column name ConfidentialType
     */
    String COLUMNNAME_ConfidentialType = "ConfidentialType";
    /**
     * Column name DueDateTolerance
     */
    String COLUMNNAME_DueDateTolerance = "DueDateTolerance";
    /**
     * Column name IsAutoChangeRequest
     */
    String COLUMNNAME_IsAutoChangeRequest = "IsAutoChangeRequest";
    /**
     * Column name IsConfidentialInfo
     */
    String COLUMNNAME_IsConfidentialInfo = "IsConfidentialInfo";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name IsEMailWhenDue
     */
    String COLUMNNAME_IsEMailWhenDue = "IsEMailWhenDue";
    /**
     * Column name IsEMailWhenOverdue
     */
    String COLUMNNAME_IsEMailWhenOverdue = "IsEMailWhenOverdue";
    /**
     * Column name IsIndexed
     */
    String COLUMNNAME_IsIndexed = "IsIndexed";
    /**
     * Column name IsInvoiced
     */
    String COLUMNNAME_IsInvoiced = "IsInvoiced";
    /**
     * Column name IsSelfService
     */
    String COLUMNNAME_IsSelfService = "IsSelfService";
    /**
     * Column name R_RequestType_ID
     */
    String COLUMNNAME_R_RequestType_ID = "R_RequestType_ID";
    /**
     * Column name R_StatusCategory_ID
     */
    String COLUMNNAME_R_StatusCategory_ID = "R_StatusCategory_ID";

    /**
     * Get Auto Due Date Days. Automatic Due Date Days
     */
    int getAutoDueDateDays();

    /**
     * Set Auto Due Date Days. Automatic Due Date Days
     */
    void setAutoDueDateDays(int AutoDueDateDays);

    /**
     * Get Confidentiality. Type of Confidentiality
     */
    String getConfidentialType();

    /**
     * Set Confidentiality. Type of Confidentiality
     */
    void setConfidentialType(String ConfidentialType);

    /**
     * Get Due Date Tolerance. Tolerance in days between the Date Next Action and the date the request
     * is regarded as overdue
     */
    int getDueDateTolerance();

    /**
     * Set Due Date Tolerance. Tolerance in days between the Date Next Action and the date the request
     * is regarded as overdue
     */
    void setDueDateTolerance(int DueDateTolerance);

    /**
     * Set Create Change Request. Automatically create BOM (Engineering) Change Request
     */
    void setIsAutoChangeRequest(boolean IsAutoChangeRequest);

    /**
     * Set Confidential Info. Can enter confidential information
     */
    void setIsConfidentialInfo(boolean IsConfidentialInfo);

    /**
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    boolean isDefault();

    /**
     * Set EMail when Due. Send EMail when Request becomes due
     */
    void setIsEMailWhenDue(boolean IsEMailWhenDue);

    /**
     * Set EMail when Overdue. Send EMail when Request becomes overdue
     */
    void setIsEMailWhenOverdue(boolean IsEMailWhenOverdue);

    /**
     * Set Indexed. Index the document for the internal search engine
     */
    void setIsIndexed(boolean IsIndexed);

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
     * Get Request Type. Type of request (e.g. Inquiry, Complaint, ..)
     */
    int getRequestTypeId();

    /**
     * Get Status Category. Request Status Category
     */
    int getStatusCategoryId();

    /**
     * Set Status Category. Request Status Category
     */
    void setStatusCategoryId(int R_StatusCategory_ID);

}
