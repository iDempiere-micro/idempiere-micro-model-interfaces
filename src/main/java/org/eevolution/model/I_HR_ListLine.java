package org.eevolution.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for HR_ListLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_HR_ListLine {

    /**
     * TableName=HR_ListLine
     */
    String Table_Name = "HR_ListLine";

    /**
     * AD_Table_ID=53101
     */
    int Table_ID = 53101;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name Col_1
     */
    String COLUMNNAME_Col_1 = "Col_1";
    /**
     * Column name Col_2
     */
    String COLUMNNAME_Col_2 = "Col_2";
    /**
     * Column name Col_3
     */
    String COLUMNNAME_Col_3 = "Col_3";
    /**
     * Column name Col_4
     */
    String COLUMNNAME_Col_4 = "Col_4";
    /**
     * Column name Col_5
     */
    String COLUMNNAME_Col_5 = "Col_5";
    /**
     * Column name Col_6
     */
    String COLUMNNAME_Col_6 = "Col_6";
    /**
     * Column name Col_7
     */
    String COLUMNNAME_Col_7 = "Col_7";
    /**
     * Column name Col_8
     */
    String COLUMNNAME_Col_8 = "Col_8";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name HR_ListLine_ID
     */
    String COLUMNNAME_HR_ListLine_ID = "HR_ListLine_ID";
    /**
     * Column name HR_ListLine_UU
     */
    String COLUMNNAME_HR_ListLine_UU = "HR_ListLine_UU";
    /**
     * Column name HR_ListVersion_ID
     */
    String COLUMNNAME_HR_ListVersion_ID = "HR_ListVersion_ID";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name MaxValue
     */
    String COLUMNNAME_MaxValue = "MaxValue";
    /**
     * Column name MinValue
     */
    String COLUMNNAME_MinValue = "MinValue";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int AD_Org_ID);

    /**
     * Get Col_1
     */
    BigDecimal getCol1();

    /**
     * Set Col_1
     */
    void setCol1(BigDecimal Col_1);

    /**
     * Get Col_2
     */
    BigDecimal getCol2();

    /**
     * Set Col_2
     */
    void setCol2(BigDecimal Col_2);

    /**
     * Get Col_3
     */
    BigDecimal getCol3();

    /**
     * Set Col_3
     */
    void setCol3(BigDecimal Col_3);

    /**
     * Get Col_4
     */
    BigDecimal getCol4();

    /**
     * Set Col_4
     */
    void setCol4(BigDecimal Col_4);

    /**
     * Get Col_5
     */
    BigDecimal getCol5();

    /**
     * Set Col_5
     */
    void setCol5(BigDecimal Col_5);

    /**
     * Get Col_6
     */
    BigDecimal getCol6();

    /**
     * Set Col_6
     */
    void setCol6(BigDecimal Col_6);

    /**
     * Get Col_7
     */
    BigDecimal getCol7();

    /**
     * Set Col_7
     */
    void setCol7(BigDecimal Col_7);

    /**
     * Get Col_8
     */
    BigDecimal getCol8();

    /**
     * Set Col_8
     */
    void setCol8(BigDecimal Col_8);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Payroll List Line
     */
    int getPayrollListLineId();

    /**
     * Set Payroll List Line
     */
    void setPayrollListLineId(int HR_ListLine_ID);

    /**
     * Get Payroll List Version
     */
    int getPayrollListVersionId();

    /**
     * Set Payroll List Version
     */
    void setPayrollListVersionId(int HR_ListVersion_ID);

    org.eevolution.model.I_HR_ListVersion getPayrollListVersion() throws RuntimeException;

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Max Value
     */
    BigDecimal getMaxValue();

    /**
     * Set Max Value
     */
    void setMaxValue(BigDecimal MaxValue);

    /**
     * Get Min Value
     */
    BigDecimal getMinValue();

    /**
     * Set Min Value
     */
    void setMinValue(BigDecimal MinValue);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
