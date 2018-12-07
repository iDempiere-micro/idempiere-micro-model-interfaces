package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Campaign
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Campaign {

  /** TableName=C_Campaign */
  String Table_Name = "C_Campaign";

  /** AD_Table_ID=274 */
  int Table_ID = 274;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_Campaign_ID */
  String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
  /** Column name C_Campaign_UU */
  String COLUMNNAME_C_Campaign_UU = "C_Campaign_UU";
  /** Column name C_Channel_ID */
  String COLUMNNAME_C_Channel_ID = "C_Channel_ID";
  /** Column name Costs */
  String COLUMNNAME_Costs = "Costs";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EndDate */
  String COLUMNNAME_EndDate = "EndDate";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsSummary */
  String COLUMNNAME_IsSummary = "IsSummary";
  /** Column name StartDate */
  String COLUMNNAME_StartDate = "StartDate";
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

  /** Get Campaign. Marketing Campaign */
  int getC_Campaign_ID();

  /** Set Campaign. Marketing Campaign */
  void setC_Campaign_ID(int C_Campaign_ID);

  /** Get C_Campaign_UU */
  String getC_Campaign_UU();

  /** Set C_Campaign_UU */
  void setC_Campaign_UU(String C_Campaign_UU);

  /** Get Channel. Sales Channel */
  int getC_Channel_ID();

  /** Set Channel. Sales Channel */
  void setC_Channel_ID(int C_Channel_ID);

  I_C_Channel getC_Channel() throws RuntimeException;

  /** Get Costs. Costs in accounting currency */
  BigDecimal getCosts();

  /** Set Costs. Costs in accounting currency */
  void setCosts(BigDecimal Costs);

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

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Summary Level. This is a summary entity */
  void setIsSummary(boolean IsSummary);

  /** Get Summary Level. This is a summary entity */
  boolean isSummary();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Start Date. First effective day (inclusive) */
  Timestamp getStartDate();

  /** Set Start Date. First effective day (inclusive) */
  void setStartDate(Timestamp StartDate);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);
}
