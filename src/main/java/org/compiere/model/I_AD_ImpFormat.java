package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_ImpFormat
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ImpFormat {

  /** TableName=AD_ImpFormat */
  String Table_Name = "AD_ImpFormat";

  /** AD_Table_ID=381 */
  int Table_ID = 381;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_ImpFormat_ID */
  String COLUMNNAME_AD_ImpFormat_ID = "AD_ImpFormat_ID";
  /** Column name AD_ImpFormat_UU */
  String COLUMNNAME_AD_ImpFormat_UU = "AD_ImpFormat_UU";
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
  /** Column name FormatType */
  String COLUMNNAME_FormatType = "FormatType";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name SeparatorChar */
  String COLUMNNAME_SeparatorChar = "SeparatorChar";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Import Format */
  int getAD_ImpFormat_ID();

  /** Set Import Format */
  void setAD_ImpFormat_ID(int AD_ImpFormat_ID);

  /** Get AD_ImpFormat_UU */
  String getAD_ImpFormat_UU();

  /** Set AD_ImpFormat_UU */
  void setAD_ImpFormat_UU(String AD_ImpFormat_UU);

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

  /** Get Format. Format of the data */
  String getFormatType();

  /** Set Format. Format of the data */
  void setFormatType(String FormatType);

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

  /** Get Separator Character */
  String getSeparatorChar();

  /** Set Separator Character */
  void setSeparatorChar(String SeparatorChar);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
