package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_BankAccount_Processor
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BankAccount_Processor {

    /**
     * AD_Table_ID=200030
     */
    int Table_ID = 200030;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


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
     * Column name C_BankAccount_ID
     */
    String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name C_PaymentProcessor_ID
     */
    String COLUMNNAME_C_PaymentProcessor_ID = "C_PaymentProcessor_ID";

    /**
     * Get Accept AMEX. Accept American Express Card
     */
    boolean isAcceptAMEX();

    /**
     * Get Accept ATM. Accept Bank ATM Card
     */
    boolean isAcceptATM();

    /**
     * Get Accept Electronic Check. Accept ECheck (Electronic Checks)
     */
    boolean isAcceptCheck();

    /**
     * Get Accept Corporate. Accept Corporate Purchase Cards
     */
    boolean isAcceptCorporate();

    /**
     * Get Accept Diners. Accept Diner's Club
     */
    boolean isAcceptDiners();

    /**
     * Get Accept Direct Debit. Accept Direct Debits (vendor initiated)
     */
    boolean isAcceptDirectDebit();

    /**
     * Get Accept Direct Deposit. Accept Direct Deposit (payee initiated)
     */
    boolean isAcceptDirectDeposit();

    /**
     * Get Accept Discover. Accept Discover Card
     */
    boolean isAcceptDiscover();

    /**
     * Get Accept MasterCard. Accept Master Card
     */
    boolean isAcceptMC();

    /**
     * Get Accept Visa. Accept Visa Cards
     */
    boolean isAcceptVisa();

    /**
     * Get Bank Account. Account at the Bank
     */
    int getBankAccountId();

    /**
     * Set Bank Account. Account at the Bank
     */
    void setBankAccountId(int C_BankAccount_ID);

    /**
     * Get Payment Processor. Payment processor for electronic payments
     */
    int getPaymentProcessor_ID();

    /**
     * Set Payment Processor. Payment processor for electronic payments
     */
    void setPaymentProcessor_ID(int C_PaymentProcessor_ID);

}
