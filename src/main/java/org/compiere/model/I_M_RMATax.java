package org.compiere.model;

import org.idempiere.icommon.model.PersistentObject;

import java.math.BigDecimal;

/**
 * Generated Interface for M_RMATax
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_RMATax extends PersistentObject {

    /**
     * TableName=M_RMATax
     */
    String Table_Name = "M_RMATax";

    /**
     * AD_Table_ID=200055
     */
    int Table_ID = 200055;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


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
     * Column name M_RMA_ID
     */
    String COLUMNNAME_M_RMA_ID = "M_RMA_ID";
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

    boolean delete(boolean b);

    boolean save();
}
