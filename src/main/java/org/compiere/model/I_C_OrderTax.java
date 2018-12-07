package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;
import org.idempiere.icommon.model.IPO;

/**
 * Generated Interface for C_OrderTax
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_OrderTax extends IPO {

    /**
     * TableName=C_OrderTax
     */
    String Table_Name = "C_OrderTax";

    /**
     * AD_Table_ID=314
     */
    int Table_ID = 314;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_Order_ID
     */
    String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name C_OrderTax_UU
     */
    String COLUMNNAME_C_OrderTax_UU = "C_OrderTax_UU";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_Tax_ID
     */
    String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
    /**
     * Column name C_TaxProvider_ID
     */
    String COLUMNNAME_C_TaxProvider_ID = "C_TaxProvider_ID";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsTaxIncluded
     */
    String COLUMNNAME_IsTaxIncluded = "IsTaxIncluded";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name TaxAmt
     */
    String COLUMNNAME_TaxAmt = "TaxAmt";
    /**
     * Column name TaxBaseAmt
     */
    String COLUMNNAME_TaxBaseAmt = "TaxBaseAmt";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Order. Order
     */
    int getC_Order_ID();

    /**
     * Set Order. Order
     */
    void setC_Order_ID(int C_Order_ID);

    I_C_Order getC_Order() throws RuntimeException;

    /**
     * Get C_OrderTax_UU
     */
    String getC_OrderTax_UU();

    /**
     * Set C_OrderTax_UU
     */
    void setC_OrderTax_UU(String C_OrderTax_UU);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Tax. Tax identifier
     */
    int getC_Tax_ID();

    /**
     * Set Tax. Tax identifier
     */
    void setC_Tax_ID(int C_Tax_ID);

    I_C_Tax getC_Tax() throws RuntimeException;

    /**
     * Get Tax Provider
     */
    int getC_TaxProvider_ID();

    /**
     * Set Tax Provider
     */
    void setC_TaxProvider_ID(int C_TaxProvider_ID);

    I_C_TaxProvider getC_TaxProvider() throws RuntimeException;

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Price includes Tax. Tax is included in the price
     */
    void setIsTaxIncluded(boolean IsTaxIncluded);

    /**
     * Get Price includes Tax. Tax is included in the price
     */
    boolean isTaxIncluded();

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Tax Amount. Tax Amount for a document
     */
    BigDecimal getTaxAmt();

    /**
     * Set Tax Amount. Tax Amount for a document
     */
    void setTaxAmt(BigDecimal TaxAmt);

    /**
     * Get Tax base Amount. Base for calculating the tax amount
     */
    BigDecimal getTaxBaseAmt();

    /**
     * Set Tax base Amount. Base for calculating the tax amount
     */
    void setTaxBaseAmt(BigDecimal TaxBaseAmt);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    I_C_Tax getTax();

    boolean delete(boolean b, String trxName);

    boolean save(String trxName);
}
