package org.compiere.model;

import org.idempiere.icommon.model.IPO;
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;

/**
 * Generated Interface for C_Opportunity
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Opportunity extends IPO, BusinessOpportunityWritable {

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

    /** Column name ExpectedCloseDate */
    String COLUMNNAME_ExpectedCloseDate = "ExpectedCloseDate";

    /** Column name Probability */
    String COLUMNNAME_Probability = "Probability";

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getBusinessPartnerId();
    void setBusinessPartnerId(int id);

    I_C_BPartner getBusinessPartner() throws RuntimeException;
    void setBusinessPartner(I_C_BPartner partner);

    /**
     * Get Order. Order
     */
    int getOrderId();

    I_C_Order getOrder() throws RuntimeException;

    /**
     * Get Document No. Document sequence number of the document
     */
    String getDocumentNo();

    /** Set Currency.
     * The Currency for this record
     */
    void setCurrencyId(int C_Currency_ID);

    /** Set Sales Stage.
     * Stages of the sales process
     */
    void setSalesStageId(int C_SalesStage_ID);

    /** Get Sales Stage.
     * Stages of the sales process
     */
    int getSalesStageId();
}
