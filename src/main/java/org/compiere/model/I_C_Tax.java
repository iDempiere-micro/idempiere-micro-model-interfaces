package org.compiere.model;

import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;

/**
 * Generated Interface for C_Tax
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Tax extends IPO {

    /**
     * TableName=C_Tax
     */
    String Table_Name = "C_Tax";

    /**
     * AD_Table_ID=261
     */
    int Table_ID = 261;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);



    /**
     * Column name C_CountryGroupFrom_ID
     */
    String COLUMNNAME_C_CountryGroupFrom_ID = "C_CountryGroupFrom_ID";
    /**
     * Column name C_CountryGroupTo_ID
     */
    String COLUMNNAME_C_CountryGroupTo_ID = "C_CountryGroupTo_ID";
    /**
     * Column name C_Country_ID
     */
    String COLUMNNAME_C_Country_ID = "C_Country_ID";
    /**
     * Column name C_Region_ID
     */
    String COLUMNNAME_C_Region_ID = "C_Region_ID";
    /**
     * Column name C_TaxCategory_ID
     */
    String COLUMNNAME_C_TaxCategory_ID = "C_TaxCategory_ID";
    /**
     * Column name C_Tax_ID
     */
    String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
    /**
     * Column name C_TaxProvider_ID
     */
    String COLUMNNAME_C_TaxProvider_ID = "C_TaxProvider_ID";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name IsDocumentLevel
     */
    String COLUMNNAME_IsDocumentLevel = "IsDocumentLevel";
    /**
     * Column name IsSalesTax
     */
    String COLUMNNAME_IsSalesTax = "IsSalesTax";
    /**
     * Column name IsSummary
     */
    String COLUMNNAME_IsSummary = "IsSummary";
    /**
     * Column name IsTaxExempt
     */
    String COLUMNNAME_IsTaxExempt = "IsTaxExempt";
    /**
     * Column name Parent_Tax_ID
     */
    String COLUMNNAME_Parent_Tax_ID = "Parent_Tax_ID";
    /**
     * Column name Rate
     */
    String COLUMNNAME_Rate = "Rate";
    /**
     * Column name RequiresTaxCertificate
     */
    String COLUMNNAME_RequiresTaxCertificate = "RequiresTaxCertificate";
    /**
     * Column name SOPOType
     */
    String COLUMNNAME_SOPOType = "SOPOType";
    /**
     * Column name To_Country_ID
     */
    String COLUMNNAME_To_Country_ID = "To_Country_ID";
    /**
     * Column name To_Region_ID
     */
    String COLUMNNAME_To_Region_ID = "To_Region_ID";
    /**
     * Column name ValidFrom
     */
    String COLUMNNAME_ValidFrom = "ValidFrom";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Tax. Tax identifier
     */
    int getC_Tax_ID();

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Document Level. Tax is calculated on document level (rather than line by line)
     */
    boolean isDocumentLevel();

    /**
     * Get Summary Level. This is a summary entity
     */
    boolean isSummary();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    I_C_Tax[] getChildTaxes(boolean b);

    BigDecimal calculateTax(BigDecimal taxBaseAmt, boolean b, int precision);
}
