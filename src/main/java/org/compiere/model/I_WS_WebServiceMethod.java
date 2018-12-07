package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for WS_WebServiceMethod
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_WS_WebServiceMethod {

    /**
     * TableName=WS_WebServiceMethod
     */
    String Table_Name = "WS_WebServiceMethod";

    /**
     * AD_Table_ID=53163
     */
    int Table_ID = 53163;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
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
     * Column name WS_WebServiceMethod_UU
     */
    String COLUMNNAME_WS_WebServiceMethod_UU = "WS_WebServiceMethod_UU";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

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

    /**
     * Get WS_WebServiceMethod_UU
     */
    String getWS_WebServiceMethod_UU();

    /**
     * Set WS_WebServiceMethod_UU
     */
    void setWS_WebServiceMethod_UU(String WS_WebServiceMethod_UU);
}
