package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for T_BankRegister
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_T_BankRegister {

    /**
     * TableName=T_BankRegister
     */
    String Table_Name = "T_BankRegister";

    /**
     * AD_Table_ID=200070
     */
    int Table_ID = 200070;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name Account
     */
    String COLUMNNAME_Account = "Account";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_PInstance_ID
     */
    String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
    /**
     * Column name AmtAcctCr
     */
    String COLUMNNAME_AmtAcctCr = "AmtAcctCr";
    /**
     * Column name AmtAcctDr
     */
    String COLUMNNAME_AmtAcctDr = "AmtAcctDr";
    /**
     * Column name Balance
     */
    String COLUMNNAME_Balance = "Balance";
    /**
     * Column name BankName
     */
    String COLUMNNAME_BankName = "BankName";
    /**
     * Column name BPartner
     */
    String COLUMNNAME_BPartner = "BPartner";
    /**
     * Column name C_Bank_ID
     */
    String COLUMNNAME_C_Bank_ID = "C_Bank_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name DateAcct
     */
    String COLUMNNAME_DateAcct = "DateAcct";
    /**
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name T_BankRegister_UU
     */
    String COLUMNNAME_T_BankRegister_UU = "T_BankRegister_UU";

    /**
     * Get Account
     */
    String getAccount();

    /**
     * Set Account
     */
    void setAccount(String Account);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Process Instance. Instance of the process
     */
    int getAD_PInstance_ID();

    /**
     * Set Process Instance. Instance of the process
     */
    void setAD_PInstance_ID(int AD_PInstance_ID);

    I_AD_PInstance getAD_PInstance() throws RuntimeException;

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
     * Get Balance
     */
    BigDecimal getBalance();

    /**
     * Set Balance
     */
    void setBalance(BigDecimal Balance);

    /**
     * Get Bank Name
     */
    String getBankName();

    /**
     * Set Bank Name
     */
    void setBankName(String BankName);

    /**
     * Get Business Partner
     */
    String getBPartner();

    /**
     * Set Business Partner
     */
    void setBPartner(String BPartner);

    /**
     * Get Bank. Bank
     */
    int getC_Bank_ID();

    /**
     * Set Bank. Bank
     */
    void setC_Bank_ID(int C_Bank_ID);

    I_C_Bank getC_Bank() throws RuntimeException;

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
     * Get Account Date. Accounting Date
     */
    Timestamp getDateAcct();

    /**
     * Set Account Date. Accounting Date
     */
    void setDateAcct(Timestamp DateAcct);

    /**
     * Get Document No. Document sequence number of the document
     */
    String getDocumentNo();

    /**
     * Set Document No. Document sequence number of the document
     */
    void setDocumentNo(String DocumentNo);

    /**
     * Get T_BankRegister_UU
     */
    String getT_BankRegister_UU();

    /**
     * Set T_BankRegister_UU
     */
    void setT_BankRegister_UU(String T_BankRegister_UU);
}
