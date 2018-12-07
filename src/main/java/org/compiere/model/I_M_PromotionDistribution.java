package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_PromotionDistribution
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_PromotionDistribution {

    /**
     * TableName=M_PromotionDistribution
     */
    String Table_Name = "M_PromotionDistribution";

    /**
     * AD_Table_ID=53181
     */
    int Table_ID = 53181;

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
     * Column name DistributionSorting
     */
    String COLUMNNAME_DistributionSorting = "DistributionSorting";
    /**
     * Column name DistributionType
     */
    String COLUMNNAME_DistributionType = "DistributionType";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name M_PromotionDistribution_ID
     */
    String COLUMNNAME_M_PromotionDistribution_ID = "M_PromotionDistribution_ID";
    /**
     * Column name M_PromotionDistribution_UU
     */
    String COLUMNNAME_M_PromotionDistribution_UU = "M_PromotionDistribution_UU";
    /**
     * Column name M_Promotion_ID
     */
    String COLUMNNAME_M_Promotion_ID = "M_Promotion_ID";
    /**
     * Column name M_PromotionLine_ID
     */
    String COLUMNNAME_M_PromotionLine_ID = "M_PromotionLine_ID";
    /**
     * Column name Operation
     */
    String COLUMNNAME_Operation = "Operation";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
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
     * Get Distribution Sorting. Quantity distribution sorting by unit price
     */
    String getDistributionSorting();

    /**
     * Set Distribution Sorting. Quantity distribution sorting by unit price
     */
    void setDistributionSorting(String DistributionSorting);

    /**
     * Get Distribution Type. Type of quantity distribution calculation using comparison qty and order
     * qty as operand
     */
    String getDistributionType();

    /**
     * Set Distribution Type. Type of quantity distribution calculation using comparison qty and order
     * qty as operand
     */
    void setDistributionType(String DistributionType);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Promotion Distribution
     */
    int getM_PromotionDistribution_ID();

    /**
     * Set Promotion Distribution
     */
    void setM_PromotionDistribution_ID(int M_PromotionDistribution_ID);

    /**
     * Get M_PromotionDistribution_UU
     */
    String getM_PromotionDistribution_UU();

    /**
     * Set M_PromotionDistribution_UU
     */
    void setM_PromotionDistribution_UU(String M_PromotionDistribution_UU);

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

    I_M_PromotionLine getM_PromotionLine() throws RuntimeException;

    /**
     * Get Operation. Compare Operation
     */
    String getOperation();

    /**
     * Set Operation. Compare Operation
     */
    void setOperation(String Operation);

    /**
     * Get Quantity. Quantity
     */
    BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    void setQty(BigDecimal Qty);

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
