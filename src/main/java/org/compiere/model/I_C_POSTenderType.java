package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_POSTenderType
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_POSTenderType {

    /**
     * TableName=C_POSTenderType
     */
    String Table_Name = "C_POSTenderType";

    /**
     * AD_Table_ID=200017
     */
    int Table_ID = 200017;

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
     * Column name C_POSTenderType_ID
     */
    String COLUMNNAME_C_POSTenderType_ID = "C_POSTenderType_ID";
    /**
     * Column name C_POSTenderType_UU
     */
    String COLUMNNAME_C_POSTenderType_UU = "C_POSTenderType_UU";
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
     * Column name IsGuarantee
     */
    String COLUMNNAME_IsGuarantee = "IsGuarantee";
    /**
     * Column name IsPostDated
     */
    String COLUMNNAME_IsPostDated = "IsPostDated";
    /**
     * Column name TenderType
     */
    String COLUMNNAME_TenderType = "TenderType";
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
     * Get POS Tender Type
     */
    int getC_POSTenderType_ID();

    /**
     * Set POS Tender Type
     */
    void setC_POSTenderType_ID(int C_POSTenderType_ID);

    /**
     * Get C_POSTenderType_UU
     */
    String getC_POSTenderType_UU();

    /**
     * Set C_POSTenderType_UU
     */
    void setC_POSTenderType_UU(String C_POSTenderType_UU);

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
     * Set Guarantee. Guarantee for a Credit
     */
    void setIsGuarantee(boolean IsGuarantee);

    /**
     * Get Guarantee. Guarantee for a Credit
     */
    boolean isGuarantee();

    /**
     * Set Post Dated
     */
    void setIsPostDated(boolean IsPostDated);

    /**
     * Get Post Dated
     */
    boolean isPostDated();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Tender type. Method of Payment
     */
    String getTenderType();

    /**
     * Set Tender type. Method of Payment
     */
    void setTenderType(String TenderType);

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
