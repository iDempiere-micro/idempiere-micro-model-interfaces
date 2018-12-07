package org.eevolution.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.compiere.model.*;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PP_WF_Node_Product
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_PP_WF_Node_Product {

    /**
     * TableName=PP_WF_Node_Product
     */
    public static final String Table_Name = "PP_WF_Node_Product";

    /**
     * AD_Table_ID=53016
     */
    public static final int Table_ID = 53016;

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
     * Column name AD_WF_Node_ID
     */
    public static final String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";
    /**
     * Column name ConfigurationLevel
     */
    public static final String COLUMNNAME_ConfigurationLevel = "ConfigurationLevel";
    /**
     * Column name Created
     */
    public static final String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name EntityType
     */
    public static final String COLUMNNAME_EntityType = "EntityType";
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
     * Column name PP_WF_Node_Product_ID
     */
    public static final String COLUMNNAME_PP_WF_Node_Product_ID = "PP_WF_Node_Product_ID";
    /**
     * Column name PP_WF_Node_Product_UU
     */
    public static final String COLUMNNAME_PP_WF_Node_Product_UU = "PP_WF_Node_Product_UU";
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
     * Set Organization. Organizational entity within client
     */
    public void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    public int getOrgId();

    /**
     * Get Node. Workflow Node (activity), step or process
     */
    public int getAD_WF_Node_ID();

    /**
     * Set Node. Workflow Node (activity), step or process
     */
    public void setAD_WF_Node_ID(int AD_WF_Node_ID);

    public org.compiere.model.I_AD_WF_Node getAD_WF_Node() throws RuntimeException;

    /**
     * Get Configuration Level. Configuration Level for this parameter
     */
    public String getConfigurationLevel();

    /**
     * Set Configuration Level. Configuration Level for this parameter
     */
    public void setConfigurationLevel(String ConfigurationLevel);

    /**
     * Get Created. Date this record was created
     */
    public Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    public int getCreatedBy();

    /**
     * Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    public String getEntityType();

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    public void setEntityType(String EntityType);

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
    public int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    public void setM_Product_ID(int M_Product_ID);

    public org.compiere.model.I_M_Product getM_Product() throws RuntimeException;

    /**
     * Get Workflow Node Product
     */
    public int getPP_WF_Node_Product_ID();

    /**
     * Set Workflow Node Product
     */
    public void setPP_WF_Node_Product_ID(int PP_WF_Node_Product_ID);

    /**
     * Get PP_WF_Node_Product_UU
     */
    public String getPP_WF_Node_Product_UU();

    /**
     * Set PP_WF_Node_Product_UU
     */
    public void setPP_WF_Node_Product_UU(String PP_WF_Node_Product_UU);

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
