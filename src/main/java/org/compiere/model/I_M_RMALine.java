package org.compiere.model;

import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;
import java.util.Properties;

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

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


    /**
     * Column name Amt
     */
    String COLUMNNAME_Amt = "Amt";
    /**
     * Column name C_Charge_ID
     */
    String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
    /**
     * Column name C_Tax_ID
     */
    String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
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
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Amount. Amount
     */
    BigDecimal getAmt();

    /**
     * Get Tax. Tax identifier
     */
    int getTaxId();

    /**
     * Get Line Amount. Line Extended Amount (Quantity * Actual Price) without Freight and Charges
     */
    BigDecimal getLineNetAmt();

    /**
     * Set Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    void setInOutLineId(int M_InOutLine_ID);

    I_M_InOutLine getInOutLine() throws RuntimeException;

    /**
     * Get RMA. Return Material Authorization
     */
    int getRMAId();

    boolean isValueChanged(String columnname_c_tax_id);

    Object getValueOld(String columnname_c_tax_id);

    Properties getCtx();

    I_M_RMA getParent();

    boolean updateOrderTax(boolean b);

    boolean updateHeaderAmt();

    void clearParent();
}
