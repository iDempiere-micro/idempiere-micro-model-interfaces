package org.eevolution.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for PP_WF_Node_Product
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_PP_WF_Node_Product {

    /**
     * TableName=PP_WF_Node_Product
     */
    String Table_Name = "PP_WF_Node_Product";

    /**
     * AD_Table_ID=53016
     */
    int Table_ID = 53016;

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
     * Column name AD_WF_Node_ID
     */
    String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
    /**
     * Column name ConfigurationLevel
     */
    String COLUMNNAME_ConfigurationLevel = "ConfigurationLevel";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsSubcontracting
     */
    String COLUMNNAME_IsSubcontracting = "IsSubcontracting";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name PP_WF_Node_Product_ID
     */
    String COLUMNNAME_PP_WF_Node_Product_ID = "PP_WF_Node_Product_ID";
    /**
     * Column name PP_WF_Node_Product_UU
     */
    String COLUMNNAME_PP_WF_Node_Product_UU = "PP_WF_Node_Product_UU";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
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
     * Get Node. Workflow Node (activity), step or process
     */
    int getWorkflowNodeId();

    /**
     * Set Node. Workflow Node (activity), step or process
     */
    void setWorkflowNodeId(int AD_WF_Node_ID);

    org.compiere.model.I_AD_WF_Node getWorkflowNode() throws RuntimeException;

    /**
     * Get Configuration Level. Configuration Level for this parameter
     */
    String getConfigurationLevel();

    /**
     * Set Configuration Level. Configuration Level for this parameter
     */
    void setConfigurationLevel(String ConfigurationLevel);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    String getEntityType();

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    void setEntityType(String EntityType);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Is Subcontracting
     */
    void setIsSubcontracting(boolean IsSubcontracting);

    /**
     * Get Is Subcontracting
     */
    boolean isSubcontracting();

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
     * Get Workflow Node Product
     */
    int getWorkflowNodeProductId();

    /**
     * Set Workflow Node Product
     */
    void setWorkflowNodeProductId(int PP_WF_Node_Product_ID);

    /**
     * Get Quantity. Quantity
     */
    BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    void setQty(BigDecimal Qty);

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
