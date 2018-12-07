package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PA_SLA_Criteria
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_SLA_Criteria {

    /**
     * TableName=PA_SLA_Criteria
     */
    String Table_Name = "PA_SLA_Criteria";

    /**
     * AD_Table_ID=744
     */
    int Table_ID = 744;

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
     * Column name Classname
     */
    String COLUMNNAME_Classname = "Classname";
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
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsManual
     */
    String COLUMNNAME_IsManual = "IsManual";
    /**
     * Column name PA_SLA_Criteria_ID
     */
    String COLUMNNAME_PA_SLA_Criteria_ID = "PA_SLA_Criteria_ID";
    /**
     * Column name PA_SLA_Criteria_UU
     */
    String COLUMNNAME_PA_SLA_Criteria_UU = "PA_SLA_Criteria_UU";
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
     * Get Classname. Java Classname
     */
    String getClassname();

    /**
     * Set Classname. Java Classname
     */
    void setClassname(String Classname);

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
     * Get Comment/Help. Comment or Hint
     */
    String getHelp();

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Manual. This is a manual process
     */
    void setIsManual(boolean IsManual);

    /**
     * Get Manual. This is a manual process
     */
    boolean isManual();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get SLA Criteria. Service Level Agreement Criteria
     */
    int getPA_SLA_Criteria_ID();

    /**
     * Set SLA Criteria. Service Level Agreement Criteria
     */
    void setPA_SLA_Criteria_ID(int PA_SLA_Criteria_ID);

    /**
     * Get PA_SLA_Criteria_UU
     */
    String getPA_SLA_Criteria_UU();

    /**
     * Set PA_SLA_Criteria_UU
     */
    void setPA_SLA_Criteria_UU(String PA_SLA_Criteria_UU);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
