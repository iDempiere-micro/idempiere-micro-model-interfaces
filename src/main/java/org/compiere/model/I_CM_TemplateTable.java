package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for CM_TemplateTable
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_CM_TemplateTable {

  /** TableName=CM_TemplateTable */
  String Table_Name = "CM_TemplateTable";

  /** AD_Table_ID=879 */
  int Table_ID = 879;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name CM_Template_ID */
  String COLUMNNAME_CM_Template_ID = "CM_Template_ID";
  /** Column name CM_TemplateTable_ID */
  String COLUMNNAME_CM_TemplateTable_ID = "CM_TemplateTable_ID";
  /** Column name CM_TemplateTable_UU */
  String COLUMNNAME_CM_TemplateTable_UU = "CM_TemplateTable_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name OtherClause */
  String COLUMNNAME_OtherClause = "OtherClause";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
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

  /** Get Template. Template defines how content is displayed */
  int getCM_Template_ID();

  /** Set Template. Template defines how content is displayed */
  void setCM_Template_ID(int CM_Template_ID);

  I_CM_Template getCM_Template() throws RuntimeException;

  /** Get Template Table. CM Template Table Link */
  int getCM_TemplateTable_ID();

  /** Set Template Table. CM Template Table Link */
  void setCM_TemplateTable_ID(int CM_TemplateTable_ID);

  /** Get CM_TemplateTable_UU */
  String getCM_TemplateTable_UU();

  /** Set CM_TemplateTable_UU */
  void setCM_TemplateTable_UU(String CM_TemplateTable_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Other SQL Clause. Other SQL Clause */
  String getOtherClause();

  /** Set Other SQL Clause. Other SQL Clause */
  void setOtherClause(String OtherClause);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Sql WHERE. Fully qualified SQL WHERE clause */
  String getWhereClause();

  /** Set Sql WHERE. Fully qualified SQL WHERE clause */
  void setWhereClause(String WhereClause);
}
