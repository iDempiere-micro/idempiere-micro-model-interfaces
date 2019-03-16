package org.eevolution.model;

import org.compiere.model.I_M_AttributeSetInstance;
import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for PP_Order_Cost
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_PP_Order_Cost {

    /**
     * TableName=PP_Order_Cost
     */
    public static final String Table_Name = "PP_Order_Cost";

    /**
     * AD_Table_ID=53024
     */
    public static final int Table_ID = 53024;

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
     * Column name AD_Workflow_ID
     */
    public static final String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
    /**
     * Column name C_AcctSchema_ID
     */
    public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /**
     * Column name CostingMethod
     */
    public static final String COLUMNNAME_CostingMethod = "CostingMethod";
    /**
     * Column name Created
     */
    public static final String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name CumulatedAmt
     */
    public static final String COLUMNNAME_CumulatedAmt = "CumulatedAmt";
    /**
     * Column name CumulatedAmtPost
     */
    public static final String COLUMNNAME_CumulatedAmtPost = "CumulatedAmtPost";
    /**
     * Column name CumulatedQty
     */
    public static final String COLUMNNAME_CumulatedQty = "CumulatedQty";
    /**
     * Column name CumulatedQtyPost
     */
    public static final String COLUMNNAME_CumulatedQtyPost = "CumulatedQtyPost";
    /**
     * Column name CurrentCostPrice
     */
    public static final String COLUMNNAME_CurrentCostPrice = "CurrentCostPrice";
    /**
     * Column name CurrentCostPriceLL
     */
    public static final String COLUMNNAME_CurrentCostPriceLL = "CurrentCostPriceLL";
    /**
     * Column name CurrentQty
     */
    public static final String COLUMNNAME_CurrentQty = "CurrentQty";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
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
     * Column name PP_Order_Cost_ID
     */
    public static final String COLUMNNAME_PP_Order_Cost_ID = "PP_Order_Cost_ID";
    /**
     * Column name PP_Order_Cost_UU
     */
    public static final String COLUMNNAME_PP_Order_Cost_UU = "PP_Order_Cost_UU";
    /**
     * Column name PP_Order_ID
     */
    public static final String COLUMNNAME_PP_Order_ID = "PP_Order_ID";
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
     * Get Workflow. Workflow or combination of tasks
     */
    public int getAD_Workflow_ID();

    /**
     * Set Workflow. Workflow or combination of tasks
     */
    public void setAD_Workflow_ID(int AD_Workflow_ID);

    public org.compiere.model.I_AD_Workflow getAD_Workflow() throws RuntimeException;

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
     * Get Costing Method. Indicates how Costs will be calculated
     */
    public String getCostingMethod();

    /**
     * Set Costing Method. Indicates how Costs will be calculated
     */
    public void setCostingMethod(String CostingMethod);

    /**
     * Get Created. Date this record was created
     */
    public Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    public int getCreatedBy();

    /**
     * Get Accumulated Amt. Total Amount
     */
    public BigDecimal getCumulatedAmt();

    /**
     * Set Accumulated Amt. Total Amount
     */
    public void setCumulatedAmt(BigDecimal CumulatedAmt);

    /**
     * Get Cumulated Amt Post
     */
    public BigDecimal getCumulatedAmtPost();

    /**
     * Set Cumulated Amt Post
     */
    public void setCumulatedAmtPost(BigDecimal CumulatedAmtPost);

    /**
     * Get Accumulated Qty. Total Quantity
     */
    public BigDecimal getCumulatedQty();

    /**
     * Set Accumulated Qty. Total Quantity
     */
    public void setCumulatedQty(BigDecimal CumulatedQty);

    /**
     * Get Cumulated Qty Post
     */
    public BigDecimal getCumulatedQtyPost();

    /**
     * Set Cumulated Qty Post
     */
    public void setCumulatedQtyPost(BigDecimal CumulatedQtyPost);

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
     * Get Current Quantity. Current Quantity
     */
    public BigDecimal getCurrentQty();

    /**
     * Set Current Quantity. Current Quantity
     */
    public void setCurrentQty(BigDecimal CurrentQty);

    /**
     * Set Active. The record is active in the system
     */
    public void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    public boolean isActive();

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    public int getAttributeSetInstanceId();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    public void setAttributeSetInstanceId(int M_AttributeSetInstance_ID);

    public I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

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

    public org.compiere.model.I_M_CostType getM_CostType() throws RuntimeException;

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
     * Get Manufacturing Order Cost
     */
    public int getPP_Order_Cost_ID();

    /**
     * Set Manufacturing Order Cost
     */
    public void setPP_Order_Cost_ID(int PP_Order_Cost_ID);

    /**
     * Get PP_Order_Cost_UU
     */
    public String getPP_Order_Cost_UU();

    /**
     * Set PP_Order_Cost_UU
     */
    public void setPP_Order_Cost_UU(String PP_Order_Cost_UU);

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
     * Get Updated. Date this record was updated
     */
    public Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    public int getUpdatedBy();
}
