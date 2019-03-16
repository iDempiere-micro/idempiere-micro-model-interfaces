package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for GL_JournalLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_GL_JournalLine {

    /**
     * TableName=GL_JournalLine
     */
    String Table_Name = "GL_JournalLine";

    /**
     * AD_Table_ID=226
     */
    int Table_ID = 226;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


    /**
     * Column name A_Asset_Group_ID
     */
    String COLUMNNAME_A_Asset_Group_ID = "A_Asset_Group_ID";
    /**
     * Column name A_Asset_ID
     */
    String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
    /**
     * Column name Account_ID
     */
    String COLUMNNAME_Account_ID = "Account_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_OrgTrx_ID
     */
    String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
    /**
     * Column name Alias_ValidCombination_ID
     */
    String COLUMNNAME_Alias_ValidCombination_ID = "Alias_ValidCombination_ID";
    /**
     * Column name AmtAcctCr
     */
    String COLUMNNAME_AmtAcctCr = "AmtAcctCr";
    /**
     * Column name AmtAcctDr
     */
    String COLUMNNAME_AmtAcctDr = "AmtAcctDr";
    /**
     * Column name AmtSourceCr
     */
    String COLUMNNAME_AmtSourceCr = "AmtSourceCr";
    /**
     * Column name AmtSourceDr
     */
    String COLUMNNAME_AmtSourceDr = "AmtSourceDr";
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
     * Column name C_ConversionType_ID
     */
    String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name C_LocFrom_ID
     */
    String COLUMNNAME_C_LocFrom_ID = "C_LocFrom_ID";
    /**
     * Column name C_LocTo_ID
     */
    String COLUMNNAME_C_LocTo_ID = "C_LocTo_ID";
    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name C_SalesRegion_ID
     */
    String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
    /**
     * Column name C_SubAcct_ID
     */
    String COLUMNNAME_C_SubAcct_ID = "C_SubAcct_ID";
    /**
     * Column name C_UOM_ID
     */
    String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
    /**
     * Column name CurrencyRate
     */
    String COLUMNNAME_CurrencyRate = "CurrencyRate";
    /**
     * Column name C_ValidCombination_ID
     */
    String COLUMNNAME_C_ValidCombination_ID = "C_ValidCombination_ID";
    /**
     * Column name DateAcct
     */
    String COLUMNNAME_DateAcct = "DateAcct";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name GL_Journal_ID
     */
    String COLUMNNAME_GL_Journal_ID = "GL_Journal_ID";
    /**
     * Column name GL_JournalLine_ID
     */
    String COLUMNNAME_GL_JournalLine_ID = "GL_JournalLine_ID";
    /**
     * Column name IsGenerated
     */
    String COLUMNNAME_IsGenerated = "IsGenerated";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";
    /**
     * Column name User1_ID
     */
    String COLUMNNAME_User1_ID = "User1_ID";
    /**
     * Column name User2_ID
     */
    String COLUMNNAME_User2_ID = "User2_ID";

    /**
     * Get Account. Account used
     */
    int getAccountId();

    /**
     * Set Account. Account used
     */
    void setAccountId(int Account_ID);

    /**
     * Get Trx Organization. Performing or initiating organization
     */
    int getTransactionOrganizationId();

    /**
     * Set Trx Organization. Performing or initiating organization
     */
    void setTransactionOrganizationId(int AD_OrgTrx_ID);

    /**
     * Set Alias List. Valid Account Alias List
     */
    void setValidAccountAliasId(int Alias_ValidCombination_ID);

    /**
     * Get Accounted Credit. Accounted Credit Amount
     */
    BigDecimal getAmtAcctCr();

    /**
     * Set Accounted Credit. Accounted Credit Amount
     */
    void setAmtAcctCr(BigDecimal AmtAcctCr);

    /**
     * Get Accounted Debit. Accounted Debit Amount
     */
    BigDecimal getAmtAcctDr();

    /**
     * Set Accounted Debit. Accounted Debit Amount
     */
    void setAmtAcctDr(BigDecimal AmtAcctDr);

    /**
     * Get Source Credit. Source Credit Amount
     */
    BigDecimal getAmtSourceCr();

    /**
     * Set Source Credit. Source Credit Amount
     */
    void setAmtSourceCr(BigDecimal AmtSourceCr);

    /**
     * Get Source Debit. Source Debit Amount
     */
    BigDecimal getAmtSourceDr();

    /**
     * Set Source Debit. Source Debit Amount
     */
    void setAmtSourceDr(BigDecimal AmtSourceDr);

    /**
     * Get Activity. Business Activity
     */
    int getBusinessActivityId();

    /**
     * Set Activity. Business Activity
     */
    void setBusinessActivityId(int C_Activity_ID);

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getBusinessPartnerId();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setBusinessPartnerId(int C_BPartner_ID);

    /**
     * Get Campaign. Marketing Campaign
     */
    int getCampaignId();

    /**
     * Set Campaign. Marketing Campaign
     */
    void setCampaignId(int C_Campaign_ID);

    /**
     * Set Currency Type. Currency Conversion Rate Type
     */
    void setConversionTypeId(int C_ConversionType_ID);

    /**
     * Set Currency. The Currency for this record
     */
    void setCurrencyId(int C_Currency_ID);

    /**
     * Get Location From. Location that inventory was moved from
     */
    int getLocationFromId();

    /**
     * Set Location From. Location that inventory was moved from
     */
    void setLocationFromId(int C_LocFrom_ID);

    /**
     * Get Location To. Location that inventory was moved to
     */
    int getLocationToId();

    /**
     * Set Location To. Location that inventory was moved to
     */
    void setLocationToId(int C_LocTo_ID);

    /**
     * Get Project. Financial Project
     */
    int getProjectId();

    /**
     * Set Project. Financial Project
     */
    void setProjectId(int C_Project_ID);

    /**
     * Get Sales Region. Sales coverage region
     */
    int getSalesRegionId();

    /**
     * Set Sales Region. Sales coverage region
     */
    void setSalesRegionId(int C_SalesRegion_ID);

    /**
     * Get Sub Account. Sub account for Element Value
     */
    int getSubAccountId();

    /**
     * Set Sub Account. Sub account for Element Value
     */
    void setSubAccountId(int C_SubAcct_ID);

    /**
     * Set UOM. Unit of Measure
     */
    void setUOMId(int C_UOM_ID);

    /**
     * Get Rate. Currency Conversion Rate
     */
    BigDecimal getCurrencyRate();

    /**
     * Set Rate. Currency Conversion Rate
     */
    void setCurrencyRate(BigDecimal CurrencyRate);

    /**
     * Get Combination. Valid Account Combination
     */
    int getValidAccountCombinationId();

    /**
     * Set Combination. Valid Account Combination
     */
    void setValidAccountCombinationId(int C_ValidCombination_ID);

    /**
     * Set Account Date. Accounting Date
     */
    void setDateAcct(Timestamp DateAcct);

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Journal. General Ledger Journal
     */
    int getGLJournalId();

    /**
     * Set Journal. General Ledger Journal
     */
    void setGLJournalId(int GL_Journal_ID);

    /**
     * Get Journal Line. General Ledger Journal Line
     */
    int getGLJournalLineId();

    /**
     * Set Generated. This Line is generated
     */
    void setIsGenerated(boolean IsGenerated);

    /**
     * Get Line No. Unique line for this document
     */
    int getLine();

    /**
     * Set Line No. Unique line for this document
     */
    void setLine(int Line);

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

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
     * Get User Element List 1. User defined list element #1
     */
    int getUser1Id();

    /**
     * Set User Element List 1. User defined list element #1
     */
    void setUser1Id(int User1_ID);

    /**
     * Get User Element List 2. User defined list element #2
     */
    int getUser2Id();

    /**
     * Set User Element List 2. User defined list element #2
     */
    void setUser2Id(int User2_ID);

}
