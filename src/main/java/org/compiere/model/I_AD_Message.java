package org.compiere.model;

import java.math.BigDecimal;

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

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);


    /**
     * Column name AD_Message_ID
     */
    String COLUMNNAME_AD_Message_ID = "AD_Message_ID";
    /**
     * Column name MsgText
     */
    String COLUMNNAME_MsgText = "MsgText";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

    /**
     * Get Message. System Message
     */
    int getMessageId();

}
