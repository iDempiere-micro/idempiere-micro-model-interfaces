package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_BP_Vendor_Acct
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BP_Vendor_Acct {

    /**
     * TableName=C_BP_Vendor_Acct
     */
    String Table_Name = "C_BP_Vendor_Acct";

    /**
     * AD_Table_ID=185
     */
    int Table_ID = 185;

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
     * Column name C_AcctSchema_ID
     */
    String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_BP_Vendor_Acct_UU
     */
    String COLUMNNAME_C_BP_Vendor_Acct_UU = "C_BP_Vendor_Acct_UU";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name V_Liability_Acct
     */
    String COLUMNNAME_V_Liability_Acct = "V_Liability_Acct";
    /**
     * Column name V_Liability_Services_Acct
     */
    String COLUMNNAME_V_Liability_Services_Acct = "V_Liability_Services_Acct";
    /**
     * Column name V_Prepayment_Acct
     */
    String COLUMNNAME_V_Prepayment_Acct = "V_Prepayment_Acct";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Accounting Schema. Rules for accounting
     */
    int getC_AcctSchema_ID();

    /**
     * Set Accounting Schema. Rules for accounting
     */
    void setC_AcctSchema_ID(int C_AcctSchema_ID);

    I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

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
     * Get C_BP_Vendor_Acct_UU
     */
    String getC_BP_Vendor_Acct_UU();

    /**
     * Set C_BP_Vendor_Acct_UU
     */
    void setC_BP_Vendor_Acct_UU(String C_BP_Vendor_Acct_UU);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Vendor Liability. Account for Vendor Liability
     */
    int getV_Liability_Acct();

    /**
     * Set Vendor Liability. Account for Vendor Liability
     */
    void setV_Liability_Acct(int V_Liability_Acct);

    I_C_ValidCombination getV_Liability_A() throws RuntimeException;

    /**
     * Get Vendor Service Liability. Account for Vendor Service Liability
     */
    int getV_Liability_Services_Acct();

    /**
     * Set Vendor Service Liability. Account for Vendor Service Liability
     */
    void setV_Liability_Services_Acct(int V_Liability_Services_Acct);

    I_C_ValidCombination getV_Liability_Services_A() throws RuntimeException;

    /**
     * Get Vendor Prepayment. Account for Vendor Prepayments
     */
    int getV_Prepayment_Acct();

    /**
     * Set Vendor Prepayment. Account for Vendor Prepayments
     */
    void setV_Prepayment_Acct(int V_Prepayment_Acct);

    I_C_ValidCombination getV_Prepayment_A() throws RuntimeException;
}
