package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Depreciation
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Depreciation {

  /** TableName=A_Depreciation */
  String Table_Name = "A_Depreciation";

  /** AD_Table_ID=53112 */
  int Table_ID = 53112;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name A_Depreciation_ID */
  String COLUMNNAME_A_Depreciation_ID = "A_Depreciation_ID";
  /** Column name A_Depreciation_UU */
  String COLUMNNAME_A_Depreciation_UU = "A_Depreciation_UU";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DepreciationType */
  String COLUMNNAME_DepreciationType = "DepreciationType";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
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

  /** Get Depreciation */
  int getA_Depreciation_ID();

  /** Set Depreciation */
  void setA_Depreciation_ID(int A_Depreciation_ID);

  /** Get A_Depreciation_UU */
  String getA_Depreciation_UU();

  /** Set A_Depreciation_UU */
  void setA_Depreciation_UU(String A_Depreciation_UU);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get DepreciationType */
  String getDepreciationType();

  /** Set DepreciationType */
  void setDepreciationType(String DepreciationType);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

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
