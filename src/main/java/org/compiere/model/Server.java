package org.compiere.model;

import java.util.Properties;

/** Interface for adempiere/Server. */
public interface Server {

    /**
   * Process Remote
   *
   * @param ctx Context
   * @param pi Process Info
   * @return resulting Process Info
   */
  IProcessInfo process(Properties ctx, IProcessInfo pi);

  /**
   * Run Workflow (and wait) on Server
   *
   * @param ctx Context
   * @param pi Process Info
   * @param AD_Workflow_ID id
   * @return process info
   */
  IProcessInfo workflow(Properties ctx, IProcessInfo pi, int AD_Workflow_ID);

}
