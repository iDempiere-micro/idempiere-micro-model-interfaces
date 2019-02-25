package org.compiere.model;

/**
 * Generated Interface for M_ShipperCfg
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ShipperCfg {

    /**
     * TableName=M_ShipperCfg
     */
    String Table_Name = "M_ShipperCfg";



    /**
     * Get International
     */
    boolean isInternational();

    /**
     * Get Residential
     */
    boolean isResidential();

    /**
     * Get Saturday Delivery
     */
    boolean isSaturdayDelivery();

    /**
     * Get Service Code
     */
    String getShippingServiceCode();

    /**
     * Get Tracking URL. URL of the shipper to track shipments
     */
    String getTrackingURL();

}
