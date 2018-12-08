package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for EXP_Format
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_EXP_Format {

  /** TableName=EXP_Format */
  String Table_Name = "EXP_Format";

  /** AD_Table_ID=53072 */
  int Table_ID = 53072;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EXP_Format_ID */
  String COLUMNNAME_EXP_Format_ID = "EXP_Format_ID";
  /** Column name EXP_Format_UU */
  String COLUMNNAME_EXP_Format_UU = "EXP_Format_UU";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name TestExportModel */
  String COLUMNNAME_TestExportModel = "TestExportModel";
  /** Column name TestImportModel */
  String COLUMNNAME_TestImportModel = "TestImportModel";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name Value */
  String COLUMNNAME_Value = "Value";
  /** Column name Version */
  String COLUMNNAME_Version = "Version";
  /** Column name WhereClause */
  String COLUMNNAME_WhereClause = "WhereClause";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Table. Database Table information */
  int getAD_Table_ID();

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  I_AD_Table getAD_Table() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Export Format */
  int getEXP_Format_ID();

  /** Set Export Format */
  void setEXP_Format_ID(int EXP_Format_ID);

  /** Get EXP_Format_UU */
  String getEXP_Format_UU();

  /** Set EXP_Format_UU */
  void setEXP_Format_UU(String EXP_Format_UU);

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

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Test Export Model */
  String getTestExportModel();

  /** Set Test Export Model */
  void setTestExportModel(String TestExportModel);

  /** Get Test Import Model */
  String getTestImportModel();

  /** Set Test Import Model */
  void setTestImportModel(String TestImportModel);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);

  /** Get Version. Version of the table definition */
  String getVersion();

  /** Set Version. Version of the table definition */
  void setVersion(String Version);

  /** Get Sql WHERE. Fully qualified SQL WHERE clause */
  String getWhereClause();

  /** Set Sql WHERE. Fully qualified SQL WHERE clause */
  void setWhereClause(String WhereClause);
}
