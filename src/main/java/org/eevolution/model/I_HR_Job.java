package org.eevolution.model;

import org.compiere.model.User;
import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for HR_Job
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_HR_Job {

    /**
     * TableName=HR_Job
     */
    String Table_Name = "HR_Job";

    /**
     * AD_Table_ID=53089
     */
    int Table_ID = 53089;

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
     * Column name HR_Department_ID
     */
    String COLUMNNAME_HR_Department_ID = "HR_Department_ID";
    /**
     * Column name HR_Job_ID
     */
    String COLUMNNAME_HR_Job_ID = "HR_Job_ID";
    /**
     * Column name HR_Job_UU
     */
    String COLUMNNAME_HR_Job_UU = "HR_Job_UU";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsParent
     */
    String COLUMNNAME_IsParent = "IsParent";
    /**
     * Column name JobCant
     */
    String COLUMNNAME_JobCant = "JobCant";
    /**
     * Column name Next_Job_ID
     */
    String COLUMNNAME_Next_Job_ID = "Next_Job_ID";
    /**
     * Column name Supervisor_ID
     */
    String COLUMNNAME_Supervisor_ID = "Supervisor_ID";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

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
     * Get Payroll Department
     */
    int getPayrollDepartmentId();

    /**
     * Set Payroll Department
     */
    void setPayrollDepartmentId(int HR_Department_ID);

    org.eevolution.model.I_HR_Department getPayrollDepartment() throws RuntimeException;

    /**
     * Get Payroll Job
     */
    int getPayrollJobId();

    /**
     * Set Payroll Job
     */
    void setPayrollJobId(int HR_Job_ID);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Parent link column. This column is a link to the parent table (e.g. header from lines) -
     * incl. Association key columns
     */
    void setIsParent(boolean IsParent);

    /**
     * Get Parent link column. This column is a link to the parent table (e.g. header from lines) -
     * incl. Association key columns
     */
    boolean isParent();

    /**
     * Get Job Cant
     */
    int getJobCant();

    /**
     * Set Job Cant
     */
    void setJobCant(int JobCant);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Next Job
     */
    int getNextJobId();

    /**
     * Set Next Job
     */
    void setNextJobId(int Next_Job_ID);

    org.eevolution.model.I_HR_Job getNextJob() throws RuntimeException;

    /**
     * Get Supervisor. Supervisor for this user/organization - used for escalation and approval
     */
    int getSupervisorId();

    /**
     * Set Supervisor. Supervisor for this user/organization - used for escalation and approval
     */
    void setSupervisorId(int Supervisor_ID);

    User getSupervisor() throws RuntimeException;

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);
}
