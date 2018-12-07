package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for GL_JournalGeneratorSource
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_GL_JournalGeneratorSource {

    /**
     * TableName=GL_JournalGeneratorSource
     */
    String Table_Name = "GL_JournalGeneratorSource";

    /**
     * AD_Table_ID=200023
     */
    int Table_ID = 200023;

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
     * Column name AmtMultiplier
     */
    String COLUMNNAME_AmtMultiplier = "AmtMultiplier";
    /**
     * Column name C_ElementValue_ID
     */
    String COLUMNNAME_C_ElementValue_ID = "C_ElementValue_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name GL_Category_ID
     */
    String COLUMNNAME_GL_Category_ID = "GL_Category_ID";
    /**
     * Column name GL_JournalGeneratorLine_ID
     */
    String COLUMNNAME_GL_JournalGeneratorLine_ID = "GL_JournalGeneratorLine_ID";
    /**
     * Column name GL_JournalGeneratorSource_ID
     */
    String COLUMNNAME_GL_JournalGeneratorSource_ID =
            "GL_JournalGeneratorSource_ID";
    /**
     * Column name GL_JournalGeneratorSource_UU
     */
    String COLUMNNAME_GL_JournalGeneratorSource_UU =
            "GL_JournalGeneratorSource_UU";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name RoundFactor
     */
    String COLUMNNAME_RoundFactor = "RoundFactor";
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
     * Get Multiplier Amount. Multiplier Amount for generating commissions
     */
    BigDecimal getAmtMultiplier();

    /**
     * Set Multiplier Amount. Multiplier Amount for generating commissions
     */
    void setAmtMultiplier(BigDecimal AmtMultiplier);

    /**
     * Get Account Element. Account Element
     */
    int getC_ElementValue_ID();

    /**
     * Set Account Element. Account Element
     */
    void setC_ElementValue_ID(int C_ElementValue_ID);

    I_C_ElementValue getC_ElementValue() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get GL Category. General Ledger Category
     */
    int getGL_Category_ID();

    /**
     * Set GL Category. General Ledger Category
     */
    void setGL_Category_ID(int GL_Category_ID);

    I_GL_Category getGL_Category() throws RuntimeException;

    /**
     * Get Generator Line
     */
    int getGL_JournalGeneratorLine_ID();

    /**
     * Set Generator Line
     */
    void setGL_JournalGeneratorLine_ID(int GL_JournalGeneratorLine_ID);

    I_GL_JournalGeneratorLine getGL_JournalGeneratorLine() throws RuntimeException;

    /**
     * Get Generator Source
     */
    int getGL_JournalGeneratorSource_ID();

    /**
     * Set Generator Source
     */
    void setGL_JournalGeneratorSource_ID(int GL_JournalGeneratorSource_ID);

    /**
     * Get GL_JournalGeneratorSource_UU
     */
    String getGL_JournalGeneratorSource_UU();

    /**
     * Set GL_JournalGeneratorSource_UU
     */
    void setGL_JournalGeneratorSource_UU(String GL_JournalGeneratorSource_UU);

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
     * Get Round Factor
     */
    int getRoundFactor();

    /**
     * Set Round Factor
     */
    void setRoundFactor(int RoundFactor);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
