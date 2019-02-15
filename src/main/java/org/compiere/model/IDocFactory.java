package org.compiere.model;

import java.sql.ResultSet;

/** @author hengsin */
public interface IDocFactory {
  /**
   * Create Posting document
   *
   * @param as accounting schema
   * @param AD_Table_ID Table ID of Documents
   * @param Record_ID record ID to load
   * @param trxName transaction name
   * @return Document or null
   */
  IDoc getDocument(I_C_AcctSchema as, int AD_Table_ID, int Record_ID);

  /**
   * Create Posting document
   *
   * @param as accounting schema
   * @param AD_Table_ID Table ID of Documents
   * @param rs ResultSet
   * @param trxName transaction name
   * @return Document
   */
  IDoc getDocument(I_C_AcctSchema as, int AD_Table_ID, ResultSet rs);
}
