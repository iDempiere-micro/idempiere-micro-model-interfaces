package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for W_Counter
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_W_Counter {

    /**
     * TableName=W_Counter
     */
    String Table_Name = "W_Counter";

    /**
     * AD_Table_ID=403
     */
    int Table_ID = 403;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

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
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name EMail
     */
    String COLUMNNAME_EMail = "EMail";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name PageURL
     */
    String COLUMNNAME_PageURL = "PageURL";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
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
     * Column name W_CounterCount_ID
     */
    String COLUMNNAME_W_CounterCount_ID = "W_CounterCount_ID";
    /**
     * Column name W_Counter_ID
     */
    String COLUMNNAME_W_Counter_ID = "W_Counter_ID";
    /**
     * Column name W_Counter_UU
     */
    String COLUMNNAME_W_Counter_UU = "W_Counter_UU";

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

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get EMail Address. Electronic Mail Address
     */
    String getEMail();

    /**
     * Set EMail Address. Electronic Mail Address
     */
    void setEMail(String EMail);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Page URL
     */
    String getPageURL();

    /**
     * Set Page URL
     */
    void setPageURL(String PageURL);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

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
     * Get Counter Count. Web Counter Count Management
     */
    int getW_CounterCount_ID();

    /**
     * Set Counter Count. Web Counter Count Management
     */
    void setW_CounterCount_ID(int W_CounterCount_ID);

    I_W_CounterCount getW_CounterCount() throws RuntimeException;

    /**
     * Get Web Counter. Individual Count hit
     */
    int getW_Counter_ID();

    /**
     * Set Web Counter. Individual Count hit
     */
    void setW_Counter_ID(int W_Counter_ID);

    /**
     * Get W_Counter_UU
     */
    String getW_Counter_UU();

    /**
     * Set W_Counter_UU
     */
    void setW_Counter_UU(String W_Counter_UU);
}
