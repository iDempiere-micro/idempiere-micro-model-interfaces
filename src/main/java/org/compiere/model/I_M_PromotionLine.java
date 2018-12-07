package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_PromotionLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_PromotionLine {

    /**
     * TableName=M_PromotionLine
     */
    String Table_Name = "M_PromotionLine";

    /**
     * AD_Table_ID=53179
     */
    int Table_ID = 53179;

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
     * Column name IsMandatoryPL
     */
    String COLUMNNAME_IsMandatoryPL = "IsMandatoryPL";
    /**
     * Column name MinimumAmt
     */
    String COLUMNNAME_MinimumAmt = "MinimumAmt";
    /**
     * Column name M_PromotionGroup_ID
     */
    String COLUMNNAME_M_PromotionGroup_ID = "M_PromotionGroup_ID";
    /**
     * Column name M_Promotion_ID
     */
    String COLUMNNAME_M_Promotion_ID = "M_Promotion_ID";
    /**
     * Column name M_PromotionLine_ID
     */
    String COLUMNNAME_M_PromotionLine_ID = "M_PromotionLine_ID";
    /**
     * Column name M_PromotionLine_UU
     */
    String COLUMNNAME_M_PromotionLine_UU = "M_PromotionLine_UU";
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
     * Set Mandatory Promotion Line. Order must have this promotion line
     */
    void setIsMandatoryPL(boolean IsMandatoryPL);

    /**
     * Get Mandatory Promotion Line. Order must have this promotion line
     */
    boolean isMandatoryPL();

    /**
     * Get Minimum Amt. Minimum Amount in Document Currency
     */
    BigDecimal getMinimumAmt();

    /**
     * Set Minimum Amt. Minimum Amount in Document Currency
     */
    void setMinimumAmt(BigDecimal MinimumAmt);

    /**
     * Get Promotion Group
     */
    int getM_PromotionGroup_ID();

    /**
     * Set Promotion Group
     */
    void setM_PromotionGroup_ID(int M_PromotionGroup_ID);

    I_M_PromotionGroup getM_PromotionGroup() throws RuntimeException;

    /**
     * Get Promotion
     */
    int getM_Promotion_ID();

    /**
     * Set Promotion
     */
    void setM_Promotion_ID(int M_Promotion_ID);

    I_M_Promotion getM_Promotion() throws RuntimeException;

    /**
     * Get Promotion Line
     */
    int getM_PromotionLine_ID();

    /**
     * Set Promotion Line
     */
    void setM_PromotionLine_ID(int M_PromotionLine_ID);

    /**
     * Get M_PromotionLine_UU
     */
    String getM_PromotionLine_UU();

    /**
     * Set M_PromotionLine_UU
     */
    void setM_PromotionLine_UU(String M_PromotionLine_UU);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
