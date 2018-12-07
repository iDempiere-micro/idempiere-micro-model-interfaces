package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_RfQLineQty
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_RfQLineQty {

    /**
     * TableName=C_RfQLineQty
     */
    String Table_Name = "C_RfQLineQty";

    /**
     * AD_Table_ID=675
     */
    int Table_ID = 675;

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
     * Column name BenchmarkPrice
     */
    String COLUMNNAME_BenchmarkPrice = "BenchmarkPrice";
    /**
     * Column name BestResponseAmt
     */
    String COLUMNNAME_BestResponseAmt = "BestResponseAmt";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_RfQLine_ID
     */
    String COLUMNNAME_C_RfQLine_ID = "C_RfQLine_ID";
    /**
     * Column name C_RfQLineQty_ID
     */
    String COLUMNNAME_C_RfQLineQty_ID = "C_RfQLineQty_ID";
    /**
     * Column name C_RfQLineQty_UU
     */
    String COLUMNNAME_C_RfQLineQty_UU = "C_RfQLineQty_UU";
    /**
     * Column name C_UOM_ID
     */
    String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsOfferQty
     */
    String COLUMNNAME_IsOfferQty = "IsOfferQty";
    /**
     * Column name IsPurchaseQty
     */
    String COLUMNNAME_IsPurchaseQty = "IsPurchaseQty";
    /**
     * Column name IsRfQQty
     */
    String COLUMNNAME_IsRfQQty = "IsRfQQty";
    /**
     * Column name Margin
     */
    String COLUMNNAME_Margin = "Margin";
    /**
     * Column name OfferAmt
     */
    String COLUMNNAME_OfferAmt = "OfferAmt";
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
     * Get Benchmark Price. Price to compare responses to
     */
    BigDecimal getBenchmarkPrice();

    /**
     * Set Benchmark Price. Price to compare responses to
     */
    void setBenchmarkPrice(BigDecimal BenchmarkPrice);

    /**
     * Get Best Response Amount. Best Response Amount
     */
    BigDecimal getBestResponseAmt();

    /**
     * Set Best Response Amount. Best Response Amount
     */
    void setBestResponseAmt(BigDecimal BestResponseAmt);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get RfQ Line. Request for Quotation Line
     */
    int getC_RfQLine_ID();

    /**
     * Set RfQ Line. Request for Quotation Line
     */
    void setC_RfQLine_ID(int C_RfQLine_ID);

    I_C_RfQLine getC_RfQLine() throws RuntimeException;

    /**
     * Get RfQ Line Quantity. Request for Quotation Line Quantity
     */
    int getC_RfQLineQty_ID();

    /**
     * Set RfQ Line Quantity. Request for Quotation Line Quantity
     */
    void setC_RfQLineQty_ID(int C_RfQLineQty_ID);

    /**
     * Get C_RfQLineQty_UU
     */
    String getC_RfQLineQty_UU();

    /**
     * Set C_RfQLineQty_UU
     */
    void setC_RfQLineQty_UU(String C_RfQLineQty_UU);

    /**
     * Get UOM. Unit of Measure
     */
    int getC_UOM_ID();

    /**
     * Set UOM. Unit of Measure
     */
    void setC_UOM_ID(int C_UOM_ID);

    I_C_UOM getC_UOM() throws RuntimeException;

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Offer Quantity. This quantity is used in the Offer to the Customer
     */
    void setIsOfferQty(boolean IsOfferQty);

    /**
     * Get Offer Quantity. This quantity is used in the Offer to the Customer
     */
    boolean isOfferQty();

    /**
     * Set Purchase Quantity. This quantity is used in the Purchase Order to the Supplier
     */
    void setIsPurchaseQty(boolean IsPurchaseQty);

    /**
     * Get Purchase Quantity. This quantity is used in the Purchase Order to the Supplier
     */
    boolean isPurchaseQty();

    /**
     * Set RfQ Quantity. The quantity is used when generating RfQ Responses
     */
    void setIsRfQQty(boolean IsRfQQty);

    /**
     * Get RfQ Quantity. The quantity is used when generating RfQ Responses
     */
    boolean isRfQQty();

    /**
     * Get Margin %. Margin for a product as a percentage
     */
    BigDecimal getMargin();

    /**
     * Set Margin %. Margin for a product as a percentage
     */
    void setMargin(BigDecimal Margin);

    /**
     * Get Offer Amount. Amount of the Offer
     */
    BigDecimal getOfferAmt();

    /**
     * Set Offer Amount. Amount of the Offer
     */
    void setOfferAmt(BigDecimal OfferAmt);

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
