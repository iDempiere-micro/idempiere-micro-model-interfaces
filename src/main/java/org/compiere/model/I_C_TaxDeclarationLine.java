package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_TaxDeclarationLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_TaxDeclarationLine {

    /**
     * TableName=C_TaxDeclarationLine
     */
    String Table_Name = "C_TaxDeclarationLine";

    /**
     * AD_Table_ID=819
     */
    int Table_ID = 819;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_AllocationLine_ID
     */
    String COLUMNNAME_C_AllocationLine_ID = "C_AllocationLine_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name C_Invoice_ID
     */
    String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
    /**
     * Column name C_InvoiceLine_ID
     */
    String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_TaxDeclaration_ID
     */
    String COLUMNNAME_C_TaxDeclaration_ID = "C_TaxDeclaration_ID";
    /**
     * Column name C_TaxDeclarationLine_ID
     */
    String COLUMNNAME_C_TaxDeclarationLine_ID = "C_TaxDeclarationLine_ID";
    /**
     * Column name C_TaxDeclarationLine_UU
     */
    String COLUMNNAME_C_TaxDeclarationLine_UU = "C_TaxDeclarationLine_UU";
    /**
     * Column name C_Tax_ID
     */
    String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
    /**
     * Column name DateAcct
     */
    String COLUMNNAME_DateAcct = "DateAcct";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsManual
     */
    String COLUMNNAME_IsManual = "IsManual";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
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
     * Get Allocation Line. Allocation Line
     */
    int getC_AllocationLine_ID();

    /**
     * Set Allocation Line. Allocation Line
     */
    void setC_AllocationLine_ID(int C_AllocationLine_ID);

    I_C_AllocationLine getC_AllocationLine() throws RuntimeException;

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setC_BPartner_ID(int C_BPartner_ID);

    I_C_BPartner getC_BPartner() throws RuntimeException;

    /**
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

    /**
     * Set Currency. The Currency for this record
     */
    void setC_Currency_ID(int C_Currency_ID);

    I_C_Currency getC_Currency() throws RuntimeException;

    /**
     * Get Invoice. Invoice Identifier
     */
    int getC_Invoice_ID();

    /**
     * Set Invoice. Invoice Identifier
     */
    void setC_Invoice_ID(int C_Invoice_ID);

    I_C_Invoice getC_Invoice() throws RuntimeException;

    /**
     * Get Invoice Line. Invoice Detail Line
     */
    int getC_InvoiceLine_ID();

    /**
     * Set Invoice Line. Invoice Detail Line
     */
    void setC_InvoiceLine_ID(int C_InvoiceLine_ID);

    I_C_InvoiceLine getC_InvoiceLine() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Tax Declaration. Define the declaration to the tax authorities
     */
    int getC_TaxDeclaration_ID();

    /**
     * Set Tax Declaration. Define the declaration to the tax authorities
     */
    void setC_TaxDeclaration_ID(int C_TaxDeclaration_ID);

    I_C_TaxDeclaration getC_TaxDeclaration() throws RuntimeException;

    /**
     * Get Tax Declaration Line. Tax Declaration Document Information
     */
    int getC_TaxDeclarationLine_ID();

    /**
     * Set Tax Declaration Line. Tax Declaration Document Information
     */
    void setC_TaxDeclarationLine_ID(int C_TaxDeclarationLine_ID);

    /**
     * Get C_TaxDeclarationLine_UU
     */
    String getC_TaxDeclarationLine_UU();

    /**
     * Set C_TaxDeclarationLine_UU
     */
    void setC_TaxDeclarationLine_UU(String C_TaxDeclarationLine_UU);

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
     * Get Account Date. Accounting Date
     */
    Timestamp getDateAcct();

    /**
     * Set Account Date. Accounting Date
     */
    void setDateAcct(Timestamp DateAcct);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Manual. This is a manual process
     */
    void setIsManual(boolean IsManual);

    /**
     * Get Manual. This is a manual process
     */
    boolean isManual();

    /**
     * Get Line No. Unique line for this document
     */
    int getLine();

    /**
     * Set Line No. Unique line for this document
     */
    void setLine(int Line);

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
}
