package org.compiere.model;

import org.idempiere.icommon.model.PersistentObject;

import java.math.BigDecimal;

/**
 * Generated Interface for M_InOutLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_InOutLine extends PersistentObject, IDocLine {

    /**
     * TableName=M_InOutLine
     */
    String Table_Name = "M_InOutLine";

    /**
     * AD_Table_ID=320
     */
    int Table_ID = 320;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


    /**
     * Column name AD_OrgTrx_ID
     */
    String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
    /**
     * Column name C_Activity_ID
     */
    String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
    /**
     * Column name C_Campaign_ID
     */
    String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
    /**
     * Column name C_Charge_ID
     */
    String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
    /**
     * Column name ConfirmedQty
     */
    String COLUMNNAME_ConfirmedQty = "ConfirmedQty";
    /**
     * Column name C_OrderLine_ID
     */
    String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name C_ProjectPhase_ID
     */
    String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";
    /**
     * Column name C_ProjectTask_ID
     */
    String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";
    /**
     * Column name C_UOM_ID
     */
    String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsDescription
     */
    String COLUMNNAME_IsDescription = "IsDescription";
    /**
     * Column name IsInvoiced
     */
    String COLUMNNAME_IsInvoiced = "IsInvoiced";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_InOut_ID
     */
    String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
    /**
     * Column name M_InOutLine_ID
     */
    String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
    /**
     * Column name M_Locator_ID
     */
    String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
    /**
     * Column name MovementQty
     */
    String COLUMNNAME_MovementQty = "MovementQty";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_RMALine_ID
     */
    String COLUMNNAME_M_RMALine_ID = "M_RMALine_ID";
    /**
     * Column name PickedQty
     */
    String COLUMNNAME_PickedQty = "PickedQty";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name QtyEntered
     */
    String COLUMNNAME_QtyEntered = "QtyEntered";
    /**
     * Column name QtyOverReceipt
     */
    String COLUMNNAME_QtyOverReceipt = "QtyOverReceipt";
    /**
     * Column name Ref_InOutLine_ID
     */
    String COLUMNNAME_Ref_InOutLine_ID = "Ref_InOutLine_ID";
    /**
     * Column name ReversalLine_ID
     */
    String COLUMNNAME_ReversalLine_ID = "ReversalLine_ID";
    /**
     * Column name ScrappedQty
     */
    String COLUMNNAME_ScrappedQty = "ScrappedQty";
    /**
     * Column name TargetQty
     */
    String COLUMNNAME_TargetQty = "TargetQty";
    /**
     * Column name User1_ID
     */
    String COLUMNNAME_User1_ID = "User1_ID";
    /**
     * Column name User2_ID
     */
    String COLUMNNAME_User2_ID = "User2_ID";

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int AD_Org_ID);

    /**
     * Get Trx Organization. Performing or initiating organization
     */
    int getTransactionOrganizationId();

    /**
     * Set Trx Organization. Performing or initiating organization
     */
    void setTransactionOrganizationId(int AD_OrgTrx_ID);

    /**
     * Get Activity. Business Activity
     */
    int getBusinessActivityId();

    /**
     * Set Activity. Business Activity
     */
    void setBusinessActivityId(int C_Activity_ID);

    /**
     * Get Campaign. Marketing Campaign
     */
    int getCampaignId();

    /**
     * Set Campaign. Marketing Campaign
     */
    void setCampaignId(int C_Campaign_ID);

    /**
     * Get Charge. Additional document charges
     */
    int getChargeId();

    /**
     * Set Charge. Additional document charges
     */
    void setChargeId(int C_Charge_ID);

    /**
     * Set Confirmed Quantity. Confirmation of a received quantity
     */
    void setConfirmedQty(BigDecimal ConfirmedQty);

    /**
     * Get Sales Order Line. Sales Order Line
     */
    int getOrderLineId();

    /**
     * Set Sales Order Line. Sales Order Line
     */
    void setOrderLineId(int C_OrderLine_ID);

    I_C_OrderLine getOrderLine() throws RuntimeException;

    /**
     * Get Project. Financial Project
     */
    int getProjectId();

    /**
     * Set Project. Financial Project
     */
    void setProjectId(int C_Project_ID);

    /**
     * Get Project Phase. Phase of a Project
     */
    int getProjectPhaseId();

    /**
     * Set Project Phase. Phase of a Project
     */
    void setProjectPhaseId(int C_ProjectPhase_ID);

    /**
     * Get Project Task. Actual Project Task in a Phase
     */
    int getProjectTaskId();

    /**
     * Set Project Task. Actual Project Task in a Phase
     */
    void setProjectTaskId(int C_ProjectTask_ID);

    /**
     * Get UOM. Unit of Measure
     */
    int getUOMId();

    /**
     * Set UOM. Unit of Measure
     */
    void setUOMId(int C_UOM_ID);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description Only. if true, the line is just description and no transaction
     */
    void setIsDescription(boolean IsDescription);

    /**
     * Get Description Only. if true, the line is just description and no transaction
     */
    boolean isDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Set Invoiced. Is this invoiced?
     */
    void setIsInvoiced(boolean IsInvoiced);

    /**
     * Get Invoiced. Is this invoiced?
     */
    boolean isInvoiced();

    /**
     * Get Line No. Unique line for this document
     */
    int getLine();

    /**
     * Set Line No. Unique line for this document
     */
    void setLine(int Line);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getAttributeSetInstanceId();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setAttributeSetInstanceId(int M_AttributeSetInstance_ID);

    /**
     * Get Shipment/Receipt. Material Shipment Document
     */
    int getInOutId();

    /**
     * Set Shipment/Receipt. Material Shipment Document
     */
    void setInOutId(int M_InOut_ID);

    I_M_InOut getInOut() throws RuntimeException;

    /**
     * Get Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    int getInOutLineId();

    /**
     * Get Locator. Warehouse Locator
     */
    int getLocatorId();

    /**
     * Set Locator. Warehouse Locator
     */
    void setLocatorId(int M_Locator_ID);

    /**
     * Get Movement Quantity. Quantity of a product moved.
     */
    BigDecimal getMovementQty();

    /**
     * Set Movement Quantity. Quantity of a product moved.
     */
    void setMovementQty(BigDecimal MovementQty);

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

    I_M_Product getProduct() throws RuntimeException;

    /**
     * Get RMA Line. Return Material Authorization Line
     */
    int getRMALineId();

    /**
     * Set RMA Line. Return Material Authorization Line
     */
    void setRMALineId(int M_RMALine_ID);

    I_M_RMALine getRMALine() throws RuntimeException;

    /**
     * Set Picked Quantity
     */
    void setPickedQty(BigDecimal PickedQty);

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Quantity. The Quantity Entered is based on the selected UoM
     */
    BigDecimal getQtyEntered();

    /**
     * Set Quantity. The Quantity Entered is based on the selected UoM
     */
    void setQtyEntered(BigDecimal QtyEntered);

    /**
     * Get Over Receipt. Over Receipt Quantity
     */
    BigDecimal getQtyOverReceipt();

    /**
     * Set Over Receipt. Over Receipt Quantity
     */
    void setQtyOverReceipt(BigDecimal QtyOverReceipt);

    /**
     * Get Referenced Shipment Line
     */
    int getReferencedInOutLineId();

    /**
     * Set Referenced Shipment Line
     */
    void setReferencedInOutLineId(int Ref_InOutLine_ID);

    /**
     * Get Reversal Line. Use to keep the reversal line ID for reversing costing purpose
     */
    int getReversalLineId();

    /**
     * Set Reversal Line. Use to keep the reversal line ID for reversing costing purpose
     */
    void setReversalLineId(int ReversalLine_ID);

    /**
     * Set Scrapped Quantity. The Quantity scrapped due to QA issues
     */
    void setScrappedQty(BigDecimal ScrappedQty);

    /**
     * Set Target Quantity. Target Movement Quantity
     */
    void setTargetQty(BigDecimal TargetQty);

    /**
     * Get User Element List 1. User defined list element #1
     */
    int getUser1Id();

    /**
     * Set User Element List 1. User defined list element #1
     */
    void setUser1Id(int User1_ID);

    /**
     * Get User Element List 2. User defined list element #2
     */
    int getUser2Id();

    /**
     * Set User Element List 2. User defined list element #2
     */
    void setUser2Id(int User2_ID);

    boolean sameOrderLineUOM();

    boolean save();

    void saveEx();

    BigDecimal getBase(String landedCostDistribution);

    I_M_InOut getParent();

    void setQty(BigDecimal zero);

    void addDescription(String s);

    void setWarehouseId(int warehouseId);

    void setLocatorId(BigDecimal bigDecimal);

    void setClientOrg(PersistentObject counter);

    int getWarehouseId();
}
