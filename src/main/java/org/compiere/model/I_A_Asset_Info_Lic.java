package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Asset_Info_Lic
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Info_Lic {

  /** TableName=A_Asset_Info_Lic */
  String Table_Name = "A_Asset_Info_Lic";

  /** AD_Table_ID=53134 */
  int Table_ID = 53134;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name A_Asset_ID */
  String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
  /** Column name A_Asset_Info_Lic_ID */
  String COLUMNNAME_A_Asset_Info_Lic_ID = "A_Asset_Info_Lic_ID";
  /** Column name A_Asset_Info_Lic_UU */
  String COLUMNNAME_A_Asset_Info_Lic_UU = "A_Asset_Info_Lic_UU";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name A_Issuing_Agency */
  String COLUMNNAME_A_Issuing_Agency = "A_Issuing_Agency";
  /** Column name A_License_Fee */
  String COLUMNNAME_A_License_Fee = "A_License_Fee";
  /** Column name A_License_No */
  String COLUMNNAME_A_License_No = "A_License_No";
  /** Column name A_Renewal_Date */
  String COLUMNNAME_A_Renewal_Date = "A_Renewal_Date";
  /** Column name A_State */
  String COLUMNNAME_A_State = "A_State";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Text */
  String COLUMNNAME_Text = "Text";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Asset. Asset used internally or by customers */
  int getA_Asset_ID();

  /** Set Asset. Asset used internally or by customers */
  void setA_Asset_ID(int A_Asset_ID);

  I_A_Asset getA_Asset() throws RuntimeException;

  /** Get A_Asset_Info_Lic_ID */
  int getA_Asset_Info_Lic_ID();

  /** Set A_Asset_Info_Lic_ID */
  void setA_Asset_Info_Lic_ID(int A_Asset_Info_Lic_ID);

  /** Get A_Asset_Info_Lic_UU */
  String getA_Asset_Info_Lic_UU();

  /** Set A_Asset_Info_Lic_UU */
  void setA_Asset_Info_Lic_UU(String A_Asset_Info_Lic_UU);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Issuing Agency */
  String getA_Issuing_Agency();

  /** Set Issuing Agency */
  void setA_Issuing_Agency(String A_Issuing_Agency);

  /** Get Asset License Fee */
  BigDecimal getA_License_Fee();

  /** Set Asset License Fee */
  void setA_License_Fee(BigDecimal A_License_Fee);

  /** Get Asset License No */
  String getA_License_No();

  /** Set Asset License No */
  void setA_License_No(String A_License_No);

  /** Get Asset Renewal Date */
  Timestamp getA_Renewal_Date();

  /** Set Asset Renewal Date */
  void setA_Renewal_Date(Timestamp A_Renewal_Date);

  /** Get Account State. State of the Credit Card or Account holder */
  String getA_State();

  /** Set Account State. State of the Credit Card or Account holder */
  void setA_State(String A_State);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Description */
  String getText();

  /** Set Description */
  void setText(String Text);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
