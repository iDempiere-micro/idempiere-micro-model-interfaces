package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;
import org.idempiere.icommon.model.IPO;

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

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

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
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
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
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
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
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name PaymentExportClass
     */
    String COLUMNNAME_PaymentExportClass = "PaymentExportClass";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

    /**
     * Get Account No. Account Number
     */
    String getAccountNo();

    /**
     * Set Account No. Account Number
     */
    void setAccountNo(String AccountNo);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Bank Account Type. Bank Account Type
     */
    String getBankAccountType();

    /**
     * Set Bank Account Type. Bank Account Type
     */
    void setBankAccountType(String BankAccountType);

    /**
     * Get BBAN. Basic Bank Account Number
     */
    String getBBAN();

    /**
     * Set BBAN. Basic Bank Account Number
     */
    void setBBAN(String BBAN);

    /**
     * Get Bank Account. Account at the Bank
     */
    int getC_BankAccount_ID();

    /**
     * Set Bank Account. Account at the Bank
     */
    void setC_BankAccount_ID(int C_BankAccount_ID);

    /**
     * Get C_BankAccount_UU
     */
    String getC_BankAccount_UU();

    /**
     * Set C_BankAccount_UU
     */
    void setC_BankAccount_UU(String C_BankAccount_UU);

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
     * Get Credit limit. Amount of Credit allowed
     */
    BigDecimal getCreditLimit();

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
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get IBAN. International Bank Account Number
     */
    String getIBAN();

    /**
     * Set IBAN. International Bank Account Number
     */
    void setIBAN(String IBAN);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    boolean isDefault();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Payment Export Class
     */
    String getPaymentExportClass();

    /**
     * Set Payment Export Class
     */
    void setPaymentExportClass(String PaymentExportClass);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);
}
