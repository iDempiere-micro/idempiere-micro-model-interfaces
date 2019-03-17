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
@SuppressWarnings("all")
public interface I_HR_Movement {

    /**
     * TableName=HR_Movement
     */
    public static final String Table_Name = "HR_Movement";

    /**
     * AD_Table_ID=53102
     */
    public static final int Table_ID = 53102;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name AccountSign
     */
    public static final String COLUMNNAME_AccountSign = "AccountSign";
    /**
     * Column name AD_Org_ID
     */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_OrgTrx_ID
     */
    public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
    /**
     * Column name AD_Rule_ID
     */
    public static final String COLUMNNAME_AD_Rule_ID = "AD_Rule_ID";
    /**
     * Column name Amount
     */
    public static final String COLUMNNAME_Amount = "Amount";
    /**
     * Column name C_Activity_ID
     */
    public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
    /**
     * Column name C_BPartner_ID
     */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_BP_BankAccount_ID
     */
    public static final String COLUMNNAME_C_BP_BankAccount_ID = "C_BP_BankAccount_ID";
    /**
     * Column name C_BP_Group_ID
     */
    public static final String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
    /**
     * Column name C_Campaign_ID
     */
    public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
    /**
     * Column name ColumnType
     */
    public static final String COLUMNNAME_ColumnType = "ColumnType";
    /**
     * Column name C_Project_ID
     */
    public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name C_ProjectPhase_ID
     */
    public static final String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";
    /**
     * Column name C_ProjectTask_ID
     */
    public static final String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";
    /**
     * Column name Created
     */
    public static final String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Description
     */
    public static final String COLUMNNAME_Description = "Description";
    /**
     * Column name HR_Concept_Category_ID
     */
    public static final String COLUMNNAME_HR_Concept_Category_ID = "HR_Concept_Category_ID";
    /**
     * Column name HR_Concept_ID
     */
    public static final String COLUMNNAME_HR_Concept_ID = "HR_Concept_ID";
    /**
     * Column name HR_Department_ID
     */
    public static final String COLUMNNAME_HR_Department_ID = "HR_Department_ID";
    /**
     * Column name HR_Job_ID
     */
    public static final String COLUMNNAME_HR_Job_ID = "HR_Job_ID";
    /**
     * Column name HR_Movement_ID
     */
    public static final String COLUMNNAME_HR_Movement_ID = "HR_Movement_ID";
    /**
     * Column name HR_Movement_UU
     */
    public static final String COLUMNNAME_HR_Movement_UU = "HR_Movement_UU";
    /**
     * Column name HR_Process_ID
     */
    public static final String COLUMNNAME_HR_Process_ID = "HR_Process_ID";
    /**
     * Column name IsActive
     */
    public static final String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsPrinted
     */
    public static final String COLUMNNAME_IsPrinted = "IsPrinted";
    /**
     * Column name IsRegistered
     */
    public static final String COLUMNNAME_IsRegistered = "IsRegistered";
    /**
     * Column name PP_Cost_Collector_ID
     */
    public static final String COLUMNNAME_PP_Cost_Collector_ID = "PP_Cost_Collector_ID";
    /**
     * Column name Processed
     */
    public static final String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Qty
     */
    public static final String COLUMNNAME_Qty = "Qty";
    /**
     * Column name ServiceDate
     */
    public static final String COLUMNNAME_ServiceDate = "ServiceDate";
    /**
     * Column name TextMsg
     */
    public static final String COLUMNNAME_TextMsg = "TextMsg";
    /**
     * Column name Updated
     */
    public static final String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name User1_ID
     */
    public static final String COLUMNNAME_User1_ID = "User1_ID";
    /**
     * Column name User2_ID
     */
    public static final String COLUMNNAME_User2_ID = "User2_ID";
    /**
     * Column name ValidFrom
     */
    public static final String COLUMNNAME_ValidFrom = "ValidFrom";
    /**
     * Column name ValidTo
     */
    public static final String COLUMNNAME_ValidTo = "ValidTo";

    /**
     * Get Account Sign. Indicates the Natural Sign of the Account as a Debit or Credit
     */
    public String getAccountSign();

