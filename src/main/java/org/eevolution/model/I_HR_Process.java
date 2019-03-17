package org.eevolution.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for HR_Process
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_HR_Process {

    /**
     * TableName=HR_Process
     */
    public static final String Table_Name = "HR_Process";

    /**
     * AD_Table_ID=53092
     */
    public static final int Table_ID = 53092;

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
     * Column name AD_PrintFormat_ID
     */
    public static final String COLUMNNAME_AD_PrintFormat_ID = "AD_PrintFormat_ID";
    /**
     * Column name AD_Workflow_ID
     */
    public static final String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
    /**
     * Column name C_BPartner_ID
     */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_Charge_ID
     */
    public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
    /**
     * Column name C_DocType_ID
     */
    public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
    /**
     * Column name C_DocTypeTarget_ID
     */
    public static final String COLUMNNAME_C_DocTypeTarget_ID = "C_DocTypeTarget_ID";
    /**
     * Column name ColumnSQL
     */
    public static final String COLUMNNAME_ColumnSQL = "ColumnSQL";
    /**
     * Column name C_PaySelection_ID
     */
    public static final String COLUMNNAME_C_PaySelection_ID = "C_PaySelection_ID";
    /**
     * Column name Created
     */
    public static final String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DateAcct
     */
    public static final String COLUMNNAME_DateAcct = "DateAcct";
    /**
     * Column name DocAction
     */
    public static final String COLUMNNAME_DocAction = "DocAction";
    /**
     * Column name DocStatus
     */
    public static final String COLUMNNAME_DocStatus = "DocStatus";
    /**
     * Column name DocumentNo
     */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name HR_Department_ID
     */
    public static final String COLUMNNAME_HR_Department_ID = "HR_Department_ID";
    /**
     * Column name HR_Employee_ID
     */
    public static final String COLUMNNAME_HR_Employee_ID = "HR_Employee_ID";
    /**
     * Column name HR_Job_ID
     */
    public static final String COLUMNNAME_HR_Job_ID = "HR_Job_ID";
    /**
     * Column name HR_Payroll_ID
     */
    public static final String COLUMNNAME_HR_Payroll_ID = "HR_Payroll_ID";
    /**
     * Column name HR_Period_ID
     */
    public static final String COLUMNNAME_HR_Period_ID = "HR_Period_ID";
    /**
     * Column name HR_Process_ID
     */
    public static final String COLUMNNAME_HR_Process_ID = "HR_Process_ID";
    /**
     * Column name HR_Process_UU
     */
    public static final String COLUMNNAME_HR_Process_UU = "HR_Process_UU";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name Posted
     */
    public static final String COLUMNNAME_Posted = "Posted";
    /**
     * Column name Processed
     */
    public static final String COLUMNNAME_Processed = "Processed";
    /**
     * Column name ProcessedOn
     */
    public static final String COLUMNNAME_ProcessedOn = "ProcessedOn";
    /**
     * Column name Processing
     */
    public static final String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Reversal_ID
     */
    public static final String COLUMNNAME_Reversal_ID = "Reversal_ID";
    /**
     * Column name Updated
     */
    public static final String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Organization. Organizational entity within client
     */
    public int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    public void setOrgId(int AD_Org_ID);

    /**
     * Get Print Format. Data Print Format
     */
    public int getAD_PrintFormat_ID();

    /**
     * Set Print Format. Data Print Format
     */
    public void setAD_PrintFormat_ID(int AD_PrintFormat_ID);

    public org.compiere.model.I_AD_PrintFormat getAD_PrintFormat() throws RuntimeException;

    /**
     * Get Workflow. Workflow or combination of tasks
     */
    public int getAD_Workflow_ID();

    /**
     * Set Workflow. Workflow or combination of tasks
     */
    public void setAD_Workflow_ID(int AD_Workflow_ID);

    public org.compiere.model.I_AD_Workflow getAD_Workflow() throws RuntimeException;

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    public int getBusinessPartnerId();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    public void setBusinessPartnerId(int C_BPartner_ID);

    public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

    /**
     * Get Charge. Additional document charges
     */
    public int getChargeId();

    /**
     * Set Charge. Additional document charges
     */
    public void setChargeId(int C_Charge_ID);

    public org.compiere.model.I_C_Charge getC_Charge() throws RuntimeException;

    /**
     * Get Document Type. Document type or rules
     */
    public int getDocumentTypeId();

    /**
     * Set Document Type. Document type or rules
     */
    public void setDocumentTypeId(int C_DocType_ID);

    public org.compiere.model.I_C_DocType getDocumentType() throws RuntimeException;

    /**
     * Get Target Document Type. Target document type for conversing documents
     */
    public int getTargetDocumentTypeId();

    /**
     * Set Target Document Type. Target document type for conversing documents
     */
    public void setTargetDocumentTypeId(int C_DocTypeTarget_ID);

    public org.compiere.model.I_C_DocType getC_DocTypeTarget() throws RuntimeException;

    /**
     * Get Column SQL. Virtual Column (r/o)
     */
    public String getColumnSQL();

    /**
     * Set Column SQL. Virtual Column (r/o)
     */
    public void setColumnSQL(String ColumnSQL);

    /**
     * Get Payment Selection. Payment Selection
     */
    public int getPaySelectionId();

    /**
     * Set Payment Selection. Payment Selection
     */
    public void setPaySelectionId(int C_PaySelection_ID);

    public org.compiere.model.I_C_PaySelection getC_PaySelection() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    public Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    public int getCreatedBy();

    /**
     * Get Account Date. Accounting Date
     */
    public Timestamp getDateAcct();

    /**
     * Set Account Date. Accounting Date
     */
    public void setDateAcct(Timestamp DateAcct);

    /**
     * Get Document Action. The targeted status of the document
     */
    public String getDocAction();

    /**
     * Set Document Action. The targeted status of the document
     */
    public void setDocAction(String DocAction);

    /**
     * Get Document Status. The current status of the document
     */
    public String getDocStatus();

    /**
     * Set Document Status. The current status of the document
     */
    public void setDocStatus(String DocStatus);

    /**
     * Get Document No. Document sequence number of the document
     */
    public String getDocumentNo();

    /**
     * Set Document No. Document sequence number of the document
     */
    public void setDocumentNo(String DocumentNo);

    /**
     * Get Payroll Department
     */
    public int getHR_Department_ID();

    /**
     * Set Payroll Department
     */
    public void setHR_Department_ID(int HR_Department_ID);

    public org.eevolution.model.I_HR_Department getHR_Department() throws RuntimeException;

    /**
     * Get Payroll Employee
     */
    public int getHR_Employee_ID();

    /**
     * Set Payroll Employee
     */
    public void setHR_Employee_ID(int HR_Employee_ID);

    public org.eevolution.model.I_HR_Employee getHR_Employee() throws RuntimeException;

    /**
     * Get Payroll Job
     */
    public int getHR_Job_ID();

    /**
     * Set Payroll Job
     */
    public void setHR_Job_ID(int HR_Job_ID);

    public org.eevolution.model.I_HR_Job getHR_Job() throws RuntimeException;

    /**
     * Get Payroll
     */
    public int getHR_Payroll_ID();

    /**
     * Set Payroll
     */
    public void setHR_Payroll_ID(int HR_Payroll_ID);

    public org.eevolution.model.I_HR_Payroll getHR_Payroll() throws RuntimeException;

    /**
     * Get Payroll Period
     */
    public int getHR_Period_ID();

    /**
     * Set Payroll Period
     */
    public void setHR_Period_ID(int HR_Period_ID);

    public org.eevolution.model.I_HR_Period getHR_Period() throws RuntimeException;

    /**
     * Get Payroll Process
     */
    public int getHR_Process_ID();

    /**
     * Set Payroll Process
     */
    public void setHR_Process_ID(int HR_Process_ID);

    /**
     * Get HR_Process_UU
     */
    public String getHR_Process_UU();

    /**
     * Set HR_Process_UU
     */
    public void setHR_Process_UU(String HR_Process_UU);

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
     * Get Posted. Posting status
     */
    public boolean isPosted();

    /**
     * Set Posted. Posting status
     */
    public void setPosted(boolean Posted);

    /**
     * Get Processed. The document has been processed
     */
    public boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    public void setProcessed(boolean Processed);

    /**
     * Get Processed On. The date+time (expressed in decimal format) when the document has been
     * processed
     */
    public BigDecimal getProcessedOn();

    /**
     * Set Processed On. The date+time (expressed in decimal format) when the document has been
     * processed
     */
    public void setProcessedOn(BigDecimal ProcessedOn);

    /**
     * Get Process Now
     */
    public boolean isProcessing();

    /**
     * Set Process Now
     */
    public void setProcessing(boolean Processing);

    /**
     * Get Reversal ID. ID of document reversal
     */
    public int getReversalId();

    /**
     * Set Reversal ID. ID of document reversal
     */
    public void setReversalId(int Reversal_ID);

    public org.eevolution.model.I_HR_Process getReversal() throws RuntimeException;

    /**
     * Get Updated. Date this record was updated
     */
    public Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    public int getUpdatedBy();
}
