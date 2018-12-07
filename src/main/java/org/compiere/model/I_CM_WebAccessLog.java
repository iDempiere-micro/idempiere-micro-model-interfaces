package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for CM_WebAccessLog
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_CM_WebAccessLog {

    /**
     * TableName=CM_WebAccessLog
     */
    String Table_Name = "CM_WebAccessLog";

    /**
     * AD_Table_ID=894
     */
    int Table_ID = 894;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AcceptLanguage
     */
    String COLUMNNAME_AcceptLanguage = "AcceptLanguage";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name CM_BroadcastServer_ID
     */
    String COLUMNNAME_CM_BroadcastServer_ID = "CM_BroadcastServer_ID";
    /**
     * Column name CM_Media_ID
     */
    String COLUMNNAME_CM_Media_ID = "CM_Media_ID";
    /**
     * Column name CM_WebAccessLog_ID
     */
    String COLUMNNAME_CM_WebAccessLog_ID = "CM_WebAccessLog_ID";
    /**
     * Column name CM_WebAccessLog_UU
     */
    String COLUMNNAME_CM_WebAccessLog_UU = "CM_WebAccessLog_UU";
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
     * Column name FileSize
     */
    String COLUMNNAME_FileSize = "FileSize";
    /**
     * Column name Hyphen
     */
    String COLUMNNAME_Hyphen = "Hyphen";
    /**
     * Column name IP_Address
     */
    String COLUMNNAME_IP_Address = "IP_Address";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name LogType
     */
    String COLUMNNAME_LogType = "LogType";
    /**
     * Column name PageURL
     */
    String COLUMNNAME_PageURL = "PageURL";
    /**
     * Column name Protocol
     */
    String COLUMNNAME_Protocol = "Protocol";
    /**
     * Column name Referrer
     */
    String COLUMNNAME_Referrer = "Referrer";
    /**
     * Column name Remote_Addr
     */
    String COLUMNNAME_Remote_Addr = "Remote_Addr";
    /**
     * Column name Remote_Host
     */
    String COLUMNNAME_Remote_Host = "Remote_Host";
    /**
     * Column name RequestType
     */
    String COLUMNNAME_RequestType = "RequestType";
    /**
     * Column name StatusCode
     */
    String COLUMNNAME_StatusCode = "StatusCode";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name UserAgent
     */
    String COLUMNNAME_UserAgent = "UserAgent";
    /**
     * Column name WebSession
     */
    String COLUMNNAME_WebSession = "WebSession";

    /**
     * Get Accept Language. Language accepted based on browser information
     */
    String getAcceptLanguage();

    /**
     * Set Accept Language. Language accepted based on browser information
     */
    void setAcceptLanguage(String AcceptLanguage);

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
     * Get Broadcast Server. Web Broadcast Server
     */
    int getCM_BroadcastServer_ID();

    /**
     * Set Broadcast Server. Web Broadcast Server
     */
    void setCM_BroadcastServer_ID(int CM_BroadcastServer_ID);

    I_CM_BroadcastServer getCM_BroadcastServer() throws RuntimeException;

    /**
     * Get Media Item. Contains media content like images, flash movies etc.
     */
    int getCM_Media_ID();

    /**
     * Set Media Item. Contains media content like images, flash movies etc.
     */
    void setCM_Media_ID(int CM_Media_ID);

    I_CM_Media getCM_Media() throws RuntimeException;

    /**
     * Get Web Access Log. Web Access Log Information
     */
    int getCM_WebAccessLog_ID();

    /**
     * Set Web Access Log. Web Access Log Information
     */
    void setCM_WebAccessLog_ID(int CM_WebAccessLog_ID);

    /**
     * Get CM_WebAccessLog_UU
     */
    String getCM_WebAccessLog_UU();

    /**
     * Set CM_WebAccessLog_UU
     */
    void setCM_WebAccessLog_UU(String CM_WebAccessLog_UU);

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
     * Get File Size. Size of the File in bytes
     */
    BigDecimal getFileSize();

    /**
     * Set File Size. Size of the File in bytes
     */
    void setFileSize(BigDecimal FileSize);

    /**
     * Get Hyphen
     */
    String getHyphen();

    /**
     * Set Hyphen
     */
    void setHyphen(String Hyphen);

    /**
     * Get IP Address. Defines the IP address to transfer data to
     */
    String getIP_Address();

    /**
     * Set IP Address. Defines the IP address to transfer data to
     */
    void setIP_Address(String IP_Address);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Log Type. Web Log Type
     */
    String getLogType();

    /**
     * Set Log Type. Web Log Type
     */
    void setLogType(String LogType);

    /**
     * Get Page URL
     */
    String getPageURL();

    /**
     * Set Page URL
     */
    void setPageURL(String PageURL);

    /**
     * Get Protocol. Protocol
     */
    String getProtocol();

    /**
     * Set Protocol. Protocol
     */
    void setProtocol(String Protocol);

    /**
     * Get Referrer. Referring web address
     */
    String getReferrer();

    /**
     * Set Referrer. Referring web address
     */
    void setReferrer(String Referrer);

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
     * Get Request Type
     */
    String getRequestType();

    /**
     * Set Request Type
     */
    void setRequestType(String RequestType);

    /**
     * Get Status Code
     */
    int getStatusCode();

    /**
     * Set Status Code
     */
    void setStatusCode(int StatusCode);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get User Agent. Browser Used
     */
    String getUserAgent();

    /**
     * Set User Agent. Browser Used
     */
    void setUserAgent(String UserAgent);

    /**
     * Get Web Session. Web Session ID
     */
    String getWebSession();

    /**
     * Set Web Session. Web Session ID
     */
    void setWebSession(String WebSession);
}
