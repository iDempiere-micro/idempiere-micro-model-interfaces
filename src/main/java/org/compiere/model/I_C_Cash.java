package org.compiere.model;

import org.idempiere.icommon.model.PersistentObject;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for C_Cash
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Cash extends PersistentObject {

    /**
     * TableName=C_Cash
     */
    String Table_Name = "C_Cash";

    /**
     * AD_Table_ID=407
     */
    int Table_ID = 407;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name BeginningBalance
     */
    String COLUMNNAME_BeginningBalance = "BeginningBalance";
    /**
     * Column name C_Activity_ID
     */
    String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
    /**
     * Column name C_Campaign_ID
     */
    String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
    /**
     * Column name C_CashBook_ID
     */
    String COLUMNNAME_C_CashBook_ID = "C_CashBook_ID";
    /**
     * Column name C_Cash_ID
     */
    String COLUMNNAME_C_Cash_ID = "C_Cash_ID";
    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
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
     * Column name EndingBalance
     */
    String COLUMNNAME_EndingBalance = "EndingBalance";
    /**
     * Column name IsApproved
     */
    String COLUMNNAME_IsApproved = "IsApproved";
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
     * Column name User1_ID
     */
    String COLUMNNAME_User1_ID = "User1_ID";
    /**
     * Column name User2_ID
     */
    String COLUMNNAME_User2_ID = "User2_ID";

    /**
     * Get Beginning Balance. Balance prior to any transactions
     */
    BigDecimal getBeginningBalance();

    /**
     * Set Beginning Balance. Balance prior to any transactions
     */
    void setBeginningBalance(BigDecimal BeginningBalance);

    /**
     * Get Cash Book. Cash Book for recording petty cash transactions
     */
    int getCashBookId();

    /**
     * Set Cash Book. Cash Book for recording petty cash transactions
     */
    void setCashBookId(int C_CashBook_ID);

    /**
     * Get Cash Journal. Cash Journal
     */
    int getCashId();

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
     * Get Ending balance. Ending or closing balance
     */
    BigDecimal getEndingBalance();

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
     * Set Posted. Posting status
     */
    void setPosted(boolean Posted);

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

    I_C_CashBook getCashBook();

    String getDocumentNo();

    void saveEx();

    boolean isComplete();
}
