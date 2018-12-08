package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for GL_Fund
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_GL_Fund {

  /** TableName=GL_Fund */
  String Table_Name = "GL_Fund";

  /** AD_Table_ID=823 */
  int Table_ID = 823;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Amt */
  String COLUMNNAME_Amt = "Amt";
  /** Column name C_AcctSchema_ID */
  String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DateFrom */
  String COLUMNNAME_DateFrom = "DateFrom";
  /** Column name DateTo */
  String COLUMNNAME_DateTo = "DateTo";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name GL_Fund_ID */
  String COLUMNNAME_GL_Fund_ID = "GL_Fund_ID";
  /** Column name GL_Fund_UU */
  String COLUMNNAME_GL_Fund_UU = "GL_Fund_UU";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
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

  /** Get Amount. Amount */
  BigDecimal getAmt();

  /** Set Amount. Amount */
  void setAmt(BigDecimal Amt);

  /** Get Accounting Schema. Rules for accounting */
  int getC_AcctSchema_ID();

  /** Set Accounting Schema. Rules for accounting */
  void setC_AcctSchema_ID(int C_AcctSchema_ID);

  I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Date From. Starting date for a range */
  Timestamp getDateFrom();

  /** Set Date From. Starting date for a range */
  void setDateFrom(Timestamp DateFrom);

  /** Get Date To. End date of a date range */
  Timestamp getDateTo();

  /** Set Date To. End date of a date range */
  void setDateTo(Timestamp DateTo);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get GL Fund. General Ledger Funds Control */
  int getGL_Fund_ID();

  /** Set GL Fund. General Ledger Funds Control */
  void setGL_Fund_ID(int GL_Fund_ID);

  /** Get GL_Fund_UU */
  String getGL_Fund_UU();

  /** Set GL_Fund_UU */
  void setGL_Fund_UU(String GL_Fund_UU);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

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
