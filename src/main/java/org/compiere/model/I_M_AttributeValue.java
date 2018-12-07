package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_AttributeValue
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_AttributeValue {

    /**
     * TableName=M_AttributeValue
     */
    String Table_Name = "M_AttributeValue";

    /**
     * AD_Table_ID=558
     */
    int Table_ID = 558;

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
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name M_Attribute_ID
     */
    String COLUMNNAME_M_Attribute_ID = "M_Attribute_ID";
    /**
     * Column name M_AttributeValue_ID
     */
    String COLUMNNAME_M_AttributeValue_ID = "M_AttributeValue_ID";
    /**
     * Column name M_AttributeValue_UU
     */
    String COLUMNNAME_M_AttributeValue_UU = "M_AttributeValue_UU";
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
     * Set Attribute. Product Attribute
     */
    void setMAttributeID(int M_Attribute_ID);

    /**
     * Get Attribute. Product Attribute
     */
    int getMAttribute_ID();

    I_M_Attribute getMAttribute() throws RuntimeException;

    /**
     * Set Attribute Value. Product Attribute Value
     */
    void setM_AttributeValue_ID(int M_AttributeValue_ID);

    /**
     * Get Attribute Value. Product Attribute Value
     */
    int getMAttributeValue_ID();

    /**
     * Set M_AttributeValue_UU
     */
    void setM_AttributeValue_UU(String M_AttributeValue_UU);

    /**
     * Get M_AttributeValue_UU
     */
    String getMAttributeValue_UU();

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

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);
}
