package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for S_ResourceAssignment
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_S_ResourceAssignment {

    /**
     * AD_Table_ID=485
     */
    int Table_ID = 485;

    /**
     * TableName=S_ResourceAssignment
     */
    String Table_Name = "S_ResourceAssignment";

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


    /**
     * Column name AssignDateFrom
     */
    String COLUMNNAME_AssignDateFrom = "AssignDateFrom";
    /**
     * Column name AssignDateTo
     */
    String COLUMNNAME_AssignDateTo = "AssignDateTo";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsConfirmed
     */
    String COLUMNNAME_IsConfirmed = "IsConfirmed";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";
    /**
     * Column name S_Resource_ID
     */
    String COLUMNNAME_S_Resource_ID = "S_Resource_ID";

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
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Set Confirmed. Assignment is confirmed
     */
    void setIsConfirmed(boolean IsConfirmed);

    /**
     * Get Confirmed. Assignment is confirmed
     */
    boolean isConfirmed();

    /**
     * Get Quantity. Quantity
     */
    BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    void setQty(BigDecimal Qty);

    /**
     * Get Resource. Resource
     */
    int getResourceID();

}
