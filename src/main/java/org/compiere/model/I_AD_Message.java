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
  String Table_Name = "AD_Message";

  /** AD_Table_ID=109 */
  int Table_ID = 109;

    /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Message_ID */
  String COLUMNNAME_AD_Message_ID = "AD_Message_ID";
  /** Column name AD_Message_UU */
  String COLUMNNAME_AD_Message_UU = "AD_Message_UU";
    /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
    /** Column name MsgText */
  String COLUMNNAME_MsgText = "MsgText";
  /** Column name MsgTip */
  String COLUMNNAME_MsgTip = "MsgTip";
  /** Column name MsgType */
  String COLUMNNAME_MsgType = "MsgType";
    /** Column name Value */
  String COLUMNNAME_Value = "Value";

  /** Get Message. System Message */
  int getAD_Message_ID();

    /** Get Message Text. Textual Informational, Menu or Error Message */
  String getMsgText();

    /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

}
