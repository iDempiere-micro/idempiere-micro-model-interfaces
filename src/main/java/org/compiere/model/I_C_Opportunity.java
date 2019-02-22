package org.compiere.model;

import java.math.BigDecimal;

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

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

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
     * Column name WeightedAmt
     */
    String COLUMNNAME_WeightedAmt = "WeightedAmt";

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    I_C_BPartner getC_BPartner() throws RuntimeException;

    /**
     * Get Campaign. Marketing Campaign
     */
    int getC_Campaign_ID();

    /**
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

    /**
     * Get Order. Order
     */
    int getC_Order_ID();

    I_C_Order getC_Order() throws RuntimeException;

    /**
     * Get Sales Stage. Stages of the sales process
     */
    int getC_SalesStage_ID();

    /**
     * Get Document No. Document sequence number of the document
     */
    String getDocumentNo();

    /**
     * Set Opportunity Amount. The estimated value of this opportunity.
     */
    void setOpportunityAmt(BigDecimal OpportunityAmt);

    /**
     * Get Sales Representative. Sales Representative or Company Agent
     */
    int getSalesRep_ID();

}
