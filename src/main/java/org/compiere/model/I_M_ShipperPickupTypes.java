package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ShipperPickupTypes
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ShipperPickupTypes {

  /** TableName=M_ShipperPickupTypes */
  String Table_Name = "M_ShipperPickupTypes";

  /** AD_Table_ID=200042 */
  int Table_ID = 200042;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

    /** Column name IsDefault */
  String COLUMNNAME_IsDefault = "IsDefault";
  /** Column name M_Shipper_ID */
  String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
  /** Column name M_ShipperPickupTypesCfg_ID */
  String COLUMNNAME_M_ShipperPickupTypesCfg_ID = "M_ShipperPickupTypesCfg_ID";
  /** Column name M_ShipperPickupTypes_ID */
  String COLUMNNAME_M_ShipperPickupTypes_ID = "M_ShipperPickupTypes_ID";
  /** Column name M_ShipperPickupTypes_UU */
  String COLUMNNAME_M_ShipperPickupTypes_UU = "M_ShipperPickupTypes_UU";

    /** Get Shipper. Method or manner of product delivery */
  int getM_Shipper_ID();

    /** Get Shipper Pickup Types Configuration */
  int getM_ShipperPickupTypesCfg_ID();

    I_M_ShipperPickupTypesCfg getM_ShipperPickupTypesCfg() throws RuntimeException;

}
