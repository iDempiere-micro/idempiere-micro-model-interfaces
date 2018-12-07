package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PA_SLA_Goal
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_SLA_Goal {

    /**
     * TableName=PA_SLA_Goal
     */
    String Table_Name = "PA_SLA_Goal";

    /**
     * AD_Table_ID=745
     */
    int Table_ID = 745;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DateLastRun
     */
    String COLUMNNAME_DateLastRun = "DateLastRun";
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
     * Column name MeasureActual
     */
    String COLUMNNAME_MeasureActual = "MeasureActual";
    /**
     * Column name MeasureTarget
     */
    String COLUMNNAME_MeasureTarget = "MeasureTarget";
    /**
     * Column name PA_SLA_Criteria_ID
     */
    String COLUMNNAME_PA_SLA_Criteria_ID = "PA_SLA_Criteria_ID";
    /**
     * Column name PA_SLA_Goal_ID
     */
    String COLUMNNAME_PA_SLA_Goal_ID = "PA_SLA_Goal_ID";
    /**
     * Column name PA_SLA_Goal_UU
     */
    String COLUMNNAME_PA_SLA_Goal_UU = "PA_SLA_Goal_UU";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
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
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setC_BPartner_ID(int C_BPartner_ID);

    I_C_BPartner getC_BPartner() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Date last run. Date the process was last run.
     */
    Timestamp getDateLastRun();

    /**
     * Set Date last run. Date the process was last run.
     */
    void setDateLastRun(Timestamp DateLastRun);

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
     * Get Measure Actual. Actual value that has been measured.
     */
    BigDecimal getMeasureActual();

    /**
     * Set Measure Actual. Actual value that has been measured.
     */
    void setMeasureActual(BigDecimal MeasureActual);

    /**
     * Get Measure Target. Target value for measure
     */
    BigDecimal getMeasureTarget();

    /**
     * Set Measure Target. Target value for measure
     */
    void setMeasureTarget(BigDecimal MeasureTarget);

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

    I_PA_SLA_Criteria getPA_SLA_Criteria() throws RuntimeException;

    /**
     * Get SLA Goal. Service Level Agreement Goal
     */
    int getPA_SLA_Goal_ID();

    /**
     * Set SLA Goal. Service Level Agreement Goal
     */
    void setPA_SLA_Goal_ID(int PA_SLA_Goal_ID);

    /**
     * Get PA_SLA_Goal_UU
     */
    String getPA_SLA_Goal_UU();

    /**
     * Set PA_SLA_Goal_UU
     */
    void setPA_SLA_Goal_UU(String PA_SLA_Goal_UU);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

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
