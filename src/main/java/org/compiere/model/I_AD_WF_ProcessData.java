package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_WF_ProcessData
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_WF_ProcessData {

  /** TableName=AD_WF_ProcessData */
  String Table_Name = "AD_WF_ProcessData";

  /** AD_Table_ID=648 */
  int Table_ID = 648;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_WF_ProcessData_ID */
  String COLUMNNAME_AD_WF_ProcessData_ID = "AD_WF_ProcessData_ID";
  /** Column name AD_WF_ProcessData_UU */
  String COLUMNNAME_AD_WF_ProcessData_UU = "AD_WF_ProcessData_UU";
  /** Column name AD_WF_Process_ID */
  String COLUMNNAME_AD_WF_Process_ID = "AD_WF_Process_ID";
  /** Column name AttributeName */
  String COLUMNNAME_AttributeName = "AttributeName";
  /** Column name AttributeValue */
  String COLUMNNAME_AttributeValue = "AttributeValue";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
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

  /** Get Workflow Process Data. Workflow Process Context */
  int getAD_WF_ProcessData_ID();

  /** Set Workflow Process Data. Workflow Process Context */
  void setAD_WF_ProcessData_ID(int AD_WF_ProcessData_ID);

  /** Get AD_WF_ProcessData_UU */
  String getAD_WF_ProcessData_UU();

  /** Set AD_WF_ProcessData_UU */
  void setAD_WF_ProcessData_UU(String AD_WF_ProcessData_UU);

  /** Get Workflow Process. Actual Workflow Process Instance */
  int getAD_WF_Process_ID();

  /** Set Workflow Process. Actual Workflow Process Instance */
  void setAD_WF_Process_ID(int AD_WF_Process_ID);

  I_AD_WF_Process getAD_WF_Process() throws RuntimeException;

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

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
