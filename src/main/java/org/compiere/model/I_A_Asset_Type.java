package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Asset_Type
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Type {

  /** TableName=A_Asset_Type */
  String Table_Name = "A_Asset_Type";

  /** AD_Table_ID=53276 */
  int Table_ID = 53276;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name A_Asset_Type_ID */
  String COLUMNNAME_A_Asset_Type_ID = "A_Asset_Type_ID";
  /** Column name A_Asset_Type_UU */
  String COLUMNNAME_A_Asset_Type_UU = "A_Asset_Type_UU";
    /** Column name Description */
  String COLUMNNAME_Description = "Description";
    /** Column name IsDepreciable */
  String COLUMNNAME_IsDepreciable = "IsDepreciable";
  /** Column name IsInPosession */
  String COLUMNNAME_IsInPosession = "IsInPosession";
  /** Column name IsOwned */
  String COLUMNNAME_IsOwned = "IsOwned";

    /** Get Is Depreciable. This asset CAN be depreciated */
  String getIsDepreciable();

    /** Get In Possession. The asset is in the possession of the organization */
  String getIsInPosession();

    /** Get Owned. The asset is owned by the organization */
  String getIsOwned();

    /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

}
