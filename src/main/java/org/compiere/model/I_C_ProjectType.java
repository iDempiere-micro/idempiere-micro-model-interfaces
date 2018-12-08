package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_ProjectType
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_ProjectType {

  /** TableName=C_ProjectType */
  String Table_Name = "C_ProjectType";

  /** AD_Table_ID=575 */
  int Table_ID = 575;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_ProjectType_ID */
  String COLUMNNAME_C_ProjectType_ID = "C_ProjectType_ID";
  /** Column name C_ProjectType_UU */
  String COLUMNNAME_C_ProjectType_UU = "C_ProjectType_UU";
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
  /** Column name ProjectCategory */
  String COLUMNNAME_ProjectCategory = "ProjectCategory";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Project Type. Type of the project */
  int getC_ProjectType_ID();

  /** Set Project Type. Type of the project */
  void setC_ProjectType_ID(int C_ProjectType_ID);

  /** Get C_ProjectType_UU */
  String getC_ProjectType_UU();

  /** Set C_ProjectType_UU */
  void setC_ProjectType_UU(String C_ProjectType_UU);

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

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Project Category. Project Category */
  String getProjectCategory();

  /** Set Project Category. Project Category */
  void setProjectCategory(String ProjectCategory);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
