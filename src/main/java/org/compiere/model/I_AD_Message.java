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

  /** TableName=AD_Message */
  public static final String Table_Name = "AD_Message";

  /** AD_Table_ID=109 */
  public static final int Table_ID = 109;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Message_ID */
  public static final String COLUMNNAME_AD_Message_ID = "AD_Message_ID";

  /** Set Message. System Message */
  public void setAD_Message_ID(int AD_Message_ID);

  /** Get Message. System Message */
  public int getAD_Message_ID();

  /** Column name AD_Message_UU */
  public static final String COLUMNNAME_AD_Message_UU = "AD_Message_UU";

  /** Set AD_Message_UU */
  public void setAD_Message_UU(String AD_Message_UU);

  /** Get AD_Message_UU */
  public String getAD_Message_UU();

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getOrgId();

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name EntityType */
  public static final String COLUMNNAME_EntityType = "EntityType";

  /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  public void setEntityType(String EntityType);

  /** Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  public String getEntityType();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name MsgText */
  public static final String COLUMNNAME_MsgText = "MsgText";

  /** Set Message Text. Textual Informational, Menu or Error Message */
  public void setMsgText(String MsgText);

  /** Get Message Text. Textual Informational, Menu or Error Message */
  public String getMsgText();

  /** Column name MsgTip */
  public static final String COLUMNNAME_MsgTip = "MsgTip";

  /** Set Message Tip. Additional tip or help for this message */
  public void setMsgTip(String MsgTip);

  /** Get Message Tip. Additional tip or help for this message */
  public String getMsgTip();

  /** Column name MsgType */
  public static final String COLUMNNAME_MsgType = "MsgType";

  /** Set Message Type. Type of message (Informational, Menu or Error) */
  public void setMsgType(String MsgType);

  /** Get Message Type. Type of message (Informational, Menu or Error) */
  public String getMsgType();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();

  /** Column name Value */
  public static final String COLUMNNAME_Value = "Value";

  /** Set Search Key. Search key for the record in the format required - must be unique */
  public void setValue(String Value);

  /** Get Search Key. Search key for the record in the format required - must be unique */
  public String getValue();
}
