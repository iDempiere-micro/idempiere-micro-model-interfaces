package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_AcctProcessorLog
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_AcctProcessorLog {

    /**
     * TableName=C_AcctProcessorLog
     */
    String Table_Name = "C_AcctProcessorLog";

    /**
     * AD_Table_ID=694
     */
    int Table_ID = 694;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);


    /**
     * Column name C_AcctProcessor_ID
     */
    String COLUMNNAME_C_AcctProcessor_ID = "C_AcctProcessor_ID";
    /**
     * Column name Summary
     */
    String COLUMNNAME_Summary = "Summary";

    /**
     * Set Accounting Processor. Accounting Processor/Server Parameters
     */
    void setAccountingProcessorId(int C_AcctProcessor_ID);

    /**
     * Set Summary. Textual summary of this request
     */
    void setSummary(String Summary);

}
