package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_NonBusinessDay
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_NonBusinessDay {

    /**
     * TableName=C_NonBusinessDay
     */
    String Table_Name = "C_NonBusinessDay";

    /**
     * AD_Table_ID=163
     */
    int Table_ID = 163;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_Calendar_ID
     */
    String COLUMNNAME_C_Calendar_ID = "C_Calendar_ID";
    /**
     * Column name C_Country_ID
     */
    String COLUMNNAME_C_Country_ID = "C_Country_ID";
    /**
     * Column name C_NonBusinessDay_ID
     */
    String COLUMNNAME_C_NonBusinessDay_ID = "C_NonBusinessDay_ID";
    /**
     * Column name C_NonBusinessDay_UU
     */
    String COLUMNNAME_C_NonBusinessDay_UU = "C_NonBusinessDay_UU";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Date1
     */
    String COLUMNNAME_Date1 = "Date1";
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
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Calendar. Accounting Calendar Name
     */
    int getC_Calendar_ID();

    /**
     * Set Calendar. Accounting Calendar Name
     */
    void setC_Calendar_ID(int C_Calendar_ID);

    I_C_Calendar getC_Calendar() throws RuntimeException;

    /**
     * Get Country. Country
     */
    int getC_Country_ID();

    /**
     * Set Country. Country
     */
    void setC_Country_ID(int C_Country_ID);

    I_C_Country getC_Country() throws RuntimeException;

    /**
     * Get Non Business Day. Day on which business is not transacted
     */
    int getC_NonBusinessDay_ID();

    /**
     * Set Non Business Day. Day on which business is not transacted
     */
    void setC_NonBusinessDay_ID(int C_NonBusinessDay_ID);

    /**
     * Get C_NonBusinessDay_UU
     */
    String getC_NonBusinessDay_UU();

    /**
     * Set C_NonBusinessDay_UU
     */
    void setC_NonBusinessDay_UU(String C_NonBusinessDay_UU);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Date. Date when business is not conducted
     */
    Timestamp getDate1();

    /**
     * Set Date. Date when business is not conducted
     */
    void setDate1(Timestamp Date1);

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
}
