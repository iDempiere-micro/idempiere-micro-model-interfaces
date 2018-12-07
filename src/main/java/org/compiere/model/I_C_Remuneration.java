package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Remuneration
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Remuneration {

  /** TableName=C_Remuneration */
  String Table_Name = "C_Remuneration";

  /** AD_Table_ID=792 */
  int Table_ID = 792;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_Remuneration_ID */
  String COLUMNNAME_C_Remuneration_ID = "C_Remuneration_ID";
  /** Column name C_Remuneration_UU */
  String COLUMNNAME_C_Remuneration_UU = "C_Remuneration_UU";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name GrossRAmt */
  String COLUMNNAME_GrossRAmt = "GrossRAmt";
  /** Column name GrossRCost */
  String COLUMNNAME_GrossRCost = "GrossRCost";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name OvertimeAmt */
  String COLUMNNAME_OvertimeAmt = "OvertimeAmt";
  /** Column name OvertimeCost */
  String COLUMNNAME_OvertimeCost = "OvertimeCost";
  /** Column name RemunerationType */
  String COLUMNNAME_RemunerationType = "RemunerationType";
  /** Column name StandardHours */
  String COLUMNNAME_StandardHours = "StandardHours";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Remuneration. Wage or Salary */
  int getC_Remuneration_ID();

  /** Set Remuneration. Wage or Salary */
  void setC_Remuneration_ID(int C_Remuneration_ID);

  /** Get C_Remuneration_UU */
  String getC_Remuneration_UU();

  /** Set C_Remuneration_UU */
  void setC_Remuneration_UU(String C_Remuneration_UU);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Gross Amount. Gross Remuneration Amount */
  BigDecimal getGrossRAmt();

  /** Set Gross Amount. Gross Remuneration Amount */
  void setGrossRAmt(BigDecimal GrossRAmt);

  /** Get Gross Cost. Gross Remuneration Costs */
  BigDecimal getGrossRCost();

  /** Set Gross Cost. Gross Remuneration Costs */
  void setGrossRCost(BigDecimal GrossRCost);

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

  /** Get Overtime Amount. Hourly Overtime Rate */
  BigDecimal getOvertimeAmt();

  /** Set Overtime Amount. Hourly Overtime Rate */
  void setOvertimeAmt(BigDecimal OvertimeAmt);

  /** Get Overtime Cost. Hourly Overtime Cost */
  BigDecimal getOvertimeCost();

  /** Set Overtime Cost. Hourly Overtime Cost */
  void setOvertimeCost(BigDecimal OvertimeCost);

  /** Get Remuneration Type. Type of Remuneration */
  String getRemunerationType();

  /** Set Remuneration Type. Type of Remuneration */
  void setRemunerationType(String RemunerationType);

  /** Get Standard Hours. Standard Work Hours based on Remuneration Type */
  int getStandardHours();

  /** Set Standard Hours. Standard Work Hours based on Remuneration Type */
  void setStandardHours(int StandardHours);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
