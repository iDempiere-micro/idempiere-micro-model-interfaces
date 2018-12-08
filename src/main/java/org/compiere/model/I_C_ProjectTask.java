package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_ProjectTask
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_ProjectTask {

  /** TableName=C_ProjectTask */
  String Table_Name = "C_ProjectTask";

  /** AD_Table_ID=584 */
  int Table_ID = 584;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name CommittedAmt */
  String COLUMNNAME_CommittedAmt = "CommittedAmt";
  /** Column name C_ProjectPhase_ID */
  String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";
  /** Column name C_ProjectTask_ID */
  String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";
  /** Column name C_ProjectTask_UU */
  String COLUMNNAME_C_ProjectTask_UU = "C_ProjectTask_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_Task_ID */
  String COLUMNNAME_C_Task_ID = "C_Task_ID";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name PlannedAmt */
  String COLUMNNAME_PlannedAmt = "PlannedAmt";
  /** Column name ProjInvoiceRule */
  String COLUMNNAME_ProjInvoiceRule = "ProjInvoiceRule";
  /** Column name Qty */
  String COLUMNNAME_Qty = "Qty";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
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

  /** Get Project Phase. Phase of a Project */
  int getC_ProjectPhase_ID();

  /** Set Project Phase. Phase of a Project */
  void setC_ProjectPhase_ID(int C_ProjectPhase_ID);

  I_C_ProjectPhase getC_ProjectPhase() throws RuntimeException;

  /** Get Project Task. Actual Project Task in a Phase */
  int getC_ProjectTask_ID();

  /** Set Project Task. Actual Project Task in a Phase */
  void setC_ProjectTask_ID(int C_ProjectTask_ID);

  /** Get C_ProjectTask_UU */
  String getC_ProjectTask_UU();

  /** Set C_ProjectTask_UU */
  void setC_ProjectTask_UU(String C_ProjectTask_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Standard Task. Standard Project Type Task */
  int getC_Task_ID();

  /** Set Standard Task. Standard Project Type Task */
  void setC_Task_ID(int C_Task_ID);

  I_C_Task getC_Task() throws RuntimeException;

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

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

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
