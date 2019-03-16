package org.eevolution.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for HR_Payroll
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_HR_Payroll {

    /**
     * TableName=HR_Payroll
     */
    public static final String Table_Name = "HR_Payroll";

    /**
     * AD_Table_ID=53093
     */
    public static final int Table_ID = 53093;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name AD_Org_ID
     */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_PrintFormat_ID
     */
    public static final String COLUMNNAME_AD_PrintFormat_ID = "AD_PrintFormat_ID";
    /**
     * Column name C_Charge_ID
     */
    public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
    /**
     * Column name Created
     */
    public static final String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Description
     */
    public static final String COLUMNNAME_Description = "Description";
    /**
     * Column name HR_Contract_ID
     */
    public static final String COLUMNNAME_HR_Contract_ID = "HR_Contract_ID";
    /**
     * Column name HR_Payroll_ID
     */
    public static final String COLUMNNAME_HR_Payroll_ID = "HR_Payroll_ID";
    /**
     * Column name HR_Payroll_UU
     */
    public static final String COLUMNNAME_HR_Payroll_UU = "HR_Payroll_UU";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name PaymentRule
     */
    public static final String COLUMNNAME_PaymentRule = "PaymentRule";
    /**
     * Column name Processed
     */
    public static final String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    public static final String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Updated
     */
    public static final String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name Value
     */
    public static final String COLUMNNAME_Value = "Value";

    /**
     * Get Organization. Organizational entity within client
     */
    public int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    public void setOrgId(int AD_Org_ID);

    /**
     * Get Print Format. Data Print Format
     */
    public int getAD_PrintFormat_ID();

    /**
     * Set Print Format. Data Print Format
     */
    public void setAD_PrintFormat_ID(int AD_PrintFormat_ID);

    public org.compiere.model.I_AD_PrintFormat getAD_PrintFormat() throws RuntimeException;

    /**
     * Get Charge. Additional document charges
     */
    public int getChargeId();

    /**
     * Set Charge. Additional document charges
     */
    public void setChargeId(int C_Charge_ID);

    public org.compiere.model.I_C_Charge getC_Charge() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    public Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    public int getCreatedBy();

    /**
     * Get Description. Optional short description of the record
     */
    public String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    public void setDescription(String Description);

    /**
     * Get Payroll Contract
     */
    public int getHR_Contract_ID();

    /**
     * Set Payroll Contract
     */
    public void setHR_Contract_ID(int HR_Contract_ID);

    public org.eevolution.model.I_HR_Contract getHR_Contract() throws RuntimeException;

    /**
     * Get Payroll
     */
    public int getHR_Payroll_ID();

    /**
     * Set Payroll
     */
    public void setHR_Payroll_ID(int HR_Payroll_ID);

    /**
     * Get HR_Payroll_UU
     */
    public String getHR_Payroll_UU();

    /**
     * Set HR_Payroll_UU
     */
    public void setHR_Payroll_UU(String HR_Payroll_UU);

    /**
     * Set Active. The record is active in the system
     */
    public void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    public boolean isActive();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    public String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    public void setName(String Name);

    /**
     * Get Payment Rule. How you pay the invoice
     */
    public String getPaymentRule();

    /**
     * Set Payment Rule. How you pay the invoice
     */
    public void setPaymentRule(String PaymentRule);

    /**
     * Get Processed. The document has been processed
     */
    public boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    public void setProcessed(boolean Processed);

    /**
     * Get Process Now
     */
    public boolean isProcessing();

    /**
     * Set Process Now
     */
    public void setProcessing(boolean Processing);

    /**
     * Get Updated. Date this record was updated
     */
    public Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    public int getUpdatedBy();

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    public String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    public void setValue(String Value);
}
