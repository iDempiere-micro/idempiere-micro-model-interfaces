package org.eevolution.model;

import org.compiere.model.I_M_AttributeSetInstance;
import org.compiere.model.I_M_Locator;
import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for PP_Cost_Collector
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_PP_Cost_Collector {

    /**
     * TableName=PP_Cost_Collector
     */
    public static final String Table_Name = "PP_Cost_Collector";

    /**
     * AD_Table_ID=53035
     */
    public static final int Table_ID = 53035;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


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
     * Column name C_Activity_ID
     */
    public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
    /**
     * Column name C_Campaign_ID
     */
    public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
    /**
     * Column name C_DocType_ID
     */
    public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
    /**
     * Column name C_DocTypeTarget_ID
     */
    public static final String COLUMNNAME_C_DocTypeTarget_ID = "C_DocTypeTarget_ID";
    /**
     * Column name CostCollectorType
     */
    public static final String COLUMNNAME_CostCollectorType = "CostCollectorType";
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
     * Column name C_UOM_ID
     */
    public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
    /**
     * Column name DateAcct
     */
    public static final String COLUMNNAME_DateAcct = "DateAcct";
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
     * Column name DocumentNo
     */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name DurationReal
     */
    public static final String COLUMNNAME_DurationReal = "DurationReal";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsBatchTime
     */
    public static final String COLUMNNAME_IsBatchTime = "IsBatchTime";
    /**
     * Column name IsSubcontracting
     */
    public static final String COLUMNNAME_IsSubcontracting = "IsSubcontracting";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_Locator_ID
     */
    public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
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
     * Column name M_Warehouse_ID
     */
    public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
    /**
     * Column name Posted
     */
    public static final String COLUMNNAME_Posted = "Posted";
    /**
     * Column name PP_Cost_Collector_ID
     */
    public static final String COLUMNNAME_PP_Cost_Collector_ID = "PP_Cost_Collector_ID";
    /**
     * Column name PP_Cost_Collector_UU
     */
    public static final String COLUMNNAME_PP_Cost_Collector_UU = "PP_Cost_Collector_UU";
    /**
     * Column name PP_Order_BOMLine_ID
     */
    public static final String COLUMNNAME_PP_Order_BOMLine_ID = "PP_Order_BOMLine_ID";
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
     * Column name Processed
     */
    public static final String COLUMNNAME_Processed = "Processed";
    /**
     * Column name ProcessedOn
     */
    public static final String COLUMNNAME_ProcessedOn = "ProcessedOn";
    /**
     * Column name Processing
     */
    public static final String COLUMNNAME_Processing = "Processing";
    /**
     * Column name QtyReject
     */
    public static final String COLUMNNAME_QtyReject = "QtyReject";
    /**
     * Column name Reversal_ID
     */
    public static final String COLUMNNAME_Reversal_ID = "Reversal_ID";
    /**
     * Column name ScrappedQty
     */
    public static final String COLUMNNAME_ScrappedQty = "ScrappedQty";
    /**
     * Column name SetupTimeReal
     */
    public static final String COLUMNNAME_SetupTimeReal = "SetupTimeReal";
    /**
     * Column name S_Resource_ID
     */
    public static final String COLUMNNAME_S_Resource_ID = "S_Resource_ID";
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
     * Get Activity. Business Activity
     */
    public int getBusinessActivityId();

    /**
     * Set Activity. Business Activity
     */
    public void setBusinessActivityId(int C_Activity_ID);

    public org.compiere.model.I_C_Activity getC_Activity() throws RuntimeException;

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
     * Get Target Document Type. Target document type for conversing documents
     */
    public int getTargetDocumentTypeId();

    /**
     * Set Target Document Type. Target document type for conversing documents
     */
    public void setTargetDocumentTypeId(int C_DocTypeTarget_ID);

    public org.compiere.model.I_C_DocType getC_DocTypeTarget() throws RuntimeException;

    /**
     * Get Cost Collector Type. Transaction Type for Manufacturing Management
     */
    public String getCostCollectorType();

    /**
     * Set Cost Collector Type. Transaction Type for Manufacturing Management
     */
    public void setCostCollectorType(String CostCollectorType);

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
     * Get UOM. Unit of Measure
     */
    public int getUOMId();

    /**
     * Set UOM. Unit of Measure
     */
    public void setUOMId(int C_UOM_ID);

    public org.compiere.model.I_C_UOM getC_UOM() throws RuntimeException;

    /**
     * Get Account Date. Accounting Date
     */
    public Timestamp getDateAcct();

    /**
     * Set Account Date. Accounting Date
     */
    public void setDateAcct(Timestamp DateAcct);

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
     * Get Document No. Document sequence number of the document
     */
    public String getDocumentNo();

    /**
     * Set Document No. Document sequence number of the document
     */
    public void setDocumentNo(String DocumentNo);

    /**
     * Get Duration Real
     */
    public BigDecimal getDurationReal();

    /**
     * Set Duration Real
     */
    public void setDurationReal(BigDecimal DurationReal);

    /**
     * Set Active. The record is active in the system
     */
    public void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    public boolean isActive();

    /**
     * Set Is BatchTime
     */
    public void setIsBatchTime(boolean IsBatchTime);

    /**
     * Get Is BatchTime
     */
    public boolean isBatchTime();

    /**
     * Set Is Subcontracting
     */
    public void setIsSubcontracting(boolean IsSubcontracting);

    /**
     * Get Is Subcontracting
     */
    public boolean isSubcontracting();

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    public int getAttributeSetInstanceId();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    public void setAttributeSetInstanceId(int M_AttributeSetInstance_ID);

    public I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

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
     * Get Warehouse. Storage Warehouse and Service Point
     */
    public int getWarehouseId();

    /**
     * Set Warehouse. Storage Warehouse and Service Point
     */
    public void setWarehouseId(int M_Warehouse_ID);

    public org.compiere.model.I_M_Warehouse getM_Warehouse() throws RuntimeException;

    /**
     * Get Posted. Posting status
     */
    public boolean isPosted();

    /**
     * Set Posted. Posting status
     */
    public void setPosted(boolean Posted);

    /**
     * Get Manufacturing Cost Collector
     */
    public int getPP_Cost_Collector_ID();

    /**
     * Set Manufacturing Cost Collector
     */
    public void setPP_Cost_Collector_ID(int PP_Cost_Collector_ID);

    /**
     * Get PP_Cost_Collector_UU
     */
    public String getPP_Cost_Collector_UU();

    /**
     * Set PP_Cost_Collector_UU
     */
    public void setPP_Cost_Collector_UU(String PP_Cost_Collector_UU);

    /**
     * Get Manufacturing Order BOM Line
     */
    public int getPP_Order_BOMLine_ID();

    /**
     * Set Manufacturing Order BOM Line
     */
    public void setPP_Order_BOMLine_ID(int PP_Order_BOMLine_ID);

    public org.eevolution.model.I_PP_Order_BOMLine getPP_Order_BOMLine() throws RuntimeException;

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

    public org.eevolution.model.I_PP_Order_Workflow getPP_Order_Workflow() throws RuntimeException;

    /**
     * Get Processed. The document has been processed
     */
    public boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    public void setProcessed(boolean Processed);

    /**
     * Get Processed On. The date+time (expressed in decimal format) when the document has been
     * processed
     */
    public BigDecimal getProcessedOn();

    /**
     * Set Processed On. The date+time (expressed in decimal format) when the document has been
     * processed
     */
    public void setProcessedOn(BigDecimal ProcessedOn);

    /**
     * Get Process Now
     */
    public boolean isProcessing();

    /**
     * Set Process Now
     */
    public void setProcessing(boolean Processing);

    /**
     * Get Qty Reject
     */
    public BigDecimal getQtyReject();

    /**
     * Set Qty Reject
     */
    public void setQtyReject(BigDecimal QtyReject);

    /**
     * Get Reversal ID. ID of document reversal
     */
    public int getReversalId();

    /**
     * Set Reversal ID. ID of document reversal
     */
    public void setReversalId(int Reversal_ID);

    public org.eevolution.model.I_PP_Cost_Collector getReversal() throws RuntimeException;

    /**
     * Get Scrapped Quantity. The Quantity scrapped due to QA issues
     */
    public BigDecimal getScrappedQty();

    /**
     * Set Scrapped Quantity. The Quantity scrapped due to QA issues
     */
    public void setScrappedQty(BigDecimal ScrappedQty);

    /**
     * Get Setup Time Real
     */
    public BigDecimal getSetupTimeReal();

    /**
     * Set Setup Time Real
     */
    public void setSetupTimeReal(BigDecimal SetupTimeReal);

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
    public int getUser1Id();

    /**
     * Set User Element List 1. User defined list element #1
     */
    public void setUser1Id(int User1_ID);

    public org.compiere.model.I_AD_User getUser1() throws RuntimeException;

    /**
     * Get User Element List 2. User defined list element #2
     */
    public int getUser2Id();

    /**
     * Set User Element List 2. User defined list element #2
     */
    public void setUser2Id(int User2_ID);

    public org.compiere.model.I_AD_User getUser2() throws RuntimeException;
}
