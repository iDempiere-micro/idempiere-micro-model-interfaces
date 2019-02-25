package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_Shipper
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Shipper {

    /**
     * TableName=M_Shipper
     */
    String Table_Name = "M_Shipper";

    /**
     * AD_Table_ID=253
     */
    int Table_ID = 253;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);



    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name M_ShipperCfg_ID
     */
    String COLUMNNAME_M_ShipperCfg_ID = "M_ShipperCfg_ID";
    /**
     * Column name M_Shipper_ID
     */
    String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
    /**
     * Column name M_ShippingProcessor_ID
     */
    String COLUMNNAME_M_ShippingProcessor_ID = "M_ShippingProcessor_ID";

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Get Shipper Configuration
     */
    int getM_ShipperCfg_ID();

    I_M_ShipperCfg getM_ShipperCfg() throws RuntimeException;

    /**
     * Get Shipper. Method or manner of product delivery
     */
    int getM_Shipper_ID();

    /**
     * Get Shipping Processor
     */
    int getM_ShippingProcessor_ID();

}
