package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for R_IssueKnown
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_IssueKnown {

    /**
     * TableName=R_IssueKnown
     */
    String Table_Name = "R_IssueKnown";

    /**
     * AD_Table_ID=839
     */
    int Table_ID = 839;

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
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IssueStatus
     */
    String COLUMNNAME_IssueStatus = "IssueStatus";
    /**
     * Column name IssueSummary
     */
    String COLUMNNAME_IssueSummary = "IssueSummary";
    /**
     * Column name LineNo
     */
    String COLUMNNAME_LineNo = "LineNo";
    /**
     * Column name LoggerName
     */
    String COLUMNNAME_LoggerName = "LoggerName";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name ReleaseNo
     */
    String COLUMNNAME_ReleaseNo = "ReleaseNo";
    /**
     * Column name R_IssueKnown_ID
     */
    String COLUMNNAME_R_IssueKnown_ID = "R_IssueKnown_ID";
    /**
     * Column name R_IssueKnown_UU
     */
    String COLUMNNAME_R_IssueKnown_UU = "R_IssueKnown_UU";
    /**
     * Column name R_IssueRecommendation_ID
     */
    String COLUMNNAME_R_IssueRecommendation_ID = "R_IssueRecommendation_ID";
    /**
     * Column name R_IssueStatus_ID
     */
    String COLUMNNAME_R_IssueStatus_ID = "R_IssueStatus_ID";
    /**
     * Column name R_Request_ID
     */
    String COLUMNNAME_R_Request_ID = "R_Request_ID";
    /**
     * Column name SourceClassName
     */
    String COLUMNNAME_SourceClassName = "SourceClassName";
    /**
     * Column name SourceMethodName
     */
    String COLUMNNAME_SourceMethodName = "SourceMethodName";
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
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Issue Status. Current Status of the Issue
     */
    String getIssueStatus();

    /**
     * Set Issue Status. Current Status of the Issue
     */
    void setIssueStatus(String IssueStatus);

    /**
     * Get Issue Summary. Issue Summary
     */
    String getIssueSummary();

    /**
     * Set Issue Summary. Issue Summary
     */
    void setIssueSummary(String IssueSummary);

    /**
     * Get Line. Line No
     */
    int getLineNo();

    /**
     * Set Line. Line No
     */
    void setLineNo(int LineNo);

    /**
     * Get Logger. Logger Name
     */
    String getLoggerName();

    /**
     * Set Logger. Logger Name
     */
    void setLoggerName(String LoggerName);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Release No. Internal Release Number
     */
    String getReleaseNo();

    /**
     * Set Release No. Internal Release Number
     */
    void setReleaseNo(String ReleaseNo);

    /**
     * Get Known Issue. Known Issue
     */
    int getR_IssueKnown_ID();

    /**
     * Set Known Issue. Known Issue
     */
    void setR_IssueKnown_ID(int R_IssueKnown_ID);

    /**
     * Get R_IssueKnown_UU
     */
    String getR_IssueKnown_UU();

    /**
     * Set R_IssueKnown_UU
     */
    void setR_IssueKnown_UU(String R_IssueKnown_UU);

    /**
     * Get Issue Recommendation. Recommendations how to fix an Issue
     */
    int getR_IssueRecommendation_ID();

    /**
     * Set Issue Recommendation. Recommendations how to fix an Issue
     */
    void setR_IssueRecommendation_ID(int R_IssueRecommendation_ID);

    I_R_IssueRecommendation getR_IssueRecommendation() throws RuntimeException;

    /**
     * Get Issue Status. Status of an Issue
     */
    int getR_IssueStatus_ID();

    /**
     * Set Issue Status. Status of an Issue
     */
    void setR_IssueStatus_ID(int R_IssueStatus_ID);

    I_R_IssueStatus getR_IssueStatus() throws RuntimeException;

    /**
     * Get Request. Request from a Business Partner or Prospect
     */
    int getR_Request_ID();

    /**
     * Set Request. Request from a Business Partner or Prospect
     */
    void setR_Request_ID(int R_Request_ID);

    I_R_Request getR_Request() throws RuntimeException;

    /**
     * Get Source Class. Source Class Name
     */
    String getSourceClassName();

    /**
     * Set Source Class. Source Class Name
     */
    void setSourceClassName(String SourceClassName);

    /**
     * Get Source Method. Source Method Name
     */
    String getSourceMethodName();

    /**
     * Set Source Method. Source Method Name
     */
    void setSourceMethodName(String SourceMethodName);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
