package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_AlertRule
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_AlertRule {

  /** TableName=AD_AlertRule */
  String Table_Name = "AD_AlertRule";

  /** AD_Table_ID=593 */
  int Table_ID = 593;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Alert_ID */
  String COLUMNNAME_AD_Alert_ID = "AD_Alert_ID";
  /** Column name AD_AlertRule_ID */
  String COLUMNNAME_AD_AlertRule_ID = "AD_AlertRule_ID";
  /** Column name AD_AlertRule_UU */
  String COLUMNNAME_AD_AlertRule_UU = "AD_AlertRule_UU";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name ErrorMsg */
  String COLUMNNAME_ErrorMsg = "ErrorMsg";
  /** Column name FromClause */
  String COLUMNNAME_FromClause = "FromClause";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsValid */
  String COLUMNNAME_IsValid = "IsValid";
  /** Column name OtherClause */
  String COLUMNNAME_OtherClause = "OtherClause";
  /** Column name PostProcessing */
  String COLUMNNAME_PostProcessing = "PostProcessing";
  /** Column name PreProcessing */
  String COLUMNNAME_PreProcessing = "PreProcessing";
  /** Column name SelectClause */
  String COLUMNNAME_SelectClause = "SelectClause";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name WhereClause */
  String COLUMNNAME_WhereClause = "WhereClause";

  /** Get Alert. iDempiere Alert */
  int getAD_Alert_ID();

  /** Set Alert. iDempiere Alert */
  void setAD_Alert_ID(int AD_Alert_ID);

  I_AD_Alert getAD_Alert() throws RuntimeException;

  /** Get Alert Rule. Definition of the alert element */
  int getAD_AlertRule_ID();

  /** Set Alert Rule. Definition of the alert element */
  void setAD_AlertRule_ID(int AD_AlertRule_ID);

  /** Get AD_AlertRule_UU */
  String getAD_AlertRule_UU();

  /** Set AD_AlertRule_UU */
  void setAD_AlertRule_UU(String AD_AlertRule_UU);

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

  /** Get Error Msg */
  String getErrorMsg();

  /** Set Error Msg */
  void setErrorMsg(String ErrorMsg);

  /** Get Sql FROM. SQL FROM clause */
  String getFromClause();

  /** Set Sql FROM. SQL FROM clause */
  void setFromClause(String FromClause);

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

  /** Get Other SQL Clause. Other SQL Clause */
  String getOtherClause();

  /** Set Other SQL Clause. Other SQL Clause */
  void setOtherClause(String OtherClause);

  /** Get Post Processing. Process SQL after executing the query */
  String getPostProcessing();

  /** Set Post Processing. Process SQL after executing the query */
  void setPostProcessing(String PostProcessing);

  /** Get Pre Processing. Process SQL before executing the query */
  String getPreProcessing();

  /** Set Pre Processing. Process SQL before executing the query */
  void setPreProcessing(String PreProcessing);

  /** Get Sql SELECT. SQL SELECT clause */
  String getSelectClause();

  /** Set Sql SELECT. SQL SELECT clause */
  void setSelectClause(String SelectClause);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Sql WHERE. Fully qualified SQL WHERE clause */
  String getWhereClause();

  /** Set Sql WHERE. Fully qualified SQL WHERE clause */
  void setWhereClause(String WhereClause);
}
