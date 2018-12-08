package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for CM_AccessNewsChannel
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_CM_AccessNewsChannel {

  /** TableName=CM_AccessNewsChannel */
  String Table_Name = "CM_AccessNewsChannel";

  /** AD_Table_ID=891 */
  int Table_ID = 891;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name CM_AccessNewsChannel_UU */
  String COLUMNNAME_CM_AccessNewsChannel_UU = "CM_AccessNewsChannel_UU";
  /** Column name CM_AccessProfile_ID */
  String COLUMNNAME_CM_AccessProfile_ID = "CM_AccessProfile_ID";
  /** Column name CM_NewsChannel_ID */
  String COLUMNNAME_CM_NewsChannel_ID = "CM_NewsChannel_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get CM_AccessNewsChannel_UU */
  String getCM_AccessNewsChannel_UU();

  /** Set CM_AccessNewsChannel_UU */
  void setCM_AccessNewsChannel_UU(String CM_AccessNewsChannel_UU);

  /** Get Web Access Profile. Web Access Profile */
  int getCM_AccessProfile_ID();

  /** Set Web Access Profile. Web Access Profile */
  void setCM_AccessProfile_ID(int CM_AccessProfile_ID);

  I_CM_AccessProfile getCM_AccessProfile() throws RuntimeException;

  /** Get News Channel. News channel for rss feed */
  int getCM_NewsChannel_ID();

  /** Set News Channel. News channel for rss feed */
  void setCM_NewsChannel_ID(int CM_NewsChannel_ID);

  I_CM_NewsChannel getCM_NewsChannel() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
