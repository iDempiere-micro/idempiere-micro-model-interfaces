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

public interface I_HR_ListVersion {

    /**
     * TableName=HR_ListVersion
     */
    String Table_Name = "HR_ListVersion";

    /**
     * AD_Table_ID=53100
     */
    int Table_ID = 53100;

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
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name HR_ListBase_ID
     */
    String COLUMNNAME_HR_ListBase_ID = "HR_ListBase_ID";
    /**
     * Column name HR_List_ID
     */
    String COLUMNNAME_HR_List_ID = "HR_List_ID";
    /**
     * Column name HR_ListVersion_ID
     */
    String COLUMNNAME_HR_ListVersion_ID = "HR_ListVersion_ID";
    /**
     * Column name HR_ListVersion_UU
     */
    String COLUMNNAME_HR_ListVersion_UU = "HR_ListVersion_UU";
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
     * Column name ValidFrom
     */
    String COLUMNNAME_ValidFrom = "ValidFrom";
    /**
     * Column name ValidTo
     */
    String COLUMNNAME_ValidTo = "ValidTo";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int AD_Org_ID);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Payroll List Base
     */
    int getPayrollListBaseId();

    /**
     * Set Payroll List Base
     */
    void setPayrollListBaseId(int HR_ListBase_ID);

    org.eevolution.model.I_HR_List getPayrollListBase() throws RuntimeException;

    /**
     * Get Payroll List
     */
    int getPayrollListId();

    /**
     * Set Payroll List
     */
    void setPayrollListId(int HR_List_ID);

    org.eevolution.model.I_HR_List getPayrollList() throws RuntimeException;

    /**
     * Get Payroll List Version
     */
    int getPayrollListVersionId();

    /**
     * Set Payroll List Version
     */
    void setPayrollListVersionId(int HR_ListVersion_ID);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

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

    /**
     * Get Valid from. Valid from including this date (first day)
     */
    Timestamp getValidFrom();

    /**
     * Set Valid from. Valid from including this date (first day)
     */
    void setValidFrom(Timestamp ValidFrom);

    /**
     * Get Valid to. Valid to including this date (last day)
     */
    Timestamp getValidTo();

    /**
     * Set Valid to. Valid to including this date (last day)
     */
    void setValidTo(Timestamp ValidTo);
}
