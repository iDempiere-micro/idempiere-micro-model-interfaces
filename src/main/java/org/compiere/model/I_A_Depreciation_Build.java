package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Depreciation_Build
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Depreciation_Build {

  /** TableName=A_Depreciation_Build */
  String Table_Name = "A_Depreciation_Build";

  /** AD_Table_ID=53129 */
  int Table_ID = 53129;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name A_Depreciation_Build_ID */
  String COLUMNNAME_A_Depreciation_Build_ID = "A_Depreciation_Build_ID";
  /** Column name A_Depreciation_Build_UU */
  String COLUMNNAME_A_Depreciation_Build_UU = "A_Depreciation_Build_UU";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name A_End_Asset_ID */
  String COLUMNNAME_A_End_Asset_ID = "A_End_Asset_ID";
  /** Column name A_Start_Asset_ID */
  String COLUMNNAME_A_Start_Asset_ID = "A_Start_Asset_ID";
  /** Column name C_Period_ID */
  String COLUMNNAME_C_Period_ID = "C_Period_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DateAcct */
  String COLUMNNAME_DateAcct = "DateAcct";
  /** Column name DateDoc */
  String COLUMNNAME_DateDoc = "DateDoc";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name PeriodNo */
  String COLUMNNAME_PeriodNo = "PeriodNo";
  /** Column name PostingType */
  String COLUMNNAME_PostingType = "PostingType";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Build Depreciation */
  int getA_Depreciation_Build_ID();

  /** Set Build Depreciation */
  void setA_Depreciation_Build_ID(int A_Depreciation_Build_ID);

  /** Get A_Depreciation_Build_UU */
  String getA_Depreciation_Build_UU();

  /** Set A_Depreciation_Build_UU */
  void setA_Depreciation_Build_UU(String A_Depreciation_Build_UU);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get To Asset */
  int getA_End_Asset_ID();

  /** Set To Asset */
  void setA_End_Asset_ID(int A_End_Asset_ID);

  I_A_Asset getA_End_Asset() throws RuntimeException;

  /** Get From Asset */
  int getA_Start_Asset_ID();

  /** Set From Asset */
  void setA_Start_Asset_ID(int A_Start_Asset_ID);

  I_A_Asset getA_Start_Asset() throws RuntimeException;

  /** Get Period. Period of the Calendar */
  int getC_Period_ID();

  /** Set Period. Period of the Calendar */
  void setC_Period_ID(int C_Period_ID);

  I_C_Period getC_Period() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Account Date. Accounting Date */
  Timestamp getDateAcct();

  /** Set Account Date. Accounting Date */
  void setDateAcct(Timestamp DateAcct);

  /** Get Document Date. Date of the Document */
  Timestamp getDateDoc();

  /** Set Document Date. Date of the Document */
  void setDateDoc(Timestamp DateDoc);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Period No. Unique Period Number */
  int getPeriodNo();

  /** Set Period No. Unique Period Number */
  void setPeriodNo(int PeriodNo);

  /** Get PostingType. The type of posted amount for the transaction */
  String getPostingType();

  /** Set PostingType. The type of posted amount for the transaction */
  void setPostingType(String PostingType);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
