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

public interface I_PP_Cost_Collector {

    /**
     * TableName=PP_Cost_Collector
     */
    String Table_Name = "PP_Cost_Collector";

    /**
     * AD_Table_ID=53035
     */
    int Table_ID = 53035;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


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
     * Column name C_Activity_ID
     */
    String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
    /**
     * Column name C_Campaign_ID
     */
    String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
    /**
     * Column name C_DocType_ID
     */
    String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
    /**
     * Column name C_DocTypeTarget_ID
     */
    String COLUMNNAME_C_DocTypeTarget_ID = "C_DocTypeTarget_ID";
    /**
     * Column name CostCollectorType
     */
    String COLUMNNAME_CostCollectorType = "CostCollectorType";
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
     * Column name C_UOM_ID
     */
    String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
    /**
     * Column name DateAcct
     */
    String COLUMNNAME_DateAcct = "DateAcct";
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
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name DurationReal
     */
    String COLUMNNAME_DurationReal = "DurationReal";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsBatchTime
     */
    String COLUMNNAME_IsBatchTime = "IsBatchTime";
    /**
     * Column name IsSubcontracting
     */
    String COLUMNNAME_IsSubcontracting = "IsSubcontracting";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_Locator_ID
     */
    String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
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
     * Column name M_Warehouse_ID
     */
    String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
    /**
     * Column name Posted
     */
    String COLUMNNAME_Posted = "Posted";
    /**
     * Column name PP_Cost_Collector_ID
     */
    String COLUMNNAME_PP_Cost_Collector_ID = "PP_Cost_Collector_ID";
    /**
     * Column name PP_Cost_Collector_UU
     */
    String COLUMNNAME_PP_Cost_Collector_UU = "PP_Cost_Collector_UU";
    /**
     * Column name PP_Order_BOMLine_ID
     */
    String COLUMNNAME_PP_Order_BOMLine_ID = "PP_Order_BOMLine_ID";
    /**
     * Column name PP_Order_ID
     */
    String COLUMNNAME_PP_Order_ID = "PP_Order_ID";
    /**
     * Column name PP_Order_Node_ID
     */
    String COLUMNNAME_PP_Order_Node_ID = "PP_Order_Node_ID";
    /**
     * Column name PP_Order_Workflow_ID
     */
    String COLUMNNAME_PP_Order_Workflow_ID = "PP_Order_Workflow_ID";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name ProcessedOn
     */
    String COLUMNNAME_ProcessedOn = "ProcessedOn";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name QtyReject
     */
    String COLUMNNAME_QtyReject = "QtyReject";
    /**
     * Column name Reversal_ID
     */
    String COLUMNNAME_Reversal_ID = "Reversal_ID";
    /**
     * Column name ScrappedQty
     */
    String COLUMNNAME_ScrappedQty = "ScrappedQty";
    /**
     * Column name SetupTimeReal
     */
    String COLUMNNAME_SetupTimeReal = "SetupTimeReal";
    /**
     * Column name S_Resource_ID
     */
    String COLUMNNAME_S_Resource_ID = "S_Resource_ID";
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

    org.compiere.model.I_AD_User getAD_User() throws RuntimeException;

    /**
     * Get Activity. Business Activity
     */
    int getBusinessActivityId();

    /**
     * Set Activity. Business Activity
     */
    void setBusinessActivityId(int C_Activity_ID);

    org.compiere.model.I_C_Activity getActivity() throws RuntimeException;

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

    org.compiere.model.I_C_DocType getDocumentType() throws RuntimeException;

    /**
     * Get Target Document Type. Target document type for conversing documents
     */
    int getTargetDocumentTypeId();

    /**
     * Set Target Document Type. Target document type for conversing documents
     */
    void setTargetDocumentTypeId(int C_DocTypeTarget_ID);

    org.compiere.model.I_C_DocType getDocTypeTarget() throws RuntimeException;

    /**
     * Get Cost Collector Type. Transaction Type for Manufacturing Management
     */
    String getCostCollectorType();

    /**
     * Set Cost Collector Type. Transaction Type for Manufacturing Management
     */
    void setCostCollectorType(String CostCollectorType);

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
     * Get UOM. Unit of Measure
     */
    int getUOMId();

    /**
     * Set UOM. Unit of Measure
     */
    void setUOMId(int C_UOM_ID);

    org.compiere.model.I_C_UOM getUOM() throws RuntimeException;

    /**
     * Get Account Date. Accounting Date
     */
    Timestamp getDateAcct();

    /**
     * Set Account Date. Accounting Date
     */
    void setDateAcct(Timestamp DateAcct);

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
     * Get Document No. Document sequence number of the document
     */
    String getDocumentNo();

    /**
     * Set Document No. Document sequence number of the document
     */
    void setDocumentNo(String DocumentNo);

