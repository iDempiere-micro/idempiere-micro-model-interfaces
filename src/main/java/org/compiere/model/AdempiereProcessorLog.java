package org.compiere.model;

import java.sql.Timestamp;

/**
 * Processor Log Interface
 *
 * @author Jorg Janke
 * @version $Id: AdempiereProcessorLog.java,v 1.3 2006/07/30 00:51:04 jjanke Exp $
 */
public interface AdempiereProcessorLog {
    /**
     * Get Created Date
     *
     * @return created
     */
    Timestamp getCreated();

    /**
     * Get Summary. Textual summary of this request
     *
     * @return Summary
     */
    String getSummary();

    /**
     * Get Description. Optional short description of the record
     *
     * @return description
     */
    String getDescription();

    /**
     * Get Error. An Error occured in the execution
     *
     * @return true if error
     */
    boolean isError();

    /**
     * Get Reference. Reference for this record
     *
     * @return reference
     */
    String getReference();

    /**
     * Get Text Message. Text Message
     *
     * @return text message
     */
    String getTextMsg();
} //	AdempiereProcessorLog
