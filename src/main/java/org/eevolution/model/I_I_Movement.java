package org.eevolution.model;

import org.compiere.model.DocumentType;
import org.compiere.model.I_M_Locator;
import org.compiere.model.User;
import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for I_Movement
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_I_Movement {

    /**
     * TableName=I_Movement
     */
    String Table_Name = "I_Movement";

    /**
     * AD_Table_ID=53278
     */
    int Table_ID = 53278;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_OrgTrx_ID
     */
    String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name BPartnerValue
     */
    String COLUMNNAME_BPartnerValue = "BPartnerValue";
    /**
     * Column name CampaignValue
     */
    String COLUMNNAME_CampaignValue = "CampaignValue";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_Campaign_ID
     */
    String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
    /**
     * Column name C_DocType_ID
     */
    String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
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
     * Column name DeliveryRule
     */
    String COLUMNNAME_DeliveryRule = "DeliveryRule";
    /**
     * Column name DeliveryViaRule
     */
    String COLUMNNAME_DeliveryViaRule = "DeliveryViaRule";
    /**
     * Column name DocTypeName
     */
    String COLUMNNAME_DocTypeName = "DocTypeName";
    /**
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name FreightCostRule
     */
    String COLUMNNAME_FreightCostRule = "FreightCostRule";
    /**
     * Column name I_ErrorMsg
     */
    String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
    /**
     * Column name I_IsImported
     */
    String COLUMNNAME_I_IsImported = "I_IsImported";
    /**
     * Column name I_Movement_ID
     */
    String COLUMNNAME_I_Movement_ID = "I_Movement_ID";
    /**
     * Column name I_Movement_UU
     */
    String COLUMNNAME_I_Movement_UU = "I_Movement_UU";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name LocatorToValue
     */
    String COLUMNNAME_LocatorToValue = "LocatorToValue";
    /**
     * Column name LocatorValue
     */
    String COLUMNNAME_LocatorValue = "LocatorValue";
    /**
     * Column name M_Locator_ID
     */
    String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
    /**
     * Column name M_LocatorTo_ID
     */
    String COLUMNNAME_M_LocatorTo_ID = "M_LocatorTo_ID";
    /**
     * Column name M_Movement_ID
     */
    String COLUMNNAME_M_Movement_ID = "M_Movement_ID";
    /**
     * Column name M_MovementLine_ID
     */
    String COLUMNNAME_M_MovementLine_ID = "M_MovementLine_ID";
    /**
     * Column name MovementDate
     */
    String COLUMNNAME_MovementDate = "MovementDate";
    /**
     * Column name MovementQty
     */
    String COLUMNNAME_MovementQty = "MovementQty";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_Shipper_ID
     */
    String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
    /**
     * Column name OrgTrxValue
     */
    String COLUMNNAME_OrgTrxValue = "OrgTrxValue";
    /**
     * Column name OrgValue
     */
    String COLUMNNAME_OrgValue = "OrgValue";
    /**
     * Column name PriorityRule
     */
    String COLUMNNAME_PriorityRule = "PriorityRule";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name ProductValue
     */
    String COLUMNNAME_ProductValue = "ProductValue";
    /**
     * Column name ProjectValue
     */
    String COLUMNNAME_ProjectValue = "ProjectValue";
    /**
     * Column name ShipperName
     */
    String COLUMNNAME_ShipperName = "ShipperName";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name User1_ID
     */
    String COLUMNNAME_User1_ID = "User1_ID";
    /**
     * Column name User2_ID
     */
    String COLUMNNAME_User2_ID = "User2_ID";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int AD_Org_ID);

    /**
     * Get Trx Organization. Performing or initiating organization
     */
    int getTransactionOrganizationId();

    /**
     * Set Trx Organization. Performing or initiating organization
     */
    void setTransactionOrganizationId(int AD_OrgTrx_ID);

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getUserId();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setUserId(int AD_User_ID);

    User getUser() throws RuntimeException;

    /**
     * Get Business Partner Key. Key of the Business Partner
     */
    String getBPartnerValue();

    /**
     * Set Business Partner Key. Key of the Business Partner
     */
    void setBPartnerValue(String BPartnerValue);

    /**
     * Get Campaign Key. Text key of the Campaign
     */
    String getCampaignValue();

    /**
     * Set Campaign Key. Text key of the Campaign
     */
    void setCampaignValue(String CampaignValue);

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
     * Get Campaign. Marketing Campaign
     */
    int getCampaignId();

    /**
     * Set Campaign. Marketing Campaign
     */
    void setCampaignId(int C_Campaign_ID);

    org.compiere.model.I_C_Campaign getCampaign() throws RuntimeException;

    /**
     * Get Document Type. Document type or rules
     */
    int getDocumentTypeId();

    /**
     * Set Document Type. Document type or rules
     */
    void setDocumentTypeId(int C_DocType_ID);

    DocumentType getDocumentType() throws RuntimeException;

    /**
     * Get Project. Financial Project
     */
    int getProjectId();

    /**
     * Set Project. Financial Project
     */
    void setProjectId(int C_Project_ID);

    org.compiere.model.I_C_Project getProject() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Delivery Rule. Defines the timing of Delivery
     */
    String getDeliveryRule();

    /**
     * Set Delivery Rule. Defines the timing of Delivery
     */
    void setDeliveryRule(String DeliveryRule);

    /**
     * Get Delivery Via. How the order will be delivered
     */
    String getDeliveryViaRule();

    /**
     * Set Delivery Via. How the order will be delivered
     */
    void setDeliveryViaRule(String DeliveryViaRule);

    /**
     * Get Document Type Name. Name of the Document Type
     */
    String getDocTypeName();

    /**
     * Set Document Type Name. Name of the Document Type
     */
    void setDocTypeName(String DocTypeName);

    /**
     * Get Document No. Document sequence number of the document
     */
    String getDocumentNo();

    /**
     * Set Document No. Document sequence number of the document
     */
    void setDocumentNo(String DocumentNo);

    /**
     * Get Freight Cost Rule. Method for charging Freight
     */
    String getFreightCostRule();

    /**
     * Set Freight Cost Rule. Method for charging Freight
     */
    void setFreightCostRule(String FreightCostRule);

    /**
     * Get Import Error Message. Messages generated from import process
     */
    String getImportErrorMessage();

    /**
     * Set Import Error Message. Messages generated from import process
     */
    void setImportErrorMsg(String I_ErrorMsg);

    /**
     * Get Imported. Has this import been processed
     */
    boolean getIsImported();

    /**
     * Set Imported. Has this import been processed
     */
    void setIsImported(boolean I_IsImported);

    /**
     * Get I_Movement_ID
     */
    int getImportMovementId();

    /**
     * Set I_Movement_ID
     */
    void setImportMovementId(int I_Movement_ID);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Locator To Key
     */
    String getLocatorToValue();

    /**
     * Set Locator To Key
     */
    void setLocatorToValue(String LocatorToValue);

    /**
     * Get Locator Key. Key of the Warehouse Locator
     */
    String getLocatorValue();

    /**
     * Set Locator Key. Key of the Warehouse Locator
     */
    void setLocatorValue(String LocatorValue);

    /**
     * Get Locator. Warehouse Locator
     */
    int getLocatorId();

    /**
     * Set Locator. Warehouse Locator
     */
    void setLocatorId(int M_Locator_ID);

    I_M_Locator getLocator() throws RuntimeException;

    /**
     * Get Locator To. Location inventory is moved to
     */
    int getLocatorToId();

    /**
     * Set Locator To. Location inventory is moved to
     */
    void setLocatorToId(int M_LocatorTo_ID);

    I_M_Locator getLocatorTo() throws RuntimeException;

    /**
     * Get Inventory Move. Movement of Inventory
     */
    int getMovementId();

    /**
     * Set Inventory Move. Movement of Inventory
     */
    void setMovementId(int M_Movement_ID);

    org.compiere.model.I_M_Movement getMovement() throws RuntimeException;

    /**
     * Get Move Line. Inventory Move document Line
     */
    int getMovementLineId();

    /**
     * Set Move Line. Inventory Move document Line
     */
    void setMovementLineId(int M_MovementLine_ID);

    org.compiere.model.I_M_MovementLine getMovementLine() throws RuntimeException;

    /**
     * Get Movement Date. Date a product was moved in or out of inventory
     */
    Timestamp getMovementDate();

    /**
     * Set Movement Date. Date a product was moved in or out of inventory
     */
    void setMovementDate(Timestamp MovementDate);

    /**
     * Get Movement Quantity. Quantity of a product moved.
     */
    BigDecimal getMovementQty();

    /**
     * Set Movement Quantity. Quantity of a product moved.
     */
    void setMovementQty(BigDecimal MovementQty);

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

    org.compiere.model.I_M_Product getProduct() throws RuntimeException;

    /**
     * Get Shipper. Method or manner of product delivery
     */
    int getShipperId();

    /**
     * Set Shipper. Method or manner of product delivery
     */
    void setShipperId(int M_Shipper_ID);

    org.compiere.model.I_M_Shipper getShipper() throws RuntimeException;

    /**
     * Get Trx Org Key. Key of the Transaction Organization
     */
    String getOrgTrxValue();

    /**
     * Set Trx Org Key. Key of the Transaction Organization
     */
    void setOrgTrxValue(String OrgTrxValue);

    /**
     * Get Org Key. Key of the Organization
     */
    String getOrgValue();

    /**
     * Set Org Key. Key of the Organization
     */
    void setOrgValue(String OrgValue);

    /**
     * Get Priority. Priority of a document
     */
    String getPriorityRule();

    /**
     * Set Priority. Priority of a document
     */
    void setPriorityRule(String PriorityRule);

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
     * Get Product Key. Key of the Product
     */
    String getProductValue();

    /**
     * Set Product Key. Key of the Product
     */
    void setProductValue(String ProductValue);

    /**
     * Get Project Key. Key of the Project
     */
    String getProjectValue();

    /**
     * Set Project Key. Key of the Project
     */
    void setProjectValue(String ProjectValue);

    /**
     * Get ShipperName
     */
    String getShipperName();

    /**
     * Set ShipperName
     */
    void setShipperName(String ShipperName);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get User Element List 1. User defined list element #1
     */
    String getUser1Id();

    /**
     * Set User Element List 1. User defined list element #1
     */
    void setUser1Id(String User1_ID);

    /**
     * Get User Element List 2. User defined list element #2
     */
    String getUser2Id();

    /**
     * Set User Element List 2. User defined list element #2
     */
    void setUser2Id(String User2_ID);
}
