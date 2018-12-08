package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_ReportView
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ReportView {

  /** TableName=AD_ReportView */
  String Table_Name = "AD_ReportView";

  /** AD_Table_ID=361 */
  int Table_ID = 361;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_ReportView_ID */
  String COLUMNNAME_AD_ReportView_ID = "AD_ReportView_ID";
  /** Column name AD_ReportView_UU */
  String COLUMNNAME_AD_ReportView_UU = "AD_ReportView_UU";
  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
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
  /** Column name OrderByClause */
  String COLUMNNAME_OrderByClause = "OrderByClause";
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

  /** Get Report View. View used to generate this report */
  int getAD_ReportView_ID();

  /** Set Report View. View used to generate this report */
  void setAD_ReportView_ID(int AD_ReportView_ID);

  /** Get AD_ReportView_UU */
  String getAD_ReportView_UU();

  /** Set AD_ReportView_UU */
  void setAD_ReportView_UU(String AD_ReportView_UU);

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

  /** Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  String getEntityType();

  /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Sql ORDER BY. Fully qualified ORDER BY clause */
  String getOrderByClause();

  /** Set Sql ORDER BY. Fully qualified ORDER BY clause */
  void setOrderByClause(String OrderByClause);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Sql WHERE. Fully qualified SQL WHERE clause */
  String getWhereClause();

  /** Set Sql WHERE. Fully qualified SQL WHERE clause */
  void setWhereClause(String WhereClause);
}
