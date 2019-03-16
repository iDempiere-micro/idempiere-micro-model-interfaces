package org.compiere.model;

import org.idempiere.common.exceptions.AdempiereException;

import java.sql.Timestamp;

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
     * Save throwing exception
     *
     * @throws AdempiereException
     * @see #save()
     */
    void saveEx() throws AdempiereException;

    int getClientId();
} //	AdempiereProcessor
