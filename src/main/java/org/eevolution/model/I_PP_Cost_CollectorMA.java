package org.eevolution.model;

import org.compiere.model.I_M_AttributeSetInstance;
import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for PP_Cost_CollectorMA
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_PP_Cost_CollectorMA {

    /**
     * TableName=PP_Cost_CollectorMA
     */
    String Table_Name = "PP_Cost_CollectorMA";

    /**
     * AD_Table_ID=53062
     */
    int Table_ID = 53062;

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
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name MovementQty
     */
    String COLUMNNAME_MovementQty = "MovementQty";
    /**
     * Column name PP_Cost_Collector_ID
     */
    String COLUMNNAME_PP_Cost_Collector_ID = "PP_Cost_Collector_ID";
    /**
     * Column name PP_Cost_CollectorMA_ID
     */
    String COLUMNNAME_PP_Cost_CollectorMA_ID = "PP_Cost_CollectorMA_ID";
    /**
     * Column name PP_Cost_CollectorMA_UU
     */
    String COLUMNNAME_PP_Cost_CollectorMA_UU = "PP_Cost_CollectorMA_UU";
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
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getAttributeSetInstanceId();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setAttributeSetInstanceId(int M_AttributeSetInstance_ID);

    I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

    /**
     * Get Movement Quantity. Quantity of a product moved.
     */
    BigDecimal getMovementQty();

    /**
     * Set Movement Quantity. Quantity of a product moved.
     */
    void setMovementQty(BigDecimal MovementQty);

    /**
     * Get Manufacturing Cost Collector
     */
    int getCostCollectorId();

    /**
     * Set Manufacturing Cost Collector
     */
    void setCostCollectorId(int PP_Cost_Collector_ID);

    org.eevolution.model.I_PP_Cost_Collector getCostCollector() throws RuntimeException;

    /**
     * Get Manufacturing Order MA
     */
    int getCostCollectorMAId();

    /**
     * Set Manufacturing Order MA
     */
    void setCostCollectorMAId(int PP_Cost_CollectorMA_ID);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
