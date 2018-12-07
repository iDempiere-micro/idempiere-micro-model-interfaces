package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Commission
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Commission {

  /** TableName=C_Commission */
  String Table_Name = "C_Commission";

  /** AD_Table_ID=429 */
  int Table_ID = 429;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_Charge_ID */
  String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
  /** Column name C_Commission_ID */
  String COLUMNNAME_C_Commission_ID = "C_Commission_ID";
  /** Column name C_Commission_UU */
  String COLUMNNAME_C_Commission_UU = "C_Commission_UU";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name CreateFrom */
  String COLUMNNAME_CreateFrom = "CreateFrom";
  /** Column name DateLastRun */
  String COLUMNNAME_DateLastRun = "DateLastRun";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DocBasisType */
  String COLUMNNAME_DocBasisType = "DocBasisType";
  /** Column name FrequencyType */
  String COLUMNNAME_FrequencyType = "FrequencyType";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name ListDetails */
  String COLUMNNAME_ListDetails = "ListDetails";
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

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Charge. Additional document charges */
  int getC_Charge_ID();

  /** Set Charge. Additional document charges */
  void setC_Charge_ID(int C_Charge_ID);

  I_C_Charge getC_Charge() throws RuntimeException;

  /** Get Commission. Commission */
  int getC_Commission_ID();

  /** Set Commission. Commission */
  void setC_Commission_ID(int C_Commission_ID);

  /** Get C_Commission_UU */
  String getC_Commission_UU();

  /** Set C_Commission_UU */
  void setC_Commission_UU(String C_Commission_UU);

  /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

  /** Set Currency. The Currency for this record */
  void setC_Currency_ID(int C_Currency_ID);

  I_C_Currency getC_Currency() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /**
   * Get Create lines from. Process which will generate a new document lines based on an existing
   * document
   */
  String getCreateFrom();

  /**
   * Set Create lines from. Process which will generate a new document lines based on an existing
   * document
   */
  void setCreateFrom(String CreateFrom);

  /** Get Date last run. Date the process was last run. */
  Timestamp getDateLastRun();

  /** Set Date last run. Date the process was last run. */
  void setDateLastRun(Timestamp DateLastRun);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Calculation Basis. Basis for the calculation the commission */
  String getDocBasisType();

  /** Set Calculation Basis. Basis for the calculation the commission */
  void setDocBasisType(String DocBasisType);

  /** Get Frequency Type. Frequency of event */
  String getFrequencyType();

  /** Set Frequency Type. Frequency of event */
  void setFrequencyType(String FrequencyType);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get List Details. List document details */
  boolean isListDetails();

  /** Set List Details. List document details */
  void setListDetails(boolean ListDetails);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
