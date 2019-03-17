package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_POSPayment
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_POSPayment {

    /**
     * TableName=C_POSPayment
     */
    String Table_Name = "C_POSPayment";

    /**
     * AD_Table_ID=200016
     */
    int Table_ID = 200016;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name AccountNo
     */
    String COLUMNNAME_AccountNo = "AccountNo";
    /**
     * Column name A_Name
     */
    String COLUMNNAME_A_Name = "A_Name";
    /**
     * Column name CheckNo
     */
    String COLUMNNAME_CheckNo = "CheckNo";
    /**
     * Column name C_Order_ID
     */
    String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name C_Payment_ID
     */
    String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
    /**
     * Column name C_POSTenderType_ID
     */
    String COLUMNNAME_C_POSTenderType_ID = "C_POSTenderType_ID";
    /**
     * Column name CreditCardNumber
     */
    String COLUMNNAME_CreditCardNumber = "CreditCardNumber";
    /**
     * Column name CreditCardType
     */
    String COLUMNNAME_CreditCardType = "CreditCardType";
    /**
     * Column name IBAN
     */
    String COLUMNNAME_IBAN = "IBAN";
    /**
     * Column name IsPostDated
     */
    String COLUMNNAME_IsPostDated = "IsPostDated";
    /**
     * Column name Micr
     */
    String COLUMNNAME_Micr = "Micr";
    /**
     * Column name PayAmt
     */
    String COLUMNNAME_PayAmt = "PayAmt";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name RoutingNo
     */
    String COLUMNNAME_RoutingNo = "RoutingNo";
    /**
     * Column name SwiftCode
     */
    String COLUMNNAME_SwiftCode = "SwiftCode";
    /**
     * Column name TenderType
     */
    String COLUMNNAME_TenderType = "TenderType";
    /**
     * Column name VoiceAuthCode
     */
    String COLUMNNAME_VoiceAuthCode = "VoiceAuthCode";

    /**
     * Get Account No. Account Number
     */
    String getAccountNo();

    /**
     * Get Account Name. Name on Credit Card or Account holder
     */
    String getAccountName();

    /**
     * Get Check No. Check Number
     */
    String getCheckNo();

    /**
     * Set Payment. Payment identifier
     */
    void setPaymentId(int C_Payment_ID);

    /**
     * Get POS Tender Type
     */
    int getC_POSTenderTypeId();

    /**
     * Get Number. Credit Card Number
     */
    String getCreditCardNumber();

    /**
     * Get Credit Card. Credit Card (Visa, MC, AmEx)
     */
    String getCreditCardType();

    /**
     * Get IBAN. International Bank Account Number
     */
    String getIBAN();

    /**
     * Get Post Dated
     */
    boolean isPostDated();

    /**
     * Get Micr. Combination of routing no, account and check no
     */
    String getMicr();

    /**
     * Get Payment amount. Amount being paid
     */
    BigDecimal getPayAmt();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Routing No. Bank Routing Number
     */
    String getRoutingNo();

    /**
     * Get Swift code. Swift Code or BIC
     */
    String getSwiftCode();

    /**
     * Get Tender type. Method of Payment
     */
    String getTenderType();

    /**
     * Get Voice authorization code. Voice Authorization Code from credit card company
     */
    String getVoiceAuthCode();

}
