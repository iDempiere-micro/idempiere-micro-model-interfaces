package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_CommissionDetail
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_CommissionDetail {

  /** TableName=C_CommissionDetail */
  String Table_Name = "C_CommissionDetail";

  /** AD_Table_ID=437 */
  int Table_ID = 437;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name ActualAmt */
  String COLUMNNAME_ActualAmt = "ActualAmt";
  /** Column name ActualQty */
  String COLUMNNAME_ActualQty = "ActualQty";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_CommissionAmt_ID */
  String COLUMNNAME_C_CommissionAmt_ID = "C_CommissionAmt_ID";
  /** Column name C_CommissionDetail_ID */
  String COLUMNNAME_C_CommissionDetail_ID = "C_CommissionDetail_ID";
  /** Column name C_CommissionDetail_UU */
  String COLUMNNAME_C_CommissionDetail_UU = "C_CommissionDetail_UU";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name C_InvoiceLine_ID */
  String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
  /** Column name ConvertedAmt */
  String COLUMNNAME_ConvertedAmt = "ConvertedAmt";
  /** Column name C_OrderLine_ID */
  String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Info */
  String COLUMNNAME_Info = "Info";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Reference */
  String COLUMNNAME_Reference = "Reference";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Actual Amount. The actual amount */
  BigDecimal getActualAmt();

  /** Set Actual Amount. The actual amount */
  void setActualAmt(BigDecimal ActualAmt);

  /** Get Actual Quantity. The actual quantity */
  BigDecimal getActualQty();

  /** Set Actual Quantity. The actual quantity */
  void setActualQty(BigDecimal ActualQty);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Commission Amount. Generated Commission Amount */
  int getC_CommissionAmt_ID();

  /** Set Commission Amount. Generated Commission Amount */
  void setC_CommissionAmt_ID(int C_CommissionAmt_ID);

  I_C_CommissionAmt getC_CommissionAmt() throws RuntimeException;

  /** Get Commission Detail. Supporting information for Commission Amounts */
  int getC_CommissionDetail_ID();

  /** Set Commission Detail. Supporting information for Commission Amounts */
  void setC_CommissionDetail_ID(int C_CommissionDetail_ID);

  /** Get C_CommissionDetail_UU */
  String getC_CommissionDetail_UU();

  /** Set C_CommissionDetail_UU */
  void setC_CommissionDetail_UU(String C_CommissionDetail_UU);

  /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

  /** Set Currency. The Currency for this record */
  void setC_Currency_ID(int C_Currency_ID);

  I_C_Currency getC_Currency() throws RuntimeException;

  /** Get Invoice Line. Invoice Detail Line */
  int getC_InvoiceLine_ID();

  /** Set Invoice Line. Invoice Detail Line */
  void setC_InvoiceLine_ID(int C_InvoiceLine_ID);

  I_C_InvoiceLine getC_InvoiceLine() throws RuntimeException;

  /** Get Converted Amount. Converted Amount */
  BigDecimal getConvertedAmt();

  /** Set Converted Amount. Converted Amount */
  void setConvertedAmt(BigDecimal ConvertedAmt);

  /** Get Sales Order Line. Sales Order Line */
  int getC_OrderLine_ID();

  /** Set Sales Order Line. Sales Order Line */
  void setC_OrderLine_ID(int C_OrderLine_ID);

  I_C_OrderLine getC_OrderLine() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Info. Information */
  String getInfo();

  /** Set Info. Information */
  void setInfo(String Info);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Reference. Reference for this record */
  String getReference();

  /** Set Reference. Reference for this record */
  void setReference(String Reference);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
