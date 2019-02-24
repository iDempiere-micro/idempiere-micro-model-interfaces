package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_InOutLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_InOutLine {

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
    int getAD_OrgTrx_ID();

    /**
     * Set Trx Organization. Performing or initiating organization
     */
    void setAD_OrgTrx_ID(int AD_OrgTrx_ID);

    /**
     * Get Activity. Business Activity
     */
    int getC_Activity_ID();

    /**
     * Set Activity. Business Activity
     */
    void setC_Activity_ID(int C_Activity_ID);

    /**
     * Get Campaign. Marketing Campaign
     */
    int getC_Campaign_ID();

    /**
     * Set Campaign. Marketing Campaign
     */
    void setC_Campaign_ID(int C_Campaign_ID);

    /**
     * Get Charge. Additional document charges
     */
    int getC_Charge_ID();

    /**
     * Set Charge. Additional document charges
     */
    void setC_Charge_ID(int C_Charge_ID);

    /**
     * Set Confirmed Quantity. Confirmation of a received quantity
     */
    void setConfirmedQty(BigDecimal ConfirmedQty);

    /**
     * Get Sales Order Line. Sales Order Line
     */
    int getC_OrderLine_ID();

    /**
     * Set Sales Order Line. Sales Order Line
     */
    void setC_OrderLine_ID(int C_OrderLine_ID);

    I_C_OrderLine getC_OrderLine() throws RuntimeException;

    /**
     * Get Project. Financial Project
     */
    int getC_Project_ID();

    /**
     * Set Project. Financial Project
     */
    void setC_Project_ID(int C_Project_ID);

    /**
     * Get Project Phase. Phase of a Project
     */
    int getC_ProjectPhase_ID();

    /**
     * Set Project Phase. Phase of a Project
     */
    void setC_ProjectPhase_ID(int C_ProjectPhase_ID);

    /**
     * Get Project Task. Actual Project Task in a Phase
     */
    int getC_ProjectTask_ID();

    /**
     * Set Project Task. Actual Project Task in a Phase
     */
    void setC_ProjectTask_ID(int C_ProjectTask_ID);

    /**
     * Get UOM. Unit of Measure
     */
    int getC_UOM_ID();

    /**
     * Set UOM. Unit of Measure
     */
    void setC_UOM_ID(int C_UOM_ID);

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
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getMAttributeSetInstance_ID();

    /**
     * Get Shipment/Receipt. Material Shipment Document
     */
    int getM_InOut_ID();

    /**
     * Set Shipment/Receipt. Material Shipment Document
     */
    void setM_InOut_ID(int M_InOut_ID);

    I_M_InOut getM_InOut() throws RuntimeException;

    /**
     * Get Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    int getM_InOutLine_ID();

    /**
     * Get Locator. Warehouse Locator
     */
    int getM_Locator_ID();

    /**
     * Set Locator. Warehouse Locator
     */
    void setM_Locator_ID(int M_Locator_ID);

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
    int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    void setM_Product_ID(int M_Product_ID);

    I_M_Product getM_Product() throws RuntimeException;

    /**
     * Get RMA Line. Return Material Authorization Line
     */
    int getM_RMALine_ID();

    /**
     * Set RMA Line. Return Material Authorization Line
     */
    void setM_RMALine_ID(int M_RMALine_ID);

    I_M_RMALine getM_RMALine() throws RuntimeException;

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
    int getRef_InOutLine_ID();

    /**
     * Set Referenced Shipment Line
     */
    void setRef_InOutLine_ID(int Ref_InOutLine_ID);

    /**
     * Get Reversal Line. Use to keep the reversal line ID for reversing costing purpose
     */
    int getReversalLine_ID();

    /**
     * Set Reversal Line. Use to keep the reversal line ID for reversing costing purpose
     */
    void setReversalLine_ID(int ReversalLine_ID);

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
    int getUser1_ID();

    /**
     * Set User Element List 1. User defined list element #1
     */
    void setUser1_ID(int User1_ID);

    /**
     * Get User Element List 2. User defined list element #2
     */
    int getUser2_ID();

    /**
     * Set User Element List 2. User defined list element #2
     */
    void setUser2_ID(int User2_ID);

}
