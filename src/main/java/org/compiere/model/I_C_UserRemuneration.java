package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_UserRemuneration
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_UserRemuneration {

    /**
     * TableName=C_UserRemuneration
     */
    String Table_Name = "C_UserRemuneration";

    /**
     * AD_Table_ID=794
     */
    int Table_ID = 794;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_Remuneration_ID
     */
    String COLUMNNAME_C_Remuneration_ID = "C_Remuneration_ID";
    /**
     * Column name C_UserRemuneration_ID
     */
    String COLUMNNAME_C_UserRemuneration_ID = "C_UserRemuneration_ID";
    /**
     * Column name C_UserRemuneration_UU
     */
    String COLUMNNAME_C_UserRemuneration_UU = "C_UserRemuneration_UU";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name GrossRAmt
     */
    String COLUMNNAME_GrossRAmt = "GrossRAmt";
    /**
     * Column name GrossRCost
     */
    String COLUMNNAME_GrossRCost = "GrossRCost";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name OvertimeAmt
     */
    String COLUMNNAME_OvertimeAmt = "OvertimeAmt";
    /**
     * Column name OvertimeCost
     */
    String COLUMNNAME_OvertimeCost = "OvertimeCost";
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
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setAD_User_ID(int AD_User_ID);

    I_AD_User getAD_User() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Remuneration. Wage or Salary
     */
    int getC_Remuneration_ID();

    /**
     * Set Remuneration. Wage or Salary
     */
    void setC_Remuneration_ID(int C_Remuneration_ID);

    I_C_Remuneration getC_Remuneration() throws RuntimeException;

    /**
     * Get Employee Remuneration. Employee Wage or Salary Overwrite
     */
    int getC_UserRemuneration_ID();

    /**
     * Set Employee Remuneration. Employee Wage or Salary Overwrite
     */
    void setC_UserRemuneration_ID(int C_UserRemuneration_ID);

    /**
     * Get C_UserRemuneration_UU
     */
    String getC_UserRemuneration_UU();

    /**
     * Set C_UserRemuneration_UU
     */
    void setC_UserRemuneration_UU(String C_UserRemuneration_UU);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Gross Amount. Gross Remuneration Amount
     */
    BigDecimal getGrossRAmt();

    /**
     * Set Gross Amount. Gross Remuneration Amount
     */
    void setGrossRAmt(BigDecimal GrossRAmt);

    /**
     * Get Gross Cost. Gross Remuneration Costs
     */
    BigDecimal getGrossRCost();

    /**
     * Set Gross Cost. Gross Remuneration Costs
     */
    void setGrossRCost(BigDecimal GrossRCost);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Overtime Amount. Hourly Overtime Rate
     */
    BigDecimal getOvertimeAmt();

    /**
     * Set Overtime Amount. Hourly Overtime Rate
     */
    void setOvertimeAmt(BigDecimal OvertimeAmt);

    /**
     * Get Overtime Cost. Hourly Overtime Cost
     */
    BigDecimal getOvertimeCost();

    /**
     * Set Overtime Cost. Hourly Overtime Cost
     */
    void setOvertimeCost(BigDecimal OvertimeCost);

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
