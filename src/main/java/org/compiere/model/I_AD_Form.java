package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Form
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Form {

  /** TableName=AD_Form */
  String Table_Name = "AD_Form";

  /** AD_Table_ID=376 */
  int Table_ID = 376;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AccessLevel */
  String COLUMNNAME_AccessLevel = "AccessLevel";
  /** Column name AD_CtxHelp_ID */
  String COLUMNNAME_AD_CtxHelp_ID = "AD_CtxHelp_ID";
  /** Column name AD_Form_ID */
  String COLUMNNAME_AD_Form_ID = "AD_Form_ID";
  /** Column name AD_Form_UU */
  String COLUMNNAME_AD_Form_UU = "AD_Form_UU";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Classname */
  String COLUMNNAME_Classname = "Classname";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsBetaFunctionality */
  String COLUMNNAME_IsBetaFunctionality = "IsBetaFunctionality";
  /** Column name JSPURL */
  String COLUMNNAME_JSPURL = "JSPURL";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Data Access Level. Access Level required */
  String getAccessLevel();

  /** Set Data Access Level. Access Level required */
  void setAccessLevel(String AccessLevel);

  /** Get Context Help */
  int getAD_CtxHelp_ID();

  /** Set Context Help */
  void setAD_CtxHelp_ID(int AD_CtxHelp_ID);

  I_AD_CtxHelp getAD_CtxHelp() throws RuntimeException;

  /** Get Special Form. Special Form */
  int getAD_Form_ID();

  /** Set Special Form. Special Form */
  void setAD_Form_ID(int AD_Form_ID);

  /** Get AD_Form_UU */
  String getAD_Form_UU();

  /** Set AD_Form_UU */
  void setAD_Form_UU(String AD_Form_UU);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Classname. Java Classname */
  String getClassname();

  /** Set Classname. Java Classname */
  void setClassname(String Classname);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  String getEntityType();

  /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Beta Functionality. This functionality is considered Beta */
  void setIsBetaFunctionality(boolean IsBetaFunctionality);

  /** Get Beta Functionality. This functionality is considered Beta */
  boolean isBetaFunctionality();

  /** Get jsp URL. Web URL of the jsp function */
  String getJSPURL();

  /** Set jsp URL. Web URL of the jsp function */
  void setJSPURL(String JSPURL);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
