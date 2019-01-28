package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Rule
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Rule {

  /** TableName=AD_Rule */
  String Table_Name = "AD_Rule";

  /** AD_Table_ID=53058 */
  int Table_ID = 53058;

    /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AccessLevel */
  String COLUMNNAME_AccessLevel = "AccessLevel";
    /** Column name AD_Rule_ID */
  String COLUMNNAME_AD_Rule_ID = "AD_Rule_ID";
  /** Column name AD_Rule_UU */
  String COLUMNNAME_AD_Rule_UU = "AD_Rule_UU";
    /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
  /** Column name EventType */
  String COLUMNNAME_EventType = "EventType";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
    /** Column name RuleType */
  String COLUMNNAME_RuleType = "RuleType";
  /** Column name Script */
  String COLUMNNAME_Script = "Script";

    /** Get Rule */
  int getAD_Rule_ID();

    /** Get Event Type. Type of Event */
  String getEventType();

    /** Get Rule Type */
  String getRuleType();

    /** Get Script. Dynamic Java Language Script to calculate result */
  String getScript();

}
