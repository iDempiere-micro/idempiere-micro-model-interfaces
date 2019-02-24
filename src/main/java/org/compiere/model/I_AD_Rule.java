package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Rule
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Rule {

    /**
     * TableName=AD_Rule
     */
    String Table_Name = "AD_Rule";

    /**
     * AD_Table_ID=53058
     */
    int Table_ID = 53058;

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);



    /**
     * Column name AD_Rule_ID
     */
    String COLUMNNAME_AD_Rule_ID = "AD_Rule_ID";
    /**
     * Column name EventType
     */
    String COLUMNNAME_EventType = "EventType";
    /**
     * Column name RuleType
     */
    String COLUMNNAME_RuleType = "RuleType";
    /**
     * Column name Script
     */
    String COLUMNNAME_Script = "Script";

    /**
     * Get Rule
     */
    int getRuleId();

    /**
     * Get Event Type. Type of Event
     */
    String getEventType();

    /**
     * Get Rule Type
     */
    String getRuleType();

    /**
     * Get Script. Dynamic Java Language Script to calculate result
     */
    String getScript();

}
