package org.compiere.model;

import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;

/**
 * Generated Interface for C_InvoiceTax
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_InvoiceTax extends IPO {

    /**
     * TableName=C_InvoiceTax
     */
    String Table_Name = "C_InvoiceTax";

    /**
     * AD_Table_ID=334
     */
    int Table_ID = 334;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


    /**
     * Column name C_Invoice_ID
     */
    String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
    /**
     * Column name C_Tax_ID
     */
    String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
    /**
     * Column name C_TaxProvider_ID
     */
    String COLUMNNAME_C_TaxProvider_ID = "C_TaxProvider_ID";
    /**
     * Column name IsTaxIncluded
     */
    String COLUMNNAME_IsTaxIncluded = "IsTaxIncluded";
    /**
     * Column name TaxAmt
     */
    String COLUMNNAME_TaxAmt = "TaxAmt";
    /**
     * Column name TaxBaseAmt
     */
    String COLUMNNAME_TaxBaseAmt = "TaxBaseAmt";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Tax Provider
     */
    int getTaxProviderId();

    /**
     * Get Tax Amount. Tax Amount for a document
     */
    BigDecimal getTaxAmt();

    /**
     * Get Tax base Amount. Base for calculating the tax amount
     */
    BigDecimal getTaxBaseAmt();

    I_C_Tax getTax();

    void deleteEx(boolean b);

    void setPrecision(int precision);

    void setClientOrg(I_C_InvoiceLine line);

    void setInvoiceId(int invoiceId);

    void setTaxId(int taxId);

    void setIsTaxIncluded(boolean taxIncluded);

    boolean calculateTaxFromLines();

    boolean delete(boolean force);

    void saveEx();
}
