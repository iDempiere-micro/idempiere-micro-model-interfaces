package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_CommissionLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_CommissionLine {

  /** TableName=C_CommissionLine */
  String Table_Name = "C_CommissionLine";

  /** AD_Table_ID=431 */
  int Table_ID = 431;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AmtMultiplier */
  String COLUMNNAME_AmtMultiplier = "AmtMultiplier";
  /** Column name AmtSubtract */
  String COLUMNNAME_AmtSubtract = "AmtSubtract";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BP_Group_ID */
  String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
  /** Column name C_Commission_ID */
  String COLUMNNAME_C_Commission_ID = "C_Commission_ID";
  /** Column name C_CommissionLine_ID */
  String COLUMNNAME_C_CommissionLine_ID = "C_CommissionLine_ID";
  /** Column name C_CommissionLine_UU */
  String COLUMNNAME_C_CommissionLine_UU = "C_CommissionLine_UU";
  /** Column name CommissionOrders */
  String COLUMNNAME_CommissionOrders = "CommissionOrders";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_SalesRegion_ID */
  String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsPositiveOnly */
  String COLUMNNAME_IsPositiveOnly = "IsPositiveOnly";
  /** Column name Line */
  String COLUMNNAME_Line = "Line";
  /** Column name M_Product_Category_ID */
  String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name Org_ID */
  String COLUMNNAME_Org_ID = "Org_ID";
  /** Column name PaymentRule */
  String COLUMNNAME_PaymentRule = "PaymentRule";
  /** Column name QtyMultiplier */
  String COLUMNNAME_QtyMultiplier = "QtyMultiplier";
  /** Column name QtySubtract */
  String COLUMNNAME_QtySubtract = "QtySubtract";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Multiplier Amount. Multiplier Amount for generating commissions */
  BigDecimal getAmtMultiplier();

  /** Set Multiplier Amount. Multiplier Amount for generating commissions */
  void setAmtMultiplier(BigDecimal AmtMultiplier);

  /** Get Subtract Amount. Subtract Amount for generating commissions */
  BigDecimal getAmtSubtract();

  /** Set Subtract Amount. Subtract Amount for generating commissions */
  void setAmtSubtract(BigDecimal AmtSubtract);

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Business Partner Group. Business Partner Group */
  int getC_BP_Group_ID();

  /** Set Business Partner Group. Business Partner Group */
  void setC_BP_Group_ID(int C_BP_Group_ID);

  I_C_BP_Group getC_BP_Group() throws RuntimeException;

  /** Get Commission. Commission */
  int getC_Commission_ID();

  /** Set Commission. Commission */
  void setC_Commission_ID(int C_Commission_ID);

  I_C_Commission getC_Commission() throws RuntimeException;

  /** Get Commission Line. Commission Line */
  int getC_CommissionLine_ID();

  /** Set Commission Line. Commission Line */
  void setC_CommissionLine_ID(int C_CommissionLine_ID);

  /** Get C_CommissionLine_UU */
  String getC_CommissionLine_UU();

  /** Set C_CommissionLine_UU */
  void setC_CommissionLine_UU(String C_CommissionLine_UU);

  /**
   * Get Commission only specified Orders. Commission only Orders or Invoices, where this Sales Rep
   * is entered
   */
  boolean isCommissionOrders();

  /**
   * Set Commission only specified Orders. Commission only Orders or Invoices, where this Sales Rep
   * is entered
   */
  void setCommissionOrders(boolean CommissionOrders);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Sales Region. Sales coverage region */
  int getC_SalesRegion_ID();

  /** Set Sales Region. Sales coverage region */
  void setC_SalesRegion_ID(int C_SalesRegion_ID);

  I_C_SalesRegion getC_SalesRegion() throws RuntimeException;

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Positive only. Do not generate negative commissions */
  void setIsPositiveOnly(boolean IsPositiveOnly);

  /** Get Positive only. Do not generate negative commissions */
  boolean isPositiveOnly();

  /** Get Line No. Unique line for this document */
  int getLine();

  /** Set Line No. Unique line for this document */
  void setLine(int Line);

  /** Get Product Category. Category of a Product */
  int getM_Product_Category_ID();

  /** Set Product Category. Category of a Product */
  void setM_Product_Category_ID(int M_Product_Category_ID);

  I_M_Product_Category getM_Product_Category() throws RuntimeException;

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Organization. Organizational entity within client */
  int getOrg_ID();

  /** Set Organization. Organizational entity within client */
  void setOrg_ID(int Org_ID);

  /** Get Payment Rule. How you pay the invoice */
  String getPaymentRule();

  /** Set Payment Rule. How you pay the invoice */
  void setPaymentRule(String PaymentRule);

  /** Get Multiplier Quantity. Value to multiply quantities by for generating commissions. */
  BigDecimal getQtyMultiplier();

  /** Set Multiplier Quantity. Value to multiply quantities by for generating commissions. */
  void setQtyMultiplier(BigDecimal QtyMultiplier);

  /** Get Subtract Quantity. Quantity to subtract when generating commissions */
  BigDecimal getQtySubtract();

  /** Set Subtract Quantity. Quantity to subtract when generating commissions */
  void setQtySubtract(BigDecimal QtySubtract);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
