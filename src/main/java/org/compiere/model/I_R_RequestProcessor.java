package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for R_RequestProcessor
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_RequestProcessor {

    /**
     * AD_Table_ID=420
     */
    int Table_ID = 420;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);


    /**
     * Column name AD_Schedule_ID
     */
    String COLUMNNAME_AD_Schedule_ID = "AD_Schedule_ID";
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
     * Column name OverdueAlertDays
     */
    String COLUMNNAME_OverdueAlertDays = "OverdueAlertDays";
    /**
     * Column name OverdueAssignDays
     */
    String COLUMNNAME_OverdueAssignDays = "OverdueAssignDays";
    /**
     * Column name RemindDays
     */
    String COLUMNNAME_RemindDays = "RemindDays";
    /**
     * Column name R_RequestProcessor_ID
     */
    String COLUMNNAME_R_RequestProcessor_ID = "R_RequestProcessor_ID";
    /**
     * Column name R_RequestType_ID
     */
    String COLUMNNAME_R_RequestType_ID = "R_RequestType_ID";
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
     * Set Alert after Days Due. Send email alert after number of days due (0=no alerts)
     */
    void setOverdueAlertDays(int OverdueAlertDays);

    /**
     * Set Escalate after Days Due. Escalation to superior after number of due days (0 = no)
     */
    void setOverdueAssignDays(int OverdueAssignDays);

    /**
     * Set Reminder Days. Days between sending Reminder Emails for a due or inactive Document
     */
    void setRemindDays(int RemindDays);

    /**
     * Get Request Processor. Processor for Requests
     */
    int getRequestProcessorId();

    /**
     * Set Supervisor. Supervisor for this user/organization - used for escalation and approval
     */
    void setSupervisorId(int Supervisor_ID);

}
