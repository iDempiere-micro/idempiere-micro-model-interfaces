package org.eevolution.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for T_BOMLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_T_BOMLine {

    /**
     * TableName=T_BOMLine
     */
    public static final String Table_Name = "T_BOMLine";

    /**
     * AD_Table_ID=53045
     */
    public static final int Table_ID = 53045;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name AD_Org_ID
     */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_PInstance_ID
     */
    public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
    /**
     * Column name C_AcctSchema_ID
     */
    public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /**
     * Column name Cost
     */
    public static final String COLUMNNAME_Cost = "Cost";
    /**
     * Column name CostingMethod
     */
    public static final String COLUMNNAME_CostingMethod = "CostingMethod";
    /**
     * Column name CostStandard
     */
    public static final String COLUMNNAME_CostStandard = "CostStandard";
    /**
     * Column name Created
     */
    public static final String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name CurrentCostPrice
     */
    public static final String COLUMNNAME_CurrentCostPrice = "CurrentCostPrice";
    /**
     * Column name CurrentCostPriceLL
     */
    public static final String COLUMNNAME_CurrentCostPriceLL = "CurrentCostPriceLL";
    /**
     * Column name FutureCostPrice
     */
    public static final String COLUMNNAME_FutureCostPrice = "FutureCostPrice";
    /**
     * Column name FutureCostPriceLL
     */
    public static final String COLUMNNAME_FutureCostPriceLL = "FutureCostPriceLL";
    /**
     * Column name Implosion
     */
    public static final String COLUMNNAME_Implosion = "Implosion";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsCostFrozen
     */
    public static final String COLUMNNAME_IsCostFrozen = "IsCostFrozen";
    /**
     * Column name LevelNo
     */
    public static final String COLUMNNAME_LevelNo = "LevelNo";
    /**
     * Column name Levels
     */
    public static final String COLUMNNAME_Levels = "Levels";
    /**
     * Column name M_CostElement_ID
     */
    public static final String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
    /**
     * Column name M_CostType_ID
     */
    public static final String COLUMNNAME_M_CostType_ID = "M_CostType_ID";
    /**
     * Column name M_Product_ID
     */
    public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name PP_Product_BOM_ID
     */
    public static final String COLUMNNAME_PP_Product_BOM_ID = "PP_Product_BOM_ID";
    /**
     * Column name PP_Product_BOMLine_ID
     */
    public static final String COLUMNNAME_PP_Product_BOMLine_ID = "PP_Product_BOMLine_ID";
    /**
     * Column name QtyBOM
     */
    public static final String COLUMNNAME_QtyBOM = "QtyBOM";
    /**
     * Column name Sel_Product_ID
     */
    public static final String COLUMNNAME_Sel_Product_ID = "Sel_Product_ID";
    /**
     * Column name SeqNo
     */
    public static final String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name T_BOMLine_ID
     */
    public static final String COLUMNNAME_T_BOMLine_ID = "T_BOMLine_ID";
    /**
     * Column name T_BOMLine_UU
     */
    public static final String COLUMNNAME_T_BOMLine_UU = "T_BOMLine_UU";
    /**
     * Column name Updated
     */
    public static final String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Organization. Organizational entity within client
     */
    public int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    public void setOrgId(int AD_Org_ID);

    /**
     * Get Process Instance. Instance of the process
     */
    public int getAD_PInstanceId();

    /**
     * Set Process Instance. Instance of the process
     */
    public void setAD_PInstanceId(int AD_PInstance_ID);

    public org.compiere.model.I_AD_PInstance getAD_PInstance() throws RuntimeException;

    /**
     * Get Accounting Schema. Rules for accounting
     */
    public int getAccountingSchemaId();

    /**
     * Set Accounting Schema. Rules for accounting
     */
    public void setAccountingSchemaId(int C_AcctSchema_ID);

    public org.compiere.model.I_C_AcctSchema getAccountingSchema() throws RuntimeException;

    /**
     * Get Cost. Cost information
     */
    public BigDecimal getCost();

    /**
     * Set Cost. Cost information
     */
    public void setCost(BigDecimal Cost);

    /**
     * Get Costing Method. Indicates how Costs will be calculated
     */
    public String getCostingMethod();

    /**
     * Set Costing Method. Indicates how Costs will be calculated
     */
    public void setCostingMethod(String CostingMethod);

    /**
     * Get Standard Cost. Standard Costs
     */
    public BigDecimal getCostStandard();

    /**
     * Set Standard Cost. Standard Costs
     */
    public void setCostStandard(BigDecimal CostStandard);

    /**
     * Get Created. Date this record was created
     */
    public Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    public int getCreatedBy();

    /**
     * Get Current Cost Price. The currently used cost price
     */
    public BigDecimal getCurrentCostPrice();

    /**
     * Set Current Cost Price. The currently used cost price
     */
    public void setCurrentCostPrice(BigDecimal CurrentCostPrice);

    /**
     * Get Current Cost Price Lower Level. Current Price Lower Level Is the sum of the costs of the
     * components of this product manufactured for this level.
     */
    public BigDecimal getCurrentCostPriceLL();

    /**
     * Set Current Cost Price Lower Level. Current Price Lower Level Is the sum of the costs of the
     * components of this product manufactured for this level.
     */
    public void setCurrentCostPriceLL(BigDecimal CurrentCostPriceLL);

    /**
     * Get Future Cost Price
     */
    public BigDecimal getFutureCostPrice();

    /**
     * Set Future Cost Price
     */
    public void setFutureCostPrice(BigDecimal FutureCostPrice);

    /**
     * Get Future Cost Price Lower Level
     */
    public BigDecimal getFutureCostPriceLL();

    /**
     * Set Future Cost Price Lower Level
     */
    public void setFutureCostPriceLL(BigDecimal FutureCostPriceLL);

    /**
     * Get Implosion. Implosion of a Bill of Materials refers to finding all the BOM''s in which a
     * component is used.
     */
    public boolean isImplosion();

    /**
     * Set Implosion. Implosion of a Bill of Materials refers to finding all the BOM''s in which a
     * component is used.
     */
    public void setImplosion(boolean Implosion);

    /**
     * Set Active. The record is active in the system
     */
    public void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    public boolean isActive();

    /**
     * Set Cost Frozen. Indicated that the Standard Cost is frozen
     */
    public void setIsCostFrozen(boolean IsCostFrozen);

    /**
     * Get Cost Frozen. Indicated that the Standard Cost is frozen
     */
    public boolean isCostFrozen();

    /**
     * Get Level no
     */
    public int getLevelNo();

    /**
     * Set Level no
     */
    public void setLevelNo(int LevelNo);

    /**
     * Get Levels
     */
    public String getLevels();

    /**
     * Set Levels
     */
    public void setLevels(String Levels);

    /**
     * Get Cost Element. Product Cost Element
     */
    public int getCostElementId();

    /**
     * Set Cost Element. Product Cost Element
     */
    public void setCostElementId(int M_CostElement_ID);

    public org.compiere.model.I_M_CostElement getCostElement() throws RuntimeException;

    /**
     * Get Cost Type. Type of Cost (e.g. Current, Plan, Future)
     */
    public int getCostTypeId();

    /**
     * Set Cost Type. Type of Cost (e.g. Current, Plan, Future)
     */
    public void setCostTypeId(int M_CostType_ID);

    public org.compiere.model.I_M_CostType getCostType() throws RuntimeException;

    /**
     * Get Product. Product, Service, Item
     */
    public int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    public void setProductId(int M_Product_ID);

    public org.compiere.model.I_M_Product getProduct() throws RuntimeException;

    /**
     * Get BOM & Formula. BOM & Formula
     */
    public int getPP_Product_BOMId();

    /**
     * Set BOM & Formula. BOM & Formula
     */
    public void setPP_Product_BOMId(int PP_Product_BOM_ID);

    public org.eevolution.model.I_PP_Product_BOM getPP_Product_BOM() throws RuntimeException;

    /**
     * Get BOM Line. BOM Line
     */
    public int getPP_Product_BOMLineId();

    /**
     * Set BOM Line. BOM Line
     */
    public void setPP_Product_BOMLineId(int PP_Product_BOMLine_ID);

    public org.eevolution.model.I_PP_Product_BOMLine getPP_Product_BOMLine() throws RuntimeException;

    /**
     * Get Quantity. Indicate the Quantity use in this BOM
     */
    public BigDecimal getQtyBOM();

    /**
     * Set Quantity. Indicate the Quantity use in this BOM
     */
    public void setQtyBOM(BigDecimal QtyBOM);

    /**
     * Get Selected Product
     */
    public int getSel_ProductId();

    /**
     * Set Selected Product
     */
    public void setSelectedProductId(int Sel_Product_ID);

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    public int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    public void setSeqNo(int SeqNo);

    /**
     * Get Temporal BOM Line
     */
    public int getT_BOMLineId();

    /**
     * Set Temporal BOM Line
     */
    public void setT_BOMLineId(int T_BOMLine_ID);

    /**
     * Get T_BOMLine_UU
     */
    public String getT_BOMLine_UU();

    /**
     * Set T_BOMLine_UU
     */
    public void setT_BOMLine_UU(String T_BOMLine_UU);

    /**
     * Get Updated. Date this record was updated
     */
    public Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    public int getUpdatedBy();
}
