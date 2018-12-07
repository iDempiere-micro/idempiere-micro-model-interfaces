package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Properties;

import org.idempiere.common.util.KeyNamePair;
import org.idempiere.icommon.model.IPO;

/**
 * Generated Interface for M_RMALine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_RMALine extends IPO {

    /**
     * TableName=M_RMALine
     */
    String Table_Name = "M_RMALine";

    /**
     * AD_Table_ID=660
     */
    int Table_ID = 660;

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
     * Column name C_Charge_ID
     */
    String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_Tax_ID
     */
    String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name LineNetAmt
     */
    String COLUMNNAME_LineNetAmt = "LineNetAmt";
    /**
     * Column name M_InOutLine_ID
     */
    String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_RMA_ID
     */
    String COLUMNNAME_M_RMA_ID = "M_RMA_ID";
    /**
     * Column name M_RMALine_ID
     */
    String COLUMNNAME_M_RMALine_ID = "M_RMALine_ID";
    /**
     * Column name M_RMALine_UU
     */
    String COLUMNNAME_M_RMALine_UU = "M_RMALine_UU";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";
    /**
     * Column name QtyDelivered
     */
    String COLUMNNAME_QtyDelivered = "QtyDelivered";
    /**
     * Column name QtyInvoiced
     */
    String COLUMNNAME_QtyInvoiced = "QtyInvoiced";
    /**
     * Column name Ref_RMALine_ID
     */
    String COLUMNNAME_Ref_RMALine_ID = "Ref_RMALine_ID";
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
     * Get Charge. Additional document charges
     */
    int getC_Charge_ID();

    /**
     * Set Charge. Additional document charges
     */
    void setC_Charge_ID(int C_Charge_ID);

    I_C_Charge getC_Charge() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Tax. Tax identifier
     */
    int getC_Tax_ID();

    /**
     * Set Tax. Tax identifier
     */
    void setC_Tax_ID(int C_Tax_ID);

    I_C_Tax getC_Tax() throws RuntimeException;

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
     * Get Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    int getM_InOutLine_ID();

    /**
     * Set Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    void setM_InOutLine_ID(int M_InOutLine_ID);

    I_M_InOutLine getM_InOutLine() throws RuntimeException;

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
     * Get RMA. Return Material Authorization
     */
    int getM_RMA_ID();

    /**
     * Set RMA. Return Material Authorization
     */
    void setM_RMA_ID(int M_RMA_ID);

    I_M_RMA getM_RMA() throws RuntimeException;

    /**
     * Get RMA Line. Return Material Authorization Line
     */
    int getM_RMALine_ID();

    /**
     * Set RMA Line. Return Material Authorization Line
     */
    void setM_RMALine_ID(int M_RMALine_ID);

    /**
     * Get M_RMALine_UU
     */
    String getM_RMALine_UU();

    /**
     * Set M_RMALine_UU
     */
    void setM_RMALine_UU(String M_RMALine_UU);

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

    /**
     * Get Delivered Quantity. Delivered Quantity
     */
    BigDecimal getQtyDelivered();

    /**
     * Set Delivered Quantity. Delivered Quantity
     */
    void setQtyDelivered(BigDecimal QtyDelivered);

    /**
     * Get Quantity Invoiced. Invoiced Quantity
     */
    BigDecimal getQtyInvoiced();

    /**
     * Set Quantity Invoiced. Invoiced Quantity
     */
    void setQtyInvoiced(BigDecimal QtyInvoiced);

    /**
     * Get Referenced RMA Line
     */
    int getRef_RMALine_ID();

    /**
     * Set Referenced RMA Line
     */
    void setRef_RMALine_ID(int Ref_RMALine_ID);

    I_M_RMALine getRef_RMALine() throws RuntimeException;

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    boolean is_ValueChanged(String columnname_c_tax_id);

    Object get_ValueOld(String columnname_c_tax_id);

    Properties getCtx();

    I_M_RMA getParent();

    boolean updateOrderTax(boolean b);

    boolean updateHeaderAmt();

    void clearParent();
}