    /**
     * Set Account Sign. Indicates the Natural Sign of the Account as a Debit or Credit
     */
    public void setAccountSign(String AccountSign);

    /**
     * Get Organization. Organizational entity within client
     */
    public int getOrgId();

    /**
     * Set Organization. Organizational entity within client
     */
    public void setOrgId(int AD_Org_ID);

    /**
     * Get Trx Organization. Performing or initiating organization
     */
    public int getTransactionOrganizationId();

    /**
     * Set Trx Organization. Performing or initiating organization
     */
    public void setTransactionOrganizationId(int AD_OrgTrx_ID);

    /**
     * Get Rule
     */
    public int getAD_RuleId();

    /**
     * Set Rule
     */
    public void setAD_RuleId(int AD_Rule_ID);

    public org.compiere.model.I_AD_Rule getAD_Rule() throws RuntimeException;

    /**
     * Get Amount. Amount in a defined currency
     */
    public BigDecimal getAmount();

    /**
     * Set Amount. Amount in a defined currency
     */
    public void setAmount(BigDecimal Amount);

    /**
     * Get Activity. Business Activity
     */
    public int getBusinessActivityId();

    /**
     * Set Activity. Business Activity
     */
    public void setBusinessActivityId(int C_Activity_ID);

    public org.compiere.model.I_C_Activity getActivity() throws RuntimeException;

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    public int getBusinessPartnerId();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    public void setBusinessPartnerId(int C_BPartner_ID);

    public org.compiere.model.I_C_BPartner getBPartner() throws RuntimeException;

    /**
     * Get Partner Bank Account. Bank Account of the Business Partner
     */
    public int getBusinessPartnerBankAccountId();

    /**
     * Set Partner Bank Account. Bank Account of the Business Partner
     */
    public void setBusinessPartnerBankAccountId(int C_BP_BankAccount_ID);

    public org.compiere.model.I_C_BP_BankAccount getBP_BankAccount() throws RuntimeException;

    /**
     * Get Business Partner Group. Business Partner Group
     */
    public int getBPGroupId();

    /**
     * Set Business Partner Group. Business Partner Group
     */
    public void setBPGroupId(int C_BP_Group_ID);

    public org.compiere.model.I_C_BP_Group getBP_Group() throws RuntimeException;

    /**
     * Get Campaign. Marketing Campaign
     */
    public int getCampaignId();

    /**
     * Set Campaign. Marketing Campaign
     */
    public void setCampaignId(int C_Campaign_ID);

    public org.compiere.model.I_C_Campaign getCampaign() throws RuntimeException;

    /**
     * Get Column Type
     */
    public String getColumnType();

    /**
     * Set Column Type
     */
    public void setColumnType(String ColumnType);

    /**
     * Get Project. Financial Project
     */
    public int getProjectId();

    /**
     * Set Project. Financial Project
     */
    public void setProjectId(int C_Project_ID);

    public org.compiere.model.I_C_Project getProject() throws RuntimeException;

    /**
     * Get Project Phase. Phase of a Project
     */
    public int getProjectPhaseId();

    /**
     * Set Project Phase. Phase of a Project
     */
    public void setProjectPhaseId(int C_ProjectPhase_ID);

    public org.compiere.model.I_C_ProjectPhase getProjectPhase() throws RuntimeException;

    /**
     * Get Project Task. Actual Project Task in a Phase
     */
    public int getProjectTaskId();

    /**
     * Set Project Task. Actual Project Task in a Phase
     */
    public void setProjectTaskId(int C_ProjectTask_ID);

    public org.compiere.model.I_C_ProjectTask getProjectTask() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    public Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    public int getCreatedBy();

    /**
     * Get Description. Optional short description of the record
     */
    public String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    public void setDescription(String Description);

    /**
     * Get Payroll Concept Category
     */
    public int getHR_Concept_CategoryId();

    /**
     * Set Payroll Concept Category
     */
    public void setHR_Concept_CategoryId(int HR_Concept_Category_ID);

    public org.eevolution.model.I_HR_Concept_Category getHR_Concept_Category()
            throws RuntimeException;

