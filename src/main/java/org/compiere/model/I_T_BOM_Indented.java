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
     * TableName=T_BOM_Indented
     */
    String Table_Name = "T_BOM_Indented";

    /**
     * AD_Table_ID=53335
     */
    int Table_ID = 53335;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

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
     * Column name T_BOM_Indented_ID
     */
    String COLUMNNAME_T_BOM_Indented_ID = "T_BOM_Indented_ID";
    /**
     * Column name T_BOM_Indented_UU
     */
    String COLUMNNAME_T_BOM_Indented_UU = "T_BOM_Indented_UU";

    /**
     * Get Process Instance. Instance of the process
     */
    int getAD_PInstance_ID();

    /**
     * Set Process Instance. Instance of the process
     */
    void setAD_PInstance_ID(int AD_PInstance_ID);

    /**
     * Get Accounting Schema. Rules for accounting
     */
    int getC_AcctSchema_ID();

    /**
     * Set Accounting Schema. Rules for accounting
     */
    void setC_AcctSchema_ID(int C_AcctSchema_ID);

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
     * Get Cost Element. Product Cost Element
     */
    int getM_CostElement_ID();

    /**
     * Set Cost Element. Product Cost Element
     */
    void setM_CostElement_ID(int M_CostElement_ID);

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    void setM_Product_ID(int M_Product_ID);

    /**
     * Set Quantity. Quantity
     */
    void setQty(BigDecimal Qty);

    /**
     * Set Quantity. Indicate the Quantity use in this BOM
     */
    void setQtyBOM(BigDecimal QtyBOM);

    /**
     * Get Selected Product
     */
    int getSel_Product_ID();

    /**
     * Set Selected Product
     */
    void setSel_Product_ID(int Sel_Product_ID);

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

}
