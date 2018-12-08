package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Asset_Transfer
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Transfer {

  /** TableName=A_Asset_Transfer */
  String Table_Name = "A_Asset_Transfer";

  /** AD_Table_ID=53128 */
  int Table_ID = 53128;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name A_Accumdepreciation_Acct */
  String COLUMNNAME_A_Accumdepreciation_Acct = "A_Accumdepreciation_Acct";
  /** Column name A_Accumdepreciation_Acct_New */
  String COLUMNNAME_A_Accumdepreciation_Acct_New = "A_Accumdepreciation_Acct_New";
  /** Column name A_Accumdepreciation_Acct_Str */
  String COLUMNNAME_A_Accumdepreciation_Acct_Str = "A_Accumdepreciation_Acct_Str";
  /** Column name A_Accumdepreciation_New_Acct */
  String COLUMNNAME_A_Accumdepreciation_New_Acct = "A_Accumdepreciation_New_Acct";
  /** Column name A_Accumulated_Depr_F */
  String COLUMNNAME_A_Accumulated_Depr_F = "A_Accumulated_Depr_F";
  /** Column name A_Asset_Acct */
  String COLUMNNAME_A_Asset_Acct = "A_Asset_Acct";
  /** Column name A_Asset_Acct_ID */
  String COLUMNNAME_A_Asset_Acct_ID = "A_Asset_Acct_ID";
  /** Column name A_Asset_Acct_New */
  String COLUMNNAME_A_Asset_Acct_New = "A_Asset_Acct_New";
  /** Column name A_Asset_Acct_Str */
  String COLUMNNAME_A_Asset_Acct_Str = "A_Asset_Acct_Str";
  /** Column name A_Asset_ID */
  String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
  /** Column name A_Asset_New_Acct */
  String COLUMNNAME_A_Asset_New_Acct = "A_Asset_New_Acct";
  /** Column name A_Asset_Transfer_ID */
  String COLUMNNAME_A_Asset_Transfer_ID = "A_Asset_Transfer_ID";
  /** Column name A_Asset_Transfer_UU */
  String COLUMNNAME_A_Asset_Transfer_UU = "A_Asset_Transfer_UU";
  /** Column name A_CapvsExp */
  String COLUMNNAME_A_CapvsExp = "A_CapvsExp";
  /** Column name A_Depreciation_Acct */
  String COLUMNNAME_A_Depreciation_Acct = "A_Depreciation_Acct";
  /** Column name A_Depreciation_Acct_New */
  String COLUMNNAME_A_Depreciation_Acct_New = "A_Depreciation_Acct_New";
  /** Column name A_Depreciation_Acct_Str */
  String COLUMNNAME_A_Depreciation_Acct_Str = "A_Depreciation_Acct_Str";
  /** Column name A_Depreciation_New_Acct */
  String COLUMNNAME_A_Depreciation_New_Acct = "A_Depreciation_New_Acct";
  /** Column name A_Disposal_Loss */
  String COLUMNNAME_A_Disposal_Loss = "A_Disposal_Loss";
  /** Column name A_Disposal_Loss_Acct */
  String COLUMNNAME_A_Disposal_Loss_Acct = "A_Disposal_Loss_Acct";
  /** Column name A_Disposal_Loss_New */
  String COLUMNNAME_A_Disposal_Loss_New = "A_Disposal_Loss_New";
  /** Column name A_Disposal_Loss_New_Acct */
  String COLUMNNAME_A_Disposal_Loss_New_Acct = "A_Disposal_Loss_New_Acct";
  /** Column name A_Disposal_Loss_Str */
  String COLUMNNAME_A_Disposal_Loss_Str = "A_Disposal_Loss_Str";
  /** Column name A_Disposal_Revenue */
  String COLUMNNAME_A_Disposal_Revenue = "A_Disposal_Revenue";
  /** Column name A_Disposal_Revenue_Acct */
  String COLUMNNAME_A_Disposal_Revenue_Acct = "A_Disposal_Revenue_Acct";
  /** Column name A_Disposal_Revenue_New */
  String COLUMNNAME_A_Disposal_Revenue_New = "A_Disposal_Revenue_New";
  /** Column name A_Disposal_Revenue_New_Acct */
  String COLUMNNAME_A_Disposal_Revenue_New_Acct = "A_Disposal_Revenue_New_Acct";
  /** Column name A_Disposal_Revenue_Str */
  String COLUMNNAME_A_Disposal_Revenue_Str = "A_Disposal_Revenue_Str";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name A_Period_End */
  String COLUMNNAME_A_Period_End = "A_Period_End";
  /** Column name A_Period_Start */
  String COLUMNNAME_A_Period_Start = "A_Period_Start";
  /** Column name A_Split_Percent */
  String COLUMNNAME_A_Split_Percent = "A_Split_Percent";
  /** Column name A_Transfer_Balance */
  String COLUMNNAME_A_Transfer_Balance = "A_Transfer_Balance";
  /** Column name A_Transfer_Balance_IS */
  String COLUMNNAME_A_Transfer_Balance_IS = "A_Transfer_Balance_IS";
  /** Column name C_AcctSchema_ID */
  String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
  /** Column name C_Period_ID */
  String COLUMNNAME_C_Period_ID = "C_Period_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DateAcct */
  String COLUMNNAME_DateAcct = "DateAcct";
  /** Column name DateDoc */
  String COLUMNNAME_DateDoc = "DateDoc";
  /** Column name DocAction */
  String COLUMNNAME_DocAction = "DocAction";
  /** Column name DocStatus */
  String COLUMNNAME_DocStatus = "DocStatus";
  /** Column name DocumentNo */
  String COLUMNNAME_DocumentNo = "DocumentNo";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
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

  /** Get Accumulated Depreciation Account */
  int getA_Accumdepreciation_Acct();

  /** Set Accumulated Depreciation Account */
  void setA_Accumdepreciation_Acct(int A_Accumdepreciation_Acct);

  I_C_ValidCombination getA_Accumdepreciation_A() throws RuntimeException;

  /** Get New Accum Depreciation Acct */
  int getA_Accumdepreciation_Acct_New();

  /** Set New Accum Depreciation Acct */
  void setA_Accumdepreciation_Acct_New(int A_Accumdepreciation_Acct_New);

  I_C_ValidCombination getA_Accumdepreciation_Acct_() throws RuntimeException;

  /** Get Old Asset Cost Acct */
  String getA_Accumdepreciation_Acct_Str();

  /** Set Old Asset Cost Acct */
  void setA_Accumdepreciation_Acct_Str(String A_Accumdepreciation_Acct_Str);

  /** Get Accumulated Depreciation Account (new) */
  int getA_Accumdepreciation_New_Acct();

  /** Set Accumulated Depreciation Account (new) */
  void setA_Accumdepreciation_New_Acct(int A_Accumdepreciation_New_Acct);

  I_C_ValidCombination getA_Accumdepreciation_New_A() throws RuntimeException;

  /** Get Accumulated Depreciation (fiscal) */
  BigDecimal getA_Accumulated_Depr_F();

  /** Set Accumulated Depreciation (fiscal) */
  void setA_Accumulated_Depr_F(BigDecimal A_Accumulated_Depr_F);

  /** Get Asset Acct */
  int getA_Asset_Acct();

  /** Set Asset Acct */
  void setA_Asset_Acct(int A_Asset_Acct);

  I_C_ValidCombination getA_Asset_A() throws RuntimeException;

  /** Get A_Asset_Acct_ID */
  int getA_Asset_Acct_ID();

  /** Set A_Asset_Acct_ID */
  void setA_Asset_Acct_ID(int A_Asset_Acct_ID);

  /** Get New Asset Cost Acct */
  int getA_Asset_Acct_New();

  /** Set New Asset Cost Acct */
  void setA_Asset_Acct_New(int A_Asset_Acct_New);

  I_C_ValidCombination getA_Asset_Acct_() throws RuntimeException;

  /** Get A_Asset_Acct_Str */
  String getA_Asset_Acct_Str();

  /** Set A_Asset_Acct_Str */
  void setA_Asset_Acct_Str(String A_Asset_Acct_Str);

  /** Get Asset. Asset used internally or by customers */
  int getA_Asset_ID();

  /** Set Asset. Asset used internally or by customers */
  void setA_Asset_ID(int A_Asset_ID);

  I_A_Asset getA_Asset() throws RuntimeException;

  /** Get Asset Acct (new) */
  int getA_Asset_New_Acct();

  /** Set Asset Acct (new) */
  void setA_Asset_New_Acct(int A_Asset_New_Acct);

  I_C_ValidCombination getA_Asset_New_A() throws RuntimeException;

  /** Get A_Asset_Transfer_ID */
  int getA_Asset_Transfer_ID();

  /** Set A_Asset_Transfer_ID */
  void setA_Asset_Transfer_ID(int A_Asset_Transfer_ID);

  /** Get A_Asset_Transfer_UU */
  String getA_Asset_Transfer_UU();

  /** Set A_Asset_Transfer_UU */
  void setA_Asset_Transfer_UU(String A_Asset_Transfer_UU);

  /** Get Capital/Expense */
  String getA_CapvsExp();

  /** Set Capital/Expense */
  void setA_CapvsExp(String A_CapvsExp);

  /** Get Depreciation Account */
  int getA_Depreciation_Acct();

  /** Set Depreciation Account */
  void setA_Depreciation_Acct(int A_Depreciation_Acct);

  I_C_ValidCombination getA_Depreciation_A() throws RuntimeException;

  /** Get New Depreciation Exp Acct */
  int getA_Depreciation_Acct_New();

  /** Set New Depreciation Exp Acct */
  void setA_Depreciation_Acct_New(int A_Depreciation_Acct_New);

  I_C_ValidCombination getA_Depreciation_Acct_() throws RuntimeException;

  /** Get A_Depreciation_Acct_Str */
  String getA_Depreciation_Acct_Str();

  /** Set A_Depreciation_Acct_Str */
  void setA_Depreciation_Acct_Str(String A_Depreciation_Acct_Str);

  /** Get Depreciation Acct (new) */
  int getA_Depreciation_New_Acct();

  /** Set Depreciation Acct (new) */
  void setA_Depreciation_New_Acct(int A_Depreciation_New_Acct);

  I_C_ValidCombination getA_Depreciation_New_A() throws RuntimeException;

  /** Get Loss on Disposal */
  int getA_Disposal_Loss();

  /** Set Loss on Disposal */
  void setA_Disposal_Loss(int A_Disposal_Loss);

  /** Get Disposal Loss Acct */
  int getA_Disposal_Loss_Acct();

  /** Set Disposal Loss Acct */
  void setA_Disposal_Loss_Acct(int A_Disposal_Loss_Acct);

  I_C_ValidCombination getA_Disposal_Loss_A() throws RuntimeException;

  /** Get New Disposal Loss */
  int getA_Disposal_Loss_New();

  /** Set New Disposal Loss */
  void setA_Disposal_Loss_New(int A_Disposal_Loss_New);

  I_C_ValidCombination getA_Disposal_Loss_() throws RuntimeException;

  /** Get Disposal Loss Acct (new) */
  int getA_Disposal_Loss_New_Acct();

  /** Set Disposal Loss Acct (new) */
  void setA_Disposal_Loss_New_Acct(int A_Disposal_Loss_New_Acct);

  I_C_ValidCombination getA_Disposal_Loss_New_A() throws RuntimeException;

  /** Get Disposal Loss Str */
  String getA_Disposal_Loss_Str();

  /** Set Disposal Loss Str */
  void setA_Disposal_Loss_Str(String A_Disposal_Loss_Str);

  /** Get Disposal Revenue */
  int getA_Disposal_Revenue();

  /** Set Disposal Revenue */
  void setA_Disposal_Revenue(int A_Disposal_Revenue);

  /** Get Disposal Revenue Acct */
  int getA_Disposal_Revenue_Acct();

  /** Set Disposal Revenue Acct */
  void setA_Disposal_Revenue_Acct(int A_Disposal_Revenue_Acct);

  I_C_ValidCombination getA_Disposal_Revenue_A() throws RuntimeException;

  /** Get New Disposal Revenue */
  int getA_Disposal_Revenue_New();

  /** Set New Disposal Revenue */
  void setA_Disposal_Revenue_New(int A_Disposal_Revenue_New);

  I_C_ValidCombination getA_Disposal_Revenue_() throws RuntimeException;

  /** Get Disposal Revenue Acct (new) */
  int getA_Disposal_Revenue_New_Acct();

  /** Set Disposal Revenue Acct (new) */
  void setA_Disposal_Revenue_New_Acct(int A_Disposal_Revenue_New_Acct);

  I_C_ValidCombination getA_Disposal_Revenue_New_A() throws RuntimeException;

  /** Get Disposal Revenue Str */
  String getA_Disposal_Revenue_Str();

  /** Set Disposal Revenue Str */
  void setA_Disposal_Revenue_Str(String A_Disposal_Revenue_Str);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get A_Period_End */
  int getA_Period_End();

  /** Set A_Period_End */
  void setA_Period_End(int A_Period_End);

  /** Get A_Period_Start */
  int getA_Period_Start();

  /** Set A_Period_Start */
  void setA_Period_Start(int A_Period_Start);

  /** Get Split Percent */
  BigDecimal getA_Split_Percent();

  /** Set Split Percent */
  void setA_Split_Percent(BigDecimal A_Split_Percent);

  /** Get A_Transfer_Balance */
  boolean isA_Transfer_Balance();

  /** Set A_Transfer_Balance */
  void setA_Transfer_Balance(boolean A_Transfer_Balance);

  /** Get A_Transfer_Balance_IS */
  boolean isA_Transfer_Balance_IS();

  /** Set A_Transfer_Balance_IS */
  void setA_Transfer_Balance_IS(boolean A_Transfer_Balance_IS);

  /** Get Accounting Schema. Rules for accounting */
  int getC_AcctSchema_ID();

  /** Set Accounting Schema. Rules for accounting */
  void setC_AcctSchema_ID(int C_AcctSchema_ID);

  I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

  /** Get Period. Period of the Calendar */
  int getC_Period_ID();

  /** Set Period. Period of the Calendar */
  void setC_Period_ID(int C_Period_ID);

  I_C_Period getC_Period() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Account Date. Accounting Date */
  Timestamp getDateAcct();

  /** Set Account Date. Accounting Date */
  void setDateAcct(Timestamp DateAcct);

  /** Get Document Date. Date of the Document */
  Timestamp getDateDoc();

  /** Set Document Date. Date of the Document */
  void setDateDoc(Timestamp DateDoc);

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

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

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
