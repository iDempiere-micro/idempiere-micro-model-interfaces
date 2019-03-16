package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for M_MatchPO
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_MatchPO {

    /**
     * TableName=M_MatchPO
     */
    String Table_Name = "M_MatchPO";

    /**
     * AD_Table_ID=473
     */
    int Table_ID = 473;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name C_InvoiceLine_ID
     */
    String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
    /**
     * Column name C_OrderLine_ID
     */
    String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
    /**
     * Column name DateAcct
     */
    String COLUMNNAME_DateAcct = "DateAcct";
    /**
     * Column name DateTrx
     */
    String COLUMNNAME_DateTrx = "DateTrx";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name IsApproved
     */
    String COLUMNNAME_IsApproved = "IsApproved";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_InOutLine_ID
     */
    String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
    /**
     * Column name M_MatchPO_ID
     */
    String COLUMNNAME_M_MatchPO_ID = "M_MatchPO_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name Posted
     */
    String COLUMNNAME_Posted = "Posted";
    /**
     * Column name PriceMatchDifference
     */
    String COLUMNNAME_PriceMatchDifference = "PriceMatchDifference";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";
    /**
     * Column name Reversal_ID
     */
    String COLUMNNAME_Reversal_ID = "Reversal_ID";

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
     * Set Sales Order Line. Sales Order Line
     */
    void setOrderLineId(int C_OrderLine_ID);

    /**
     * Get Account Date. Accounting Date
     */
    Timestamp getDateAcct();

    /**
     * Set Account Date. Accounting Date
     */
    void setDateAcct(Timestamp DateAcct);

    /**
     * Get Transaction Date. Transaction Date
     */
    Timestamp getDateTrx();

    /**
     * Set Transaction Date. Transaction Date
     */
    void setDateTrx(Timestamp DateTrx);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Document No. Document sequence number of the document
     */
    String getDocumentNo();

    /**
     * Set Approved. Indicates if this document requires approval
     */
    void setIsApproved(boolean IsApproved);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getAttributeSetInstanceId();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setAttributeSetInstanceId(int M_AttributeSetInstance_ID);

    /**
     * Get Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    int getInOutLineId();

    /**
     * Set Shipment/Receipt Line. Line on Shipment or Receipt document
     */
    void setInOutLineId(int M_InOutLine_ID);

    /**
     * Get Match PO. Match Purchase Order to Shipment/Receipt and Invoice
     */
    int getM_MatchPO_ID();

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

    /**
     * Get Posted. Posting status
     */
    boolean isPosted();

    /**
     * Set Posted. Posting status
     */
    void setPosted(boolean Posted);

    /**
     * Get Price Match Difference. Difference between Purchase and Invoice Price per matched line
     */
    BigDecimal getPriceMatchDifference();

    /**
     * Set Price Match Difference. Difference between Purchase and Invoice Price per matched line
     */
    void setPriceMatchDifference(BigDecimal PriceMatchDifference);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Quantity. Quantity
     */
    BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    void setQty(BigDecimal Qty);

    /**
     * Get Reversal ID. ID of document reversal
     */
    int getReversal_ID();

    /**
     * Set Reversal ID. ID of document reversal
     */
    void setReversal_ID(int Reversal_ID);

}
