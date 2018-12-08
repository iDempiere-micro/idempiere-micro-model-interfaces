package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for ASP_Tab
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_ASP_Tab {

  /** TableName=ASP_Tab */
  String Table_Name = "ASP_Tab";

  /** AD_Table_ID=53047 */
  int Table_ID = 53047;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Tab_ID */
  String COLUMNNAME_AD_Tab_ID = "AD_Tab_ID";
  /** Column name AllFields */
  String COLUMNNAME_AllFields = "AllFields";
  /** Column name ASP_Status */
  String COLUMNNAME_ASP_Status = "ASP_Status";
  /** Column name ASP_Tab_ID */
  String COLUMNNAME_ASP_Tab_ID = "ASP_Tab_ID";
  /** Column name ASP_Tab_UU */
  String COLUMNNAME_ASP_Tab_UU = "ASP_Tab_UU";
  /** Column name ASP_Window_ID */
  String COLUMNNAME_ASP_Window_ID = "ASP_Window_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Tab. Tab within a Window */
  int getAD_Tab_ID();

  /** Set Tab. Tab within a Window */
  void setAD_Tab_ID(int AD_Tab_ID);

  I_AD_Tab getAD_Tab() throws RuntimeException;

  /** Get AllFields */
  boolean isAllFields();

  /** Set AllFields */
  void setAllFields(boolean AllFields);

  /** Get ASP Status */
  String getASP_Status();

  /** Set ASP Status */
  void setASP_Status(String ASP_Status);

  /** Get ASP Tab */
  int getASP_Tab_ID();

  /** Set ASP Tab */
  void setASP_Tab_ID(int ASP_Tab_ID);

  /** Get ASP_Tab_UU */
  String getASP_Tab_UU();

  /** Set ASP_Tab_UU */
  void setASP_Tab_UU(String ASP_Tab_UU);

  /** Get ASP Window */
  int getASP_Window_ID();

  /** Set ASP Window */
  void setASP_Window_ID(int ASP_Window_ID);

  I_ASP_Window getASP_Window() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
