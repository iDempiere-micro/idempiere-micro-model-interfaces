package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for K_Synonym
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_K_Synonym {

    /**
     * TableName=K_Synonym
     */
    String Table_Name = "K_Synonym";

    /**
     * AD_Table_ID=608
     */
    int Table_ID = 608;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

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
     * Column name K_Synonym_ID
     */
    String COLUMNNAME_K_Synonym_ID = "K_Synonym_ID";
    /**
     * Column name K_Synonym_UU
     */
    String COLUMNNAME_K_Synonym_UU = "K_Synonym_UU";
    /**
     * Column name SynonymName
     */
    String COLUMNNAME_SynonymName = "SynonymName";
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
     * Get Knowledge Synonym. Knowledge Keyword Synonym
     */
    int getK_Synonym_ID();

    /**
     * Set Knowledge Synonym. Knowledge Keyword Synonym
     */
    void setK_Synonym_ID(int K_Synonym_ID);

    /**
     * Get K_Synonym_UU
     */
    String getK_Synonym_UU();

    /**
     * Set K_Synonym_UU
     */
    void setK_Synonym_UU(String K_Synonym_UU);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Synonym Name. The synonym for the name
     */
    String getSynonymName();

    /**
     * Set Synonym Name. The synonym for the name
     */
    void setSynonymName(String SynonymName);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
