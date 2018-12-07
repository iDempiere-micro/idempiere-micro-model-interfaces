package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_CostElement
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_CostElement {

    /**
     * TableName=M_CostElement
     */
    String Table_Name = "M_CostElement";

    /**
     * AD_Table_ID=770
     */
    int Table_ID = 770;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name CostElementType
     */
    String COLUMNNAME_CostElementType = "CostElementType";
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
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsCalculated
     */
    String COLUMNNAME_IsCalculated = "IsCalculated";
    /**
     * Column name M_CostElement_ID
     */
    String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
    /**
     * Column name M_CostElement_UU
     */
    String COLUMNNAME_M_CostElement_UU = "M_CostElement_UU";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Cost Element Type. Type of Cost Element
     */
    String getCostElementType();

    /**
     * Set Cost Element Type. Type of Cost Element
     */
    void setCostElementType(String CostElementType);

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
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Calculated. The value is calculated by the system
     */
    void setIsCalculated(boolean IsCalculated);

    /**
     * Get Calculated. The value is calculated by the system
     */
    boolean isCalculated();

    /**
     * Get Cost Element. Product Cost Element
     */
    int getM_CostElement_ID();

    /**
     * Set Cost Element. Product Cost Element
     */
    void setM_CostElement_ID(int M_CostElement_ID);

    /**
     * Get M_CostElement_UU
     */
    String getM_CostElement_UU();

    /**
     * Set M_CostElement_UU
     */
    void setM_CostElement_UU(String M_CostElement_UU);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
