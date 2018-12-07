package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_AddressValidation
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_AddressValidation {

    /**
     * TableName=C_AddressValidation
     */
    String Table_Name = "C_AddressValidation";

    /**
     * AD_Table_ID=200101
     */
    int Table_ID = 200101;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_AddressValidationCfg_ID
     */
    String COLUMNNAME_C_AddressValidationCfg_ID = "C_AddressValidationCfg_ID";
    /**
     * Column name C_AddressValidation_ID
     */
    String COLUMNNAME_C_AddressValidation_ID = "C_AddressValidation_ID";
    /**
     * Column name C_AddressValidation_UU
     */
    String COLUMNNAME_C_AddressValidation_UU = "C_AddressValidation_UU";
    /**
     * Column name ConnectionKey
     */
    String COLUMNNAME_ConnectionKey = "ConnectionKey";
    /**
     * Column name ConnectionPassword
     */
    String COLUMNNAME_ConnectionPassword = "ConnectionPassword";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name ShipperAccount
     */
    String COLUMNNAME_ShipperAccount = "ShipperAccount";
    /**
     * Column name ShipperMeter
     */
    String COLUMNNAME_ShipperMeter = "ShipperMeter";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name UserID
     */
    String COLUMNNAME_UserID = "UserID";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Address Validation Configuration
     */
    int getC_AddressValidationCfg_ID();

    /**
     * Set Address Validation Configuration
     */
    void setC_AddressValidationCfg_ID(int C_AddressValidationCfg_ID);

    I_C_AddressValidationCfg getC_AddressValidationCfg() throws RuntimeException;

    /**
     * Get Address Validation
     */
    int getC_AddressValidation_ID();

    /**
     * Set Address Validation
     */
    void setC_AddressValidation_ID(int C_AddressValidation_ID);

    /**
     * Get C_AddressValidation_UU
     */
    String getC_AddressValidation_UU();

    /**
     * Set C_AddressValidation_UU
     */
    void setC_AddressValidation_UU(String C_AddressValidation_UU);

    /**
     * Get Connection Key
     */
    String getConnectionKey();

    /**
     * Set Connection Key
     */
    void setConnectionKey(String ConnectionKey);

    /**
     * Get Connection Password
     */
    String getConnectionPassword();

    /**
     * Set Connection Password
     */
    void setConnectionPassword(String ConnectionPassword);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

    /**
     * Get Shipper Account Number
     */
    String getShipperAccount();

    /**
     * Set Shipper Account Number
     */
    void setShipperAccount(String ShipperAccount);

    /**
     * Get Shipper Meter
     */
    String getShipperMeter();

    /**
     * Set Shipper Meter
     */
    void setShipperMeter(String ShipperMeter);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get User ID. User ID or account number
     */
    String getUserID();

    /**
     * Set User ID. User ID or account number
     */
    void setUserID(String UserID);
}
