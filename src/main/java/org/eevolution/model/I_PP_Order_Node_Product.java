package org.eevolution.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for PP_Order_Node_Product
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_PP_Order_Node_Product {

    /**
     * TableName=PP_Order_Node_Product
     */
    public static final String Table_Name = "PP_Order_Node_Product";

    /**
     * AD_Table_ID=53030
     */
    public static final int Table_ID = 53030;

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
     * Column name Created
     */
    public static final String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsSubcontracting
     */
    public static final String COLUMNNAME_IsSubcontracting = "IsSubcontracting";
    /**
     * Column name M_Product_ID
     */
    public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name PP_Order_ID
     */
    public static final String COLUMNNAME_PP_Order_ID = "PP_Order_ID";
    /**
     * Column name PP_Order_Node_ID
     */
    public static final String COLUMNNAME_PP_Order_Node_ID = "PP_Order_Node_ID";
    /**
     * Column name PP_Order_Node_Product_ID
     */
    public static final String COLUMNNAME_PP_Order_Node_Product_ID = "PP_Order_Node_Product_ID";
    /**
     * Column name PP_Order_Node_Product_UU
     */
    public static final String COLUMNNAME_PP_Order_Node_Product_UU = "PP_Order_Node_Product_UU";
    /**
     * Column name PP_Order_Workflow_ID
     */
    public static final String COLUMNNAME_PP_Order_Workflow_ID = "PP_Order_Workflow_ID";
    /**
     * Column name Qty
     */
    public static final String COLUMNNAME_Qty = "Qty";
    /**
     * Column name SeqNo
     */
    public static final String COLUMNNAME_SeqNo = "SeqNo";
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
     * Get Created. Date this record was created
     */
    public Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    public int getCreatedBy();

    /**
     * Set Active. The record is active in the system
     */
    public void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    public boolean isActive();

    /**
     * Set Is Subcontracting
     */
    public void setIsSubcontracting(boolean IsSubcontracting);

    /**
     * Get Is Subcontracting
     */
    public boolean isSubcontracting();

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
     * Get Manufacturing Order. Manufacturing Order
     */
    public int getPP_Order_ID();

    /**
     * Set Manufacturing Order. Manufacturing Order
     */
    public void setPP_Order_ID(int PP_Order_ID);

    public org.eevolution.model.I_PP_Order getPP_Order() throws RuntimeException;

    /**
     * Get Manufacturing Order Activity. Workflow Node (activity), step or process
     */
    public int getPP_Order_Node_ID();

    /**
     * Set Manufacturing Order Activity. Workflow Node (activity), step or process
     */
    public void setPP_Order_Node_ID(int PP_Order_Node_ID);

    public org.eevolution.model.I_PP_Order_Node getPP_Order_Node() throws RuntimeException;

    /**
     * Get Manufacturing Order Activity Product
     */
    public int getPP_Order_Node_Product_ID();

    /**
     * Set Manufacturing Order Activity Product
     */
    public void setPP_Order_Node_Product_ID(int PP_Order_Node_Product_ID);

    /**
     * Get PP_Order_Node_Product_UU
     */
    public String getPP_Order_Node_Product_UU();

    /**
     * Set PP_Order_Node_Product_UU
     */
    public void setPP_Order_Node_Product_UU(String PP_Order_Node_Product_UU);

    /**
     * Get Manufacturing Order Workflow
     */
    public int getPP_Order_Workflow_ID();

    /**
     * Set Manufacturing Order Workflow
     */
    public void setPP_Order_Workflow_ID(int PP_Order_Workflow_ID);

    public org.eevolution.model.I_PP_Order_Workflow getPP_Order_Workflow() throws RuntimeException;

    /**
     * Get Quantity. Quantity
     */
    public BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    public void setQty(BigDecimal Qty);

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    public int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    public void setSeqNo(int SeqNo);

    /**
     * Get Updated. Date this record was updated
     */
    public Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    public int getUpdatedBy();
}
