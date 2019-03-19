package org.eevolution.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for I_HR_Movement
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_I_HR_Movement {

    /**
     * TableName=I_HR_Movement
     */
    String Table_Name = "I_HR_Movement";

    /**
     * AD_Table_ID=53259
     */
    int Table_ID = 53259;

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
     * Column name Amount
     */
    String COLUMNNAME_Amount = "Amount";
    /**
     * Column name BPartner_Value
     */
    String COLUMNNAME_BPartner_Value = "BPartner_Value";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name ConceptValue
     */
    String COLUMNNAME_ConceptValue = "ConceptValue";
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
     * Column name HR_Concept_ID
     */
    String COLUMNNAME_HR_Concept_ID = "HR_Concept_ID";
    /**
     * Column name HR_Movement_ID
     */
    String COLUMNNAME_HR_Movement_ID = "HR_Movement_ID";
    /**
     * Column name HR_Process_ID
     */
    String COLUMNNAME_HR_Process_ID = "HR_Process_ID";
    /**
     * Column name I_ErrorMsg
     */
    String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
    /**
     * Column name I_HR_Movement_ID
     */
    String COLUMNNAME_I_HR_Movement_ID = "I_HR_Movement_ID";
    /**
     * Column name I_HR_Movement_UU
     */
    String COLUMNNAME_I_HR_Movement_UU = "I_HR_Movement_UU";
    /**
     * Column name I_IsImported
     */
    String COLUMNNAME_I_IsImported = "I_IsImported";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name ProcessName
     */
    String COLUMNNAME_ProcessName = "ProcessName";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";
    /**
     * Column name ServiceDate
     */
    String COLUMNNAME_ServiceDate = "ServiceDate";
    /**
     * Column name TextMsg
     */
    String COLUMNNAME_TextMsg = "TextMsg";
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
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int AD_Org_ID);

    /**
     * Get Amount. Amount in a defined currency
     */
    BigDecimal getAmount();

    /**
     * Set Amount. Amount in a defined currency
     */
    void setAmount(BigDecimal Amount);

    /**
     * Get Business Partner Key. The Key of the Business Partner
     */
    String getBusinessPartnerSearchKey();

    /**
     * Set Business Partner Key. The Key of the Business Partner
     */
    void setBusinessPartnerSearchKey(String BPartner_Value);

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getBusinessPartnerId();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setBusinessPartnerId(int C_BPartner_ID);

    org.compiere.model.I_C_BPartner getBPartner() throws RuntimeException;

    /**
     * Get Concept Value. Value of the Concept
     */
    String getConceptValue();

    /**
     * Set Concept Value. Value of the Concept
     */
    void setConceptValue(String ConceptValue);

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
     * Get Payroll Concept
     */
    int getPayrollConceptId();

    /**
     * Set Payroll Concept
     */
    void setPayrollConceptId(int HR_Concept_ID);

    org.eevolution.model.I_HR_Concept getPayrollConcept() throws RuntimeException;

    /**
     * Get Payroll Movement
     */
    int getPayrollMovementId();

    /**
     * Set Payroll Movement
     */
    void setPayrollMovementId(int HR_Movement_ID);

    org.eevolution.model.I_HR_Movement getPayrollMovement() throws RuntimeException;

    /**
     * Get Payroll Process
     */
    int getPayrollProcessId();

    /**
     * Set Payroll Process
     */
    void setPayrollProcessId(int HR_Process_ID);

    org.eevolution.model.I_HR_Process getPayrollProcess() throws RuntimeException;

    /**
     * Get Import Error Message. Messages generated from import process
     */
    String getImportErrorMsg();

    /**
     * Set Import Error Message. Messages generated from import process
     */
    void setImportErrorMsg(String I_ErrorMsg);

    /**
     * Get Payroll Movement Import
     */
    int getPayrollMovementImportId();

    /**
     * Set Payroll Movement Import
     */
    void setPayrollMovementImportId(int I_HR_Movement_ID);


    /**
     * Get Imported. Has this import been processed
     */
    String getIsImported();

    /**
     * Set Imported. Has this import been processed
     */
    void setIsImported(String I_IsImported);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

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
     * Get Process Name. Name of the Process
     */
    String getProcessName();

    /**
     * Set Process Name. Name of the Process
     */
    void setProcessName(String ProcessName);

    /**
     * Get Quantity. Quantity
     */
    BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    void setQty(BigDecimal Qty);

    /**
     * Get Service date. Date service was provided
     */
    Timestamp getServiceDate();

    /**
     * Set Service date. Date service was provided
     */
    void setServiceDate(Timestamp ServiceDate);

    /**
     * Get Text Message. Text Message
     */
    String getTextMsg();

    /**
     * Set Text Message. Text Message
     */
    void setTextMsg(String TextMsg);

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
}
