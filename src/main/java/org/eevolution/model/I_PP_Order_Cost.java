package org.eevolution.model;

import org.compiere.model.AccountingSchema;
import org.compiere.model.I_M_AttributeSetInstance;
import org.compiere.model.Workflow;
import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for PP_Order_Cost
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_PP_Order_Cost {

    /**
     * TableName=PP_Order_Cost
     */
    String Table_Name = "PP_Order_Cost";

    /**
     * AD_Table_ID=53024
     */
    int Table_ID = 53024;

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
     * Column name C_AcctSchema_ID
     */
    String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /**
     * Column name CostingMethod
     */
    String COLUMNNAME_CostingMethod = "CostingMethod";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name CumulatedAmt
     */
    String COLUMNNAME_CumulatedAmt = "CumulatedAmt";
    /**
     * Column name CumulatedAmtPost
     */
    String COLUMNNAME_CumulatedAmtPost = "CumulatedAmtPost";
    /**
     * Column name CumulatedQty
     */
    String COLUMNNAME_CumulatedQty = "CumulatedQty";
    /**
     * Column name CumulatedQtyPost
     */
    String COLUMNNAME_CumulatedQtyPost = "CumulatedQtyPost";
    /**
     * Column name CurrentCostPrice
     */
    String COLUMNNAME_CurrentCostPrice = "CurrentCostPrice";
    /**
     * Column name CurrentCostPriceLL
     */
    String COLUMNNAME_CurrentCostPriceLL = "CurrentCostPriceLL";
    /**
     * Column name CurrentQty
     */
    String COLUMNNAME_CurrentQty = "CurrentQty";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
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
     * Column name PP_Order_Cost_ID
     */
    String COLUMNNAME_PP_Order_Cost_ID = "PP_Order_Cost_ID";
    /**
     * Column name PP_Order_Cost_UU
     */
    String COLUMNNAME_PP_Order_Cost_UU = "PP_Order_Cost_UU";
    /**
     * Column name PP_Order_ID
     */
    String COLUMNNAME_PP_Order_ID = "PP_Order_ID";
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
     * Get Workflow. Workflow or combination of tasks
     */
    int getWorkflowId();

    /**
     * Set Workflow. Workflow or combination of tasks
     */
    void setWorkflowId(int AD_Workflow_ID);

    Workflow getWorkflow() throws RuntimeException;

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
     * Get Costing Method. Indicates how Costs will be calculated
     */
    String getCostingMethod();

    /**
     * Set Costing Method. Indicates how Costs will be calculated
     */
    void setCostingMethod(String CostingMethod);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Accumulated Amt. Total Amount
     */
    BigDecimal getCumulatedAmt();

    /**
     * Set Accumulated Amt. Total Amount
     */
    void setCumulatedAmt(BigDecimal CumulatedAmt);

    /**
     * Get Cumulated Amt Post
     */
    BigDecimal getCumulatedAmtPost();

    /**
     * Set Cumulated Amt Post
     */
    void setCumulatedAmtPost(BigDecimal CumulatedAmtPost);

    /**
     * Get Accumulated Qty. Total Quantity
     */
    BigDecimal getCumulatedQty();

    /**
     * Set Accumulated Qty. Total Quantity
     */
    void setCumulatedQty(BigDecimal CumulatedQty);

    /**
     * Get Cumulated Qty Post
     */
    BigDecimal getCumulatedQtyPost();

    /**
     * Set Cumulated Qty Post
     */
    void setCumulatedQtyPost(BigDecimal CumulatedQtyPost);

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
     * Get Current Quantity. Current Quantity
     */
    BigDecimal getCurrentQty();

    /**
     * Set Current Quantity. Current Quantity
     */
    void setCurrentQty(BigDecimal CurrentQty);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getAttributeSetInstanceId();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setAttributeSetInstanceId(int M_AttributeSetInstance_ID);

    I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

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
     * Get Manufacturing Order Cost
     */
    int getOrderCostId();

    /**
     * Set Manufacturing Order Cost
     */
    void setOrderCostId(int PP_Order_Cost_ID);

    /**
     * Get Manufacturing Order. Manufacturing Order
     */
    int getOrderId();

    /**
     * Set Manufacturing Order. Manufacturing Order
     */
    void setOrderId(int PP_Order_ID);

    org.eevolution.model.I_PP_Order getOrder() throws RuntimeException;

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
