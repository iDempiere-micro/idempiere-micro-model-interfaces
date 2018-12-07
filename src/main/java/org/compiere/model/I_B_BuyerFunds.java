package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for B_BuyerFunds
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_B_BuyerFunds {

    /**
     * TableName=B_BuyerFunds
     */
    String Table_Name = "B_BuyerFunds";

    /**
     * AD_Table_ID=683
     */
    int Table_ID = 683;

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
     * Column name B_BuyerFunds_ID
     */
    String COLUMNNAME_B_BuyerFunds_ID = "B_BuyerFunds_ID";
    /**
     * Column name B_BuyerFunds_UU
     */
    String COLUMNNAME_B_BuyerFunds_UU = "B_BuyerFunds_UU";
    /**
     * Column name CommittedAmt
     */
    String COLUMNNAME_CommittedAmt = "CommittedAmt";
    /**
     * Column name C_Order_ID
     */
    String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name C_Payment_ID
     */
    String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
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
     * Column name NonCommittedAmt
     */
    String COLUMNNAME_NonCommittedAmt = "NonCommittedAmt";
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
     * Get Buyer Funds. Buyer Funds for Bids on Topics
     */
    int getB_BuyerFunds_ID();

    /**
     * Set Buyer Funds. Buyer Funds for Bids on Topics
     */
    void setB_BuyerFunds_ID(int B_BuyerFunds_ID);

    /**
     * Get B_BuyerFunds_UU
     */
    String getB_BuyerFunds_UU();

    /**
     * Set B_BuyerFunds_UU
     */
    void setB_BuyerFunds_UU(String B_BuyerFunds_UU);

    /**
     * Get Committed Amount. The (legal) commitment amount
     */
    BigDecimal getCommittedAmt();

    /**
     * Set Committed Amount. The (legal) commitment amount
     */
    void setCommittedAmt(BigDecimal CommittedAmt);

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
     * Get Payment. Payment identifier
     */
    int getC_Payment_ID();

    /**
     * Set Payment. Payment identifier
     */
    void setC_Payment_ID(int C_Payment_ID);

    I_C_Payment getC_Payment() throws RuntimeException;

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
     * Get Not Committed Aount. Amount not committed yet
     */
    BigDecimal getNonCommittedAmt();

    /**
     * Set Not Committed Aount. Amount not committed yet
     */
    void setNonCommittedAmt(BigDecimal NonCommittedAmt);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
