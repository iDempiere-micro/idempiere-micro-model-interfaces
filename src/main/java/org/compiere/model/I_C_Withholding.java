package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Withholding
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Withholding {

  /** TableName=C_Withholding */
  String Table_Name = "C_Withholding";

  /** AD_Table_ID=304 */
  int Table_ID = 304;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Beneficiary */
  String COLUMNNAME_Beneficiary = "Beneficiary";
  /** Column name C_PaymentTerm_ID */
  String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_Withholding_ID */
  String COLUMNNAME_C_Withholding_ID = "C_Withholding_ID";
  /** Column name C_Withholding_UU */
  String COLUMNNAME_C_Withholding_UU = "C_Withholding_UU";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name FixAmt */
  String COLUMNNAME_FixAmt = "FixAmt";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsPaidTo3Party */
  String COLUMNNAME_IsPaidTo3Party = "IsPaidTo3Party";
  /** Column name IsPercentWithholding */
  String COLUMNNAME_IsPercentWithholding = "IsPercentWithholding";
  /** Column name IsTaxProrated */
  String COLUMNNAME_IsTaxProrated = "IsTaxProrated";
  /** Column name IsTaxWithholding */
  String COLUMNNAME_IsTaxWithholding = "IsTaxWithholding";
  /** Column name MaxAmt */
  String COLUMNNAME_MaxAmt = "MaxAmt";
  /** Column name MinAmt */
  String COLUMNNAME_MinAmt = "MinAmt";
  /** Column name Percent */
  String COLUMNNAME_Percent = "Percent";
  /** Column name ThresholdMax */
  String COLUMNNAME_ThresholdMax = "ThresholdMax";
  /** Column name Thresholdmin */
  String COLUMNNAME_Thresholdmin = "Thresholdmin";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Beneficiary. Business Partner to whom payment is made */
  int getBeneficiary();

  /** Set Beneficiary. Business Partner to whom payment is made */
  void setBeneficiary(int Beneficiary);

  I_C_BPartner getBenefici() throws RuntimeException;

  /** Get Payment Term. The terms of Payment (timing, discount) */
  int getC_PaymentTerm_ID();

  /** Set Payment Term. The terms of Payment (timing, discount) */
  void setC_PaymentTerm_ID(int C_PaymentTerm_ID);

  I_C_PaymentTerm getC_PaymentTerm() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Withholding. Withholding type defined */
  int getC_Withholding_ID();

  /** Set Withholding. Withholding type defined */
  void setC_Withholding_ID(int C_Withholding_ID);

  /** Get C_Withholding_UU */
  String getC_Withholding_UU();

  /** Set C_Withholding_UU */
  void setC_Withholding_UU(String C_Withholding_UU);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Fix amount. Fix amounted amount to be levied or paid */
  BigDecimal getFixAmt();

  /** Set Fix amount. Fix amounted amount to be levied or paid */
  void setFixAmt(BigDecimal FixAmt);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Paid to third party. Amount paid to someone other than the Business Partner */
  void setIsPaidTo3Party(boolean IsPaidTo3Party);

  /** Get Paid to third party. Amount paid to someone other than the Business Partner */
  boolean isPaidTo3Party();

  /** Set Percent withholding. Withholding amount is a percentage of the invoice amount */
  void setIsPercentWithholding(boolean IsPercentWithholding);

  /** Get Percent withholding. Withholding amount is a percentage of the invoice amount */
  boolean isPercentWithholding();

  /** Set Prorate tax. Tax is Prorated */
  void setIsTaxProrated(boolean IsTaxProrated);

  /** Get Prorate tax. Tax is Prorated */
  boolean isTaxProrated();

  /** Set Tax withholding. This is a tax related withholding */
  void setIsTaxWithholding(boolean IsTaxWithholding);

  /** Get Tax withholding. This is a tax related withholding */
  boolean isTaxWithholding();

  /** Get Max Amount. Maximum Amount in invoice currency */
  BigDecimal getMaxAmt();

  /** Set Max Amount. Maximum Amount in invoice currency */
  void setMaxAmt(BigDecimal MaxAmt);

  /** Get Min Amount. Minimum Amount in invoice currency */
  BigDecimal getMinAmt();

  /** Set Min Amount. Minimum Amount in invoice currency */
  void setMinAmt(BigDecimal MinAmt);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Percent. Percentage */
  BigDecimal getPercent();

  /** Set Percent. Percentage */
  void setPercent(BigDecimal Percent);

  /** Get Threshold max. Maximum gross amount for withholding calculation (0=no limit) */
  BigDecimal getThresholdMax();

  /** Set Threshold max. Maximum gross amount for withholding calculation (0=no limit) */
  void setThresholdMax(BigDecimal ThresholdMax);

  /** Get Threshold min. Minimum gross amount for withholding calculation */
  BigDecimal getThresholdmin();

  /** Set Threshold min. Minimum gross amount for withholding calculation */
  void setThresholdmin(BigDecimal Thresholdmin);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
