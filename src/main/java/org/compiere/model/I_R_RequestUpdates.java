package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for R_RequestUpdates
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_RequestUpdates {

  /** TableName=R_RequestUpdates */
  String Table_Name = "R_RequestUpdates";

  /** AD_Table_ID=783 */
  int Table_ID = 783;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsSelfService */
  String COLUMNNAME_IsSelfService = "IsSelfService";
  /** Column name R_Request_ID */
  String COLUMNNAME_R_Request_ID = "R_Request_ID";
  /** Column name R_RequestUpdates_UU */
  String COLUMNNAME_R_RequestUpdates_UU = "R_RequestUpdates_UU";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  I_AD_User getAD_User() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /**
   * Set Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
   */
  void setIsSelfService(boolean IsSelfService);

  /**
   * Get Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
   */
  boolean isSelfService();

  /** Get Request. Request from a Business Partner or Prospect */
  int getR_Request_ID();

  /** Set Request. Request from a Business Partner or Prospect */
  void setR_Request_ID(int R_Request_ID);

  I_R_Request getR_Request() throws RuntimeException;

  /** Get R_RequestUpdates_UU */
  String getR_RequestUpdates_UU();

  /** Set R_RequestUpdates_UU */
  void setR_RequestUpdates_UU(String R_RequestUpdates_UU);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
