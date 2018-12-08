package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for K_Source
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_K_Source {

  /** TableName=K_Source */
  String Table_Name = "K_Source";

  /** AD_Table_ID=609 */
  int Table_ID = 609;

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
  /** Column name DescriptionURL */
  String COLUMNNAME_DescriptionURL = "DescriptionURL";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name K_Source_ID */
  String COLUMNNAME_K_Source_ID = "K_Source_ID";
  /** Column name K_Source_UU */
  String COLUMNNAME_K_Source_UU = "K_Source_UU";
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

  /** Get Description URL. URL for the description */
  String getDescriptionURL();

  /** Set Description URL. URL for the description */
  void setDescriptionURL(String DescriptionURL);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Knowledge Source. Source of a Knowledge Entry */
  int getK_Source_ID();

  /** Set Knowledge Source. Source of a Knowledge Entry */
  void setK_Source_ID(int K_Source_ID);

  /** Get K_Source_UU */
  String getK_Source_UU();

  /** Set K_Source_UU */
  void setK_Source_UU(String K_Source_UU);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
