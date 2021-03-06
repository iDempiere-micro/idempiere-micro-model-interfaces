package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for C_AcctProcessor
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface AccountingProcessor {

    /**
     * AD_Table_ID=695
     */
    int Table_ID = 695;

    /**
     * TableName=C_AcctProcessor
     */
    String Table_Name = "C_AcctProcessor";


    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);


    /**
     * Column name AD_Schedule_ID
     */
    String COLUMNNAME_AD_Schedule_ID = "AD_Schedule_ID";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name C_AcctProcessor_ID
     */
    String COLUMNNAME_C_AcctProcessor_ID = "C_AcctProcessor_ID";
    /**
     * Column name C_AcctSchema_ID
     */
    String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /**
     * Column name DateLastRun
     */
    String COLUMNNAME_DateLastRun = "DateLastRun";
    /**
     * Column name DateNextRun
     */
    String COLUMNNAME_DateNextRun = "DateNextRun";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name KeepLogDays
     */
    String COLUMNNAME_KeepLogDays = "KeepLogDays";
    /**
     * Column name Supervisor_ID
     */
    String COLUMNNAME_Supervisor_ID = "Supervisor_ID";

    /**
     * Get Schedule
     */
    int getScheduleId();

    /**
     * Set Schedule
     */
    void setScheduleId(int AD_Schedule_ID);

    /**
     * Get Accounting Processor. Accounting Processor/Server Parameters
     */
    int getAccountingProcessorId();

    /**
     * Get Date next run. Date the process will run next
     */
    Timestamp getDateNextRun();

    /**
     * Set Date next run. Date the process will run next
     */
    void setDateNextRun(Timestamp DateNextRun);

    /**
     * Set Days to keep Log. Number of days to keep the log entries
     */
    void setKeepLogDays(int KeepLogDays);

    /**
     * Set Supervisor. Supervisor for this user/organization - used for escalation and approval
     */
    void setSupervisorId(int Supervisor_ID);

}
