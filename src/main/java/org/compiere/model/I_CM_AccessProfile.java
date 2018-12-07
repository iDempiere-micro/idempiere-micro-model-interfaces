package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for CM_AccessProfile
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_CM_AccessProfile {

  /** TableName=CM_AccessProfile */
  String Table_Name = "CM_AccessProfile";

  /** AD_Table_ID=885 */
  int Table_ID = 885;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name CM_AccessProfile_ID */
  String COLUMNNAME_CM_AccessProfile_ID = "CM_AccessProfile_ID";
  /** Column name CM_AccessProfile_UU */
  String COLUMNNAME_CM_AccessProfile_UU = "CM_AccessProfile_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsExclude */
  String COLUMNNAME_IsExclude = "IsExclude";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Web Access Profile. Web Access Profile */
  int getCM_AccessProfile_ID();

  /** Set Web Access Profile. Web Access Profile */
  void setCM_AccessProfile_ID(int CM_AccessProfile_ID);

  /** Get CM_AccessProfile_UU */
  String getCM_AccessProfile_UU();

  /** Set CM_AccessProfile_UU */
  void setCM_AccessProfile_UU(String CM_AccessProfile_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Exclude. Exclude access to the data - if not selected Include access to the data */
  void setIsExclude(boolean IsExclude);

  /** Get Exclude. Exclude access to the data - if not selected Include access to the data */
  boolean isExclude();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
