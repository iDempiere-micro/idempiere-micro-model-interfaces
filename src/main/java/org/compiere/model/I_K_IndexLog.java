package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for K_IndexLog
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_K_IndexLog {

  /** TableName=K_IndexLog */
  String Table_Name = "K_IndexLog";

  /** AD_Table_ID=899 */
  int Table_ID = 899;

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
  /** Column name IndexQuery */
  String COLUMNNAME_IndexQuery = "IndexQuery";
  /** Column name IndexQueryResult */
  String COLUMNNAME_IndexQueryResult = "IndexQueryResult";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name K_IndexLog_ID */
  String COLUMNNAME_K_IndexLog_ID = "K_IndexLog_ID";
  /** Column name K_IndexLog_UU */
  String COLUMNNAME_K_IndexLog_UU = "K_IndexLog_UU";
  /** Column name QuerySource */
  String COLUMNNAME_QuerySource = "QuerySource";
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

  /** Get Index Query. Text Search Query */
  String getIndexQuery();

  /** Set Index Query. Text Search Query */
  void setIndexQuery(String IndexQuery);

  /** Get Query Result. Result of the text query */
  int getIndexQueryResult();

  /** Set Query Result. Result of the text query */
  void setIndexQueryResult(int IndexQueryResult);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Index Log. Text search log */
  int getK_IndexLog_ID();

  /** Set Index Log. Text search log */
  void setK_IndexLog_ID(int K_IndexLog_ID);

  /** Get K_IndexLog_UU */
  String getK_IndexLog_UU();

  /** Set K_IndexLog_UU */
  void setK_IndexLog_UU(String K_IndexLog_UU);

  /** Get Query Source. Source of the Query */
  String getQuerySource();

  /** Set Query Source. Source of the Query */
  void setQuerySource(String QuerySource);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
