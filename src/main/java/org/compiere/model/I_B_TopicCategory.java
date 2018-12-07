package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for B_TopicCategory
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_B_TopicCategory {

    /**
     * TableName=B_TopicCategory
     */
    String Table_Name = "B_TopicCategory";

    /**
     * AD_Table_ID=691
     */
    int Table_ID = 691;

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
     * Column name B_TopicCategory_ID
     */
    String COLUMNNAME_B_TopicCategory_ID = "B_TopicCategory_ID";
    /**
     * Column name B_TopicCategory_UU
     */
    String COLUMNNAME_B_TopicCategory_UU = "B_TopicCategory_UU";
    /**
     * Column name B_TopicType_ID
     */
    String COLUMNNAME_B_TopicType_ID = "B_TopicType_ID";
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
     * Get Topic Category. Auction Topic Category
     */
    int getB_TopicCategory_ID();

    /**
     * Set Topic Category. Auction Topic Category
     */
    void setB_TopicCategory_ID(int B_TopicCategory_ID);

    /**
     * Get B_TopicCategory_UU
     */
    String getB_TopicCategory_UU();

    /**
     * Set B_TopicCategory_UU
     */
    void setB_TopicCategory_UU(String B_TopicCategory_UU);

    /**
     * Get Topic Type. Auction Topic Type
     */
    int getB_TopicType_ID();

    /**
     * Set Topic Type. Auction Topic Type
     */
    void setB_TopicType_ID(int B_TopicType_ID);

    I_B_TopicType getB_TopicType() throws RuntimeException;

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
