package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_PaymentProcessor
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_PaymentProcessor {

    /**
     * AD_Table_ID=398
     */
    int Table_ID = 398;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);


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
     * Column name AD_Sequence_ID
     */
    String COLUMNNAME_AD_Sequence_ID = "AD_Sequence_ID";
    /**
     * Column name C_BankAccount_ID
     */
    String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name Commission
     */
    String COLUMNNAME_Commission = "Commission";
    /**
     * Column name CostPerTrx
     */
    String COLUMNNAME_CostPerTrx = "CostPerTrx";
    /**
     * Column name HostAddress
     */
    String COLUMNNAME_HostAddress = "HostAddress";
    /**
     * Column name HostPort
     */
    String COLUMNNAME_HostPort = "HostPort";
    /**
     * Column name PayProcessorClass
     */
    String COLUMNNAME_PayProcessorClass = "PayProcessorClass";
    /**
     * Column name ProxyAddress
     */
    String COLUMNNAME_ProxyAddress = "ProxyAddress";
    /**
     * Column name ProxyLogon
     */
    String COLUMNNAME_ProxyLogon = "ProxyLogon";
    /**
     * Column name ProxyPassword
     */
    String COLUMNNAME_ProxyPassword = "ProxyPassword";
    /**
     * Column name ProxyPort
     */
    String COLUMNNAME_ProxyPort = "ProxyPort";
    /**
     * Column name RequireVV
     */
    String COLUMNNAME_RequireVV = "RequireVV";

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
     * Get Bank Account. Account at the Bank
     */
    int getBankAccountId();

    /**
     * Set Bank Account. Account at the Bank
     */
    void setBankAccountId(int C_BankAccount_ID);

    I_C_BankAccount getC_BankAccount() throws RuntimeException;

    /**
     * Set Commission %. Commission stated as a percentage
     */
    void setCommission(BigDecimal Commission);

    /**
     * Set Cost per transaction. Fixed cost per transaction
     */
    void setCostPerTrx(BigDecimal CostPerTrx);

    /**
     * Get Payment Processor Class. Payment Processor Java Class
     */
    String getPayProcessorClass();

    /**
     * Set Require CreditCard Verification Code. Require 3/4 digit Credit Verification Code
     */
    void setRequireVV(boolean RequireVV);

}
