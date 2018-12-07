package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_DistributionRun
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_DistributionRun {

    /**
     * TableName=M_DistributionRun
     */
    String Table_Name = "M_DistributionRun";

    /**
     * AD_Table_ID=712
     */
    int Table_ID = 712;

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
     * Column name C_BPartner_Location_ID
     */
    String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
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
     * Column name IsCreateSingleOrder
     */
    String COLUMNNAME_IsCreateSingleOrder = "IsCreateSingleOrder";
    /**
     * Column name M_DistributionRun_ID
     */
    String COLUMNNAME_M_DistributionRun_ID = "M_DistributionRun_ID";
    /**
     * Column name M_DistributionRun_UU
     */
    String COLUMNNAME_M_DistributionRun_UU = "M_DistributionRun_UU";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
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
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setC_BPartner_ID(int C_BPartner_ID);

    I_C_BPartner getC_BPartner() throws RuntimeException;

    /**
     * Get Partner Location. Identifies the (ship to) address for this Business Partner
     */
    int getC_BPartner_Location_ID();

    /**
     * Set Partner Location. Identifies the (ship to) address for this Business Partner
     */
    void setC_BPartner_Location_ID(int C_BPartner_Location_ID);

    I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException;

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
     * Set Create Single Order. For all shipments create one Order
     */
    void setIsCreateSingleOrder(boolean IsCreateSingleOrder);

    /**
     * Get Create Single Order. For all shipments create one Order
     */
    boolean isCreateSingleOrder();

    /**
     * Get Distribution Run. Distribution Run create Orders to distribute products to a selected list
     * of partners
     */
    int getM_DistributionRun_ID();

    /**
     * Set Distribution Run. Distribution Run create Orders to distribute products to a selected list
     * of partners
     */
    void setM_DistributionRun_ID(int M_DistributionRun_ID);

    /**
     * Get M_DistributionRun_UU
     */
    String getM_DistributionRun_UU();

    /**
     * Set M_DistributionRun_UU
     */
    void setM_DistributionRun_UU(String M_DistributionRun_UU);

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
