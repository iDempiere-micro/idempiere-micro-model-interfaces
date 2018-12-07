package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for K_CategoryValue
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_K_CategoryValue {

  /** TableName=K_CategoryValue */
  String Table_Name = "K_CategoryValue";

  /** AD_Table_ID=614 */
  int Table_ID = 614;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name K_Category_ID */
  String COLUMNNAME_K_Category_ID = "K_Category_ID";
  /** Column name K_CategoryValue_ID */
  String COLUMNNAME_K_CategoryValue_ID = "K_CategoryValue_ID";
  /** Column name K_CategoryValue_UU */
  String COLUMNNAME_K_CategoryValue_UU = "K_CategoryValue_UU";
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

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Knowledge Category. Knowledge Category */
  int getK_Category_ID();

  /** Set Knowledge Category. Knowledge Category */
  void setK_Category_ID(int K_Category_ID);

  I_K_Category getK_Category() throws RuntimeException;

  /** Get Category Value. The value of the category */
  int getK_CategoryValue_ID();

  /** Set Category Value. The value of the category */
  void setK_CategoryValue_ID(int K_CategoryValue_ID);

  /** Get K_CategoryValue_UU */
  String getK_CategoryValue_UU();

  /** Set K_CategoryValue_UU */
  void setK_CategoryValue_UU(String K_CategoryValue_UU);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
