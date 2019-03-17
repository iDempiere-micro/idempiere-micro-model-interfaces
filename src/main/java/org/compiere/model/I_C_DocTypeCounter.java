package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_DocTypeCounter
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_DocTypeCounter {

    /**
     * TableName=C_DocTypeCounter
     */
    String Table_Name = "C_DocTypeCounter";

    /**
     * AD_Table_ID=718
     */
    int Table_ID = 718;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);


    /**
     * Column name C_DocType_ID
     */
    String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
    /**
     * Column name Counter_C_DocType_ID
     */
    String COLUMNNAME_Counter_C_DocType_ID = "Counter_C_DocType_ID";
    /**
     * Column name DocAction
     */
    String COLUMNNAME_DocAction = "DocAction";
    /**
     * Column name IsCreateCounter
     */
    String COLUMNNAME_IsCreateCounter = "IsCreateCounter";
    /**
     * Column name IsValid
     */
    String COLUMNNAME_IsValid = "IsValid";

    /**
     * Get Document Type. Document type or rules
     */
    int getDocumentTypeId();

    /**
     * Set Document Type. Document type or rules
     */
    void setDocumentTypeId(int C_DocType_ID);

    /**
     * Get Counter Document Type. Generated Counter Document Type (To)
     */
    int getCounterDocTypeId();

    /**
     * Set Counter Document Type. Generated Counter Document Type (To)
     */
    void setCounterDocTypeId(int Counter_C_DocType_ID);

    /**
     * Get Document Action. The targeted status of the document
     */
    String getDocAction();

    /**
     * Set Create Counter Document. Create Counter Document
     */
    void setIsCreateCounter(boolean IsCreateCounter);

    /**
     * Get Create Counter Document. Create Counter Document
     */
    boolean isCreateCounter();

    /**
     * Set Valid. Element is valid
     */
    void setIsValid(boolean IsValid);

    /**
     * Get Valid. Element is valid
     */
    boolean isValid();

}
