package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for S_ResourceAssignment
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_S_ResourceAssignment {

    /**
     * TableName=S_ResourceAssignment
     */
    String Table_Name = "S_ResourceAssignment";

    /**
     * AD_Table_ID=485
     */
    int Table_ID = 485;

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
     * Column name AssignDateFrom
     */
    String COLUMNNAME_AssignDateFrom = "AssignDateFrom";
    /**
     * Column name AssignDateTo
     */
    String COLUMNNAME_AssignDateTo = "AssignDateTo";
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
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsConfirmed
     */
    String COLUMNNAME_IsConfirmed = "IsConfirmed";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";
    /**
     * Column name S_ResourceAssignment_ID
     */
    String COLUMNNAME_S_ResourceAssignment_ID = "S_ResourceAssignment_ID";
    /**
     * Column name S_ResourceAssignment_UU
     */
    String COLUMNNAME_S_ResourceAssignment_UU = "S_ResourceAssignment_UU";
    /**
     * Column name S_Resource_ID
     */
    String COLUMNNAME_S_Resource_ID = "S_Resource_ID";
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
     * Get Assign From. Assign resource from
     */
    Timestamp getAssignDateFrom();

    /**
     * Set Assign From. Assign resource from
     */
    void setAssignDateFrom(Timestamp AssignDateFrom);

    /**
     * Get Assign To. Assign resource until
     */
    Timestamp getAssignDateTo();

    /**
     * Set Assign To. Assign resource until
     */
    void setAssignDateTo(Timestamp AssignDateTo);

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
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Confirmed. Assignment is confirmed
     */
    void setIsConfirmed(boolean IsConfirmed);

    /**
     * Get Confirmed. Assignment is confirmed
     */
    boolean isConfirmed();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Quantity. Quantity
     */
    BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    void setQty(BigDecimal Qty);

    /**
     * Get Resource Assignment. Resource Assignment
     */
    int getS_ResourceAssignment_ID();

    /**
     * Set Resource Assignment. Resource Assignment
     */
    void setS_ResourceAssignment_ID(int S_ResourceAssignment_ID);

    /**
     * Get S_ResourceAssignment_UU
     */
    String getS_ResourceAssignment_UU();

    /**
     * Set S_ResourceAssignment_UU
     */
    void setS_ResourceAssignment_UU(String S_ResourceAssignment_UU);

    /**
     * Get Resource. Resource
     */
    int getS_Resource_ID();

    /**
     * Set Resource. Resource
     */
    void setS_Resource_ID(int S_Resource_ID);

    I_S_Resource getS_Resource() throws RuntimeException;

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
