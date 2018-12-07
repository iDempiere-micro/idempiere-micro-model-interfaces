package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Depreciation_Workfile
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Depreciation_Workfile {

  /** TableName=A_Depreciation_Workfile */
  String Table_Name = "A_Depreciation_Workfile";

  /** AD_Table_ID=53116 */
  int Table_ID = 53116;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name A_Accumulated_Depr */
  String COLUMNNAME_A_Accumulated_Depr = "A_Accumulated_Depr";
  /** Column name A_Accumulated_Depr_F */
  String COLUMNNAME_A_Accumulated_Depr_F = "A_Accumulated_Depr_F";
  /** Column name A_Asset_Cost */
  String COLUMNNAME_A_Asset_Cost = "A_Asset_Cost";
  /** Column name A_Asset_ID */
  String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
  /** Column name A_Asset_Life_Current_Year */
  String COLUMNNAME_A_Asset_Life_Current_Year = "A_Asset_Life_Current_Year";
  /** Column name A_Asset_Life_Years */
  String COLUMNNAME_A_Asset_Life_Years = "A_Asset_Life_Years";
  /** Column name A_Asset_Life_Years_F */
  String COLUMNNAME_A_Asset_Life_Years_F = "A_Asset_Life_Years_F";
  /** Column name A_Asset_Remaining */
  String COLUMNNAME_A_Asset_Remaining = "A_Asset_Remaining";
  /** Column name A_Asset_Remaining_F */
  String COLUMNNAME_A_Asset_Remaining_F = "A_Asset_Remaining_F";
  /** Column name A_Base_Amount */
  String COLUMNNAME_A_Base_Amount = "A_Base_Amount";
  /** Column name A_Calc_Accumulated_Depr */
  String COLUMNNAME_A_Calc_Accumulated_Depr = "A_Calc_Accumulated_Depr";
  /** Column name A_Curr_Dep_Exp */
  String COLUMNNAME_A_Curr_Dep_Exp = "A_Curr_Dep_Exp";
  /** Column name A_Current_Period */
  String COLUMNNAME_A_Current_Period = "A_Current_Period";
  /** Column name A_Depreciation_Workfile_ID */
  String COLUMNNAME_A_Depreciation_Workfile_ID = "A_Depreciation_Workfile_ID";
  /** Column name A_Depreciation_Workfile_UU */
  String COLUMNNAME_A_Depreciation_Workfile_UU = "A_Depreciation_Workfile_UU";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name A_Expense_SL */
  String COLUMNNAME_A_Expense_SL = "A_Expense_SL";
  /** Column name A_Expense_SL_F */
  String COLUMNNAME_A_Expense_SL_F = "A_Expense_SL_F";
  /** Column name A_FundingMode_ID */
  String COLUMNNAME_A_FundingMode_ID = "A_FundingMode_ID";
  /** Column name A_Life_Period */
  String COLUMNNAME_A_Life_Period = "A_Life_Period";
  /** Column name A_Life_Period_F */
  String COLUMNNAME_A_Life_Period_F = "A_Life_Period_F";
  /** Column name A_Life_Period_Max */
  String COLUMNNAME_A_Life_Period_Max = "A_Life_Period_Max";
  /** Column name A_Life_Period_Min */
  String COLUMNNAME_A_Life_Period_Min = "A_Life_Period_Min";
  /** Column name A_Period_Forecast */
  String COLUMNNAME_A_Period_Forecast = "A_Period_Forecast";
  /** Column name A_Period_Posted */
  String COLUMNNAME_A_Period_Posted = "A_Period_Posted";
  /** Column name A_Prior_Year_Accumulated_Depr */
  String COLUMNNAME_A_Prior_Year_Accumulated_Depr = "A_Prior_Year_Accumulated_Depr";
  /** Column name A_QTY_Current */
  String COLUMNNAME_A_QTY_Current = "A_QTY_Current";
  /** Column name A_Salvage_Value */
  String COLUMNNAME_A_Salvage_Value = "A_Salvage_Value";
  /** Column name AssetDepreciationDate */
  String COLUMNNAME_AssetDepreciationDate = "AssetDepreciationDate";
  /** Column name A_Tip_Finantare */
  String COLUMNNAME_A_Tip_Finantare = "A_Tip_Finantare";
  /** Column name A_Valoare_Cofinantare */
  String COLUMNNAME_A_Valoare_Cofinantare = "A_Valoare_Cofinantare";
  /** Column name A_Valoare_Tert */
  String COLUMNNAME_A_Valoare_Tert = "A_Valoare_Tert";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DateAcct */
  String COLUMNNAME_DateAcct = "DateAcct";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
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
  /** Column name UseLifeYears */
  String COLUMNNAME_UseLifeYears = "UseLifeYears";
  /** Column name UseLifeYears_F */
  String COLUMNNAME_UseLifeYears_F = "UseLifeYears_F";

  /** Get Accumulated Depreciation */
  BigDecimal getA_Accumulated_Depr();

  /** Set Accumulated Depreciation */
  void setA_Accumulated_Depr(BigDecimal A_Accumulated_Depr);

  /** Get Accumulated Depreciation (fiscal) */
  BigDecimal getA_Accumulated_Depr_F();

  /** Set Accumulated Depreciation (fiscal) */
  void setA_Accumulated_Depr_F(BigDecimal A_Accumulated_Depr_F);

  /** Get Asset Cost */
  BigDecimal getA_Asset_Cost();

  /** Set Asset Cost */
  void setA_Asset_Cost(BigDecimal A_Asset_Cost);

  /** Get Asset. Asset used internally or by customers */
  int getA_Asset_ID();

  /** Set Asset. Asset used internally or by customers */
  void setA_Asset_ID(int A_Asset_ID);

  I_A_Asset getA_Asset() throws RuntimeException;

  /** Get A_Asset_Life_Current_Year */
  BigDecimal getA_Asset_Life_Current_Year();

  /** Set A_Asset_Life_Current_Year */
  void setA_Asset_Life_Current_Year(BigDecimal A_Asset_Life_Current_Year);

  /** Get Life Years */
  int getA_Asset_Life_Years();

  /** Set Life Years */
  void setA_Asset_Life_Years(int A_Asset_Life_Years);

  /** Get Life Years (fiscal) */
  int getA_Asset_Life_Years_F();

  /** Set Life Years (fiscal) */
  void setA_Asset_Life_Years_F(int A_Asset_Life_Years_F);

  /** Get Remaining Amt */
  BigDecimal getA_Asset_Remaining();

  /** Set Remaining Amt */
  void setA_Asset_Remaining(BigDecimal A_Asset_Remaining);

  /** Get Remaining Amt (fiscal) */
  BigDecimal getA_Asset_Remaining_F();

  /** Set Remaining Amt (fiscal) */
  void setA_Asset_Remaining_F(BigDecimal A_Asset_Remaining_F);

  /** Get A_Base_Amount */
  BigDecimal getA_Base_Amount();

  /** Set A_Base_Amount */
  void setA_Base_Amount(BigDecimal A_Base_Amount);

  /** Get A_Calc_Accumulated_Depr */
  BigDecimal getA_Calc_Accumulated_Depr();

  /** Set A_Calc_Accumulated_Depr */
  void setA_Calc_Accumulated_Depr(BigDecimal A_Calc_Accumulated_Depr);

  /** Get A_Curr_Dep_Exp */
  BigDecimal getA_Curr_Dep_Exp();

  /** Set A_Curr_Dep_Exp */
  void setA_Curr_Dep_Exp(BigDecimal A_Curr_Dep_Exp);

  /** Get Current Period */
  int getA_Current_Period();

  /** Set Current Period */
  void setA_Current_Period(int A_Current_Period);

  /** Get A_Depreciation_Workfile_ID */
  int getA_Depreciation_Workfile_ID();

  /** Set A_Depreciation_Workfile_ID */
  void setA_Depreciation_Workfile_ID(int A_Depreciation_Workfile_ID);

  /** Get A_Depreciation_Workfile_UU */
  String getA_Depreciation_Workfile_UU();

  /** Set A_Depreciation_Workfile_UU */
  void setA_Depreciation_Workfile_UU(String A_Depreciation_Workfile_UU);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get SL Expense/Period */
  BigDecimal getA_Expense_SL();

  /** Set SL Expense/Period */
  void setA_Expense_SL(BigDecimal A_Expense_SL);

  /** Get SL Expense/Period (fiscal) */
  BigDecimal getA_Expense_SL_F();

  /** Set SL Expense/Period (fiscal) */
  void setA_Expense_SL_F(BigDecimal A_Expense_SL_F);

  /** Get Asset Funding Mode */
  int getA_FundingMode_ID();

  /** Set Asset Funding Mode */
  void setA_FundingMode_ID(int A_FundingMode_ID);

  I_A_FundingMode getA_FundingMode() throws RuntimeException;

  /** Get Life Periods */
  int getA_Life_Period();

  /** Set Life Periods */
  void setA_Life_Period(int A_Life_Period);

  /** Get Life Period (fiscal) */
  int getA_Life_Period_F();

  /** Set Life Period (fiscal) */
  void setA_Life_Period_F(int A_Life_Period_F);

  /** Get Life periods (max) */
  int getA_Life_Period_Max();

  /** Set Life periods (max) */
  void setA_Life_Period_Max(int A_Life_Period_Max);

  /** Get Life periods (min) */
  int getA_Life_Period_Min();

  /** Set Life periods (min) */
  void setA_Life_Period_Min(int A_Life_Period_Min);

  /** Get A_Period_Forecast */
  BigDecimal getA_Period_Forecast();

  /** Set A_Period_Forecast */
  void setA_Period_Forecast(BigDecimal A_Period_Forecast);

  /** Get A_Period_Posted */
  int getA_Period_Posted();

  /** Set A_Period_Posted */
  void setA_Period_Posted(int A_Period_Posted);

  /** Get A_Prior_Year_Accumulated_Depr */
  BigDecimal getA_Prior_Year_Accumulated_Depr();

  /** Set A_Prior_Year_Accumulated_Depr */
  void setA_Prior_Year_Accumulated_Depr(BigDecimal A_Prior_Year_Accumulated_Depr);

  /** Get Current Qty */
  BigDecimal getA_QTY_Current();

  /** Set Current Qty */
  void setA_QTY_Current(BigDecimal A_QTY_Current);

  /** Get Asset Salvage Value */
  BigDecimal getA_Salvage_Value();

  /** Set Asset Salvage Value */
  void setA_Salvage_Value(BigDecimal A_Salvage_Value);

  /** Get Asset Depreciation Date. Date of last depreciation */
  Timestamp getAssetDepreciationDate();

  /** Set Asset Depreciation Date. Date of last depreciation */
  void setAssetDepreciationDate(Timestamp AssetDepreciationDate);

  /** Get Financing Type. Financing Type */
  String getA_Tip_Finantare();

  /** Set Financing Type. Financing Type */
  void setA_Tip_Finantare(String A_Tip_Finantare);

  /** Get Own contribution */
  BigDecimal getA_Valoare_Cofinantare();

  /** Set Own contribution */
  void setA_Valoare_Cofinantare(BigDecimal A_Valoare_Cofinantare);

  /** Get Third contribution */
  BigDecimal getA_Valoare_Tert();

  /** Set Third contribution */
  void setA_Valoare_Tert(BigDecimal A_Valoare_Tert);

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

  /** Get Usable Life - Years. Years of the usable life of the asset */
  int getUseLifeYears();

  /** Set Usable Life - Years. Years of the usable life of the asset */
  void setUseLifeYears(int UseLifeYears);

  /** Get Use Life - Years (fiscal) */
  int getUseLifeYears_F();

  /** Set Use Life - Years (fiscal) */
  void setUseLifeYears_F(int UseLifeYears_F);
}
