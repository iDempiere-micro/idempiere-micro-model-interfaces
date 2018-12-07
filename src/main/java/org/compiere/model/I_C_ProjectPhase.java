package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_ProjectPhase
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_ProjectPhase {

  /** TableName=C_ProjectPhase */
  String Table_Name = "C_ProjectPhase";

  /** AD_Table_ID=576 */
  int Table_ID = 576;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name CommittedAmt */
  String COLUMNNAME_CommittedAmt = "CommittedAmt";
  /** Column name C_Order_ID */
  String COLUMNNAME_C_Order_ID = "C_Order_ID";
  /** Column name C_Phase_ID */
  String COLUMNNAME_C_Phase_ID = "C_Phase_ID";
  /** Column name C_Project_ID */
  String COLUMNNAME_C_Project_ID = "C_Project_ID";
  /** Column name C_ProjectPhase_ID */
  String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";
  /** Column name C_ProjectPhase_UU */
  String COLUMNNAME_C_ProjectPhase_UU = "C_ProjectPhase_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EndDate */
  String COLUMNNAME_EndDate = "EndDate";
  /** Column name GenerateOrder */
  String COLUMNNAME_GenerateOrder = "GenerateOrder";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsCommitCeiling */
  String COLUMNNAME_IsCommitCeiling = "IsCommitCeiling";
  /** Column name IsComplete */
  String COLUMNNAME_IsComplete = "IsComplete";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name PlannedAmt */
  String COLUMNNAME_PlannedAmt = "PlannedAmt";
  /** Column name PriceActual */
  String COLUMNNAME_PriceActual = "PriceActual";
  /** Column name ProjInvoiceRule */
  String COLUMNNAME_ProjInvoiceRule = "ProjInvoiceRule";
  /** Column name Qty */
  String COLUMNNAME_Qty = "Qty";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name StartDate */
  String COLUMNNAME_StartDate = "StartDate";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Committed Amount. The (legal) commitment amount */
  BigDecimal getCommittedAmt();

  /** Set Committed Amount. The (legal) commitment amount */
  void setCommittedAmt(BigDecimal CommittedAmt);

  /** Get Order. Order */
  int getC_Order_ID();

  /** Set Order. Order */
  void setC_Order_ID(int C_Order_ID);

  I_C_Order getC_Order() throws RuntimeException;

  /** Get Standard Phase. Standard Phase of the Project Type */
  int getC_Phase_ID();

  /** Set Standard Phase. Standard Phase of the Project Type */
  void setC_Phase_ID(int C_Phase_ID);

  I_C_Phase getC_Phase() throws RuntimeException;

  /** Get Project. Financial Project */
  int getC_Project_ID();

  /** Set Project. Financial Project */
  void setC_Project_ID(int C_Project_ID);

  I_C_Project getC_Project() throws RuntimeException;

  /** Get Project Phase. Phase of a Project */
  int getC_ProjectPhase_ID();

  /** Set Project Phase. Phase of a Project */
  void setC_ProjectPhase_ID(int C_ProjectPhase_ID);

  /** Get C_ProjectPhase_UU */
  String getC_ProjectPhase_UU();

  /** Set C_ProjectPhase_UU */
  void setC_ProjectPhase_UU(String C_ProjectPhase_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get End Date. Last effective date (inclusive) */
  Timestamp getEndDate();

  /** Set End Date. Last effective date (inclusive) */
  void setEndDate(Timestamp EndDate);

  /** Get Generate Order. Generate Order */
  String getGenerateOrder();

  /** Set Generate Order. Generate Order */
  void setGenerateOrder(String GenerateOrder);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Commitment is Ceiling. The commitment amount/quantity is the chargeable ceiling */
  void setIsCommitCeiling(boolean IsCommitCeiling);

  /** Get Commitment is Ceiling. The commitment amount/quantity is the chargeable ceiling */
  boolean isCommitCeiling();

  /** Set Complete. It is complete */
  void setIsComplete(boolean IsComplete);

  /** Get Complete. It is complete */
  boolean isComplete();

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Planned Amount. Planned amount for this project */
  BigDecimal getPlannedAmt();

  /** Set Planned Amount. Planned amount for this project */
  void setPlannedAmt(BigDecimal PlannedAmt);

  /** Get Unit Price. Actual Price */
  BigDecimal getPriceActual();

  /** Set Unit Price. Actual Price */
  void setPriceActual(BigDecimal PriceActual);

  /** Get Invoice Rule. Invoice Rule for the project */
  String getProjInvoiceRule();

  /** Set Invoice Rule. Invoice Rule for the project */
  void setProjInvoiceRule(String ProjInvoiceRule);

  /** Get Quantity. Quantity */
  BigDecimal getQty();

  /** Set Quantity. Quantity */
  void setQty(BigDecimal Qty);

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

  /** Get Start Date. First effective day (inclusive) */
  Timestamp getStartDate();

  /** Set Start Date. First effective day (inclusive) */
  void setStartDate(Timestamp StartDate);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
