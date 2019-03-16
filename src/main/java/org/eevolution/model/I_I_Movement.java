package org.eevolution.model;

import org.compiere.model.I_M_Locator;
import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for I_Movement
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_I_Movement {

    /**
     * TableName=I_Movement
     */
    public static final String Table_Name = "I_Movement";

    /**
     * AD_Table_ID=53278
     */
    public static final int Table_ID = 53278;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name AD_Org_ID
     */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_OrgTrx_ID
     */
    public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
    /**
     * Column name AD_User_ID
     */
    public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name BPartnerValue
     */
    public static final String COLUMNNAME_BPartnerValue = "BPartnerValue";
    /**
     * Column name CampaignValue
     */
    public static final String COLUMNNAME_CampaignValue = "CampaignValue";
    /**
     * Column name C_BPartner_ID
     */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_Campaign_ID
     */
    public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
    /**
     * Column name C_DocType_ID
     */
    public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
    /**
     * Column name C_Project_ID
     */
    public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name Created
     */
    public static final String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DeliveryRule
     */
    public static final String COLUMNNAME_DeliveryRule = "DeliveryRule";
    /**
     * Column name DeliveryViaRule
     */
    public static final String COLUMNNAME_DeliveryViaRule = "DeliveryViaRule";
    /**
     * Column name DocTypeName
     */
    public static final String COLUMNNAME_DocTypeName = "DocTypeName";
    /**
     * Column name DocumentNo
     */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name FreightCostRule
     */
    public static final String COLUMNNAME_FreightCostRule = "FreightCostRule";
    /**
     * Column name I_ErrorMsg
     */
    public static final String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
    /**
     * Column name I_IsImported
     */
    public static final String COLUMNNAME_I_IsImported = "I_IsImported";
    /**
     * Column name I_Movement_ID
     */
    public static final String COLUMNNAME_I_Movement_ID = "I_Movement_ID";
    /**
     * Column name I_Movement_UU
     */
    public static final String COLUMNNAME_I_Movement_UU = "I_Movement_UU";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name LocatorToValue
     */
    public static final String COLUMNNAME_LocatorToValue = "LocatorToValue";
    /**
     * Column name LocatorValue
     */
    public static final String COLUMNNAME_LocatorValue = "LocatorValue";
    /**
     * Column name M_Locator_ID
     */
    public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
    /**
     * Column name M_LocatorTo_ID
     */
    public static final String COLUMNNAME_M_LocatorTo_ID = "M_LocatorTo_ID";
    /**
     * Column name M_Movement_ID
     */
    public static final String COLUMNNAME_M_Movement_ID = "M_Movement_ID";
    /**
     * Column name M_MovementLine_ID
     */
    public static final String COLUMNNAME_M_MovementLine_ID = "M_MovementLine_ID";
    /**
     * Column name MovementDate
     */
    public static final String COLUMNNAME_MovementDate = "MovementDate";
    /**
     * Column name MovementQty
     */
    public static final String COLUMNNAME_MovementQty = "MovementQty";
    /**
     * Column name M_Product_ID
     */
    public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_Shipper_ID
     */
    public static final String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
    /**
     * Column name OrgTrxValue
     */
    public static final String COLUMNNAME_OrgTrxValue = "OrgTrxValue";
    /**
     * Column name OrgValue
     */
    public static final String COLUMNNAME_OrgValue = "OrgValue";
    /**
     * Column name PriorityRule
     */
    public static final String COLUMNNAME_PriorityRule = "PriorityRule";
    /**
     * Column name Processed
     */
    public static final String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    public static final String COLUMNNAME_Processing = "Processing";
    /**
     * Column name ProductValue
     */
    public static final String COLUMNNAME_ProductValue = "ProductValue";
    /**
     * Column name ProjectValue
     */
    public static final String COLUMNNAME_ProjectValue = "ProjectValue";
    /**
     * Column name ShipperName
     */
    public static final String COLUMNNAME_ShipperName = "ShipperName";
    /**
     * Column name Updated
     */
    public static final String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name User1_ID
     */
    public static final String COLUMNNAME_User1_ID = "User1_ID";
    /**
     * Column name User2_ID
     */
    public static final String COLUMNNAME_User2_ID = "User2_ID";

    /**
     * Get Organization. Organizational entity within client
     */
    public int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    public void setOrgId(int AD_Org_ID);

    /**
     * Get Trx Organization. Performing or initiating organization
     */
    public int getTransactionOrganizationId();

    /**
     * Set Trx Organization. Performing or initiating organization
     */
    public void setTransactionOrganizationId(int AD_OrgTrx_ID);

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    public int getUserId();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    public void setUserId(int AD_User_ID);

    public org.compiere.model.I_AD_User getAD_User() throws RuntimeException;

    /**
     * Get Business Partner Key. Key of the Business Partner
     */
    public String getBPartnerValue();

    /**
     * Set Business Partner Key. Key of the Business Partner
     */
    public void setBPartnerValue(String BPartnerValue);

    /**
     * Get Campaign Key. Text key of the Campaign
     */
    public String getCampaignValue();

    /**
     * Set Campaign Key. Text key of the Campaign
     */
    public void setCampaignValue(String CampaignValue);

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    public int getBusinessPartnerId();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    public void setBusinessPartnerId(int C_BPartner_ID);

    public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

    /**
     * Get Campaign. Marketing Campaign
     */
    public int getCampaignId();

    /**
     * Set Campaign. Marketing Campaign
     */
    public void setCampaignId(int C_Campaign_ID);

    public org.compiere.model.I_C_Campaign getC_Campaign() throws RuntimeException;

    /**
     * Get Document Type. Document type or rules
     */
    public int getDocumentTypeId();

    /**
     * Set Document Type. Document type or rules
     */
    public void setDocumentTypeId(int C_DocType_ID);

    public org.compiere.model.I_C_DocType getDocumentType() throws RuntimeException;

    /**
     * Get Project. Financial Project
     */
    public int getProjectId();

    /**
     * Set Project. Financial Project
     */
    public void setProjectId(int C_Project_ID);

    public org.compiere.model.I_C_Project getProject() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    public Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    public int getCreatedBy();

    /**
     * Get Delivery Rule. Defines the timing of Delivery
     */
    public String getDeliveryRule();

    /**
     * Set Delivery Rule. Defines the timing of Delivery
     */
    public void setDeliveryRule(String DeliveryRule);

    /**
     * Get Delivery Via. How the order will be delivered
     */
    public String getDeliveryViaRule();

    /**
     * Set Delivery Via. How the order will be delivered
     */
    public void setDeliveryViaRule(String DeliveryViaRule);

    /**
     * Get Document Type Name. Name of the Document Type
     */
    public String getDocTypeName();

    /**
     * Set Document Type Name. Name of the Document Type
     */
    public void setDocTypeName(String DocTypeName);

    /**
     * Get Document No. Document sequence number of the document
     */
    public String getDocumentNo();

    /**
     * Set Document No. Document sequence number of the document
     */
    public void setDocumentNo(String DocumentNo);

    /**
     * Get Freight Cost Rule. Method for charging Freight
     */
    public String getFreightCostRule();

    /**
     * Set Freight Cost Rule. Method for charging Freight
     */
    public void setFreightCostRule(String FreightCostRule);

    /**
     * Get Import Error Message. Messages generated from import process
     */
    public String getI_ErrorMsg();

    /**
     * Set Import Error Message. Messages generated from import process
     */
    public void setImportErrorMsg(String I_ErrorMsg);

    /**
     * Get Imported. Has this import been processed
     */
    public boolean isI_IsImported();

    /**
     * Set Imported. Has this import been processed
     */
    public void setIsImported(boolean I_IsImported);

    /**
     * Get I_Movement_ID
     */
    public int getI_Movement_ID();

    /**
     * Set I_Movement_ID
     */
    public void setI_Movement_ID(int I_Movement_ID);

    /**
     * Get I_Movement_UU
     */
    public String getI_Movement_UU();

    /**
     * Set I_Movement_UU
     */
    public void setI_Movement_UU(String I_Movement_UU);

    /**
     * Set Active. The record is active in the system
     */
    public void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    public boolean isActive();

    /**
     * Get Locator To Key
     */
    public String getLocatorToValue();

    /**
     * Set Locator To Key
     */
    public void setLocatorToValue(String LocatorToValue);

    /**
     * Get Locator Key. Key of the Warehouse Locator
     */
    public String getLocatorValue();

    /**
     * Set Locator Key. Key of the Warehouse Locator
     */
    public void setLocatorValue(String LocatorValue);

    /**
     * Get Locator. Warehouse Locator
     */
    public int getLocatorId();

    /**
     * Set Locator. Warehouse Locator
     */
    public void setLocatorId(int M_Locator_ID);

    public I_M_Locator getLocator() throws RuntimeException;

    /**
     * Get Locator To. Location inventory is moved to
     */
    public int getLocatorTo_ID();

    /**
     * Set Locator To. Location inventory is moved to
     */
    public void setLocatorTo_ID(int M_LocatorTo_ID);

    public I_M_Locator getLocatorTo() throws RuntimeException;

    /**
     * Get Inventory Move. Movement of Inventory
     */
    public int getMovementId();

    /**
     * Set Inventory Move. Movement of Inventory
     */
    public void setMovementId(int M_Movement_ID);

    public org.compiere.model.I_M_Movement getM_Movement() throws RuntimeException;

    /**
     * Get Move Line. Inventory Move document Line
     */
    public int getMovementLineId();

    /**
     * Set Move Line. Inventory Move document Line
     */
    public void setM_MovementLine_ID(int M_MovementLine_ID);

    public org.compiere.model.I_M_MovementLine getM_MovementLine() throws RuntimeException;

    /**
     * Get Movement Date. Date a product was moved in or out of inventory
     */
    public Timestamp getMovementDate();

    /**
     * Set Movement Date. Date a product was moved in or out of inventory
     */
    public void setMovementDate(Timestamp MovementDate);

    /**
     * Get Movement Quantity. Quantity of a product moved.
     */
    public BigDecimal getMovementQty();

    /**
     * Set Movement Quantity. Quantity of a product moved.
     */
    public void setMovementQty(BigDecimal MovementQty);

    /**
     * Get Product. Product, Service, Item
     */
    public int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    public void setProductId(int M_Product_ID);

    public org.compiere.model.I_M_Product getProduct() throws RuntimeException;

    /**
     * Get Shipper. Method or manner of product delivery
     */
    public int getShipperId();

    /**
     * Set Shipper. Method or manner of product delivery
     */
    public void setShipperId(int M_Shipper_ID);

    public org.compiere.model.I_M_Shipper getM_Shipper() throws RuntimeException;

    /**
     * Get Trx Org Key. Key of the Transaction Organization
     */
    public String getOrgTrxValue();

    /**
     * Set Trx Org Key. Key of the Transaction Organization
     */
    public void setOrgTrxValue(String OrgTrxValue);

    /**
     * Get Org Key. Key of the Organization
     */
    public String getOrgValue();

    /**
     * Set Org Key. Key of the Organization
     */
    public void setOrgValue(String OrgValue);

    /**
     * Get Priority. Priority of a document
     */
    public String getPriorityRule();

    /**
     * Set Priority. Priority of a document
     */
    public void setPriorityRule(String PriorityRule);

    /**
     * Get Processed. The document has been processed
     */
    public boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    public void setProcessed(boolean Processed);

    /**
     * Get Process Now
     */
    public boolean isProcessing();

    /**
     * Set Process Now
     */
    public void setProcessing(boolean Processing);

    /**
     * Get Product Key. Key of the Product
     */
    public String getProductValue();

    /**
     * Set Product Key. Key of the Product
     */
    public void setProductValue(String ProductValue);

    /**
     * Get Project Key. Key of the Project
     */
    public String getProjectValue();

    /**
     * Set Project Key. Key of the Project
     */
    public void setProjectValue(String ProjectValue);

    /**
     * Get ShipperName
     */
    public String getShipperName();

    /**
     * Set ShipperName
     */
    public void setShipperName(String ShipperName);

    /**
     * Get Updated. Date this record was updated
     */
    public Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    public int getUpdatedBy();

    /**
     * Get User Element List 1. User defined list element #1
     */
    public String getUser1Id();

    /**
     * Set User Element List 1. User defined list element #1
     */
    public void setUser1Id(String User1_ID);

    /**
     * Get User Element List 2. User defined list element #2
     */
    public String getUser2Id();

    /**
     * Set User Element List 2. User defined list element #2
     */
    public void setUser2Id(String User2_ID);
}
