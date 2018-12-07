package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for K_Index
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_K_Index {

    /**
     * TableName=K_Index
     */
    String Table_Name = "K_Index";

    /**
     * AD_Table_ID=900
     */
    int Table_ID = 900;

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
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name C_DocType_ID
     */
    String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
    /**
     * Column name CM_WebProject_ID
     */
    String COLUMNNAME_CM_WebProject_ID = "CM_WebProject_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Excerpt
     */
    String COLUMNNAME_Excerpt = "Excerpt";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name Keyword
     */
    String COLUMNNAME_Keyword = "Keyword";
    /**
     * Column name K_INDEX_ID
     */
    String COLUMNNAME_K_INDEX_ID = "K_INDEX_ID";
    /**
     * Column name K_Index_UU
     */
    String COLUMNNAME_K_Index_UU = "K_Index_UU";
    /**
     * Column name Record_ID
     */
    String COLUMNNAME_Record_ID = "Record_ID";
    /**
     * Column name R_RequestType_ID
     */
    String COLUMNNAME_R_RequestType_ID = "R_RequestType_ID";
    /**
     * Column name SourceUpdated
     */
    String COLUMNNAME_SourceUpdated = "SourceUpdated";
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
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    /**
     * Set Table. Database Table information
     */
    void setAD_Table_ID(int AD_Table_ID);

    I_AD_Table getAD_Table() throws RuntimeException;

    /**
     * Get Document Type. Document type or rules
     */
    int getC_DocType_ID();

    /**
     * Set Document Type. Document type or rules
     */
    void setC_DocType_ID(int C_DocType_ID);

    I_C_DocType getC_DocType() throws RuntimeException;

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
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Excerpt. Surrounding text of the keyword
     */
    String getExcerpt();

    /**
     * Set Excerpt. Surrounding text of the keyword
     */
    void setExcerpt(String Excerpt);

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
     * Get Index. Text Search Index
     */
    int getK_INDEX_ID();

    /**
     * Set Index. Text Search Index
     */
    void setK_INDEX_ID(int K_INDEX_ID);

    /**
     * Get K_Index_UU
     */
    String getK_Index_UU();

    /**
     * Set K_Index_UU
     */
    void setK_Index_UU(String K_Index_UU);

    /**
     * Get Record ID. Direct internal record ID
     */
    int getRecord_ID();

    /**
     * Set Record ID. Direct internal record ID
     */
    void setRecord_ID(int Record_ID);

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
     * Get Source Updated. Date the source document was updated
     */
    Timestamp getSourceUpdated();

    /**
     * Set Source Updated. Date the source document was updated
     */
    void setSourceUpdated(Timestamp SourceUpdated);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
