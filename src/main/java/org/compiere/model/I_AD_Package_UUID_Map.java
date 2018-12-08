package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Package_UUID_Map
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Package_UUID_Map {

  /** TableName=AD_Package_UUID_Map */
  String Table_Name = "AD_Package_UUID_Map";

  /** AD_Table_ID=200105 */
  int Table_ID = 200105;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Package_UUID_Map_ID */
  String COLUMNNAME_AD_Package_UUID_Map_ID = "AD_Package_UUID_Map_ID";
  /** Column name AD_Package_UUID_Map_UU */
  String COLUMNNAME_AD_Package_UUID_Map_UU = "AD_Package_UUID_Map_UU";
  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Source_UUID */
  String COLUMNNAME_Source_UUID = "Source_UUID";
  /** Column name Target_UUID */
  String COLUMNNAME_Target_UUID = "Target_UUID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get UUID Mapping. UUID Mapping between client */
  int getAD_Package_UUID_Map_ID();

  /** Set UUID Mapping. UUID Mapping between client */
  void setAD_Package_UUID_Map_ID(int AD_Package_UUID_Map_ID);

  /** Get AD_Package_UUID_Map_UU */
  String getAD_Package_UUID_Map_UU();

  /** Set AD_Package_UUID_Map_UU */
  void setAD_Package_UUID_Map_UU(String AD_Package_UUID_Map_UU);

  /** Get Table. Database Table information */
  int getAD_Table_ID();

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  I_AD_Table getAD_Table() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Source UUID. UUID from the source client */
  String getSource_UUID();

  /** Set Source UUID. UUID from the source client */
  void setSource_UUID(String Source_UUID);

  /** Get Target UUID. New UUID created by the pack in client */
  String getTarget_UUID();

  /** Set Target UUID. New UUID created by the pack in client */
  void setTarget_UUID(String Target_UUID);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
