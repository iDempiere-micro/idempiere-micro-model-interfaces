package org.compiere.model;

import kotliquery.Row;

/**
 * @author hengsin
 */
public interface IDocFactory {
    /**
     * Create Posting document
     *
     * @param accountingSchema accounting schema
     * @param tableId          Table ID of Documents
     * @param recordId         record ID to load
     * @return Document or null
     */
    IDoc getDocument(AccountingSchema accountingSchema, int tableId, int recordId);

    /**
     * Create Posting document
     *
     * @param accountingSchema accounting schema
     * @param tableId          Table ID of Documents
     * @param row              ResultSet
     * @return Document
     */
    IDoc getDocument(AccountingSchema accountingSchema, int tableId, Row row);
}
