package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_CashPlan
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_CashPlan {

  /** TableName=C_CashPlan */
  String Table_Name = "C_CashPlan";

  /** AD_Table_ID=53297 */
  int Table_ID = 53297;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_OrgTrx_ID */
  String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
  /** Column name C_Activity_ID */
  String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
  /** Column name CashFlowType */
  String COLUMNNAME_CashFlowType = "CashFlowType";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_Campaign_ID */
  String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
  /** Column name C_CashPlan_ID */
  String COLUMNNAME_C_CashPlan_ID = "C_CashPlan_ID";
  /** Column name C_CashPlan_UU */
  String COLUMNNAME_C_CashPlan_UU = "C_CashPlan_UU";
  /** Column name CopyFrom */
  String COLUMNNAME_CopyFrom = "CopyFrom";
  /** Column name C_Project_ID */
  String COLUMNNAME_C_Project_ID = "C_Project_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DateDoc */
  String COLUMNNAME_DateDoc = "DateDoc";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DocumentNo */
  String COLUMNNAME_DocumentNo = "DocumentNo";
  /** Column name GeneratePeriodic */
  String COLUMNNAME_GeneratePeriodic = "GeneratePeriodic";
  /** Column name GrandTotal */
  String COLUMNNAME_GrandTotal = "GrandTotal";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsApproved */
  String COLUMNNAME_IsApproved = "IsApproved";
  /** Column name IsSOTrx */
  String COLUMNNAME_IsSOTrx = "IsSOTrx";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name User1_ID */
  String COLUMNNAME_User1_ID = "User1_ID";
  /** Column name User2_ID */
  String COLUMNNAME_User2_ID = "User2_ID";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Trx Organization. Performing or initiating organization */
  int getAD_OrgTrx_ID();

  /** Set Trx Organization. Performing or initiating organization */
  void setAD_OrgTrx_ID(int AD_OrgTrx_ID);

  /** Get Activity. Business Activity */
  int getC_Activity_ID();

  /** Set Activity. Business Activity */
  void setC_Activity_ID(int C_Activity_ID);

  I_C_Activity getC_Activity() throws RuntimeException;

  /** Get Cash Flow Type */
  String getCashFlowType();

  /** Set Cash Flow Type */
  void setCashFlowType(String CashFlowType);

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Campaign. Marketing Campaign */
  int getC_Campaign_ID();

  /** Set Campaign. Marketing Campaign */
  void setC_Campaign_ID(int C_Campaign_ID);

  I_C_Campaign getC_Campaign() throws RuntimeException;

  /** Get Cash Plan */
  int getC_CashPlan_ID();

  /** Set Cash Plan */
  void setC_CashPlan_ID(int C_CashPlan_ID);

  /** Get C_CashPlan_UU */
  String getC_CashPlan_UU();

  /** Set C_CashPlan_UU */
  void setC_CashPlan_UU(String C_CashPlan_UU);

  /** Get Copy From. Copy From Record */
  String getCopyFrom();

  /** Set Copy From. Copy From Record */
  void setCopyFrom(String CopyFrom);

  /** Get Project. Financial Project */
  int getC_Project_ID();

  /** Set Project. Financial Project */
  void setC_Project_ID(int C_Project_ID);

  I_C_Project getC_Project() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Document Date. Date of the Document */
  Timestamp getDateDoc();

  /** Set Document Date. Date of the Document */
  void setDateDoc(Timestamp DateDoc);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Document No. Document sequence number of the document */
  String getDocumentNo();

  /** Set Document No. Document sequence number of the document */
  void setDocumentNo(String DocumentNo);

  /** Get Generate Periodic Plan */
  String getGeneratePeriodic();

  /** Set Generate Periodic Plan */
  void setGeneratePeriodic(String GeneratePeriodic);

  /** Get Grand Total. Total amount of document */
  BigDecimal getGrandTotal();

  /** Set Grand Total. Total amount of document */
  void setGrandTotal(BigDecimal GrandTotal);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Approved. Indicates if this document requires approval */
  void setIsApproved(boolean IsApproved);

  /** Get Approved. Indicates if this document requires approval */
  boolean isApproved();

  /** Set Sales Transaction. This is a Sales Transaction */
  void setIsSOTrx(boolean IsSOTrx);

  /** Get Sales Transaction. This is a Sales Transaction */
  boolean isSOTrx();

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get User Element List 1. User defined list element #1 */
  int getUser1_ID();

  /** Set User Element List 1. User defined list element #1 */
  void setUser1_ID(int User1_ID);

  I_C_ElementValue getUser1() throws RuntimeException;

  /** Get User Element List 2. User defined list element #2 */
  int getUser2_ID();

  /** Set User Element List 2. User defined list element #2 */
  void setUser2_ID(int User2_ID);

  I_C_ElementValue getUser2() throws RuntimeException;
}
