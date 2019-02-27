package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for C_DepositBatch
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_DepositBatch {

    /**
     * AD_Table_ID=200056
     */
    int Table_ID = 200056;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);



    /**
     * Column name C_BankAccount_ID
     */
    String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
    /**
     * Column name C_DepositBatch_ID
     */
    String COLUMNNAME_C_DepositBatch_ID = "C_DepositBatch_ID";
    /**
     * Column name C_DocType_ID
     */
    String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
    /**
     * Column name DateDeposit
     */
    String COLUMNNAME_DateDeposit = "DateDeposit";
    /**
     * Column name DateDoc
     */
    String COLUMNNAME_DateDoc = "DateDoc";
    /**
     * Column name DepositAmt
     */
    String COLUMNNAME_DepositAmt = "DepositAmt";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DocStatus
     */
    String COLUMNNAME_DocStatus = "DocStatus";
    /**
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";

    /**
     * Get Deposit Batch
     */
    int getC_DepositBatch_ID();

    /**
     * Set Deposit Batch
     */
    void setC_DepositBatch_ID(int C_DepositBatch_ID);

    /**
     * Get Document Type. Document type or rules
     */
    int getDocumentTypeId();

    /**
     * Set Document Type. Document type or rules
     */
    void setDocumentTypeId(int C_DocType_ID);

    /**
     * Get Deposit Date
     */
    Timestamp getDateDeposit();

    /**
     * Set Deposit Date
     */
    void setDateDeposit(Timestamp DateDeposit);

    /**
     * Get Document Date. Date of the Document
     */
    Timestamp getDateDoc();

    /**
     * Set Document Date. Date of the Document
     */
    void setDateDoc(Timestamp DateDoc);

    /**
     * Get Deposit Amount
     */
    BigDecimal getDepositAmt();

    /**
     * Set Deposit Amount
     */
    void setDepositAmt(BigDecimal DepositAmt);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Set Document Status. The current status of the document
     */
    void setDocStatus(String DocStatus);

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

}
