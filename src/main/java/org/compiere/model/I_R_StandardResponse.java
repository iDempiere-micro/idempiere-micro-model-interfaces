package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for R_StandardResponse
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_StandardResponse {

  /** TableName=R_StandardResponse */
  String Table_Name = "R_StandardResponse";

  /** AD_Table_ID=775 */
  int Table_ID = 775;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name ResponseText */
  String COLUMNNAME_ResponseText = "ResponseText";
  /** Column name R_StandardResponse_ID */
  String COLUMNNAME_R_StandardResponse_ID = "R_StandardResponse_ID";
  /** Column name R_StandardResponse_UU */
  String COLUMNNAME_R_StandardResponse_UU = "R_StandardResponse_UU";
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

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Response Text. Request Response Text */
  String getResponseText();

  /** Set Response Text. Request Response Text */
  void setResponseText(String ResponseText);

  /** Get Standard Response. Request Standard Response */
  int getR_StandardResponse_ID();

  /** Set Standard Response. Request Standard Response */
  void setR_StandardResponse_ID(int R_StandardResponse_ID);

  /** Get R_StandardResponse_UU */
  String getR_StandardResponse_UU();

  /** Set R_StandardResponse_UU */
  void setR_StandardResponse_UU(String R_StandardResponse_UU);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
