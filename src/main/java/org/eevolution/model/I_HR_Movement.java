package org.eevolution.model;

import org.idempiere.common.util.KeyNamePair;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for HR_Movement
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */

public interface I_HR_Movement {

    /**
     * TableName=HR_Movement
     */
    String Table_Name = "HR_Movement";

    /**
     * AD_Table_ID=53102
     */
    int Table_ID = 53102;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name AccountSign
     */
    String COLUMNNAME_AccountSign = "AccountSign";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_OrgTrx_ID
     */
    String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
    /**
     * Column name AD_Rule_ID
     */
    String COLUMNNAME_AD_Rule_ID = "AD_Rule_ID";
    /**
     * Column name Amount
     */
    String COLUMNNAME_Amount = "Amount";
    /**
     * Column name C_Activity_ID
     */
    String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_BP_BankAccount_ID
     */
    String COLUMNNAME_C_BP_BankAccount_ID = "C_BP_BankAccount_ID";
    /**
     * Column name C_BP_Group_ID
     */
    String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
    /**
     * Column name C_Campaign_ID
     */
    String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
    /**
     * Column name ColumnType
     */
    String COLUMNNAME_ColumnType = "ColumnType";
    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name C_ProjectPhase_ID
     */
    String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";
    /**
     * Column name C_ProjectTask_ID
     */
    String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";
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
     * Column name HR_Concept_Category_ID
     */
    String COLUMNNAME_HR_Concept_Category_ID = "HR_Concept_Category_ID";
    /**
     * Column name HR_Concept_ID
     */
    String COLUMNNAME_HR_Concept_ID = "HR_Concept_ID";
    /**
     * Column name HR_Department_ID
     */
    String COLUMNNAME_HR_Department_ID = "HR_Department_ID";
    /**
     * Column name HR_Job_ID
     */
    String COLUMNNAME_HR_Job_ID = "HR_Job_ID";
    /**
     * Column name HR_Movement_ID
     */
    String COLUMNNAME_HR_Movement_ID = "HR_Movement_ID";
    /**
     * Column name HR_Movement_UU
     */
    String COLUMNNAME_HR_Movement_UU = "HR_Movement_UU";
    /**
     * Column name HR_Process_ID
     */
    String COLUMNNAME_HR_Process_ID = "HR_Process_ID";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsPrinted
     */
    String COLUMNNAME_IsPrinted = "IsPrinted";
    /**
     * Column name IsRegistered
     */
    String COLUMNNAME_IsRegistered = "IsRegistered";
    /**
     * Column name PP_Cost_Collector_ID
     */
    String COLUMNNAME_PP_Cost_Collector_ID = "PP_Cost_Collector_ID";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
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
     * Column name User1_ID
     */
    String COLUMNNAME_User1_ID = "User1_ID";
    /**
     * Column name User2_ID
     */
    String COLUMNNAME_User2_ID = "User2_ID";
    /**
     * Column name ValidFrom
     */
    String COLUMNNAME_ValidFrom = "ValidFrom";
    /**
     * Column name ValidTo
     */
    String COLUMNNAME_ValidTo = "ValidTo";

    /**
     * Get Account Sign. Indicates the Natural Sign of the Account as a Debit or Credit
     */
    String getAccountSign();

