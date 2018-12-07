package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for CM_CStage
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_CM_CStage {

    /**
     * TableName=CM_CStage
     */
    String Table_Name = "CM_CStage";

    /**
     * AD_Table_ID=866
     */
    int Table_ID = 866;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name CM_CStage_ID
     */
    String COLUMNNAME_CM_CStage_ID = "CM_CStage_ID";
    /**
     * Column name CM_CStageLink_ID
     */
    String COLUMNNAME_CM_CStageLink_ID = "CM_CStageLink_ID";
    /**
     * Column name CM_CStage_UU
     */
    String COLUMNNAME_CM_CStage_UU = "CM_CStage_UU";
    /**
     * Column name CM_Template_ID
     */
    String COLUMNNAME_CM_Template_ID = "CM_Template_ID";
    /**
     * Column name CM_WebProject_ID
     */
    String COLUMNNAME_CM_WebProject_ID = "CM_WebProject_ID";
    /**
     * Column name ContainerLinkURL
     */
    String COLUMNNAME_ContainerLinkURL = "ContainerLinkURL";
    /**
     * Column name ContainerType
     */
    String COLUMNNAME_ContainerType = "ContainerType";
    /**
     * Column name ContainerXML
     */
    String COLUMNNAME_ContainerXML = "ContainerXML";
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
     * Column name IsIndexed
     */
    String COLUMNNAME_IsIndexed = "IsIndexed";
    /**
     * Column name IsModified
     */
    String COLUMNNAME_IsModified = "IsModified";
    /**
     * Column name IsSecure
     */
    String COLUMNNAME_IsSecure = "IsSecure";
    /**
     * Column name IsSummary
     */
    String COLUMNNAME_IsSummary = "IsSummary";
    /**
     * Column name IsValid
     */
    String COLUMNNAME_IsValid = "IsValid";
    /**
     * Column name Meta_Author
     */
    String COLUMNNAME_Meta_Author = "Meta_Author";
    /**
     * Column name Meta_Content
     */
    String COLUMNNAME_Meta_Content = "Meta_Content";
    /**
     * Column name Meta_Copyright
     */
    String COLUMNNAME_Meta_Copyright = "Meta_Copyright";
    /**
     * Column name Meta_Description
     */
    String COLUMNNAME_Meta_Description = "Meta_Description";
    /**
     * Column name Meta_Keywords
     */
    String COLUMNNAME_Meta_Keywords = "Meta_Keywords";
    /**
     * Column name Meta_Language
     */
    String COLUMNNAME_Meta_Language = "Meta_Language";
    /**
     * Column name Meta_Publisher
     */
    String COLUMNNAME_Meta_Publisher = "Meta_Publisher";
    /**
     * Column name Meta_RobotsTag
     */
    String COLUMNNAME_Meta_RobotsTag = "Meta_RobotsTag";
    /**
     * Column name Notice
     */
    String COLUMNNAME_Notice = "Notice";
    /**
     * Column name Priority
     */
    String COLUMNNAME_Priority = "Priority";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name RelativeURL
     */
    String COLUMNNAME_RelativeURL = "RelativeURL";
    /**
     * Column name StructureXML
     */
    String COLUMNNAME_StructureXML = "StructureXML";
    /**
     * Column name Title
     */
    String COLUMNNAME_Title = "Title";
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
     * Get Web Container Stage. Web Container Stage contains the staging content like images, text
     * etc.
     */
    int getCM_CStage_ID();

    /**
     * Set Web Container Stage. Web Container Stage contains the staging content like images, text
     * etc.
     */
    void setCM_CStage_ID(int CM_CStage_ID);

    /**
     * Get Container Link. Stage Link to another Container in the Web Project
     */
    int getCM_CStageLink_ID();

    /**
     * Set Container Link. Stage Link to another Container in the Web Project
     */
    void setCM_CStageLink_ID(int CM_CStageLink_ID);

    I_CM_CStage getCM_CStageLink() throws RuntimeException;

    /**
     * Get CM_CStage_UU
     */
    String getCM_CStage_UU();

    /**
     * Set CM_CStage_UU
     */
    void setCM_CStage_UU(String CM_CStage_UU);

    /**
     * Get Template. Template defines how content is displayed
     */
    int getCM_Template_ID();

    /**
     * Set Template. Template defines how content is displayed
     */
    void setCM_Template_ID(int CM_Template_ID);

    I_CM_Template getCM_Template() throws RuntimeException;

    /**
     * Get Web Project. A web project is the main data container for Containers, URLs, Ads, Media etc.
     */
    int getCM_WebProject_ID();

    /**
     * Set Web Project. A web project is the main data container for Containers, URLs, Ads, Media etc.
     */
    void setCM_WebProject_ID(int CM_WebProject_ID);

    I_CM_WebProject getCM_WebProject() throws RuntimeException;

    /**
     * Get External Link (URL). External Link (URL) for the Container
     */
    String getContainerLinkURL();

    /**
     * Set External Link (URL). External Link (URL) for the Container
     */
    void setContainerLinkURL(String ContainerLinkURL);

    /**
     * Get Web Container Type. Web Container Type
     */
    String getContainerType();

    /**
     * Set Web Container Type. Web Container Type
     */
    void setContainerType(String ContainerType);

    /**
     * Get ContainerXML. Autogenerated Containerdefinition as XML Code
     */
    String getContainerXML();

    /**
     * Set ContainerXML. Autogenerated Containerdefinition as XML Code
     */
    void setContainerXML(String ContainerXML);

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
     * Set Indexed. Index the document for the internal search engine
     */
    void setIsIndexed(boolean IsIndexed);

    /**
     * Get Indexed. Index the document for the internal search engine
     */
    boolean isIndexed();

    /**
     * Set Modified. The record is modified
     */
    void setIsModified(boolean IsModified);

    /**
     * Get Modified. The record is modified
     */
    boolean isModified();

    /**
     * Set Secure content. Defines whether content must be treated as secure
     */
    void setIsSecure(boolean IsSecure);

    /**
     * Get Secure content. Defines whether content must be treated as secure
     */
    boolean isSecure();

    /**
     * Set Summary Level. This is a summary entity
     */
    void setIsSummary(boolean IsSummary);

    /**
     * Get Summary Level. This is a summary entity
     */
    boolean isSummary();

    /**
     * Set Valid. Element is valid
     */
    void setIsValid(boolean IsValid);

    /**
     * Get Valid. Element is valid
     */
    boolean isValid();

    /**
     * Get Meta Author. Author of the content
     */
    String getMeta_Author();

    /**
     * Set Meta Author. Author of the content
     */
    void setMeta_Author(String Meta_Author);

    /**
     * Get Meta Content Type. Defines the type of content i.e. "text/html; charset=UTF-8"
     */
    String getMeta_Content();

    /**
     * Set Meta Content Type. Defines the type of content i.e. "text/html; charset=UTF-8"
     */
    void setMeta_Content(String Meta_Content);

    /**
     * Get Meta Copyright. Contains Copyright information for the content
     */
    String getMeta_Copyright();

    /**
     * Set Meta Copyright. Contains Copyright information for the content
     */
    void setMeta_Copyright(String Meta_Copyright);

    /**
     * Get Meta Description. Meta info describing the contents of the page
     */
    String getMeta_Description();

    /**
     * Set Meta Description. Meta info describing the contents of the page
     */
    void setMeta_Description(String Meta_Description);

    /**
     * Get Meta Keywords. Contains the keywords for the content
     */
    String getMeta_Keywords();

    /**
     * Set Meta Keywords. Contains the keywords for the content
     */
    void setMeta_Keywords(String Meta_Keywords);

    /**
     * Get Meta Language. Language HTML Meta Tag
     */
    String getMeta_Language();

    /**
     * Set Meta Language. Language HTML Meta Tag
     */
    void setMeta_Language(String Meta_Language);

    /**
     * Get Meta Publisher. Meta Publisher defines the publisher of the content
     */
    String getMeta_Publisher();

    /**
     * Set Meta Publisher. Meta Publisher defines the publisher of the content
     */
    void setMeta_Publisher(String Meta_Publisher);

    /**
     * Get Meta RobotsTag. RobotsTag defines how search robots should handle this content
     */
    String getMeta_RobotsTag();

    /**
     * Set Meta RobotsTag. RobotsTag defines how search robots should handle this content
     */
    void setMeta_RobotsTag(String Meta_RobotsTag);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Notice. Contains last write notice
     */
    String getNotice();

    /**
     * Set Notice. Contains last write notice
     */
    void setNotice(String Notice);

    /**
     * Get Priority. Indicates if this request is of a high, medium or low priority.
     */
    int getPriority();

    /**
     * Set Priority. Indicates if this request is of a high, medium or low priority.
     */
    void setPriority(int Priority);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Relative URL. Contains the relative URL for the container
     */
    String getRelativeURL();

    /**
     * Set Relative URL. Contains the relative URL for the container
     */
    void setRelativeURL(String RelativeURL);

    /**
     * Get StructureXML. Autogenerated Containerdefinition as XML Code
     */
    String getStructureXML();

    /**
     * Set StructureXML. Autogenerated Containerdefinition as XML Code
     */
    void setStructureXML(String StructureXML);

    /**
     * Get Title. Name this entity is referred to as
     */
    String getTitle();

    /**
     * Set Title. Name this entity is referred to as
     */
    void setTitle(String Title);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
