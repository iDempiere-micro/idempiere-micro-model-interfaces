package org.eevolution.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for HR_Department
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_HR_Department {

    /**
     * TableName=HR_Department
     */
    public static final String Table_Name = "HR_Department";

    /**
     * AD_Table_ID=53088
     */
    public static final int Table_ID = 53088;

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
     * Column name C_Activity_ID
     */
    public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
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
     * Column name HR_Department_ID
     */
    public static final String COLUMNNAME_HR_Department_ID = "HR_Department_ID";
    /**
     * Column name HR_Department_UU
     */
    public static final String COLUMNNAME_HR_Department_UU = "HR_Department_UU";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
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
     * Set Organization. Organizational entity within client
     */
    public void setOrgId(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    public int getOrgId();

    /**
     * Get Activity. Business Activity
     */
    public int getBusinessActivityId();

    /**
     * Set Activity. Business Activity
     */
    public void setBusinessActivityId(int C_Activity_ID);

    public org.compiere.model.I_C_Activity getC_Activity() throws RuntimeException;

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
     * Get Payroll Department
     */
    public int getHR_Department_ID();

    /**
     * Set Payroll Department
     */
    public void setHR_Department_ID(int HR_Department_ID);

    /**
     * Get HR_Department_UU
     */
    public String getHR_Department_UU();

    /**
     * Set HR_Department_UU
     */
    public void setHR_Department_UU(String HR_Department_UU);

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
