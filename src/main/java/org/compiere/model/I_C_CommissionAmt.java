package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_CommissionAmt
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_CommissionAmt {

    /**
     * TableName=C_CommissionAmt
     */
    String Table_Name = "C_CommissionAmt";

    /**
     * AD_Table_ID=430
     */
    int Table_ID = 430;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);

    /** Load Meta Data */

    /**
     * Column name ActualQty
     */
    String COLUMNNAME_ActualQty = "ActualQty";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_CommissionAmt_ID
     */
    String COLUMNNAME_C_CommissionAmt_ID = "C_CommissionAmt_ID";
    /**
     * Column name C_CommissionAmt_UU
     */
    String COLUMNNAME_C_CommissionAmt_UU = "C_CommissionAmt_UU";
    /**
     * Column name C_CommissionLine_ID
     */
    String COLUMNNAME_C_CommissionLine_ID = "C_CommissionLine_ID";
    /**
     * Column name C_CommissionRun_ID
     */
    String COLUMNNAME_C_CommissionRun_ID = "C_CommissionRun_ID";
    /**
     * Column name CommissionAmt
     */
    String COLUMNNAME_CommissionAmt = "CommissionAmt";
    /**
     * Column name ConvertedAmt
     */
    String COLUMNNAME_ConvertedAmt = "ConvertedAmt";
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
     * Get Actual Quantity. The actual quantity
     */
    BigDecimal getActualQty();

    /**
     * Set Actual Quantity. The actual quantity
     */
    void setActualQty(BigDecimal ActualQty);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Commission Amount. Generated Commission Amount
     */
    int getC_CommissionAmt_ID();

    /**
     * Set Commission Amount. Generated Commission Amount
     */
    void setC_CommissionAmt_ID(int C_CommissionAmt_ID);

    /**
     * Get C_CommissionAmt_UU
     */
    String getC_CommissionAmt_UU();

    /**
     * Set C_CommissionAmt_UU
     */
    void setC_CommissionAmt_UU(String C_CommissionAmt_UU);

    /**
     * Get Commission Line. Commission Line
     */
    int getC_CommissionLine_ID();

    /**
     * Set Commission Line. Commission Line
     */
    void setC_CommissionLine_ID(int C_CommissionLine_ID);

    I_C_CommissionLine getC_CommissionLine() throws RuntimeException;

    /**
     * Get Commission Run. Commission Run or Process
     */
    int getC_CommissionRun_ID();

    /**
     * Set Commission Run. Commission Run or Process
     */
    void setC_CommissionRun_ID(int C_CommissionRun_ID);

    I_C_CommissionRun getC_CommissionRun() throws RuntimeException;

    /**
     * Get Commission Amount. Commission Amount
     */
    BigDecimal getCommissionAmt();

    /**
     * Set Commission Amount. Commission Amount
     */
    void setCommissionAmt(BigDecimal CommissionAmt);

    /**
     * Get Converted Amount. Converted Amount
     */
    BigDecimal getConvertedAmt();

    /**
     * Set Converted Amount. Converted Amount
     */
    void setConvertedAmt(BigDecimal ConvertedAmt);

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
}
