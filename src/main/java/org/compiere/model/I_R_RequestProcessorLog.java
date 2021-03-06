package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for R_RequestProcessorLog
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_RequestProcessorLog {

    /**
     * AD_Table_ID=659
     */
    int Table_ID = 659;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);


    /**
     * Column name IsError
     */
    String COLUMNNAME_IsError = "IsError";
    /**
     * Column name R_RequestProcessor_ID
     */
    String COLUMNNAME_R_RequestProcessor_ID = "R_RequestProcessor_ID";
    /**
     * Column name Summary
     */
    String COLUMNNAME_Summary = "Summary";

    /**
     * Set Error. An Error occurred in the execution
     */
    void setIsError(boolean IsError);

    /**
     * Set Request Processor. Processor for Requests
     */
    void setRequestProcessorId(int R_RequestProcessor_ID);

    /**
     * Set Summary. Textual summary of this request
     */
    void setSummary(String Summary);

}
