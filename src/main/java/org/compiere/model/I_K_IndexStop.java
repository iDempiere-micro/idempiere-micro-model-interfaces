package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for K_IndexStop
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_K_IndexStop {

  /** TableName=K_IndexStop */
  String Table_Name = "K_IndexStop";

  /** AD_Table_ID=901 */
  int Table_ID = 901;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_DocType_ID */
  String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
  /** Column name CM_WebProject_ID */
  String COLUMNNAME_CM_WebProject_ID = "CM_WebProject_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsManual */
  String COLUMNNAME_IsManual = "IsManual";
  /** Column name Keyword */
  String COLUMNNAME_Keyword = "Keyword";
  /** Column name K_IndexStop_ID */
  String COLUMNNAME_K_IndexStop_ID = "K_IndexStop_ID";
  /** Column name K_IndexStop_UU */
  String COLUMNNAME_K_IndexStop_UU = "K_IndexStop_UU";
  /** Column name R_RequestType_ID */
  String COLUMNNAME_R_RequestType_ID = "R_RequestType_ID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Document Type. Document type or rules */
  int getC_DocType_ID();

  /** Set Document Type. Document type or rules */
  void setC_DocType_ID(int C_DocType_ID);

  I_C_DocType getC_DocType() throws RuntimeException;

  /**
   * Get Web Project. A web project is the main data container for Containers, URLs, Ads, Media etc.
   */
  int getCM_WebProject_ID();

  /**
   * Set Web Project. A web project is the main data container for Containers, URLs, Ads, Media etc.
   */
  void setCM_WebProject_ID(int CM_WebProject_ID);

  I_CM_WebProject getCM_WebProject() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Manual. This is a manual process */
  void setIsManual(boolean IsManual);

  /** Get Manual. This is a manual process */
  boolean isManual();

  /** Get Keyword. Case insensitive keyword */
  String getKeyword();

  /** Set Keyword. Case insensitive keyword */
  void setKeyword(String Keyword);

  /** Get Index Stop. Keyword not to be indexed */
  int getK_IndexStop_ID();

  /** Set Index Stop. Keyword not to be indexed */
  void setK_IndexStop_ID(int K_IndexStop_ID);

  /** Get K_IndexStop_UU */
  String getK_IndexStop_UU();

  /** Set K_IndexStop_UU */
  void setK_IndexStop_UU(String K_IndexStop_UU);

  /** Get Request Type. Type of request (e.g. Inquiry, Complaint, ..) */
  int getR_RequestType_ID();

  /** Set Request Type. Type of request (e.g. Inquiry, Complaint, ..) */
  void setR_RequestType_ID(int R_RequestType_ID);

  I_R_RequestType getR_RequestType() throws RuntimeException;

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
