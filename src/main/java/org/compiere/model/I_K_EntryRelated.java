package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for K_EntryRelated
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_K_EntryRelated {

  /** TableName=K_EntryRelated */
  String Table_Name = "K_EntryRelated";

  /** AD_Table_ID=610 */
  int Table_ID = 610;

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
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name K_Entry_ID */
  String COLUMNNAME_K_Entry_ID = "K_Entry_ID";
  /** Column name K_EntryRelated_ID */
  String COLUMNNAME_K_EntryRelated_ID = "K_EntryRelated_ID";
  /** Column name K_EntryRelated_UU */
  String COLUMNNAME_K_EntryRelated_UU = "K_EntryRelated_UU";
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

  /** Get Entry. Knowledge Entry */
  int getK_Entry_ID();

  /** Set Entry. Knowledge Entry */
  void setK_Entry_ID(int K_Entry_ID);

  I_K_Entry getK_Entry() throws RuntimeException;

  /** Get Related Entry. Related Entry for this Entry */
  int getK_EntryRelated_ID();

  /** Set Related Entry. Related Entry for this Entry */
  void setK_EntryRelated_ID(int K_EntryRelated_ID);

  /** Get K_EntryRelated_UU */
  String getK_EntryRelated_UU();

  /** Set K_EntryRelated_UU */
  void setK_EntryRelated_UU(String K_EntryRelated_UU);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
