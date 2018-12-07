package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Asset_Type
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Type {

    /**
     * TableName=A_Asset_Type
     */
    String Table_Name = "A_Asset_Type";

    /**
     * AD_Table_ID=53276
     */
    int Table_ID = 53276;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name A_Asset_Type_ID
     */
    String COLUMNNAME_A_Asset_Type_ID = "A_Asset_Type_ID";
    /**
     * Column name A_Asset_Type_UU
     */
    String COLUMNNAME_A_Asset_Type_UU = "A_Asset_Type_UU";
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
     * Column name IsDepreciable
     */
    String COLUMNNAME_IsDepreciable = "IsDepreciable";
    /**
     * Column name IsInPosession
     */
    String COLUMNNAME_IsInPosession = "IsInPosession";
    /**
     * Column name IsOwned
     */
    String COLUMNNAME_IsOwned = "IsOwned";
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
     * Get Asset Type
     */
    int getA_Asset_Type_ID();

    /**
     * Set Asset Type
     */
    void setA_Asset_Type_ID(int A_Asset_Type_ID);

    /**
     * Get A_Asset_Type_UU
     */
    String getA_Asset_Type_UU();

    /**
     * Set A_Asset_Type_UU
     */
    void setA_Asset_Type_UU(String A_Asset_Type_UU);

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
     * Get Is Depreciable. This asset CAN be depreciated
     */
    String getIsDepreciable();

    /**
     * Set Is Depreciable. This asset CAN be depreciated
     */
    void setIsDepreciable(String IsDepreciable);

    /**
     * Get In Possession. The asset is in the possession of the organization
     */
    String getIsInPosession();

    /**
     * Set In Possession. The asset is in the possession of the organization
     */
    void setIsInPosession(String IsInPosession);

    /**
     * Get Owned. The asset is owned by the organization
     */
    String getIsOwned();

    /**
     * Set Owned. The asset is owned by the organization
     */
    void setIsOwned(String IsOwned);

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
