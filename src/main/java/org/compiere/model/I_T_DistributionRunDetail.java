package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for T_DistributionRunDetail
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_T_DistributionRunDetail {

  /** TableName=T_DistributionRunDetail */
  String Table_Name = "T_DistributionRunDetail";

  /** AD_Table_ID=714 */
  int Table_ID = 714;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BPartner_Location_ID */
  String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_DistributionList_ID */
  String COLUMNNAME_M_DistributionList_ID = "M_DistributionList_ID";
  /** Column name M_DistributionListLine_ID */
  String COLUMNNAME_M_DistributionListLine_ID = "M_DistributionListLine_ID";
  /** Column name M_DistributionRun_ID */
  String COLUMNNAME_M_DistributionRun_ID = "M_DistributionRun_ID";
  /** Column name M_DistributionRunLine_ID */
  String COLUMNNAME_M_DistributionRunLine_ID = "M_DistributionRunLine_ID";
  /** Column name MinQty */
  String COLUMNNAME_MinQty = "MinQty";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name Qty */
  String COLUMNNAME_Qty = "Qty";
  /** Column name Ratio */
  String COLUMNNAME_Ratio = "Ratio";
  /** Column name T_DistributionRunDetail_UU */
  String COLUMNNAME_T_DistributionRunDetail_UU = "T_DistributionRunDetail_UU";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Partner Location. Identifies the (ship to) address for this Business Partner */
  int getC_BPartner_Location_ID();

  /** Set Partner Location. Identifies the (ship to) address for this Business Partner */
  void setC_BPartner_Location_ID(int C_BPartner_Location_ID);

  I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /**
   * Get Distribution List. Distribution Lists allow to distribute products to a selected list of
   * partners
   */
  int getM_DistributionList_ID();

  /**
   * Set Distribution List. Distribution Lists allow to distribute products to a selected list of
   * partners
   */
  void setM_DistributionList_ID(int M_DistributionList_ID);

  I_M_DistributionList getM_DistributionList() throws RuntimeException;

  /**
   * Get Distribution List Line. Distribution List Line with Business Partner and
   * Quantity/Percentage
   */
  int getM_DistributionListLine_ID();

  /**
   * Set Distribution List Line. Distribution List Line with Business Partner and
   * Quantity/Percentage
   */
  void setM_DistributionListLine_ID(int M_DistributionListLine_ID);

  I_M_DistributionListLine getM_DistributionListLine() throws RuntimeException;

  /**
   * Get Distribution Run. Distribution Run create Orders to distribute products to a selected list
   * of partners
   */
  int getM_DistributionRun_ID();

  /**
   * Set Distribution Run. Distribution Run create Orders to distribute products to a selected list
   * of partners
   */
  void setM_DistributionRun_ID(int M_DistributionRun_ID);

  I_M_DistributionRun getM_DistributionRun() throws RuntimeException;

  /**
   * Get Distribution Run Line. Distribution Run Lines define Distribution List, the Product and
   * Quantities
   */
  int getM_DistributionRunLine_ID();

  /**
   * Set Distribution Run Line. Distribution Run Lines define Distribution List, the Product and
   * Quantities
   */
  void setM_DistributionRunLine_ID(int M_DistributionRunLine_ID);

  I_M_DistributionRunLine getM_DistributionRunLine() throws RuntimeException;

  /** Get Minimum Quantity. Minimum quantity for the business partner */
  BigDecimal getMinQty();

  /** Set Minimum Quantity. Minimum quantity for the business partner */
  void setMinQty(BigDecimal MinQty);

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Quantity. Quantity */
  BigDecimal getQty();

  /** Set Quantity. Quantity */
  void setQty(BigDecimal Qty);

  /** Get Ratio. Relative Ratio for Distributions */
  BigDecimal getRatio();

  /** Set Ratio. Relative Ratio for Distributions */
  void setRatio(BigDecimal Ratio);

  /** Get T_DistributionRunDetail_UU */
  String getT_DistributionRunDetail_UU();

  /** Set T_DistributionRunDetail_UU */
  void setT_DistributionRunDetail_UU(String T_DistributionRunDetail_UU);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
