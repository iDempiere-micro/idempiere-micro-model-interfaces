package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for T_BOM_Indented
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_T_BOM_Indented {

    /**
     * AD_Table_ID=53335
     */
    int Table_ID = 53335;

    /**
     * TableName=T_BOM_Indented
     */
    String Table_Name = "T_BOM_Indented";

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name AD_PInstance_ID
     */
    String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
    /**
     * Column name C_AcctSchema_ID
     */
    String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /**
     * Column name Cost
     */
    String COLUMNNAME_Cost = "Cost";
    /**
     * Column name CostFuture
     */
    String COLUMNNAME_CostFuture = "CostFuture";
    /**
     * Column name CurrentCostPrice
     */
    String COLUMNNAME_CurrentCostPrice = "CurrentCostPrice";
    /**
     * Column name CurrentCostPriceLL
     */
    String COLUMNNAME_CurrentCostPriceLL = "CurrentCostPriceLL";
    /**
     * Column name FutureCostPrice
     */
    String COLUMNNAME_FutureCostPrice = "FutureCostPrice";
    /**
     * Column name FutureCostPriceLL
     */
    String COLUMNNAME_FutureCostPriceLL = "FutureCostPriceLL";
    /**
     * Column name LevelNo
     */
    String COLUMNNAME_LevelNo = "LevelNo";
    /**
     * Column name Levels
     */
    String COLUMNNAME_Levels = "Levels";
    /**
     * Column name M_CostElement_ID
     */
    String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";
    /**
     * Column name QtyBOM
     */
    String COLUMNNAME_QtyBOM = "QtyBOM";
    /**
     * Column name Sel_Product_ID
     */
    String COLUMNNAME_Sel_Product_ID = "Sel_Product_ID";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";

    /**
     * Set Process Instance. Instance of the process
     */
    void setPInstanceId(int AD_PInstance_ID);

    /**
     * Set Accounting Schema. Rules for accounting
     */
    void setAcctSchemaId(int C_AcctSchema_ID);

    /**
     * Set Cost. Cost information
     */
    void setCost(BigDecimal Cost);

    /**
     * Set Future Cost. Cost information
     */
    void setCostFuture(BigDecimal CostFuture);

    /**
     * Set Current Cost Price. The currently used cost price
     */
    void setCurrentCostPrice(BigDecimal CurrentCostPrice);

    /**
     * Set Current Cost Price Lower Level. Current Price Lower Level Is the sum of the costs of the
     * components of this product manufactured for this level.
     */
    void setCurrentCostPriceLL(BigDecimal CurrentCostPriceLL);

    /**
     * Set Future Cost Price
     */
    void setFutureCostPrice(BigDecimal FutureCostPrice);

    /**
     * Set Future Cost Price Lower Level
     */
    void setFutureCostPriceLL(BigDecimal FutureCostPriceLL);

    /**
     * Set Level no
     */
    void setLevelNo(int LevelNo);

    /**
     * Set Levels
     */
    void setLevels(String Levels);

    /**
     * Set Cost Element. Product Cost Element
     */
    void setCostElementId(int M_CostElement_ID);

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

    /**
     * Set Quantity. Quantity
     */
    void setQty(BigDecimal Qty);

    /**
     * Set Quantity. Indicate the Quantity use in this BOM
     */
    void setQtyBOM(BigDecimal QtyBOM);

    /**
     * Set Selected Product
     */
    void setSelectedProductId(int Sel_Product_ID);

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

}