    /**
     * Get Duration Real
     */
    BigDecimal getDurationReal();

    /**
     * Set Duration Real
     */
    void setDurationReal(BigDecimal DurationReal);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Is BatchTime
     */
    void setIsBatchTime(boolean IsBatchTime);

    /**
     * Get Is BatchTime
     */
    boolean isBatchTime();

    /**
     * Set Is Subcontracting
     */
    void setIsSubcontracting(boolean IsSubcontracting);

    /**
     * Get Is Subcontracting
     */
    boolean isSubcontracting();

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getAttributeSetInstanceId();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setAttributeSetInstanceId(int M_AttributeSetInstance_ID);

    I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

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
     * Get Warehouse. Storage Warehouse and Service Point
     */
    int getWarehouseId();

    /**
     * Set Warehouse. Storage Warehouse and Service Point
     */
    void setWarehouseId(int M_Warehouse_ID);

    org.compiere.model.I_M_Warehouse getWarehouse() throws RuntimeException;

    /**
     * Get Posted. Posting status
     */
    boolean isPosted();

    /**
     * Set Posted. Posting status
     */
    void setPosted(boolean Posted);

    /**
     * Get Manufacturing Cost Collector
     */
    int getCostCollectorId();

    /**
     * Set Manufacturing Cost Collector
     */
    void setCostCollectorId(int PP_Cost_Collector_ID);

    /**
     * Get Manufacturing Order BOM Line
     */
    int getOrderBOMLineId();

    /**
     * Set Manufacturing Order BOM Line
     */
    void setOrderBOMLineId(int PP_Order_BOMLine_ID);

    org.eevolution.model.I_PP_Order_BOMLine getOrderBOMLine() throws RuntimeException;

    /**
     * Get Manufacturing Order. Manufacturing Order
     */
    int getOrderId();

    /**
     * Set Manufacturing Order. Manufacturing Order
     */
    void setOrderId(int PP_Order_ID);

    org.eevolution.model.I_PP_Order getOrder() throws RuntimeException;

    /**
     * Get Manufacturing Order Activity. Workflow Node (activity), step or process
     */
    int getOrderNodeId();

    /**
     * Set Manufacturing Order Activity. Workflow Node (activity), step or process
     */
    void setOrderNodeId(int PP_Order_Node_ID);

    org.eevolution.model.I_PP_Order_Node getOrderNode() throws RuntimeException;

    /**
     * Get Manufacturing Order Workflow
     */
    int getOrderWorkflowId();

    /**
     * Set Manufacturing Order Workflow
     */
    void setOrderWorkflowId(int PP_Order_Workflow_ID);

    org.eevolution.model.I_PP_Order_Workflow getOrderWorkflow() throws RuntimeException;

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Processed On. The date+time (expressed in decimal format) when the document has been
     * processed
     */
    BigDecimal getProcessedOn();

    /**
     * Set Processed On. The date+time (expressed in decimal format) when the document has been
     * processed
     */
    void setProcessedOn(BigDecimal ProcessedOn);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Qty Reject
     */
    BigDecimal getQtyReject();

    /**
     * Set Qty Reject
     */
    void setQtyReject(BigDecimal QtyReject);

    /**
     * Get Reversal ID. ID of document reversal
     */
    int getReversalId();

    /**
     * Set Reversal ID. ID of document reversal
     */
    void setReversalId(int Reversal_ID);

    org.eevolution.model.I_PP_Cost_Collector getReversal() throws RuntimeException;

    /**
     * Get Scrapped Quantity. The Quantity scrapped due to QA issues
     */
    BigDecimal getScrappedQty();

    /**
     * Set Scrapped Quantity. The Quantity scrapped due to QA issues
     */
    void setScrappedQty(BigDecimal ScrappedQty);

    /**
     * Get Setup Time Real
     */
    BigDecimal getSetupTimeReal();

    /**
     * Set Setup Time Real
     */
    void setSetupTimeReal(BigDecimal SetupTimeReal);

    /**
     * Get Resource. Resource
     */
    int getResourceID();

    /**
     * Set Resource. Resource
     */
    void setResourceID(int S_Resource_ID);

    org.compiere.model.I_S_Resource getResource() throws RuntimeException;

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
    int getUser1Id();

    /**
     * Set User Element List 1. User defined list element #1
     */
    void setUser1Id(int User1_ID);

    org.compiere.model.I_AD_User getUser1() throws RuntimeException;

    /**
     * Get User Element List 2. User defined list element #2
     */
    int getUser2Id();

    /**
     * Set User Element List 2. User defined list element #2
     */
    void setUser2Id(int User2_ID);

    org.compiere.model.I_AD_User getUser2() throws RuntimeException;
}
