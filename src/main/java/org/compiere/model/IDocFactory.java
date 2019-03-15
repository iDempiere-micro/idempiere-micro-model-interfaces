package org.compiere.model;

import kotliquery.Row;

/**
 * @author hengsin
 */
public interface IDocFactory {
    /**
     * Create Posting document
     *
     * @param as          accounting schema
     * @param AD_Table_ID Table ID of Documents
     * @param Record_ID   record ID to load
     * @return Document or null
     */
    IDoc getDocument(I_C_AcctSchema as, int AD_Table_ID, int Record_ID);

    /**
     * Create Posting document
     *
     * @param as          accounting schema
     * @param AD_Table_ID Table ID of Documents
     * @param rs          ResultSet
     * @return Document
     */
    IDoc getDocument(I_C_AcctSchema as, int AD_Table_ID, Row rs);
}
