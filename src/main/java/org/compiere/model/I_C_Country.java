package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Country
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Country {

    /**
     * TableName=C_Country
     */
    String Table_Name = "C_Country";

    /**
     * AD_Table_ID=170
     */
    int Table_ID = 170;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_Language
     */
    String COLUMNNAME_AD_Language = "AD_Language";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AllowCitiesOutOfList
     */
    String COLUMNNAME_AllowCitiesOutOfList = "AllowCitiesOutOfList";
    /**
     * Column name CaptureSequence
     */
    String COLUMNNAME_CaptureSequence = "CaptureSequence";
    /**
     * Column name C_Country_ID
     */
    String COLUMNNAME_C_Country_ID = "C_Country_ID";
    /**
     * Column name C_Country_UU
     */
    String COLUMNNAME_C_Country_UU = "C_Country_UU";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name CountryCode
     */
    String COLUMNNAME_CountryCode = "CountryCode";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DisplaySequence
     */
    String COLUMNNAME_DisplaySequence = "DisplaySequence";
    /**
     * Column name DisplaySequenceLocal
     */
    String COLUMNNAME_DisplaySequenceLocal = "DisplaySequenceLocal";
    /**
     * Column name ExpressionBankAccountNo
     */
    String COLUMNNAME_ExpressionBankAccountNo = "ExpressionBankAccountNo";
    /**
     * Column name ExpressionBankRoutingNo
     */
    String COLUMNNAME_ExpressionBankRoutingNo = "ExpressionBankRoutingNo";
    /**
     * Column name ExpressionPhone
     */
    String COLUMNNAME_ExpressionPhone = "ExpressionPhone";
    /**
     * Column name ExpressionPostal
     */
    String COLUMNNAME_ExpressionPostal = "ExpressionPostal";
    /**
     * Column name ExpressionPostal_Add
     */
    String COLUMNNAME_ExpressionPostal_Add = "ExpressionPostal_Add";
    /**
     * Column name HasPostal_Add
     */
    String COLUMNNAME_HasPostal_Add = "HasPostal_Add";
    /**
     * Column name HasRegion
     */
    String COLUMNNAME_HasRegion = "HasRegion";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsAddressLinesLocalReverse
     */
    String COLUMNNAME_IsAddressLinesLocalReverse = "IsAddressLinesLocalReverse";
    /**
     * Column name IsAddressLinesReverse
     */
    String COLUMNNAME_IsAddressLinesReverse = "IsAddressLinesReverse";
    /**
     * Column name IsPostcodeLookup
     */
    String COLUMNNAME_IsPostcodeLookup = "IsPostcodeLookup";
    /**
     * Column name LookupClassName
     */
    String COLUMNNAME_LookupClassName = "LookupClassName";
    /**
     * Column name LookupClientID
     */
    String COLUMNNAME_LookupClientID = "LookupClientID";
    /**
     * Column name LookupPassword
     */
    String COLUMNNAME_LookupPassword = "LookupPassword";
    /**
     * Column name LookupUrl
     */
    String COLUMNNAME_LookupUrl = "LookupUrl";
    /**
     * Column name MediaSize
     */
    String COLUMNNAME_MediaSize = "MediaSize";
    /**
     * Column name RegionName
     */
    String COLUMNNAME_RegionName = "RegionName";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Language. Language for this entity
     */
    String getADLanguage();

    /**
     * Set Language. Language for this entity
     */
    void setADLanguage(String AD_Language);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Allow Cities out of List. A flag to allow cities, currently not in the list, to be entered
     */
    boolean isAllowCitiesOutOfList();

    /**
     * Set Allow Cities out of List. A flag to allow cities, currently not in the list, to be entered
     */
    void setAllowCitiesOutOfList(boolean AllowCitiesOutOfList);

    /**
     * Get Capture Sequence
     */
    String getCaptureSequence();

    /**
     * Set Capture Sequence
     */
    void setCaptureSequence(String CaptureSequence);

    /**
     * Get Country. Country
     */
    int getC_Country_ID();

    /**
     * Set Country. Country
     */
    void setC_Country_ID(int C_Country_ID);

    /**
     * Get C_Country_UU
     */
    String getC_Country_UU();

    /**
     * Set C_Country_UU
     */
    void setC_Country_UU(String C_Country_UU);

    /**
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

    /**
     * Set Currency. The Currency for this record
     */
    void setC_Currency_ID(int C_Currency_ID);

    I_C_Currency getC_Currency() throws RuntimeException;

    /**
     * Get ISO Country Code. Upper-case two-letter alphanumeric ISO Country code according to ISO
     * 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html
     */
    String getCountryCode();

    /**
     * Set ISO Country Code. Upper-case two-letter alphanumeric ISO Country code according to ISO
     * 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html
     */
    void setCountryCode(String CountryCode);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Address Print Format. Format for printing this Address
     */
    String getDisplaySequence();

    /**
     * Set Address Print Format. Format for printing this Address
     */
    void setDisplaySequence(String DisplaySequence);

    /**
     * Get Local Address Format. Format for printing this Address locally
     */
    String getDisplaySequenceLocal();

    /**
     * Set Local Address Format. Format for printing this Address locally
     */
    void setDisplaySequenceLocal(String DisplaySequenceLocal);

    /**
     * Get Bank Account No Format. Format of the Bank Account
     */
    String getExpressionBankAccountNo();

    /**
     * Set Bank Account No Format. Format of the Bank Account
     */
    void setExpressionBankAccountNo(String ExpressionBankAccountNo);

    /**
     * Get Bank Routing No Format. Format of the Bank Routing Number
     */
    String getExpressionBankRoutingNo();

    /**
     * Set Bank Routing No Format. Format of the Bank Routing Number
     */
    void setExpressionBankRoutingNo(String ExpressionBankRoutingNo);

    /**
     * Get Phone Format. Format of the phone; Can contain fixed format elements, Variables:
     * "_lLoOaAcCa09"
     */
    String getExpressionPhone();

    /**
     * Set Phone Format. Format of the phone; Can contain fixed format elements, Variables:
     * "_lLoOaAcCa09"
     */
    void setExpressionPhone(String ExpressionPhone);

    /**
     * Get Postal Code Format. Format of the postal code; Can contain fixed format elements,
     * Variables: "_lLoOaAcCa09"
     */
    String getExpressionPostal();

    /**
     * Set Postal Code Format. Format of the postal code; Can contain fixed format elements,
     * Variables: "_lLoOaAcCa09"
     */
    void setExpressionPostal(String ExpressionPostal);

    /**
     * Get Additional Postal Format. Format of the value; Can contain fixed format elements,
     * Variables: "_lLoOaAcCa09"
     */
    String getExpressionPostal_Add();

    /**
     * Set Additional Postal Format. Format of the value; Can contain fixed format elements,
     * Variables: "_lLoOaAcCa09"
     */
    void setExpressionPostal_Add(String ExpressionPostal_Add);

    /**
     * Get Additional Postal code. Has Additional Postal Code
     */
    boolean isHasPostal_Add();

    /**
     * Set Additional Postal code. Has Additional Postal Code
     */
    void setHasPostal_Add(boolean HasPostal_Add);

    /**
     * Get Country has Region. Country contains Regions
     */
    boolean isHasRegion();

    /**
     * Set Country has Region. Country contains Regions
     */
    void setHasRegion(boolean HasRegion);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Reverse Local Address Lines. Print Local Address in reverse Order
     */
    void setIsAddressLinesLocalReverse(boolean IsAddressLinesLocalReverse);

    /**
     * Get Reverse Local Address Lines. Print Local Address in reverse Order
     */
    boolean isAddressLinesLocalReverse();

    /**
     * Set Reverse Address Lines. Print Address in reverse Order
     */
    void setIsAddressLinesReverse(boolean IsAddressLinesReverse);

    /**
     * Get Reverse Address Lines. Print Address in reverse Order
     */
    boolean isAddressLinesReverse();

    /**
     * Set Use Postcode Lookup. Does this country have a post code web service
     */
    void setIsPostcodeLookup(boolean IsPostcodeLookup);

    /**
     * Get Use Postcode Lookup. Does this country have a post code web service
     */
    boolean isPostcodeLookup();

    /**
     * Get Lookup ClassName. The class name of the postcode lookup plugin
     */
    String getLookupClassName();

    /**
     * Set Lookup ClassName. The class name of the postcode lookup plugin
     */
    void setLookupClassName(String LookupClassName);

    /**
     * Get Lookup Client ID. The ClientID or Login submitted to the Lookup URL
     */
    String getLookupClientID();

    /**
     * Set Lookup Client ID. The ClientID or Login submitted to the Lookup URL
     */
    void setLookupClientID(String LookupClientID);

    /**
     * Get Lookup Password. The password submitted to the Lookup URL
     */
    String getLookupPassword();

    /**
     * Set Lookup Password. The password submitted to the Lookup URL
     */
    void setLookupPassword(String LookupPassword);

    /**
     * Get Lookup URL. The URL of the web service that the plugin connects to in order to retrieve
     * postcode data
     */
    String getLookupUrl();

    /**
     * Set Lookup URL. The URL of the web service that the plugin connects to in order to retrieve
     * postcode data
     */
    void setLookupUrl(String LookupUrl);

    /**
     * Get Media Size. Java Media Size
     */
    String getMediaSize();

    /**
     * Set Media Size. Java Media Size
     */
    void setMediaSize(String MediaSize);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Region. Name of the Region
     */
    String getRegionName();

    /**
     * Set Region. Name of the Region
     */
    void setRegionName(String RegionName);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
