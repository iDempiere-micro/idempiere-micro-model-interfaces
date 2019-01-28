package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Asset_Group
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Group {

  /** TableName=A_Asset_Group */
  String Table_Name = "A_Asset_Group";

  /** AD_Table_ID=542 */
  int Table_ID = 542;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name A_Asset_Class_ID */
  String COLUMNNAME_A_Asset_Class_ID = "A_Asset_Class_ID";
  /** Column name A_Asset_Group_ID */
  String COLUMNNAME_A_Asset_Group_ID = "A_Asset_Group_ID";
  /** Column name A_Asset_Group_UU */
  String COLUMNNAME_A_Asset_Group_UU = "A_Asset_Group_UU";
  /** Column name A_Asset_Type_ID */
  String COLUMNNAME_A_Asset_Type_ID = "A_Asset_Type_ID";
    /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
    /** Column name IsCreateAsActive */
  String COLUMNNAME_IsCreateAsActive = "IsCreateAsActive";
  /** Column name IsDefault */
  String COLUMNNAME_IsDefault = "IsDefault";
  /** Column name IsDepreciated */
  String COLUMNNAME_IsDepreciated = "IsDepreciated";
  /** Column name IsFixedAsset */
  String COLUMNNAME_IsFixedAsset = "IsFixedAsset";
  /** Column name IsOneAssetPerUOM */
  String COLUMNNAME_IsOneAssetPerUOM = "IsOneAssetPerUOM";
  /** Column name IsOwned */
  String COLUMNNAME_IsOwned = "IsOwned";
  /** Column name IsTrackIssues */
  String COLUMNNAME_IsTrackIssues = "IsTrackIssues";

    /** Get Asset class */
  int getA_Asset_Class_ID();

    /** Get Asset Group. Group of Assets */
  int getA_Asset_Group_ID();

    /** Get Asset Type */
  int getA_Asset_Type_ID();

    /** Get Depreciate. The asset will be depreciated */
  boolean isDepreciated();

    /** Get IsFixedAsset */
  boolean isFixedAsset();

    /** Get One Asset Per UOM. Create one asset per UOM */
  boolean isOneAssetPerUOM();

    /** Get Owned. The asset is owned by the organization */
  boolean isOwned();

}
