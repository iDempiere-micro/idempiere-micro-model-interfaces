package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_UserBPAccess
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_UserBPAccess {

    /**
     * TableName=AD_UserBPAccess
     */
    String Table_Name = "AD_UserBPAccess";

    /**
     * AD_Table_ID=813
     */
    int Table_ID = 813;

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
     * Column name AD_UserBPAccess_ID
     */
    String COLUMNNAME_AD_UserBPAccess_ID = "AD_UserBPAccess_ID";
    /**
     * Column name AD_UserBPAccess_UU
     */
    String COLUMNNAME_AD_UserBPAccess_UU = "AD_UserBPAccess_UU";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name BPAccessType
     */
    String COLUMNNAME_BPAccessType = "BPAccessType";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DocBaseType
     */
    String COLUMNNAME_DocBaseType = "DocBaseType";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name R_RequestType_ID
     */
    String COLUMNNAME_R_RequestType_ID = "R_RequestType_ID";
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
     * Get User BP Access. User/contact access to Business Partner information and resources
     */
    int getAD_UserBPAccess_ID();

    /**
     * Set User BP Access. User/contact access to Business Partner information and resources
     */
    void setAD_UserBPAccess_ID(int AD_UserBPAccess_ID);

    /**
     * Get AD_UserBPAccess_UU
     */
    String getAD_UserBPAccess_UU();

    /**
     * Set AD_UserBPAccess_UU
     */
    void setAD_UserBPAccess_UU(String AD_UserBPAccess_UU);

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
     * Get Access Type. Type of Access of the user/contact to Business Partner information and
     * resources
     */
    String getBPAccessType();

    /**
     * Set Access Type. Type of Access of the user/contact to Business Partner information and
     * resources
     */
    void setBPAccessType(String BPAccessType);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Document BaseType. Logical type of document
     */
    String getDocBaseType();

    /**
     * Set Document BaseType. Logical type of document
     */
    void setDocBaseType(String DocBaseType);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Request Type. Type of request (e.g. Inquiry, Complaint, ..)
     */
    int getR_RequestType_ID();

    /**
     * Set Request Type. Type of request (e.g. Inquiry, Complaint, ..)
     */
    void setR_RequestType_ID(int R_RequestType_ID);

    I_R_RequestType getR_RequestType() throws RuntimeException;

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
