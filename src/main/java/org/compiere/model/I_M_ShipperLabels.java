package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_ShipperLabels
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ShipperLabels {

    /**
     * TableName=M_ShipperLabels
     */
    String Table_Name = "M_ShipperLabels";

    /**
     * AD_Table_ID=200040
     */
    int Table_ID = 200040;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);



    /**
     * Column name LabelPrintMethod
     */
    String COLUMNNAME_LabelPrintMethod = "LabelPrintMethod";
    /**
     * Column name M_Shipper_ID
     */
    String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
    /**
     * Column name M_ShipperLabelsCfg_ID
     */
    String COLUMNNAME_M_ShipperLabelsCfg_ID = "M_ShipperLabelsCfg_ID";

    /**
     * Get Shipper Labels Configuration
     */
    int getM_ShipperLabelsCfg_ID();

}
