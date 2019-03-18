package org.eevolution.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for PP_Product_Planning
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_PP_Product_Planning {

    /**
     * TableName=PP_Product_Planning
     */
    String Table_Name = "PP_Product_Planning";

    /**
     * AD_Table_ID=53020
     */
    int Table_ID = 53020;

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
     * Column name AD_Workflow_ID
     */
    String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DD_NetworkDistribution_ID
     */
    String COLUMNNAME_DD_NetworkDistribution_ID = "DD_NetworkDistribution_ID";
    /**
     * Column name DeliveryTime_Promised
     */
    String COLUMNNAME_DeliveryTime_Promised = "DeliveryTime_Promised";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsCreatePlan
     */
    String COLUMNNAME_IsCreatePlan = "IsCreatePlan";
    /**
     * Column name IsMPS
     */
    String COLUMNNAME_IsMPS = "IsMPS";
    /**
     * Column name IsPhantom
     */
    String COLUMNNAME_IsPhantom = "IsPhantom";
    /**
     * Column name IsRequiredDRP
     */
    String COLUMNNAME_IsRequiredDRP = "IsRequiredDRP";
    /**
     * Column name IsRequiredMRP
     */
    String COLUMNNAME_IsRequiredMRP = "IsRequiredMRP";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_Warehouse_ID
     */
    String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
    /**
     * Column name Order_Max
     */
    String COLUMNNAME_Order_Max = "Order_Max";
    /**
     * Column name Order_Min
     */
    String COLUMNNAME_Order_Min = "Order_Min";
    /**
     * Column name Order_Pack
     */
    String COLUMNNAME_Order_Pack = "Order_Pack";
    /**
     * Column name Order_Period
     */
    String COLUMNNAME_Order_Period = "Order_Period";
    /**
     * Column name Order_Policy
     */
    String COLUMNNAME_Order_Policy = "Order_Policy";
    /**
     * Column name Order_Qty
     */
    String COLUMNNAME_Order_Qty = "Order_Qty";
    /**
     * Column name Planner_ID
     */
    String COLUMNNAME_Planner_ID = "Planner_ID";
    /**
     * Column name PP_Product_BOM_ID
     */
    String COLUMNNAME_PP_Product_BOM_ID = "PP_Product_BOM_ID";
    /**
     * Column name PP_Product_Planning_ID
     */
    String COLUMNNAME_PP_Product_Planning_ID = "PP_Product_Planning_ID";
    /**
     * Column name PP_Product_Planning_UU
     */
    String COLUMNNAME_PP_Product_Planning_UU = "PP_Product_Planning_UU";
    /**
     * Column name SafetyStock
     */
    String COLUMNNAME_SafetyStock = "SafetyStock";
    /**
     * Column name S_Resource_ID
     */
    String COLUMNNAME_S_Resource_ID = "S_Resource_ID";
    /**
     * Column name TimeFence
     */
    String COLUMNNAME_TimeFence = "TimeFence";
    /**
     * Column name TransfertTime
     */
    String COLUMNNAME_TransfertTime = "TransfertTime";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name WorkingTime
     */
    String COLUMNNAME_WorkingTime = "WorkingTime";
    /**
     * Column name Yield
     */
    String COLUMNNAME_Yield = "Yield";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int AD_Org_ID);

    /**
     * Get Workflow. Workflow or combination of tasks
     */
    int getWorkflowId();

    /**
     * Set Workflow. Workflow or combination of tasks
     */
    void setWorkflowId(int AD_Workflow_ID);

    org.compiere.model.I_AD_Workflow getWorkflow() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Network Distribution
     */
    int getDD_NetworkDistributionId();

    /**
     * Set Network Distribution
     */
    void setDD_NetworkDistributionId(int DD_NetworkDistribution_ID);

    org.eevolution.model.I_DD_NetworkDistribution getDD_NetworkDistribution()
            throws RuntimeException;

    /**
     * Get Promised Delivery Time. Promised days between order and delivery
     */
    BigDecimal getDeliveryTime_Promised();

    /**
     * Set Promised Delivery Time. Promised days between order and delivery
     */
    void setDeliveryTime_Promised(BigDecimal DeliveryTime_Promised);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Create Plan. Indicates whether planned orders will be generated by MRP
     */
    void setIsCreatePlan(boolean IsCreatePlan);

    /**
     * Get Create Plan. Indicates whether planned orders will be generated by MRP
     */
    boolean isCreatePlan();

    /**
     * Set Is MPS
     */
    void setIsMPS(boolean IsMPS);

    /**
     * Get Is MPS
     */
    boolean isMPS();

    /**
     * Set Phantom. Phantom Component
     */
    void setIsPhantom(boolean IsPhantom);

    /**
     * Get Phantom. Phantom Component
     */
    boolean isPhantom();

    /**
     * Set Required Calculate DRP
     */
    void setIsRequiredDRP(boolean IsRequiredDRP);

    /**
     * Get Required Calculate DRP
     */
    boolean isRequiredDRP();

    /**
     * Set Required Calculate MRP
     */
    void setIsRequiredMRP(boolean IsRequiredMRP);

    /**
     * Get Required Calculate MRP
     */
    boolean isRequiredMRP();

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
     * Get Warehouse. Storage Warehouse and Service Point
     */
    int getWarehouseId();

    /**
     * Set Warehouse. Storage Warehouse and Service Point
     */
    void setWarehouseId(int M_Warehouse_ID);

    org.compiere.model.I_M_Warehouse getWarehouse() throws RuntimeException;

    /**
     * Get Maximum Order Qty. Maximum order quantity in UOM
     */
    BigDecimal getOrderMax();

    /**
     * Set Maximum Order Qty. Maximum order quantity in UOM
     */
    void setOrderMax(BigDecimal Order_Max);

    /**
     * Get Minimum Order Qty. Minimum order quantity in UOM
     */
    BigDecimal getOrderMin();

    /**
     * Set Minimum Order Qty. Minimum order quantity in UOM
     */
    void setOrderMin(BigDecimal Order_Min);

    /**
     * Get Order Pack Qty. Package order size in UOM (e.g. order set of 5 units)
     */
    BigDecimal getOrderPack();

    /**
     * Set Order Pack Qty. Package order size in UOM (e.g. order set of 5 units)
     */
    void setOrderPack(BigDecimal Order_Pack);

    /**
     * Get Order Period
     */
    BigDecimal getOrderPeriod();

    /**
     * Set Order Period
     */
    void setOrderPeriod(BigDecimal Order_Period);

    /**
     * Get Order Policy
     */
    String getOrderPolicy();

    /**
     * Set Order Policy
     */
    void setOrderPolicy(String Order_Policy);

    /**
     * Get Order Qty
     */
    BigDecimal getOrderQty();

    /**
     * Set Order Qty
     */
    void setOrderQty(BigDecimal Order_Qty);

    /**
     * Get Planner
     */
    int getPlannerId();

    /**
     * Set Planner
     */
    void setPlannerId(int Planner_ID);

    org.compiere.model.I_AD_User getPlanner() throws RuntimeException;

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
     * Get Product Planning
     */
    int getProduct_PlanningId();

    /**
     * Set Product Planning
     */
    void setProduct_PlanningId(int PP_Product_Planning_ID);

    /**
     * Get PP_Product_Planning_UU
     */
    String getProduct_Planning_UU();

    /**
     * Set PP_Product_Planning_UU
     */
    void setProduct_Planning_UU(String PP_Product_Planning_UU);

    /**
     * Get Safety Stock Qty. Safety stock is a term used to describe a level of stock that is
     * maintained below the cycle stock to buffer against stock-outs
     */
    BigDecimal getSafetyStock();

    /**
     * Set Safety Stock Qty. Safety stock is a term used to describe a level of stock that is
     * maintained below the cycle stock to buffer against stock-outs
     */
    void setSafetyStock(BigDecimal SafetyStock);

    /**
     * Get Resource. Resource
     */
    int getResourceID();

    /**
     * Set Resource. Resource
     */
    void setResourceID(int S_Resource_ID);

    org.compiere.model.I_S_Resource getResource() throws RuntimeException;

    /**
     * Get Time Fence
     */
    BigDecimal getTimeFence();

    /**
     * Set Time Fence
     */
    void setTimeFence(BigDecimal TimeFence);

    /**
     * Get Transfert Time
     */
    BigDecimal getTransfertTime();

    /**
     * Set Transfert Time
     */
    void setTransfertTime(BigDecimal TransfertTime);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Working Time. Workflow Simulation Execution Time
     */
    BigDecimal getWorkingTime();

    /**
     * Set Working Time. Workflow Simulation Execution Time
     */
    void setWorkingTime(BigDecimal WorkingTime);

    /**
     * Get Yield %. The Yield is the percentage of a lot that is expected to be of acceptable wuality
     * may fall below 100 percent
     */
    int getYield();

    /**
     * Set Yield %. The Yield is the percentage of a lot that is expected to be of acceptable wuality
     * may fall below 100 percent
     */
    void setYield(int Yield);
}
