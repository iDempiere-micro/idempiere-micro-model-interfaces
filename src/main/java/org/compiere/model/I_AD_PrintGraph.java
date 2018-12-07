package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_PrintGraph
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_PrintGraph {

  /** TableName=AD_PrintGraph */
  String Table_Name = "AD_PrintGraph";

  /** AD_Table_ID=521 */
  int Table_ID = 521;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_PrintFormat_ID */
  String COLUMNNAME_AD_PrintFormat_ID = "AD_PrintFormat_ID";
  /** Column name AD_PrintGraph_ID */
  String COLUMNNAME_AD_PrintGraph_ID = "AD_PrintGraph_ID";
  /** Column name AD_PrintGraph_UU */
  String COLUMNNAME_AD_PrintGraph_UU = "AD_PrintGraph_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Data1_PrintFormatItem_ID */
  String COLUMNNAME_Data1_PrintFormatItem_ID = "Data1_PrintFormatItem_ID";
  /** Column name Data2_PrintFormatItem_ID */
  String COLUMNNAME_Data2_PrintFormatItem_ID = "Data2_PrintFormatItem_ID";
  /** Column name Data3_PrintFormatItem_ID */
  String COLUMNNAME_Data3_PrintFormatItem_ID = "Data3_PrintFormatItem_ID";
  /** Column name Data4_PrintFormatItem_ID */
  String COLUMNNAME_Data4_PrintFormatItem_ID = "Data4_PrintFormatItem_ID";
  /** Column name Data_PrintFormatItem_ID */
  String COLUMNNAME_Data_PrintFormatItem_ID = "Data_PrintFormatItem_ID";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Description_PrintFormatItem_ID */
  String COLUMNNAME_Description_PrintFormatItem_ID = "Description_PrintFormatItem_ID";
  /** Column name GraphType */
  String COLUMNNAME_GraphType = "GraphType";
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

  /** Get Print Format. Data Print Format */
  int getAD_PrintFormat_ID();

  /** Set Print Format. Data Print Format */
  void setAD_PrintFormat_ID(int AD_PrintFormat_ID);

  I_AD_PrintFormat getAD_PrintFormat() throws RuntimeException;

  /** Get Graph. Graph included in Reports */
  int getAD_PrintGraph_ID();

  /** Set Graph. Graph included in Reports */
  void setAD_PrintGraph_ID(int AD_PrintGraph_ID);

  /** Get AD_PrintGraph_UU */
  String getAD_PrintGraph_UU();

  /** Set AD_PrintGraph_UU */
  void setAD_PrintGraph_UU(String AD_PrintGraph_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Data Column 2. Data Column for Line Charts */
  int getData1_PrintFormatItem_ID();

  /** Set Data Column 2. Data Column for Line Charts */
  void setData1_PrintFormatItem_ID(int Data1_PrintFormatItem_ID);

  I_AD_PrintFormatItem getData1_PrintFormatItem() throws RuntimeException;

  /** Get Data Column 3. Data Column for Line Charts */
  int getData2_PrintFormatItem_ID();

  /** Set Data Column 3. Data Column for Line Charts */
  void setData2_PrintFormatItem_ID(int Data2_PrintFormatItem_ID);

  I_AD_PrintFormatItem getData2_PrintFormatItem() throws RuntimeException;

  /** Get Data Column 4. Data Column for Line Charts */
  int getData3_PrintFormatItem_ID();

  /** Set Data Column 4. Data Column for Line Charts */
  void setData3_PrintFormatItem_ID(int Data3_PrintFormatItem_ID);

  I_AD_PrintFormatItem getData3_PrintFormatItem() throws RuntimeException;

  /** Get Data Column 5. Data Column for Line Charts */
  int getData4_PrintFormatItem_ID();

  /** Set Data Column 5. Data Column for Line Charts */
  void setData4_PrintFormatItem_ID(int Data4_PrintFormatItem_ID);

  I_AD_PrintFormatItem getData4_PrintFormatItem() throws RuntimeException;

  /** Get Data Column. Data Column for Pie and Line Charts */
  int getData_PrintFormatItem_ID();

  /** Set Data Column. Data Column for Pie and Line Charts */
  void setData_PrintFormatItem_ID(int Data_PrintFormatItem_ID);

  I_AD_PrintFormatItem getData_PrintFormatItem() throws RuntimeException;

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Description Column. Description Column for Pie/Line/Bar Charts */
  int getDescription_PrintFormatItem_ID();

  /** Set Description Column. Description Column for Pie/Line/Bar Charts */
  void setDescription_PrintFormatItem_ID(int Description_PrintFormatItem_ID);

  I_AD_PrintFormatItem getDescription_PrintFormatItem() throws RuntimeException;

  /** Get Graph Type. Type of graph to be painted */
  String getGraphType();

  /** Set Graph Type. Type of graph to be painted */
  void setGraphType(String GraphType);

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
