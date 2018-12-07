package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_BP_EDI
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BP_EDI {

    /**
     * TableName=C_BP_EDI
     */
    String Table_Name = "C_BP_EDI";

    /**
     * AD_Table_ID=366
     */
    int Table_ID = 366;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Sequence_ID
     */
    String COLUMNNAME_AD_Sequence_ID = "AD_Sequence_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_BP_EDI_ID
     */
    String COLUMNNAME_C_BP_EDI_ID = "C_BP_EDI_ID";
    /**
     * Column name C_BP_EDI_UU
     */
    String COLUMNNAME_C_BP_EDI_UU = "C_BP_EDI_UU";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name CustomerNo
     */
    String COLUMNNAME_CustomerNo = "CustomerNo";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name EDIType
     */
    String COLUMNNAME_EDIType = "EDIType";
    /**
     * Column name EMail_Error_To
     */
    String COLUMNNAME_EMail_Error_To = "EMail_Error_To";
    /**
     * Column name EMail_From
     */
    String COLUMNNAME_EMail_From = "EMail_From";
    /**
     * Column name EMail_From_Pwd
     */
    String COLUMNNAME_EMail_From_Pwd = "EMail_From_Pwd";
    /**
     * Column name EMail_From_Uid
     */
    String COLUMNNAME_EMail_From_Uid = "EMail_From_Uid";
    /**
     * Column name EMail_Info_To
     */
    String COLUMNNAME_EMail_Info_To = "EMail_Info_To";
    /**
     * Column name EMail_To
     */
    String COLUMNNAME_EMail_To = "EMail_To";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsAudited
     */
    String COLUMNNAME_IsAudited = "IsAudited";
    /**
     * Column name IsInfoSent
     */
    String COLUMNNAME_IsInfoSent = "IsInfoSent";
    /**
     * Column name M_Warehouse_ID
     */
    String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
    /**
     * Column name ReceiveInquiryReply
     */
    String COLUMNNAME_ReceiveInquiryReply = "ReceiveInquiryReply";
    /**
     * Column name ReceiveOrderReply
     */
    String COLUMNNAME_ReceiveOrderReply = "ReceiveOrderReply";
    /**
     * Column name SendInquiry
     */
    String COLUMNNAME_SendInquiry = "SendInquiry";
    /**
     * Column name SendOrder
     */
    String COLUMNNAME_SendOrder = "SendOrder";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Sequence. Document Sequence
     */
    int getAD_Sequence_ID();

    /**
     * Set Sequence. Document Sequence
     */
    void setAD_Sequence_ID(int AD_Sequence_ID);

    I_AD_Sequence getAD_Sequence() throws RuntimeException;

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
     * Get EDI Definition. Electronic Data Interchange
     */
    int getC_BP_EDI_ID();

    /**
     * Set EDI Definition. Electronic Data Interchange
     */
    void setC_BP_EDI_ID(int C_BP_EDI_ID);

    /**
     * Get C_BP_EDI_UU
     */
    String getC_BP_EDI_UU();

    /**
     * Set C_BP_EDI_UU
     */
    void setC_BP_EDI_UU(String C_BP_EDI_UU);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Customer No. EDI Identification Number
     */
    String getCustomerNo();

    /**
     * Set Customer No. EDI Identification Number
     */
    void setCustomerNo(String CustomerNo);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get EDI Type
     */
    String getEDIType();

    /**
     * Set EDI Type
     */
    void setEDIType(String EDIType);

    /**
     * Get Error EMail. Email address to send error messages to
     */
    String getEMail_Error_To();

    /**
     * Set Error EMail. Email address to send error messages to
     */
    void setEMail_Error_To(String EMail_Error_To);

    /**
     * Get From EMail. Full EMail address used to send requests - e.g. edi@organization.com
     */
    String getEMail_From();

    /**
     * Set From EMail. Full EMail address used to send requests - e.g. edi@organization.com
     */
    void setEMail_From(String EMail_From);

    /**
     * Get From EMail Password. Password of the sending EMail address
     */
    String getEMail_From_Pwd();

    /**
     * Set From EMail Password. Password of the sending EMail address
     */
    void setEMail_From_Pwd(String EMail_From_Pwd);

    /**
     * Get From EMail User ID. User ID of the sending EMail address (on default SMTP Host) - e.g. edi
     */
    String getEMail_From_Uid();

    /**
     * Set From EMail User ID. User ID of the sending EMail address (on default SMTP Host) - e.g. edi
     */
    void setEMail_From_Uid(String EMail_From_Uid);

    /**
     * Get Info EMail. EMail address to send informational messages and copies
     */
    String getEMail_Info_To();

    /**
     * Set Info EMail. EMail address to send informational messages and copies
     */
    void setEMail_Info_To(String EMail_Info_To);

    /**
     * Get To EMail. EMail address to send requests to - e.g. edi@manufacturer.com
     */
    String getEMail_To();

    /**
     * Set To EMail. EMail address to send requests to - e.g. edi@manufacturer.com
     */
    void setEMail_To(String EMail_To);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Activate Audit. Activate Audit Trail of what numbers are generated
     */
    void setIsAudited(boolean IsAudited);

    /**
     * Get Activate Audit. Activate Audit Trail of what numbers are generated
     */
    boolean isAudited();

    /**
     * Set Send Info. Send informational messages and copies
     */
    void setIsInfoSent(boolean IsInfoSent);

    /**
     * Get Send Info. Send informational messages and copies
     */
    boolean isInfoSent();

    /**
     * Get Warehouse. Storage Warehouse and Service Point
     */
    int getM_Warehouse_ID();

    /**
     * Set Warehouse. Storage Warehouse and Service Point
     */
    void setM_Warehouse_ID(int M_Warehouse_ID);

    I_M_Warehouse getM_Warehouse() throws RuntimeException;

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Received Inquiry Reply
     */
    boolean isReceiveInquiryReply();

    /**
     * Set Received Inquiry Reply
     */
    void setReceiveInquiryReply(boolean ReceiveInquiryReply);

    /**
     * Get Receive Order Reply
     */
    boolean isReceiveOrderReply();

    /**
     * Set Receive Order Reply
     */
    void setReceiveOrderReply(boolean ReceiveOrderReply);

    /**
     * Get Send Inquiry. Quantity Availability Inquiry
     */
    boolean isSendInquiry();

    /**
     * Set Send Inquiry. Quantity Availability Inquiry
     */
    void setSendInquiry(boolean SendInquiry);

    /**
     * Get Send Order
     */
    boolean isSendOrder();

    /**
     * Set Send Order
     */
    void setSendOrder(boolean SendOrder);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
