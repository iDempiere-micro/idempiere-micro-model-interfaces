package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_TaxDeclarationAcct
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_TaxDeclarationAcct {

    /**
     * TableName=C_TaxDeclarationAcct
     */
    String Table_Name = "C_TaxDeclarationAcct";

    /**
     * AD_Table_ID=820
     */
    int Table_ID = 820;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name Account_ID
     */
    String COLUMNNAME_Account_ID = "Account_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
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
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_TaxDeclarationAcct_ID
     */
    String COLUMNNAME_C_TaxDeclarationAcct_ID = "C_TaxDeclarationAcct_ID";
    /**
     * Column name C_TaxDeclarationAcct_UU
     */
    String COLUMNNAME_C_TaxDeclarationAcct_UU = "C_TaxDeclarationAcct_UU";
    /**
     * Column name C_TaxDeclaration_ID
     */
    String COLUMNNAME_C_TaxDeclaration_ID = "C_TaxDeclaration_ID";
    /**
     * Column name C_Tax_ID
     */
    String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
    /**
     * Column name DateAcct
     */
    String COLUMNNAME_DateAcct = "DateAcct";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Fact_Acct_ID
     */
    String COLUMNNAME_Fact_Acct_ID = "Fact_Acct_ID";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Account. Account used
     */
    int getAccount_ID();

    /**
     * Set Account. Account used
     */
    void setAccount_ID(int Account_ID);

    I_C_ElementValue getAccount() throws RuntimeException;

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

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

    I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setC_BPartner_ID(int C_BPartner_ID);

    I_C_BPartner getC_BPartner() throws RuntimeException;

    /**
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

    /**
     * Set Currency. The Currency for this record
     */
    void setC_Currency_ID(int C_Currency_ID);

    I_C_Currency getC_Currency() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Tax Declaration Accounting. Tax Accounting Reconciliation
     */
    int getC_TaxDeclarationAcct_ID();

    /**
     * Set Tax Declaration Accounting. Tax Accounting Reconciliation
     */
    void setC_TaxDeclarationAcct_ID(int C_TaxDeclarationAcct_ID);

    /**
     * Get C_TaxDeclarationAcct_UU
     */
    String getC_TaxDeclarationAcct_UU();

    /**
     * Set C_TaxDeclarationAcct_UU
     */
    void setC_TaxDeclarationAcct_UU(String C_TaxDeclarationAcct_UU);

    /**
     * Get Tax Declaration. Define the declaration to the tax authorities
     */
    int getC_TaxDeclaration_ID();

    /**
     * Set Tax Declaration. Define the declaration to the tax authorities
     */
    void setC_TaxDeclaration_ID(int C_TaxDeclaration_ID);

    I_C_TaxDeclaration getC_TaxDeclaration() throws RuntimeException;

    /**
     * Get Tax. Tax identifier
     */
    int getC_Tax_ID();

    /**
     * Set Tax. Tax identifier
     */
    void setC_Tax_ID(int C_Tax_ID);

    I_C_Tax getC_Tax() throws RuntimeException;

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
     * Get Accounting Fact
     */
    int getFact_Acct_ID();

    /**
     * Set Accounting Fact
     */
    void setFact_Acct_ID(int Fact_Acct_ID);

    I_Fact_Acct getFact_Acct() throws RuntimeException;

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Line No. Unique line for this document
     */
    int getLine();

    /**
     * Set Line No. Unique line for this document
     */
    void setLine(int Line);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
