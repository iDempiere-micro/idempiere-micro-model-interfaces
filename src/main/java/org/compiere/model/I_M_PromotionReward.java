package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_PromotionReward
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_PromotionReward {

  /** TableName=M_PromotionReward */
  String Table_Name = "M_PromotionReward";

  /** AD_Table_ID=53182 */
  int Table_ID = 53182;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Amount */
  String COLUMNNAME_Amount = "Amount";
  /** Column name C_Charge_ID */
  String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DistributionSorting */
  String COLUMNNAME_DistributionSorting = "DistributionSorting";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsForAllDistribution */
  String COLUMNNAME_IsForAllDistribution = "IsForAllDistribution";
  /** Column name IsSameDistribution */
  String COLUMNNAME_IsSameDistribution = "IsSameDistribution";
  /** Column name M_PromotionDistribution_ID */
  String COLUMNNAME_M_PromotionDistribution_ID = "M_PromotionDistribution_ID";
  /** Column name M_Promotion_ID */
  String COLUMNNAME_M_Promotion_ID = "M_Promotion_ID";
  /** Column name M_PromotionReward_ID */
  String COLUMNNAME_M_PromotionReward_ID = "M_PromotionReward_ID";
  /** Column name M_PromotionReward_UU */
  String COLUMNNAME_M_PromotionReward_UU = "M_PromotionReward_UU";
  /** Column name M_TargetDistribution_ID */
  String COLUMNNAME_M_TargetDistribution_ID = "M_TargetDistribution_ID";
  /** Column name Qty */
  String COLUMNNAME_Qty = "Qty";
  /** Column name RewardType */
  String COLUMNNAME_RewardType = "RewardType";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Amount. Amount in a defined currency */
  BigDecimal getAmount();

  /** Set Amount. Amount in a defined currency */
  void setAmount(BigDecimal Amount);

  /** Get Charge. Additional document charges */
  int getC_Charge_ID();

  /** Set Charge. Additional document charges */
  void setC_Charge_ID(int C_Charge_ID);

  I_C_Charge getC_Charge() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Distribution Sorting. Quantity distribution sorting by unit price */
  String getDistributionSorting();

  /** Set Distribution Sorting. Quantity distribution sorting by unit price */
  void setDistributionSorting(String DistributionSorting);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set For all distribution. This reward is for all distribution */
  void setIsForAllDistribution(boolean IsForAllDistribution);

  /** Get For all distribution. This reward is for all distribution */
  boolean isForAllDistribution();

  /**
   * Set Same distribution for source and target. Use the same distribution for source and target
   */
  void setIsSameDistribution(boolean IsSameDistribution);

  /**
   * Get Same distribution for source and target. Use the same distribution for source and target
   */
  boolean isSameDistribution();

  /** Get Promotion Distribution */
  int getM_PromotionDistribution_ID();

  /** Set Promotion Distribution */
  void setM_PromotionDistribution_ID(int M_PromotionDistribution_ID);

  I_M_PromotionDistribution getM_PromotionDistribution() throws RuntimeException;

  /** Get Promotion */
  int getM_Promotion_ID();

  /** Set Promotion */
  void setM_Promotion_ID(int M_Promotion_ID);

  I_M_Promotion getM_Promotion() throws RuntimeException;

  /** Get Promotion Reward */
  int getM_PromotionReward_ID();

  /** Set Promotion Reward */
  void setM_PromotionReward_ID(int M_PromotionReward_ID);

  /** Get M_PromotionReward_UU */
  String getM_PromotionReward_UU();

  /** Set M_PromotionReward_UU */
  void setM_PromotionReward_UU(String M_PromotionReward_UU);

  /** Get Target distribution. Get product from target distribution to apply the promotion reward */
  int getM_TargetDistribution_ID();

  /** Set Target distribution. Get product from target distribution to apply the promotion reward */
  void setM_TargetDistribution_ID(int M_TargetDistribution_ID);

  I_M_PromotionDistribution getM_TargetDistribution() throws RuntimeException;

  /** Get Quantity. Quantity */
  BigDecimal getQty();

  /** Set Quantity. Quantity */
  void setQty(BigDecimal Qty);

  /**
   * Get Reward Type. Type of reward which consists of percentage discount, flat discount or
   * absolute amount
   */
  String getRewardType();

  /**
   * Set Reward Type. Type of reward which consists of percentage discount, flat discount or
   * absolute amount
   */
  void setRewardType(String RewardType);

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
