package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_BankAccount_Processor
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BankAccount_Processor {

    /**
     * TableName=C_BankAccount_Processor
     */
    String Table_Name = "C_BankAccount_Processor";

    /**
     * AD_Table_ID=200030
     */
    int Table_ID = 200030;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AcceptAMEX
     */
    String COLUMNNAME_AcceptAMEX = "AcceptAMEX";
    /**
     * Column name AcceptATM
     */
    String COLUMNNAME_AcceptATM = "AcceptATM";
    /**
     * Column name AcceptCheck
     */
    String COLUMNNAME_AcceptCheck = "AcceptCheck";
    /**
     * Column name AcceptCorporate
     */
    String COLUMNNAME_AcceptCorporate = "AcceptCorporate";
    /**
     * Column name AcceptDiners
     */
    String COLUMNNAME_AcceptDiners = "AcceptDiners";
    /**
     * Column name AcceptDirectDebit
     */
    String COLUMNNAME_AcceptDirectDebit = "AcceptDirectDebit";
    /**
     * Column name AcceptDirectDeposit
     */
    String COLUMNNAME_AcceptDirectDeposit = "AcceptDirectDeposit";
    /**
     * Column name AcceptDiscover
     */
    String COLUMNNAME_AcceptDiscover = "AcceptDiscover";
    /**
     * Column name AcceptMC
     */
    String COLUMNNAME_AcceptMC = "AcceptMC";
    /**
     * Column name AcceptVisa
     */
    String COLUMNNAME_AcceptVisa = "AcceptVisa";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_BankAccount_ID
     */
    String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
    /**
     * Column name C_BankAccount_Processor_UU
     */
    String COLUMNNAME_C_BankAccount_Processor_UU = "C_BankAccount_Processor_UU";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name C_PaymentProcessor_ID
     */
    String COLUMNNAME_C_PaymentProcessor_ID = "C_PaymentProcessor_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsPPAcceptAMEX
     */
    String COLUMNNAME_IsPPAcceptAMEX = "IsPPAcceptAMEX";
    /**
     * Column name IsPPAcceptATM
     */
    String COLUMNNAME_IsPPAcceptATM = "IsPPAcceptATM";
    /**
     * Column name IsPPAcceptCheck
     */
    String COLUMNNAME_IsPPAcceptCheck = "IsPPAcceptCheck";
    /**
     * Column name IsPPAcceptCorporate
     */
    String COLUMNNAME_IsPPAcceptCorporate = "IsPPAcceptCorporate";
    /**
     * Column name IsPPAcceptDiners
     */
    String COLUMNNAME_IsPPAcceptDiners = "IsPPAcceptDiners";
    /**
     * Column name IsPPAcceptDirectDebit
     */
    String COLUMNNAME_IsPPAcceptDirectDebit = "IsPPAcceptDirectDebit";
    /**
     * Column name IsPPAcceptDirectDeposit
     */
    String COLUMNNAME_IsPPAcceptDirectDeposit = "IsPPAcceptDirectDeposit";
    /**
     * Column name IsPPAcceptDiscover
     */
    String COLUMNNAME_IsPPAcceptDiscover = "IsPPAcceptDiscover";
    /**
     * Column name IsPPAcceptMC
     */
    String COLUMNNAME_IsPPAcceptMC = "IsPPAcceptMC";
    /**
     * Column name IsPPAcceptVisa
     */
    String COLUMNNAME_IsPPAcceptVisa = "IsPPAcceptVisa";
    /**
     * Column name MinimumAmt
     */
    String COLUMNNAME_MinimumAmt = "MinimumAmt";
    /**
     * Column name PartnerID
     */
    String COLUMNNAME_PartnerID = "PartnerID";
    /**
     * Column name Password
     */
    String COLUMNNAME_Password = "Password";
    /**
     * Column name RequireVV
     */
    String COLUMNNAME_RequireVV = "RequireVV";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name UserID
     */
    String COLUMNNAME_UserID = "UserID";
    /**
     * Column name VendorID
     */
    String COLUMNNAME_VendorID = "VendorID";

    /**
     * Get Accept AMEX. Accept American Express Card
     */
    boolean isAcceptAMEX();

    /**
     * Set Accept AMEX. Accept American Express Card
     */
    void setAcceptAMEX(boolean AcceptAMEX);

    /**
     * Get Accept ATM. Accept Bank ATM Card
     */
    boolean isAcceptATM();

    /**
     * Set Accept ATM. Accept Bank ATM Card
     */
    void setAcceptATM(boolean AcceptATM);

    /**
     * Get Accept Electronic Check. Accept ECheck (Electronic Checks)
     */
    boolean isAcceptCheck();

    /**
     * Set Accept Electronic Check. Accept ECheck (Electronic Checks)
     */
    void setAcceptCheck(boolean AcceptCheck);

    /**
     * Get Accept Corporate. Accept Corporate Purchase Cards
     */
    boolean isAcceptCorporate();

    /**
     * Set Accept Corporate. Accept Corporate Purchase Cards
     */
    void setAcceptCorporate(boolean AcceptCorporate);

    /**
     * Get Accept Diners. Accept Diner's Club
     */
    boolean isAcceptDiners();

    /**
     * Set Accept Diners. Accept Diner's Club
     */
    void setAcceptDiners(boolean AcceptDiners);

    /**
     * Get Accept Direct Debit. Accept Direct Debits (vendor initiated)
     */
    boolean isAcceptDirectDebit();

    /**
     * Set Accept Direct Debit. Accept Direct Debits (vendor initiated)
     */
    void setAcceptDirectDebit(boolean AcceptDirectDebit);

    /**
     * Get Accept Direct Deposit. Accept Direct Deposit (payee initiated)
     */
    boolean isAcceptDirectDeposit();

    /**
     * Set Accept Direct Deposit. Accept Direct Deposit (payee initiated)
     */
    void setAcceptDirectDeposit(boolean AcceptDirectDeposit);

    /**
     * Get Accept Discover. Accept Discover Card
     */
    boolean isAcceptDiscover();

    /**
     * Set Accept Discover. Accept Discover Card
     */
    void setAcceptDiscover(boolean AcceptDiscover);

    /**
     * Get Accept MasterCard. Accept Master Card
     */
    boolean isAcceptMC();

    /**
     * Set Accept MasterCard. Accept Master Card
     */
    void setAcceptMC(boolean AcceptMC);

    /**
     * Get Accept Visa. Accept Visa Cards
     */
    boolean isAcceptVisa();

    /**
     * Set Accept Visa. Accept Visa Cards
     */
    void setAcceptVisa(boolean AcceptVisa);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Bank Account. Account at the Bank
     */
    int getC_BankAccount_ID();

    /**
     * Set Bank Account. Account at the Bank
     */
    void setC_BankAccount_ID(int C_BankAccount_ID);

    I_C_BankAccount getC_BankAccount() throws RuntimeException;

    /**
     * Get C_BankAccount_Processor_UU
     */
    String getC_BankAccount_Processor_UU();

    /**
     * Set C_BankAccount_Processor_UU
     */
    void setC_BankAccount_Processor_UU(String C_BankAccount_Processor_UU);

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
     * Get Payment Processor. Payment processor for electronic payments
     */
    int getC_PaymentProcessor_ID();

    /**
     * Set Payment Processor. Payment processor for electronic payments
     */
    void setC_PaymentProcessor_ID(int C_PaymentProcessor_ID);

    I_C_PaymentProcessor getC_PaymentProcessor() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Accept AMEX
     */
    void setIsPPAcceptAMEX(boolean IsPPAcceptAMEX);

    /**
     * Get Accept AMEX
     */
    boolean isPPAcceptAMEX();

    /**
     * Set Accept ATM
     */
    void setIsPPAcceptATM(boolean IsPPAcceptATM);

    /**
     * Get Accept ATM
     */
    boolean isPPAcceptATM();

    /**
     * Set Accept Check
     */
    void setIsPPAcceptCheck(boolean IsPPAcceptCheck);

    /**
     * Get Accept Check
     */
    boolean isPPAcceptCheck();

    /**
     * Set Accept Corporate
     */
    void setIsPPAcceptCorporate(boolean IsPPAcceptCorporate);

    /**
     * Get Accept Corporate
     */
    boolean isPPAcceptCorporate();

    /**
     * Set Accept Diners
     */
    void setIsPPAcceptDiners(boolean IsPPAcceptDiners);

    /**
     * Get Accept Diners
     */
    boolean isPPAcceptDiners();

    /**
     * Set Accept Direct Debit
     */
    void setIsPPAcceptDirectDebit(boolean IsPPAcceptDirectDebit);

    /**
     * Get Accept Direct Debit
     */
    boolean isPPAcceptDirectDebit();

    /**
     * Set Accept Direct Deposit
     */
    void setIsPPAcceptDirectDeposit(boolean IsPPAcceptDirectDeposit);

    /**
     * Get Accept Direct Deposit
     */
    boolean isPPAcceptDirectDeposit();

    /**
     * Set Accept Discover
     */
    void setIsPPAcceptDiscover(boolean IsPPAcceptDiscover);

    /**
     * Get Accept Discover
     */
    boolean isPPAcceptDiscover();

    /**
     * Set Accept MasterCard
     */
    void setIsPPAcceptMC(boolean IsPPAcceptMC);

    /**
     * Get Accept MasterCard
     */
    boolean isPPAcceptMC();

    /**
     * Set Accept Visa
     */
    void setIsPPAcceptVisa(boolean IsPPAcceptVisa);

    /**
     * Get Accept Visa
     */
    boolean isPPAcceptVisa();

    /**
     * Get Minimum Amt. Minimum Amount in Document Currency
     */
    BigDecimal getMinimumAmt();

    /**
     * Set Minimum Amt. Minimum Amount in Document Currency
     */
    void setMinimumAmt(BigDecimal MinimumAmt);

    /**
     * Get Partner ID. Partner ID or Account for the Payment Processor
     */
    String getPartnerID();

    /**
     * Set Partner ID. Partner ID or Account for the Payment Processor
     */
    void setPartnerID(String PartnerID);

    /**
     * Get Password. Password of any length (case sensitive)
     */
    String getPassword();

    /**
     * Set Password. Password of any length (case sensitive)
     */
    void setPassword(String Password);

    /**
     * Get Require CreditCard Verification Code. Require 3/4 digit Credit Verification Code
     */
    boolean isRequireVV();

    /**
     * Set Require CreditCard Verification Code. Require 3/4 digit Credit Verification Code
     */
    void setRequireVV(boolean RequireVV);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get User ID. User ID or account number
     */
    String getUserID();

    /**
     * Set User ID. User ID or account number
     */
    void setUserID(String UserID);

    /**
     * Get Vendor ID. Vendor ID for the Payment Processor
     */
    String getVendorID();

    /**
     * Set Vendor ID. Vendor ID for the Payment Processor
     */
    void setVendorID(String VendorID);
}
