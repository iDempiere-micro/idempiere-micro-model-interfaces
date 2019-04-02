package org.compiere.model;

/**
 * Interface for adempiere/Server.
 */
public interface Server {

    /**
     * Process Remote
     *
     * @param pi Process Info
     * @return resulting Process Info
     */
    IProcessInfo process(IProcessInfo pi);

}
