package org.eevolution.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.compiere.model.*;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PP_Cost_CollectorMA
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_PP_Cost_CollectorMA {

    /**
     * TableName=PP_Cost_CollectorMA
     */
    public static final String Table_Name = "PP_Cost_CollectorMA";

    /**
     * AD_Table_ID=53062
     */
    public static final int Table_ID = 53062;

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
     * Column name M_AttributeSetInstance_ID
     */
    public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name MovementQty
     */
    public static final String COLUMNNAME_MovementQty = "MovementQty";
    /**
     * Column name PP_Cost_Collector_ID
     */
    public static final String COLUMNNAME_PP_Cost_Collector_ID = "PP_Cost_Collector_ID";
    /**
     * Column name PP_Cost_CollectorMA_ID
     */
    public static final String COLUMNNAME_PP_Cost_CollectorMA_ID = "PP_Cost_CollectorMA_ID";
    /**
     * Column name PP_Cost_CollectorMA_UU
     */
    public static final String COLUMNNAME_PP_Cost_CollectorMA_UU = "PP_Cost_CollectorMA_UU";
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
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    public void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    public int getMAttributeSetInstance_ID();

    public I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

    /**
     * Get Movement Quantity. Quantity of a product moved.
     */
    public BigDecimal getMovementQty();

    /**
     * Set Movement Quantity. Quantity of a product moved.
     */
    public void setMovementQty(BigDecimal MovementQty);

    /**
     * Get Manufacturing Cost Collector
     */
    public int getPP_Cost_Collector_ID();

    /**
     * Set Manufacturing Cost Collector
     */
    public void setPP_Cost_Collector_ID(int PP_Cost_Collector_ID);

    public org.eevolution.model.I_PP_Cost_Collector getPP_Cost_Collector() throws RuntimeException;

    /**
     * Get Manufacturing Order MA
     */
    public int getPP_Cost_CollectorMA_ID();

    /**
     * Set Manufacturing Order MA
     */
    public void setPP_Cost_CollectorMA_ID(int PP_Cost_CollectorMA_ID);

    /**
     * Get PP_Cost_CollectorMA_UU
     */
    public String getPP_Cost_CollectorMA_UU();

    /**
     * Set PP_Cost_CollectorMA_UU
     */
    public void setPP_Cost_CollectorMA_UU(String PP_Cost_CollectorMA_UU);

    /**
     * Get Updated. Date this record was updated
     */
    public Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    public int getUpdatedBy();
}
