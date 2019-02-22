package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_ShipperLabelsCfg
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ShipperLabelsCfg {

    /**
     * TableName=M_ShipperLabelsCfg
     */
    String Table_Name = "M_ShipperLabelsCfg";

    /**
     * AD_Table_ID=200048
     */
    int Table_ID = 200048;

    /** Load Meta Data */

    /**
     * Get Height
     */
    BigDecimal getHeight();

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Get Width
     */
    BigDecimal getWidth();

}
