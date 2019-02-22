package org.compiere.model;

import java.util.Properties;

/**
 * Interface for adempiere/Server.
 */
public interface Server {

    /**
     * Process Remote
     *
     * @param ctx Context
     * @param pi  Process Info
     * @return resulting Process Info
     */
    IProcessInfo process(Properties ctx, IProcessInfo pi);

}
