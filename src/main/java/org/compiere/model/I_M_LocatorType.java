package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_LocatorType
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_LocatorType {

    /**
     * TableName=M_LocatorType
     */
    String Table_Name = "M_LocatorType";

    /**
     * AD_Table_ID=200175
     */
    int Table_ID = 200175;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsAvailableForReplenishment
     */
    String COLUMNNAME_IsAvailableForReplenishment = "IsAvailableForReplenishment";
    /**
     * Column name IsAvailableForReservation
     */
    String COLUMNNAME_IsAvailableForReservation = "IsAvailableForReservation";
    /**
     * Column name IsAvailableForShipping
     */
    String COLUMNNAME_IsAvailableForShipping = "IsAvailableForShipping";
    /**
     * Column name M_LocatorType_ID
     */
    String COLUMNNAME_M_LocatorType_ID = "M_LocatorType_ID";
    /**
     * Column name M_LocatorType_UU
     */
    String COLUMNNAME_M_LocatorType_UU = "M_LocatorType_UU";

    /**
     * Set Available for Replenishment
     */
    void setIsAvailableForReplenishment(boolean IsAvailableForReplenishment);

    /**
     * Get Available for Replenishment
     */
    boolean isAvailableForReplenishment();

    /**
     * Set Available for Reservation
     */
    void setIsAvailableForReservation(boolean IsAvailableForReservation);

    /**
     * Set Available for Shipping
     */
    void setIsAvailableForShipping(boolean IsAvailableForShipping);

    /**
     * Get Available for Shipping
     */
    boolean isAvailableForShipping();

}
