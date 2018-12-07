package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_DistributionList
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_DistributionList {

    /**
     * TableName=M_DistributionList
     */
    String Table_Name = "M_DistributionList";

    /**
     * AD_Table_ID=666
     */
    int Table_ID = 666;

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
     * Column name M_DistributionList_ID
     */
    String COLUMNNAME_M_DistributionList_ID = "M_DistributionList_ID";
    /**
     * Column name M_DistributionList_UU
     */
    String COLUMNNAME_M_DistributionList_UU = "M_DistributionList_UU";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name RatioTotal
     */
    String COLUMNNAME_RatioTotal = "RatioTotal";
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
     * Get Distribution List. Distribution Lists allow to distribute products to a selected list of
     * partners
     */
    int getM_DistributionList_ID();

    /**
     * Set Distribution List. Distribution Lists allow to distribute products to a selected list of
     * partners
     */
    void setM_DistributionList_ID(int M_DistributionList_ID);

    /**
     * Get M_DistributionList_UU
     */
    String getM_DistributionList_UU();

    /**
     * Set M_DistributionList_UU
     */
    void setM_DistributionList_UU(String M_DistributionList_UU);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Total Ratio. Total of relative weight in a distribution
     */
    BigDecimal getRatioTotal();

    /**
     * Set Total Ratio. Total of relative weight in a distribution
     */
    void setRatioTotal(BigDecimal RatioTotal);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
