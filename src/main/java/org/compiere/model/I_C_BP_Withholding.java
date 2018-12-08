package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_BP_Withholding
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BP_Withholding {

  /** TableName=C_BP_Withholding */
  String Table_Name = "C_BP_Withholding";

  /** AD_Table_ID=299 */
  int Table_ID = 299;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BP_Withholding_UU */
  String COLUMNNAME_C_BP_Withholding_UU = "C_BP_Withholding_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_Withholding_ID */
  String COLUMNNAME_C_Withholding_ID = "C_Withholding_ID";
  /** Column name ExemptReason */
  String COLUMNNAME_ExemptReason = "ExemptReason";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsMandatoryWithholding */
  String COLUMNNAME_IsMandatoryWithholding = "IsMandatoryWithholding";
  /** Column name IsTemporaryExempt */
  String COLUMNNAME_IsTemporaryExempt = "IsTemporaryExempt";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get C_BP_Withholding_UU */
  String getC_BP_Withholding_UU();

  /** Set C_BP_Withholding_UU */
  void setC_BP_Withholding_UU(String C_BP_Withholding_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Withholding. Withholding type defined */
  int getC_Withholding_ID();

  /** Set Withholding. Withholding type defined */
  void setC_Withholding_ID(int C_Withholding_ID);

  I_C_Withholding getC_Withholding() throws RuntimeException;

  /** Get Exempt reason. Reason for not withholding */
  String getExemptReason();

  /** Set Exempt reason. Reason for not withholding */
  void setExemptReason(String ExemptReason);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Mandatory Withholding. Monies must be withheld */
  void setIsMandatoryWithholding(boolean IsMandatoryWithholding);

  /** Get Mandatory Withholding. Monies must be withheld */
  boolean isMandatoryWithholding();

  /** Set Temporary exempt. Temporarily do not withhold taxes */
  void setIsTemporaryExempt(boolean IsTemporaryExempt);

  /** Get Temporary exempt. Temporarily do not withhold taxes */
  boolean isTemporaryExempt();

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
