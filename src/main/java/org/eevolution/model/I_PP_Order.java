package org.eevolution.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PP_Order
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_PP_Order {

  /** TableName=PP_Order */
  public static final String Table_Name = "PP_Order";

  /** AD_Table_ID=53027 */
  public static final int Table_ID = 53027;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_OrgTrx_ID */
  public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
  /** Column name AD_Workflow_ID */
  public static final String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
  /** Column name Assay */
  public static final String COLUMNNAME_Assay = "Assay";
  /** Column name C_Activity_ID */
  public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
  /** Column name C_Campaign_ID */
  public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
  /** Column name C_DocType_ID */
  public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
  /** Column name C_DocTypeTarget_ID */
  public static final String COLUMNNAME_C_DocTypeTarget_ID = "C_DocTypeTarget_ID";
  /** Column name CopyFrom */
  public static final String COLUMNNAME_CopyFrom = "CopyFrom";
  /** Column name C_OrderLine_ID */
  public static final String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
  /** Column name C_Project_ID */
  public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_UOM_ID */
  public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
  /** Column name DateConfirm */
  public static final String COLUMNNAME_DateConfirm = "DateConfirm";
  /** Column name DateDelivered */
  public static final String COLUMNNAME_DateDelivered = "DateDelivered";
  /** Column name DateFinish */
  public static final String COLUMNNAME_DateFinish = "DateFinish";
  /** Column name DateFinishSchedule */
  public static final String COLUMNNAME_DateFinishSchedule = "DateFinishSchedule";
  /** Column name DateOrdered */
  public static final String COLUMNNAME_DateOrdered = "DateOrdered";
  /** Column name DatePromised */
  public static final String COLUMNNAME_DatePromised = "DatePromised";
  /** Column name DateStart */
  public static final String COLUMNNAME_DateStart = "DateStart";
  /** Column name DateStartSchedule */
  public static final String COLUMNNAME_DateStartSchedule = "DateStartSchedule";
  /** Column name Description */
  public static final String COLUMNNAME_Description = "Description";
  /** Column name DocAction */
  public static final String COLUMNNAME_DocAction = "DocAction";
  /** Column name DocStatus */
  public static final String COLUMNNAME_DocStatus = "DocStatus";
  /** Column name DocumentNo */
  public static final String COLUMNNAME_DocumentNo = "DocumentNo";
  /** Column name FloatAfter */
  public static final String COLUMNNAME_FloatAfter = "FloatAfter";
  /** Column name FloatBefored */
  public static final String COLUMNNAME_FloatBefored = "FloatBefored";
  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsApproved */
  public static final String COLUMNNAME_IsApproved = "IsApproved";
  /** Column name IsPrinted */
  public static final String COLUMNNAME_IsPrinted = "IsPrinted";
  /** Column name IsQtyPercentage */
  public static final String COLUMNNAME_IsQtyPercentage = "IsQtyPercentage";
  /** Column name IsSelected */
  public static final String COLUMNNAME_IsSelected = "IsSelected";
  /** Column name IsSOTrx */
  public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";
  /** Column name Line */
  public static final String COLUMNNAME_Line = "Line";
  /** Column name Lot */
  public static final String COLUMNNAME_Lot = "Lot";
  /** Column name M_AttributeSetInstance_ID */
  public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
  /** Column name M_Product_ID */
  public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name M_Warehouse_ID */
  public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
  /** Column name OrderType */
  public static final String COLUMNNAME_OrderType = "OrderType";
  /** Column name Planner_ID */
  public static final String COLUMNNAME_Planner_ID = "Planner_ID";
  /** Column name Posted */
  public static final String COLUMNNAME_Posted = "Posted";
  /** Column name PP_Order_ID */
  public static final String COLUMNNAME_PP_Order_ID = "PP_Order_ID";
  /** Column name PP_Order_UU */
  public static final String COLUMNNAME_PP_Order_UU = "PP_Order_UU";
  /** Column name PP_Product_BOM_ID */
  public static final String COLUMNNAME_PP_Product_BOM_ID = "PP_Product_BOM_ID";
  /** Column name PriorityRule */
  public static final String COLUMNNAME_PriorityRule = "PriorityRule";
  /** Column name Processed */
  public static final String COLUMNNAME_Processed = "Processed";
  /** Column name ProcessedOn */
  public static final String COLUMNNAME_ProcessedOn = "ProcessedOn";
  /** Column name Processing */
  public static final String COLUMNNAME_Processing = "Processing";
  /** Column name QtyBatchs */
  public static final String COLUMNNAME_QtyBatchs = "QtyBatchs";
  /** Column name QtyBatchSize */
  public static final String COLUMNNAME_QtyBatchSize = "QtyBatchSize";
  /** Column name QtyDelivered */
  public static final String COLUMNNAME_QtyDelivered = "QtyDelivered";
  /** Column name QtyEntered */
  public static final String COLUMNNAME_QtyEntered = "QtyEntered";
  /** Column name QtyOrdered */
  public static final String COLUMNNAME_QtyOrdered = "QtyOrdered";
  /** Column name QtyReject */
  public static final String COLUMNNAME_QtyReject = "QtyReject";
  /** Column name QtyReserved */
  public static final String COLUMNNAME_QtyReserved = "QtyReserved";
  /** Column name QtyScrap */
  public static final String COLUMNNAME_QtyScrap = "QtyScrap";
  /** Column name ScheduleType */
  public static final String COLUMNNAME_ScheduleType = "ScheduleType";
  /** Column name SerNo */
  public static final String COLUMNNAME_SerNo = "SerNo";
  /** Column name S_Resource_ID */
  public static final String COLUMNNAME_S_Resource_ID = "S_Resource_ID";
  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name User1_ID */
  public static final String COLUMNNAME_User1_ID = "User1_ID";
  /** Column name User2_ID */
  public static final String COLUMNNAME_User2_ID = "User2_ID";
  /** Column name Yield */
  public static final String COLUMNNAME_Yield = "Yield";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getOrgId();

  /** Get Trx Organization. Performing or initiating organization */
  public int getAD_OrgTrx_ID();

  /** Set Trx Organization. Performing or initiating organization */
  public void setAD_OrgTrx_ID(int AD_OrgTrx_ID);

  /** Get Workflow. Workflow or combination of tasks */
  public int getAD_Workflow_ID();

  /** Set Workflow. Workflow or combination of tasks */
  public void setAD_Workflow_ID(int AD_Workflow_ID);

  public org.compiere.model.I_AD_Workflow getAD_Workflow() throws RuntimeException;

  /** Get Quantity Assay. Indicated the Quantity Assay to use into Quality Order */
  public BigDecimal getAssay();

  /** Set Quantity Assay. Indicated the Quantity Assay to use into Quality Order */
  public void setAssay(BigDecimal Assay);

  /** Get Activity. Business Activity */
  public int getC_Activity_ID();

  /** Set Activity. Business Activity */
  public void setC_Activity_ID(int C_Activity_ID);

  public org.compiere.model.I_C_Activity getC_Activity() throws RuntimeException;

  /** Get Campaign. Marketing Campaign */
  public int getC_Campaign_ID();

  /** Set Campaign. Marketing Campaign */
  public void setC_Campaign_ID(int C_Campaign_ID);

  public org.compiere.model.I_C_Campaign getC_Campaign() throws RuntimeException;

  /** Get Document Type. Document type or rules */
  public int getC_DocType_ID();

  /** Set Document Type. Document type or rules */
  public void setC_DocType_ID(int C_DocType_ID);

  public org.compiere.model.I_C_DocType getC_DocType() throws RuntimeException;

  /** Get Target Document Type. Target document type for conversing documents */
  public int getC_DocTypeTarget_ID();

  /** Set Target Document Type. Target document type for conversing documents */
  public void setC_DocTypeTarget_ID(int C_DocTypeTarget_ID);

  public org.compiere.model.I_C_DocType getC_DocTypeTarget() throws RuntimeException;

  /** Get Copy From. Copy From Record */
  public String getCopyFrom();

  /** Set Copy From. Copy From Record */
  public void setCopyFrom(String CopyFrom);

  /** Get Sales Order Line. Sales Order Line */
  public int getC_OrderLine_ID();

  /** Set Sales Order Line. Sales Order Line */
  public void setC_OrderLine_ID(int C_OrderLine_ID);

  public org.compiere.model.I_C_OrderLine getC_OrderLine() throws RuntimeException;

  /** Get Project. Financial Project */
  public int getC_Project_ID();

  /** Set Project. Financial Project */
  public void setC_Project_ID(int C_Project_ID);

  public org.compiere.model.I_C_Project getC_Project() throws RuntimeException;

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Get UOM. Unit of Measure */
  public int getC_UOM_ID();

  /** Set UOM. Unit of Measure */
  public void setC_UOM_ID(int C_UOM_ID);

  public org.compiere.model.I_C_UOM getC_UOM() throws RuntimeException;

  /** Get Date Confirm. Date Confirm of this Order */
  public Timestamp getDateConfirm();

  /** Set Date Confirm. Date Confirm of this Order */
  public void setDateConfirm(Timestamp DateConfirm);

  /** Get Date Delivered. Date when the product was delivered */
  public Timestamp getDateDelivered();

  /** Set Date Delivered. Date when the product was delivered */
  public void setDateDelivered(Timestamp DateDelivered);

  /** Get Finish Date. Finish or (planned) completion date */
  public Timestamp getDateFinish();

  /** Set Finish Date. Finish or (planned) completion date */
  public void setDateFinish(Timestamp DateFinish);

  /** Get Date Finish Schedule. Scheduled Finish date for this Order */
  public Timestamp getDateFinishSchedule();

  /** Set Date Finish Schedule. Scheduled Finish date for this Order */
  public void setDateFinishSchedule(Timestamp DateFinishSchedule);

  /** Get Date Ordered. Date of Order */
  public Timestamp getDateOrdered();

  /** Set Date Ordered. Date of Order */
  public void setDateOrdered(Timestamp DateOrdered);

  /** Get Date Promised. Date Order was promised */
  public Timestamp getDatePromised();

  /** Set Date Promised. Date Order was promised */
  public void setDatePromised(Timestamp DatePromised);

  /** Get Date Start. Date Start for this Order */
  public Timestamp getDateStart();

  /** Set Date Start. Date Start for this Order */
  public void setDateStart(Timestamp DateStart);

  /** Get Date Start Schedule. Scheduled start date for this Order */
  public Timestamp getDateStartSchedule();

  /** Set Date Start Schedule. Scheduled start date for this Order */
  public void setDateStartSchedule(Timestamp DateStartSchedule);

  /** Get Description. Optional short description of the record */
  public String getDescription();

  /** Set Description. Optional short description of the record */
  public void setDescription(String Description);

  /** Get Document Action. The targeted status of the document */
  public String getDocAction();

  /** Set Document Action. The targeted status of the document */
  public void setDocAction(String DocAction);

  /** Get Document Status. The current status of the document */
  public String getDocStatus();

  /** Set Document Status. The current status of the document */
  public void setDocStatus(String DocStatus);

  /** Get Document No. Document sequence number of the document */
  public String getDocumentNo();

  /** Set Document No. Document sequence number of the document */
  public void setDocumentNo(String DocumentNo);

  /** Get Float After */
  public BigDecimal getFloatAfter();

  /** Set Float After */
  public void setFloatAfter(BigDecimal FloatAfter);

  /** Get Float Befored */
  public BigDecimal getFloatBefored();

  /** Set Float Befored */
  public void setFloatBefored(BigDecimal FloatBefored);

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Set Approved. Indicates if this document requires approval */
  public void setIsApproved(boolean IsApproved);

  /** Get Approved. Indicates if this document requires approval */
  public boolean isApproved();

  /** Set Printed. Indicates if this document / line is printed */
  public void setIsPrinted(boolean IsPrinted);

  /** Get Printed. Indicates if this document / line is printed */
  public boolean isPrinted();

  /** Set Is Qty Percentage. Indicate that this component is based in % Quantity */
  public void setIsQtyPercentage(boolean IsQtyPercentage);

  /** Get Is Qty Percentage. Indicate that this component is based in % Quantity */
  public boolean isQtyPercentage();

  /** Set Selected */
  public void setIsSelected(boolean IsSelected);

  /** Get Selected */
  public boolean isSelected();

  /** Set Sales Transaction. This is a Sales Transaction */
  public void setIsSOTrx(boolean IsSOTrx);

  /** Get Sales Transaction. This is a Sales Transaction */
  public boolean isSOTrx();

  /** Get Line No. Unique line for this document */
  public int getLine();

  /** Set Line No. Unique line for this document */
  public void setLine(int Line);

  /** Get Lot No. Lot number (alphanumeric) */
  public String getLot();

  /** Set Lot No. Lot number (alphanumeric) */
  public void setLot(String Lot);

  /** Set Attribute Set Instance. Product Attribute Set Instance */
  public void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

  /** Get Attribute Set Instance. Product Attribute Set Instance */
  public int getMAttributeSetInstance_ID();

  public I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

  /** Get Product. Product, Service, Item */
  public int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  public void setM_Product_ID(int M_Product_ID);

  public org.compiere.model.I_M_Product getM_Product() throws RuntimeException;

  /** Get Warehouse. Storage Warehouse and Service Point */
  public int getM_Warehouse_ID();

  /** Set Warehouse. Storage Warehouse and Service Point */
  public void setM_Warehouse_ID(int M_Warehouse_ID);

  public org.compiere.model.I_M_Warehouse getM_Warehouse() throws RuntimeException;

  /**
   * Get Order Type. Type of Order: MRP records grouped by source (Sales Order, Purchase Order,
   * Distribution Order, Requisition)
   */
  public String getOrderType();

  /**
   * Set Order Type. Type of Order: MRP records grouped by source (Sales Order, Purchase Order,
   * Distribution Order, Requisition)
   */
  public void setOrderType(String OrderType);

  /** Get Planner */
  public int getPlanner_ID();

  /** Set Planner */
  public void setPlanner_ID(int Planner_ID);

  public org.compiere.model.I_AD_User getPlanner() throws RuntimeException;

  /** Get Posted. Posting status */
  public boolean isPosted();

  /** Set Posted. Posting status */
  public void setPosted(boolean Posted);

  /** Get Manufacturing Order. Manufacturing Order */
  public int getPP_Order_ID();

  /** Set Manufacturing Order. Manufacturing Order */
  public void setPP_Order_ID(int PP_Order_ID);

  /** Get PP_Order_UU */
  public String getPP_Order_UU();

  /** Set PP_Order_UU */
  public void setPP_Order_UU(String PP_Order_UU);

  /** Get BOM & Formula. BOM & Formula */
  public int getPP_Product_BOM_ID();

  /** Set BOM & Formula. BOM & Formula */
  public void setPP_Product_BOM_ID(int PP_Product_BOM_ID);

  public org.eevolution.model.I_PP_Product_BOM getPP_Product_BOM() throws RuntimeException;

  /** Get Priority. Priority of a document */
  public String getPriorityRule();

  /** Set Priority. Priority of a document */
  public void setPriorityRule(String PriorityRule);

  /** Get Processed. The document has been processed */
  public boolean isProcessed();

  /** Set Processed. The document has been processed */
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

  /** Get Process Now */
  public boolean isProcessing();

  /** Set Process Now */
  public void setProcessing(boolean Processing);

  /** Get Qty Batchs */
  public BigDecimal getQtyBatchs();

  /** Set Qty Batchs */
  public void setQtyBatchs(BigDecimal QtyBatchs);

  /** Get Qty Batch Size */
  public BigDecimal getQtyBatchSize();

  /** Set Qty Batch Size */
  public void setQtyBatchSize(BigDecimal QtyBatchSize);

  /** Get Delivered Quantity. Delivered Quantity */
  public BigDecimal getQtyDelivered();

  /** Set Delivered Quantity. Delivered Quantity */
  public void setQtyDelivered(BigDecimal QtyDelivered);

  /** Get Quantity. The Quantity Entered is based on the selected UoM */
  public BigDecimal getQtyEntered();

  /** Set Quantity. The Quantity Entered is based on the selected UoM */
  public void setQtyEntered(BigDecimal QtyEntered);

  /** Get Ordered Quantity. Ordered Quantity */
  public BigDecimal getQtyOrdered();

  /** Set Ordered Quantity. Ordered Quantity */
  public void setQtyOrdered(BigDecimal QtyOrdered);

  /** Get Qty Reject */
  public BigDecimal getQtyReject();

  /** Set Qty Reject */
  public void setQtyReject(BigDecimal QtyReject);

  /** Get Reserved Quantity. Reserved Quantity */
  public BigDecimal getQtyReserved();

  /** Set Reserved Quantity. Reserved Quantity */
  public void setQtyReserved(BigDecimal QtyReserved);

  /** Get Scrap %. Scrap % Quantity for this componet */
  public BigDecimal getQtyScrap();

  /** Set Scrap %. Scrap % Quantity for this componet */
  public void setQtyScrap(BigDecimal QtyScrap);

  /** Get Schedule Type. Type of schedule */
  public String getScheduleType();

  /** Set Schedule Type. Type of schedule */
  public void setScheduleType(String ScheduleType);

  /** Get Serial No. Product Serial Number */
  public String getSerNo();

  /** Set Serial No. Product Serial Number */
  public void setSerNo(String SerNo);

  /** Get Resource. Resource */
  public int getS_Resource_ID();

  /** Set Resource. Resource */
  public void setS_Resource_ID(int S_Resource_ID);

  public org.compiere.model.I_S_Resource getS_Resource() throws RuntimeException;

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();

  /** Get User Element List 1. User defined list element #1 */
  public int getUser1_ID();

  /** Set User Element List 1. User defined list element #1 */
  public void setUser1_ID(int User1_ID);

  public org.compiere.model.I_C_ElementValue getUser1() throws RuntimeException;

  /** Get User Element List 2. User defined list element #2 */
  public int getUser2_ID();

  /** Set User Element List 2. User defined list element #2 */
  public void setUser2_ID(int User2_ID);

  public org.compiere.model.I_C_ElementValue getUser2() throws RuntimeException;

  /**
   * Get Yield %. The Yield is the percentage of a lot that is expected to be of acceptable wuality
   * may fall below 100 percent
   */
  public BigDecimal getYield();

  /**
   * Set Yield %. The Yield is the percentage of a lot that is expected to be of acceptable wuality
   * may fall below 100 percent
   */
  public void setYield(BigDecimal Yield);
}
