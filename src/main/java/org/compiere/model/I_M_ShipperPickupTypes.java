package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_ShipperPickupTypes
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ShipperPickupTypes {

    /**
     * TableName=M_ShipperPickupTypes
     */
    String Table_Name = "M_ShipperPickupTypes";

    /**
     * AD_Table_ID=200042
     */
    int Table_ID = 200042;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name M_Shipper_ID
     */
    String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
    /**
     * Column name M_ShipperPickupTypesCfg_ID
     */
    String COLUMNNAME_M_ShipperPickupTypesCfg_ID = "M_ShipperPickupTypesCfg_ID";

    /**
     * Get Shipper Pickup Types Configuration
     */
    int getShipperPickupTypesCfgId();

}
