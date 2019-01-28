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
    /** Column name A_Entry_Type */
  String COLUMNNAME_A_Entry_Type = "A_Entry_Type";
  /** Column name A_Period */
  String COLUMNNAME_A_Period = "A_Period";
  /** Column name CR_Account_ID */
  String COLUMNNAME_CR_Account_ID = "CR_Account_ID";
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
    /** Column name IsDepreciated */
  String COLUMNNAME_IsDepreciated = "IsDepreciated";
  /** Column name PostingType */
  String COLUMNNAME_PostingType = "PostingType";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
    /** Column name UseLifeMonths */
  String COLUMNNAME_UseLifeMonths = "UseLifeMonths";
  /** Column name UseLifeMonths_F */
  String COLUMNNAME_UseLifeMonths_F = "UseLifeMonths_F";

  /** Get A_Account_Number_Acct */
  int getA_Account_Number_Acct();

  /** Set A_Account_Number_Acct */
  void setA_Account_Number_Acct(int A_Account_Number_Acct);

    /** Get Accumulated Depreciation */
  BigDecimal getA_Accumulated_Depr();

  /** Set Accumulated Depreciation */
  void setA_Accumulated_Depr(BigDecimal A_Accumulated_Depr);

    /** Set Accumulated Depreciation (delta) */
  void setA_Accumulated_Depr_Delta(BigDecimal A_Accumulated_Depr_Delta);

  /** Get Accumulated Depreciation (fiscal) */
  BigDecimal getA_Accumulated_Depr_F();

  /** Set Accumulated Depreciation (fiscal) */
  void setA_Accumulated_Depr_F(BigDecimal A_Accumulated_Depr_F);

    /** Set Accumulated Depreciation - fiscal (delta) */
  void setA_Accumulated_Depr_F_Delta(BigDecimal A_Accumulated_Depr_F_Delta);

  /** Get Asset Addition */
  int getA_Asset_Addition_ID();

    /** Set Asset Cost */
  void setA_Asset_Cost(BigDecimal A_Asset_Cost);

    /** Get Asset Disposed */
  int getA_Asset_Disposed_ID();

    /** Get Asset. Asset used internally or by customers */
  int getA_Asset_ID();

  /** Set Asset. Asset used internally or by customers */
  void setA_Asset_ID(int A_Asset_ID);

    /** Set Remaining Amt */
  void setA_Asset_Remaining(BigDecimal A_Asset_Remaining);

    /** Set Remaining Amt (fiscal) */
  void setA_Asset_Remaining_F(BigDecimal A_Asset_Remaining_F);

  /** Get Depreciation Entry */
  int getA_Depreciation_Entry_ID();

    /** Get A_Depreciation_Exp_ID */
  int getA_Depreciation_Exp_ID();

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

    /** Get Account Date. Accounting Date */
  Timestamp getDateAcct();

  /** Set Account Date. Accounting Date */
  void setDateAcct(Timestamp DateAcct);

    /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Account (debit). Account used */
  int getDR_Account_ID();

  /** Set Account (debit). Account used */
  void setDR_Account_ID(int DR_Account_ID);

    /** Get Expense */
  BigDecimal getExpense();

  /** Set Expense */
  void setExpense(BigDecimal Expense);

  /** Get Expense (fiscal) */
  BigDecimal getExpense_F();

  /** Set Expense (fiscal) */
  void setExpense_F(BigDecimal Expense_F);

    /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

    /** Set Depreciate. The asset will be depreciated */
  void setIsDepreciated(boolean IsDepreciated);

    /** Get PostingType. The type of posted amount for the transaction */
  String getPostingType();

  /** Set PostingType. The type of posted amount for the transaction */
  void setPostingType(String PostingType);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

    /** Set Usable Life - Months. Months of the usable life of the asset */
  void setUseLifeMonths(int UseLifeMonths);

    /** Set Use Life - Months (fiscal) */
  void setUseLifeMonths_F(int UseLifeMonths_F);
}
