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
     * Column name C_Order_ID
     */
    String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name C_SalesStage_ID
     */
    String COLUMNNAME_C_SalesStage_ID = "C_SalesStage_ID";
    /**
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name OpportunityAmt
     */
    String COLUMNNAME_OpportunityAmt = "OpportunityAmt";
    /**
     * Column name SalesRep_ID
     */
    String COLUMNNAME_SalesRep_ID = "SalesRep_ID";

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    I_C_BPartner getC_BPartner() throws RuntimeException;

    /**
     * Get Order. Order
     */
    int getC_Order_ID();

    I_C_Order getC_Order() throws RuntimeException;

    /**
     * Get Document No. Document sequence number of the document
     */
    String getDocumentNo();

    /**
     * Set Opportunity Amount. The estimated value of this opportunity.
     */
    void setOpportunityAmt(BigDecimal OpportunityAmt);

}
