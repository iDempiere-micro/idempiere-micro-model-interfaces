package org.compiere.model;

import java.math.BigDecimal;

/**
 * @author Elaine
 */
public interface PaymentInterface {

    /**
     * Set Account No. Account Number
     */
    void setAccountNo(String AccountNo);

    /**
     * Set Bank Account. Account at the Bank
     */
    void setC_BankAccount_ID(int C_BankAccount_ID);

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setC_BPartner_ID(int C_BPartner_ID);

    /**
     * Set Currency. The Currency for this record
     */
    void setC_Currency_ID(int C_Currency_ID);

    /**
     * Set Check No. Check Number
     */
    void setCheckNo(String CheckNo);

    /**
     * Set Exp. Month. Expiry Month
     */
    void setCreditCardExpMM(int CreditCardExpMM);

    /**
     * Set Exp. Year. Expiry Year
     */
    void setCreditCardExpYY(int CreditCardExpYY);

    /**
     * Set Number. Credit Card Number
     */
    void setCreditCardNumber(String CreditCardNumber);

    /**
     * Set Verification Code. Credit Card Verification code on credit card
     */
    void setCreditCardVV(String CreditCardVV);

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

}
