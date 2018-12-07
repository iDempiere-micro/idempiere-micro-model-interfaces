package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ProductionLineMA
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ProductionLineMA {

    /**
     * TableName=M_ProductionLineMA
     */
    String Table_Name = "M_ProductionLineMA";

    /**
     * AD_Table_ID=765
     */
    int Table_ID = 765;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);

    /** Load Meta Data */

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
     * Column name DateMaterialPolicy
     */
    String COLUMNNAME_DateMaterialPolicy = "DateMaterialPolicy";
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
     * Column name M_ProductionLine_ID
     */
    String COLUMNNAME_M_ProductionLine_ID = "M_ProductionLine_ID";
    /**
     * Column name M_ProductionLineMA_UU
     */
    String COLUMNNAME_M_ProductionLineMA_UU = "M_ProductionLineMA_UU";
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
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Date Material Policy. Time used for LIFO and FIFO Material Policy
     */
    Timestamp getDateMaterialPolicy();

    /**
     * Set Date Material Policy. Time used for LIFO and FIFO Material Policy
     */
    void setDateMaterialPolicy(Timestamp DateMaterialPolicy);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

    /**
     * Get Attribute Set Instance. Product Attribute Set Instance
     */
    int getMAttributeSetInstance_ID();

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
     * Get Production Line. Document Line representing a production
     */
    int getM_ProductionLine_ID();

    /**
     * Set Production Line. Document Line representing a production
     */
    void setM_ProductionLine_ID(int M_ProductionLine_ID);

    I_M_ProductionLine getM_ProductionLine() throws RuntimeException;

    /**
     * Get M_ProductionLineMA_UU
     */
    String getM_ProductionLineMA_UU();

    /**
     * Set M_ProductionLineMA_UU
     */
    void setM_ProductionLineMA_UU(String M_ProductionLineMA_UU);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
