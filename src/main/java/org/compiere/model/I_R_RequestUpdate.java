package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for R_RequestUpdate
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_RequestUpdate {

  /** TableName=R_RequestUpdate */
  String Table_Name = "R_RequestUpdate";

  /** AD_Table_ID=802 */
  int Table_ID = 802;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name ConfidentialTypeEntry */
  String COLUMNNAME_ConfidentialTypeEntry = "ConfidentialTypeEntry";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name EndTime */
  String COLUMNNAME_EndTime = "EndTime";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_ProductSpent_ID */
  String COLUMNNAME_M_ProductSpent_ID = "M_ProductSpent_ID";
  /** Column name QtyInvoiced */
  String COLUMNNAME_QtyInvoiced = "QtyInvoiced";
  /** Column name QtySpent */
  String COLUMNNAME_QtySpent = "QtySpent";
  /** Column name Result */
  String COLUMNNAME_Result = "Result";
  /** Column name R_Request_ID */
  String COLUMNNAME_R_Request_ID = "R_Request_ID";
  /** Column name R_RequestUpdate_ID */
  String COLUMNNAME_R_RequestUpdate_ID = "R_RequestUpdate_ID";
  /** Column name R_RequestUpdate_UU */
  String COLUMNNAME_R_RequestUpdate_UU = "R_RequestUpdate_UU";
  /** Column name StartTime */
  String COLUMNNAME_StartTime = "StartTime";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Entry Confidentiality. Confidentiality of the individual entry */
  String getConfidentialTypeEntry();

  /** Set Entry Confidentiality. Confidentiality of the individual entry */
  void setConfidentialTypeEntry(String ConfidentialTypeEntry);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get End Time. End of the time span */
  Timestamp getEndTime();

  /** Set End Time. End of the time span */
  void setEndTime(Timestamp EndTime);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Product Used. Product/Resource/Service used in Request */
  int getM_ProductSpent_ID();

  /** Set Product Used. Product/Resource/Service used in Request */
  void setM_ProductSpent_ID(int M_ProductSpent_ID);

  I_M_Product getM_ProductSpent() throws RuntimeException;

  /** Get Quantity Invoiced. Invoiced Quantity */
  BigDecimal getQtyInvoiced();

  /** Set Quantity Invoiced. Invoiced Quantity */
  void setQtyInvoiced(BigDecimal QtyInvoiced);

  /** Get Quantity Used. Quantity used for this event */
  BigDecimal getQtySpent();

  /** Set Quantity Used. Quantity used for this event */
  void setQtySpent(BigDecimal QtySpent);

  /** Get Result. Result of the action taken */
  String getResult();

  /** Set Result. Result of the action taken */
  void setResult(String Result);

  /** Get Request. Request from a Business Partner or Prospect */
  int getR_Request_ID();

  /** Set Request. Request from a Business Partner or Prospect */
  void setR_Request_ID(int R_Request_ID);

  I_R_Request getR_Request() throws RuntimeException;

  /** Get Request Update. Request Updates */
  int getR_RequestUpdate_ID();

  /** Set Request Update. Request Updates */
  void setR_RequestUpdate_ID(int R_RequestUpdate_ID);

  /** Get R_RequestUpdate_UU */
  String getR_RequestUpdate_UU();

  /** Set R_RequestUpdate_UU */
  void setR_RequestUpdate_UU(String R_RequestUpdate_UU);

  /** Get Start Time. Time started */
  Timestamp getStartTime();

  /** Set Start Time. Time started */
  void setStartTime(Timestamp StartTime);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
