package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_ChargeType_DocType
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_ChargeType_DocType {

  /** TableName=C_ChargeType_DocType */
  String Table_Name = "C_ChargeType_DocType";

  /** AD_Table_ID=53146 */
  int Table_ID = 53146;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_ChargeType_DocType_UU */
  String COLUMNNAME_C_ChargeType_DocType_UU = "C_ChargeType_DocType_UU";
  /** Column name C_ChargeType_ID */
  String COLUMNNAME_C_ChargeType_ID = "C_ChargeType_ID";
  /** Column name C_DocType_ID */
  String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsAllowNegative */
  String COLUMNNAME_IsAllowNegative = "IsAllowNegative";
  /** Column name IsAllowPositive */
  String COLUMNNAME_IsAllowPositive = "IsAllowPositive";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get C_ChargeType_DocType_UU */
  String getC_ChargeType_DocType_UU();

  /** Set C_ChargeType_DocType_UU */
  void setC_ChargeType_DocType_UU(String C_ChargeType_DocType_UU);

  /** Get Charge Type */
  int getC_ChargeType_ID();

  /** Set Charge Type */
  void setC_ChargeType_ID(int C_ChargeType_ID);

  I_C_ChargeType getC_ChargeType() throws RuntimeException;

  /** Get Document Type. Document type or rules */
  int getC_DocType_ID();

  /** Set Document Type. Document type or rules */
  void setC_DocType_ID(int C_DocType_ID);

  I_C_DocType getC_DocType() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Allow Negative */
  void setIsAllowNegative(boolean IsAllowNegative);

  /** Get Allow Negative */
  boolean isAllowNegative();

  /** Set Allow Positive */
  void setIsAllowPositive(boolean IsAllowPositive);

  /** Get Allow Positive */
  boolean isAllowPositive();

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
