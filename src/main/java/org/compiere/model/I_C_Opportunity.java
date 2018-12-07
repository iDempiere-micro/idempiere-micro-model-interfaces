package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Opportunity
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Opportunity {

    /**
     * TableName=C_Opportunity
     */
    String Table_Name = "C_Opportunity";

    /**
     * AD_Table_ID=53337
     */
    int Table_ID = 53337;

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
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_Campaign_ID
     */
    String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name CloseDate
     */
    String COLUMNNAME_CloseDate = "CloseDate";
    /**
     * Column name Comments
     */
    String COLUMNNAME_Comments = "Comments";
    /**
     * Column name C_Opportunity_ID
     */
    String COLUMNNAME_C_Opportunity_ID = "C_Opportunity_ID";
    /**
     * Column name C_Opportunity_UU
     */
    String COLUMNNAME_C_Opportunity_UU = "C_Opportunity_UU";
    /**
     * Column name C_Order_ID
     */
    String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name Cost
     */
    String COLUMNNAME_Cost = "Cost";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_SalesStage_ID
     */
    String COLUMNNAME_C_SalesStage_ID = "C_SalesStage_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name ExpectedCloseDate
     */
    String COLUMNNAME_ExpectedCloseDate = "ExpectedCloseDate";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name OpportunityAmt
     */
    String COLUMNNAME_OpportunityAmt = "OpportunityAmt";
    /**
     * Column name Probability
     */
    String COLUMNNAME_Probability = "Probability";
    /**
     * Column name SalesRep_ID
     */
    String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name WeightedAmt
     */
    String COLUMNNAME_WeightedAmt = "WeightedAmt";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

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
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

    /**
     * Set Currency. The Currency for this record
     */
    void setC_Currency_ID(int C_Currency_ID);

    I_C_Currency getC_Currency() throws RuntimeException;

    /**
     * Get Close Date. Close Date
     */
    Timestamp getCloseDate();

    /**
     * Set Close Date. Close Date
     */
    void setCloseDate(Timestamp CloseDate);

    /**
     * Get Comments. Comments or additional information
     */
    String getComments();

    /**
     * Set Comments. Comments or additional information
     */
    void setComments(String Comments);

    /**
     * Get Sales Opportunity
     */
    int getC_Opportunity_ID();

    /**
     * Set Sales Opportunity
     */
    void setC_Opportunity_ID(int C_Opportunity_ID);

    /**
     * Get C_Opportunity_UU
     */
    String getC_Opportunity_UU();

    /**
     * Set C_Opportunity_UU
     */
    void setC_Opportunity_UU(String C_Opportunity_UU);

    /**
     * Get Order. Order
     */
    int getC_Order_ID();

    /**
     * Set Order. Order
     */
    void setC_Order_ID(int C_Order_ID);

    I_C_Order getC_Order() throws RuntimeException;

    /**
     * Get Cost. Cost information
     */
    BigDecimal getCost();

    /**
     * Set Cost. Cost information
     */
    void setCost(BigDecimal Cost);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Sales Stage. Stages of the sales process
     */
    int getC_SalesStage_ID();

    /**
     * Set Sales Stage. Stages of the sales process
     */
    void setC_SalesStage_ID(int C_SalesStage_ID);

    I_C_SalesStage getC_SalesStage() throws RuntimeException;

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Document No. Document sequence number of the document
     */
    String getDocumentNo();

    /**
     * Set Document No. Document sequence number of the document
     */
    void setDocumentNo(String DocumentNo);

    /**
     * Get Expected Close Date. Expected Close Date
     */
    Timestamp getExpectedCloseDate();

    /**
     * Set Expected Close Date. Expected Close Date
     */
    void setExpectedCloseDate(Timestamp ExpectedCloseDate);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Opportunity Amount. The estimated value of this opportunity.
     */
    BigDecimal getOpportunityAmt();

    /**
     * Set Opportunity Amount. The estimated value of this opportunity.
     */
    void setOpportunityAmt(BigDecimal OpportunityAmt);

    /**
     * Get Probability
     */
    BigDecimal getProbability();

    /**
     * Set Probability
     */
    void setProbability(BigDecimal Probability);

    /**
     * Get Sales Representative. Sales Representative or Company Agent
     */
    int getSalesRep_ID();

    /**
     * Set Sales Representative. Sales Representative or Company Agent
     */
    void setSalesRep_ID(int SalesRep_ID);

    I_AD_User getSalesRep() throws RuntimeException;

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Weighted Amount. The amount adjusted by the probability.
     */
    BigDecimal getWeightedAmt();

    /**
     * Set Weighted Amount. The amount adjusted by the probability.
     */
    void setWeightedAmt(BigDecimal WeightedAmt);
}
