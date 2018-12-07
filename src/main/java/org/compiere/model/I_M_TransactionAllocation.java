package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_TransactionAllocation
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_TransactionAllocation {

    /**
     * TableName=M_TransactionAllocation
     */
    String Table_Name = "M_TransactionAllocation";

    /**
     * AD_Table_ID=636
     */
    int Table_ID = 636;

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
     * Column name AllocationStrategyType
     */
    String COLUMNNAME_AllocationStrategyType = "AllocationStrategyType";
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
     * Column name IsAllocated
     */
    String COLUMNNAME_IsAllocated = "IsAllocated";
    /**
     * Column name IsManual
     */
    String COLUMNNAME_IsManual = "IsManual";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_InOutLine_ID
     */
    String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
    /**
     * Column name M_InventoryLine_ID
     */
    String COLUMNNAME_M_InventoryLine_ID = "M_InventoryLine_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_ProductionLine_ID
     */
    String COLUMNNAME_M_ProductionLine_ID = "M_ProductionLine_ID";
    /**
     * Column name M_TransactionAllocation_UU
     */
    String COLUMNNAME_M_TransactionAllocation_UU = "M_TransactionAllocation_UU";
    /**
     * Column name M_Transaction_ID
     */
    String COLUMNNAME_M_Transaction_ID = "M_Transaction_ID";
    /**
     * Column name Out_M_InOutLine_ID
     */
    String COLUMNNAME_Out_M_InOutLine_ID = "Out_M_InOutLine_ID";
    /**
     * Column name Out_M_InventoryLine_ID
     */
    String COLUMNNAME_Out_M_InventoryLine_ID = "Out_M_InventoryLine_ID";
    /**
     * Column name Out_M_ProductionLine_ID
     */
    String COLUMNNAME_Out_M_ProductionLine_ID = "Out_M_ProductionLine_ID";
    /**
     * Column name Out_M_Transaction_ID
     */
    String COLUMNNAME_Out_M_Transaction_ID = "Out_M_Transaction_ID";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";
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
     * Get Allocation Strategy. Allocation Strategy
     */
    String getAllocationStrategyType();

    /**
     * Set Allocation Strategy. Allocation Strategy
     */
    void setAllocationStrategyType(String AllocationStrategyType);

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
     * Set Allocated. Indicates if the payment has been allocated
     */
    void setIsAllocated(boolean IsAllocated);

    /**
     * Get Allocated. Indicates if the payment has been allocated
     */
    boolean isAllocated();

    /**
     * Set Manual. This is a manual process
     */
    void setIsManual(boolean IsManual);

    /**
     * Get Manual. This is a manual process
     */
    boolean isManual();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getMAttributeSetInstance_ID();

    I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

    /**
     * Get Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    int getM_InOutLine_ID();

    /**
     * Set Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    void setM_InOutLine_ID(int M_InOutLine_ID);

    I_M_InOutLine getM_InOutLine() throws RuntimeException;

    /**
     * Get Phys.Inventory Line. Unique line in an Inventory document
     */
    int getM_InventoryLine_ID();

    /**
     * Set Phys.Inventory Line. Unique line in an Inventory document
     */
    void setM_InventoryLine_ID(int M_InventoryLine_ID);

    I_M_InventoryLine getM_InventoryLine() throws RuntimeException;

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
     * Get Production Line. Document Line representing a production
     */
    int getM_ProductionLine_ID();

    /**
     * Set Production Line. Document Line representing a production
     */
    void setM_ProductionLine_ID(int M_ProductionLine_ID);

    I_M_ProductionLine getM_ProductionLine() throws RuntimeException;

    /**
     * Get M_TransactionAllocation_UU
     */
    String getM_TransactionAllocation_UU();

    /**
     * Set M_TransactionAllocation_UU
     */
    void setM_TransactionAllocation_UU(String M_TransactionAllocation_UU);

    /**
     * Get Inventory Transaction
     */
    int getM_Transaction_ID();

    /**
     * Set Inventory Transaction
     */
    void setM_Transaction_ID(int M_Transaction_ID);

    I_M_Transaction getM_Transaction() throws RuntimeException;

    /**
     * Get Out Shipment Line. Outgoing Shipment/Receipt
     */
    int getOut_M_InOutLine_ID();

    /**
     * Set Out Shipment Line. Outgoing Shipment/Receipt
     */
    void setOut_M_InOutLine_ID(int Out_M_InOutLine_ID);

    I_M_InOutLine getOut_M_InOutLine() throws RuntimeException;

    /**
     * Get Out Inventory Line. Outgoing Inventory Line
     */
    int getOut_M_InventoryLine_ID();

    /**
     * Set Out Inventory Line. Outgoing Inventory Line
     */
    void setOut_M_InventoryLine_ID(int Out_M_InventoryLine_ID);

    I_M_InventoryLine getOut_M_InventoryLine() throws RuntimeException;

    /**
     * Get Out Production Line. Outgoing Production Line
     */
    int getOut_M_ProductionLine_ID();

    /**
     * Set Out Production Line. Outgoing Production Line
     */
    void setOut_M_ProductionLine_ID(int Out_M_ProductionLine_ID);

    I_M_ProductionLine getOut_M_ProductionLine() throws RuntimeException;

    /**
     * Get Out Transaction. Outgoing Transaction
     */
    int getOut_M_Transaction_ID();

    /**
     * Set Out Transaction. Outgoing Transaction
     */
    void setOut_M_Transaction_ID(int Out_M_Transaction_ID);

    I_M_Transaction getOut_M_Transaction() throws RuntimeException;

    /**
     * Get Quantity. Quantity
     */
    BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    void setQty(BigDecimal Qty);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
