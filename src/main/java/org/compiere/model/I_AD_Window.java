package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Window
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Window {

    /**
     * TableName=AD_Window
     */
    String Table_Name = "AD_Window";

    /**
     * AD_Table_ID=105
     */
    int Table_ID = 105;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_Color_ID
     */
    String COLUMNNAME_AD_Color_ID = "AD_Color_ID";
    /**
     * Column name AD_Image_ID
     */
    String COLUMNNAME_AD_Image_ID = "AD_Image_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Window_ID
     */
    String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
    /**
     * Column name AD_Window_UU
     */
    String COLUMNNAME_AD_Window_UU = "AD_Window_UU";
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
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsBetaFunctionality
     */
    String COLUMNNAME_IsBetaFunctionality = "IsBetaFunctionality";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name IsSOTrx
     */
    String COLUMNNAME_IsSOTrx = "IsSOTrx";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name TitleLogic
     */
    String COLUMNNAME_TitleLogic = "TitleLogic";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name WindowType
     */
    String COLUMNNAME_WindowType = "WindowType";
    /**
     * Column name WinHeight
     */
    String COLUMNNAME_WinHeight = "WinHeight";
    /**
     * Column name WinWidth
     */
    String COLUMNNAME_WinWidth = "WinWidth";

    /**
     * Get System Color. Color for backgrounds or indicators
     */
    int getAD_Color_ID();

    /**
     * Set System Color. Color for backgrounds or indicators
     */
    void setAD_Color_ID(int AD_Color_ID);

    I_AD_Color getAD_Color() throws RuntimeException;

    /**
     * Get Image. Image or Icon
     */
    int getAD_Image_ID();

    /**
     * Set Image. Image or Icon
     */
    void setAD_Image_ID(int AD_Image_ID);

    I_AD_Image getAD_Image() throws RuntimeException;

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Window. Data entry or display window
     */
    int getAD_Window_ID();

    /**
     * Set Window. Data entry or display window
     */
    void setAD_Window_ID(int AD_Window_ID);

    /**
     * Get AD_Window_UU
     */
    String getAD_Window_UU();

    /**
     * Set AD_Window_UU
     */
    void setAD_Window_UU(String AD_Window_UU);

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
     * Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    String getEntityType();

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    void setEntityType(String EntityType);

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
     * Set Beta Functionality. This functionality is considered Beta
     */
    void setIsBetaFunctionality(boolean IsBetaFunctionality);

    /**
     * Get Beta Functionality. This functionality is considered Beta
     */
    boolean isBetaFunctionality();

    /**
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    boolean isDefault();

    /**
     * Set Sales Transaction. This is a Sales Transaction
     */
    void setIsSOTrx(boolean IsSOTrx);

    /**
     * Get Sales Transaction. This is a Sales Transaction
     */
    boolean isSOTrx();

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
     * Get Title Logic. The result determines the title to be displayed for this window
     */
    String getTitleLogic();

    /**
     * Set Title Logic. The result determines the title to be displayed for this window
     */
    void setTitleLogic(String TitleLogic);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get WindowType. Type or classification of a Window
     */
    String getWindowType();

    /**
     * Set WindowType. Type or classification of a Window
     */
    void setWindowType(String WindowType);

    /**
     * Get Window Height
     */
    int getWinHeight();

    /**
     * Set Window Height
     */
    void setWinHeight(int WinHeight);

    /**
     * Get Window Width
     */
    int getWinWidth();

    /**
     * Set Window Width
     */
    void setWinWidth(int WinWidth);
}
