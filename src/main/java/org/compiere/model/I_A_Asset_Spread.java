package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Asset_Spread
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Spread {

  /** TableName=A_Asset_Spread */
  String Table_Name = "A_Asset_Spread";

  /** AD_Table_ID=53126 */
  int Table_ID = 53126;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name A_Asset_Spread_ID */
  String COLUMNNAME_A_Asset_Spread_ID = "A_Asset_Spread_ID";
  /** Column name A_Asset_Spread_Type */
  String COLUMNNAME_A_Asset_Spread_Type = "A_Asset_Spread_Type";
  /** Column name A_Asset_Spread_UU */
  String COLUMNNAME_A_Asset_Spread_UU = "A_Asset_Spread_UU";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name A_Period_1 */
  String COLUMNNAME_A_Period_1 = "A_Period_1";
  /** Column name A_Period_10 */
  String COLUMNNAME_A_Period_10 = "A_Period_10";
  /** Column name A_Period_11 */
  String COLUMNNAME_A_Period_11 = "A_Period_11";
  /** Column name A_Period_12 */
  String COLUMNNAME_A_Period_12 = "A_Period_12";
  /** Column name A_Period_13 */
  String COLUMNNAME_A_Period_13 = "A_Period_13";
  /** Column name A_Period_14 */
  String COLUMNNAME_A_Period_14 = "A_Period_14";
  /** Column name A_Period_2 */
  String COLUMNNAME_A_Period_2 = "A_Period_2";
  /** Column name A_Period_3 */
  String COLUMNNAME_A_Period_3 = "A_Period_3";
  /** Column name A_Period_4 */
  String COLUMNNAME_A_Period_4 = "A_Period_4";
  /** Column name A_Period_5 */
  String COLUMNNAME_A_Period_5 = "A_Period_5";
  /** Column name A_Period_6 */
  String COLUMNNAME_A_Period_6 = "A_Period_6";
  /** Column name A_Period_7 */
  String COLUMNNAME_A_Period_7 = "A_Period_7";
  /** Column name A_Period_8 */
  String COLUMNNAME_A_Period_8 = "A_Period_8";
  /** Column name A_Period_9 */
  String COLUMNNAME_A_Period_9 = "A_Period_9";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get A_Asset_Spread_ID */
  int getA_Asset_Spread_ID();

  /** Set A_Asset_Spread_ID */
  void setA_Asset_Spread_ID(int A_Asset_Spread_ID);

  /** Get Spread Type */
  String getA_Asset_Spread_Type();

  /** Set Spread Type */
  void setA_Asset_Spread_Type(String A_Asset_Spread_Type);

  /** Get A_Asset_Spread_UU */
  String getA_Asset_Spread_UU();

  /** Set A_Asset_Spread_UU */
  void setA_Asset_Spread_UU(String A_Asset_Spread_UU);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Period 1 */
  BigDecimal getA_Period_1();

  /** Set Period 1 */
  void setA_Period_1(BigDecimal A_Period_1);

  /** Get Period 10 */
  BigDecimal getA_Period_10();

  /** Set Period 10 */
  void setA_Period_10(BigDecimal A_Period_10);

  /** Get Period 11 */
  BigDecimal getA_Period_11();

  /** Set Period 11 */
  void setA_Period_11(BigDecimal A_Period_11);

  /** Get Period 12 */
  BigDecimal getA_Period_12();

  /** Set Period 12 */
  void setA_Period_12(BigDecimal A_Period_12);

  /** Get Period 13 */
  BigDecimal getA_Period_13();

  /** Set Period 13 */
  void setA_Period_13(BigDecimal A_Period_13);

  /** Get Period 14 */
  BigDecimal getA_Period_14();

  /** Set Period 14 */
  void setA_Period_14(BigDecimal A_Period_14);

  /** Get Period 2 */
  BigDecimal getA_Period_2();

  /** Set Period 2 */
  void setA_Period_2(BigDecimal A_Period_2);

  /** Get Period 3 */
  BigDecimal getA_Period_3();

  /** Set Period 3 */
  void setA_Period_3(BigDecimal A_Period_3);

  /** Get Period 4 */
  BigDecimal getA_Period_4();

  /** Set Period 4 */
  void setA_Period_4(BigDecimal A_Period_4);

  /** Get Period 5 */
  BigDecimal getA_Period_5();

  /** Set Period 5 */
  void setA_Period_5(BigDecimal A_Period_5);

  /** Get Period 6 */
  BigDecimal getA_Period_6();

  /** Set Period 6 */
  void setA_Period_6(BigDecimal A_Period_6);

  /** Get Period 7 */
  BigDecimal getA_Period_7();

  /** Set Period 7 */
  void setA_Period_7(BigDecimal A_Period_7);

  /** Get Period 8 */
  BigDecimal getA_Period_8();

  /** Set Period 8 */
  void setA_Period_8(BigDecimal A_Period_8);

  /** Get Period 9 */
  BigDecimal getA_Period_9();

  /** Set Period 9 */
  void setA_Period_9(BigDecimal A_Period_9);

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

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
