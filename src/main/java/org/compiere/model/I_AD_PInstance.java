package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_PInstance
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_PInstance {

    /**
     * TableName=AD_PInstance
     */
    String Table_Name = "AD_PInstance";

    /**
     * AD_Table_ID=282
     */
    int Table_ID = 282;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);



    /**
     * Column name AD_Language_ID
     */
    String COLUMNNAME_AD_Language_ID = "AD_Language_ID";
    /**
     * Column name AD_PInstance_ID
     */
    String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
    /**
     * Column name AD_PrintFormat_ID
     */
    String COLUMNNAME_AD_PrintFormat_ID = "AD_PrintFormat_ID";
    /**
     * Column name AD_Process_ID
     */
    String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name ErrorMsg
     */
    String COLUMNNAME_ErrorMsg = "ErrorMsg";
    /**
     * Column name IsProcessing
     */
    String COLUMNNAME_IsProcessing = "IsProcessing";
    /**
     * Column name IsSummary
     */
    String COLUMNNAME_IsSummary = "IsSummary";
    /**
     * Column name Record_ID
     */
    String COLUMNNAME_Record_ID = "Record_ID";
    /**
     * Column name ReportType
     */
    String COLUMNNAME_ReportType = "ReportType";
    /**
     * Column name Result
     */
    String COLUMNNAME_Result = "Result";

    /**
     * Get Process Instance. Instance of the process
     */
    int getPInstanceId();

    /**
     * Get Process. Process or Report
     */
    int getProcessId();

    /**
     * Set Process. Process or Report
     */
    void setProcessId(int AD_Process_ID);

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setUserId(int AD_User_ID);

    /**
     * Get Error Msg
     */
    String getErrorMsg();

    /**
     * Set Error Msg
     */
    void setErrorMsg(String ErrorMsg);

    /**
     * Set Processing
     */
    void setIsProcessing(boolean IsProcessing);

    /**
     * Get Processing
     */
    boolean isProcessing();

    /**
     * Set Record ID. Direct internal record ID
     */
    void setRecordId(int Record_ID);

    /**
     * Get Result. Result of the action taken
     */
    int getResult();

    /**
     * Set Result. Result of the action taken
     */
    void setResult(int Result);

}
