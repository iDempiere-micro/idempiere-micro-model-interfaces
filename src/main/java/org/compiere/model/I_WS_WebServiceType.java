package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for WS_WebServiceType
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_WS_WebServiceType {

    /**
     * TableName=WS_WebServiceType
     */
    String Table_Name = "WS_WebServiceType";

    /**
     * AD_Table_ID=53164
     */
    int Table_ID = 53164;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
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
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";
    /**
     * Column name WS_WebService_ID
     */
    String COLUMNNAME_WS_WebService_ID = "WS_WebService_ID";
    /**
     * Column name WS_WebServiceMethod_ID
     */
    String COLUMNNAME_WS_WebServiceMethod_ID = "WS_WebServiceMethod_ID";
    /**
     * Column name WS_WebServiceType_ID
     */
    String COLUMNNAME_WS_WebServiceType_ID = "WS_WebServiceType_ID";
    /**
     * Column name WS_WebServiceType_UU
     */
    String COLUMNNAME_WS_WebServiceType_UU = "WS_WebServiceType_UU";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    /**
     * Set Table. Database Table information
     */
    void setAD_Table_ID(int AD_Table_ID);

    I_AD_Table getAD_Table() throws RuntimeException;

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
     * Get Comment/Help. Comment or Hint
     */
    String getHelp();

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);

    /**
     * Get Web Service
     */
    int getWS_WebService_ID();

    /**
     * Set Web Service
     */
    void setWS_WebService_ID(int WS_WebService_ID);

    I_WS_WebService getWS_WebService() throws RuntimeException;

    /**
     * Get Web Service Method
     */
    int getWS_WebServiceMethod_ID();

    /**
     * Set Web Service Method
     */
    void setWS_WebServiceMethod_ID(int WS_WebServiceMethod_ID);

    I_WS_WebServiceMethod getWS_WebServiceMethod() throws RuntimeException;

    /**
     * Get Web Service Type
     */
    int getWS_WebServiceType_ID();

    /**
     * Set Web Service Type
     */
    void setWS_WebServiceType_ID(int WS_WebServiceType_ID);

    /**
     * Get WS_WebServiceType_UU
     */
    String getWS_WebServiceType_UU();

    /**
     * Set WS_WebServiceType_UU
     */
    void setWS_WebServiceType_UU(String WS_WebServiceType_UU);
}
