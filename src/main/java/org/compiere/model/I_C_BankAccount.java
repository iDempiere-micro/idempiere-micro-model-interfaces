package org.compiere.model;

import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;

/**
 * Generated Interface for C_BankAccount
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BankAccount extends IPO {

    /**
     * TableName=C_BankAccount
     */
    String Table_Name = "C_BankAccount";

    /**
     * AD_Table_ID=297
     */
    int Table_ID = 297;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AccountNo
     */
    String COLUMNNAME_AccountNo = "AccountNo";
    /**
     * Column name BankAccountType
     */
    String COLUMNNAME_BankAccountType = "BankAccountType";
    /**
     * Column name BBAN
     */
    String COLUMNNAME_BBAN = "BBAN";
    /**
     * Column name C_BankAccount_ID
     */
    String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
    /**
     * Column name C_BankAccount_UU
     */
    String COLUMNNAME_C_BankAccount_UU = "C_BankAccount_UU";
    /**
     * Column name C_Bank_ID
     */
    String COLUMNNAME_C_Bank_ID = "C_Bank_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name CreditLimit
     */
    String COLUMNNAME_CreditLimit = "CreditLimit";
    /**
     * Column name CurrentBalance
     */
    String COLUMNNAME_CurrentBalance = "CurrentBalance";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IBAN
     */
    String COLUMNNAME_IBAN = "IBAN";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name PaymentExportClass
     */
    String COLUMNNAME_PaymentExportClass = "PaymentExportClass";

    /**
     * Get Account No. Account Number
     */
    String getAccountNo();

    /**
     * Set Account No. Account Number
     */
    void setAccountNo(String AccountNo);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Bank Account Type. Bank Account Type
     */
    void setBankAccountType(String BankAccountType);

    /**
     * Get Bank Account. Account at the Bank
     */
    int getC_BankAccount_ID();

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
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

    /**
     * Set Currency. The Currency for this record
     */
    void setC_Currency_ID(int C_Currency_ID);

    /**
     * Set Credit limit. Amount of Credit allowed
     */
    void setCreditLimit(BigDecimal CreditLimit);

    /**
     * Get Current balance. Current Balance
     */
    BigDecimal getCurrentBalance();

    /**
     * Set Current balance. Current Balance
     */
    void setCurrentBalance(BigDecimal CurrentBalance);

    /**
     * Get IBAN. International Bank Account Number
     */
    String getIBAN();

    /**
     * Set IBAN. International Bank Account Number
     */
    void setIBAN(String IBAN);

    /**
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);
}
