package org.compiere.model;

import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for C_Project
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Project extends IPO {

    /**
     * TableName=C_Project
     */
    String Table_Name = "C_Project";

    /**
     * AD_Table_ID=203
     */
    int Table_ID = 203;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AD_OrgTrx_ID
     */
    String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name C_Activity_ID
     */
    String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_BPartner_Location_ID
     */
    String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
    /**
     * Column name C_BPartnerSR_ID
     */
    String COLUMNNAME_C_BPartnerSR_ID = "C_BPartnerSR_ID";
    /**
     * Column name C_Campaign_ID
     */
    String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name CommittedAmt
     */
    String COLUMNNAME_CommittedAmt = "CommittedAmt";
    /**
     * Column name CommittedQty
     */
    String COLUMNNAME_CommittedQty = "CommittedQty";
    /**
     * Column name CopyFrom
     */
    String COLUMNNAME_CopyFrom = "CopyFrom";
    /**
     * Column name C_PaymentTerm_ID
     */
    String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
    /**
     * Column name C_Phase_ID
     */
    String COLUMNNAME_C_Phase_ID = "C_Phase_ID";
    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name C_ProjectType_ID
     */
    String COLUMNNAME_C_ProjectType_ID = "C_ProjectType_ID";
    /**
     * Column name C_Project_UU
     */
    String COLUMNNAME_C_Project_UU = "C_Project_UU";
    /**
     * Column name DateContract
     */
    String COLUMNNAME_DateContract = "DateContract";
    /**
     * Column name DateFinish
     */
    String COLUMNNAME_DateFinish = "DateFinish";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name GenerateTo
     */
    String COLUMNNAME_GenerateTo = "GenerateTo";
    /**
     * Column name InvoicedAmt
     */
    String COLUMNNAME_InvoicedAmt = "InvoicedAmt";
    /**
     * Column name InvoicedQty
     */
    String COLUMNNAME_InvoicedQty = "InvoicedQty";
    /**
     * Column name IsCommitCeiling
     */
    String COLUMNNAME_IsCommitCeiling = "IsCommitCeiling";
    /**
     * Column name IsCommitment
     */
    String COLUMNNAME_IsCommitment = "IsCommitment";
    /**
     * Column name IsSummary
     */
    String COLUMNNAME_IsSummary = "IsSummary";
    /**
     * Column name M_PriceList_Version_ID
     */
    String COLUMNNAME_M_PriceList_Version_ID = "M_PriceList_Version_ID";
    /**
     * Column name M_Warehouse_ID
     */
    String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
    /**
     * Column name Note
     */
    String COLUMNNAME_Note = "Note";
    /**
     * Column name PlannedAmt
     */
    String COLUMNNAME_PlannedAmt = "PlannedAmt";
    /**
     * Column name PlannedMarginAmt
     */
    String COLUMNNAME_PlannedMarginAmt = "PlannedMarginAmt";
    /**
     * Column name PlannedQty
     */
    String COLUMNNAME_PlannedQty = "PlannedQty";
    /**
     * Column name POReference
     */
    String COLUMNNAME_POReference = "POReference";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name ProjectBalanceAmt
     */
    String COLUMNNAME_ProjectBalanceAmt = "ProjectBalanceAmt";
    /**
     * Column name ProjectCategory
     */
    String COLUMNNAME_ProjectCategory = "ProjectCategory";
    /**
     * Column name ProjectLineLevel
     */
    String COLUMNNAME_ProjectLineLevel = "ProjectLineLevel";
    /**
     * Column name ProjInvoiceRule
     */
    String COLUMNNAME_ProjInvoiceRule = "ProjInvoiceRule";
    /**
     * Column name SalesRep_ID
     */
    String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Trx Organization. Performing or initiating organization
     */
    int getAD_OrgTrx_ID();

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setAD_User_ID(int AD_User_ID);

    /**
     * Get Activity. Business Activity
     */
    int getC_Activity_ID();

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Get Partner Location. Identifies the (ship to) address for this Business Partner
     */
    int getC_BPartner_Location_ID();

    /**
     * Get BPartner (Agent). Business Partner (Agent or Sales Rep)
     */
    int getC_BPartnerSR_ID();

    /**
     * Get Campaign. Marketing Campaign
     */
    int getC_Campaign_ID();

    /**
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

    /**
     * Set Currency. The Currency for this record
     */
    void setC_Currency_ID(int C_Currency_ID);

    /**
     * Set Committed Amount. The (legal) commitment amount
     */
    void setCommittedAmt(BigDecimal CommittedAmt);

    /**
     * Set Committed Quantity. The (legal) commitment Quantity
     */
    void setCommittedQty(BigDecimal CommittedQty);

    /**
     * Get Payment Term. The terms of Payment (timing, discount)
     */
    int getC_PaymentTerm_ID();

    /**
     * Get Standard Phase. Standard Phase of the Project Type
     */
    int getC_Phase_ID();

    /**
     * Get Project. Financial Project
     */
    int getC_Project_ID();

    /**
     * Get Project Type. Type of the project
     */
    String getC_ProjectType_ID();

    /**
     * Set Project Type. Type of the project
     */
    void setC_ProjectType_ID(String C_ProjectType_ID);

    /**
     * Get Contract Date. The (planned) effective date of this document.
     */
    Timestamp getDateContract();

    /**
     * Get Finish Date. Finish or (planned) completion date
     */
    Timestamp getDateFinish();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Get Invoiced Amount. The amount invoiced
     */
    BigDecimal getInvoicedAmt();

    /**
     * Set Invoiced Amount. The amount invoiced
     */
    void setInvoicedAmt(BigDecimal InvoicedAmt);

    /**
     * Set Quantity Invoiced . The quantity invoiced
     */
    void setInvoicedQty(BigDecimal InvoicedQty);

    /**
     * Set Commitment is Ceiling. The commitment amount/quantity is the chargeable ceiling
     */
    void setIsCommitCeiling(boolean IsCommitCeiling);

    /**
     * Set Commitment. Is this document a (legal) commitment?
     */
    void setIsCommitment(boolean IsCommitment);

    /**
     * Set Summary Level. This is a summary entity
     */
    void setIsSummary(boolean IsSummary);

    /**
     * Get Price List Version. Identifies a unique instance of a Price List
     */
    int getM_PriceList_Version_ID();

    /**
     * Set Price List Version. Identifies a unique instance of a Price List
     */
    void setM_PriceList_Version_ID(int M_PriceList_Version_ID);

    /**
     * Get Warehouse. Storage Warehouse and Service Point
     */
    int getM_Warehouse_ID();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Planned Amount. Planned amount for this project
     */
    void setPlannedAmt(BigDecimal PlannedAmt);

    /**
     * Set Planned Margin. Project's planned margin amount
     */
    void setPlannedMarginAmt(BigDecimal PlannedMarginAmt);

    /**
     * Set Planned Quantity. Planned quantity for this project
     */
    void setPlannedQty(BigDecimal PlannedQty);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Set Project Balance. Total Project Balance
     */
    void setProjectBalanceAmt(BigDecimal ProjectBalanceAmt);

    /**
     * Get Project Category. Project Category
     */
    String getProjectCategory();

    /**
     * Set Project Category. Project Category
     */
    void setProjectCategory(String ProjectCategory);

    /**
     * Set Line Level. Project Line Level
     */
    void setProjectLineLevel(String ProjectLineLevel);

    /**
     * Set Invoice Rule. Invoice Rule for the project
     */
    void setProjInvoiceRule(String ProjInvoiceRule);

    /**
     * Get Sales Representative. Sales Representative or Company Agent
     */
    int getSalesRep_ID();

}
