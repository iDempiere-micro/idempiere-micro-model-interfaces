package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_ShipperPackaging
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ShipperPackaging {

    /**
     * TableName=M_ShipperPackaging
     */
    String Table_Name = "M_ShipperPackaging";

    /**
     * AD_Table_ID=200041
     */
    int Table_ID = 200041;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name M_Shipper_ID
     */
    String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
    /**
     * Column name M_ShipperPackagingCfg_ID
     */
    String COLUMNNAME_M_ShipperPackagingCfg_ID = "M_ShipperPackagingCfg_ID";
    /**
     * Column name Weight
     */
    String COLUMNNAME_Weight = "Weight";

    /**
     * Get Shipper Packaging Configuration
     */
    int getShipperPackagingCfgId();

    /**
     * Get Weight. Weight of a product
     */
    BigDecimal getWeight();

}
