package org.eevolution.model;

import org.compiere.model.Asset;
import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for PP_Order_Node_Asset
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_PP_Order_Node_Asset {

    /**
     * TableName=PP_Order_Node_Asset
     */
    String Table_Name = "PP_Order_Node_Asset";

    /**
     * AD_Table_ID=53031
     */
    int Table_ID = 53031;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name A_Asset_ID
     */
    String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name PP_Order_ID
     */
    String COLUMNNAME_PP_Order_ID = "PP_Order_ID";
    /**
     * Column name PP_Order_Node_Asset_ID
     */
    String COLUMNNAME_PP_Order_Node_Asset_ID = "PP_Order_Node_Asset_ID";
    /**
     * Column name PP_Order_Node_Asset_UU
     */
    String COLUMNNAME_PP_Order_Node_Asset_UU = "PP_Order_Node_Asset_UU";
    /**
     * Column name PP_Order_Node_ID
     */
    String COLUMNNAME_PP_Order_Node_ID = "PP_Order_Node_ID";
    /**
     * Column name PP_Order_Workflow_ID
     */
    String COLUMNNAME_PP_Order_Workflow_ID = "PP_Order_Workflow_ID";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Asset. Asset used internally or by customers
     */
    int getAssetId();

    /**
     * Set Asset. Asset used internally or by customers
     */
    void setAssetId(int A_Asset_ID);

    Asset getAsset() throws RuntimeException;

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int AD_Org_ID);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

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
     * Get Manufacturing Order Activity Asset
     */
    int getOrderNodeAssetId();

    /**
     * Set Manufacturing Order Activity Asset
     */
    void setOrderNodeAssetId(int PP_Order_Node_Asset_ID);

    /**
     * Get Manufacturing Order Activity. Workflow Node (activity), step or process
     */
    int getOrderNodeId();

    /**
     * Set Manufacturing Order Activity. Workflow Node (activity), step or process
     */
    void setOrderNodeId(int PP_Order_Node_ID);

    org.eevolution.model.I_PP_Order_Node getOrderNode() throws RuntimeException;

    /**
     * Get Manufacturing Order Workflow
     */
    int getOrderWorkflowId();

    /**
     * Set Manufacturing Order Workflow
     */
    void setOrderWorkflowId(int PP_Order_Workflow_ID);

    org.eevolution.model.I_PP_Order_Workflow getOrderWorkflow() throws RuntimeException;

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
