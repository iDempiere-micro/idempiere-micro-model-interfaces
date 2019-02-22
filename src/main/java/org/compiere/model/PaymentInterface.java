package org.compiere.model;

import java.math.BigDecimal;

/**
 * @author Elaine
 */
public interface PaymentInterface {

    /**
     * Get Account No. Account Number
     */
    String getAccountNo();

    /**
     * Set Account No. Account Number
     */
    void setAccountNo(String AccountNo);

    /**
     * Set Bank Account. Account at the Bank
     */
    void setC_BankAccount_ID(int C_BankAccount_ID);

    /**
     * Get Partner Bank Account. Bank Account of the Business Partner
     */
    int getC_BP_BankAccount_ID();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setC_BPartner_ID(int C_BPartner_ID);

    /**
     * Set Currency. The Currency for this record
     */
    void setC_Currency_ID(int C_Currency_ID);

    /**
     * Get Check No. Check Number
     */
    String getCheckNo();

    /**
     * Set Check No. Check Number
     */
    void setCheckNo(String CheckNo);

    /**
     * Get Exp. Month. Expiry Month
     */
    int getCreditCardExpMM();

    /**
     * Set Exp. Month. Expiry Month
     */
    void setCreditCardExpMM(int CreditCardExpMM);

    /**
     * Get Exp. Year. Expiry Year
     */
    int getCreditCardExpYY();

    /**
     * Set Exp. Year. Expiry Year
     */
    void setCreditCardExpYY(int CreditCardExpYY);

    /**
     * Get Number. Credit Card Number
     */
    String getCreditCardNumber();

    /**
     * Set Number. Credit Card Number
     */
    void setCreditCardNumber(String CreditCardNumber);

    /**
     * Get Credit Card. Credit Card (Visa, MC, AmEx)
     */
    String getCreditCardType();

    /**
     * Get Verification Code. Credit Card Verification code on credit card
     */
    String getCreditCardVV();

    /**
     * Set Verification Code. Credit Card Verification code on credit card
     */
    void setCreditCardVV(String CreditCardVV);

    /**
     * Get Customer Payment Profile ID
     */
    String getCustomerPaymentProfileID();

    /**
     * Set Micr. Combination of routing no, account and check no
     */
    void setMicr(String Micr);

    /**
     * Set Payment amount. Amount being paid
     */
    void setPayAmt(BigDecimal PayAmt);

    /**
     * Set Reference. Payment reference
     */
    void setR_PnRef(String R_PnRef);

    /**
     * Set Routing No. Bank Routing Number
     */
    void setRoutingNo(String RoutingNo);

    /**
     * Set Tax Amount. Tax Amount for a document
     */
    void setTaxAmt(BigDecimal TaxAmt);

    /**
     * Get Tender type. Method of Payment
     */
    String getTenderType();

}
