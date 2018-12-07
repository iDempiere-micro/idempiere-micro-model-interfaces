package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Asset_Info_Fin
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Info_Fin {

    /**
     * TableName=A_Asset_Info_Fin
     */
    String Table_Name = "A_Asset_Info_Fin";

    /**
     * AD_Table_ID=53132
     */
    int Table_ID = 53132;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name A_Asset_ID
     */
    String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
    /**
     * Column name A_Asset_Info_Fin_ID
     */
    String COLUMNNAME_A_Asset_Info_Fin_ID = "A_Asset_Info_Fin_ID";
    /**
     * Column name A_Asset_Info_Fin_UU
     */
    String COLUMNNAME_A_Asset_Info_Fin_UU = "A_Asset_Info_Fin_UU";
    /**
     * Column name A_Contract_Date
     */
    String COLUMNNAME_A_Contract_Date = "A_Contract_Date";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name A_Due_On
     */
    String COLUMNNAME_A_Due_On = "A_Due_On";
    /**
     * Column name A_Expired_Date
     */
    String COLUMNNAME_A_Expired_Date = "A_Expired_Date";
    /**
     * Column name A_Finance_Meth
     */
    String COLUMNNAME_A_Finance_Meth = "A_Finance_Meth";
    /**
     * Column name A_Monthly_Payment
     */
    String COLUMNNAME_A_Monthly_Payment = "A_Monthly_Payment";
    /**
     * Column name A_Purchase_Option
     */
    String COLUMNNAME_A_Purchase_Option = "A_Purchase_Option";
    /**
     * Column name A_Purchase_Option_Credit
     */
    String COLUMNNAME_A_Purchase_Option_Credit = "A_Purchase_Option_Credit";
    /**
     * Column name A_Purchase_Option_Credit_Per
     */
    String COLUMNNAME_A_Purchase_Option_Credit_Per =
            "A_Purchase_Option_Credit_Per";
    /**
     * Column name A_Purchase_Price
     */
    String COLUMNNAME_A_Purchase_Price = "A_Purchase_Price";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
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
     * Get Asset. Asset used internally or by customers
     */
    int getA_Asset_ID();

    /**
     * Set Asset. Asset used internally or by customers
     */
    void setA_Asset_ID(int A_Asset_ID);

    I_A_Asset getA_Asset() throws RuntimeException;

    /**
     * Get Asset Info Financial ID
     */
    int getA_Asset_Info_Fin_ID();

    /**
     * Set Asset Info Financial ID
     */
    void setA_Asset_Info_Fin_ID(int A_Asset_Info_Fin_ID);

    /**
     * Get A_Asset_Info_Fin_UU
     */
    String getA_Asset_Info_Fin_UU();

    /**
     * Set A_Asset_Info_Fin_UU
     */
    void setA_Asset_Info_Fin_UU(String A_Asset_Info_Fin_UU);

    /**
     * Get Contract Date
     */
    Timestamp getA_Contract_Date();

    /**
     * Set Contract Date
     */
    void setA_Contract_Date(Timestamp A_Contract_Date);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Asset Due On
     */
    String getA_Due_On();

    /**
     * Set Asset Due On
     */
    void setA_Due_On(String A_Due_On);

    /**
     * Get Asset Expired Date
     */
    Timestamp getA_Expired_Date();

    /**
     * Set Asset Expired Date
     */
    void setA_Expired_Date(Timestamp A_Expired_Date);

    /**
     * Get Asset Finance Method
     */
    String getA_Finance_Meth();

    /**
     * Set Asset Finance Method
     */
    void setA_Finance_Meth(String A_Finance_Meth);

    /**
     * Get Asset Monthly Payment
     */
    BigDecimal getA_Monthly_Payment();

    /**
     * Set Asset Monthly Payment
     */
    void setA_Monthly_Payment(BigDecimal A_Monthly_Payment);

    /**
     * Get Purchase Option
     */
    boolean isA_Purchase_Option();

    /**
     * Set Purchase Option
     */
    void setA_Purchase_Option(boolean A_Purchase_Option);

    /**
     * Get Purchase Option Credit
     */
    int getA_Purchase_Option_Credit();

    /**
     * Set Purchase Option Credit
     */
    void setA_Purchase_Option_Credit(int A_Purchase_Option_Credit);

    /**
     * Get Purchase Option Credit %
     */
    BigDecimal getA_Purchase_Option_Credit_Per();

    /**
     * Set Purchase Option Credit %
     */
    void setA_Purchase_Option_Credit_Per(BigDecimal A_Purchase_Option_Credit_Per);

    /**
     * Get Purchase Price
     */
    BigDecimal getA_Purchase_Price();

    /**
     * Set Purchase Price
     */
    void setA_Purchase_Price(BigDecimal A_Purchase_Price);

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
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

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
}
