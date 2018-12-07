package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for W_Advertisement
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_W_Advertisement {

    /**
     * TableName=W_Advertisement
     */
    String Table_Name = "W_Advertisement";

    /**
     * AD_Table_ID=579
     */
    int Table_ID = 579;

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
     * Column name AdText
     */
    String COLUMNNAME_AdText = "AdText";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
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
     * Column name ImageURL
     */
    String COLUMNNAME_ImageURL = "ImageURL";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsSelfService
     */
    String COLUMNNAME_IsSelfService = "IsSelfService";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name PublishStatus
     */
    String COLUMNNAME_PublishStatus = "PublishStatus";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name ValidFrom
     */
    String COLUMNNAME_ValidFrom = "ValidFrom";
    /**
     * Column name ValidTo
     */
    String COLUMNNAME_ValidTo = "ValidTo";
    /**
     * Column name Version
     */
    String COLUMNNAME_Version = "Version";
    /**
     * Column name W_Advertisement_ID
     */
    String COLUMNNAME_W_Advertisement_ID = "W_Advertisement_ID";
    /**
     * Column name W_Advertisement_UU
     */
    String COLUMNNAME_W_Advertisement_UU = "W_Advertisement_UU";
    /**
     * Column name W_ClickCount_ID
     */
    String COLUMNNAME_W_ClickCount_ID = "W_ClickCount_ID";
    /**
     * Column name W_CounterCount_ID
     */
    String COLUMNNAME_W_CounterCount_ID = "W_CounterCount_ID";
    /**
     * Column name WebParam1
     */
    String COLUMNNAME_WebParam1 = "WebParam1";
    /**
     * Column name WebParam2
     */
    String COLUMNNAME_WebParam2 = "WebParam2";
    /**
     * Column name WebParam3
     */
    String COLUMNNAME_WebParam3 = "WebParam3";
    /**
     * Column name WebParam4
     */
    String COLUMNNAME_WebParam4 = "WebParam4";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Advertisement Text. Text of the Advertisement
     */
    String getAdText();

    /**
     * Set Advertisement Text. Text of the Advertisement
     */
    void setAdText(String AdText);

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
     * Get Image URL. URL of image
     */
    String getImageURL();

    /**
     * Set Image URL. URL of image
     */
    void setImageURL(String ImageURL);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
     */
    void setIsSelfService(boolean IsSelfService);

    /**
     * Get Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
     */
    boolean isSelfService();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Publication Status. Status of Publication
     */
    String getPublishStatus();

    /**
     * Set Publication Status. Status of Publication
     */
    void setPublishStatus(String PublishStatus);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Valid from. Valid from including this date (first day)
     */
    Timestamp getValidFrom();

    /**
     * Set Valid from. Valid from including this date (first day)
     */
    void setValidFrom(Timestamp ValidFrom);

    /**
     * Get Valid to. Valid to including this date (last day)
     */
    Timestamp getValidTo();

    /**
     * Set Valid to. Valid to including this date (last day)
     */
    void setValidTo(Timestamp ValidTo);

    /**
     * Get Version. Version of the table definition
     */
    int getVersion();

    /**
     * Set Version. Version of the table definition
     */
    void setVersion(int Version);

    /**
     * Get Advertisement. Web Advertisement
     */
    int getW_Advertisement_ID();

    /**
     * Set Advertisement. Web Advertisement
     */
    void setW_Advertisement_ID(int W_Advertisement_ID);

    /**
     * Get W_Advertisement_UU
     */
    String getW_Advertisement_UU();

    /**
     * Set W_Advertisement_UU
     */
    void setW_Advertisement_UU(String W_Advertisement_UU);

    /**
     * Get Click Count. Web Click Management
     */
    int getW_ClickCount_ID();

    /**
     * Set Click Count. Web Click Management
     */
    void setW_ClickCount_ID(int W_ClickCount_ID);

    I_W_ClickCount getW_ClickCount() throws RuntimeException;

    /**
     * Get Counter Count. Web Counter Count Management
     */
    int getW_CounterCount_ID();

    /**
     * Set Counter Count. Web Counter Count Management
     */
    void setW_CounterCount_ID(int W_CounterCount_ID);

    I_W_CounterCount getW_CounterCount() throws RuntimeException;

    /**
     * Get Web Parameter 1. Web Site Parameter 1 (default: header image)
     */
    String getWebParam1();

    /**
     * Set Web Parameter 1. Web Site Parameter 1 (default: header image)
     */
    void setWebParam1(String WebParam1);

    /**
     * Get Web Parameter 2. Web Site Parameter 2 (default index page)
     */
    String getWebParam2();

    /**
     * Set Web Parameter 2. Web Site Parameter 2 (default index page)
     */
    void setWebParam2(String WebParam2);

    /**
     * Get Web Parameter 3. Web Site Parameter 3 (default left - menu)
     */
    String getWebParam3();

    /**
     * Set Web Parameter 3. Web Site Parameter 3 (default left - menu)
     */
    void setWebParam3(String WebParam3);

    /**
     * Get Web Parameter 4. Web Site Parameter 4 (default footer left)
     */
    String getWebParam4();

    /**
     * Set Web Parameter 4. Web Site Parameter 4 (default footer left)
     */
    void setWebParam4(String WebParam4);
}
