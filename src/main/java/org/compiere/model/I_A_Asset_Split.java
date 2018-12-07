package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Asset_Split
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Split {

    /**
     * TableName=A_Asset_Split
     */
    String Table_Name = "A_Asset_Split";

    /**
     * AD_Table_ID=53122
     */
    int Table_ID = 53122;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /**
     * Column name A_Amount_Split
     */
    String COLUMNNAME_A_Amount_Split = "A_Amount_Split";
    /**
     * Column name A_Asset_Acct_ID
     */
    String COLUMNNAME_A_Asset_Acct_ID = "A_Asset_Acct_ID";
    /**
     * Column name A_Asset_Cost
     */
    String COLUMNNAME_A_Asset_Cost = "A_Asset_Cost";
    /**
     * Column name A_Asset_ID
     */
    String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
    /**
     * Column name A_Asset_ID_To
     */
    String COLUMNNAME_A_Asset_ID_To = "A_Asset_ID_To";
    /**
     * Column name A_Asset_Split_ID
     */
    String COLUMNNAME_A_Asset_Split_ID = "A_Asset_Split_ID";
    /**
     * Column name A_Asset_Split_UU
     */
    String COLUMNNAME_A_Asset_Split_UU = "A_Asset_Split_UU";
    /**
     * Column name A_Depreciation_Workfile_ID
     */
    String COLUMNNAME_A_Depreciation_Workfile_ID = "A_Depreciation_Workfile_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name A_Percent_Original
     */
    String COLUMNNAME_A_Percent_Original = "A_Percent_Original";
    /**
     * Column name A_Percent_Split
     */
    String COLUMNNAME_A_Percent_Split = "A_Percent_Split";
    /**
     * Column name A_QTY_Current
     */
    String COLUMNNAME_A_QTY_Current = "A_QTY_Current";
    /**
     * Column name A_QTY_Split
     */
    String COLUMNNAME_A_QTY_Split = "A_QTY_Split";
    /**
     * Column name A_Split_Type
     */
    String COLUMNNAME_A_Split_Type = "A_Split_Type";
    /**
     * Column name A_Transfer_Balance_IS
     */
    String COLUMNNAME_A_Transfer_Balance_IS = "A_Transfer_Balance_IS";
    /**
     * Column name C_Period_ID
     */
    String COLUMNNAME_C_Period_ID = "C_Period_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DateAcct
     */
    String COLUMNNAME_DateAcct = "DateAcct";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name PostingType
     */
    String COLUMNNAME_PostingType = "PostingType";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Amount Split
     */
    BigDecimal getA_Amount_Split();

    /**
     * Set Amount Split
     */
    void setA_Amount_Split(BigDecimal A_Amount_Split);

    /**
     * Get A_Asset_Acct_ID
     */
    int getA_Asset_Acct_ID();

    /**
     * Set A_Asset_Acct_ID
     */
    void setA_Asset_Acct_ID(int A_Asset_Acct_ID);

    /**
     * Get Asset Cost
     */
    BigDecimal getA_Asset_Cost();

    /**
     * Set Asset Cost
     */
    void setA_Asset_Cost(BigDecimal A_Asset_Cost);

    /**
     * Get Asset. Asset used internally or by customers
     */
    int getA_Asset_ID();

    /**
     * Set Asset. Asset used internally or by customers
     */
    void setA_Asset_ID(int A_Asset_ID);

    /**
     * Get To Asset ID
     */
    int getA_Asset_ID_To();

    /**
     * Set To Asset ID
     */
    void setA_Asset_ID_To(int A_Asset_ID_To);

    I_A_Asset getA_Asset_To() throws RuntimeException;

    /**
     * Get Asset Split
     */
    int getA_Asset_Split_ID();

    /**
     * Set Asset Split
     */
    void setA_Asset_Split_ID(int A_Asset_Split_ID);

    /**
     * Get A_Asset_Split_UU
     */
    String getA_Asset_Split_UU();

    /**
     * Set A_Asset_Split_UU
     */
    void setA_Asset_Split_UU(String A_Asset_Split_UU);

    /**
     * Get A_Depreciation_Workfile_ID
     */
    int getA_Depreciation_Workfile_ID();

    /**
     * Set A_Depreciation_Workfile_ID
     */
    void setA_Depreciation_Workfile_ID(int A_Depreciation_Workfile_ID);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Original Percent
     */
    BigDecimal getA_Percent_Original();

    /**
     * Set Original Percent
     */
    void setA_Percent_Original(BigDecimal A_Percent_Original);

    /**
     * Get A_Percent_Split
     */
    BigDecimal getA_Percent_Split();

    /**
     * Set A_Percent_Split
     */
    void setA_Percent_Split(BigDecimal A_Percent_Split);

    /**
     * Get Current Qty
     */
    BigDecimal getA_QTY_Current();

    /**
     * Set Current Qty
     */
    void setA_QTY_Current(BigDecimal A_QTY_Current);

    /**
     * Get Qty. Split
     */
    BigDecimal getA_QTY_Split();

    /**
     * Set Qty. Split
     */
    void setA_QTY_Split(BigDecimal A_QTY_Split);

    /**
     * Get Split Type
     */
    String getA_Split_Type();

    /**
     * Set Split Type
     */
    void setA_Split_Type(String A_Split_Type);

    /**
     * Get A_Transfer_Balance_IS
     */
    boolean isA_Transfer_Balance_IS();

    /**
     * Set A_Transfer_Balance_IS
     */
    void setA_Transfer_Balance_IS(boolean A_Transfer_Balance_IS);

    /**
     * Get Period. Period of the Calendar
     */
    int getC_Period_ID();

    /**
     * Set Period. Period of the Calendar
     */
    void setC_Period_ID(int C_Period_ID);

    I_C_Period getC_Period() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Account Date. Accounting Date
     */
    Timestamp getDateAcct();

    /**
     * Set Account Date. Accounting Date
     */
    void setDateAcct(Timestamp DateAcct);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get PostingType. The type of posted amount for the transaction
     */
    String getPostingType();

    /**
     * Set PostingType. The type of posted amount for the transaction
     */
    void setPostingType(String PostingType);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
