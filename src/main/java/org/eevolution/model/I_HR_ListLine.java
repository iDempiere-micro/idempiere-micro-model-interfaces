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
@SuppressWarnings("all")
public interface I_HR_ListLine {

    /**
     * TableName=HR_ListLine
     */
    public static final String Table_Name = "HR_ListLine";

    /**
     * AD_Table_ID=53101
     */
    public static final int Table_ID = 53101;

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
     * Column name Col_1
     */
    public static final String COLUMNNAME_Col_1 = "Col_1";
    /**
     * Column name Col_2
     */
    public static final String COLUMNNAME_Col_2 = "Col_2";
    /**
     * Column name Col_3
     */
    public static final String COLUMNNAME_Col_3 = "Col_3";
    /**
     * Column name Col_4
     */
    public static final String COLUMNNAME_Col_4 = "Col_4";
    /**
     * Column name Col_5
     */
    public static final String COLUMNNAME_Col_5 = "Col_5";
    /**
     * Column name Col_6
     */
    public static final String COLUMNNAME_Col_6 = "Col_6";
    /**
     * Column name Col_7
     */
    public static final String COLUMNNAME_Col_7 = "Col_7";
    /**
     * Column name Col_8
     */
    public static final String COLUMNNAME_Col_8 = "Col_8";
    /**
     * Column name Created
     */
    public static final String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name HR_ListLine_ID
     */
    public static final String COLUMNNAME_HR_ListLine_ID = "HR_ListLine_ID";
    /**
     * Column name HR_ListLine_UU
     */
    public static final String COLUMNNAME_HR_ListLine_UU = "HR_ListLine_UU";
    /**
     * Column name HR_ListVersion_ID
     */
    public static final String COLUMNNAME_HR_ListVersion_ID = "HR_ListVersion_ID";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name MaxValue
     */
    public static final String COLUMNNAME_MaxValue = "MaxValue";
    /**
     * Column name MinValue
     */
    public static final String COLUMNNAME_MinValue = "MinValue";
    /**
     * Column name Updated
     */
    public static final String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Organization. Organizational entity within client
     */
    public int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    public void setOrgId(int AD_Org_ID);

    /**
     * Get Col_1
     */
    public BigDecimal getCol_1();

    /**
     * Set Col_1
     */
    public void setCol_1(BigDecimal Col_1);

    /**
     * Get Col_2
     */
    public BigDecimal getCol_2();

    /**
     * Set Col_2
     */
    public void setCol_2(BigDecimal Col_2);

    /**
     * Get Col_3
     */
    public BigDecimal getCol_3();

    /**
     * Set Col_3
     */
    public void setCol_3(BigDecimal Col_3);

    /**
     * Get Col_4
     */
    public BigDecimal getCol_4();

    /**
     * Set Col_4
     */
    public void setCol_4(BigDecimal Col_4);

    /**
     * Get Col_5
     */
    public BigDecimal getCol_5();

    /**
     * Set Col_5
     */
    public void setCol_5(BigDecimal Col_5);

    /**
     * Get Col_6
     */
    public BigDecimal getCol_6();

    /**
     * Set Col_6
     */
    public void setCol_6(BigDecimal Col_6);

    /**
     * Get Col_7
     */
    public BigDecimal getCol_7();

    /**
     * Set Col_7
     */
    public void setCol_7(BigDecimal Col_7);

    /**
     * Get Col_8
     */
    public BigDecimal getCol_8();

    /**
     * Set Col_8
     */
    public void setCol_8(BigDecimal Col_8);

    /**
     * Get Created. Date this record was created
     */
    public Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    public int getCreatedBy();

    /**
     * Get Payroll List Line
     */
    public int getHR_ListLineId();

    /**
     * Set Payroll List Line
     */
    public void setHR_ListLineId(int HR_ListLine_ID);

    /**
     * Get HR_ListLine_UU
     */
    public String getHR_ListLine_UU();

    /**
     * Set HR_ListLine_UU
     */
    public void setHR_ListLine_UU(String HR_ListLine_UU);

    /**
     * Get Payroll List Version
     */
    public int getHR_ListVersionId();

    /**
     * Set Payroll List Version
     */
    public void setHR_ListVersionId(int HR_ListVersion_ID);

    public org.eevolution.model.I_HR_ListVersion getHR_ListVersion() throws RuntimeException;

    /**
     * Set Active. The record is active in the system
     */
    public void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    public boolean isActive();

    /**
     * Get Max Value
     */
    public BigDecimal getMaxValue();

    /**
     * Set Max Value
     */
    public void setMaxValue(BigDecimal MaxValue);

    /**
     * Get Min Value
     */
    public BigDecimal getMinValue();

    /**
     * Set Min Value
     */
    public void setMinValue(BigDecimal MinValue);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    public String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    public void setName(String Name);

    /**
     * Get Updated. Date this record was updated
     */
    public Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    public int getUpdatedBy();
}
