package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_StatusLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_StatusLine {

  /** TableName=AD_StatusLine */
  String Table_Name = "AD_StatusLine";

  /** AD_Table_ID=200107 */
  int Table_ID = 200107;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Message_ID */
  String COLUMNNAME_AD_Message_ID = "AD_Message_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_StatusLine_ID */
  String COLUMNNAME_AD_StatusLine_ID = "AD_StatusLine_ID";
  /** Column name AD_StatusLine_UU */
  String COLUMNNAME_AD_StatusLine_UU = "AD_StatusLine_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name SQLStatement */
  String COLUMNNAME_SQLStatement = "SQLStatement";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Message. System Message */
  int getAD_Message_ID();

  /** Set Message. System Message */
  void setAD_Message_ID(int AD_Message_ID);

  I_AD_Message getAD_Message() throws RuntimeException;

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Status Line */
  int getAD_StatusLine_ID();

  /** Set Status Line */
  void setAD_StatusLine_ID(int AD_StatusLine_ID);

  /** Get AD_StatusLine_UU */
  String getAD_StatusLine_UU();

  /** Set AD_StatusLine_UU */
  void setAD_StatusLine_UU(String AD_StatusLine_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  String getEntityType();

  /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get SQLStatement */
  String getSQLStatement();

  /** Set SQLStatement */
  void setSQLStatement(String SQLStatement);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
