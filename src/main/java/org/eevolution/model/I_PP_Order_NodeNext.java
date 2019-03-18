package org.eevolution.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for PP_Order_NodeNext
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_PP_Order_NodeNext {

    /**
     * TableName=PP_Order_NodeNext
     */
    String Table_Name = "PP_Order_NodeNext";

    /**
     * AD_Table_ID=53023
     */
    int Table_ID = 53023;

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
     * Column name AD_WF_Next_ID
     */
    String COLUMNNAME_AD_WF_Next_ID = "AD_WF_Next_ID";
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
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsStdUserWorkflow
     */
    String COLUMNNAME_IsStdUserWorkflow = "IsStdUserWorkflow";
    /**
     * Column name PP_Order_ID
     */
    String COLUMNNAME_PP_Order_ID = "PP_Order_ID";
    /**
     * Column name PP_Order_Next_ID
     */
    String COLUMNNAME_PP_Order_Next_ID = "PP_Order_Next_ID";
    /**
     * Column name PP_Order_Node_ID
     */
    String COLUMNNAME_PP_Order_Node_ID = "PP_Order_Node_ID";
    /**
     * Column name PP_Order_NodeNext_ID
     */
    String COLUMNNAME_PP_Order_NodeNext_ID = "PP_Order_NodeNext_ID";
    /**
     * Column name PP_Order_NodeNext_UU
     */
    String COLUMNNAME_PP_Order_NodeNext_UU = "PP_Order_NodeNext_UU";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name TransitionCode
     */
    String COLUMNNAME_TransitionCode = "TransitionCode";
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
     * Get Next Node. Next Node in workflow
     */
    int getAD_WF_NextId();

    /**
     * Set Next Node. Next Node in workflow
     */
    void setAD_WF_NextId(int AD_WF_Next_ID);

    org.compiere.model.I_AD_WF_Node getAD_WF_Next() throws RuntimeException;

    /**
     * Get Node. Workflow Node (activity), step or process
     */
    int getAD_WF_NodeId();

    /**
     * Set Node. Workflow Node (activity), step or process
     */
    void setAD_WF_NodeId(int AD_WF_Node_ID);

    org.compiere.model.I_AD_WF_Node getAD_WF_Node() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

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
     * Set Std User Workflow. Standard Manual User Approval Workflow
     */
    void setIsStdUserWorkflow(boolean IsStdUserWorkflow);

    /**
     * Get Std User Workflow. Standard Manual User Approval Workflow
     */
    boolean isStdUserWorkflow();

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
     * Get Manufacturing Order Activity Next
     */
    int getOrder_NextId();

    /**
     * Set Manufacturing Order Activity Next
     */
    void setPP_Order_NextId(int PP_Order_Next_ID);

    org.eevolution.model.I_PP_Order_Node getOrder_Next() throws RuntimeException;

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
     * Get Manufacturing Order Activity Next
     */
    int getOrderNodeNextId();

    /**
     * Set Manufacturing Order Activity Next
     */
    void setPP_Order_NodeNextId(int PP_Order_NodeNext_ID);

    /**
     * Get PP_Order_NodeNext_UU
     */
    String getOrderNodeNext_UU();

    /**
     * Set PP_Order_NodeNext_UU
     */
    void setPP_Order_NodeNext_UU(String PP_Order_NodeNext_UU);

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

    /**
     * Get Transition Code. Code resulting in TRUE of FALSE
     */
    String getTransitionCode();

    /**
     * Set Transition Code. Code resulting in TRUE of FALSE
     */
    void setTransitionCode(String TransitionCode);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
