package org.compiere.model;

import org.idempiere.icommon.model.INamedPO;

import java.math.BigDecimal;

/**
 * Generated Interface for C_BPartner_Location
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BPartner_Location extends INamedPO {

    /**
     * TableName=C_BPartner_Location
     */
    String Table_Name = "C_BPartner_Location";

    /**
     * AD_Table_ID=293
     */
    int Table_ID = 293;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);



    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_BPartner_Location_ID
     */
    String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
    /**
     * Column name C_Location_ID
     */
    String COLUMNNAME_C_Location_ID = "C_Location_ID";
    /**
     * Column name C_SalesRegion_ID
     */
    String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
    /**
     * Column name IsBillTo
     */
    String COLUMNNAME_IsBillTo = "IsBillTo";
    /**
     * Column name IsPayFrom
     */
    String COLUMNNAME_IsPayFrom = "IsPayFrom";
    /**
     * Column name IsPreserveCustomName
     */
    String COLUMNNAME_IsPreserveCustomName = "IsPreserveCustomName";
    /**
     * Column name IsRemitTo
     */
    String COLUMNNAME_IsRemitTo = "IsRemitTo";
    /**
     * Column name IsShipTo
     */
    String COLUMNNAME_IsShipTo = "IsShipTo";

    /** Column name Phone */
    String COLUMNNAME_Phone = "Phone";

    /**
     * Get Partner Location. Identifies the (ship to) address for this Business Partner
     */
    int getBusinessPartnerLocationId();

    /**
     * Get Address. Location or Address
     */
    int getLocationId();

    /**
     * Set Address. Location or Address
     */
    void setLocationId(int C_Location_ID);

    /**
     * Get Pay-From Address. Business Partner pays from that address and we'll send dunning letters
     * there
     */
    boolean isPayFrom();

    /** Set Ship Address.
     * Business Partner Shipment Address
     */
    void setIsShipTo (boolean IsShipTo);

    /**
     * Get Ship Address. Business Partner Shipment Address
     */
    boolean getIsShipTo();

    I_C_Location getLocation();

    boolean save();

    /** Set Invoice Address.
     * Business Partner Invoice/Bill Address
     */
    void setIsBillTo (boolean IsBillTo);

    /** Get Invoice Address.
     * Business Partner Invoice/Bill Address
     */
    boolean getIsBillTo();

    /** Set Phone.
     * Identifies a telephone number
     */
    void setPhone (String Phone);

    /** Get Phone.
     * Identifies a telephone number
     */
    String getPhone();
}
