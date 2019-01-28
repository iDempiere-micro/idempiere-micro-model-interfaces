package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ShipperCfg
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ShipperCfg {

  /** TableName=M_ShipperCfg */
  String Table_Name = "M_ShipperCfg";

  /** AD_Table_ID=200047 */
  int Table_ID = 200047;

    /** Load Meta Data */

    /** Get International */
  boolean isInternational();

    /** Get Residential */
  boolean isResidential();

    /** Get Saturday Delivery */
  boolean isSaturdayDelivery();

    /** Get Service Code */
  String getShippingServiceCode();

    /** Get Tracking URL. URL of the shipper to track shipments */
  String getTrackingURL();

}
