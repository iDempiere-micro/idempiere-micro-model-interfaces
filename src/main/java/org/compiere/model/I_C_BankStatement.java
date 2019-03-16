package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for C_BankStatement
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BankStatement {

    /**
     * TableName=C_BankStatement
     */
    String Table_Name = "C_BankStatement";

    /**
     * AD_Table_ID=392
     */
    int Table_ID = 392;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name BeginningBalance
     */
    String COLUMNNAME_BeginningBalance = "BeginningBalance";
    /**
     * Column name C_BankAccount_ID
     */
    String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
    /**
     * Column name C_BankStatement_ID
     */
    String COLUMNNAME_C_BankStatement_ID = "C_BankStatement_ID";
    /**
     * Column name DateAcct
     */
    String COLUMNNAME_DateAcct = "DateAcct";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DocAction
     */
    String COLUMNNAME_DocAction = "DocAction";
    /**
     * Column name DocStatus
     */
    String COLUMNNAME_DocStatus = "DocStatus";
    /**
     * Column name EftStatementDate
     */
    String COLUMNNAME_EftStatementDate = "EftStatementDate";
    /**
     * Column name EftStatementReference
     */
    String COLUMNNAME_EftStatementReference = "EftStatementReference";
    /**
     * Column name EndingBalance
     */
    String COLUMNNAME_EndingBalance = "EndingBalance";
    /**
     * Column name IsApproved
     */
    String COLUMNNAME_IsApproved = "IsApproved";
    /**
     * Column name IsManual
     */
    String COLUMNNAME_IsManual = "IsManual";
    /**
     * Column name Posted
     */
    String COLUMNNAME_Posted = "Posted";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name StatementDate
     */
    String COLUMNNAME_StatementDate = "StatementDate";
    /**
     * Column name StatementDifference
     */
    String COLUMNNAME_StatementDifference = "StatementDifference";

    /**
     * Get Beginning Balance. Balance prior to any transactions
     */
    BigDecimal getBeginningBalance();

    /**
     * Set Beginning Balance. Balance prior to any transactions
     */
    void setBeginningBalance(BigDecimal BeginningBalance);

    /**
     * Get Bank Account. Account at the Bank
     */
    int getBankAccountId();

    /**
     * Set Bank Account. Account at the Bank
     */
    void setBankAccountId(int C_BankAccount_ID);

    /**
     * Get Bank Statement. Bank Statement of account
     */
    int getBankStatementId();

    /**
     * Get Account Date. Accounting Date
     */
    Timestamp getDateAcct();

    /**
     * Set Account Date. Accounting Date
     */
    void setDateAcct(Timestamp DateAcct);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Document Action. The targeted status of the document
     */
    String getDocAction();

    /**
     * Set Document Action. The targeted status of the document
     */
    void setDocAction(String DocAction);

    /**
     * Get Document Status. The current status of the document
     */
    String getDocStatus();

    /**
     * Set Document Status. The current status of the document
     */
    void setDocStatus(String DocStatus);

    /**
     * Set EFT Statement Date. Electronic Funds Transfer Statement Date
     */
    void setEftStatementDate(Timestamp EftStatementDate);

    /**
     * Get EFT Statement Reference. Electronic Funds Transfer Statement Reference
     */
    String getEftStatementReference();

    /**
     * Set EFT Statement Reference. Electronic Funds Transfer Statement Reference
     */
    void setEftStatementReference(String EftStatementReference);

    /**
     * Set Ending balance. Ending or closing balance
     */
    void setEndingBalance(BigDecimal EndingBalance);

    /**
     * Set Approved. Indicates if this document requires approval
     */
    void setIsApproved(boolean IsApproved);

    /**
     * Get Approved. Indicates if this document requires approval
     */
    boolean isApproved();

    /**
     * Set Manual. This is a manual process
     */
    void setIsManual(boolean IsManual);

    /**
     * Set Posted. Posting status
     */
    void setPosted(boolean Posted);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Statement date. Date of the statement
     */
    Timestamp getStatementDate();

    /**
     * Set Statement date. Date of the statement
     */
    void setStatementDate(Timestamp StatementDate);

    /**
     * Get Statement difference. Difference between statement ending balance and actual ending balance
     */
    BigDecimal getStatementDifference();

    /**
     * Set Statement difference. Difference between statement ending balance and actual ending balance
     */
    void setStatementDifference(BigDecimal StatementDifference);

}
