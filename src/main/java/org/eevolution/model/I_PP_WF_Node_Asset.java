package org.eevolution.model;

import org.compiere.model.Asset;
import org.compiere.model.WorkflowNode;
import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for PP_WF_Node_Asset
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_PP_WF_Node_Asset {

    /**
     * TableName=PP_WF_Node_Asset
     */
    String Table_Name = "PP_WF_Node_Asset";

    /**
     * AD_Table_ID=53017
     */
    int Table_ID = 53017;

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
     * Column name AD_WF_Node_ID
     */
    String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
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
     * Column name PP_WF_Node_Asset_ID
     */
    String COLUMNNAME_PP_WF_Node_Asset_ID = "PP_WF_Node_Asset_ID";
    /**
     * Column name PP_WF_Node_Asset_UU
     */
    String COLUMNNAME_PP_WF_Node_Asset_UU = "PP_WF_Node_Asset_UU";
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
     * Get Node. Workflow Node (activity), step or process
     */
    int getWorkflowNodeId();

    /**
     * Set Node. Workflow Node (activity), step or process
     */
    void setWorkflowNodeId(int AD_WF_Node_ID);

    WorkflowNode getWorkflowNode() throws RuntimeException;

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
     * Get Workflow Node Asset
     */
    int getWorkflowNodeAssetId();

    /**
     * Set Workflow Node Asset
     */
    void setWorkflowNodeAssetId(int PP_WF_Node_Asset_ID);

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
