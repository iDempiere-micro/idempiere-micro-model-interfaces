package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_CtxHelpMsg
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_CtxHelpMsg {

    /**
     * TableName=AD_CtxHelpMsg
     */
    String Table_Name = "AD_CtxHelpMsg";

    /**
     * AD_Table_ID=200064
     */
    int Table_ID = 200064;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /**
     * Column name AD_CtxHelp_ID
     */
    String COLUMNNAME_AD_CtxHelp_ID = "AD_CtxHelp_ID";
    /**
     * Column name AD_CtxHelpMsg_ID
     */
    String COLUMNNAME_AD_CtxHelpMsg_ID = "AD_CtxHelpMsg_ID";
    /**
     * Column name AD_CtxHelpMsg_UU
     */
    String COLUMNNAME_AD_CtxHelpMsg_UU = "AD_CtxHelpMsg_UU";
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
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name MsgText
     */
    String COLUMNNAME_MsgText = "MsgText";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Context Help
     */
    int getAD_CtxHelp_ID();

    /**
     * Set Context Help
     */
    void setAD_CtxHelp_ID(int AD_CtxHelp_ID);

    I_AD_CtxHelp getAD_CtxHelp() throws RuntimeException;

    /**
     * Get Context Help Message
     */
    int getAD_CtxHelpMsg_ID();

    /**
     * Set Context Help Message
     */
    void setAD_CtxHelpMsg_ID(int AD_CtxHelpMsg_ID);

    /**
     * Get AD_CtxHelpMsg_UU
     */
    String getAD_CtxHelpMsg_UU();

    /**
     * Set AD_CtxHelpMsg_UU
     */
    void setAD_CtxHelpMsg_UU(String AD_CtxHelpMsg_UU);

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
