package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_BroadcastMessage
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_BroadcastMessage {

    /**
     * TableName=AD_BroadcastMessage
     */
    String Table_Name = "AD_BroadcastMessage";

    /**
     * AD_Table_ID=200038
     */
    int Table_ID = 200038;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_BroadcastMessage_ID
     */
    String COLUMNNAME_AD_BroadcastMessage_ID = "AD_BroadcastMessage_ID";
    /**
     * Column name AD_BroadcastMessage_UU
     */
    String COLUMNNAME_AD_BroadcastMessage_UU = "AD_BroadcastMessage_UU";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Role_ID
     */
    String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name BroadcastFrequency
     */
    String COLUMNNAME_BroadcastFrequency = "BroadcastFrequency";
    /**
     * Column name BroadcastMessage
     */
    String COLUMNNAME_BroadcastMessage = "BroadcastMessage";
    /**
     * Column name BroadcastType
     */
    String COLUMNNAME_BroadcastType = "BroadcastType";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Expiration
     */
    String COLUMNNAME_Expiration = "Expiration";
    /**
     * Column name Expired
     */
    String COLUMNNAME_Expired = "Expired";
    /**
     * Column name ExpireNow
     */
    String COLUMNNAME_ExpireNow = "ExpireNow";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsPublished
     */
    String COLUMNNAME_IsPublished = "IsPublished";
    /**
     * Column name LogAcknowledge
     */
    String COLUMNNAME_LogAcknowledge = "LogAcknowledge";
    /**
     * Column name Notification_Client_ID
     */
    String COLUMNNAME_Notification_Client_ID = "Notification_Client_ID";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Publish
     */
    String COLUMNNAME_Publish = "Publish";
    /**
     * Column name Target
     */
    String COLUMNNAME_Target = "Target";
    /**
     * Column name TestMessage
     */
    String COLUMNNAME_TestMessage = "TestMessage";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Broadcast Message. Broadcast Message
     */
    int getAD_BroadcastMessage_ID();

    /**
     * Set Broadcast Message. Broadcast Message
     */
    void setAD_BroadcastMessage_ID(int AD_BroadcastMessage_ID);

    /**
     * Get AD_BroadcastMessage_UU
     */
    String getAD_BroadcastMessage_UU();

    /**
     * Set AD_BroadcastMessage_UU
     */
    void setAD_BroadcastMessage_UU(String AD_BroadcastMessage_UU);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Role. Responsibility Role
     */
    int getAD_Role_ID();

    /**
     * Set Role. Responsibility Role
     */
    void setAD_Role_ID(int AD_Role_ID);

    I_AD_Role getAD_Role() throws RuntimeException;

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
     * Get Broadcast Frequency. How Many Times Message Should be Broadcasted
     */
    String getBroadcastFrequency();

    /**
     * Set Broadcast Frequency. How Many Times Message Should be Broadcasted
     */
    void setBroadcastFrequency(String BroadcastFrequency);

    /**
     * Get Broadcast Message. Broadcast Message
     */
    String getBroadcastMessage();

    /**
     * Set Broadcast Message. Broadcast Message
     */
    void setBroadcastMessage(String BroadcastMessage);

    /**
     * Get Broadcast Type. Type of Broadcast
     */
    String getBroadcastType();

    /**
     * Set Broadcast Type. Type of Broadcast
     */
    void setBroadcastType(String BroadcastType);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Expire On. Expire On
     */
    Timestamp getExpiration();

    /**
     * Set Expire On. Expire On
     */
    void setExpiration(Timestamp Expiration);

    /**
     * Get Expired
     */
    boolean isExpired();

    /**
     * Set Expired
     */
    void setExpired(boolean Expired);

    /**
     * Get Expire Now. Expire the broadcast message
     */
    String getExpireNow();

    /**
     * Set Expire Now. Expire the broadcast message
     */
    void setExpireNow(String ExpireNow);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Published. The Topic is published and can be viewed
     */
    void setIsPublished(boolean IsPublished);

    /**
     * Get Published. The Topic is published and can be viewed
     */
    boolean isPublished();

    /**
     * Get Log Acknowledge. Want to Log the Acknowledgement of Message?
     */
    boolean isLogAcknowledge();

    /**
     * Set Log Acknowledge. Want to Log the Acknowledgement of Message?
     */
    void setLogAcknowledge(boolean LogAcknowledge);

    /**
     * Get Notification Client. Notification Client
     */
    int getNotification_Client_ID();

    /**
     * Set Notification Client. Notification Client
     */
    void setNotification_Client_ID(int Notification_Client_ID);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Publish. Publish Broadcast Message
     */
    String getPublish();

    /**
     * Set Publish. Publish Broadcast Message
     */
    void setPublish(String Publish);

    /**
     * Get Target. Target client
     */
    String getTarget();

    /**
     * Set Target. Target client
     */
    void setTarget(String Target);

    /**
     * Get Test Message. Test broadcast message
     */
    String getTestMessage();

    /**
     * Set Test Message. Test broadcast message
     */
    void setTestMessage(String TestMessage);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
