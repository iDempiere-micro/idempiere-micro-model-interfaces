package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_WF_Node_Para
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_WF_Node_Para {

  /** TableName=AD_WF_Node_Para */
  String Table_Name = "AD_WF_Node_Para";

  /** AD_Table_ID=643 */
  int Table_ID = 643;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Process_Para_ID */
  String COLUMNNAME_AD_Process_Para_ID = "AD_Process_Para_ID";
  /** Column name AD_WF_Node_ID */
  String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
  /** Column name AD_WF_Node_Para_ID */
  String COLUMNNAME_AD_WF_Node_Para_ID = "AD_WF_Node_Para_ID";
  /** Column name AD_WF_Node_Para_UU */
  String COLUMNNAME_AD_WF_Node_Para_UU = "AD_WF_Node_Para_UU";
  /** Column name AttributeName */
  String COLUMNNAME_AttributeName = "AttributeName";
  /** Column name AttributeValue */
  String COLUMNNAME_AttributeValue = "AttributeValue";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
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

  /** Get Process Parameter */
  int getAD_Process_Para_ID();

  /** Set Process Parameter */
  void setAD_Process_Para_ID(int AD_Process_Para_ID);

  I_AD_Process_Para getAD_Process_Para() throws RuntimeException;

  /** Get Node. Workflow Node (activity), step or process */
  int getAD_WF_Node_ID();

  /** Set Node. Workflow Node (activity), step or process */
  void setAD_WF_Node_ID(int AD_WF_Node_ID);

  I_AD_WF_Node getAD_WF_Node() throws RuntimeException;

  /** Get Workflow Node Parameter. Workflow Node Execution Parameter */
  int getAD_WF_Node_Para_ID();

  /** Set Workflow Node Parameter. Workflow Node Execution Parameter */
  void setAD_WF_Node_Para_ID(int AD_WF_Node_Para_ID);

  /** Get AD_WF_Node_Para_UU */
  String getAD_WF_Node_Para_UU();

  /** Set AD_WF_Node_Para_UU */
  void setAD_WF_Node_Para_UU(String AD_WF_Node_Para_UU);

  /** Get Attribute Name. Name of the Attribute */
  String getAttributeName();

  /** Set Attribute Name. Name of the Attribute */
  void setAttributeName(String AttributeName);

  /** Get Attribute Value. Value of the Attribute */
  String getAttributeValue();

  /** Set Attribute Value. Value of the Attribute */
  void setAttributeValue(String AttributeValue);

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

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
