package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for I_GLJournal
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_I_GLJournal {

    /**
     * AD_Table_ID=599
     */
    int Table_ID = 599;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);



    /**
     * Column name Account_ID
     */
    String COLUMNNAME_Account_ID = "Account_ID";
    /**
     * Column name AD_OrgDoc_ID
     */
    String COLUMNNAME_AD_OrgDoc_ID = "AD_OrgDoc_ID";
    /**
     * Column name AD_OrgTrx_ID
     */
    String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
    /**
     * Column name AmtAcctCr
     */
    String COLUMNNAME_AmtAcctCr = "AmtAcctCr";
    /**
     * Column name AmtAcctDr
     */
    String COLUMNNAME_AmtAcctDr = "AmtAcctDr";
    /**
     * Column name AmtSourceCr
     */
    String COLUMNNAME_AmtSourceCr = "AmtSourceCr";
    /**
     * Column name AmtSourceDr
     */
    String COLUMNNAME_AmtSourceDr = "AmtSourceDr";
    /**
     * Column name BatchDescription
     */
    String COLUMNNAME_BatchDescription = "BatchDescription";
    /**
     * Column name BatchDocumentNo
     */
    String COLUMNNAME_BatchDocumentNo = "BatchDocumentNo";
    /**
     * Column name C_AcctSchema_ID
     */
    String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /**
     * Column name C_Activity_ID
     */
    String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_Campaign_ID
     */
    String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
    /**
     * Column name C_ConversionType_ID
     */
    String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name C_DocType_ID
     */
    String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
    /**
     * Column name C_LocFrom_ID
     */
    String COLUMNNAME_C_LocFrom_ID = "C_LocFrom_ID";
    /**
     * Column name C_LocTo_ID
     */
    String COLUMNNAME_C_LocTo_ID = "C_LocTo_ID";
    /**
     * Column name C_Period_ID
     */
    String COLUMNNAME_C_Period_ID = "C_Period_ID";
    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name C_SalesRegion_ID
     */
    String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
    /**
     * Column name C_UOM_ID
     */
    String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
    /**
     * Column name CurrencyRate
     */
    String COLUMNNAME_CurrencyRate = "CurrencyRate";
    /**
     * Column name C_ValidCombination_ID
     */
    String COLUMNNAME_C_ValidCombination_ID = "C_ValidCombination_ID";
    /**
     * Column name DateAcct
     */
    String COLUMNNAME_DateAcct = "DateAcct";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name GL_Budget_ID
     */
    String COLUMNNAME_GL_Budget_ID = "GL_Budget_ID";
    /**
     * Column name GL_Category_ID
     */
    String COLUMNNAME_GL_Category_ID = "GL_Category_ID";
    /**
     * Column name GL_JournalBatch_ID
     */
    String COLUMNNAME_GL_JournalBatch_ID = "GL_JournalBatch_ID";
    /**
     * Column name GL_Journal_ID
     */
    String COLUMNNAME_GL_Journal_ID = "GL_Journal_ID";
    /**
     * Column name GL_JournalLine_ID
     */
    String COLUMNNAME_GL_JournalLine_ID = "GL_JournalLine_ID";
    /**
     * Column name I_ErrorMsg
     */
    String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
    /**
     * Column name I_GLJournal_ID
     */
    String COLUMNNAME_I_GLJournal_ID = "I_GLJournal_ID";
    /**
     * Column name I_IsImported
     */
    String COLUMNNAME_I_IsImported = "I_IsImported";
    /**
     * Column name IsCreateNewBatch
     */
    String COLUMNNAME_IsCreateNewBatch = "IsCreateNewBatch";
    /**
     * Column name IsCreateNewJournal
     */
    String COLUMNNAME_IsCreateNewJournal = "IsCreateNewJournal";
    /**
     * Column name JournalDocumentNo
     */
    String COLUMNNAME_JournalDocumentNo = "JournalDocumentNo";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name PostingType
     */
    String COLUMNNAME_PostingType = "PostingType";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";
    /**
     * Column name User1_ID
     */
    String COLUMNNAME_User1_ID = "User1_ID";
    /**
     * Column name User2_ID
     */
    String COLUMNNAME_User2_ID = "User2_ID";

    /**
     * Get Account. Account used
     */
    int getAccount_ID();

    /**
     * Get Document Org. Document Organization (independent from account organization)
     */
    int getAD_OrgDoc_ID();

    /**
     * Get Trx Organization. Performing or initiating organization
     */
    int getAD_OrgTrx_ID();

    /**
     * Get Accounted Credit. Accounted Credit Amount
     */
    BigDecimal getAmtAcctCr();

    /**
     * Get Accounted Debit. Accounted Debit Amount
     */
    BigDecimal getAmtAcctDr();

    /**
     * Get Source Credit. Source Credit Amount
     */
    BigDecimal getAmtSourceCr();

    /**
     * Get Source Debit. Source Debit Amount
     */
    BigDecimal getAmtSourceDr();

    /**
     * Get Batch Description. Description of the Batch
     */
    String getBatchDescription();

    /**
     * Get Batch Document No. Document Number of the Batch
     */
    String getBatchDocumentNo();

    /**
     * Get Accounting Schema. Rules for accounting
     */
    int getC_AcctSchema_ID();

    /**
     * Get Activity. Business Activity
     */
    int getC_Activity_ID();

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Get Campaign. Marketing Campaign
     */
    int getC_Campaign_ID();

    /**
     * Get Currency Type. Currency Conversion Rate Type
     */
    int getC_ConversionType_ID();

    /**
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

    /**
     * Get Document Type. Document type or rules
     */
    int getC_DocType_ID();

    /**
     * Get Location From. Location that inventory was moved from
     */
    int getC_LocFrom_ID();

    /**
     * Get Location To. Location that inventory was moved to
     */
    int getC_LocTo_ID();

    /**
     * Get Period. Period of the Calendar
     */
    int getC_Period_ID();

    /**
     * Get Project. Financial Project
     */
    int getC_Project_ID();

    /**
     * Get Sales Region. Sales coverage region
     */
    int getC_SalesRegion_ID();

    /**
     * Get UOM. Unit of Measure
     */
    int getC_UOM_ID();

    /**
     * Get Rate. Currency Conversion Rate
     */
    BigDecimal getCurrencyRate();

    /**
     * Get Combination. Valid Account Combination
     */
    int getC_ValidCombination_ID();

    /**
     * Set Combination. Valid Account Combination
     */
    void setC_ValidCombination_ID(int C_ValidCombination_ID);

    /**
     * Get Account Date. Accounting Date
     */
    Timestamp getDateAcct();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Get Budget. General Ledger Budget
     */
    int getGL_Budget_ID();

    /**
     * Get GL Category. General Ledger Category
     */
    int getGL_Category_ID();

    /**
     * Set Journal Batch. General Ledger Journal Batch
     */
    void setGL_JournalBatch_ID(int GL_JournalBatch_ID);

    /**
     * Set Journal. General Ledger Journal
     */
    void setGL_Journal_ID(int GL_Journal_ID);

    /**
     * Set Journal Line. General Ledger Journal Line
     */
    void setGL_JournalLine_ID(int GL_JournalLine_ID);

    /**
     * Set Import Error Message. Messages generated from import process
     */
    void setI_ErrorMsg(String I_ErrorMsg);

    /**
     * Set Imported. Has this import been processed
     */
    void setI_IsImported(boolean I_IsImported);

    /**
     * Get Create New Batch. If selected a new batch is created
     */
    boolean isCreateNewBatch();

    /**
     * Get Create New Journal. If selected a new journal within the batch is created
     */
    boolean isCreateNewJournal();

    /**
     * Get Journal Document No. Document number of the Journal
     */
    String getJournalDocumentNo();

    /**
     * Get Line No. Unique line for this document
     */
    int getLine();

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Get PostingType. The type of posted amount for the transaction
     */
    String getPostingType();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Quantity. Quantity
     */
    BigDecimal getQty();

    /**
     * Get User Element List 1. User defined list element #1
     */
    int getUser1_ID();

    /**
     * Get User Element List 2. User defined list element #2
     */
    int getUser2_ID();

}
