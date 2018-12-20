package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;
import org.idempiere.icommon.model.IPO;

/**
 * Generated Interface for C_Project
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Project extends IPO {

  /** TableName=C_Project */
  String Table_Name = "C_Project";

  /** AD_Table_ID=203 */
  int Table_ID = 203;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_OrgTrx_ID */
  String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name C_Activity_ID */
  String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BPartner_Location_ID */
  String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
  /** Column name C_BPartnerSR_ID */
  String COLUMNNAME_C_BPartnerSR_ID = "C_BPartnerSR_ID";
  /** Column name C_Campaign_ID */
  String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name CommittedAmt */
  String COLUMNNAME_CommittedAmt = "CommittedAmt";
  /** Column name CommittedQty */
  String COLUMNNAME_CommittedQty = "CommittedQty";
  /** Column name CopyFrom */
  String COLUMNNAME_CopyFrom = "CopyFrom";
  /** Column name C_PaymentTerm_ID */
  String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
  /** Column name C_Phase_ID */
  String COLUMNNAME_C_Phase_ID = "C_Phase_ID";
  /** Column name C_Project_ID */
  String COLUMNNAME_C_Project_ID = "C_Project_ID";
  /** Column name C_ProjectType_ID */
  String COLUMNNAME_C_ProjectType_ID = "C_ProjectType_ID";
  /** Column name C_Project_UU */
  String COLUMNNAME_C_Project_UU = "C_Project_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DateContract */
  String COLUMNNAME_DateContract = "DateContract";
  /** Column name DateFinish */
  String COLUMNNAME_DateFinish = "DateFinish";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name GenerateTo */
  String COLUMNNAME_GenerateTo = "GenerateTo";
  /** Column name InvoicedAmt */
  String COLUMNNAME_InvoicedAmt = "InvoicedAmt";
  /** Column name InvoicedQty */
  String COLUMNNAME_InvoicedQty = "InvoicedQty";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsCommitCeiling */
  String COLUMNNAME_IsCommitCeiling = "IsCommitCeiling";
  /** Column name IsCommitment */
  String COLUMNNAME_IsCommitment = "IsCommitment";
  /** Column name IsSummary */
  String COLUMNNAME_IsSummary = "IsSummary";
  /** Column name M_PriceList_Version_ID */
  String COLUMNNAME_M_PriceList_Version_ID = "M_PriceList_Version_ID";
  /** Column name M_Warehouse_ID */
  String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
  /** Column name Note */
  String COLUMNNAME_Note = "Note";
  /** Column name PlannedAmt */
  String COLUMNNAME_PlannedAmt = "PlannedAmt";
  /** Column name PlannedMarginAmt */
  String COLUMNNAME_PlannedMarginAmt = "PlannedMarginAmt";
  /** Column name PlannedQty */
  String COLUMNNAME_PlannedQty = "PlannedQty";
  /** Column name POReference */
  String COLUMNNAME_POReference = "POReference";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name ProjectBalanceAmt */
  String COLUMNNAME_ProjectBalanceAmt = "ProjectBalanceAmt";
  /** Column name ProjectCategory */
  String COLUMNNAME_ProjectCategory = "ProjectCategory";
  /** Column name ProjectLineLevel */
  String COLUMNNAME_ProjectLineLevel = "ProjectLineLevel";
  /** Column name ProjInvoiceRule */
  String COLUMNNAME_ProjInvoiceRule = "ProjInvoiceRule";
  /** Column name SalesRep_ID */
  String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name Value */
  String COLUMNNAME_Value = "Value";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Trx Organization. Performing or initiating organization */
  int getAD_OrgTrx_ID();

  /** Set Trx Organization. Performing or initiating organization */
  void setAD_OrgTrx_ID(int AD_OrgTrx_ID);

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  I_AD_User getAD_User() throws RuntimeException;

  /** Get Activity. Business Activity */
  int getC_Activity_ID();

  /** Set Activity. Business Activity */
  void setC_Activity_ID(int C_Activity_ID);

  I_C_Activity getC_Activity() throws RuntimeException;

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Partner Location. Identifies the (ship to) address for this Business Partner */
  int getC_BPartner_Location_ID();

  /** Set Partner Location. Identifies the (ship to) address for this Business Partner */
  void setC_BPartner_Location_ID(int C_BPartner_Location_ID);

  I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException;

  /** Get BPartner (Agent). Business Partner (Agent or Sales Rep) */
  int getC_BPartnerSR_ID();

  /** Set BPartner (Agent). Business Partner (Agent or Sales Rep) */
  void setC_BPartnerSR_ID(int C_BPartnerSR_ID);

  I_C_BPartner getC_BPartnerSR() throws RuntimeException;

  /** Get Campaign. Marketing Campaign */
  int getC_Campaign_ID();

  /** Set Campaign. Marketing Campaign */
  void setC_Campaign_ID(int C_Campaign_ID);

  I_C_Campaign getC_Campaign() throws RuntimeException;

  /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

  /** Set Currency. The Currency for this record */
  void setC_Currency_ID(int C_Currency_ID);

  I_C_Currency getC_Currency() throws RuntimeException;

  /** Get Committed Amount. The (legal) commitment amount */
  BigDecimal getCommittedAmt();

  /** Set Committed Amount. The (legal) commitment amount */
  void setCommittedAmt(BigDecimal CommittedAmt);

  /** Get Committed Quantity. The (legal) commitment Quantity */
  BigDecimal getCommittedQty();

  /** Set Committed Quantity. The (legal) commitment Quantity */
  void setCommittedQty(BigDecimal CommittedQty);

  /** Get Copy From. Copy From Record */
  String getCopyFrom();

  /** Set Copy From. Copy From Record */
  void setCopyFrom(String CopyFrom);

  /** Get Payment Term. The terms of Payment (timing, discount) */
  int getC_PaymentTerm_ID();

  /** Set Payment Term. The terms of Payment (timing, discount) */
  void setC_PaymentTerm_ID(int C_PaymentTerm_ID);

  I_C_PaymentTerm getC_PaymentTerm() throws RuntimeException;

  /** Get Standard Phase. Standard Phase of the Project Type */
  int getC_Phase_ID();

  /** Set Standard Phase. Standard Phase of the Project Type */
  void setC_Phase_ID(int C_Phase_ID);

  I_C_Phase getC_Phase() throws RuntimeException;

  /** Get Project. Financial Project */
  int getC_Project_ID();

  /** Set Project. Financial Project */
  void setC_Project_ID(int C_Project_ID);

  /** Get Project Type. Type of the project */
  String getC_ProjectType_ID();

  /** Set Project Type. Type of the project */
  void setC_ProjectType_ID(String C_ProjectType_ID);

  /** Get C_Project_UU */
  String getC_Project_UU();

  /** Set C_Project_UU */
  void setC_Project_UU(String C_Project_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Contract Date. The (planned) effective date of this document. */
  Timestamp getDateContract();

  /** Set Contract Date. The (planned) effective date of this document. */
  void setDateContract(Timestamp DateContract);

  /** Get Finish Date. Finish or (planned) completion date */
  Timestamp getDateFinish();

  /** Set Finish Date. Finish or (planned) completion date */
  void setDateFinish(Timestamp DateFinish);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Generate To. Generate To */
  String getGenerateTo();

  /** Set Generate To. Generate To */
  void setGenerateTo(String GenerateTo);

  /** Get Invoiced Amount. The amount invoiced */
  BigDecimal getInvoicedAmt();

  /** Set Invoiced Amount. The amount invoiced */
  void setInvoicedAmt(BigDecimal InvoicedAmt);

  /** Get Quantity Invoiced . The quantity invoiced */
  BigDecimal getInvoicedQty();

  /** Set Quantity Invoiced . The quantity invoiced */
  void setInvoicedQty(BigDecimal InvoicedQty);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Commitment is Ceiling. The commitment amount/quantity is the chargeable ceiling */
  void setIsCommitCeiling(boolean IsCommitCeiling);

  /** Get Commitment is Ceiling. The commitment amount/quantity is the chargeable ceiling */
  boolean isCommitCeiling();

  /** Set Commitment. Is this document a (legal) commitment? */
  void setIsCommitment(boolean IsCommitment);

  /** Get Commitment. Is this document a (legal) commitment? */
  boolean isCommitment();

  /** Set Summary Level. This is a summary entity */
  void setIsSummary(boolean IsSummary);

  /** Get Summary Level. This is a summary entity */
  boolean isSummary();

  /** Get Price List Version. Identifies a unique instance of a Price List */
  int getM_PriceList_Version_ID();

  /** Set Price List Version. Identifies a unique instance of a Price List */
  void setM_PriceList_Version_ID(int M_PriceList_Version_ID);

  I_M_PriceList_Version getM_PriceList_Version() throws RuntimeException;

  /** Get Warehouse. Storage Warehouse and Service Point */
  int getM_Warehouse_ID();

  /** Set Warehouse. Storage Warehouse and Service Point */
  void setM_Warehouse_ID(int M_Warehouse_ID);

  I_M_Warehouse getM_Warehouse() throws RuntimeException;

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Note. Optional additional user defined information */
  String getNote();

  /** Set Note. Optional additional user defined information */
  void setNote(String Note);

  /** Get Planned Amount. Planned amount for this project */
  BigDecimal getPlannedAmt();

  /** Set Planned Amount. Planned amount for this project */
  void setPlannedAmt(BigDecimal PlannedAmt);

  /** Get Planned Margin. Project's planned margin amount */
  BigDecimal getPlannedMarginAmt();

  /** Set Planned Margin. Project's planned margin amount */
  void setPlannedMarginAmt(BigDecimal PlannedMarginAmt);

  /** Get Planned Quantity. Planned quantity for this project */
  BigDecimal getPlannedQty();

  /** Set Planned Quantity. Planned quantity for this project */
  void setPlannedQty(BigDecimal PlannedQty);

  /**
   * Get Order Reference. Transaction Reference Number (Sales Order, Purchase Order) of your
   * Business Partner
   */
  String getPOReference();

  /**
   * Set Order Reference. Transaction Reference Number (Sales Order, Purchase Order) of your
   * Business Partner
   */
  void setPOReference(String POReference);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Project Balance. Total Project Balance */
  BigDecimal getProjectBalanceAmt();

  /** Set Project Balance. Total Project Balance */
  void setProjectBalanceAmt(BigDecimal ProjectBalanceAmt);

  /** Get Project Category. Project Category */
  String getProjectCategory();

  /** Set Project Category. Project Category */
  void setProjectCategory(String ProjectCategory);

  /** Get Line Level. Project Line Level */
  String getProjectLineLevel();

  /** Set Line Level. Project Line Level */
  void setProjectLineLevel(String ProjectLineLevel);

  /** Get Invoice Rule. Invoice Rule for the project */
  String getProjInvoiceRule();

  /** Set Invoice Rule. Invoice Rule for the project */
  void setProjInvoiceRule(String ProjInvoiceRule);

  /** Get Sales Representative. Sales Representative or Company Agent */
  int getSalesRep_ID();

  /** Set Sales Representative. Sales Representative or Company Agent */
  void setSalesRep_ID(int SalesRep_ID);

  I_AD_User getSalesRep() throws RuntimeException;

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);
}
