package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for B_Offer
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_B_Offer {

    /**
     * TableName=B_Offer
     */
    String Table_Name = "B_Offer";

    /**
     * AD_Table_ID=682
     */
    int Table_ID = 682;

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
     * Column name B_Offer_ID
     */
    String COLUMNNAME_B_Offer_ID = "B_Offer_ID";
    /**
     * Column name B_Offer_UU
     */
    String COLUMNNAME_B_Offer_UU = "B_Offer_UU";
    /**
     * Column name B_SellerFunds_ID
     */
    String COLUMNNAME_B_SellerFunds_ID = "B_SellerFunds_ID";
    /**
     * Column name B_Topic_ID
     */
    String COLUMNNAME_B_Topic_ID = "B_Topic_ID";
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
     * Column name IsWillingToCommit
     */
    String COLUMNNAME_IsWillingToCommit = "IsWillingToCommit";
    /**
     * Column name PrivateNote
     */
    String COLUMNNAME_PrivateNote = "PrivateNote";
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
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

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
     * Get Offer. Offer for a Topic
     */
    int getB_Offer_ID();

    /**
     * Set Offer. Offer for a Topic
     */
    void setB_Offer_ID(int B_Offer_ID);

    /**
     * Get B_Offer_UU
     */
    String getB_Offer_UU();

    /**
     * Set B_Offer_UU
     */
    void setB_Offer_UU(String B_Offer_UU);

    /**
     * Get Seller Funds. Seller Funds from Offers on Topics
     */
    int getB_SellerFunds_ID();

    /**
     * Set Seller Funds. Seller Funds from Offers on Topics
     */
    void setB_SellerFunds_ID(int B_SellerFunds_ID);

    I_B_SellerFunds getB_SellerFunds() throws RuntimeException;

    /**
     * Get Topic. Auction Topic
     */
    int getB_Topic_ID();

    /**
     * Set Topic. Auction Topic
     */
    void setB_Topic_ID(int B_Topic_ID);

    I_B_Topic getB_Topic() throws RuntimeException;

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
     * Set Willing to commit
     */
    void setIsWillingToCommit(boolean IsWillingToCommit);

    /**
     * Get Willing to commit
     */
    boolean isWillingToCommit();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Private Note. Private Note - not visible to the other parties
     */
    String getPrivateNote();

    /**
     * Set Private Note. Private Note - not visible to the other parties
     */
    void setPrivateNote(String PrivateNote);

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
