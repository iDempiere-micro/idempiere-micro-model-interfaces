package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Message
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Message {

    /**
     * TableName=AD_Message
     */
    String Table_Name = "AD_Message";

    /**
     * AD_Table_ID=109
     */
    int Table_ID = 109;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_Message_ID
     */
    String COLUMNNAME_AD_Message_ID = "AD_Message_ID";
    /**
     * Column name AD_Message_UU
     */
    String COLUMNNAME_AD_Message_UU = "AD_Message_UU";
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
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name MsgText
     */
    String COLUMNNAME_MsgText = "MsgText";
    /**
     * Column name MsgTip
     */
    String COLUMNNAME_MsgTip = "MsgTip";
    /**
     * Column name MsgType
     */
    String COLUMNNAME_MsgType = "MsgType";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

    /**
     * Get Message. System Message
     */
    int getAD_Message_ID();

    /**
     * Set Message. System Message
     */
    void setAD_Message_ID(int AD_Message_ID);

    /**
     * Get AD_Message_UU
     */
    String getAD_Message_UU();

    /**
     * Set AD_Message_UU
     */
    void setAD_Message_UU(String AD_Message_UU);

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
     * Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    String getEntityType();

    /**
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    void setEntityType(String EntityType);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Message Text. Textual Informational, Menu or Error Message
     */
    String getMsgText();

    /**
     * Set Message Text. Textual Informational, Menu or Error Message
     */
    void setMsgText(String MsgText);

    /**
     * Get Message Tip. Additional tip or help for this message
     */
    String getMsgTip();

    /**
     * Set Message Tip. Additional tip or help for this message
     */
    void setMsgTip(String MsgTip);

    /**
     * Get Message Type. Type of message (Informational, Menu or Error)
     */
    String getMsgType();

    /**
     * Set Message Type. Type of message (Informational, Menu or Error)
     */
    void setMsgType(String MsgType);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);
}
