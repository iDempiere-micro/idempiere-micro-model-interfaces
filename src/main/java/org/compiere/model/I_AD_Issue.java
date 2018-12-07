package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Issue
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Issue {

    /**
     * TableName=AD_Issue
     */
    String Table_Name = "AD_Issue";

    /**
     * AD_Table_ID=828
     */
    int Table_ID = 828;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name A_Asset_ID
     */
    String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
    /**
     * Column name AD_Form_ID
     */
    String COLUMNNAME_AD_Form_ID = "AD_Form_ID";
    /**
     * Column name AD_Issue_ID
     */
    String COLUMNNAME_AD_Issue_ID = "AD_Issue_ID";
    /**
     * Column name AD_Issue_UU
     */
    String COLUMNNAME_AD_Issue_UU = "AD_Issue_UU";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Process_ID
     */
    String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
    /**
     * Column name AD_Window_ID
     */
    String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
    /**
     * Column name Comments
     */
    String COLUMNNAME_Comments = "Comments";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DatabaseInfo
     */
    String COLUMNNAME_DatabaseInfo = "DatabaseInfo";
    /**
     * Column name DBAddress
     */
    String COLUMNNAME_DBAddress = "DBAddress";
    /**
     * Column name ErrorTrace
     */
    String COLUMNNAME_ErrorTrace = "ErrorTrace";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsReproducible
     */
    String COLUMNNAME_IsReproducible = "IsReproducible";
    /**
     * Column name IssueSource
     */
    String COLUMNNAME_IssueSource = "IssueSource";
    /**
     * Column name IssueSummary
     */
    String COLUMNNAME_IssueSummary = "IssueSummary";
    /**
     * Column name IsVanillaSystem
     */
    String COLUMNNAME_IsVanillaSystem = "IsVanillaSystem";
    /**
     * Column name JavaInfo
     */
    String COLUMNNAME_JavaInfo = "JavaInfo";
    /**
     * Column name LineNo
     */
    String COLUMNNAME_LineNo = "LineNo";
    /**
     * Column name Local_Host
     */
    String COLUMNNAME_Local_Host = "Local_Host";
    /**
     * Column name LoggerName
     */
    String COLUMNNAME_LoggerName = "LoggerName";
    /**
     * Column name OperatingSystemInfo
     */
    String COLUMNNAME_OperatingSystemInfo = "OperatingSystemInfo";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name ProfileInfo
     */
    String COLUMNNAME_ProfileInfo = "ProfileInfo";
    /**
     * Column name Record_ID
     */
    String COLUMNNAME_Record_ID = "Record_ID";
    /**
     * Column name ReleaseNo
     */
    String COLUMNNAME_ReleaseNo = "ReleaseNo";
    /**
     * Column name ReleaseTag
     */
    String COLUMNNAME_ReleaseTag = "ReleaseTag";
    /**
     * Column name Remote_Addr
     */
    String COLUMNNAME_Remote_Addr = "Remote_Addr";
    /**
     * Column name Remote_Host
     */
    String COLUMNNAME_Remote_Host = "Remote_Host";
    /**
     * Column name RequestDocumentNo
     */
    String COLUMNNAME_RequestDocumentNo = "RequestDocumentNo";
    /**
     * Column name ResponseText
     */
    String COLUMNNAME_ResponseText = "ResponseText";
    /**
     * Column name R_IssueKnown_ID
     */
    String COLUMNNAME_R_IssueKnown_ID = "R_IssueKnown_ID";
    /**
     * Column name R_IssueProject_ID
     */
    String COLUMNNAME_R_IssueProject_ID = "R_IssueProject_ID";
    /**
     * Column name R_IssueSystem_ID
     */
    String COLUMNNAME_R_IssueSystem_ID = "R_IssueSystem_ID";
    /**
     * Column name R_IssueUser_ID
     */
    String COLUMNNAME_R_IssueUser_ID = "R_IssueUser_ID";
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
     * Column name StackTrace
     */
    String COLUMNNAME_StackTrace = "StackTrace";
    /**
     * Column name StatisticsInfo
     */
    String COLUMNNAME_StatisticsInfo = "StatisticsInfo";
    /**
     * Column name SupportEMail
     */
    String COLUMNNAME_SupportEMail = "SupportEMail";
    /**
     * Column name SystemStatus
     */
    String COLUMNNAME_SystemStatus = "SystemStatus";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name UserName
     */
    String COLUMNNAME_UserName = "UserName";
    /**
     * Column name Version
     */
    String COLUMNNAME_Version = "Version";

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
     * Get Special Form. Special Form
     */
    int getAD_Form_ID();

    /**
     * Set Special Form. Special Form
     */
    void setAD_Form_ID(int AD_Form_ID);

    I_AD_Form getAD_Form() throws RuntimeException;

    /**
     * Get System Issue. Automatically created or manually entered System Issue
     */
    int getAD_Issue_ID();

    /**
     * Set System Issue. Automatically created or manually entered System Issue
     */
    void setAD_Issue_ID(int AD_Issue_ID);

    /**
     * Get AD_Issue_UU
     */
    String getAD_Issue_UU();

    /**
     * Set AD_Issue_UU
     */
    void setAD_Issue_UU(String AD_Issue_UU);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Process. Process or Report
     */
    int getAD_Process_ID();

    /**
     * Set Process. Process or Report
     */
    void setAD_Process_ID(int AD_Process_ID);

    I_AD_Process getAD_Process() throws RuntimeException;

    /**
     * Get Window. Data entry or display window
     */
    int getAD_Window_ID();

    /**
     * Set Window. Data entry or display window
     */
    void setAD_Window_ID(int AD_Window_ID);

    I_AD_Window getAD_Window() throws RuntimeException;

    /**
     * Get Comments. Comments or additional information
     */
    String getComments();

    /**
     * Set Comments. Comments or additional information
     */
    void setComments(String Comments);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Database. Database Information
     */
    String getDatabaseInfo();

    /**
     * Set Database. Database Information
     */
    void setDatabaseInfo(String DatabaseInfo);

    /**
     * Get DB Address. JDBC URL of the database server
     */
    String getDBAddress();

    /**
     * Set DB Address. JDBC URL of the database server
     */
    void setDBAddress(String DBAddress);

    /**
     * Get Error Trace. System Error Trace
     */
    String getErrorTrace();

    /**
     * Set Error Trace. System Error Trace
     */
    void setErrorTrace(String ErrorTrace);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Reproducible. Problem can re reproduced in Gardenworld
     */
    String getIsReproducible();

    /**
     * Set Reproducible. Problem can re reproduced in Gardenworld
     */
    void setIsReproducible(String IsReproducible);

    /**
     * Get Source. Issue Source
     */
    String getIssueSource();

    /**
     * Set Source. Issue Source
     */
    void setIssueSource(String IssueSource);

    /**
     * Get Issue Summary. Issue Summary
     */
    String getIssueSummary();

    /**
     * Set Issue Summary. Issue Summary
     */
    void setIssueSummary(String IssueSummary);

    /**
     * Get Vanilla System. The system was NOT compiled from Source - i.e. standard distribution
     */
    String getIsVanillaSystem();

    /**
     * Set Vanilla System. The system was NOT compiled from Source - i.e. standard distribution
     */
    void setIsVanillaSystem(String IsVanillaSystem);

    /**
     * Get Java Info. Java Version Info
     */
    String getJavaInfo();

    /**
     * Set Java Info. Java Version Info
     */
    void setJavaInfo(String JavaInfo);

    /**
     * Get Line. Line No
     */
    int getLineNo();

    /**
     * Set Line. Line No
     */
    void setLineNo(int LineNo);

    /**
     * Get Local Host. Local Host Info
     */
    String getLocal_Host();

    /**
     * Set Local Host. Local Host Info
     */
    void setLocal_Host(String Local_Host);

    /**
     * Get Logger. Logger Name
     */
    String getLoggerName();

    /**
     * Set Logger. Logger Name
     */
    void setLoggerName(String LoggerName);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Operating System. Operating System Info
     */
    String getOperatingSystemInfo();

    /**
     * Set Operating System. Operating System Info
     */
    void setOperatingSystemInfo(String OperatingSystemInfo);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Profile. Information to help profiling the system for solving support issues
     */
    String getProfileInfo();

    /**
     * Set Profile. Information to help profiling the system for solving support issues
     */
    void setProfileInfo(String ProfileInfo);

    /**
     * Get Record ID. Direct internal record ID
     */
    int getRecord_ID();

    /**
     * Set Record ID. Direct internal record ID
     */
    void setRecord_ID(int Record_ID);

    /**
     * Get Release No. Internal Release Number
     */
    String getReleaseNo();

    /**
     * Set Release No. Internal Release Number
     */
    void setReleaseNo(String ReleaseNo);

    /**
     * Get Release Tag. Release Tag
     */
    String getReleaseTag();

    /**
     * Set Release Tag. Release Tag
     */
    void setReleaseTag(String ReleaseTag);

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
     * Get Request Document No. iDempiere Request Document No
     */
    String getRequestDocumentNo();

    /**
     * Set Request Document No. iDempiere Request Document No
     */
    void setRequestDocumentNo(String RequestDocumentNo);

    /**
     * Get Response Text. Request Response Text
     */
    String getResponseText();

    /**
     * Set Response Text. Request Response Text
     */
    void setResponseText(String ResponseText);

    /**
     * Get Known Issue. Known Issue
     */
    int getR_IssueKnown_ID();

    /**
     * Set Known Issue. Known Issue
     */
    void setR_IssueKnown_ID(int R_IssueKnown_ID);

    I_R_IssueKnown getR_IssueKnown() throws RuntimeException;

    /**
     * Get Issue Project. Implementation Projects
     */
    int getR_IssueProject_ID();

    /**
     * Set Issue Project. Implementation Projects
     */
    void setR_IssueProject_ID(int R_IssueProject_ID);

    I_R_IssueProject getR_IssueProject() throws RuntimeException;

    /**
     * Get Issue System. System creating the issue
     */
    int getR_IssueSystem_ID();

    /**
     * Set Issue System. System creating the issue
     */
    void setR_IssueSystem_ID(int R_IssueSystem_ID);

    I_R_IssueSystem getR_IssueSystem() throws RuntimeException;

    /**
     * Get IssueUser. User who reported issues
     */
    int getR_IssueUser_ID();

    /**
     * Set IssueUser. User who reported issues
     */
    void setR_IssueUser_ID(int R_IssueUser_ID);

    I_R_IssueUser getR_IssueUser() throws RuntimeException;

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
     * Get Stack Trace. System Log Trace
     */
    String getStackTrace();

    /**
     * Set Stack Trace. System Log Trace
     */
    void setStackTrace(String StackTrace);

    /**
     * Get Statistics. Information to help profiling the system for solving support issues
     */
    String getStatisticsInfo();

    /**
     * Set Statistics. Information to help profiling the system for solving support issues
     */
    void setStatisticsInfo(String StatisticsInfo);

    /**
     * Get Support EMail. EMail address to send support information and updates to
     */
    String getSupportEMail();

    /**
     * Set Support EMail. EMail address to send support information and updates to
     */
    void setSupportEMail(String SupportEMail);

    /**
     * Get System Status. Status of the system - Support priority depends on system status
     */
    String getSystemStatus();

    /**
     * Set System Status. Status of the system - Support priority depends on system status
     */
    void setSystemStatus(String SystemStatus);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get User Name
     */
    String getUserName();

    /**
     * Set User Name
     */
    void setUserName(String UserName);

    /**
     * Get Version. Version of the table definition
     */
    String getVersion();

    /**
     * Set Version. Version of the table definition
     */
    void setVersion(String Version);
}
