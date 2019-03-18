package org.eevolution.model;

import org.compiere.model.I_M_AttributeSetInstance;
import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for PP_Order
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_PP_Order {

    /**
     * TableName=PP_Order
     */
    String Table_Name = "PP_Order";

    /**
     * AD_Table_ID=53027
     */
    int Table_ID = 53027;

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
     * Column name AD_Workflow_ID
     */
    String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
    /**
     * Column name Assay
     */
    String COLUMNNAME_Assay = "Assay";
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
     * Column name CopyFrom
     */
    String COLUMNNAME_CopyFrom = "CopyFrom";
    /**
     * Column name C_OrderLine_ID
     */
    String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
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
     * Column name DateConfirm
     */
    String COLUMNNAME_DateConfirm = "DateConfirm";
    /**
     * Column name DateDelivered
     */
    String COLUMNNAME_DateDelivered = "DateDelivered";
    /**
     * Column name DateFinish
     */
    String COLUMNNAME_DateFinish = "DateFinish";
    /**
     * Column name DateFinishSchedule
     */
    String COLUMNNAME_DateFinishSchedule = "DateFinishSchedule";
    /**
     * Column name DateOrdered
     */
    String COLUMNNAME_DateOrdered = "DateOrdered";
    /**
     * Column name DatePromised
     */
    String COLUMNNAME_DatePromised = "DatePromised";
    /**
     * Column name DateStart
     */
    String COLUMNNAME_DateStart = "DateStart";
    /**
     * Column name DateStartSchedule
     */
    String COLUMNNAME_DateStartSchedule = "DateStartSchedule";
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
     * Column name FloatAfter
     */
    String COLUMNNAME_FloatAfter = "FloatAfter";
    /**
     * Column name FloatBefored
     */
    String COLUMNNAME_FloatBefored = "FloatBefored";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsApproved
     */
    String COLUMNNAME_IsApproved = "IsApproved";
    /**
     * Column name IsPrinted
     */
    String COLUMNNAME_IsPrinted = "IsPrinted";
    /**
     * Column name IsQtyPercentage
     */
    String COLUMNNAME_IsQtyPercentage = "IsQtyPercentage";
    /**
     * Column name IsSelected
     */
    String COLUMNNAME_IsSelected = "IsSelected";
    /**
     * Column name IsSOTrx
     */
    String COLUMNNAME_IsSOTrx = "IsSOTrx";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name Lot
     */
    String COLUMNNAME_Lot = "Lot";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_Warehouse_ID
     */
    String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
    /**
     * Column name OrderType
     */
    String COLUMNNAME_OrderType = "OrderType";
    /**
     * Column name Planner_ID
     */
    String COLUMNNAME_Planner_ID = "Planner_ID";
    /**
     * Column name Posted
     */
    String COLUMNNAME_Posted = "Posted";
    /**
     * Column name PP_Order_ID
     */
    String COLUMNNAME_PP_Order_ID = "PP_Order_ID";
    /**
     * Column name PP_Order_UU
     */
    String COLUMNNAME_PP_Order_UU = "PP_Order_UU";
    /**
     * Column name PP_Product_BOM_ID
     */
    String COLUMNNAME_PP_Product_BOM_ID = "PP_Product_BOM_ID";
    /**
     * Column name PriorityRule
     */
    String COLUMNNAME_PriorityRule = "PriorityRule";
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
     * Column name QtyBatchs
     */
    String COLUMNNAME_QtyBatchs = "QtyBatchs";
    /**
     * Column name QtyBatchSize
     */
    String COLUMNNAME_QtyBatchSize = "QtyBatchSize";
    /**
     * Column name QtyDelivered
     */
    String COLUMNNAME_QtyDelivered = "QtyDelivered";
    /**
     * Column name QtyEntered
     */
    String COLUMNNAME_QtyEntered = "QtyEntered";
    /**
     * Column name QtyOrdered
     */
    String COLUMNNAME_QtyOrdered = "QtyOrdered";
    /**
     * Column name QtyReject
     */
    String COLUMNNAME_QtyReject = "QtyReject";
    /**
     * Column name QtyReserved
     */
    String COLUMNNAME_QtyReserved = "QtyReserved";
    /**
     * Column name QtyScrap
     */
    String COLUMNNAME_QtyScrap = "QtyScrap";
    /**
     * Column name ScheduleType
     */
    String COLUMNNAME_ScheduleType = "ScheduleType";
    /**
     * Column name SerNo
     */
    String COLUMNNAME_SerNo = "SerNo";
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
     * Column name Yield
     */
    String COLUMNNAME_Yield = "Yield";

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
     * Get Workflow. Workflow or combination of tasks
     */
    int getWorkflowId();

    /**
     * Set Workflow. Workflow or combination of tasks
     */
    void setWorkflowId(int AD_Workflow_ID);

    org.compiere.model.I_AD_Workflow getWorkflow() throws RuntimeException;

    /**
     * Get Quantity Assay. Indicated the Quantity Assay to use into Quality Order
     */
    BigDecimal getAssay();

    /**
     * Set Quantity Assay. Indicated the Quantity Assay to use into Quality Order
     */
    void setAssay(BigDecimal Assay);

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
     * Get Copy From. Copy From Record
     */
    String getCopyFrom();

    /**
     * Set Copy From. Copy From Record
     */
    void setCopyFrom(String CopyFrom);

    /**
     * Get Sales Order Line. Sales Order Line
     */
    int getOrderLineId();

    /**
     * Set Sales Order Line. Sales Order Line
     */
    void setOrderLineId(int C_OrderLine_ID);

    org.compiere.model.I_C_OrderLine getOrderLine() throws RuntimeException;

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
     * Get Date Confirm. Date Confirm of this Order
     */
    Timestamp getDateConfirm();

    /**
     * Set Date Confirm. Date Confirm of this Order
     */
    void setDateConfirm(Timestamp DateConfirm);

    /**
     * Get Date Delivered. Date when the product was delivered
     */
    Timestamp getDateDelivered();

    /**
     * Set Date Delivered. Date when the product was delivered
     */
    void setDateDelivered(Timestamp DateDelivered);

    /**
     * Get Finish Date. Finish or (planned) completion date
     */
    Timestamp getDateFinish();

    /**
     * Set Finish Date. Finish or (planned) completion date
     */
    void setDateFinish(Timestamp DateFinish);

    /**
     * Get Date Finish Schedule. Scheduled Finish date for this Order
     */
    Timestamp getDateFinishSchedule();

    /**
     * Set Date Finish Schedule. Scheduled Finish date for this Order
     */
    void setDateFinishSchedule(Timestamp DateFinishSchedule);

    /**
     * Get Date Ordered. Date of Order
     */
    Timestamp getDateOrdered();

    /**
     * Set Date Ordered. Date of Order
     */
    void setDateOrdered(Timestamp DateOrdered);

    /**
     * Get Date Promised. Date Order was promised
     */
    Timestamp getDatePromised();

    /**
     * Set Date Promised. Date Order was promised
     */
    void setDatePromised(Timestamp DatePromised);

    /**
     * Get Date Start. Date Start for this Order
     */
    Timestamp getDateStart();

    /**
     * Set Date Start. Date Start for this Order
     */
    void setDateStart(Timestamp DateStart);

    /**
     * Get Date Start Schedule. Scheduled start date for this Order
     */
    Timestamp getDateStartSchedule();

    /**
     * Set Date Start Schedule. Scheduled start date for this Order
     */
    void setDateStartSchedule(Timestamp DateStartSchedule);

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
     * Get Float After
     */
    BigDecimal getFloatAfter();

    /**
     * Set Float After
     */
    void setFloatAfter(BigDecimal FloatAfter);

    /**
     * Get Float Befored
     */
    BigDecimal getFloatBefored();

    /**
     * Set Float Befored
     */
    void setFloatBefored(BigDecimal FloatBefored);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Approved. Indicates if this document requires approval
     */
    void setIsApproved(boolean IsApproved);

    /**
     * Get Approved. Indicates if this document requires approval
     */
    boolean isApproved();

    /**
     * Set Printed. Indicates if this document / line is printed
     */
    void setIsPrinted(boolean IsPrinted);

    /**
     * Get Printed. Indicates if this document / line is printed
     */
    boolean isPrinted();

    /**
     * Set Is Qty Percentage. Indicate that this component is based in % Quantity
     */
    void setIsQtyPercentage(boolean IsQtyPercentage);

    /**
     * Get Is Qty Percentage. Indicate that this component is based in % Quantity
     */
    boolean isQtyPercentage();

    /**
     * Set Selected
     */
    void setIsSelected(boolean IsSelected);

    /**
     * Get Selected
     */
    boolean isSelected();

    /**
     * Set Sales Transaction. This is a Sales Transaction
     */
    void setIsSOTrx(boolean IsSOTrx);

    /**
     * Get Sales Transaction. This is a Sales Transaction
     */
    boolean isSOTrx();

    /**
     * Get Line No. Unique line for this document
     */
    int getLine();

    /**
     * Set Line No. Unique line for this document
     */
    void setLine(int Line);

    /**
     * Get Lot No. Lot number (alphanumeric)
     */
    String getLot();

    /**
     * Set Lot No. Lot number (alphanumeric)
     */
    void setLot(String Lot);

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
     * Get Order Type. Type of Order: MRP records grouped by source (Sales Order, Purchase Order,
     * Distribution Order, Requisition)
     */
    String getOrderType();

    /**
     * Set Order Type. Type of Order: MRP records grouped by source (Sales Order, Purchase Order,
     * Distribution Order, Requisition)
     */
    void setOrderType(String OrderType);

    /**
     * Get Planner
     */
    int getPlannerId();

    /**
     * Set Planner
     */
    void setPlannerId(int Planner_ID);

    org.compiere.model.I_AD_User getPlanner() throws RuntimeException;

    /**
     * Get Posted. Posting status
     */
    boolean isPosted();

    /**
     * Set Posted. Posting status
     */
    void setPosted(boolean Posted);

    /**
     * Get Manufacturing Order. Manufacturing Order
     */
    int getOrderId();

    /**
     * Set Manufacturing Order. Manufacturing Order
     */
    void setOrderId(int PP_Order_ID);

    /**
     * Get BOM & Formula. BOM & Formula
     */
    int getProductBOMId();

    /**
     * Set BOM & Formula. BOM & Formula
     */
    void setProductBOMId(int PP_Product_BOM_ID);

    org.eevolution.model.I_PP_Product_BOM getProductBOM() throws RuntimeException;

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
     * Get Qty Batchs
     */
    BigDecimal getQtyBatchs();

    /**
     * Set Qty Batchs
     */
    void setQtyBatchs(BigDecimal QtyBatchs);

    /**
     * Get Qty Batch Size
     */
    BigDecimal getQtyBatchSize();

    /**
     * Set Qty Batch Size
     */
    void setQtyBatchSize(BigDecimal QtyBatchSize);

    /**
     * Get Delivered Quantity. Delivered Quantity
     */
    BigDecimal getQtyDelivered();

    /**
     * Set Delivered Quantity. Delivered Quantity
     */
    void setQtyDelivered(BigDecimal QtyDelivered);

    /**
     * Get Quantity. The Quantity Entered is based on the selected UoM
     */
    BigDecimal getQtyEntered();

    /**
     * Set Quantity. The Quantity Entered is based on the selected UoM
     */
    void setQtyEntered(BigDecimal QtyEntered);

    /**
     * Get Ordered Quantity. Ordered Quantity
     */
    BigDecimal getQtyOrdered();

    /**
     * Set Ordered Quantity. Ordered Quantity
     */
    void setQtyOrdered(BigDecimal QtyOrdered);

    /**
     * Get Qty Reject
     */
    BigDecimal getQtyReject();

    /**
     * Set Qty Reject
     */
    void setQtyReject(BigDecimal QtyReject);

    /**
     * Get Reserved Quantity. Reserved Quantity
     */
    BigDecimal getQtyReserved();

    /**
     * Set Reserved Quantity. Reserved Quantity
     */
    void setQtyReserved(BigDecimal QtyReserved);

    /**
     * Get Scrap %. Scrap % Quantity for this componet
     */
    BigDecimal getQtyScrap();

    /**
     * Set Scrap %. Scrap % Quantity for this componet
     */
    void setQtyScrap(BigDecimal QtyScrap);

    /**
     * Get Schedule Type. Type of schedule
     */
    String getScheduleType();

    /**
     * Set Schedule Type. Type of schedule
     */
    void setScheduleType(String ScheduleType);

    /**
     * Get Serial No. Product Serial Number
     */
    String getSerNo();

    /**
     * Set Serial No. Product Serial Number
     */
    void setSerNo(String SerNo);

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

    org.compiere.model.I_C_ElementValue getUser1() throws RuntimeException;

    /**
     * Get User Element List 2. User defined list element #2
     */
    int getUser2Id();

    /**
     * Set User Element List 2. User defined list element #2
     */
    void setUser2Id(int User2_ID);

    org.compiere.model.I_C_ElementValue getUser2() throws RuntimeException;

    /**
     * Get Yield %. The Yield is the percentage of a lot that is expected to be of acceptable wuality
     * may fall below 100 percent
     */
    BigDecimal getYield();

    /**
     * Set Yield %. The Yield is the percentage of a lot that is expected to be of acceptable wuality
     * may fall below 100 percent
     */
    void setYield(BigDecimal Yield);
}
