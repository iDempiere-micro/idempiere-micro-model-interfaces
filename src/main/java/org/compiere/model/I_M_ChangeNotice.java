package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ChangeNotice
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ChangeNotice {

  /** TableName=M_ChangeNotice */
  String Table_Name = "M_ChangeNotice";

  /** AD_Table_ID=799 */
  int Table_ID = 799;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DetailInfo */
  String COLUMNNAME_DetailInfo = "DetailInfo";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsApproved */
  String COLUMNNAME_IsApproved = "IsApproved";
  /** Column name M_ChangeNotice_ID */
  String COLUMNNAME_M_ChangeNotice_ID = "M_ChangeNotice_ID";
  /** Column name M_ChangeNotice_UU */
  String COLUMNNAME_M_ChangeNotice_UU = "M_ChangeNotice_UU";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Detail Information. Additional Detail Information */
  String getDetailInfo();

  /** Set Detail Information. Additional Detail Information */
  void setDetailInfo(String DetailInfo);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Approved. Indicates if this document requires approval */
  void setIsApproved(boolean IsApproved);

  /** Get Approved. Indicates if this document requires approval */
  boolean isApproved();

  /** Get Change Notice. Bill of Materials (Engineering) Change Notice (Version) */
  int getM_ChangeNotice_ID();

  /** Set Change Notice. Bill of Materials (Engineering) Change Notice (Version) */
  void setM_ChangeNotice_ID(int M_ChangeNotice_ID);

  /** Get M_ChangeNotice_UU */
  String getM_ChangeNotice_UU();

  /** Set M_ChangeNotice_UU */
  void setM_ChangeNotice_UU(String M_ChangeNotice_UU);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

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
}
