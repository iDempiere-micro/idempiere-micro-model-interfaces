package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_BPartner_Location
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BPartner_Location {

  /** TableName=C_BPartner_Location */
  String Table_Name = "C_BPartner_Location";

  /** AD_Table_ID=293 */
  int Table_ID = 293;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

    /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BPartner_Location_ID */
  String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
  /** Column name C_BPartner_Location_UU */
  String COLUMNNAME_C_BPartner_Location_UU = "C_BPartner_Location_UU";
  /** Column name C_Location_ID */
  String COLUMNNAME_C_Location_ID = "C_Location_ID";
    /** Column name C_SalesRegion_ID */
  String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
  /** Column name CustomerAddressID */
  String COLUMNNAME_CustomerAddressID = "CustomerAddressID";
  /** Column name Fax */
  String COLUMNNAME_Fax = "Fax";
    /** Column name IsBillTo */
  String COLUMNNAME_IsBillTo = "IsBillTo";
  /** Column name ISDN */
  String COLUMNNAME_ISDN = "ISDN";
  /** Column name IsPayFrom */
  String COLUMNNAME_IsPayFrom = "IsPayFrom";
  /** Column name IsPreserveCustomName */
  String COLUMNNAME_IsPreserveCustomName = "IsPreserveCustomName";
  /** Column name IsRemitTo */
  String COLUMNNAME_IsRemitTo = "IsRemitTo";
  /** Column name IsShipTo */
  String COLUMNNAME_IsShipTo = "IsShipTo";
  /** Column name Phone */
  String COLUMNNAME_Phone = "Phone";
  /** Column name Phone2 */
  String COLUMNNAME_Phone2 = "Phone2";

    /** Get Partner Location. Identifies the (ship to) address for this Business Partner */
  int getC_BPartner_Location_ID();

    /** Get Address. Location or Address */
  int getC_Location_ID();

  /** Set Address. Location or Address */
  void setC_Location_ID(int C_Location_ID);

    /** Get Invoice Address. Business Partner Invoice/Bill Address */
  boolean isBillTo();

    /**
   * Get Pay-From Address. Business Partner pays from that address and we'll send dunning letters
   * there
   */
  boolean isPayFrom();

    /** Get Ship Address. Business Partner Shipment Address */
  boolean isShipTo();

    I_C_Location getLocation();

  boolean save();
}
