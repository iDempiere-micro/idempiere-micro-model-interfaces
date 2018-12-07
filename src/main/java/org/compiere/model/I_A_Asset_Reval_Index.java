package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Asset_Reval_Index
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Reval_Index {

  /** TableName=A_Asset_Reval_Index */
  String Table_Name = "A_Asset_Reval_Index";

  /** AD_Table_ID=53120 */
  int Table_ID = 53120;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name A_Asset_Reval_Index_ID */
  String COLUMNNAME_A_Asset_Reval_Index_ID = "A_Asset_Reval_Index_ID";
  /** Column name A_Asset_Reval_Index_UU */
  String COLUMNNAME_A_Asset_Reval_Index_UU = "A_Asset_Reval_Index_UU";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name A_Effective_Date */
  String COLUMNNAME_A_Effective_Date = "A_Effective_Date";
  /** Column name A_Reval_Code */
  String COLUMNNAME_A_Reval_Code = "A_Reval_Code";
  /** Column name A_Reval_Multiplier */
  String COLUMNNAME_A_Reval_Multiplier = "A_Reval_Multiplier";
  /** Column name A_Reval_Rate */
  String COLUMNNAME_A_Reval_Rate = "A_Reval_Rate";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Asset Reval Index */
  int getA_Asset_Reval_Index_ID();

  /** Set Asset Reval Index */
  void setA_Asset_Reval_Index_ID(int A_Asset_Reval_Index_ID);

  /** Get A_Asset_Reval_Index_UU */
  String getA_Asset_Reval_Index_UU();

  /** Set A_Asset_Reval_Index_UU */
  void setA_Asset_Reval_Index_UU(String A_Asset_Reval_Index_UU);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Effective Date */
  Timestamp getA_Effective_Date();

  /** Set Effective Date */
  void setA_Effective_Date(Timestamp A_Effective_Date);

  /** Get Reval. Code */
  String getA_Reval_Code();

  /** Set Reval. Code */
  void setA_Reval_Code(String A_Reval_Code);

  /** Get Reval. Multiplier */
  String getA_Reval_Multiplier();

  /** Set Reval. Multiplier */
  void setA_Reval_Multiplier(String A_Reval_Multiplier);

  /** Get Reval. Rate */
  BigDecimal getA_Reval_Rate();

  /** Set Reval. Rate */
  void setA_Reval_Rate(BigDecimal A_Reval_Rate);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
