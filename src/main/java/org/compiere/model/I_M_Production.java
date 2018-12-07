package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_Production
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Production {

    /**
     * TableName=M_Production
     */
    String Table_Name = "M_Production";

    /**
     * AD_Table_ID=325
     */
    int Table_ID = 325;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_OrgTrx_ID
     */
    String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
    /**
     * Column name C_Activity_ID
     */
    String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_Campaign_ID
     */
    String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
    /**
     * Column name C_OrderLine_ID
     */
    String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
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
     * Column name CreateFrom
     */
    String COLUMNNAME_CreateFrom = "CreateFrom";
    /**
     * Column name DatePromised
     */
    String COLUMNNAME_DatePromised = "DatePromised";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DocAction
     */
    String COLUMNNAME_DocAction = "DocAction";
    /**
     * Column name DocStatus
     */
    String COLUMNNAME_DocStatus = "DocStatus";
    /**
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsComplete
     */
    String COLUMNNAME_IsComplete = "IsComplete";
    /**
     * Column name IsCreated
     */
    String COLUMNNAME_IsCreated = "IsCreated";
    /**
     * Column name IsUseProductionPlan
     */
    String COLUMNNAME_IsUseProductionPlan = "IsUseProductionPlan";
    /**
     * Column name M_Locator_ID
     */
    String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
    /**
     * Column name MovementDate
     */
    String COLUMNNAME_MovementDate = "MovementDate";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_Production_ID
     */
    String COLUMNNAME_M_Production_ID = "M_Production_ID";
    /**
     * Column name M_Production_UU
     */
    String COLUMNNAME_M_Production_UU = "M_Production_UU";
    /**
     * Column name Posted
     */
    String COLUMNNAME_Posted = "Posted";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name ProcessedOn
     */
    String COLUMNNAME_ProcessedOn = "ProcessedOn";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name ProductionQty
     */
    String COLUMNNAME_ProductionQty = "ProductionQty";
    /**
     * Column name Reversal_ID
     */
    String COLUMNNAME_Reversal_ID = "Reversal_ID";
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
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Trx Organization. Performing or initiating organization
     */
    int getAD_OrgTrx_ID();

    /**
     * Set Trx Organization. Performing or initiating organization
     */
    void setAD_OrgTrx_ID(int AD_OrgTrx_ID);

    /**
     * Get Activity. Business Activity
     */
    int getC_Activity_ID();

    /**
     * Set Activity. Business Activity
     */
    void setC_Activity_ID(int C_Activity_ID);

    I_C_Activity getC_Activity() throws RuntimeException;

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
     * Get Campaign. Marketing Campaign
     */
    int getC_Campaign_ID();

    /**
     * Set Campaign. Marketing Campaign
     */
    void setC_Campaign_ID(int C_Campaign_ID);

    I_C_Campaign getC_Campaign() throws RuntimeException;

    /**
     * Get Sales Order Line. Sales Order Line
     */
    int getC_OrderLine_ID();

    /**
     * Set Sales Order Line. Sales Order Line
     */
    void setC_OrderLine_ID(int C_OrderLine_ID);

    I_C_OrderLine getC_OrderLine() throws RuntimeException;

    /**
     * Get Project. Financial Project
     */
    int getC_Project_ID();

    /**
     * Set Project. Financial Project
     */
    void setC_Project_ID(int C_Project_ID);

    I_C_Project getC_Project() throws RuntimeException;

    /**
     * Get Project Phase. Phase of a Project
     */
    int getC_ProjectPhase_ID();

    /**
     * Set Project Phase. Phase of a Project
     */
    void setC_ProjectPhase_ID(int C_ProjectPhase_ID);

    I_C_ProjectPhase getC_ProjectPhase() throws RuntimeException;

    /**
     * Get Project Task. Actual Project Task in a Phase
     */
    int getC_ProjectTask_ID();

    /**
     * Set Project Task. Actual Project Task in a Phase
     */
    void setC_ProjectTask_ID(int C_ProjectTask_ID);

    I_C_ProjectTask getC_ProjectTask() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Create lines from. Process which will generate a new document lines based on an existing
     * document
     */
    String getCreateFrom();

    /**
     * Set Create lines from. Process which will generate a new document lines based on an existing
     * document
     */
    void setCreateFrom(String CreateFrom);

    /**
     * Get Date Promised. Date Order was promised
     */
    Timestamp getDatePromised();

    /**
     * Set Date Promised. Date Order was promised
     */
    void setDatePromised(Timestamp DatePromised);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Document Action. The targeted status of the document
     */
    String getDocAction();

    /**
     * Set Document Action. The targeted status of the document
     */
    void setDocAction(String DocAction);

    /**
     * Get Document No. Document sequence number of the document
     */
    String getDocumentNo();

    /**
     * Set Document No. Document sequence number of the document
     */
    void setDocumentNo(String DocumentNo);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Complete. It is complete
     */
    void setIsComplete(boolean IsComplete);

    /**
     * Get Complete. It is complete
     */
    boolean isComplete();

    /**
     * Get Records created
     */
    String getIsCreated();

    /**
     * Set Records created
     */
    void setIsCreated(String IsCreated);

    /**
     * Set Use Production Plan
     */
    void setIsUseProductionPlan(boolean IsUseProductionPlan);

    /**
     * Get Use Production Plan
     */
    boolean isUseProductionPlan();

    /**
     * Get Locator. Warehouse Locator
     */
    int getM_Locator_ID();

    /**
     * Set Locator. Warehouse Locator
     */
    void setM_Locator_ID(int M_Locator_ID);

    I_M_Locator getM_Locator() throws RuntimeException;

    /**
     * Get Movement Date. Date a product was moved in or out of inventory
     */
    Timestamp getMovementDate();

    /**
     * Set Movement Date. Date a product was moved in or out of inventory
     */
    void setMovementDate(Timestamp MovementDate);

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    void setM_Product_ID(int M_Product_ID);

    I_M_Product getM_Product() throws RuntimeException;

    /**
     * Get Production. Plan for producing a product
     */
    int getM_Production_ID();

    /**
     * Set Production. Plan for producing a product
     */
    void setM_Production_ID(int M_Production_ID);

    /**
     * Get M_Production_UU
     */
    String getM_Production_UU();

    /**
     * Set M_Production_UU
     */
    void setM_Production_UU(String M_Production_UU);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Posted. Posting status
     */
    boolean isPosted();

    /**
     * Set Posted. Posting status
     */
    void setPosted(boolean Posted);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Processed On. The date+time (expressed in decimal format) when the document has been
     * processed
     */
    BigDecimal getProcessedOn();

    /**
     * Set Processed On. The date+time (expressed in decimal format) when the document has been
     * processed
     */
    void setProcessedOn(BigDecimal ProcessedOn);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Production Quantity. Quantity of products to produce
     */
    BigDecimal getProductionQty();

    /**
     * Set Production Quantity. Quantity of products to produce
     */
    void setProductionQty(BigDecimal ProductionQty);

    /**
     * Get Reversal ID. ID of document reversal
     */
    int getReversal_ID();

    /**
     * Set Reversal ID. ID of document reversal
     */
    void setReversal_ID(int Reversal_ID);

    I_M_Production getReversal() throws RuntimeException;

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
    int getUser1_ID();

    /**
     * Set User Element List 1. User defined list element #1
     */
    void setUser1_ID(int User1_ID);

    I_C_ElementValue getUser1() throws RuntimeException;

    /**
     * Get User Element List 2. User defined list element #2
     */
    int getUser2_ID();

    /**
     * Set User Element List 2. User defined list element #2
     */
    void setUser2_ID(int User2_ID);

    I_C_ElementValue getUser2() throws RuntimeException;

    void saveEx();

    int createLines(boolean mustBeStocked);
}
