package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_PaySchedule
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_PaySchedule {

  /** TableName=C_PaySchedule */
  String Table_Name = "C_PaySchedule";

  /** AD_Table_ID=548 */
  int Table_ID = 548;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_PaymentTerm_ID */
  String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
  /** Column name C_PaySchedule_ID */
  String COLUMNNAME_C_PaySchedule_ID = "C_PaySchedule_ID";
  /** Column name C_PaySchedule_UU */
  String COLUMNNAME_C_PaySchedule_UU = "C_PaySchedule_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Discount */
  String COLUMNNAME_Discount = "Discount";
  /** Column name DiscountDays */
  String COLUMNNAME_DiscountDays = "DiscountDays";
  /** Column name GraceDays */
  String COLUMNNAME_GraceDays = "GraceDays";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsValid */
  String COLUMNNAME_IsValid = "IsValid";
  /** Column name NetDay */
  String COLUMNNAME_NetDay = "NetDay";
  /** Column name NetDays */
  String COLUMNNAME_NetDays = "NetDays";
  /** Column name Percentage */
  String COLUMNNAME_Percentage = "Percentage";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Payment Term. The terms of Payment (timing, discount) */
  int getC_PaymentTerm_ID();

  /** Set Payment Term. The terms of Payment (timing, discount) */
  void setC_PaymentTerm_ID(int C_PaymentTerm_ID);

  I_C_PaymentTerm getC_PaymentTerm() throws RuntimeException;

  /** Get Payment Schedule. Payment Schedule Template */
  int getC_PaySchedule_ID();

  /** Set Payment Schedule. Payment Schedule Template */
  void setC_PaySchedule_ID(int C_PaySchedule_ID);

  /** Get C_PaySchedule_UU */
  String getC_PaySchedule_UU();

  /** Set C_PaySchedule_UU */
  void setC_PaySchedule_UU(String C_PaySchedule_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Discount %. Discount in percent */
  BigDecimal getDiscount();

  /** Set Discount %. Discount in percent */
  void setDiscount(BigDecimal Discount);

  /** Get Discount Days. Number of days from invoice date to be eligible for discount */
  int getDiscountDays();

  /** Set Discount Days. Number of days from invoice date to be eligible for discount */
  void setDiscountDays(int DiscountDays);

  /** Get Grace Days. Days after due date to send first dunning letter */
  int getGraceDays();

  /** Set Grace Days. Days after due date to send first dunning letter */
  void setGraceDays(int GraceDays);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Valid. Element is valid */
  void setIsValid(boolean IsValid);

  /** Get Valid. Element is valid */
  boolean isValid();

  /** Get Net Day. Day when payment is due net */
  String getNetDay();

  /** Set Net Day. Day when payment is due net */
  void setNetDay(String NetDay);

  /** Get Net Days. Net Days in which payment is due */
  int getNetDays();

  /** Set Net Days. Net Days in which payment is due */
  void setNetDays(int NetDays);

  /** Get Percentage. Percent of the entire amount */
  BigDecimal getPercentage();

  /** Set Percentage. Percent of the entire amount */
  void setPercentage(BigDecimal Percentage);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
