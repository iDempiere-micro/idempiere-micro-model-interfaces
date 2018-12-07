package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Replication_Run
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Replication_Run {

    /**
     * TableName=AD_Replication_Run
     */
    String Table_Name = "AD_Replication_Run";

    /**
     * AD_Table_ID=603
     */
    int Table_ID = 603;

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
     * Column name AD_Replication_ID
     */
    String COLUMNNAME_AD_Replication_ID = "AD_Replication_ID";
    /**
     * Column name AD_Replication_Run_ID
     */
    String COLUMNNAME_AD_Replication_Run_ID = "AD_Replication_Run_ID";
    /**
     * Column name AD_Replication_Run_UU
     */
    String COLUMNNAME_AD_Replication_Run_UU = "AD_Replication_Run_UU";
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
     * Column name IsReplicated
     */
    String COLUMNNAME_IsReplicated = "IsReplicated";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Replication. Data Replication Target
     */
    int getAD_Replication_ID();

    /**
     * Set Replication. Data Replication Target
     */
    void setAD_Replication_ID(int AD_Replication_ID);

    I_AD_Replication getAD_Replication() throws RuntimeException;

    /**
     * Get Replication Run. Data Replication Run
     */
    int getAD_Replication_Run_ID();

    /**
     * Set Replication Run. Data Replication Run
     */
    void setAD_Replication_Run_ID(int AD_Replication_Run_ID);

    /**
     * Get AD_Replication_Run_UU
     */
    String getAD_Replication_Run_UU();

    /**
     * Set AD_Replication_Run_UU
     */
    void setAD_Replication_Run_UU(String AD_Replication_Run_UU);

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
     * Set Replicated. The data is successfully replicated
     */
    void setIsReplicated(boolean IsReplicated);

    /**
     * Get Replicated. The data is successfully replicated
     */
    boolean isReplicated();

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
}
