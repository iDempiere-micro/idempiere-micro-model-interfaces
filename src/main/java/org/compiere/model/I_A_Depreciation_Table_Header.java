package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Depreciation_Table_Header
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Depreciation_Table_Header {

  /** TableName=A_Depreciation_Table_Header */
  String Table_Name = "A_Depreciation_Table_Header";

  /** AD_Table_ID=53114 */
  int Table_ID = 53114;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name A_Depreciation_Table_Code */
  String COLUMNNAME_A_Depreciation_Table_Code = "A_Depreciation_Table_Code";
  /** Column name A_Depreciation_Table_Header_ID */
  String COLUMNNAME_A_Depreciation_Table_Header_ID = "A_Depreciation_Table_Header_ID";
  /** Column name A_Depreciation_Table_Header_UU */
  String COLUMNNAME_A_Depreciation_Table_Header_UU = "A_Depreciation_Table_Header_UU";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name A_Table_Rate_Type */
  String COLUMNNAME_A_Table_Rate_Type = "A_Table_Rate_Type";
  /** Column name A_Term */
  String COLUMNNAME_A_Term = "A_Term";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Depreciation Code */
  String getA_Depreciation_Table_Code();

  /** Set Depreciation Code */
  void setA_Depreciation_Table_Code(String A_Depreciation_Table_Code);

  /** Get A_Depreciation_Table_Header_ID */
  int getA_Depreciation_Table_Header_ID();

  /** Set A_Depreciation_Table_Header_ID */
  void setA_Depreciation_Table_Header_ID(int A_Depreciation_Table_Header_ID);

  /** Get A_Depreciation_Table_Header_UU */
  String getA_Depreciation_Table_Header_UU();

  /** Set A_Depreciation_Table_Header_UU */
  void setA_Depreciation_Table_Header_UU(String A_Depreciation_Table_Header_UU);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Type */
  String getA_Table_Rate_Type();

  /** Set Type */
  void setA_Table_Rate_Type(String A_Table_Rate_Type);

  /** Get Period/Yearly */
  String getA_Term();

  /** Set Period/Yearly */
  void setA_Term(String A_Term);

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

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
