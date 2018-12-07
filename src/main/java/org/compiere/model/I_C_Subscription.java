package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Subscription
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Subscription {

    /**
     * TableName=C_Subscription
     */
    String Table_Name = "C_Subscription";

    /**
     * AD_Table_ID=669
     */
    int Table_ID = 669;

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
     * Column name C_Subscription_ID
     */
    String COLUMNNAME_C_Subscription_ID = "C_Subscription_ID";
    /**
     * Column name C_SubscriptionType_ID
     */
    String COLUMNNAME_C_SubscriptionType_ID = "C_SubscriptionType_ID";
    /**
     * Column name C_Subscription_UU
     */
    String COLUMNNAME_C_Subscription_UU = "C_Subscription_UU";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsDue
     */
    String COLUMNNAME_IsDue = "IsDue";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name PaidUntilDate
     */
    String COLUMNNAME_PaidUntilDate = "PaidUntilDate";
    /**
     * Column name RenewalDate
     */
    String COLUMNNAME_RenewalDate = "RenewalDate";
    /**
     * Column name StartDate
     */
    String COLUMNNAME_StartDate = "StartDate";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

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
     * Get Subscription. Subscription of a Business Partner of a Product to renew
     */
    int getC_Subscription_ID();

    /**
     * Set Subscription. Subscription of a Business Partner of a Product to renew
     */
    void setC_Subscription_ID(int C_Subscription_ID);

    /**
     * Get Subscription Type. Type of subscription
     */
    int getC_SubscriptionType_ID();

    /**
     * Set Subscription Type. Type of subscription
     */
    void setC_SubscriptionType_ID(int C_SubscriptionType_ID);

    I_C_SubscriptionType getC_SubscriptionType() throws RuntimeException;

    /**
     * Get C_Subscription_UU
     */
    String getC_Subscription_UU();

    /**
     * Set C_Subscription_UU
     */
    void setC_Subscription_UU(String C_Subscription_UU);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Due. Subscription Renewal is Due
     */
    void setIsDue(boolean IsDue);

    /**
     * Get Due. Subscription Renewal is Due
     */
    boolean isDue();

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
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Paid Until. Subscription is paid/valid until this date
     */
    Timestamp getPaidUntilDate();

    /**
     * Set Paid Until. Subscription is paid/valid until this date
     */
    void setPaidUntilDate(Timestamp PaidUntilDate);

    /**
     * Get Renewal Date
     */
    Timestamp getRenewalDate();

    /**
     * Set Renewal Date
     */
    void setRenewalDate(Timestamp RenewalDate);

    /**
     * Get Start Date. First effective day (inclusive)
     */
    Timestamp getStartDate();

    /**
     * Set Start Date. First effective day (inclusive)
     */
    void setStartDate(Timestamp StartDate);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
