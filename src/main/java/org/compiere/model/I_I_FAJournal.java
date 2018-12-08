package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for I_FAJournal
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_I_FAJournal {

  /** TableName=I_FAJournal */
  String Table_Name = "I_FAJournal";

  /** AD_Table_ID=53117 */
  int Table_ID = 53117;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name A_Asset_ID */
  String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
  /** Column name Account_ID */
  String COLUMNNAME_Account_ID = "Account_ID";
  /** Column name AccountValue */
  String COLUMNNAME_AccountValue = "AccountValue";
  /** Column name AcctSchemaName */
  String COLUMNNAME_AcctSchemaName = "AcctSchemaName";
  /** Column name AD_OrgDoc_ID */
  String COLUMNNAME_AD_OrgDoc_ID = "AD_OrgDoc_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_OrgTrx_ID */
  String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
  /** Column name A_Entry_Type */
  String COLUMNNAME_A_Entry_Type = "A_Entry_Type";
  /** Column name AmtAcctCr */
  String COLUMNNAME_AmtAcctCr = "AmtAcctCr";
  /** Column name AmtAcctDr */
  String COLUMNNAME_AmtAcctDr = "AmtAcctDr";
  /** Column name AmtSourceCr */
  String COLUMNNAME_AmtSourceCr = "AmtSourceCr";
  /** Column name AmtSourceDr */
  String COLUMNNAME_AmtSourceDr = "AmtSourceDr";
  /** Column name BatchDescription */
  String COLUMNNAME_BatchDescription = "BatchDescription";
  /** Column name BatchDocumentNo */
  String COLUMNNAME_BatchDocumentNo = "BatchDocumentNo";
  /** Column name BPartnerValue */
  String COLUMNNAME_BPartnerValue = "BPartnerValue";
  /** Column name C_AcctSchema_ID */
  String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
  /** Column name C_Activity_ID */
  String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
  /** Column name CategoryName */
  String COLUMNNAME_CategoryName = "CategoryName";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_Campaign_ID */
  String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
  /** Column name C_ConversionType_ID */
  String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name C_DocType_ID */
  String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
  /** Column name ClientValue */
  String COLUMNNAME_ClientValue = "ClientValue";
  /** Column name C_LocFrom_ID */
  String COLUMNNAME_C_LocFrom_ID = "C_LocFrom_ID";
  /** Column name C_LocTo_ID */
  String COLUMNNAME_C_LocTo_ID = "C_LocTo_ID";
  /** Column name ConversionTypeValue */
  String COLUMNNAME_ConversionTypeValue = "ConversionTypeValue";
  /** Column name C_Period_ID */
  String COLUMNNAME_C_Period_ID = "C_Period_ID";
  /** Column name C_Project_ID */
  String COLUMNNAME_C_Project_ID = "C_Project_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_SalesRegion_ID */
  String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
  /** Column name C_SubAcct_ID */
  String COLUMNNAME_C_SubAcct_ID = "C_SubAcct_ID";
  /** Column name C_UOM_ID */
  String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
  /** Column name CurrencyRate */
  String COLUMNNAME_CurrencyRate = "CurrencyRate";
  /** Column name CurrencyRateType */
  String COLUMNNAME_CurrencyRateType = "CurrencyRateType";
  /** Column name C_ValidCombination_ID */
  String COLUMNNAME_C_ValidCombination_ID = "C_ValidCombination_ID";
  /** Column name DateAcct */
  String COLUMNNAME_DateAcct = "DateAcct";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DocTypeName */
  String COLUMNNAME_DocTypeName = "DocTypeName";
  /** Column name GL_Budget_ID */
  String COLUMNNAME_GL_Budget_ID = "GL_Budget_ID";
  /** Column name GL_Category_ID */
  String COLUMNNAME_GL_Category_ID = "GL_Category_ID";
  /** Column name GL_JournalBatch_ID */
  String COLUMNNAME_GL_JournalBatch_ID = "GL_JournalBatch_ID";
  /** Column name GL_Journal_ID */
  String COLUMNNAME_GL_Journal_ID = "GL_Journal_ID";
  /** Column name GL_JournalLine_ID */
  String COLUMNNAME_GL_JournalLine_ID = "GL_JournalLine_ID";
  /** Column name I_ErrorMsg */
  String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
  /** Column name I_FAJournal_ID */
  String COLUMNNAME_I_FAJournal_ID = "I_FAJournal_ID";
  /** Column name I_FAJournal_UU */
  String COLUMNNAME_I_FAJournal_UU = "I_FAJournal_UU";
  /** Column name I_IsImported */
  String COLUMNNAME_I_IsImported = "I_IsImported";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsDepreciated */
  String COLUMNNAME_IsDepreciated = "IsDepreciated";
  /** Column name ISO_Code */
  String COLUMNNAME_ISO_Code = "ISO_Code";
  /** Column name JournalDocumentNo */
  String COLUMNNAME_JournalDocumentNo = "JournalDocumentNo";
  /** Column name Line */
  String COLUMNNAME_Line = "Line";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name OrgTrxValue */
  String COLUMNNAME_OrgTrxValue = "OrgTrxValue";
  /** Column name OrgValue */
  String COLUMNNAME_OrgValue = "OrgValue";
  /** Column name PostingType */
  String COLUMNNAME_PostingType = "PostingType";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name ProductValue */
  String COLUMNNAME_ProductValue = "ProductValue";
  /** Column name ProjectValue */
  String COLUMNNAME_ProjectValue = "ProjectValue";
  /** Column name Qty */
  String COLUMNNAME_Qty = "Qty";
  /** Column name SKU */
  String COLUMNNAME_SKU = "SKU";
  /** Column name UPC */
  String COLUMNNAME_UPC = "UPC";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name User1_ID */
  String COLUMNNAME_User1_ID = "User1_ID";
  /** Column name User2_ID */
  String COLUMNNAME_User2_ID = "User2_ID";
  /** Column name UserElement1_ID */
  String COLUMNNAME_UserElement1_ID = "UserElement1_ID";
  /** Column name UserElement2_ID */
  String COLUMNNAME_UserElement2_ID = "UserElement2_ID";

  /** Get Asset. Asset used internally or by customers */
  int getA_Asset_ID();

  /** Set Asset. Asset used internally or by customers */
  void setA_Asset_ID(int A_Asset_ID);

  /** Get Account. Account used */
  int getAccount_ID();

  /** Set Account. Account used */
  void setAccount_ID(int Account_ID);

  I_C_ElementValue getAccount() throws RuntimeException;

  /** Get Account Key. Key of Account Element */
  String getAccountValue();

  /** Set Account Key. Key of Account Element */
  void setAccountValue(String AccountValue);

  /** Get Account Schema Name. Name of the Accounting Schema */
  String getAcctSchemaName();

  /** Set Account Schema Name. Name of the Accounting Schema */
  void setAcctSchemaName(String AcctSchemaName);

  /** Get Document Org. Document Organization (independent from account organization) */
  int getAD_OrgDoc_ID();

  /** Set Document Org. Document Organization (independent from account organization) */
  void setAD_OrgDoc_ID(int AD_OrgDoc_ID);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Trx Organization. Performing or initiating organization */
  int getAD_OrgTrx_ID();

  /** Set Trx Organization. Performing or initiating organization */
  void setAD_OrgTrx_ID(int AD_OrgTrx_ID);

  /** Get Entry Type */
  String getA_Entry_Type();

  /** Set Entry Type */
  void setA_Entry_Type(String A_Entry_Type);

  /** Get Accounted Credit. Accounted Credit Amount */
  BigDecimal getAmtAcctCr();

  /** Set Accounted Credit. Accounted Credit Amount */
  void setAmtAcctCr(BigDecimal AmtAcctCr);

  /** Get Accounted Debit. Accounted Debit Amount */
  BigDecimal getAmtAcctDr();

  /** Set Accounted Debit. Accounted Debit Amount */
  void setAmtAcctDr(BigDecimal AmtAcctDr);

  /** Get Source Credit. Source Credit Amount */
  BigDecimal getAmtSourceCr();

  /** Set Source Credit. Source Credit Amount */
  void setAmtSourceCr(BigDecimal AmtSourceCr);

  /** Get Source Debit. Source Debit Amount */
  BigDecimal getAmtSourceDr();

  /** Set Source Debit. Source Debit Amount */
  void setAmtSourceDr(BigDecimal AmtSourceDr);

  /** Get Batch Description. Description of the Batch */
  String getBatchDescription();

  /** Set Batch Description. Description of the Batch */
  void setBatchDescription(String BatchDescription);

  /** Get Batch Document No. Document Number of the Batch */
  String getBatchDocumentNo();

  /** Set Batch Document No. Document Number of the Batch */
  void setBatchDocumentNo(String BatchDocumentNo);

  /** Get Business Partner Key. Key of the Business Partner */
  String getBPartnerValue();

  /** Set Business Partner Key. Key of the Business Partner */
  void setBPartnerValue(String BPartnerValue);

  /** Get Accounting Schema. Rules for accounting */
  int getC_AcctSchema_ID();

  /** Set Accounting Schema. Rules for accounting */
  void setC_AcctSchema_ID(int C_AcctSchema_ID);

  I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

  /** Get Activity. Business Activity */
  int getC_Activity_ID();

  /** Set Activity. Business Activity */
  void setC_Activity_ID(int C_Activity_ID);

  I_C_Activity getC_Activity() throws RuntimeException;

  /** Get Category Name. Name of the Category */
  String getCategoryName();

  /** Set Category Name. Name of the Category */
  void setCategoryName(String CategoryName);

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Campaign. Marketing Campaign */
  int getC_Campaign_ID();

  /** Set Campaign. Marketing Campaign */
  void setC_Campaign_ID(int C_Campaign_ID);

  I_C_Campaign getC_Campaign() throws RuntimeException;

  /** Get Currency Type. Currency Conversion Rate Type */
  int getC_ConversionType_ID();

  /** Set Currency Type. Currency Conversion Rate Type */
  void setC_ConversionType_ID(int C_ConversionType_ID);

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

  /** Get Client Key. Key of the Client */
  String getClientValue();

  /** Set Client Key. Key of the Client */
  void setClientValue(String ClientValue);

  /** Get Location From. Location that inventory was moved from */
  int getC_LocFrom_ID();

  /** Set Location From. Location that inventory was moved from */
  void setC_LocFrom_ID(int C_LocFrom_ID);

  I_C_Location getC_LocFrom() throws RuntimeException;

  /** Get Location To. Location that inventory was moved to */
  int getC_LocTo_ID();

  /** Set Location To. Location that inventory was moved to */
  void setC_LocTo_ID(int C_LocTo_ID);

  I_C_Location getC_LocTo() throws RuntimeException;

  /** Get Currency Type Key. Key value for the Currency Conversion Rate Type */
  String getConversionTypeValue();

  /** Set Currency Type Key. Key value for the Currency Conversion Rate Type */
  void setConversionTypeValue(String ConversionTypeValue);

  /** Get Period. Period of the Calendar */
  int getC_Period_ID();

  /** Set Period. Period of the Calendar */
  void setC_Period_ID(int C_Period_ID);

  I_C_Period getC_Period() throws RuntimeException;

  /** Get Project. Financial Project */
  int getC_Project_ID();

  /** Set Project. Financial Project */
  void setC_Project_ID(int C_Project_ID);

  I_C_Project getC_Project() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Sales Region. Sales coverage region */
  int getC_SalesRegion_ID();

  /** Set Sales Region. Sales coverage region */
  void setC_SalesRegion_ID(int C_SalesRegion_ID);

  I_C_SalesRegion getC_SalesRegion() throws RuntimeException;

  /** Get Sub Account. Sub account for Element Value */
  int getC_SubAcct_ID();

  /** Set Sub Account. Sub account for Element Value */
  void setC_SubAcct_ID(int C_SubAcct_ID);

  /** Get UOM. Unit of Measure */
  int getC_UOM_ID();

  /** Set UOM. Unit of Measure */
  void setC_UOM_ID(int C_UOM_ID);

  I_C_UOM getC_UOM() throws RuntimeException;

  /** Get Rate. Currency Conversion Rate */
  BigDecimal getCurrencyRate();

  /** Set Rate. Currency Conversion Rate */
  void setCurrencyRate(BigDecimal CurrencyRate);

  /** Get CurrencyRateType */
  String getCurrencyRateType();

  /** Set CurrencyRateType */
  void setCurrencyRateType(String CurrencyRateType);

  /** Get Combination. Valid Account Combination */
  int getC_ValidCombination_ID();

  /** Set Combination. Valid Account Combination */
  void setC_ValidCombination_ID(int C_ValidCombination_ID);

  I_C_ValidCombination getC_ValidCombination() throws RuntimeException;

  /** Get Account Date. Accounting Date */
  Timestamp getDateAcct();

  /** Set Account Date. Accounting Date */
  void setDateAcct(Timestamp DateAcct);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Document Type Name. Name of the Document Type */
  String getDocTypeName();

  /** Set Document Type Name. Name of the Document Type */
  void setDocTypeName(String DocTypeName);

  /** Get Budget. General Ledger Budget */
  int getGL_Budget_ID();

  /** Set Budget. General Ledger Budget */
  void setGL_Budget_ID(int GL_Budget_ID);

  I_GL_Budget getGL_Budget() throws RuntimeException;

  /** Get GL Category. General Ledger Category */
  int getGL_Category_ID();

  /** Set GL Category. General Ledger Category */
  void setGL_Category_ID(int GL_Category_ID);

  I_GL_Category getGL_Category() throws RuntimeException;

  /** Get Journal Batch. General Ledger Journal Batch */
  int getGL_JournalBatch_ID();

  /** Set Journal Batch. General Ledger Journal Batch */
  void setGL_JournalBatch_ID(int GL_JournalBatch_ID);

  I_GL_JournalBatch getGL_JournalBatch() throws RuntimeException;

  /** Get Journal. General Ledger Journal */
  int getGL_Journal_ID();

  /** Set Journal. General Ledger Journal */
  void setGL_Journal_ID(int GL_Journal_ID);

  I_GL_Journal getGL_Journal() throws RuntimeException;

  /** Get Journal Line. General Ledger Journal Line */
  int getGL_JournalLine_ID();

  /** Set Journal Line. General Ledger Journal Line */
  void setGL_JournalLine_ID(int GL_JournalLine_ID);

  I_GL_JournalLine getGL_JournalLine() throws RuntimeException;

  /** Get Import Error Message. Messages generated from import process */
  String getI_ErrorMsg();

  /** Set Import Error Message. Messages generated from import process */
  void setI_ErrorMsg(String I_ErrorMsg);

  /** Get FA Journal */
  int getI_FAJournal_ID();

  /** Set FA Journal */
  void setI_FAJournal_ID(int I_FAJournal_ID);

  /** Get I_FAJournal_UU */
  String getI_FAJournal_UU();

  /** Set I_FAJournal_UU */
  void setI_FAJournal_UU(String I_FAJournal_UU);

  /** Get Imported. Has this import been processed */
  boolean isI_IsImported();

  /** Set Imported. Has this import been processed */
  void setI_IsImported(boolean I_IsImported);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Depreciate. The asset will be depreciated */
  String getIsDepreciated();

  /** Set Depreciate. The asset will be depreciated */
  void setIsDepreciated(String IsDepreciated);

  /** Get ISO Currency Code. Three letter ISO 4217 Code of the Currency */
  String getISO_Code();

  /** Set ISO Currency Code. Three letter ISO 4217 Code of the Currency */
  void setISO_Code(String ISO_Code);

  /** Get Journal Document No. Document number of the Journal */
  String getJournalDocumentNo();

  /** Set Journal Document No. Document number of the Journal */
  void setJournalDocumentNo(String JournalDocumentNo);

  /** Get Line No. Unique line for this document */
  int getLine();

  /** Set Line No. Unique line for this document */
  void setLine(int Line);

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Trx Org Key. Key of the Transaction Organization */
  String getOrgTrxValue();

  /** Set Trx Org Key. Key of the Transaction Organization */
  void setOrgTrxValue(String OrgTrxValue);

  /** Get Org Key. Key of the Organization */
  String getOrgValue();

  /** Set Org Key. Key of the Organization */
  void setOrgValue(String OrgValue);

  /** Get PostingType. The type of posted amount for the transaction */
  String getPostingType();

  /** Set PostingType. The type of posted amount for the transaction */
  void setPostingType(String PostingType);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Product Key. Key of the Product */
  String getProductValue();

  /** Set Product Key. Key of the Product */
  void setProductValue(String ProductValue);

  /** Get Project Key. Key of the Project */
  String getProjectValue();

  /** Set Project Key. Key of the Project */
  void setProjectValue(String ProjectValue);

  /** Get Quantity. Quantity */
  BigDecimal getQty();

  /** Set Quantity. Quantity */
  void setQty(BigDecimal Qty);

  /** Get SKU. Stock Keeping Unit */
  String getSKU();

  /** Set SKU. Stock Keeping Unit */
  void setSKU(String SKU);

  /** Get UPC/EAN. Bar Code (Universal Product Code or its superset European Article Number) */
  String getUPC();

  /** Set UPC/EAN. Bar Code (Universal Product Code or its superset European Article Number) */
  void setUPC(String UPC);

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

  /** Get User Column 1. User defined accounting Element */
  int getUserElement1_ID();

  /** Set User Column 1. User defined accounting Element */
  void setUserElement1_ID(int UserElement1_ID);

  /** Get User Column 2. User defined accounting Element */
  int getUserElement2_ID();

  /** Set User Column 2. User defined accounting Element */
  void setUserElement2_ID(int UserElement2_ID);
}
