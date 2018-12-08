package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_DistributionListLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_DistributionListLine {

  /** TableName=M_DistributionListLine */
  String Table_Name = "M_DistributionListLine";

  /** AD_Table_ID=665 */
  int Table_ID = 665;

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
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_DistributionList_ID */
  String COLUMNNAME_M_DistributionList_ID = "M_DistributionList_ID";
  /** Column name M_DistributionListLine_ID */
  String COLUMNNAME_M_DistributionListLine_ID = "M_DistributionListLine_ID";
  /** Column name M_DistributionListLine_UU */
  String COLUMNNAME_M_DistributionListLine_UU = "M_DistributionListLine_UU";
  /** Column name MinQty */
  String COLUMNNAME_MinQty = "MinQty";
  /** Column name Ratio */
  String COLUMNNAME_Ratio = "Ratio";
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

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

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

  /** Get M_DistributionListLine_UU */
  String getM_DistributionListLine_UU();

  /** Set M_DistributionListLine_UU */
  void setM_DistributionListLine_UU(String M_DistributionListLine_UU);

  /** Get Minimum Quantity. Minimum quantity for the business partner */
  BigDecimal getMinQty();

  /** Set Minimum Quantity. Minimum quantity for the business partner */
  void setMinQty(BigDecimal MinQty);

  /** Get Ratio. Relative Ratio for Distributions */
  BigDecimal getRatio();

  /** Set Ratio. Relative Ratio for Distributions */
  void setRatio(BigDecimal Ratio);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
