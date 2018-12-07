package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_AttributeInstance
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_AttributeInstance {

    /**
     * TableName=M_AttributeInstance
     */
    String Table_Name = "M_AttributeInstance";

    /**
     * AD_Table_ID=561
     */
    int Table_ID = 561;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

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
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name M_Attribute_ID
     */
    String COLUMNNAME_M_Attribute_ID = "M_Attribute_ID";
    /**
     * Column name M_AttributeInstance_UU
     */
    String COLUMNNAME_M_AttributeInstance_UU = "M_AttributeInstance_UU";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_AttributeValue_ID
     */
    String COLUMNNAME_M_AttributeValue_ID = "M_AttributeValue_ID";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";
    /**
     * Column name ValueNumber
     */
    String COLUMNNAME_ValueNumber = "ValueNumber";

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
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Attribute. Product Attribute
     */
    void setMAttributeID(int M_Attribute_ID);

    /**
     * Get Attribute. Product Attribute
     */
    int getMAttribute_ID();

    I_M_Attribute getMAttribute() throws RuntimeException;

    /**
     * Set M_AttributeInstance_UU
     */
    void setM_AttributeInstance_UU(String M_AttributeInstance_UU);

    /**
     * Get M_AttributeInstance_UU
     */
    String getMAttributeInstance_UU();

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
     * Set Attribute Value. Product Attribute Value
     */
    void setM_AttributeValue_ID(int M_AttributeValue_ID);

    /**
     * Get Attribute Value. Product Attribute Value
     */
    int getMAttributeValue_ID();

    I_M_AttributeValue getMAttributeValue() throws RuntimeException;

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);

    /**
     * Get Value. Numeric Value
     */
    BigDecimal getValueNumber();

    /**
     * Set Value. Numeric Value
     */
    void setValueNumber(BigDecimal ValueNumber);
}
