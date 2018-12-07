package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_InfoRelated
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_InfoRelated {

    /**
     * TableName=AD_InfoRelated
     */
    String Table_Name = "AD_InfoRelated";

    /**
     * AD_Table_ID=200089
     */
    int Table_ID = 200089;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_InfoRelated_ID
     */
    String COLUMNNAME_AD_InfoRelated_ID = "AD_InfoRelated_ID";
    /**
     * Column name AD_InfoRelated_UU
     */
    String COLUMNNAME_AD_InfoRelated_UU = "AD_InfoRelated_UU";
    /**
     * Column name AD_InfoWindow_ID
     */
    String COLUMNNAME_AD_InfoWindow_ID = "AD_InfoWindow_ID";
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
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name ParentRelatedColumn_ID
     */
    String COLUMNNAME_ParentRelatedColumn_ID = "ParentRelatedColumn_ID";
    /**
     * Column name RelatedColumn_ID
     */
    String COLUMNNAME_RelatedColumn_ID = "RelatedColumn_ID";
    /**
     * Column name RelatedInfo_ID
     */
    String COLUMNNAME_RelatedInfo_ID = "RelatedInfo_ID";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get InfoRelated
     */
    int getAD_InfoRelated_ID();

    /**
     * Set InfoRelated
     */
    void setAD_InfoRelated_ID(int AD_InfoRelated_ID);

    /**
     * Get AD_InfoRelated_UU
     */
    String getAD_InfoRelated_UU();

    /**
     * Set AD_InfoRelated_UU
     */
    void setAD_InfoRelated_UU(String AD_InfoRelated_UU);

    /**
     * Get Info Window. Info and search/select Window
     */
    int getAD_InfoWindow_ID();

    /**
     * Set Info Window. Info and search/select Window
     */
    void setAD_InfoWindow_ID(int AD_InfoWindow_ID);

    I_AD_InfoWindow getAD_InfoWindow() throws RuntimeException;

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
     * Get Comment/Help. Comment or Hint
     */
    String getHelp();

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

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
     * Get Parent Related Column. column in parent info window, link with column in this relate info
     */
    int getParentRelatedColumn_ID();

    /**
     * Set Parent Related Column. column in parent info window, link with column in this relate info
     */
    void setParentRelatedColumn_ID(int ParentRelatedColumn_ID);

    I_AD_InfoColumn getParentRelatedColumn() throws RuntimeException;

    /**
     * Get Related Info Column
     */
    int getRelatedColumn_ID();

    /**
     * Set Related Info Column
     */
    void setRelatedColumn_ID(int RelatedColumn_ID);

    I_AD_InfoColumn getRelatedColumn() throws RuntimeException;

    /**
     * Get Related Info Window
     */
    int getRelatedInfo_ID();

    /**
     * Set Related Info Window
     */
    void setRelatedInfo_ID(int RelatedInfo_ID);

    I_AD_InfoWindow getRelatedInfo() throws RuntimeException;

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
