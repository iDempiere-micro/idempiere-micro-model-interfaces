package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_RequisitionLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_RequisitionLine {

    /**
     * TableName=M_RequisitionLine
     */
    String Table_Name = "M_RequisitionLine";

    /**
     * AD_Table_ID=703
     */
    int Table_ID = 703;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);



    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_Charge_ID
     */
    String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
    /**
     * Column name C_OrderLine_ID
     */
    String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
    /**
     * Column name C_UOM_ID
     */
    String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name LineNetAmt
     */
    String COLUMNNAME_LineNetAmt = "LineNetAmt";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_Requisition_ID
     */
    String COLUMNNAME_M_Requisition_ID = "M_Requisition_ID";
    /**
     * Column name PriceActual
     */
    String COLUMNNAME_PriceActual = "PriceActual";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setC_BPartner_ID(int C_BPartner_ID);

    /**
     * Get Charge. Additional document charges
     */
    int getC_Charge_ID();

    /**
     * Set Charge. Additional document charges
     */
    void setC_Charge_ID(int C_Charge_ID);

    /**
     * Get Sales Order Line. Sales Order Line
     */
    int getC_OrderLine_ID();

    /**
     * Set Sales Order Line. Sales Order Line
     */
    void setC_OrderLine_ID(int C_OrderLine_ID);

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
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Line No. Unique line for this document
     */
    int getLine();

    /**
     * Set Line No. Unique line for this document
     */
    void setLine(int Line);

    /**
     * Get Line Amount. Line Extended Amount (Quantity * Actual Price) without Freight and Charges
     */
    BigDecimal getLineNetAmt();

    /**
     * Set Line Amount. Line Extended Amount (Quantity * Actual Price) without Freight and Charges
     */
    void setLineNetAmt(BigDecimal LineNetAmt);

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getMAttributeSetInstance_ID();

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
     * Get Requisition. Material Requisition
     */
    int getM_Requisition_ID();

    /**
     * Set Requisition. Material Requisition
     */
    void setM_Requisition_ID(int M_Requisition_ID);

    /**
     * Get Unit Price. Actual Price
     */
    BigDecimal getPriceActual();

    /**
     * Set Unit Price. Actual Price
     */
    void setPriceActual(BigDecimal PriceActual);

    /**
     * Get Quantity. Quantity
     */
    BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    void setQty(BigDecimal Qty);

}
