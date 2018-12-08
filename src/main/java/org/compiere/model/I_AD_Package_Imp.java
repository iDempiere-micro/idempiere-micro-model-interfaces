package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Package_Imp
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Package_Imp {

  /** TableName=AD_Package_Imp */
  String Table_Name = "AD_Package_Imp";

  /** AD_Table_ID=50003 */
  int Table_ID = 50003;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Package_Imp_ID */
  String COLUMNNAME_AD_Package_Imp_ID = "AD_Package_Imp_ID";
  /** Column name AD_Package_Imp_Proc_ID */
  String COLUMNNAME_AD_Package_Imp_Proc_ID = "AD_Package_Imp_Proc_ID";
  /** Column name AD_Package_Imp_UU */
  String COLUMNNAME_AD_Package_Imp_UU = "AD_Package_Imp_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name CreatedDate */
  String COLUMNNAME_CreatedDate = "CreatedDate";
  /** Column name Creator */
  String COLUMNNAME_Creator = "Creator";
  /** Column name CreatorContact */
  String COLUMNNAME_CreatorContact = "CreatorContact";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EMail */
  String COLUMNNAME_EMail = "EMail";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name PK_Status */
  String COLUMNNAME_PK_Status = "PK_Status";
  /** Column name PK_Version */
  String COLUMNNAME_PK_Version = "PK_Version";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name ReleaseNo */
  String COLUMNNAME_ReleaseNo = "ReleaseNo";
  /** Column name Uninstall */
  String COLUMNNAME_Uninstall = "Uninstall";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name UpdatedDate */
  String COLUMNNAME_UpdatedDate = "UpdatedDate";
  /** Column name Version */
  String COLUMNNAME_Version = "Version";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Package Imp. */
  int getAD_Package_Imp_ID();

  /** Set Package Imp. */
  void setAD_Package_Imp_ID(int AD_Package_Imp_ID);

  /** Get Package Imp. Proc. */
  int getAD_Package_Imp_Proc_ID();

  /** Set Package Imp. Proc. */
  void setAD_Package_Imp_Proc_ID(int AD_Package_Imp_Proc_ID);

  I_AD_Package_Imp_Proc getAD_Package_Imp_Proc() throws RuntimeException;

  /** Get AD_Package_Imp_UU */
  String getAD_Package_Imp_UU();

  /** Set AD_Package_Imp_UU */
  void setAD_Package_Imp_UU(String AD_Package_Imp_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get CreatedDate */
  String getCreatedDate();

  /** Set CreatedDate */
  void setCreatedDate(String CreatedDate);

  /** Get Creator */
  String getCreator();

  /** Set Creator */
  void setCreator(String Creator);

  /** Get CreatorContact */
  String getCreatorContact();

  /** Set CreatorContact */
  void setCreatorContact(String CreatorContact);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get EMail Address. Electronic Mail Address */
  String getEMail();

  /** Set EMail Address. Electronic Mail Address */
  void setEMail(String EMail);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Package Status */
  String getPK_Status();

  /** Set Package Status */
  void setPK_Status(String PK_Status);

  /** Get Package Version */
  String getPK_Version();

  /** Set Package Version */
  void setPK_Version(String PK_Version);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Release No. Internal Release Number */
  String getReleaseNo();

  /** Set Release No. Internal Release Number */
  void setReleaseNo(String ReleaseNo);

  /** Get Uninstall */
  boolean isUninstall();

  /** Set Uninstall */
  void setUninstall(boolean Uninstall);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get UpdatedDate */
  String getUpdatedDate();

  /** Set UpdatedDate */
  void setUpdatedDate(String UpdatedDate);

  /** Get Version. Version of the table definition */
  String getVersion();

  /** Set Version. Version of the table definition */
  void setVersion(String Version);
}
