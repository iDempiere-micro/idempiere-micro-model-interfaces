package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_PromotionPreCondition
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_PromotionPreCondition {

    /**
     * TableName=M_PromotionPreCondition
     */
    String Table_Name = "M_PromotionPreCondition";

    /**
     * AD_Table_ID=53180
     */
    int Table_ID = 53180;

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
     * Column name C_Activity_ID
     */
    String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_BP_Group_ID
     */
    String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name EndDate
     */
    String COLUMNNAME_EndDate = "EndDate";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name M_PriceList_ID
     */
    String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
    /**
     * Column name M_Promotion_ID
     */
    String COLUMNNAME_M_Promotion_ID = "M_Promotion_ID";
    /**
     * Column name M_PromotionPreCondition_ID
     */
    String COLUMNNAME_M_PromotionPreCondition_ID = "M_PromotionPreCondition_ID";
    /**
     * Column name M_PromotionPreCondition_UU
     */
    String COLUMNNAME_M_PromotionPreCondition_UU = "M_PromotionPreCondition_UU";
    /**
     * Column name M_Warehouse_ID
     */
    String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
    /**
     * Column name PromotionCode
     */
    String COLUMNNAME_PromotionCode = "PromotionCode";
    /**
     * Column name PromotionCounter
     */
    String COLUMNNAME_PromotionCounter = "PromotionCounter";
    /**
     * Column name PromotionUsageLimit
     */
    String COLUMNNAME_PromotionUsageLimit = "PromotionUsageLimit";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
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
     * Get Activity. Business Activity
     */
    int getC_Activity_ID();

    /**
     * Set Activity. Business Activity
     */
    void setC_Activity_ID(int C_Activity_ID);

    I_C_Activity getC_Activity() throws RuntimeException;

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
     * Get Business Partner Group. Business Partner Group
     */
    int getC_BP_Group_ID();

    /**
     * Set Business Partner Group. Business Partner Group
     */
    void setC_BP_Group_ID(int C_BP_Group_ID);

    I_C_BP_Group getC_BP_Group() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get End Date. Last effective date (inclusive)
     */
    Timestamp getEndDate();

    /**
     * Set End Date. Last effective date (inclusive)
     */
    void setEndDate(Timestamp EndDate);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Price List. Unique identifier of a Price List
     */
    int getM_PriceList_ID();

    /**
     * Set Price List. Unique identifier of a Price List
     */
    void setM_PriceList_ID(int M_PriceList_ID);

    I_M_PriceList getM_PriceList() throws RuntimeException;

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
     * Get Promotion Pre Condition
     */
    int getM_PromotionPreCondition_ID();

    /**
     * Set Promotion Pre Condition
     */
    void setM_PromotionPreCondition_ID(int M_PromotionPreCondition_ID);

    /**
     * Get M_PromotionPreCondition_UU
     */
    String getM_PromotionPreCondition_UU();

    /**
     * Set M_PromotionPreCondition_UU
     */
    void setM_PromotionPreCondition_UU(String M_PromotionPreCondition_UU);

    /**
     * Get Warehouse. Storage Warehouse and Service Point
     */
    int getM_Warehouse_ID();

    /**
     * Set Warehouse. Storage Warehouse and Service Point
     */
    void setM_Warehouse_ID(int M_Warehouse_ID);

    I_M_Warehouse getM_Warehouse() throws RuntimeException;

    /**
     * Get Promotion Code. User entered promotion code at sales time
     */
    String getPromotionCode();

    /**
     * Set Promotion Code. User entered promotion code at sales time
     */
    void setPromotionCode(String PromotionCode);

    /**
     * Get Usage Counter. Usage counter
     */
    int getPromotionCounter();

    /**
     * Set Usage Counter. Usage counter
     */
    void setPromotionCounter(int PromotionCounter);

    /**
     * Get Usage Limit. Maximum usage limit
     */
    int getPromotionUsageLimit();

    /**
     * Set Usage Limit. Maximum usage limit
     */
    void setPromotionUsageLimit(int PromotionUsageLimit);

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

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
