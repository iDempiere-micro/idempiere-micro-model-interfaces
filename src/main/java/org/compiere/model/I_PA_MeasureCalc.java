package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PA_MeasureCalc
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_MeasureCalc {

  /** TableName=PA_MeasureCalc */
  String Table_Name = "PA_MeasureCalc";

  /** AD_Table_ID=442 */
  int Table_ID = 442;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name BPartnerColumn */
  String COLUMNNAME_BPartnerColumn = "BPartnerColumn";
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
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name KeyColumn */
  String COLUMNNAME_KeyColumn = "KeyColumn";
  /** Column name OrgColumn */
  String COLUMNNAME_OrgColumn = "OrgColumn";
  /** Column name PA_MeasureCalc_ID */
  String COLUMNNAME_PA_MeasureCalc_ID = "PA_MeasureCalc_ID";
  /** Column name PA_MeasureCalc_UU */
  String COLUMNNAME_PA_MeasureCalc_UU = "PA_MeasureCalc_UU";
  /** Column name ProductColumn */
  String COLUMNNAME_ProductColumn = "ProductColumn";
  /** Column name SelectClause */
  String COLUMNNAME_SelectClause = "SelectClause";
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

  /** Get B.Partner Column. Fully qualified Business Partner key column (C_BPartner_ID) */
  String getBPartnerColumn();

  /** Set B.Partner Column. Fully qualified Business Partner key column (C_BPartner_ID) */
  void setBPartnerColumn(String BPartnerColumn);

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

  /** Get Org Column. Fully qualified Organization column (AD_Org_ID) */
  String getOrgColumn();

  /** Set Org Column. Fully qualified Organization column (AD_Org_ID) */
  void setOrgColumn(String OrgColumn);

  /** Get Measure Calculation. Calculation method for measuring performance */
  int getPA_MeasureCalc_ID();

  /** Set Measure Calculation. Calculation method for measuring performance */
  void setPA_MeasureCalc_ID(int PA_MeasureCalc_ID);

  /** Get PA_MeasureCalc_UU */
  String getPA_MeasureCalc_UU();

  /** Set PA_MeasureCalc_UU */
  void setPA_MeasureCalc_UU(String PA_MeasureCalc_UU);

  /** Get Product Column. Fully qualified Product column (M_Product_ID) */
  String getProductColumn();

  /** Set Product Column. Fully qualified Product column (M_Product_ID) */
  void setProductColumn(String ProductColumn);

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
