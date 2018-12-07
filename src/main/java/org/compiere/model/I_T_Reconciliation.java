package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for T_Reconciliation
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_T_Reconciliation {

    /**
     * TableName=T_Reconciliation
     */
    String Table_Name = "T_Reconciliation";

    /**
     * AD_Table_ID=53287
     */
    int Table_ID = 53287;

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
     * Column name AD_PInstance_ID
     */
    String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Fact_Acct_ID
     */
    String COLUMNNAME_Fact_Acct_ID = "Fact_Acct_ID";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name MatchCode
     */
    String COLUMNNAME_MatchCode = "MatchCode";
    /**
     * Column name T_Reconciliation_UU
     */
    String COLUMNNAME_T_Reconciliation_UU = "T_Reconciliation_UU";
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
     * Get Process Instance. Instance of the process
     */
    int getAD_PInstance_ID();

    /**
     * Set Process Instance. Instance of the process
     */
    void setAD_PInstance_ID(int AD_PInstance_ID);

    I_AD_PInstance getAD_PInstance() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Accounting Fact
     */
    int getFact_Acct_ID();

    /**
     * Set Accounting Fact
     */
    void setFact_Acct_ID(int Fact_Acct_ID);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Match Code. String identifying related accounting facts
     */
    String getMatchCode();

    /**
     * Set Match Code. String identifying related accounting facts
     */
    void setMatchCode(String MatchCode);

    /**
     * Get T_Reconciliation_UU
     */
    String getT_Reconciliation_UU();

    /**
     * Set T_Reconciliation_UU
     */
    void setT_Reconciliation_UU(String T_Reconciliation_UU);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