    /**
     * Set Account Sign. Indicates the Natural Sign of the Account as a Debit or Credit
     */
    void setAccountSign(String AccountSign);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int AD_Org_ID);

    /**
     * Get Trx Organization. Performing or initiating organization
     */
    int getTransactionOrganizationId();

    /**
     * Set Trx Organization. Performing or initiating organization
     */
    void setTransactionOrganizationId(int AD_OrgTrx_ID);

    /**
     * Get Rule
     */
    int getRuleId();

    /**
     * Set Rule
     */
    void setRuleId(int AD_Rule_ID);

    org.compiere.model.I_AD_Rule getRule() throws RuntimeException;

    /**
     * Get Amount. Amount in a defined currency
     */
    BigDecimal getAmount();

    /**
     * Set Amount. Amount in a defined currency
     */
    void setAmount(BigDecimal Amount);

    /**
     * Get Activity. Business Activity
     */
    int getBusinessActivityId();

    /**
     * Set Activity. Business Activity
     */
    void setBusinessActivityId(int C_Activity_ID);

    org.compiere.model.I_C_Activity getActivity() throws RuntimeException;

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
     * Get Partner Bank Account. Bank Account of the Business Partner
     */
    int getBusinessPartnerBankAccountId();

    /**
     * Set Partner Bank Account. Bank Account of the Business Partner
     */
    void setBusinessPartnerBankAccountId(int C_BP_BankAccount_ID);

    org.compiere.model.I_C_BP_BankAccount getBP_BankAccount() throws RuntimeException;

    /**
     * Get Business Partner Group. Business Partner Group
     */
    int getBPGroupId();

    /**
     * Set Business Partner Group. Business Partner Group
     */
    void setBPGroupId(int C_BP_Group_ID);

    org.compiere.model.I_C_BP_Group getBP_Group() throws RuntimeException;

    /**
     * Get Campaign. Marketing Campaign
     */
    int getCampaignId();

    /**
     * Set Campaign. Marketing Campaign
     */
    void setCampaignId(int C_Campaign_ID);

    org.compiere.model.I_C_Campaign getCampaign() throws RuntimeException;

    /**
     * Get Column Type
     */
    String getColumnType();

    /**
     * Set Column Type
     */
    void setColumnType(String ColumnType);

    /**
     * Get Project. Financial Project
     */
    int getProjectId();

    /**
     * Set Project. Financial Project
     */
    void setProjectId(int C_Project_ID);

    org.compiere.model.I_C_Project getProject() throws RuntimeException;

    /**
     * Get Project Phase. Phase of a Project
     */
    int getProjectPhaseId();

    /**
     * Set Project Phase. Phase of a Project
     */
    void setProjectPhaseId(int C_ProjectPhase_ID);

    org.compiere.model.I_C_ProjectPhase getProjectPhase() throws RuntimeException;

    /**
     * Get Project Task. Actual Project Task in a Phase
     */
    int getProjectTaskId();

    /**
     * Set Project Task. Actual Project Task in a Phase
     */
    void setProjectTaskId(int C_ProjectTask_ID);

    org.compiere.model.I_C_ProjectTask getProjectTask() throws RuntimeException;

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
     * Get Payroll Concept Category
     */
    int getPayrollConceptCategoryId();

    /**
     * Set Payroll Concept Category
     */
    void setPayrollConceptCategoryId(int HR_Concept_Category_ID);

    org.eevolution.model.I_HR_Concept_Category getPayrollConceptCategory()
            throws RuntimeException;

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

    org.eevolution.model.I_HR_Job getPayrollJob() throws RuntimeException;

    /**
     * Get Payroll Movement
     */
    int getPayrollMovementId();

    /**
     * Set Payroll Movement
     */
    void setPayrollMovementId(int HR_Movement_ID);

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
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Printed. Indicates if this document / line is printed
     */
    void setIsPrinted(boolean IsPrinted);

    /**
     * Get Printed. Indicates if this document / line is printed
     */
    boolean isPrinted();

    /**
     * Set Registered. The application is registered.
     */
    void setIsRegistered(boolean IsRegistered);

    /**
     * Get Registered. The application is registered.
     */
    boolean isRegistered();

    /**
     * Get Manufacturing Cost Collector
     */
    int getCostCollectorId();

    /**
     * Set Manufacturing Cost Collector
     */
    void setCostCollectorId(int PP_Cost_Collector_ID);

    org.eevolution.model.I_PP_Cost_Collector getCostCollector() throws RuntimeException;

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

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
     * Get User Element List 1. User defined list element #1
     */
    int getUser1Id();

    /**
     * Set User Element List 1. User defined list element #1
     */
    void setUser1Id(int User1_ID);

    org.compiere.model.I_C_ElementValue getUser1() throws RuntimeException;

    /**
     * Get User Element List 2. User defined list element #2
     */
    int getUser2Id();

    /**
     * Set User Element List 2. User defined list element #2
     */
    void setUser2Id(int User2_ID);

    org.compiere.model.I_C_ElementValue getUser2() throws RuntimeException;

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
