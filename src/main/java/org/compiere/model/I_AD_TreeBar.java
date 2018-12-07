package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_TreeBar
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_TreeBar {

    /**
     * TableName=AD_TreeBar
     */
    String Table_Name = "AD_TreeBar";

    /**
     * AD_Table_ID=456
     */
    int Table_ID = 456;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /**
     * Column name AD_Menu_ID
     */
    String COLUMNNAME_AD_Menu_ID = "AD_Menu_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_TreeBar_UU
     */
    String COLUMNNAME_AD_TreeBar_UU = "AD_TreeBar_UU";
    /**
     * Column name AD_Tree_ID
     */
    String COLUMNNAME_AD_Tree_ID = "AD_Tree_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsFavourite
     */
    String COLUMNNAME_IsFavourite = "IsFavourite";
    /**
     * Column name LoginOpenSeqNo
     */
    String COLUMNNAME_LoginOpenSeqNo = "LoginOpenSeqNo";
    /**
     * Column name Node_ID
     */
    String COLUMNNAME_Node_ID = "Node_ID";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Menu. Identifies a Menu
     */
    int getAD_Menu_ID();

    /**
     * Set Menu. Identifies a Menu
     */
    void setAD_Menu_ID(int AD_Menu_ID);

    I_AD_Menu getAD_Menu() throws RuntimeException;

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get AD_TreeBar_UU
     */
    String getAD_TreeBar_UU();

    /**
     * Set AD_TreeBar_UU
     */
    void setAD_TreeBar_UU(String AD_TreeBar_UU);

    /**
     * Get Tree. Identifies a Tree
     */
    int getAD_Tree_ID();

    /**
     * Set Tree. Identifies a Tree
     */
    void setAD_Tree_ID(int AD_Tree_ID);

    I_AD_Tree getAD_Tree() throws RuntimeException;

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
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Favourite. This record is a favourite
     */
    void setIsFavourite(boolean IsFavourite);

    /**
     * Get Favourite. This record is a favourite
     */
    boolean isFavourite();

    /**
     * Get Login automatic open sequence. Determine the order items will be automatically opened when
     * user logs in
     */
    int getLoginOpenSeqNo();

    /**
     * Set Login automatic open sequence. Determine the order items will be automatically opened when
     * user logs in
     */
    void setLoginOpenSeqNo(int LoginOpenSeqNo);

    /**
     * Get Node
     */
    int getNode_ID();

    /**
     * Set Node
     */
    void setNode_ID(int Node_ID);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
