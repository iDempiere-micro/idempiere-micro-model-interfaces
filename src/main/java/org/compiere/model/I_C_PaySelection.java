package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_PaySelection
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_PaySelection {

    /**
     * TableName=C_PaySelection
     */
    String Table_Name = "C_PaySelection";

    /**
     * AD_Table_ID=426
     */
    int Table_ID = 426;

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
     * Column name C_BankAccount_ID
     */
    String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
    /**
     * Column name C_PaySelection_ID
     */
    String COLUMNNAME_C_PaySelection_ID = "C_PaySelection_ID";
    /**
     * Column name C_PaySelection_UU
     */
    String COLUMNNAME_C_PaySelection_UU = "C_PaySelection_UU";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name CreateFrom
     */
    String COLUMNNAME_CreateFrom = "CreateFrom";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsApproved
     */
    String COLUMNNAME_IsApproved = "IsApproved";
    /**
     * Column name PayDate
     */
    String COLUMNNAME_PayDate = "PayDate";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name TotalAmt
     */
    String COLUMNNAME_TotalAmt = "TotalAmt";
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
     * Get Bank Account. Account at the Bank
     */
    int getC_BankAccount_ID();

    /**
     * Set Bank Account. Account at the Bank
     */
    void setC_BankAccount_ID(int C_BankAccount_ID);

    I_C_BankAccount getC_BankAccount() throws RuntimeException;

    /**
     * Get Payment Selection. Payment Selection
     */
    int getC_PaySelection_ID();

    /**
     * Set Payment Selection. Payment Selection
     */
    void setC_PaySelection_ID(int C_PaySelection_ID);

    /**
     * Get C_PaySelection_UU
     */
    String getC_PaySelection_UU();

    /**
     * Set C_PaySelection_UU
     */
    void setC_PaySelection_UU(String C_PaySelection_UU);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Create lines from. Process which will generate a new document lines based on an existing
     * document
     */
    String getCreateFrom();

    /**
     * Set Create lines from. Process which will generate a new document lines based on an existing
     * document
     */
    void setCreateFrom(String CreateFrom);

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
     * Set Approved. Indicates if this document requires approval
     */
    void setIsApproved(boolean IsApproved);

    /**
     * Get Approved. Indicates if this document requires approval
     */
    boolean isApproved();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Payment date. Date Payment made
     */
    Timestamp getPayDate();

    /**
     * Set Payment date. Date Payment made
     */
    void setPayDate(Timestamp PayDate);

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
     * Get Total Amount. Total Amount
     */
    BigDecimal getTotalAmt();

    /**
     * Set Total Amount. Total Amount
     */
    void setTotalAmt(BigDecimal TotalAmt);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
