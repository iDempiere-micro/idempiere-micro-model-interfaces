package org.eevolution.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.compiere.model.*;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for I_ProductPlanning
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_I_ProductPlanning {

    /**
     * TableName=I_ProductPlanning
     */
    public static final String Table_Name = "I_ProductPlanning";

    /**
     * AD_Table_ID=53260
     */
    public static final int Table_ID = 53260;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Workflow_ID
     */
    public static final String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
    /**
     * Column name BPartner_Value
     */
    public static final String COLUMNNAME_BPartner_Value = "BPartner_Value";
    /**
     * Column name C_BPartner_ID
     */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name Created
     */
    public static final String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DatePromised
     */
    public static final String COLUMNNAME_DatePromised = "DatePromised";
    /**
     * Column name DD_NetworkDistribution_ID
     */
    public static final String COLUMNNAME_DD_NetworkDistribution_ID = "DD_NetworkDistribution_ID";
    /**
     * Column name DeliveryTime_Promised
     */
    public static final String COLUMNNAME_DeliveryTime_Promised = "DeliveryTime_Promised";
    /**
     * Column name ForecastValue
     */
    public static final String COLUMNNAME_ForecastValue = "ForecastValue";
    /**
     * Column name I_ErrorMsg
     */
    public static final String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
    /**
     * Column name I_IsImported
     */
    public static final String COLUMNNAME_I_IsImported = "I_IsImported";
    /**
     * Column name I_ProductPlanning_ID
     */
    public static final String COLUMNNAME_I_ProductPlanning_ID = "I_ProductPlanning_ID";
    /**
     * Column name I_ProductPlanning_UU
     */
    public static final String COLUMNNAME_I_ProductPlanning_UU = "I_ProductPlanning_UU";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsCreatePlan
     */
    public static final String COLUMNNAME_IsCreatePlan = "IsCreatePlan";
    /**
     * Column name IsMPS
     */
    public static final String COLUMNNAME_IsMPS = "IsMPS";
    /**
     * Column name IsPhantom
     */
    public static final String COLUMNNAME_IsPhantom = "IsPhantom";
    /**
     * Column name M_Forecast_ID
     */
    public static final String COLUMNNAME_M_Forecast_ID = "M_Forecast_ID";
    /**
     * Column name M_ForecastLine_ID
     */
    public static final String COLUMNNAME_M_ForecastLine_ID = "M_ForecastLine_ID";
    /**
     * Column name M_Product_ID
     */
    public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_Warehouse_ID
     */
    public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
    /**
     * Column name NetworkDistributionValue
     */
    public static final String COLUMNNAME_NetworkDistributionValue = "NetworkDistributionValue";
    /**
     * Column name Order_Max
     */
    public static final String COLUMNNAME_Order_Max = "Order_Max";
    /**
     * Column name Order_Min
     */
    public static final String COLUMNNAME_Order_Min = "Order_Min";
    /**
     * Column name Order_Pack
     */
    public static final String COLUMNNAME_Order_Pack = "Order_Pack";
    /**
     * Column name Order_Period
     */
    public static final String COLUMNNAME_Order_Period = "Order_Period";
    /**
     * Column name Order_Policy
     */
    public static final String COLUMNNAME_Order_Policy = "Order_Policy";
    /**
     * Column name Order_Qty
     */
    public static final String COLUMNNAME_Order_Qty = "Order_Qty";
    /**
     * Column name OrgValue
     */
    public static final String COLUMNNAME_OrgValue = "OrgValue";
    /**
     * Column name Planner_ID
     */
    public static final String COLUMNNAME_Planner_ID = "Planner_ID";
    /**
     * Column name PlannerValue
     */
    public static final String COLUMNNAME_PlannerValue = "PlannerValue";
    /**
     * Column name PP_Product_BOM_ID
     */
    public static final String COLUMNNAME_PP_Product_BOM_ID = "PP_Product_BOM_ID";
    /**
     * Column name PP_Product_Planning_ID
     */
    public static final String COLUMNNAME_PP_Product_Planning_ID = "PP_Product_Planning_ID";
    /**
     * Column name Processed
     */
    public static final String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    public static final String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Product_BOM_Value
     */
    public static final String COLUMNNAME_Product_BOM_Value = "Product_BOM_Value";
    /**
     * Column name ProductValue
     */
    public static final String COLUMNNAME_ProductValue = "ProductValue";
    /**
     * Column name Qty
     */
    public static final String COLUMNNAME_Qty = "Qty";
    /**
     * Column name ResourceValue
     */
    public static final String COLUMNNAME_ResourceValue = "ResourceValue";
    /**
     * Column name SafetyStock
     */
    public static final String COLUMNNAME_SafetyStock = "SafetyStock";
    /**
     * Column name SalesRep_ID
     */
    public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
    /**
     * Column name S_Resource_ID
     */
    public static final String COLUMNNAME_S_Resource_ID = "S_Resource_ID";
    /**
     * Column name TimeFence
     */
    public static final String COLUMNNAME_TimeFence = "TimeFence";
    /**
     * Column name TransfertTime
     */
    public static final String COLUMNNAME_TransfertTime = "TransfertTime";
    /**
     * Column name Updated
     */
    public static final String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name VendorProductNo
     */
    public static final String COLUMNNAME_VendorProductNo = "VendorProductNo";
    /**
     * Column name WarehouseValue
     */
    public static final String COLUMNNAME_WarehouseValue = "WarehouseValue";
    /**
     * Column name WorkingTime
     */
    public static final String COLUMNNAME_WorkingTime = "WorkingTime";
    /**
     * Column name Yield
     */
    public static final String COLUMNNAME_Yield = "Yield";

    /**
     * Set Organization. Organizational entity within client
     */
    public void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    public int getOrgId();

    /**
     * Get Workflow. Workflow or combination of tasks
     */
    public int getAD_Workflow_ID();

    /**
     * Set Workflow. Workflow or combination of tasks
     */
    public void setAD_Workflow_ID(int AD_Workflow_ID);

    public org.compiere.model.I_AD_Workflow getAD_Workflow() throws RuntimeException;

    /**
     * Get Business Partner Key. The Key of the Business Partner
     */
    public String getBPartner_Value();

    /**
     * Set Business Partner Key. The Key of the Business Partner
     */
    public void setBPartner_Value(String BPartner_Value);

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    public int getC_BPartner_ID();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    public void setC_BPartner_ID(int C_BPartner_ID);

    public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    public Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    public int getCreatedBy();

    /**
     * Get Date Promised. Date Order was promised
     */
    public Timestamp getDatePromised();

    /**
     * Set Date Promised. Date Order was promised
     */
    public void setDatePromised(Timestamp DatePromised);

    /**
     * Get Network Distribution
     */
    public int getDD_NetworkDistribution_ID();

    /**
     * Set Network Distribution
     */
    public void setDD_NetworkDistribution_ID(int DD_NetworkDistribution_ID);

    public org.eevolution.model.I_DD_NetworkDistribution getDD_NetworkDistribution()
            throws RuntimeException;

    /**
     * Get Promised Delivery Time. Promised days between order and delivery
     */
    public BigDecimal getDeliveryTime_Promised();

    /**
     * Set Promised Delivery Time. Promised days between order and delivery
     */
    public void setDeliveryTime_Promised(BigDecimal DeliveryTime_Promised);

    /**
     * Get Forecast Key. Key of the Forecast
     */
    public String getForecastValue();

    /**
     * Set Forecast Key. Key of the Forecast
     */
    public void setForecastValue(String ForecastValue);

    /**
     * Get Import Error Message. Messages generated from import process
     */
    public String getI_ErrorMsg();

    /**
     * Set Import Error Message. Messages generated from import process
     */
    public void setI_ErrorMsg(String I_ErrorMsg);

    /**
     * Get Imported. Has this import been processed
     */
    public boolean isI_IsImported();

    /**
     * Set Imported. Has this import been processed
     */
    public void setI_IsImported(boolean I_IsImported);

    /**
     * Get Import Product Planning
     */
    public int getI_ProductPlanning_ID();

    /**
     * Set Import Product Planning
     */
    public void setI_ProductPlanning_ID(int I_ProductPlanning_ID);

    /**
     * Get I_ProductPlanning_UU
     */
    public String getI_ProductPlanning_UU();

    /**
     * Set I_ProductPlanning_UU
     */
    public void setI_ProductPlanning_UU(String I_ProductPlanning_UU);

    /**
     * Set Active. The record is active in the system
     */
    public void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    public boolean isActive();

    /**
     * Set Create Plan. Indicates whether planned orders will be generated by MRP
     */
    public void setIsCreatePlan(boolean IsCreatePlan);

    /**
     * Get Create Plan. Indicates whether planned orders will be generated by MRP
     */
    public boolean isCreatePlan();

    /**
     * Set Is MPS
     */
    public void setIsMPS(boolean IsMPS);

    /**
     * Get Is MPS
     */
    public boolean isMPS();

    /**
     * Set Phantom. Phantom Component
     */
    public void setIsPhantom(boolean IsPhantom);

    /**
     * Get Phantom. Phantom Component
     */
    public boolean isPhantom();

    /**
     * Get Forecast. Material Forecast
     */
    public int getM_Forecast_ID();

    /**
     * Set Forecast. Material Forecast
     */
    public void setM_Forecast_ID(int M_Forecast_ID);

    public org.compiere.model.I_M_Forecast getM_Forecast() throws RuntimeException;

    /**
     * Get Forecast Line. Forecast Line
     */
    public int getM_ForecastLine_ID();

    /**
     * Set Forecast Line. Forecast Line
     */
    public void setM_ForecastLine_ID(int M_ForecastLine_ID);

    public org.compiere.model.I_M_ForecastLine getM_ForecastLine() throws RuntimeException;

    /**
     * Get Product. Product, Service, Item
     */
    public int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    public void setM_Product_ID(int M_Product_ID);

    public org.compiere.model.I_M_Product getM_Product() throws RuntimeException;

    /**
     * Get Warehouse. Storage Warehouse and Service Point
     */
    public int getM_Warehouse_ID();

    /**
     * Set Warehouse. Storage Warehouse and Service Point
     */
    public void setM_Warehouse_ID(int M_Warehouse_ID);

    public org.compiere.model.I_M_Warehouse getM_Warehouse() throws RuntimeException;

    /**
     * Get Network Distribution Key. Key of the Network Distribution
     */
    public String getNetworkDistributionValue();

    /**
     * Set Network Distribution Key. Key of the Network Distribution
     */
    public void setNetworkDistributionValue(String NetworkDistributionValue);

    /**
     * Get Maximum Order Qty. Maximum order quantity in UOM
     */
    public BigDecimal getOrder_Max();

    /**
     * Set Maximum Order Qty. Maximum order quantity in UOM
     */
    public void setOrder_Max(BigDecimal Order_Max);

    /**
     * Get Minimum Order Qty. Minimum order quantity in UOM
     */
    public BigDecimal getOrder_Min();

    /**
     * Set Minimum Order Qty. Minimum order quantity in UOM
     */
    public void setOrder_Min(BigDecimal Order_Min);

    /**
     * Get Order Pack Qty. Package order size in UOM (e.g. order set of 5 units)
     */
    public BigDecimal getOrder_Pack();

    /**
     * Set Order Pack Qty. Package order size in UOM (e.g. order set of 5 units)
     */
    public void setOrder_Pack(BigDecimal Order_Pack);

    /**
     * Get Order Period
     */
    public BigDecimal getOrder_Period();

    /**
     * Set Order Period
     */
    public void setOrder_Period(BigDecimal Order_Period);

    /**
     * Get Order Policy
     */
    public String getOrder_Policy();

    /**
     * Set Order Policy
     */
    public void setOrder_Policy(String Order_Policy);

    /**
     * Get Order Qty
     */
    public BigDecimal getOrder_Qty();

    /**
     * Set Order Qty
     */
    public void setOrder_Qty(BigDecimal Order_Qty);

    /**
     * Get Org Key. Key of the Organization
     */
    public String getOrgValue();

    /**
     * Set Org Key. Key of the Organization
     */
    public void setOrgValue(String OrgValue);

    /**
     * Get Planner
     */
    public int getPlanner_ID();

    /**
     * Set Planner
     */
    public void setPlanner_ID(int Planner_ID);

    public org.compiere.model.I_AD_User getPlanner() throws RuntimeException;

    /**
     * Get Planner Key. Search Key of the Planning
     */
    public String getPlannerValue();

    /**
     * Set Planner Key. Search Key of the Planning
     */
    public void setPlannerValue(String PlannerValue);

    /**
     * Get BOM & Formula. BOM & Formula
     */
    public int getPP_Product_BOM_ID();

    /**
     * Set BOM & Formula. BOM & Formula
     */
    public void setPP_Product_BOM_ID(int PP_Product_BOM_ID);

    public org.eevolution.model.I_PP_Product_BOM getPP_Product_BOM() throws RuntimeException;

    /**
     * Get Product Planning
     */
    public int getPP_Product_Planning_ID();

    /**
     * Set Product Planning
     */
    public void setPP_Product_Planning_ID(int PP_Product_Planning_ID);

    public org.eevolution.model.I_PP_Product_Planning getPP_Product_Planning()
            throws RuntimeException;

    /**
     * Get Processed. The document has been processed
     */
    public boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    public void setProcessed(boolean Processed);

    /**
     * Get Process Now
     */
    public boolean isProcessing();

    /**
     * Set Process Now
     */
    public void setProcessing(boolean Processing);

    /**
     * Get Product BOM Key. Key of Product BOM
     */
    public String getProduct_BOM_Value();

    /**
     * Set Product BOM Key. Key of Product BOM
     */
    public void setProduct_BOM_Value(String Product_BOM_Value);

    /**
     * Get Product Key. Key of the Product
     */
    public String getProductValue();

    /**
     * Set Product Key. Key of the Product
     */
    public void setProductValue(String ProductValue);

    /**
     * Get Quantity. Quantity
     */
    public BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    public void setQty(BigDecimal Qty);

    /**
     * Get Resource Key. Key of the Resource
     */
    public String getResourceValue();

    /**
     * Set Resource Key. Key of the Resource
     */
    public void setResourceValue(String ResourceValue);

    /**
     * Get Safety Stock Qty. Safety stock is a term used to describe a level of stock that is
     * maintained below the cycle stock to buffer against stock-outs
     */
    public BigDecimal getSafetyStock();

    /**
     * Set Safety Stock Qty. Safety stock is a term used to describe a level of stock that is
     * maintained below the cycle stock to buffer against stock-outs
     */
    public void setSafetyStock(BigDecimal SafetyStock);

    /**
     * Get Sales Representative. Sales Representative or Company Agent
     */
    public int getSalesRep_ID();

    /**
     * Set Sales Representative. Sales Representative or Company Agent
     */
    public void setSalesRep_ID(int SalesRep_ID);

    public org.compiere.model.I_AD_User getSalesRep() throws RuntimeException;

    /**
     * Get Resource. Resource
     */
    public int getS_Resource_ID();

    /**
     * Set Resource. Resource
     */
    public void setS_Resource_ID(int S_Resource_ID);

    public org.compiere.model.I_S_Resource getS_Resource() throws RuntimeException;

    /**
     * Get Time Fence
     */
    public BigDecimal getTimeFence();

    /**
     * Set Time Fence
     */
    public void setTimeFence(BigDecimal TimeFence);

    /**
     * Get Transfert Time
     */
    public BigDecimal getTransfertTime();

    /**
     * Set Transfert Time
     */
    public void setTransfertTime(BigDecimal TransfertTime);

    /**
     * Get Updated. Date this record was updated
     */
    public Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    public int getUpdatedBy();

    /**
     * Get Partner Product Key. Product Key of the Business Partner
     */
    public String getVendorProductNo();

    /**
     * Set Partner Product Key. Product Key of the Business Partner
     */
    public void setVendorProductNo(String VendorProductNo);

    /**
     * Get Warehouse Key. Key of the Warehouse
     */
    public String getWarehouseValue();

    /**
     * Set Warehouse Key. Key of the Warehouse
     */
    public void setWarehouseValue(String WarehouseValue);

    /**
     * Get Working Time. Workflow Simulation Execution Time
     */
    public BigDecimal getWorkingTime();

    /**
     * Set Working Time. Workflow Simulation Execution Time
     */
    public void setWorkingTime(BigDecimal WorkingTime);

    /**
     * Get Yield %. The Yield is the percentage of a lot that is expected to be of acceptable wuality
     * may fall below 100 percent
     */
    public int getYield();

    /**
     * Set Yield %. The Yield is the percentage of a lot that is expected to be of acceptable wuality
     * may fall below 100 percent
     */
    public void setYield(int Yield);
}
