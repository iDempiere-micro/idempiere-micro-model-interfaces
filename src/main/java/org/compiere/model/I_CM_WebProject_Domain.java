package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for CM_WebProject_Domain
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_CM_WebProject_Domain {

  /** TableName=CM_WebProject_Domain */
  String Table_Name = "CM_WebProject_Domain";

  /** AD_Table_ID=873 */
  int Table_ID = 873;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name CM_Container_ID */
  String COLUMNNAME_CM_Container_ID = "CM_Container_ID";
  /** Column name CM_WebProject_Domain_ID */
  String COLUMNNAME_CM_WebProject_Domain_ID = "CM_WebProject_Domain_ID";
  /** Column name CM_WebProject_Domain_UU */
  String COLUMNNAME_CM_WebProject_Domain_UU = "CM_WebProject_Domain_UU";
  /** Column name CM_WebProject_ID */
  String COLUMNNAME_CM_WebProject_ID = "CM_WebProject_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name FQDN */
  String COLUMNNAME_FQDN = "FQDN";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Web Container. Web Container contains content like images, text etc. */
  int getCM_Container_ID();

  /** Set Web Container. Web Container contains content like images, text etc. */
  void setCM_Container_ID(int CM_Container_ID);

  I_CM_Container getCM_Container() throws RuntimeException;

  /** Get WebProject Domain. Definition of Domainhandling */
  int getCM_WebProject_Domain_ID();

  /** Set WebProject Domain. Definition of Domainhandling */
  void setCM_WebProject_Domain_ID(int CM_WebProject_Domain_ID);

  /** Get CM_WebProject_Domain_UU */
  String getCM_WebProject_Domain_UU();

  /** Set CM_WebProject_Domain_UU */
  void setCM_WebProject_Domain_UU(String CM_WebProject_Domain_UU);

  /**
   * Get Web Project. A web project is the main data container for Containers, URLs, Ads, Media etc.
   */
  int getCM_WebProject_ID();

  /**
   * Set Web Project. A web project is the main data container for Containers, URLs, Ads, Media etc.
   */
  void setCM_WebProject_ID(int CM_WebProject_ID);

  I_CM_WebProject getCM_WebProject() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Fully Qualified Domain Name. Fully Qualified Domain Name i.e. www.comdivision.com */
  String getFQDN();

  /** Set Fully Qualified Domain Name. Fully Qualified Domain Name i.e. www.comdivision.com */
  void setFQDN(String FQDN);

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

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
