package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Asset_Addition
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Addition {

  /** TableName=A_Asset_Addition */
  String Table_Name = "A_Asset_Addition";

  /** AD_Table_ID=53137 */
  int Table_ID = 53137;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name A_Accumulated_Depr */
  String COLUMNNAME_A_Accumulated_Depr = "A_Accumulated_Depr";
  /** Column name A_Accumulated_Depr_Adjust */
  String COLUMNNAME_A_Accumulated_Depr_Adjust = "A_Accumulated_Depr_Adjust";
  /** Column name A_Accumulated_Depr_F */
  String COLUMNNAME_A_Accumulated_Depr_F = "A_Accumulated_Depr_F";
  /** Column name A_Asset_Addition_ID */
  String COLUMNNAME_A_Asset_Addition_ID = "A_Asset_Addition_ID";
  /** Column name A_Asset_Addition_UU */
  String COLUMNNAME_A_Asset_Addition_UU = "A_Asset_Addition_UU";
  /** Column name A_Asset_ID */
  String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
  /** Column name A_CapvsExp */
  String COLUMNNAME_A_CapvsExp = "A_CapvsExp";
  /** Column name A_CreateAsset */
  String COLUMNNAME_A_CreateAsset = "A_CreateAsset";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name A_Life_Period_Max */
  String COLUMNNAME_A_Life_Period_Max = "A_Life_Period_Max";
  /** Column name A_Life_Period_Min */
  String COLUMNNAME_A_Life_Period_Min = "A_Life_Period_Min";
  /** Column name A_Period_Start */
  String COLUMNNAME_A_Period_Start = "A_Period_Start";
  /** Column name A_QTY_Current */
  String COLUMNNAME_A_QTY_Current = "A_QTY_Current";
  /** Column name A_Salvage_Value */
  String COLUMNNAME_A_Salvage_Value = "A_Salvage_Value";
  /** Column name A_SourceType */
  String COLUMNNAME_A_SourceType = "A_SourceType";
  /** Column name AssetAmtEntered */
  String COLUMNNAME_AssetAmtEntered = "AssetAmtEntered";
  /** Column name AssetSourceAmt */
  String COLUMNNAME_AssetSourceAmt = "AssetSourceAmt";
  /** Column name AssetValueAmt */
  String COLUMNNAME_AssetValueAmt = "AssetValueAmt";
  /** Column name C_Charge_ID */
  String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
  /** Column name C_ConversionType_ID */
  String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name C_DocType_ID */
  String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
  /** Column name C_Invoice_ID */
  String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
  /** Column name C_InvoiceLine_ID */
  String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
  /** Column name C_Project_ID */
  String COLUMNNAME_C_Project_ID = "C_Project_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name CurrencyRate */
  String COLUMNNAME_CurrencyRate = "CurrencyRate";
  /** Column name DateAcct */
  String COLUMNNAME_DateAcct = "DateAcct";
  /** Column name DateDoc */
  String COLUMNNAME_DateDoc = "DateDoc";
  /** Column name DeltaUseLifeYears */
  String COLUMNNAME_DeltaUseLifeYears = "DeltaUseLifeYears";
  /** Column name DeltaUseLifeYears_F */
  String COLUMNNAME_DeltaUseLifeYears_F = "DeltaUseLifeYears_F";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DocAction */
  String COLUMNNAME_DocAction = "DocAction";
  /** Column name DocStatus */
  String COLUMNNAME_DocStatus = "DocStatus";
  /** Column name DocumentNo */
  String COLUMNNAME_DocumentNo = "DocumentNo";
  /** Column name GL_JournalBatch_ID */
  String COLUMNNAME_GL_JournalBatch_ID = "GL_JournalBatch_ID";
  /** Column name I_FixedAsset_ID */
  String COLUMNNAME_I_FixedAsset_ID = "I_FixedAsset_ID";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsApproved */
  String COLUMNNAME_IsApproved = "IsApproved";
  /** Column name Line */
  String COLUMNNAME_Line = "Line";
  /** Column name M_AttributeSetInstance_ID */
  String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
  /** Column name M_InOutLine_ID */
  String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
  /** Column name M_Locator_ID */
  String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
  /** Column name M_MatchInv_ID */
  String COLUMNNAME_M_MatchInv_ID = "M_MatchInv_ID";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name Posted */
  String COLUMNNAME_Posted = "Posted";
  /** Column name PostingType */
  String COLUMNNAME_PostingType = "PostingType";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name ProcessedOn */
  String COLUMNNAME_ProcessedOn = "ProcessedOn";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Accumulated Depreciation */
  BigDecimal getA_Accumulated_Depr();

  /** Set Accumulated Depreciation */
  void setA_Accumulated_Depr(BigDecimal A_Accumulated_Depr);

  /** Get Adjust Accumulated Depreciation */
  boolean isA_Accumulated_Depr_Adjust();

  /** Set Adjust Accumulated Depreciation */
  void setA_Accumulated_Depr_Adjust(boolean A_Accumulated_Depr_Adjust);

  /** Get Accumulated Depreciation (fiscal) */
  BigDecimal getA_Accumulated_Depr_F();

  /** Set Accumulated Depreciation (fiscal) */
  void setA_Accumulated_Depr_F(BigDecimal A_Accumulated_Depr_F);

  /** Get Asset Addition */
  int getA_Asset_Addition_ID();

  /** Set Asset Addition */
  void setA_Asset_Addition_ID(int A_Asset_Addition_ID);

  /** Get A_Asset_Addition_UU */
  String getA_Asset_Addition_UU();

  /** Set A_Asset_Addition_UU */
  void setA_Asset_Addition_UU(String A_Asset_Addition_UU);

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

  /** Get Life periods (max) */
  int getA_Life_Period_Max();

  /** Set Life periods (max) */
  void setA_Life_Period_Max(int A_Life_Period_Max);

  /** Get Life periods (min) */
  int getA_Life_Period_Min();

  /** Set Life periods (min) */
  void setA_Life_Period_Min(int A_Life_Period_Min);

  /** Get A_Period_Start */
  int getA_Period_Start();

  /** Set A_Period_Start */
  void setA_Period_Start(int A_Period_Start);

  /** Get Current Qty */
  BigDecimal getA_QTY_Current();

  /** Set Current Qty */
  void setA_QTY_Current(BigDecimal A_QTY_Current);

  /** Get Asset Salvage Value */
  BigDecimal getA_Salvage_Value();

  /** Set Asset Salvage Value */
  void setA_Salvage_Value(BigDecimal A_Salvage_Value);

  /** Get Source Type */
  String getA_SourceType();

  /** Set Source Type */
  void setA_SourceType(String A_SourceType);

  /** Get Entered Amount */
  BigDecimal getAssetAmtEntered();

  /** Set Entered Amount */
  void setAssetAmtEntered(BigDecimal AssetAmtEntered);

  /** Get Source Amount */
  BigDecimal getAssetSourceAmt();

  /** Set Source Amount */
  void setAssetSourceAmt(BigDecimal AssetSourceAmt);

  /** Get Asset value. Book Value of the asset */
  BigDecimal getAssetValueAmt();

  /** Set Asset value. Book Value of the asset */
  void setAssetValueAmt(BigDecimal AssetValueAmt);

  /** Get Charge. Additional document charges */
  int getC_Charge_ID();

  /** Set Charge. Additional document charges */
  void setC_Charge_ID(int C_Charge_ID);

  I_C_Charge getC_Charge() throws RuntimeException;

  /** Get Currency Type. Currency Conversion Rate Type */
  int getC_ConversionType_ID();

  /** Set Currency Type. Currency Conversion Rate Type */
  void setC_ConversionType_ID(int C_ConversionType_ID);

  I_C_ConversionType getC_ConversionType() throws RuntimeException;

  /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

  /** Set Currency. The Currency for this record */
  void setC_Currency_ID(int C_Currency_ID);

  I_C_Currency getC_Currency() throws RuntimeException;

  /** Get Document Type. Document type or rules */
  int getC_DocType_ID();

  /** Set Document Type. Document type or rules */
  void setC_DocType_ID(int C_DocType_ID);

  I_C_DocType getC_DocType() throws RuntimeException;

  /** Get Invoice. Invoice Identifier */
  int getC_Invoice_ID();

  /** Set Invoice. Invoice Identifier */
  void setC_Invoice_ID(int C_Invoice_ID);

  I_C_Invoice getC_Invoice() throws RuntimeException;

  /** Get Invoice Line. Invoice Detail Line */
  int getC_InvoiceLine_ID();

  /** Set Invoice Line. Invoice Detail Line */
  void setC_InvoiceLine_ID(int C_InvoiceLine_ID);

  I_C_InvoiceLine getC_InvoiceLine() throws RuntimeException;

  /** Get Project. Financial Project */
  int getC_Project_ID();

  /** Set Project. Financial Project */
  void setC_Project_ID(int C_Project_ID);

  I_C_Project getC_Project() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Rate. Currency Conversion Rate */
  BigDecimal getCurrencyRate();

  /** Set Rate. Currency Conversion Rate */
  void setCurrencyRate(BigDecimal CurrencyRate);

  /** Get Account Date. Accounting Date */
  Timestamp getDateAcct();

  /** Set Account Date. Accounting Date */
  void setDateAcct(Timestamp DateAcct);

  /** Get Document Date. Date of the Document */
  Timestamp getDateDoc();

  /** Set Document Date. Date of the Document */
  void setDateDoc(Timestamp DateDoc);

  /** Get Delta Use Life Years */
  int getDeltaUseLifeYears();

  /** Set Delta Use Life Years */
  void setDeltaUseLifeYears(int DeltaUseLifeYears);

  /** Get Delta Use Life Years (fiscal). Delta Use Life Years (fiscal) */
  int getDeltaUseLifeYears_F();

  /** Set Delta Use Life Years (fiscal). Delta Use Life Years (fiscal) */
  void setDeltaUseLifeYears_F(int DeltaUseLifeYears_F);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Document Action. The targeted status of the document */
  String getDocAction();

  /** Set Document Action. The targeted status of the document */
  void setDocAction(String DocAction);

  /** Get Document Status. The current status of the document */
  String getDocStatus();

  /** Set Document Status. The current status of the document */
  void setDocStatus(String DocStatus);

  /** Get Document No. Document sequence number of the document */
  String getDocumentNo();

  /** Set Document No. Document sequence number of the document */
  void setDocumentNo(String DocumentNo);

  /** Get Journal Batch. General Ledger Journal Batch */
  int getGL_JournalBatch_ID();

  /** Set Journal Batch. General Ledger Journal Batch */
  void setGL_JournalBatch_ID(int GL_JournalBatch_ID);

  I_GL_JournalBatch getGL_JournalBatch() throws RuntimeException;

  /** Get Imported Fixed Asset */
  int getI_FixedAsset_ID();

  /** Set Imported Fixed Asset */
  void setI_FixedAsset_ID(int I_FixedAsset_ID);

  I_I_FixedAsset getI_FixedAsset() throws RuntimeException;

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Approved. Indicates if this document requires approval */
  void setIsApproved(boolean IsApproved);

  /** Get Approved. Indicates if this document requires approval */
  boolean isApproved();

  /** Get Line No. Unique line for this document */
  int getLine();

  /** Set Line No. Unique line for this document */
  void setLine(int Line);

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

  /** Get Locator. Warehouse Locator */
  int getM_Locator_ID();

  /** Set Locator. Warehouse Locator */
  void setM_Locator_ID(int M_Locator_ID);

  I_M_Locator getM_Locator() throws RuntimeException;

  /** Get Match Invoice. Match Shipment/Receipt to Invoice */
  int getM_MatchInv_ID();

  /** Set Match Invoice. Match Shipment/Receipt to Invoice */
  void setM_MatchInv_ID(int M_MatchInv_ID);

  I_M_MatchInv getM_MatchInv() throws RuntimeException;

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Posted. Posting status */
  boolean isPosted();

  /** Set Posted. Posting status */
  void setPosted(boolean Posted);

  /** Get PostingType. The type of posted amount for the transaction */
  String getPostingType();

  /** Set PostingType. The type of posted amount for the transaction */
  void setPostingType(String PostingType);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
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

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
