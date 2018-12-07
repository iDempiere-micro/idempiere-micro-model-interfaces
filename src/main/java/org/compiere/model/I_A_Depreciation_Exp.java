package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Depreciation_Exp
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Depreciation_Exp {

  /** TableName=A_Depreciation_Exp */
  String Table_Name = "A_Depreciation_Exp";

  /** AD_Table_ID=53115 */
  int Table_ID = 53115;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name A_Account_Number_Acct */
  String COLUMNNAME_A_Account_Number_Acct = "A_Account_Number_Acct";
  /** Column name A_Accumulated_Depr */
  String COLUMNNAME_A_Accumulated_Depr = "A_Accumulated_Depr";
  /** Column name A_Accumulated_Depr_Delta */
  String COLUMNNAME_A_Accumulated_Depr_Delta = "A_Accumulated_Depr_Delta";
  /** Column name A_Accumulated_Depr_F */
  String COLUMNNAME_A_Accumulated_Depr_F = "A_Accumulated_Depr_F";
  /** Column name A_Accumulated_Depr_F_Delta */
  String COLUMNNAME_A_Accumulated_Depr_F_Delta = "A_Accumulated_Depr_F_Delta";
  /** Column name A_Asset_Addition_ID */
  String COLUMNNAME_A_Asset_Addition_ID = "A_Asset_Addition_ID";
  /** Column name A_Asset_Cost */
  String COLUMNNAME_A_Asset_Cost = "A_Asset_Cost";
  /** Column name A_Asset_Cost_Delta */
  String COLUMNNAME_A_Asset_Cost_Delta = "A_Asset_Cost_Delta";
  /** Column name A_Asset_Disposed_ID */
  String COLUMNNAME_A_Asset_Disposed_ID = "A_Asset_Disposed_ID";
  /** Column name A_Asset_ID */
  String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
  /** Column name A_Asset_Remaining */
  String COLUMNNAME_A_Asset_Remaining = "A_Asset_Remaining";
  /** Column name A_Asset_Remaining_F */
  String COLUMNNAME_A_Asset_Remaining_F = "A_Asset_Remaining_F";
  /** Column name A_Depreciation_Entry_ID */
  String COLUMNNAME_A_Depreciation_Entry_ID = "A_Depreciation_Entry_ID";
  /** Column name A_Depreciation_Exp_ID */
  String COLUMNNAME_A_Depreciation_Exp_ID = "A_Depreciation_Exp_ID";
  /** Column name A_Depreciation_Exp_UU */
  String COLUMNNAME_A_Depreciation_Exp_UU = "A_Depreciation_Exp_UU";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name A_Entry_Type */
  String COLUMNNAME_A_Entry_Type = "A_Entry_Type";
  /** Column name A_Period */
  String COLUMNNAME_A_Period = "A_Period";
  /** Column name CR_Account_ID */
  String COLUMNNAME_CR_Account_ID = "CR_Account_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DateAcct */
  String COLUMNNAME_DateAcct = "DateAcct";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DR_Account_ID */
  String COLUMNNAME_DR_Account_ID = "DR_Account_ID";
  /** Column name Expense */
  String COLUMNNAME_Expense = "Expense";
  /** Column name Expense_F */
  String COLUMNNAME_Expense_F = "Expense_F";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsDepreciated */
  String COLUMNNAME_IsDepreciated = "IsDepreciated";
  /** Column name PostingType */
  String COLUMNNAME_PostingType = "PostingType";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name UseLifeMonths */
  String COLUMNNAME_UseLifeMonths = "UseLifeMonths";
  /** Column name UseLifeMonths_F */
  String COLUMNNAME_UseLifeMonths_F = "UseLifeMonths_F";

  /** Get A_Account_Number_Acct */
  int getA_Account_Number_Acct();

  /** Set A_Account_Number_Acct */
  void setA_Account_Number_Acct(int A_Account_Number_Acct);

  I_C_ValidCombination getA_Account_Number_A() throws RuntimeException;

  /** Get Accumulated Depreciation */
  BigDecimal getA_Accumulated_Depr();

  /** Set Accumulated Depreciation */
  void setA_Accumulated_Depr(BigDecimal A_Accumulated_Depr);

  /** Get Accumulated Depreciation (delta) */
  BigDecimal getA_Accumulated_Depr_Delta();

  /** Set Accumulated Depreciation (delta) */
  void setA_Accumulated_Depr_Delta(BigDecimal A_Accumulated_Depr_Delta);

  /** Get Accumulated Depreciation (fiscal) */
  BigDecimal getA_Accumulated_Depr_F();

  /** Set Accumulated Depreciation (fiscal) */
  void setA_Accumulated_Depr_F(BigDecimal A_Accumulated_Depr_F);

  /** Get Accumulated Depreciation - fiscal (delta) */
  BigDecimal getA_Accumulated_Depr_F_Delta();

  /** Set Accumulated Depreciation - fiscal (delta) */
  void setA_Accumulated_Depr_F_Delta(BigDecimal A_Accumulated_Depr_F_Delta);

  /** Get Asset Addition */
  int getA_Asset_Addition_ID();

  /** Set Asset Addition */
  void setA_Asset_Addition_ID(int A_Asset_Addition_ID);

  I_A_Asset_Addition getA_Asset_Addition() throws RuntimeException;

  /** Get Asset Cost */
  BigDecimal getA_Asset_Cost();

  /** Set Asset Cost */
  void setA_Asset_Cost(BigDecimal A_Asset_Cost);

  /** Get Delta Asset Cost */
  BigDecimal getA_Asset_Cost_Delta();

  /** Set Delta Asset Cost */
  void setA_Asset_Cost_Delta(BigDecimal A_Asset_Cost_Delta);

  /** Get Asset Disposed */
  int getA_Asset_Disposed_ID();

  /** Set Asset Disposed */
  void setA_Asset_Disposed_ID(int A_Asset_Disposed_ID);

  I_A_Asset_Disposed getA_Asset_Disposed() throws RuntimeException;

  /** Get Asset. Asset used internally or by customers */
  int getA_Asset_ID();

  /** Set Asset. Asset used internally or by customers */
  void setA_Asset_ID(int A_Asset_ID);

  I_A_Asset getA_Asset() throws RuntimeException;

  /** Get Remaining Amt */
  BigDecimal getA_Asset_Remaining();

  /** Set Remaining Amt */
  void setA_Asset_Remaining(BigDecimal A_Asset_Remaining);

  /** Get Remaining Amt (fiscal) */
  BigDecimal getA_Asset_Remaining_F();

  /** Set Remaining Amt (fiscal) */
  void setA_Asset_Remaining_F(BigDecimal A_Asset_Remaining_F);

  /** Get Depreciation Entry */
  int getA_Depreciation_Entry_ID();

  /** Set Depreciation Entry */
  void setA_Depreciation_Entry_ID(int A_Depreciation_Entry_ID);

  I_A_Depreciation_Entry getA_Depreciation_Entry() throws RuntimeException;

  /** Get A_Depreciation_Exp_ID */
  int getA_Depreciation_Exp_ID();

  /** Set A_Depreciation_Exp_ID */
  void setA_Depreciation_Exp_ID(int A_Depreciation_Exp_ID);

  /** Get A_Depreciation_Exp_UU */
  String getA_Depreciation_Exp_UU();

  /** Set A_Depreciation_Exp_UU */
  void setA_Depreciation_Exp_UU(String A_Depreciation_Exp_UU);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Entry Type */
  String getA_Entry_Type();

  /** Set Entry Type */
  void setA_Entry_Type(String A_Entry_Type);

  /** Get Asset Period */
  int getA_Period();

  /** Set Asset Period */
  void setA_Period(int A_Period);

  /** Get Account (credit). Account used */
  int getCR_Account_ID();

  /** Set Account (credit). Account used */
  void setCR_Account_ID(int CR_Account_ID);

  I_C_ValidCombination getCR_Account() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Account Date. Accounting Date */
  Timestamp getDateAcct();

  /** Set Account Date. Accounting Date */
  void setDateAcct(Timestamp DateAcct);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Account (debit). Account used */
  int getDR_Account_ID();

  /** Set Account (debit). Account used */
  void setDR_Account_ID(int DR_Account_ID);

  I_C_ValidCombination getDR_Account() throws RuntimeException;

  /** Get Expense */
  BigDecimal getExpense();

  /** Set Expense */
  void setExpense(BigDecimal Expense);

  /** Get Expense (fiscal) */
  BigDecimal getExpense_F();

  /** Set Expense (fiscal) */
  void setExpense_F(BigDecimal Expense_F);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Depreciate. The asset will be depreciated */
  void setIsDepreciated(boolean IsDepreciated);

  /** Get Depreciate. The asset will be depreciated */
  boolean isDepreciated();

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

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Usable Life - Months. Months of the usable life of the asset */
  int getUseLifeMonths();

  /** Set Usable Life - Months. Months of the usable life of the asset */
  void setUseLifeMonths(int UseLifeMonths);

  /** Get Use Life - Months (fiscal) */
  int getUseLifeMonths_F();

  /** Set Use Life - Months (fiscal) */
  void setUseLifeMonths_F(int UseLifeMonths_F);
}
