package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for Fact_Acct
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_Fact_Acct {

    /**
     * TableName=Fact_Acct
     */
    String Table_Name = "Fact_Acct";

    /**
     * AD_Table_ID=270
     */
    int Table_ID = 270;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);



    /**
     * Column name A_Asset_ID
     */
    String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
    /**
     * Column name Account_ID
     */
    String COLUMNNAME_Account_ID = "Account_ID";
    /**
     * Column name AD_OrgTrx_ID
     */
    String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
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
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
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
     * Column name C_ProjectPhase_ID
     */
    String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";
    /**
     * Column name C_ProjectTask_ID
     */
    String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";
    /**
     * Column name C_SalesRegion_ID
     */
    String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
    /**
     * Column name C_SubAcct_ID
     */
    String COLUMNNAME_C_SubAcct_ID = "C_SubAcct_ID";
    /**
     * Column name C_Tax_ID
     */
    String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
    /**
     * Column name C_UOM_ID
     */
    String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
    /**
     * Column name DateAcct
     */
    String COLUMNNAME_DateAcct = "DateAcct";
    /**
     * Column name DateTrx
     */
    String COLUMNNAME_DateTrx = "DateTrx";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Fact_Acct_ID
     */
    String COLUMNNAME_Fact_Acct_ID = "Fact_Acct_ID";
    /**
     * Column name GL_Budget_ID
     */
    String COLUMNNAME_GL_Budget_ID = "GL_Budget_ID";
    /**
     * Column name GL_Category_ID
     */
    String COLUMNNAME_GL_Category_ID = "GL_Category_ID";
    /**
     * Column name Line_ID
     */
    String COLUMNNAME_Line_ID = "Line_ID";
    /**
     * Column name M_Locator_ID
     */
    String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name PostingType
     */
    String COLUMNNAME_PostingType = "PostingType";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";
    /**
     * Column name Record_ID
     */
    String COLUMNNAME_Record_ID = "Record_ID";
    /**
     * Column name User1_ID
     */
    String COLUMNNAME_User1_ID = "User1_ID";
    /**
     * Column name User2_ID
     */
    String COLUMNNAME_User2_ID = "User2_ID";
    /**
     * Column name UserElement1_ID
     */
    String COLUMNNAME_UserElement1_ID = "UserElement1_ID";
    /**
     * Column name UserElement2_ID
     */
    String COLUMNNAME_UserElement2_ID = "UserElement2_ID";

    /**
     * Get Asset. Asset used internally or by customers
     */
    int getA_Asset_ID();

    /**
     * Get Account. Account used
     */
    int getAccount_ID();

    /**
     * Set Account. Account used
     */
    void setAccount_ID(int Account_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Trx Organization. Performing or initiating organization
     */
    int getAD_OrgTrx_ID();

    /**
     * Set Trx Organization. Performing or initiating organization
     */
    void setAD_OrgTrx_ID(int AD_OrgTrx_ID);

    /**
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    /**
     * Set Table. Database Table information
     */
    void setAD_Table_ID(int AD_Table_ID);

    /**
     * Get Accounted Credit. Accounted Credit Amount
     */
    BigDecimal getAmtAcctCr();

    /**
     * Set Accounted Credit. Accounted Credit Amount
     */
    void setAmtAcctCr(BigDecimal AmtAcctCr);

    /**
     * Get Accounted Debit. Accounted Debit Amount
     */
    BigDecimal getAmtAcctDr();

    /**
     * Set Accounted Debit. Accounted Debit Amount
     */
    void setAmtAcctDr(BigDecimal AmtAcctDr);

    /**
     * Get Source Credit. Source Credit Amount
     */
    BigDecimal getAmtSourceCr();

    /**
     * Set Source Credit. Source Credit Amount
     */
    void setAmtSourceCr(BigDecimal AmtSourceCr);

    /**
     * Get Source Debit. Source Debit Amount
     */
    BigDecimal getAmtSourceDr();

    /**
     * Set Source Debit. Source Debit Amount
     */
    void setAmtSourceDr(BigDecimal AmtSourceDr);

    /**
     * Get Accounting Schema. Rules for accounting
     */
    int getC_AcctSchema_ID();

    /**
     * Set Accounting Schema. Rules for accounting
     */
    void setC_AcctSchema_ID(int C_AcctSchema_ID);

    /**
     * Get Activity. Business Activity
     */
    int getC_Activity_ID();

    /**
     * Set Activity. Business Activity
     */
    void setC_Activity_ID(int C_Activity_ID);

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setC_BPartner_ID(int C_BPartner_ID);

    /**
     * Get Campaign. Marketing Campaign
     */
    int getC_Campaign_ID();

    /**
     * Set Campaign. Marketing Campaign
     */
    void setC_Campaign_ID(int C_Campaign_ID);

    /**
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

    /**
     * Set Currency. The Currency for this record
     */
    void setC_Currency_ID(int C_Currency_ID);

    /**
     * Get Location From. Location that inventory was moved from
     */
    int getC_LocFrom_ID();

    /**
     * Set Location From. Location that inventory was moved from
     */
    void setC_LocFrom_ID(int C_LocFrom_ID);

    /**
     * Get Location To. Location that inventory was moved to
     */
    int getC_LocTo_ID();

    /**
     * Set Location To. Location that inventory was moved to
     */
    void setC_LocTo_ID(int C_LocTo_ID);

    /**
     * Get Period. Period of the Calendar
     */
    int getC_Period_ID();

    /**
     * Set Period. Period of the Calendar
     */
    void setC_Period_ID(int C_Period_ID);

    /**
     * Get Project. Financial Project
     */
    int getC_Project_ID();

    /**
     * Set Project. Financial Project
     */
    void setC_Project_ID(int C_Project_ID);

    /**
     * Get Project Phase. Phase of a Project
     */
    int getC_ProjectPhase_ID();

    /**
     * Set Project Phase. Phase of a Project
     */
    void setC_ProjectPhase_ID(int C_ProjectPhase_ID);

    /**
     * Get Project Task. Actual Project Task in a Phase
     */
    int getC_ProjectTask_ID();

    /**
     * Set Project Task. Actual Project Task in a Phase
     */
    void setC_ProjectTask_ID(int C_ProjectTask_ID);

    /**
     * Get Sales Region. Sales coverage region
     */
    int getC_SalesRegion_ID();

    /**
     * Set Sales Region. Sales coverage region
     */
    void setC_SalesRegion_ID(int C_SalesRegion_ID);

    /**
     * Get Sub Account. Sub account for Element Value
     */
    int getC_SubAcct_ID();

    /**
     * Set Sub Account. Sub account for Element Value
     */
    void setC_SubAcct_ID(int C_SubAcct_ID);

    /**
     * Get Tax. Tax identifier
     */
    int getC_Tax_ID();

    /**
     * Set Tax. Tax identifier
     */
    void setC_Tax_ID(int C_Tax_ID);

    /**
     * Get UOM. Unit of Measure
     */
    int getC_UOM_ID();

    /**
     * Set UOM. Unit of Measure
     */
    void setC_UOM_ID(int C_UOM_ID);

    /**
     * Get Account Date. Accounting Date
     */
    Timestamp getDateAcct();

    /**
     * Set Account Date. Accounting Date
     */
    void setDateAcct(Timestamp DateAcct);

    /**
     * Set Transaction Date. Transaction Date
     */
    void setDateTrx(Timestamp DateTrx);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Budget. General Ledger Budget
     */
    int getGL_Budget_ID();

    /**
     * Set Budget. General Ledger Budget
     */
    void setGL_Budget_ID(int GL_Budget_ID);

    /**
     * Get GL Category. General Ledger Category
     */
    int getGL_Category_ID();

    /**
     * Set GL Category. General Ledger Category
     */
    void setGL_Category_ID(int GL_Category_ID);

    /**
     * Get Line ID. Transaction line ID (internal)
     */
    int getLine_ID();

    /**
     * Set Line ID. Transaction line ID (internal)
     */
    void setLine_ID(int Line_ID);

    /**
     * Get Locator. Warehouse Locator
     */
    int getM_Locator_ID();

    /**
     * Set Locator. Warehouse Locator
     */
    void setM_Locator_ID(int M_Locator_ID);

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    void setM_Product_ID(int M_Product_ID);

    /**
     * Get PostingType. The type of posted amount for the transaction
     */
    String getPostingType();

    /**
     * Set PostingType. The type of posted amount for the transaction
     */
    void setPostingType(String PostingType);

    /**
     * Get Quantity. Quantity
     */
    BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    void setQty(BigDecimal Qty);

    /**
     * Get Record ID. Direct internal record ID
     */
    int getRecord_ID();

    /**
     * Set Record ID. Direct internal record ID
     */
    void setRecord_ID(int Record_ID);

    /**
     * Get User Element List 1. User defined list element #1
     */
    int getUser1_ID();

    /**
     * Set User Element List 1. User defined list element #1
     */
    void setUser1_ID(int User1_ID);

    /**
     * Get User Element List 2. User defined list element #2
     */
    int getUser2_ID();

    /**
     * Set User Element List 2. User defined list element #2
     */
    void setUser2_ID(int User2_ID);

    /**
     * Get User Column 1. User defined accounting Element
     */
    int getUserElement1_ID();

    /**
     * Set User Column 1. User defined accounting Element
     */
    void setUserElement1_ID(int UserElement1_ID);

    /**
     * Get User Column 2. User defined accounting Element
     */
    int getUserElement2_ID();

    /**
     * Set User Column 2. User defined accounting Element
     */
    void setUserElement2_ID(int UserElement2_ID);
}
