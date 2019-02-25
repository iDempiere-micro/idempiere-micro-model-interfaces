package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_BP_BankAccount
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BP_BankAccount {

    /**
     * TableName=C_BP_BankAccount
     */
    String Table_Name = "C_BP_BankAccount";

    /**
     * AD_Table_ID=298
     */
    int Table_ID = 298;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);



    /**
     * Column name AccountNo
     */
    String COLUMNNAME_AccountNo = "AccountNo";
    /**
     * Column name A_City
     */
    String COLUMNNAME_A_City = "A_City";
    /**
     * Column name A_Country
     */
    String COLUMNNAME_A_Country = "A_Country";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name A_EMail
     */
    String COLUMNNAME_A_EMail = "A_EMail";
    /**
     * Column name A_Ident_DL
     */
    String COLUMNNAME_A_Ident_DL = "A_Ident_DL";
    /**
     * Column name A_Ident_SSN
     */
    String COLUMNNAME_A_Ident_SSN = "A_Ident_SSN";
    /**
     * Column name A_Name
     */
    String COLUMNNAME_A_Name = "A_Name";
    /**
     * Column name A_State
     */
    String COLUMNNAME_A_State = "A_State";
    /**
     * Column name A_Street
     */
    String COLUMNNAME_A_Street = "A_Street";
    /**
     * Column name A_Zip
     */
    String COLUMNNAME_A_Zip = "A_Zip";
    /**
     * Column name BPBankAcctUse
     */
    String COLUMNNAME_BPBankAcctUse = "BPBankAcctUse";
    /**
     * Column name C_Bank_ID
     */
    String COLUMNNAME_C_Bank_ID = "C_Bank_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_BP_BankAccount_ID
     */
    String COLUMNNAME_C_BP_BankAccount_ID = "C_BP_BankAccount_ID";
    /**
     * Column name C_PaymentProcessor_ID
     */
    String COLUMNNAME_C_PaymentProcessor_ID = "C_PaymentProcessor_ID";
    /**
     * Column name CreditCardExpMM
     */
    String COLUMNNAME_CreditCardExpMM = "CreditCardExpMM";
    /**
     * Column name CreditCardExpYY
     */
    String COLUMNNAME_CreditCardExpYY = "CreditCardExpYY";
    /**
     * Column name CreditCardNumber
     */
    String COLUMNNAME_CreditCardNumber = "CreditCardNumber";
    /**
     * Column name CreditCardType
     */
    String COLUMNNAME_CreditCardType = "CreditCardType";
    /**
     * Column name CreditCardVV
     */
    String COLUMNNAME_CreditCardVV = "CreditCardVV";
    /**
     * Column name IBAN
     */
    String COLUMNNAME_IBAN = "IBAN";
    /**
     * Column name IsACH
     */
    String COLUMNNAME_IsACH = "IsACH";
    /**
     * Column name R_AvsAddr
     */
    String COLUMNNAME_R_AvsAddr = "R_AvsAddr";
    /**
     * Column name R_AvsZip
     */
    String COLUMNNAME_R_AvsZip = "R_AvsZip";
    /**
     * Column name RoutingNo
     */
    String COLUMNNAME_RoutingNo = "RoutingNo";

    /**
     * Get Account No. Account Number
     */
    String getAccountNo();

    /**
     * Set Account City. City or the Credit Card or Account Holder
     */
    void setA_City(String A_City);

    /**
     * Set Account Country. Country
     */
    void setA_Country(String A_Country);

    /**
     * Set Account EMail. Email Address
     */
    void setA_EMail(String A_EMail);

    /**
     * Get Account Name. Name on Credit Card or Account holder
     */
    String getA_Name();

    /**
     * Set Account Name. Name on Credit Card or Account holder
     */
    void setA_Name(String A_Name);

    /**
     * Set Account State. State of the Credit Card or Account holder
     */
    void setA_State(String A_State);

    /**
     * Set Account Street. Street address of the Credit Card or Account holder
     */
    void setA_Street(String A_Street);

    /**
     * Set Account Zip/Postal. Zip Code of the Credit Card or Account Holder
     */
    void setA_Zip(String A_Zip);

    /**
     * Get Account Usage. Business Partner Bank Account usage
     */
    String getBPBankAcctUse();

    /**
     * Set Account Usage. Business Partner Bank Account usage
     */
    void setBPBankAcctUse(String BPBankAcctUse);

    /**
     * Get Bank. Bank
     */
    int getC_Bank_ID();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setC_BPartner_ID(int C_BPartner_ID);

    /**
     * Get Partner Bank Account. Bank Account of the Business Partner
     */
    int getC_BP_BankAccount_ID();

    /**
     * Get Number. Credit Card Number
     */
    String getCreditCardNumber();

    /**
     * Set Number. Credit Card Number
     */
    void setCreditCardNumber(String CreditCardNumber);

    /**
     * Get Verification Code. Credit Card Verification code on credit card
     */
    String getCreditCardVV();

    /**
     * Set Verification Code. Credit Card Verification code on credit card
     */
    void setCreditCardVV(String CreditCardVV);

    /**
     * Get IBAN. International Bank Account Number
     */
    String getIBAN();

    /**
     * Set IBAN. International Bank Account Number
     */
    void setIBAN(String IBAN);

    /**
     * Set ACH. Automatic Clearing House
     */
    void setIsACH(boolean IsACH);

    /**
     * Get ACH. Automatic Clearing House
     */
    boolean isACH();

    /**
     * Get Routing No. Bank Routing Number
     */
    String getRoutingNo();

    /**
     * Set Routing No. Bank Routing Number
     */
    void setRoutingNo(String RoutingNo);

}
