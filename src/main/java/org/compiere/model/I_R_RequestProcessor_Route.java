package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for R_RequestProcessor_Route
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_RequestProcessor_Route {

    /**
     * TableName=R_RequestProcessor_Route
     */
    String Table_Name = "R_RequestProcessor_Route";

    /**
     * AD_Table_ID=474
     */
    int Table_ID = 474;

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
     * Column name Keyword
     */
    String COLUMNNAME_Keyword = "Keyword";
    /**
     * Column name R_RequestProcessor_ID
     */
    String COLUMNNAME_R_RequestProcessor_ID = "R_RequestProcessor_ID";
    /**
     * Column name R_RequestProcessor_Route_ID
     */
    String COLUMNNAME_R_RequestProcessor_Route_ID = "R_RequestProcessor_Route_ID";
    /**
     * Column name R_RequestProcessor_Route_UU
     */
    String COLUMNNAME_R_RequestProcessor_Route_UU = "R_RequestProcessor_Route_UU";
    /**
     * Column name R_RequestType_ID
     */
    String COLUMNNAME_R_RequestType_ID = "R_RequestType_ID";
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
     * Get Keyword. Case insensitive keyword
     */
    String getKeyword();

    /**
     * Set Keyword. Case insensitive keyword
     */
    void setKeyword(String Keyword);

    /**
     * Get Request Processor. Processor for Requests
     */
    int getR_RequestProcessor_ID();

    /**
     * Set Request Processor. Processor for Requests
     */
    void setR_RequestProcessor_ID(int R_RequestProcessor_ID);

    I_R_RequestProcessor getR_RequestProcessor() throws RuntimeException;

    /**
     * Get Request Routing. Automatic routing of requests
     */
    int getR_RequestProcessor_Route_ID();

    /**
     * Set Request Routing. Automatic routing of requests
     */
    void setR_RequestProcessor_Route_ID(int R_RequestProcessor_Route_ID);

    /**
     * Get R_RequestProcessor_Route_UU
     */
    String getR_RequestProcessor_Route_UU();

    /**
     * Set R_RequestProcessor_Route_UU
     */
    void setR_RequestProcessor_Route_UU(String R_RequestProcessor_Route_UU);

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
