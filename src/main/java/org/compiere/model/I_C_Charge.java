package org.compiere.model;

import org.idempiere.icommon.model.PersistentObject;

import java.math.BigDecimal;

/**
 * Generated Interface for C_Charge
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Charge extends PersistentObject {

    /**
     * TableName=C_Charge
     */
    String Table_Name = "C_Charge";

    /**
     * AD_Table_ID=313
     */
    int Table_ID = 313;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_ChargeType_ID
     */
    String COLUMNNAME_C_ChargeType_ID = "C_ChargeType_ID";
    /**
     * Column name ChargeAmt
     */
    String COLUMNNAME_ChargeAmt = "ChargeAmt";
    /**
     * Column name C_TaxCategory_ID
     */
    String COLUMNNAME_C_TaxCategory_ID = "C_TaxCategory_ID";
    /**
     * Column name IsSameCurrency
     */
    String COLUMNNAME_IsSameCurrency = "IsSameCurrency";
    /**
     * Column name IsSameTax
     */
    String COLUMNNAME_IsSameTax = "IsSameTax";
    /**
     * Column name IsTaxIncluded
     */
    String COLUMNNAME_IsTaxIncluded = "IsTaxIncluded";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getBusinessPartnerId();

    /**
     * Get Charge amount. Charge Amount
     */
    BigDecimal getChargeAmt();

    /**
     * Set Charge amount. Charge Amount
     */
    void setChargeAmt(BigDecimal ChargeAmt);

    /**
     * Get Tax Category. Tax Category
     */
    int getTaxCategoryId();

    I_C_TaxCategory getTaxCategory() throws RuntimeException;

    /**
     * Set Same Currency
     */
    void setIsSameCurrency(boolean IsSameCurrency);

    /**
     * Set Same Tax. Use the same tax as the main transaction
     */
    void setIsSameTax(boolean IsSameTax);

    /**
     * Set Price includes Tax. Tax is included in the price
     */
    void setIsTaxIncluded(boolean IsTaxIncluded);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

}
