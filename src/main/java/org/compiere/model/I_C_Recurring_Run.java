package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Recurring_Run
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Recurring_Run {

  /** TableName=C_Recurring_Run */
  String Table_Name = "C_Recurring_Run";

  /** AD_Table_ID=573 */
  int Table_ID = 573;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_Invoice_ID */
  String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
  /** Column name C_Order_ID */
  String COLUMNNAME_C_Order_ID = "C_Order_ID";
  /** Column name C_Payment_ID */
  String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
  /** Column name C_Project_ID */
  String COLUMNNAME_C_Project_ID = "C_Project_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_Recurring_ID */
  String COLUMNNAME_C_Recurring_ID = "C_Recurring_ID";
  /** Column name C_Recurring_Run_ID */
  String COLUMNNAME_C_Recurring_Run_ID = "C_Recurring_Run_ID";
  /** Column name C_Recurring_Run_UU */
  String COLUMNNAME_C_Recurring_Run_UU = "C_Recurring_Run_UU";
  /** Column name DateDoc */
  String COLUMNNAME_DateDoc = "DateDoc";
  /** Column name GL_JournalBatch_ID */
  String COLUMNNAME_GL_JournalBatch_ID = "GL_JournalBatch_ID";
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

  /** Get Invoice. Invoice Identifier */
  int getC_Invoice_ID();

  /** Set Invoice. Invoice Identifier */
  void setC_Invoice_ID(int C_Invoice_ID);

  I_C_Invoice getC_Invoice() throws RuntimeException;

  /** Get Order. Order */
  int getC_Order_ID();

  /** Set Order. Order */
  void setC_Order_ID(int C_Order_ID);

  I_C_Order getC_Order() throws RuntimeException;

  /** Get Payment. Payment identifier */
  int getC_Payment_ID();

  /** Set Payment. Payment identifier */
  void setC_Payment_ID(int C_Payment_ID);

  I_C_Payment getC_Payment() throws RuntimeException;

  /** Get Project. Financial Project */
  int getC_Project_ID();

  /** Set Project. Financial Project */
  void setC_Project_ID(int C_Project_ID);

  I_C_Project getC_Project() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Recurring. Recurring Document */
  int getC_Recurring_ID();

  /** Set Recurring. Recurring Document */
  void setC_Recurring_ID(int C_Recurring_ID);

  I_C_Recurring getC_Recurring() throws RuntimeException;

  /** Get Recurring Run. Recurring Document Run */
  int getC_Recurring_Run_ID();

  /** Set Recurring Run. Recurring Document Run */
  void setC_Recurring_Run_ID(int C_Recurring_Run_ID);

  /** Get C_Recurring_Run_UU */
  String getC_Recurring_Run_UU();

  /** Set C_Recurring_Run_UU */
  void setC_Recurring_Run_UU(String C_Recurring_Run_UU);

  /** Get Document Date. Date of the Document */
  Timestamp getDateDoc();

  /** Set Document Date. Date of the Document */
  void setDateDoc(Timestamp DateDoc);

  /** Get Journal Batch. General Ledger Journal Batch */
  int getGL_JournalBatch_ID();

  /** Set Journal Batch. General Ledger Journal Batch */
  void setGL_JournalBatch_ID(int GL_JournalBatch_ID);

  I_GL_JournalBatch getGL_JournalBatch() throws RuntimeException;

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
