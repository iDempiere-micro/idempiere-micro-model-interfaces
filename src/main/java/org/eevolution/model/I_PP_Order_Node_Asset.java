package org.eevolution.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for PP_Order_Node_Asset
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_PP_Order_Node_Asset {

    /**
     * TableName=PP_Order_Node_Asset
     */
    public static final String Table_Name = "PP_Order_Node_Asset";

    /**
     * AD_Table_ID=53031
     */
    public static final int Table_ID = 53031;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name A_Asset_ID
     */
    public static final String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
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
     * Column name PP_Order_ID
     */
    public static final String COLUMNNAME_PP_Order_ID = "PP_Order_ID";
    /**
     * Column name PP_Order_Node_Asset_ID
     */
    public static final String COLUMNNAME_PP_Order_Node_Asset_ID = "PP_Order_Node_Asset_ID";
    /**
     * Column name PP_Order_Node_Asset_UU
     */
    public static final String COLUMNNAME_PP_Order_Node_Asset_UU = "PP_Order_Node_Asset_UU";
    /**
     * Column name PP_Order_Node_ID
     */
    public static final String COLUMNNAME_PP_Order_Node_ID = "PP_Order_Node_ID";
    /**
     * Column name PP_Order_Workflow_ID
     */
    public static final String COLUMNNAME_PP_Order_Workflow_ID = "PP_Order_Workflow_ID";
    /**
     * Column name Updated
     */
    public static final String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Asset. Asset used internally or by customers
     */
    public int getA_AssetId();

    /**
     * Set Asset. Asset used internally or by customers
     */
    public void setA_AssetId(int A_Asset_ID);

    public org.compiere.model.I_A_Asset getA_Asset() throws RuntimeException;

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
     * Get Manufacturing Order. Manufacturing Order
     */
    public int getPP_OrderId();

    /**
     * Set Manufacturing Order. Manufacturing Order
     */
    public void setPP_OrderId(int PP_Order_ID);

    public org.eevolution.model.I_PP_Order getPP_Order() throws RuntimeException;

    /**
     * Get Manufacturing Order Activity Asset
     */
    public int getPP_Order_Node_AssetId();

    /**
     * Set Manufacturing Order Activity Asset
     */
    public void setPP_Order_Node_AssetId(int PP_Order_Node_Asset_ID);

    /**
     * Get PP_Order_Node_Asset_UU
     */
    public String getPP_Order_Node_Asset_UU();

    /**
     * Set PP_Order_Node_Asset_UU
     */
    public void setPP_Order_Node_Asset_UU(String PP_Order_Node_Asset_UU);

    /**
     * Get Manufacturing Order Activity. Workflow Node (activity), step or process
     */
    public int getPP_Order_NodeId();

    /**
     * Set Manufacturing Order Activity. Workflow Node (activity), step or process
     */
    public void setPP_Order_NodeId(int PP_Order_Node_ID);

    public org.eevolution.model.I_PP_Order_Node getPP_Order_Node() throws RuntimeException;

    /**
     * Get Manufacturing Order Workflow
     */
    public int getPP_Order_WorkflowId();

    /**
     * Set Manufacturing Order Workflow
     */
    public void setPP_Order_WorkflowId(int PP_Order_Workflow_ID);

    public org.eevolution.model.I_PP_Order_Workflow getPP_Order_Workflow() throws RuntimeException;

    /**
     * Get Updated. Date this record was updated
     */
    public Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    public int getUpdatedBy();
}
