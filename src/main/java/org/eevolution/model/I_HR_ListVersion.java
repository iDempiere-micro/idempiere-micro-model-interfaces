package org.eevolution.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for HR_ListVersion
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_HR_ListVersion {

    /**
     * TableName=HR_ListVersion
     */
    public static final String Table_Name = "HR_ListVersion";

    /**
     * AD_Table_ID=53100
     */
    public static final int Table_ID = 53100;

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
     * Column name HR_ListBase_ID
     */
    public static final String COLUMNNAME_HR_ListBase_ID = "HR_ListBase_ID";
    /**
     * Column name HR_List_ID
     */
    public static final String COLUMNNAME_HR_List_ID = "HR_List_ID";
    /**
     * Column name HR_ListVersion_ID
     */
    public static final String COLUMNNAME_HR_ListVersion_ID = "HR_ListVersion_ID";
    /**
     * Column name HR_ListVersion_UU
     */
    public static final String COLUMNNAME_HR_ListVersion_UU = "HR_ListVersion_UU";
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
     * Column name ValidFrom
     */
    public static final String COLUMNNAME_ValidFrom = "ValidFrom";
    /**
     * Column name ValidTo
     */
    public static final String COLUMNNAME_ValidTo = "ValidTo";

    /**
     * Get Organization. Organizational entity within client
     */
    public int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    public void setOrgId(int AD_Org_ID);

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
     * Get Payroll List Base
     */
    public int getHR_ListBaseId();

    /**
     * Set Payroll List Base
     */
    public void setHR_ListBaseId(int HR_ListBase_ID);

    public org.eevolution.model.I_HR_List getHR_ListBase() throws RuntimeException;

    /**
     * Get Payroll List
     */
    public int getHR_ListId();

    /**
     * Set Payroll List
     */
    public void setHR_ListId(int HR_List_ID);

    public org.eevolution.model.I_HR_List getHR_List() throws RuntimeException;

    /**
     * Get Payroll List Version
     */
    public int getHR_ListVersionId();

    /**
     * Set Payroll List Version
     */
    public void setHR_ListVersionId(int HR_ListVersion_ID);

    /**
     * Get HR_ListVersion_UU
     */
    public String getHR_ListVersion_UU();

    /**
     * Set HR_ListVersion_UU
     */
    public void setHR_ListVersion_UU(String HR_ListVersion_UU);

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
     * Get Valid from. Valid from including this date (first day)
     */
    public Timestamp getValidFrom();

    /**
     * Set Valid from. Valid from including this date (first day)
     */
    public void setValidFrom(Timestamp ValidFrom);

    /**
     * Get Valid to. Valid to including this date (last day)
     */
    public Timestamp getValidTo();

    /**
     * Set Valid to. Valid to including this date (last day)
     */
    public void setValidTo(Timestamp ValidTo);
}
