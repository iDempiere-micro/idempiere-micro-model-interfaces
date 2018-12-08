package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;
import org.idempiere.icommon.model.IPO;

/**
 * Generated Interface for C_InvoiceLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_InvoiceLine extends IPO {

  /** TableName=C_InvoiceLine */
  String Table_Name = "C_InvoiceLine";

  /** AD_Table_ID=333 */
  int Table_ID = 333;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name A_Asset_Group_ID */
  String COLUMNNAME_A_Asset_Group_ID = "A_Asset_Group_ID";
  /** Column name A_Asset_ID */
  String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
  /** Column name A_CapvsExp */
  String COLUMNNAME_A_CapvsExp = "A_CapvsExp";
  /** Column name A_CreateAsset */
  String COLUMNNAME_A_CreateAsset = "A_CreateAsset";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_OrgTrx_ID */
  String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
  /** Column name A_Processed */
  String COLUMNNAME_A_Processed = "A_Processed";
  /** Column name C_1099Box_ID */
  String COLUMNNAME_C_1099Box_ID = "C_1099Box_ID";
  /** Column name C_Activity_ID */
  String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
  /** Column name C_Campaign_ID */
  String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
  /** Column name C_Charge_ID */
  String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
  /** Column name C_Invoice_ID */
  String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
  /** Column name C_InvoiceLine_ID */
  String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
  /** Column name C_InvoiceLine_UU */
  String COLUMNNAME_C_InvoiceLine_UU = "C_InvoiceLine_UU";
  /** Column name C_OrderLine_ID */
  String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
  /** Column name C_Project_ID */
  String COLUMNNAME_C_Project_ID = "C_Project_ID";
  /** Column name C_ProjectPhase_ID */
  String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";
  /** Column name C_ProjectTask_ID */
  String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_Tax_ID */
  String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
  /** Column name C_UOM_ID */
  String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsDescription */
  String COLUMNNAME_IsDescription = "IsDescription";
  /** Column name IsFixedAssetInvoice */
  String COLUMNNAME_IsFixedAssetInvoice = "IsFixedAssetInvoice";
  /** Column name IsPrinted */
  String COLUMNNAME_IsPrinted = "IsPrinted";
  /** Column name Line */
  String COLUMNNAME_Line = "Line";
  /** Column name LineNetAmt */
  String COLUMNNAME_LineNetAmt = "LineNetAmt";
  /** Column name LineTotalAmt */
  String COLUMNNAME_LineTotalAmt = "LineTotalAmt";
  /** Column name M_AttributeSetInstance_ID */
  String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
  /** Column name M_InOutLine_ID */
  String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name M_RMALine_ID */
  String COLUMNNAME_M_RMALine_ID = "M_RMALine_ID";
  /** Column name PriceActual */
  String COLUMNNAME_PriceActual = "PriceActual";
  /** Column name PriceEntered */
  String COLUMNNAME_PriceEntered = "PriceEntered";
  /** Column name PriceLimit */
  String COLUMNNAME_PriceLimit = "PriceLimit";
  /** Column name PriceList */
  String COLUMNNAME_PriceList = "PriceList";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name QtyEntered */
  String COLUMNNAME_QtyEntered = "QtyEntered";
  /** Column name QtyInvoiced */
  String COLUMNNAME_QtyInvoiced = "QtyInvoiced";
  /** Column name Ref_InvoiceLine_ID */
  String COLUMNNAME_Ref_InvoiceLine_ID = "Ref_InvoiceLine_ID";
  /** Column name RRAmt */
  String COLUMNNAME_RRAmt = "RRAmt";
  /** Column name RRStartDate */
  String COLUMNNAME_RRStartDate = "RRStartDate";
  /** Column name S_ResourceAssignment_ID */
  String COLUMNNAME_S_ResourceAssignment_ID = "S_ResourceAssignment_ID";
  /** Column name TaxAmt */
  String COLUMNNAME_TaxAmt = "TaxAmt";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name User1_ID */
  String COLUMNNAME_User1_ID = "User1_ID";
  /** Column name User2_ID */
  String COLUMNNAME_User2_ID = "User2_ID";

  /** Get Asset Group. Group of Assets */
  int getA_Asset_Group_ID();

  /** Set Asset Group. Group of Assets */
  void setA_Asset_Group_ID(int A_Asset_Group_ID);

  I_A_Asset_Group getA_Asset_Group() throws RuntimeException;

  /** Get Asset. Asset used internally or by customers */
  int getA_Asset_ID();

  /** Set Asset. Asset used internally or by customers */
  void setA_Asset_ID(int A_Asset_ID);

  I_A_Asset getA_Asset() throws RuntimeException;

  /** Get Capital/Expense */
  String getA_CapvsExp();

  /** Set Capital/Expense */
  void setA_CapvsExp(String A_CapvsExp);

  /** Get Create Asset */
  boolean isA_CreateAsset();

  /** Set Create Asset */
  void setA_CreateAsset(boolean A_CreateAsset);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Trx Organization. Performing or initiating organization */
  int getAD_OrgTrx_ID();

  /** Set Trx Organization. Performing or initiating organization */
  void setAD_OrgTrx_ID(int AD_OrgTrx_ID);

  /** Get Processed */
  boolean isA_Processed();

  /** Set Processed */
  void setA_Processed(boolean A_Processed);

  /** Get 1099 Box */
  int getC_1099Box_ID();

  /** Set 1099 Box */
  void setC_1099Box_ID(int C_1099Box_ID);

  I_C_1099Box getC_1099Box() throws RuntimeException;

  /** Get Activity. Business Activity */
  int getC_Activity_ID();

  /** Set Activity. Business Activity */
  void setC_Activity_ID(int C_Activity_ID);

  I_C_Activity getC_Activity() throws RuntimeException;

  /** Get Campaign. Marketing Campaign */
  int getC_Campaign_ID();

  /** Set Campaign. Marketing Campaign */
  void setC_Campaign_ID(int C_Campaign_ID);

  I_C_Campaign getC_Campaign() throws RuntimeException;

  /** Get Charge. Additional document charges */
  int getC_Charge_ID();

  /** Set Charge. Additional document charges */
  void setC_Charge_ID(int C_Charge_ID);

  I_C_Charge getC_Charge() throws RuntimeException;

  /** Get Invoice. Invoice Identifier */
  int getC_Invoice_ID();

  /** Set Invoice. Invoice Identifier */
  void setC_Invoice_ID(int C_Invoice_ID);

  I_C_Invoice getC_Invoice() throws RuntimeException;

  /** Get Invoice Line. Invoice Detail Line */
  int getC_InvoiceLine_ID();

  /** Set Invoice Line. Invoice Detail Line */
  void setC_InvoiceLine_ID(int C_InvoiceLine_ID);

  /** Get C_InvoiceLine_UU */
  String getC_InvoiceLine_UU();

  /** Set C_InvoiceLine_UU */
  void setC_InvoiceLine_UU(String C_InvoiceLine_UU);

  /** Get Sales Order Line. Sales Order Line */
  int getC_OrderLine_ID();

  /** Set Sales Order Line. Sales Order Line */
  void setC_OrderLine_ID(int C_OrderLine_ID);

  I_C_OrderLine getC_OrderLine() throws RuntimeException;

  /** Get Project. Financial Project */
  int getC_Project_ID();

  /** Set Project. Financial Project */
  void setC_Project_ID(int C_Project_ID);

  I_C_Project getC_Project() throws RuntimeException;

  /** Get Project Phase. Phase of a Project */
  int getC_ProjectPhase_ID();

  /** Set Project Phase. Phase of a Project */
  void setC_ProjectPhase_ID(int C_ProjectPhase_ID);

  I_C_ProjectPhase getC_ProjectPhase() throws RuntimeException;

  /** Get Project Task. Actual Project Task in a Phase */
  int getC_ProjectTask_ID();

  /** Set Project Task. Actual Project Task in a Phase */
  void setC_ProjectTask_ID(int C_ProjectTask_ID);

  I_C_ProjectTask getC_ProjectTask() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Tax. Tax identifier */
  int getC_Tax_ID();

  /** Set Tax. Tax identifier */
  void setC_Tax_ID(int C_Tax_ID);

  I_C_Tax getC_Tax() throws RuntimeException;

  /** Get UOM. Unit of Measure */
  int getC_UOM_ID();

  /** Set UOM. Unit of Measure */
  void setC_UOM_ID(int C_UOM_ID);

  I_C_UOM getC_UOM() throws RuntimeException;

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Description Only. if true, the line is just description and no transaction */
  void setIsDescription(boolean IsDescription);

  /** Get Description Only. if true, the line is just description and no transaction */
  boolean isDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set IsFixedAssetInvoice */
  void setIsFixedAssetInvoice(boolean IsFixedAssetInvoice);

  /** Get IsFixedAssetInvoice */
  boolean isFixedAssetInvoice();

  /** Set Printed. Indicates if this document / line is printed */
  void setIsPrinted(boolean IsPrinted);

  /** Get Printed. Indicates if this document / line is printed */
  boolean isPrinted();

  /** Get Line No. Unique line for this document */
  int getLine();

  /** Set Line No. Unique line for this document */
  void setLine(int Line);

  /** Get Line Amount. Line Extended Amount (Quantity * Actual Price) without Freight and Charges */
  BigDecimal getLineNetAmt();

  /** Set Line Amount. Line Extended Amount (Quantity * Actual Price) without Freight and Charges */
  void setLineNetAmt(BigDecimal LineNetAmt);

  /** Get Line Total. Total line amount incl. Tax */
  BigDecimal getLineTotalAmt();

  /** Set Line Total. Total line amount incl. Tax */
  void setLineTotalAmt(BigDecimal LineTotalAmt);

  /** Set Attribute Set Instance. Product Attribute Set Instance */
  void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

  /** Get Attribute Set Instance. Product Attribute Set Instance */
  int getMAttributeSetInstance_ID();

  I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

  /** Get Shipment/Receipt Line. Line on Shipment or Receipt document */
  int getM_InOutLine_ID();

  /** Set Shipment/Receipt Line. Line on Shipment or Receipt document */
  void setM_InOutLine_ID(int M_InOutLine_ID);

  I_M_InOutLine getM_InOutLine() throws RuntimeException;

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get RMA Line. Return Material Authorization Line */
  int getM_RMALine_ID();

  /** Set RMA Line. Return Material Authorization Line */
  void setM_RMALine_ID(int M_RMALine_ID);

  I_M_RMALine getM_RMALine() throws RuntimeException;

  /** Get Unit Price. Actual Price */
  BigDecimal getPriceActual();

  /** Set Unit Price. Actual Price */
  void setPriceActual(BigDecimal PriceActual);

  /** Get Price. Price Entered - the price based on the selected/base UoM */
  BigDecimal getPriceEntered();

  /** Set Price. Price Entered - the price based on the selected/base UoM */
  void setPriceEntered(BigDecimal PriceEntered);

  /** Get Limit Price. Lowest price for a product */
  BigDecimal getPriceLimit();

  /** Set Limit Price. Lowest price for a product */
  void setPriceLimit(BigDecimal PriceLimit);

  /** Get List Price. List Price */
  BigDecimal getPriceList();

  /** Set List Price. List Price */
  void setPriceList(BigDecimal PriceList);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Quantity. The Quantity Entered is based on the selected UoM */
  BigDecimal getQtyEntered();

  /** Set Quantity. The Quantity Entered is based on the selected UoM */
  void setQtyEntered(BigDecimal QtyEntered);

  /** Get Quantity Invoiced. Invoiced Quantity */
  BigDecimal getQtyInvoiced();

  /** Set Quantity Invoiced. Invoiced Quantity */
  void setQtyInvoiced(BigDecimal QtyInvoiced);

  /** Get Referenced Invoice Line */
  int getRef_InvoiceLine_ID();

  /** Set Referenced Invoice Line */
  void setRef_InvoiceLine_ID(int Ref_InvoiceLine_ID);

  /** Get Revenue Recognition Amt. Revenue Recognition Amount */
  BigDecimal getRRAmt();

  /** Set Revenue Recognition Amt. Revenue Recognition Amount */
  void setRRAmt(BigDecimal RRAmt);

  /** Get Revenue Recognition Start. Revenue Recognition Start Date */
  Timestamp getRRStartDate();

  /** Set Revenue Recognition Start. Revenue Recognition Start Date */
  void setRRStartDate(Timestamp RRStartDate);

  /** Get Resource Assignment. Resource Assignment */
  int getS_ResourceAssignment_ID();

  /** Set Resource Assignment. Resource Assignment */
  void setS_ResourceAssignment_ID(int S_ResourceAssignment_ID);

  /** Get Tax Amount. Tax Amount for a document */
  BigDecimal getTaxAmt();

  /** Set Tax Amount. Tax Amount for a document */
  void setTaxAmt(BigDecimal TaxAmt);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get User Element List 1. User defined list element #1 */
  int getUser1_ID();

  /** Set User Element List 1. User defined list element #1 */
  void setUser1_ID(int User1_ID);

  I_C_ElementValue getUser1() throws RuntimeException;

  /** Get User Element List 2. User defined list element #2 */
  int getUser2_ID();

  /** Set User Element List 2. User defined list element #2 */
  void setUser2_ID(int User2_ID);

  I_C_ElementValue getUser2() throws RuntimeException;

  boolean isTaxIncluded();

  boolean updateInvoiceTax(boolean b);

  boolean updateHeaderTax();

  void clearParent();

  I_C_Invoice getParent();

  void saveEx();
}
