package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Registration
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Registration {

    /**
     * TableName=A_Registration
     */
    String Table_Name = "A_Registration";

    /**
     * AD_Table_ID=651
     */
    int Table_ID = 651;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name A_Asset_ID
     */
    String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name A_Registration_ID
     */
    String COLUMNNAME_A_Registration_ID = "A_Registration_ID";
    /**
     * Column name A_Registration_UU
     */
    String COLUMNNAME_A_Registration_UU = "A_Registration_UU";
    /**
     * Column name AssetServiceDate
     */
    String COLUMNNAME_AssetServiceDate = "AssetServiceDate";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
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
     * Column name IsAllowPublish
     */
    String COLUMNNAME_IsAllowPublish = "IsAllowPublish";
    /**
     * Column name IsInProduction
     */
    String COLUMNNAME_IsInProduction = "IsInProduction";
    /**
     * Column name IsRegistered
     */
    String COLUMNNAME_IsRegistered = "IsRegistered";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name Note
     */
    String COLUMNNAME_Note = "Note";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Remote_Addr
     */
    String COLUMNNAME_Remote_Addr = "Remote_Addr";
    /**
     * Column name Remote_Host
     */
    String COLUMNNAME_Remote_Host = "Remote_Host";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Asset. Asset used internally or by customers
     */
    int getA_Asset_ID();

    /**
     * Set Asset. Asset used internally or by customers
     */
    void setA_Asset_ID(int A_Asset_ID);

    I_A_Asset getA_Asset() throws RuntimeException;

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setAD_User_ID(int AD_User_ID);

    I_AD_User getAD_User() throws RuntimeException;

    /**
     * Get Registration. User Asset Registration
     */
    int getA_Registration_ID();

    /**
     * Set Registration. User Asset Registration
     */
    void setA_Registration_ID(int A_Registration_ID);

    /**
     * Get A_Registration_UU
     */
    String getA_Registration_UU();

    /**
     * Set A_Registration_UU
     */
    void setA_Registration_UU(String A_Registration_UU);

    /**
     * Get In Service Date. Date when Asset was put into service
     */
    Timestamp getAssetServiceDate();

    /**
     * Set In Service Date. Date when Asset was put into service
     */
    void setAssetServiceDate(Timestamp AssetServiceDate);

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setC_BPartner_ID(int C_BPartner_ID);

    I_C_BPartner getC_BPartner() throws RuntimeException;

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
     * Set Allowed to be Published. You allow to publish the information, not just statistical summary
     * info
     */
    void setIsAllowPublish(boolean IsAllowPublish);

    /**
     * Get Allowed to be Published. You allow to publish the information, not just statistical summary
     * info
     */
    boolean isAllowPublish();

    /**
     * Set In Production. The system is in production
     */
    void setIsInProduction(boolean IsInProduction);

    /**
     * Get In Production. The system is in production
     */
    boolean isInProduction();

    /**
     * Set Registered. The application is registered.
     */
    void setIsRegistered(boolean IsRegistered);

    /**
     * Get Registered. The application is registered.
     */
    boolean isRegistered();

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    void setM_Product_ID(int M_Product_ID);

    I_M_Product getM_Product() throws RuntimeException;

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Note. Optional additional user defined information
     */
    String getNote();

    /**
     * Set Note. Optional additional user defined information
     */
    void setNote(String Note);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Remote Addr. Remote Address
     */
    String getRemote_Addr();

    /**
     * Set Remote Addr. Remote Address
     */
    void setRemote_Addr(String Remote_Addr);

    /**
     * Get Remote Host. Remote host Info
     */
    String getRemote_Host();

    /**
     * Set Remote Host. Remote host Info
     */
    void setRemote_Host(String Remote_Host);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
