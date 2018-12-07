package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

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

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
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
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
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
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
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
     * Get Process Instance. Instance of the process
     */
    int getAD_PInstance_ID();

    /**
     * Set Process Instance. Instance of the process
     */
    void setAD_PInstance_ID(int AD_PInstance_ID);

    I_AD_PInstance getAD_PInstance() throws RuntimeException;

    /**
     * Get Accounting Schema. Rules for accounting
     */
    int getC_AcctSchema_ID();

    /**
     * Set Accounting Schema. Rules for accounting
     */
    void setC_AcctSchema_ID(int C_AcctSchema_ID);

    I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

    /**
     * Get Cost. Cost information
     */
    BigDecimal getCost();

    /**
     * Set Cost. Cost information
     */
    void setCost(BigDecimal Cost);

    /**
     * Get Future Cost. Cost information
     */
    BigDecimal getCostFuture();

    /**
     * Set Future Cost. Cost information
     */
    void setCostFuture(BigDecimal CostFuture);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Current Cost Price. The currently used cost price
     */
    BigDecimal getCurrentCostPrice();

    /**
     * Set Current Cost Price. The currently used cost price
     */
    void setCurrentCostPrice(BigDecimal CurrentCostPrice);

    /**
     * Get Current Cost Price Lower Level. Current Price Lower Level Is the sum of the costs of the
     * components of this product manufactured for this level.
     */
    BigDecimal getCurrentCostPriceLL();

    /**
     * Set Current Cost Price Lower Level. Current Price Lower Level Is the sum of the costs of the
     * components of this product manufactured for this level.
     */
    void setCurrentCostPriceLL(BigDecimal CurrentCostPriceLL);

    /**
     * Get Future Cost Price
     */
    BigDecimal getFutureCostPrice();

    /**
     * Set Future Cost Price
     */
    void setFutureCostPrice(BigDecimal FutureCostPrice);

    /**
     * Get Future Cost Price Lower Level
     */
    BigDecimal getFutureCostPriceLL();

    /**
     * Set Future Cost Price Lower Level
     */
    void setFutureCostPriceLL(BigDecimal FutureCostPriceLL);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Level no
     */
    int getLevelNo();

    /**
     * Set Level no
     */
    void setLevelNo(int LevelNo);

    /**
     * Get Levels
     */
    String getLevels();

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

    I_M_CostElement getM_CostElement() throws RuntimeException;

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
     * Get Quantity. Quantity
     */
    BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    void setQty(BigDecimal Qty);

    /**
     * Get Quantity. Indicate the Quantity use in this BOM
     */
    BigDecimal getQtyBOM();

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

    I_M_Product getSel_Product() throws RuntimeException;

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

    /**
     * Get Indented BOM Report
     */
    int getT_BOM_Indented_ID();

    /**
     * Set Indented BOM Report
     */
    void setT_BOM_Indented_ID(int T_BOM_Indented_ID);

    /**
     * Get T_BOM_Indented_UU
     */
    String getT_BOM_Indented_UU();

    /**
     * Set T_BOM_Indented_UU
     */
    void setT_BOM_Indented_UU(String T_BOM_Indented_UU);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
