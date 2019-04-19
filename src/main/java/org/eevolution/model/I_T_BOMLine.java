package org.eevolution.model;

import org.compiere.model.AccountingSchema;
import org.compiere.model.ProcessInstance;
import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for T_BOMLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_T_BOMLine {

    /**
     * TableName=T_BOMLine
     */
    String Table_Name = "T_BOMLine";

    /**
     * AD_Table_ID=53045
     */
    int Table_ID = 53045;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


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
     * Column name CostingMethod
     */
    String COLUMNNAME_CostingMethod = "CostingMethod";
    /**
     * Column name CostStandard
     */
    String COLUMNNAME_CostStandard = "CostStandard";
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
     * Column name Implosion
     */
    String COLUMNNAME_Implosion = "Implosion";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsCostFrozen
     */
    String COLUMNNAME_IsCostFrozen = "IsCostFrozen";
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
     * Column name M_CostType_ID
     */
    String COLUMNNAME_M_CostType_ID = "M_CostType_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name PP_Product_BOM_ID
     */
    String COLUMNNAME_PP_Product_BOM_ID = "PP_Product_BOM_ID";
    /**
     * Column name PP_Product_BOMLine_ID
     */
    String COLUMNNAME_PP_Product_BOMLine_ID = "PP_Product_BOMLine_ID";
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
     * Column name T_BOMLine_ID
     */
    String COLUMNNAME_T_BOMLine_ID = "T_BOMLine_ID";
    /**
     * Column name T_BOMLine_UU
     */
    String COLUMNNAME_T_BOMLine_UU = "T_BOMLine_UU";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int AD_Org_ID);

    /**
     * Get Process Instance. Instance of the process
     */
    int getProcessInstanceId();

    /**
     * Set Process Instance. Instance of the process
     */
    void setProcessInstanceId(int AD_PInstance_ID);

    ProcessInstance getProcessInstance() throws RuntimeException;

    /**
     * Get Accounting Schema. Rules for accounting
     */
    int getAccountingSchemaId();

    /**
     * Set Accounting Schema. Rules for accounting
     */
    void setAccountingSchemaId(int C_AcctSchema_ID);

    AccountingSchema getAccountingSchema() throws RuntimeException;

    /**
     * Get Cost. Cost information
     */
    BigDecimal getCost();

    /**
     * Set Cost. Cost information
     */
    void setCost(BigDecimal Cost);

    /**
     * Get Costing Method. Indicates how Costs will be calculated
     */
    String getCostingMethod();

    /**
     * Set Costing Method. Indicates how Costs will be calculated
     */
    void setCostingMethod(String CostingMethod);

    /**
     * Get Standard Cost. Standard Costs
     */
    BigDecimal getCostStandard();

    /**
     * Set Standard Cost. Standard Costs
     */
    void setCostStandard(BigDecimal CostStandard);

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
     * Get Implosion. Implosion of a Bill of Materials refers to finding all the BOM''s in which a
     * component is used.
     */
    boolean isImplosion();

    /**
     * Set Implosion. Implosion of a Bill of Materials refers to finding all the BOM''s in which a
     * component is used.
     */
    void setImplosion(boolean Implosion);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Cost Frozen. Indicated that the Standard Cost is frozen
     */
    void setIsCostFrozen(boolean IsCostFrozen);

    /**
     * Get Cost Frozen. Indicated that the Standard Cost is frozen
     */
    boolean isCostFrozen();

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
    int getCostElementId();

    /**
     * Set Cost Element. Product Cost Element
     */
    void setCostElementId(int M_CostElement_ID);

    org.compiere.model.I_M_CostElement getCostElement() throws RuntimeException;

    /**
     * Get Cost Type. Type of Cost (e.g. Current, Plan, Future)
     */
    int getCostTypeId();

    /**
     * Set Cost Type. Type of Cost (e.g. Current, Plan, Future)
     */
    void setCostTypeId(int M_CostType_ID);

    org.compiere.model.I_M_CostType getCostType() throws RuntimeException;

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

    org.compiere.model.I_M_Product getProduct() throws RuntimeException;

    /**
     * Get BOM & Formula. BOM & Formula
     */
    int getProductBOMId();

    /**
     * Set BOM & Formula. BOM & Formula
     */
    void setProductBOMId(int PP_Product_BOM_ID);

    org.eevolution.model.I_PP_Product_BOM getProductBOM() throws RuntimeException;

    /**
     * Get BOM Line. BOM Line
     */
    int getProductBOMLineId();

    /**
     * Set BOM Line. BOM Line
     */
    void setProductBOMLineId(int PP_Product_BOMLine_ID);

    org.eevolution.model.I_PP_Product_BOMLine getProductBOMLine() throws RuntimeException;

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
    int getSelectedProductId();

    /**
     * Set Selected Product
     */
    void setSelectedProductId(int Sel_Product_ID);

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

    /**
     * Get Temporal BOM Line
     */
    int getTemporalBOMLineId();

    /**
     * Set Temporal BOM Line
     */
    void setTemporalBOMLineId(int T_BOMLine_ID);


    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
