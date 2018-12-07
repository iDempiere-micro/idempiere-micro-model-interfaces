package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_DemandLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_DemandLine {

    /**
     * TableName=M_DemandLine
     */
    String Table_Name = "M_DemandLine";

    /**
     * AD_Table_ID=719
     */
    int Table_ID = 719;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_Period_ID
     */
    String COLUMNNAME_C_Period_ID = "C_Period_ID";
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
     * Column name M_Demand_ID
     */
    String COLUMNNAME_M_Demand_ID = "M_Demand_ID";
    /**
     * Column name M_DemandLine_ID
     */
    String COLUMNNAME_M_DemandLine_ID = "M_DemandLine_ID";
    /**
     * Column name M_DemandLine_UU
     */
    String COLUMNNAME_M_DemandLine_UU = "M_DemandLine_UU";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";
    /**
     * Column name QtyCalculated
     */
    String COLUMNNAME_QtyCalculated = "QtyCalculated";
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
     * Get Period. Period of the Calendar
     */
    int getC_Period_ID();

    /**
     * Set Period. Period of the Calendar
     */
    void setC_Period_ID(int C_Period_ID);

    I_C_Period getC_Period() throws RuntimeException;

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
     * Get Demand. Material Demand
     */
    int getM_Demand_ID();

    /**
     * Set Demand. Material Demand
     */
    void setM_Demand_ID(int M_Demand_ID);

    I_M_Demand getM_Demand() throws RuntimeException;

    /**
     * Get Demand Line. Material Demand Line
     */
    int getM_DemandLine_ID();

    /**
     * Set Demand Line. Material Demand Line
     */
    void setM_DemandLine_ID(int M_DemandLine_ID);

    /**
     * Get M_DemandLine_UU
     */
    String getM_DemandLine_UU();

    /**
     * Set M_DemandLine_UU
     */
    void setM_DemandLine_UU(String M_DemandLine_UU);

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    void setM_Product_ID(int M_Product_ID);

    I_M_Product getM_Product() throws RuntimeException;

    /**
     * Get Quantity. Quantity
     */
    BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    void setQty(BigDecimal Qty);

    /**
     * Get Calculated Quantity. Calculated Quantity
     */
    BigDecimal getQtyCalculated();

    /**
     * Set Calculated Quantity. Calculated Quantity
     */
    void setQtyCalculated(BigDecimal QtyCalculated);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
