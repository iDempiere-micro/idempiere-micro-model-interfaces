package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_ShippingProcessor
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ShippingProcessor {

    /**
     * AD_Table_ID=200039
     */
    int Table_ID = 200039;

    /**
     * TableName=M_ShippingProcessor
     */
    String Table_Name = "M_ShippingProcessor";

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name ConnectionKey
     */
    String COLUMNNAME_ConnectionKey = "ConnectionKey";
    /**
     * Column name ConnectionPassword
     */
    String COLUMNNAME_ConnectionPassword = "ConnectionPassword";
    /**
     * Column name M_ShippingProcessorCfg_ID
     */
    String COLUMNNAME_M_ShippingProcessorCfg_ID = "M_ShippingProcessorCfg_ID";
    /**
     * Column name UserID
     */
    String COLUMNNAME_UserID = "UserID";

    /**
     * Get Shipping Processor Configuration
     */
    int getShippingProcessorCfgId();

    I_M_ShippingProcessorCfg getShippingProcessorCfg() throws RuntimeException;

}
