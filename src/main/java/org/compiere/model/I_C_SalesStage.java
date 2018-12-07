package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_SalesStage
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_SalesStage {

    /**
     * TableName=C_SalesStage
     */
    String Table_Name = "C_SalesStage";

    /**
     * AD_Table_ID=53338
     */
    int Table_ID = 53338;

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
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_SalesStage_ID
     */
    String COLUMNNAME_C_SalesStage_ID = "C_SalesStage_ID";
    /**
     * Column name C_SalesStage_UU
     */
    String COLUMNNAME_C_SalesStage_UU = "C_SalesStage_UU";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsClosed
     */
    String COLUMNNAME_IsClosed = "IsClosed";
    /**
     * Column name IsWon
     */
    String COLUMNNAME_IsWon = "IsWon";
    /**
     * Column name Probability
     */
    String COLUMNNAME_Probability = "Probability";
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
     * Get Sales Stage. Stages of the sales process
     */
    int getC_SalesStage_ID();

    /**
     * Set Sales Stage. Stages of the sales process
     */
    void setC_SalesStage_ID(int C_SalesStage_ID);

    /**
     * Get C_SalesStage_UU
     */
    String getC_SalesStage_UU();

    /**
     * Set C_SalesStage_UU
     */
    void setC_SalesStage_UU(String C_SalesStage_UU);

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
     * Set Closed Status. The status is closed
     */
    void setIsClosed(boolean IsClosed);

    /**
     * Get Closed Status. The status is closed
     */
    boolean isClosed();

    /**
     * Set Won. The opportunity was won
     */
    void setIsWon(boolean IsWon);

    /**
     * Get Won. The opportunity was won
     */
    boolean isWon();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Probability
     */
    BigDecimal getProbability();

    /**
     * Set Probability
     */
    void setProbability(BigDecimal Probability);

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
}
