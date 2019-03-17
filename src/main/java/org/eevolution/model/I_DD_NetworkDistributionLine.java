package org.eevolution.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for DD_NetworkDistributionLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_DD_NetworkDistributionLine {

    /**
     * TableName=DD_NetworkDistributionLine
     */
    public static final String Table_Name = "DD_NetworkDistributionLine";

    /**
     * AD_Table_ID=53061
     */
    public static final int Table_ID = 53061;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name AD_Org_ID
     */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name Created
     */
    public static final String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DD_NetworkDistribution_ID
     */
    public static final String COLUMNNAME_DD_NetworkDistribution_ID = "DD_NetworkDistribution_ID";
    /**
     * Column name DD_NetworkDistributionLine_ID
     */
    public static final String COLUMNNAME_DD_NetworkDistributionLine_ID =
            "DD_NetworkDistributionLine_ID";
    /**
     * Column name DD_NetworkDistributionLine_UU
     */
    public static final String COLUMNNAME_DD_NetworkDistributionLine_UU =
            "DD_NetworkDistributionLine_UU";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name M_Shipper_ID
     */
    public static final String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
    /**
     * Column name M_Warehouse_ID
     */
    public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
    /**
     * Column name M_WarehouseSource_ID
     */
    public static final String COLUMNNAME_M_WarehouseSource_ID = "M_WarehouseSource_ID";
    /**
     * Column name Percent
     */
    public static final String COLUMNNAME_Percent = "Percent";
    /**
     * Column name PriorityNo
     */
    public static final String COLUMNNAME_PriorityNo = "PriorityNo";
    /**
     * Column name TransfertTime
     */
    public static final String COLUMNNAME_TransfertTime = "TransfertTime";
    /**
     * Column name Updated
     */
    public static final String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name ValidFrom
     */
    public static final String COLUMNNAME_ValidFrom = "ValidFrom";
    /**
     * Column name ValidTo
     */
    public static final String COLUMNNAME_ValidTo = "ValidTo";

    /**
     * Get Organization. Organizational entity within client
     */
    public int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    public void setOrgId(int AD_Org_ID);

    /**
     * Get Created. Date this record was created
     */
    public Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    public int getCreatedBy();

    /**
     * Get Network Distribution
     */
    public int getDD_NetworkDistributionId();

    /**
     * Set Network Distribution
     */
    public void setDD_NetworkDistributionId(int DD_NetworkDistribution_ID);

    public org.eevolution.model.I_DD_NetworkDistribution getDD_NetworkDistribution()
            throws RuntimeException;

    /**
     * Get Network Distribution Line
     */
    public int getDD_NetworkDistributionLineId();

    /**
     * Set Network Distribution Line
     */
    public void setDD_NetworkDistributionLineId(int DD_NetworkDistributionLine_ID);

    /**
     * Get DD_NetworkDistributionLine_UU
     */
    public String getDD_NetworkDistributionLine_UU();

    /**
     * Set DD_NetworkDistributionLine_UU
     */
    public void setDD_NetworkDistributionLine_UU(String DD_NetworkDistributionLine_UU);

    /**
     * Set Active. The record is active in the system
     */
    public void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    public boolean isActive();

    /**
     * Get Shipper. Method or manner of product delivery
     */
    public int getShipperId();

    /**
     * Set Shipper. Method or manner of product delivery
     */
    public void setShipperId(int M_Shipper_ID);

    public org.compiere.model.I_M_Shipper getShipper() throws RuntimeException;

    /**
     * Get Warehouse. Storage Warehouse and Service Point
     */
    public int getWarehouseId();

    /**
     * Set Warehouse. Storage Warehouse and Service Point
     */
    public void setWarehouseId(int M_Warehouse_ID);

    public org.compiere.model.I_M_Warehouse getWarehouse() throws RuntimeException;

    /**
     * Get Source Warehouse. Optional Warehouse to replenish from
     */
    public int getWarehouseSourceId();

    /**
     * Set Source Warehouse. Optional Warehouse to replenish from
     */
    public void setWarehouseSourceId(int M_WarehouseSource_ID);

    public org.compiere.model.I_M_Warehouse getWarehouseSource() throws RuntimeException;

    /**
     * Get Percent. Percentage
     */
    public BigDecimal getPercent();

    /**
     * Set Percent. Percentage
     */
    public void setPercent(BigDecimal Percent);

    /**
     * Get Relative Priority. Where inventory should be picked from first
     */
    public int getPriorityNo();

    /**
     * Set Relative Priority. Where inventory should be picked from first
     */
    public void setPriorityNo(int PriorityNo);

    /**
     * Get Transfert Time
     */
    public BigDecimal getTransfertTime();

    /**
     * Set Transfert Time
     */
    public void setTransfertTime(BigDecimal TransfertTime);

    /**
     * Get Updated. Date this record was updated
     */
    public Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    public int getUpdatedBy();

    /**
     * Get Valid from. Valid from including this date (first day)
     */
    public Timestamp getValidFrom();

    /**
     * Set Valid from. Valid from including this date (first day)
     */
    public void setValidFrom(Timestamp ValidFrom);

    /**
     * Get Valid to. Valid to including this date (last day)
     */
    public Timestamp getValidTo();

    /**
     * Set Valid to. Valid to including this date (last day)
     */
    public void setValidTo(Timestamp ValidTo);
}