    /**
     * Get Payroll Concept
     */
    public int getHR_ConceptId();

    /**
     * Set Payroll Concept
     */
    public void setHR_ConceptId(int HR_Concept_ID);

    public org.eevolution.model.I_HR_Concept getHR_Concept() throws RuntimeException;

    /**
     * Get Payroll Department
     */
    public int getHR_DepartmentId();

    /**
     * Set Payroll Department
     */
    public void setHR_DepartmentId(int HR_Department_ID);

    public org.eevolution.model.I_HR_Department getHR_Department() throws RuntimeException;

    /**
     * Get Payroll Job
     */
    public int getHR_JobId();

    /**
     * Set Payroll Job
     */
    public void setHR_JobId(int HR_Job_ID);

    public org.eevolution.model.I_HR_Job getHR_Job() throws RuntimeException;

    /**
     * Get Payroll Movement
     */
    public int getHR_MovementId();

    /**
     * Set Payroll Movement
     */
    public void setHR_MovementId(int HR_Movement_ID);

    /**
     * Get HR_Movement_UU
     */
    public String getHR_Movement_UU();

    /**
     * Set HR_Movement_UU
     */
    public void setHR_Movement_UU(String HR_Movement_UU);

    /**
     * Get Payroll Process
     */
    public int getHR_ProcessId();

    /**
     * Set Payroll Process
     */
    public void setHR_ProcessId(int HR_Process_ID);

    public org.eevolution.model.I_HR_Process getHR_Process() throws RuntimeException;

    /**
     * Set Active. The record is active in the system
     */
    public void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    public boolean isActive();

    /**
     * Set Printed. Indicates if this document / line is printed
     */
    public void setIsPrinted(boolean IsPrinted);

    /**
     * Get Printed. Indicates if this document / line is printed
     */
    public boolean isPrinted();

    /**
     * Set Registered. The application is registered.
     */
    public void setIsRegistered(boolean IsRegistered);

    /**
     * Get Registered. The application is registered.
     */
    public boolean isRegistered();

    /**
     * Get Manufacturing Cost Collector
     */
    public int getPP_Cost_CollectorId();

    /**
     * Set Manufacturing Cost Collector
     */
    public void setPP_Cost_CollectorId(int PP_Cost_Collector_ID);

    public org.eevolution.model.I_PP_Cost_Collector getPP_Cost_Collector() throws RuntimeException;

    /**
     * Get Processed. The document has been processed
     */
    public boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    public void setProcessed(boolean Processed);

    /**
     * Get Quantity. Quantity
     */
    public BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    public void setQty(BigDecimal Qty);

    /**
     * Get Service date. Date service was provided
     */
    public Timestamp getServiceDate();

    /**
     * Set Service date. Date service was provided
     */
    public void setServiceDate(Timestamp ServiceDate);

    /**
     * Get Text Message. Text Message
     */
    public String getTextMsg();

    /**
     * Set Text Message. Text Message
     */
    public void setTextMsg(String TextMsg);

    /**
     * Get Updated. Date this record was updated
     */
    public Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    public int getUpdatedBy();

    /**
     * Get User Element List 1. User defined list element #1
     */
    public int getUser1Id();

    /**
     * Set User Element List 1. User defined list element #1
     */
    public void setUser1Id(int User1_ID);

    public org.compiere.model.I_C_ElementValue getUser1() throws RuntimeException;

    /**
     * Get User Element List 2. User defined list element #2
     */
    public int getUser2Id();

    /**
     * Set User Element List 2. User defined list element #2
     */
    public void setUser2Id(int User2_ID);

    public org.compiere.model.I_C_ElementValue getUser2() throws RuntimeException;

    /**
     * Get Valid from. Valid from including this date (first day)
     */
    public Timestamp getValidFrom();

    /**
     * Set Valid from. Valid from including this date (first day)
     */
    public void setValidFrom(Timestamp ValidFrom);

    /**
     * Get Valid to. Valid to including this date (last day)
     */
    public Timestamp getValidTo();

    /**
     * Set Valid to. Valid to including this date (last day)
     */
    public void setValidTo(Timestamp ValidTo);
}
