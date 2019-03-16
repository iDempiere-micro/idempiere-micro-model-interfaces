package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for M_Transaction
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Transaction {

    /**
     * TableName=M_Transaction
     */
    String Table_Name = "M_Transaction";

    /**
     * AD_Table_ID=329
     */
    int Table_ID = 329;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


    /**
     * Column name C_ProjectIssue_ID
     */
    String COLUMNNAME_C_ProjectIssue_ID = "C_ProjectIssue_ID";
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
     * Column name M_Locator_ID
     */
    String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
    /**
     * Column name M_MovementLine_ID
     */
    String COLUMNNAME_M_MovementLine_ID = "M_MovementLine_ID";
    /**
     * Column name MovementDate
     */
    String COLUMNNAME_MovementDate = "MovementDate";
    /**
     * Column name MovementQty
     */
    String COLUMNNAME_MovementQty = "MovementQty";
    /**
     * Column name MovementType
     */
    String COLUMNNAME_MovementType = "MovementType";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_ProductionLine_ID
     */
    String COLUMNNAME_M_ProductionLine_ID = "M_ProductionLine_ID";
    /**
     * Column name PP_Cost_Collector_ID
     */
    String COLUMNNAME_PP_Cost_Collector_ID = "PP_Cost_Collector_ID";

    /**
     * Set Project Issue. Project Issues (Material, Labor)
     */
    void setProjectIssueId(int C_ProjectIssue_ID);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getAttributeSetInstanceId();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setAttributeSetInstanceId(int M_AttributeSetInstance_ID);

    /**
     * Set Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    void setInOutLineId(int M_InOutLine_ID);

    /**
     * Set Phys.Inventory Line. Unique line in an Inventory document
     */
    void setInventoryLineId(int M_InventoryLine_ID);

    /**
     * Set Locator. Warehouse Locator
     */
    void setLocatorId(int M_Locator_ID);

    /**
     * Set Move Line. Inventory Move document Line
     */
    void setMovementLineId(int M_MovementLine_ID);

    /**
     * Set Movement Date. Date a product was moved in or out of inventory
     */
    void setMovementDate(Timestamp MovementDate);

    /**
     * Get Movement Quantity. Quantity of a product moved.
     */
    BigDecimal getMovementQty();

    /**
     * Set Movement Quantity. Quantity of a product moved.
     */
    void setMovementQty(BigDecimal MovementQty);

    /**
     * Get Movement Type. Method of moving the inventory
     */
    String getMovementType();

    /**
     * Set Movement Type. Method of moving the inventory
     */
    void setMovementType(String MovementType);

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

    /**
     * Set Production Line. Document Line representing a production
     */
    void setProductionLineId(int M_ProductionLine_ID);

}
