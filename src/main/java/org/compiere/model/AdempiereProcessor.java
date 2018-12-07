package org.compiere.model;

import java.sql.Timestamp;
import java.util.Properties;

import org.idempiere.common.exceptions.AdempiereException;

/**
 * Processor Interface
 *
 * @author Jorg Janke
 * @version $Id: AdempiereProcessor.java,v 1.2 2006/07/30 00:51:03 jjanke Exp $
 */
public interface AdempiereProcessor {

    /**
     * Get Name
     *
     * @return Name
     */
    String getName();

    /**
     * Get Description
     *
     * @return Description
     */
    String getDescription();

    /**
     * Get Context
     *
     * @return context
     */
    Properties getCtx();

    /**
     * Get the frequency type
     *
     * @return frequency type
     */
    String getFrequencyType();

    /**
     * Get the schedule type
     *
     * @return schedule type
     */
    String getScheduleType();

    /**
     * Get the cron pattern
     *
     * @return cron pattern
     */
    String getCronPattern();

    /**
     * Get the frequency
     *
     * @return frequency
     */
    int getFrequency();

    /**
     * Get Unique ID
     *
     * @return Unique ID
     */
    String getServerID();

    /**
     * Get the date Next run
     *
     * @param requery requery database
     * @return date next run
     */
    Timestamp getDateNextRun(boolean requery);

    /**
     * Set Date Next Run
     *
     * @param dateNextWork next work
     */
    void setDateNextRun(Timestamp dateNextWork);

    /**
     * Get the date Last run
     *
     * @return date lext run
     */
    Timestamp getDateLastRun();

    /**
     * Set Date Last Run
     *
     * @param dateLastRun last run
     */
    void setDateLastRun(Timestamp dateLastRun);

    /**
     * Save
     *
     * @return true if saved
     */
    boolean save();

    /**
     * Save throwing exception
     *
     * @throws AdempiereException
     * @see #save()
     */
    void saveEx() throws AdempiereException;

    /**
     * Get Processor Logs
     *
     * @return logs
     */
    AdempiereProcessorLog[] getLogs();

    int getClientId();
} //	AdempiereProcessor
