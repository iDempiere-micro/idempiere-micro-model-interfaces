package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for R_IssueRecommendation
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_IssueRecommendation {

  /** TableName=R_IssueRecommendation */
  String Table_Name = "R_IssueRecommendation";

  /** AD_Table_ID=837 */
  int Table_ID = 837;

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
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name R_IssueRecommendation_ID */
  String COLUMNNAME_R_IssueRecommendation_ID = "R_IssueRecommendation_ID";
  /** Column name R_IssueRecommendation_UU */
  String COLUMNNAME_R_IssueRecommendation_UU = "R_IssueRecommendation_UU";
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

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Issue Recommendation. Recommendations how to fix an Issue */
  int getR_IssueRecommendation_ID();

  /** Set Issue Recommendation. Recommendations how to fix an Issue */
  void setR_IssueRecommendation_ID(int R_IssueRecommendation_ID);

  /** Get R_IssueRecommendation_UU */
  String getR_IssueRecommendation_UU();

  /** Set R_IssueRecommendation_UU */
  void setR_IssueRecommendation_UU(String R_IssueRecommendation_UU);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
