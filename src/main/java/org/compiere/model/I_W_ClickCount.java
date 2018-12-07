package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for W_ClickCount
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_W_ClickCount {

    /**
     * TableName=W_ClickCount
     */
    String Table_Name = "W_ClickCount";

    /**
     * AD_Table_ID=553
     */
    int Table_ID = 553;

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
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name Counter
     */
    String COLUMNNAME_Counter = "Counter";
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
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name TargetURL
     */
    String COLUMNNAME_TargetURL = "TargetURL";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name W_ClickCount_ID
     */
    String COLUMNNAME_W_ClickCount_ID = "W_ClickCount_ID";
    /**
     * Column name W_ClickCount_UU
     */
    String COLUMNNAME_W_ClickCount_UU = "W_ClickCount_UU";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setC_BPartner_ID(int C_BPartner_ID);

    I_C_BPartner getC_BPartner() throws RuntimeException;

    /**
     * Get Counter. Count Value
     */
    int getCounter();

    /**
     * Set Counter. Count Value
     */
    void setCounter(int Counter);

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
     * Get Target URL. URL for the Target
     */
    String getTargetURL();

    /**
     * Set Target URL. URL for the Target
     */
    void setTargetURL(String TargetURL);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Click Count. Web Click Management
     */
    int getW_ClickCount_ID();

    /**
     * Set Click Count. Web Click Management
     */
    void setW_ClickCount_ID(int W_ClickCount_ID);

    /**
     * Get W_ClickCount_UU
     */
    String getW_ClickCount_UU();

    /**
     * Set W_ClickCount_UU
     */
    void setW_ClickCount_UU(String W_ClickCount_UU);
}
