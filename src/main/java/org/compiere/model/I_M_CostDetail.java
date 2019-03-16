package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_CostDetail
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_CostDetail {

    /**
     * TableName=M_CostDetail
     */
    String Table_Name = "M_CostDetail";

    /**
     * AD_Table_ID=808
     */
    int Table_ID = 808;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name Amt
     */
    String COLUMNNAME_Amt = "Amt";
    /**
     * Column name C_AcctSchema_ID
     */
    String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /**
     * Column name C_InvoiceLine_ID
     */
    String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
    /**
     * Column name C_OrderLine_ID
     */
    String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
    /**
     * Column name C_ProjectIssue_ID
     */
    String COLUMNNAME_C_ProjectIssue_ID = "C_ProjectIssue_ID";
    /**
     * Column name CumulatedAmt
     */
    String COLUMNNAME_CumulatedAmt = "CumulatedAmt";
    /**
     * Column name CumulatedQty
     */
    String COLUMNNAME_CumulatedQty = "CumulatedQty";
    /**
     * Column name CurrentCostPrice
     */
    String COLUMNNAME_CurrentCostPrice = "CurrentCostPrice";
    /**
     * Column name CurrentQty
     */
    String COLUMNNAME_CurrentQty = "CurrentQty";
    /**
     * Column name DeltaAmt
     */
    String COLUMNNAME_DeltaAmt = "DeltaAmt";
    /**
     * Column name DeltaQty
     */
    String COLUMNNAME_DeltaQty = "DeltaQty";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsSOTrx
     */
    String COLUMNNAME_IsSOTrx = "IsSOTrx";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_CostDetail_ID
     */
    String COLUMNNAME_M_CostDetail_ID = "M_CostDetail_ID";
    /**
     * Column name M_CostElement_ID
     */
    String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
    /**
     * Column name M_InOutLine_ID
     */
    String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
    /**
     * Column name M_InventoryLine_ID
     */
    String COLUMNNAME_M_InventoryLine_ID = "M_InventoryLine_ID";
    /**
     * Column name M_MatchInv_ID
     */
    String COLUMNNAME_M_MatchInv_ID = "M_MatchInv_ID";
    /**
     * Column name M_MovementLine_ID
     */
    String COLUMNNAME_M_MovementLine_ID = "M_MovementLine_ID";
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
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";

    /**
     * Get Amount. Amount
     */
    BigDecimal getAmt();

    /**
     * Set Amount. Amount
     */
    void setAmt(BigDecimal Amt);

    /**
     * Get Accounting Schema. Rules for accounting
     */
    int getAccountingSchemaId();

    /**
     * Set Accounting Schema. Rules for accounting
     */
    void setAccountingSchemaId(int C_AcctSchema_ID);

    /**
     * Get Invoice Line. Invoice Detail Line
     */
    int getInvoiceLineId();

    /**
     * Set Invoice Line. Invoice Detail Line
     */
    void setInvoiceLineId(int C_InvoiceLine_ID);

    /**
     * Get Sales Order Line. Sales Order Line
     */
    int getOrderLineId();

    /**
     * Get Project Issue. Project Issues (Material, Labor)
     */
    int getProjectIssueId();

    /**
     * Set Accumulated Amt. Total Amount
     */
    void setCumulatedAmt(BigDecimal CumulatedAmt);

    /**
     * Set Accumulated Qty. Total Quantity
     */
    void setCumulatedQty(BigDecimal CumulatedQty);

    /**
     * Set Current Cost Price. The currently used cost price
     */
    void setCurrentCostPrice(BigDecimal CurrentCostPrice);

    /**
     * Set Current Quantity. Current Quantity
     */
    void setCurrentQty(BigDecimal CurrentQty);

    /**
     * Get Delta Amount. Difference Amount
     */
    BigDecimal getDeltaAmt();

    /**
     * Set Delta Amount. Difference Amount
     */
    void setDeltaAmt(BigDecimal DeltaAmt);

    /**
     * Get Delta Quantity. Quantity Difference
     */
    BigDecimal getDeltaQty();

    /**
     * Set Delta Quantity. Quantity Difference
     */
    void setDeltaQty(BigDecimal DeltaQty);

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Set Sales Transaction. This is a Sales Transaction
     */
    void setIsSOTrx(boolean IsSOTrx);

    /**
     * Get Sales Transaction. This is a Sales Transaction
     */
    boolean isSOTrx();

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getAttributeSetInstanceId();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setAttributeSetInstanceId(int M_AttributeSetInstance_ID);

    /**
     * Get Cost Detail. Cost Detail Information
     */
    int getCostDetailId();

    /**
     * Get Cost Element. Product Cost Element
     */
    int getCostElementId();

    /**
     * Set Cost Element. Product Cost Element
     */
    void setCostElementId(int M_CostElement_ID);

    /**
     * Get Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    int getInOutLineId();

    /**
     * Set Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    void setInOutLineId(int M_InOutLine_ID);

    /**
     * Get Phys.Inventory Line. Unique line in an Inventory document
     */
    int getInventoryLineId();

    /**
     * Set Phys.Inventory Line. Unique line in an Inventory document
     */
    void setInventoryLineId(int M_InventoryLine_ID);

    I_M_InventoryLine getM_InventoryLine() throws RuntimeException;

    /**
     * Get Match Invoice. Match Shipment/Receipt to Invoice
     */
    int getMatchInvoiceId();

    /**
     * Get Move Line. Inventory Move document Line
     */
    int getMovementLineId();

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

    /**
     * Get Production Line. Document Line representing a production
     */
    int getProductionLineId();

    /**
     * Get Manufacturing Cost Collector
     */
    int getManufacturingCostCollectorId();

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Quantity. Quantity
     */
    BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    void setQty(BigDecimal Qty);

}
