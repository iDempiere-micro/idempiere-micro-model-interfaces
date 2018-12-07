package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_OrderLandedCost
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_OrderLandedCost {

    /**
     * TableName=C_OrderLandedCost
     */
    String Table_Name = "C_OrderLandedCost";

    /**
     * AD_Table_ID=200103
     */
    int Table_ID = 200103;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name Amt
     */
    String COLUMNNAME_Amt = "Amt";
    /**
     * Column name C_Order_ID
     */
    String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name C_OrderLandedCost_ID
     */
    String COLUMNNAME_C_OrderLandedCost_ID = "C_OrderLandedCost_ID";
    /**
     * Column name C_OrderLandedCost_UU
     */
    String COLUMNNAME_C_OrderLandedCost_UU = "C_OrderLandedCost_UU";
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
     * Column name LandedCostDistribution
     */
    String COLUMNNAME_LandedCostDistribution = "LandedCostDistribution";
    /**
     * Column name M_CostElement_ID
     */
    String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
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
     * Get Amount. Amount
     */
    BigDecimal getAmt();

    /**
     * Set Amount. Amount
     */
    void setAmt(BigDecimal Amt);

    /**
     * Get Order. Order
     */
    int getC_Order_ID();

    /**
     * Set Order. Order
     */
    void setC_Order_ID(int C_Order_ID);

    I_C_Order getC_Order() throws RuntimeException;

    /**
     * Get Estimated Landed Cost
     */
    int getC_OrderLandedCost_ID();

    /**
     * Set Estimated Landed Cost
     */
    void setC_OrderLandedCost_ID(int C_OrderLandedCost_ID);

    /**
     * Get C_OrderLandedCost_UU
     */
    String getC_OrderLandedCost_UU();

    /**
     * Set C_OrderLandedCost_UU
     */
    void setC_OrderLandedCost_UU(String C_OrderLandedCost_UU);

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
     * Get Cost Distribution. Landed Cost Distribution
     */
    String getLandedCostDistribution();

    /**
     * Set Cost Distribution. Landed Cost Distribution
     */
    void setLandedCostDistribution(String LandedCostDistribution);

    /**
     * Get Cost Element. Product Cost Element
     */
    int getM_CostElement_ID();

    /**
     * Set Cost Element. Product Cost Element
     */
    void setM_CostElement_ID(int M_CostElement_ID);

    I_M_CostElement getM_CostElement() throws RuntimeException;

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
