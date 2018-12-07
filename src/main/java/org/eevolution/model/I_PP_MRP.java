package org.eevolution.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.compiere.model.*;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PP_MRP
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_PP_MRP {

    /**
     * TableName=PP_MRP
     */
    public static final String Table_Name = "PP_MRP";

    /**
     * AD_Table_ID=53043
     */
    public static final int Table_ID = 53043;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_BPartner_ID
     */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_Order_ID
     */
    public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name C_OrderLine_ID
     */
    public static final String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
    /**
     * Column name Created
     */
    public static final String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DateConfirm
     */
    public static final String COLUMNNAME_DateConfirm = "DateConfirm";
    /**
     * Column name DateFinishSchedule
     */
    public static final String COLUMNNAME_DateFinishSchedule = "DateFinishSchedule";
    /**
     * Column name DateOrdered
     */
    public static final String COLUMNNAME_DateOrdered = "DateOrdered";
    /**
     * Column name DatePromised
     */
    public static final String COLUMNNAME_DatePromised = "DatePromised";
    /**
     * Column name DateSimulation
     */
    public static final String COLUMNNAME_DateSimulation = "DateSimulation";
    /**
     * Column name DateStart
     */
    public static final String COLUMNNAME_DateStart = "DateStart";
    /**
     * Column name DateStartSchedule
     */
    public static final String COLUMNNAME_DateStartSchedule = "DateStartSchedule";
    /**
     * Column name DD_Order_ID
     */
    public static final String COLUMNNAME_DD_Order_ID = "DD_Order_ID";
    /**
     * Column name DD_OrderLine_ID
     */
    public static final String COLUMNNAME_DD_OrderLine_ID = "DD_OrderLine_ID";
    /**
     * Column name Description
     */
    public static final String COLUMNNAME_Description = "Description";
    /**
     * Column name DocStatus
     */
    public static final String COLUMNNAME_DocStatus = "DocStatus";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsAvailable
     */
    public static final String COLUMNNAME_IsAvailable = "IsAvailable";
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
     * Column name M_Requisition_ID
     */
    public static final String COLUMNNAME_M_Requisition_ID = "M_Requisition_ID";
    /**
     * Column name M_RequisitionLine_ID
     */
    public static final String COLUMNNAME_M_RequisitionLine_ID = "M_RequisitionLine_ID";
    /**
     * Column name M_Warehouse_ID
     */
    public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
    /**
     * Column name OrderType
     */
    public static final String COLUMNNAME_OrderType = "OrderType";
    /**
     * Column name Planner_ID
     */
    public static final String COLUMNNAME_Planner_ID = "Planner_ID";
    /**
     * Column name PP_MRP_ID
     */
    public static final String COLUMNNAME_PP_MRP_ID = "PP_MRP_ID";
    /**
     * Column name PP_MRP_UU
     */
    public static final String COLUMNNAME_PP_MRP_UU = "PP_MRP_UU";
    /**
     * Column name PP_Order_BOMLine_ID
     */
    public static final String COLUMNNAME_PP_Order_BOMLine_ID = "PP_Order_BOMLine_ID";
    /**
     * Column name PP_Order_ID
     */
    public static final String COLUMNNAME_PP_Order_ID = "PP_Order_ID";
    /**
     * Column name Priority
     */
    public static final String COLUMNNAME_Priority = "Priority";
    /**
     * Column name Qty
     */
    public static final String COLUMNNAME_Qty = "Qty";
    /**
     * Column name S_Resource_ID
     */
    public static final String COLUMNNAME_S_Resource_ID = "S_Resource_ID";
    /**
     * Column name TypeMRP
     */
    public static final String COLUMNNAME_TypeMRP = "TypeMRP";
    /**
     * Column name Updated
     */
    public static final String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name Value
     */
    public static final String COLUMNNAME_Value = "Value";
    /**
     * Column name Version
     */
    public static final String COLUMNNAME_Version = "Version";

    /**
     * Set Organization. Organizational entity within client
     */
    public void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    public int getOrgId();

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
     * Get Order. Order
     */
    public int getC_Order_ID();

    /**
     * Set Order. Order
     */
    public void setC_Order_ID(int C_Order_ID);

    public org.compiere.model.I_C_Order getC_Order() throws RuntimeException;

    /**
     * Get Sales Order Line. Sales Order Line
     */
    public int getC_OrderLine_ID();

    /**
     * Set Sales Order Line. Sales Order Line
     */
    public void setC_OrderLine_ID(int C_OrderLine_ID);

    public org.compiere.model.I_C_OrderLine getC_OrderLine() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    public Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    public int getCreatedBy();

    /**
     * Get Date Confirm. Date Confirm of this Order
     */
    public Timestamp getDateConfirm();

    /**
     * Set Date Confirm. Date Confirm of this Order
     */
    public void setDateConfirm(Timestamp DateConfirm);

    /**
     * Get Date Finish Schedule. Scheduled Finish date for this Order
     */
    public Timestamp getDateFinishSchedule();

    /**
     * Set Date Finish Schedule. Scheduled Finish date for this Order
     */
    public void setDateFinishSchedule(Timestamp DateFinishSchedule);

    /**
     * Get Date Ordered. Date of Order
     */
    public Timestamp getDateOrdered();

    /**
     * Set Date Ordered. Date of Order
     */
    public void setDateOrdered(Timestamp DateOrdered);

    /**
     * Get Date Promised. Date Order was promised
     */
    public Timestamp getDatePromised();

    /**
     * Set Date Promised. Date Order was promised
     */
    public void setDatePromised(Timestamp DatePromised);

    /**
     * Get Date Simulation. Simulation date for this Material Plan
     */
    public Timestamp getDateSimulation();

    /**
     * Set Date Simulation. Simulation date for this Material Plan
     */
    public void setDateSimulation(Timestamp DateSimulation);

    /**
     * Get Date Start. Date Start for this Order
     */
    public Timestamp getDateStart();

    /**
     * Set Date Start. Date Start for this Order
     */
    public void setDateStart(Timestamp DateStart);

    /**
     * Get Date Start Schedule. Scheduled start date for this Order
     */
    public Timestamp getDateStartSchedule();

    /**
     * Set Date Start Schedule. Scheduled start date for this Order
     */
    public void setDateStartSchedule(Timestamp DateStartSchedule);

    /**
     * Get Distribution Order
     */
    public int getDD_Order_ID();

    /**
     * Set Distribution Order
     */
    public void setDD_Order_ID(int DD_Order_ID);

    public org.eevolution.model.I_DD_Order getDD_Order() throws RuntimeException;

    /**
     * Get Distribution Order Line
     */
    public int getDD_OrderLine_ID();

    /**
     * Set Distribution Order Line
     */
    public void setDD_OrderLine_ID(int DD_OrderLine_ID);

    public org.eevolution.model.I_DD_OrderLine getDD_OrderLine() throws RuntimeException;

    /**
     * Get Description. Optional short description of the record
     */
    public String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    public void setDescription(String Description);

    /**
     * Get Document Status. The current status of the document
     */
    public String getDocStatus();

    /**
     * Set Document Status. The current status of the document
     */
    public void setDocStatus(String DocStatus);

    /**
     * Set Active. The record is active in the system
     */
    public void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    public boolean isActive();

    /**
     * Set Available. Resource is available
     */
    public void setIsAvailable(boolean IsAvailable);

    /**
     * Get Available. Resource is available
     */
    public boolean isAvailable();

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
     * Get Requisition. Material Requisition
     */
    public int getM_Requisition_ID();

    /**
     * Set Requisition. Material Requisition
     */
    public void setM_Requisition_ID(int M_Requisition_ID);

    public org.compiere.model.I_M_Requisition getM_Requisition() throws RuntimeException;

    /**
     * Get Requisition Line. Material Requisition Line
     */
    public int getM_RequisitionLine_ID();

    /**
     * Set Requisition Line. Material Requisition Line
     */
    public void setM_RequisitionLine_ID(int M_RequisitionLine_ID);

    public org.compiere.model.I_M_RequisitionLine getM_RequisitionLine() throws RuntimeException;

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
     * Get Name. Alphanumeric identifier of the entity
     */
    public String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    public void setName(String Name);

    /**
     * Get Order Type. Type of Order: MRP records grouped by source (Sales Order, Purchase Order,
     * Distribution Order, Requisition)
     */
    public String getOrderType();

    /**
     * Set Order Type. Type of Order: MRP records grouped by source (Sales Order, Purchase Order,
     * Distribution Order, Requisition)
     */
    public void setOrderType(String OrderType);

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
     * Get Material Requirement Planning. MRP ID
     */
    public int getPP_MRP_ID();

    /**
     * Set Material Requirement Planning. MRP ID
     */
    public void setPP_MRP_ID(int PP_MRP_ID);

    /**
     * Get PP_MRP_UU
     */
    public String getPP_MRP_UU();

    /**
     * Set PP_MRP_UU
     */
    public void setPP_MRP_UU(String PP_MRP_UU);

    /**
     * Get Manufacturing Order BOM Line
     */
    public int getPP_Order_BOMLine_ID();

    /**
     * Set Manufacturing Order BOM Line
     */
    public void setPP_Order_BOMLine_ID(int PP_Order_BOMLine_ID);

    public org.eevolution.model.I_PP_Order_BOMLine getPP_Order_BOMLine() throws RuntimeException;

    /**
     * Get Manufacturing Order. Manufacturing Order
     */
    public int getPP_Order_ID();

    /**
     * Set Manufacturing Order. Manufacturing Order
     */
    public void setPP_Order_ID(int PP_Order_ID);

    public org.eevolution.model.I_PP_Order getPP_Order() throws RuntimeException;

    /**
     * Get Priority. Indicates if this request is of a high, medium or low priority.
     */
    public String getPriority();

    /**
     * Set Priority. Indicates if this request is of a high, medium or low priority.
     */
    public void setPriority(String Priority);

    /**
     * Get Quantity. Quantity
     */
    public BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    public void setQty(BigDecimal Qty);

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
     * Get MRP Type. MRP Type determines whether a record is demand or supply
     */
    public String getTypeMRP();

    /**
     * Set MRP Type. MRP Type determines whether a record is demand or supply
     */
    public void setTypeMRP(String TypeMRP);

    /**
     * Get Updated. Date this record was updated
     */
    public Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    public int getUpdatedBy();

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    public String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    public void setValue(String Value);

    /**
     * Get Version. Version of the table definition
     */
    public BigDecimal getVersion();

    /**
     * Set Version. Version of the table definition
     */
    public void setVersion(BigDecimal Version);
}
