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

public interface I_DD_NetworkDistributionLine {

    /**
     * TableName=DD_NetworkDistributionLine
     */
    String Table_Name = "DD_NetworkDistributionLine";

    /**
     * AD_Table_ID=53061
     */
    int Table_ID = 53061;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


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
     * Column name DD_NetworkDistribution_ID
     */
    String COLUMNNAME_DD_NetworkDistribution_ID = "DD_NetworkDistribution_ID";
    /**
     * Column name DD_NetworkDistributionLine_ID
     */
    String COLUMNNAME_DD_NetworkDistributionLine_ID =
            "DD_NetworkDistributionLine_ID";
    /**
     * Column name DD_NetworkDistributionLine_UU
     */
    String COLUMNNAME_DD_NetworkDistributionLine_UU =
            "DD_NetworkDistributionLine_UU";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name M_Shipper_ID
     */
    String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
    /**
     * Column name M_Warehouse_ID
     */
    String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
    /**
     * Column name M_WarehouseSource_ID
     */
    String COLUMNNAME_M_WarehouseSource_ID = "M_WarehouseSource_ID";
    /**
     * Column name Percent
     */
    String COLUMNNAME_Percent = "Percent";
    /**
     * Column name PriorityNo
     */
    String COLUMNNAME_PriorityNo = "PriorityNo";
    /**
     * Column name TransfertTime
     */
    String COLUMNNAME_TransfertTime = "TransfertTime";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name ValidFrom
     */
    String COLUMNNAME_ValidFrom = "ValidFrom";
    /**
     * Column name ValidTo
     */
    String COLUMNNAME_ValidTo = "ValidTo";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int AD_Org_ID);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Network Distribution
     */
    int getNetworkDistributionId();

    /**
     * Set Network Distribution
     */
    void setNetworkDistributionId(int DD_NetworkDistribution_ID);

    org.eevolution.model.I_DD_NetworkDistribution getNetworkDistribution()
            throws RuntimeException;

    /**
     * Get Network Distribution Line
     */
    int getNetworkDistributionLineId();

    /**
     * Set Network Distribution Line
     */
    void setNetworkDistributionLineId(int DD_NetworkDistributionLine_ID);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Shipper. Method or manner of product delivery
     */
    int getShipperId();

    /**
     * Set Shipper. Method or manner of product delivery
     */
    void setShipperId(int M_Shipper_ID);

    org.compiere.model.I_M_Shipper getShipper() throws RuntimeException;

    /**
     * Get Warehouse. Storage Warehouse and Service Point
     */
    int getWarehouseId();

    /**
     * Set Warehouse. Storage Warehouse and Service Point
     */
    void setWarehouseId(int M_Warehouse_ID);

    org.compiere.model.I_M_Warehouse getWarehouse() throws RuntimeException;

    /**
     * Get Source Warehouse. Optional Warehouse to replenish from
     */
    int getWarehouseSourceId();

    /**
     * Set Source Warehouse. Optional Warehouse to replenish from
     */
    void setWarehouseSourceId(int M_WarehouseSource_ID);

    org.compiere.model.I_M_Warehouse getWarehouseSource() throws RuntimeException;

    /**
     * Get Percent. Percentage
     */
    BigDecimal getPercent();

    /**
     * Set Percent. Percentage
     */
    void setPercent(BigDecimal Percent);

    /**
     * Get Relative Priority. Where inventory should be picked from first
     */
    int getPriorityNo();

    /**
     * Set Relative Priority. Where inventory should be picked from first
     */
    void setPriorityNo(int PriorityNo);

    /**
     * Get Transfert Time
     */
    BigDecimal getTransferTime();

    /**
     * Set Transfert Time
     */
    void setTransferTime(BigDecimal TransferTime);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Valid from. Valid from including this date (first day)
     */
    Timestamp getValidFrom();

    /**
     * Set Valid from. Valid from including this date (first day)
     */
    void setValidFrom(Timestamp ValidFrom);

    /**
     * Get Valid to. Valid to including this date (last day)
     */
    Timestamp getValidTo();

    /**
     * Set Valid to. Valid to including this date (last day)
     */
    void setValidTo(Timestamp ValidTo);
}
