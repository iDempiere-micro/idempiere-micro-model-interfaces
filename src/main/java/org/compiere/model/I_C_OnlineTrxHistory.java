package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_OnlineTrxHistory
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_OnlineTrxHistory {

    /**
     * TableName=C_OnlineTrxHistory
     */
    String Table_Name = "C_OnlineTrxHistory";

    /**
     * AD_Table_ID=200032
     */
    int Table_ID = 200032;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name C_OnlineTrxHistory_ID
     */
    String COLUMNNAME_C_OnlineTrxHistory_ID = "C_OnlineTrxHistory_ID";
    /**
     * Column name C_OnlineTrxHistory_UU
     */
    String COLUMNNAME_C_OnlineTrxHistory_UU = "C_OnlineTrxHistory_UU";
    /**
     * Column name IsError
     */
    String COLUMNNAME_IsError = "IsError";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Record_ID
     */
    String COLUMNNAME_Record_ID = "Record_ID";
    /**
     * Column name TextMsg
     */
    String COLUMNNAME_TextMsg = "TextMsg";

    /**
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    /**
     * Set Table. Database Table information
     */
    void setAD_Table_ID(int AD_Table_ID);

    /**
     * Set Error. An Error occurred in the execution
     */
    void setIsError(boolean IsError);

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Set Record ID. Direct internal record ID
     */
    void setRecord_ID(int Record_ID);

    /**
     * Set Text Message. Text Message
     */
    void setTextMsg(String TextMsg);

}
