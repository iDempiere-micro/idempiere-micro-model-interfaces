package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_ChartDatasource
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ChartDatasource {

  /** TableName=AD_ChartDatasource */
  String Table_Name = "AD_ChartDatasource";

  /** AD_Table_ID=53282 */
  int Table_ID = 53282;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_ChartDatasource_ID */
  String COLUMNNAME_AD_ChartDatasource_ID = "AD_ChartDatasource_ID";
  /** Column name AD_ChartDatasource_UU */
  String COLUMNNAME_AD_ChartDatasource_UU = "AD_ChartDatasource_UU";
  /** Column name AD_Chart_ID */
  String COLUMNNAME_AD_Chart_ID = "AD_Chart_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name CategoryColumn */
  String COLUMNNAME_CategoryColumn = "CategoryColumn";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DateColumn */
  String COLUMNNAME_DateColumn = "DateColumn";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
  /** Column name FromClause */
  String COLUMNNAME_FromClause = "FromClause";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name KeyColumn */
  String COLUMNNAME_KeyColumn = "KeyColumn";
  /** Column name SeriesColumn */
  String COLUMNNAME_SeriesColumn = "SeriesColumn";
  /** Column name TimeOffset */
  String COLUMNNAME_TimeOffset = "TimeOffset";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name ValueColumn */
  String COLUMNNAME_ValueColumn = "ValueColumn";
  /** Column name WhereClause */
  String COLUMNNAME_WhereClause = "WhereClause";

  /** Get Chart Datasource */
  int getAD_ChartDatasource_ID();

  /** Set Chart Datasource */
  void setAD_ChartDatasource_ID(int AD_ChartDatasource_ID);

  /** Get AD_ChartDatasource_UU */
  String getAD_ChartDatasource_UU();

  /** Set AD_ChartDatasource_UU */
  void setAD_ChartDatasource_UU(String AD_ChartDatasource_UU);

  /** Get Chart */
  int getAD_Chart_ID();

  /** Set Chart */
  void setAD_Chart_ID(int AD_Chart_ID);

  I_AD_Chart getAD_Chart() throws RuntimeException;

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Table. Database Table information */
  int getAD_Table_ID();

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  I_AD_Table getAD_Table() throws RuntimeException;

  /** Get Category Column. Fully qualified data category column */
  String getCategoryColumn();

  /** Set Category Column. Fully qualified data category column */
  void setCategoryColumn(String CategoryColumn);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Date Column. Fully qualified date column */
  String getDateColumn();

  /** Set Date Column. Fully qualified date column */
  void setDateColumn(String DateColumn);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  String getEntityType();

  /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

  /** Get Sql FROM. SQL FROM clause */
  String getFromClause();

  /** Set Sql FROM. SQL FROM clause */
  void setFromClause(String FromClause);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Key Column. Key Column for Table */
  String getKeyColumn();

  /** Set Key Column. Key Column for Table */
  void setKeyColumn(String KeyColumn);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Series Column */
  String getSeriesColumn();

  /** Set Series Column */
  void setSeriesColumn(String SeriesColumn);

  /** Get Time Offset. Number of time units to offset displayed chart data from the current date. */
  int getTimeOffset();

  /** Set Time Offset. Number of time units to offset displayed chart data from the current date. */
  void setTimeOffset(int TimeOffset);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Value Column. Fully qualified data value column */
  String getValueColumn();

  /** Set Value Column. Fully qualified data value column */
  void setValueColumn(String ValueColumn);

  /** Get Sql WHERE. Fully qualified SQL WHERE clause */
  String getWhereClause();

  /** Set Sql WHERE. Fully qualified SQL WHERE clause */
  void setWhereClause(String WhereClause);
}
