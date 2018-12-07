package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for U_WebMenu
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_U_WebMenu {

    /**
     * TableName=U_WebMenu
     */
    String Table_Name = "U_WebMenu";

    /**
     * AD_Table_ID=52003
     */
    int Table_ID = 52003;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name Category
     */
    String COLUMNNAME_Category = "Category";
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
     * Column name HasSubMenu
     */
    String COLUMNNAME_HasSubMenu = "HasSubMenu";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name ImageLink
     */
    String COLUMNNAME_ImageLink = "ImageLink";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name MenuLink
     */
    String COLUMNNAME_MenuLink = "MenuLink";
    /**
     * Column name Module
     */
    String COLUMNNAME_Module = "Module";
    /**
     * Column name ParentMenu_ID
     */
    String COLUMNNAME_ParentMenu_ID = "ParentMenu_ID";
    /**
     * Column name Position
     */
    String COLUMNNAME_Position = "Position";
    /**
     * Column name Sequence
     */
    String COLUMNNAME_Sequence = "Sequence";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name U_WebMenu_ID
     */
    String COLUMNNAME_U_WebMenu_ID = "U_WebMenu_ID";
    /**
     * Column name U_WebMenu_UU
     */
    String COLUMNNAME_U_WebMenu_UU = "U_WebMenu_UU";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Category
     */
    String getCategory();

    /**
     * Set Category
     */
    void setCategory(String Category);

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
     * Get Has SubMenu
     */
    boolean isHasSubMenu();

    /**
     * Set Has SubMenu
     */
    void setHasSubMenu(boolean HasSubMenu);

    /**
     * Get Comment/Help. Comment or Hint
     */
    String getHelp();

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

    /**
     * Get Image Link
     */
    String getImageLink();

    /**
     * Set Image Link
     */
    void setImageLink(String ImageLink);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Menu Link
     */
    String getMenuLink();

    /**
     * Set Menu Link
     */
    void setMenuLink(String MenuLink);

    /**
     * Get Module
     */
    String getModule();

    /**
     * Set Module
     */
    void setModule(String Module);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Parent Menu
     */
    int getParentMenu_ID();

    /**
     * Set Parent Menu
     */
    void setParentMenu_ID(int ParentMenu_ID);

    I_U_WebMenu getParentMenu() throws RuntimeException;

    /**
     * Get Position
     */
    String getPosition();

    /**
     * Set Position
     */
    void setPosition(String Position);

    /**
     * Get Sequence
     */
    BigDecimal getSequence();

    /**
     * Set Sequence
     */
    void setSequence(BigDecimal Sequence);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Web Menu
     */
    int getU_WebMenu_ID();

    /**
     * Set Web Menu
     */
    void setU_WebMenu_ID(int U_WebMenu_ID);

    /**
     * Get U_WebMenu_UU
     */
    String getU_WebMenu_UU();

    /**
     * Set U_WebMenu_UU
     */
    void setU_WebMenu_UU(String U_WebMenu_UU);
}
