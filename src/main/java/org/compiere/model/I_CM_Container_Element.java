package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for CM_Container_Element
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_CM_Container_Element {

  /** TableName=CM_Container_Element */
  String Table_Name = "CM_Container_Element";

  /** AD_Table_ID=860 */
  int Table_ID = 860;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name CM_Container_Element_ID */
  String COLUMNNAME_CM_Container_Element_ID = "CM_Container_Element_ID";
  /** Column name CM_Container_Element_UU */
  String COLUMNNAME_CM_Container_Element_UU = "CM_Container_Element_UU";
  /** Column name CM_Container_ID */
  String COLUMNNAME_CM_Container_ID = "CM_Container_ID";
  /** Column name ContentHTML */
  String COLUMNNAME_ContentHTML = "ContentHTML";
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
  /** Column name IsValid */
  String COLUMNNAME_IsValid = "IsValid";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Container Element. Container element i.e. Headline, Content, Footer etc. */
  int getCM_Container_Element_ID();

  /** Set Container Element. Container element i.e. Headline, Content, Footer etc. */
  void setCM_Container_Element_ID(int CM_Container_Element_ID);

  /** Get CM_Container_Element_UU */
  String getCM_Container_Element_UU();

  /** Set CM_Container_Element_UU */
  void setCM_Container_Element_UU(String CM_Container_Element_UU);

  /** Get Web Container. Web Container contains content like images, text etc. */
  int getCM_Container_ID();

  /** Set Web Container. Web Container contains content like images, text etc. */
  void setCM_Container_ID(int CM_Container_ID);

  I_CM_Container getCM_Container() throws RuntimeException;

  /** Get Content HTML. Contains the content itself */
  String getContentHTML();

  /** Set Content HTML. Contains the content itself */
  void setContentHTML(String ContentHTML);

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

  /** Set Valid. Element is valid */
  void setIsValid(boolean IsValid);

  /** Get Valid. Element is valid */
  boolean isValid();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
