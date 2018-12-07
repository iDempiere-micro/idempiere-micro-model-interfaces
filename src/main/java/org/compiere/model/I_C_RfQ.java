package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_RfQ
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_RfQ {

    /**
     * TableName=C_RfQ
     */
    String Table_Name = "C_RfQ";

    /**
     * AD_Table_ID=677
     */
    int Table_ID = 677;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_BPartner_Location_ID
     */
    String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name CopyLines
     */
    String COLUMNNAME_CopyLines = "CopyLines";
    /**
     * Column name C_Order_ID
     */
    String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name CreatePO
     */
    String COLUMNNAME_CreatePO = "CreatePO";
    /**
     * Column name CreateSO
     */
    String COLUMNNAME_CreateSO = "CreateSO";
    /**
     * Column name C_RfQ_ID
     */
    String COLUMNNAME_C_RfQ_ID = "C_RfQ_ID";
    /**
     * Column name C_RfQ_Topic_ID
     */
    String COLUMNNAME_C_RfQ_Topic_ID = "C_RfQ_Topic_ID";
    /**
     * Column name C_RfQ_UU
     */
    String COLUMNNAME_C_RfQ_UU = "C_RfQ_UU";
    /**
     * Column name DateResponse
     */
    String COLUMNNAME_DateResponse = "DateResponse";
    /**
     * Column name DateWorkComplete
     */
    String COLUMNNAME_DateWorkComplete = "DateWorkComplete";
    /**
     * Column name DateWorkStart
     */
    String COLUMNNAME_DateWorkStart = "DateWorkStart";
    /**
     * Column name DeliveryDays
     */
    String COLUMNNAME_DeliveryDays = "DeliveryDays";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsInvitedVendorsOnly
     */
    String COLUMNNAME_IsInvitedVendorsOnly = "IsInvitedVendorsOnly";
    /**
     * Column name IsQuoteAllQty
     */
    String COLUMNNAME_IsQuoteAllQty = "IsQuoteAllQty";
    /**
     * Column name IsQuoteTotalAmt
     */
    String COLUMNNAME_IsQuoteTotalAmt = "IsQuoteTotalAmt";
    /**
     * Column name IsRfQResponseAccepted
     */
    String COLUMNNAME_IsRfQResponseAccepted = "IsRfQResponseAccepted";
    /**
     * Column name IsSelfService
     */
    String COLUMNNAME_IsSelfService = "IsSelfService";
    /**
     * Column name Margin
     */
    String COLUMNNAME_Margin = "Margin";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name PublishRfQ
     */
    String COLUMNNAME_PublishRfQ = "PublishRfQ";
    /**
     * Column name QuoteType
     */
    String COLUMNNAME_QuoteType = "QuoteType";
    /**
     * Column name RankRfQ
     */
    String COLUMNNAME_RankRfQ = "RankRfQ";
    /**
     * Column name SalesRep_ID
     */
    String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
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
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setAD_User_ID(int AD_User_ID);

    I_AD_User getAD_User() throws RuntimeException;

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
     * Get Partner Location. Identifies the (ship to) address for this Business Partner
     */
    int getC_BPartner_Location_ID();

    /**
     * Set Partner Location. Identifies the (ship to) address for this Business Partner
     */
    void setC_BPartner_Location_ID(int C_BPartner_Location_ID);

    I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException;

    /**
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

    /**
     * Set Currency. The Currency for this record
     */
    void setC_Currency_ID(int C_Currency_ID);

    I_C_Currency getC_Currency() throws RuntimeException;

    /**
     * Get Copy Lines
     */
    String getCopyLines();

    /**
     * Set Copy Lines
     */
    void setCopyLines(String CopyLines);

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
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Create PO. Create Purchase Order
     */
    String getCreatePO();

    /**
     * Set Create PO. Create Purchase Order
     */
    void setCreatePO(String CreatePO);

    /**
     * Get Create SO
     */
    String getCreateSO();

    /**
     * Set Create SO
     */
    void setCreateSO(String CreateSO);

    /**
     * Get RfQ. Request for Quotation
     */
    int getC_RfQ_ID();

    /**
     * Set RfQ. Request for Quotation
     */
    void setC_RfQ_ID(int C_RfQ_ID);

    /**
     * Get RfQ Topic. Topic for Request for Quotations
     */
    int getC_RfQ_Topic_ID();

    /**
     * Set RfQ Topic. Topic for Request for Quotations
     */
    void setC_RfQ_Topic_ID(int C_RfQ_Topic_ID);

    I_C_RfQ_Topic getC_RfQ_Topic() throws RuntimeException;

    /**
     * Get C_RfQ_UU
     */
    String getC_RfQ_UU();

    /**
     * Set C_RfQ_UU
     */
    void setC_RfQ_UU(String C_RfQ_UU);

    /**
     * Get Response Date. Date of the Response
     */
    Timestamp getDateResponse();

    /**
     * Set Response Date. Date of the Response
     */
    void setDateResponse(Timestamp DateResponse);

    /**
     * Get Work Complete. Date when work is (planned to be) complete
     */
    Timestamp getDateWorkComplete();

    /**
     * Set Work Complete. Date when work is (planned to be) complete
     */
    void setDateWorkComplete(Timestamp DateWorkComplete);

    /**
     * Get Work Start. Date when work is (planned to be) started
     */
    Timestamp getDateWorkStart();

    /**
     * Set Work Start. Date when work is (planned to be) started
     */
    void setDateWorkStart(Timestamp DateWorkStart);

    /**
     * Get Delivery Days. Number of Days (planned) until Delivery
     */
    int getDeliveryDays();

    /**
     * Set Delivery Days. Number of Days (planned) until Delivery
     */
    void setDeliveryDays(int DeliveryDays);

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
     * Set Invited Vendors Only. Only invited vendors can respond to an RfQ
     */
    void setIsInvitedVendorsOnly(boolean IsInvitedVendorsOnly);

    /**
     * Get Invited Vendors Only. Only invited vendors can respond to an RfQ
     */
    boolean isInvitedVendorsOnly();

    /**
     * Set Quote All Quantities. Suppliers are requested to provide responses for all quantities
     */
    void setIsQuoteAllQty(boolean IsQuoteAllQty);

    /**
     * Get Quote All Quantities. Suppliers are requested to provide responses for all quantities
     */
    boolean isQuoteAllQty();

    /**
     * Set Quote Total Amt. The response can have just the total amount for the RfQ
     */
    void setIsQuoteTotalAmt(boolean IsQuoteTotalAmt);

    /**
     * Get Quote Total Amt. The response can have just the total amount for the RfQ
     */
    boolean isQuoteTotalAmt();

    /**
     * Set Responses Accepted. Are Responses to the Request for Quotation accepted
     */
    void setIsRfQResponseAccepted(boolean IsRfQResponseAccepted);

    /**
     * Get Responses Accepted. Are Responses to the Request for Quotation accepted
     */
    boolean isRfQResponseAccepted();

    /**
     * Set Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
     */
    void setIsSelfService(boolean IsSelfService);

    /**
     * Get Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
     */
    boolean isSelfService();

    /**
     * Get Margin %. Margin for a product as a percentage
     */
    BigDecimal getMargin();

    /**
     * Set Margin %. Margin for a product as a percentage
     */
    void setMargin(BigDecimal Margin);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Publish RfQ
     */
    String getPublishRfQ();

    /**
     * Set Publish RfQ
     */
    void setPublishRfQ(String PublishRfQ);

    /**
     * Get RfQ Type. Request for Quotation Type
     */
    String getQuoteType();

    /**
     * Set RfQ Type. Request for Quotation Type
     */
    void setQuoteType(String QuoteType);

    /**
     * Get Rank RfQ
     */
    String getRankRfQ();

    /**
     * Set Rank RfQ
     */
    void setRankRfQ(String RankRfQ);

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
