package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_OrderLandedCostAllocation
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_OrderLandedCostAllocation {

  /** TableName=C_OrderLandedCostAllocation */
  String Table_Name = "C_OrderLandedCostAllocation";

  /** AD_Table_ID=200104 */
  int Table_ID = 200104;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Amt */
  String COLUMNNAME_Amt = "Amt";
  /** Column name Base */
  String COLUMNNAME_Base = "Base";
  /** Column name C_OrderLandedCostAllocation_ID */
  String COLUMNNAME_C_OrderLandedCostAllocation_ID = "C_OrderLandedCostAllocation_ID";
  /** Column name C_OrderLandedCostAllocation_UU */
  String COLUMNNAME_C_OrderLandedCostAllocation_UU = "C_OrderLandedCostAllocation_UU";
  /** Column name C_OrderLandedCost_ID */
  String COLUMNNAME_C_OrderLandedCost_ID = "C_OrderLandedCost_ID";
  /** Column name C_OrderLine_ID */
  String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Qty */
  String COLUMNNAME_Qty = "Qty";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Amount. Amount */
  BigDecimal getAmt();

  /** Set Amount. Amount */
  void setAmt(BigDecimal Amt);

  /** Get Base. Calculation Base */
  BigDecimal getBase();

  /** Set Base. Calculation Base */
  void setBase(BigDecimal Base);

  /** Get Estimated Landed Cost Allocation */
  int getC_OrderLandedCostAllocation_ID();

  /** Set Estimated Landed Cost Allocation */
  void setC_OrderLandedCostAllocation_ID(int C_OrderLandedCostAllocation_ID);

  /** Get C_OrderLandedCostAllocation_UU */
  String getC_OrderLandedCostAllocation_UU();

  /** Set C_OrderLandedCostAllocation_UU */
  void setC_OrderLandedCostAllocation_UU(String C_OrderLandedCostAllocation_UU);

  /** Get Estimated Landed Cost */
  int getC_OrderLandedCost_ID();

  /** Set Estimated Landed Cost */
  void setC_OrderLandedCost_ID(int C_OrderLandedCost_ID);

  I_C_OrderLandedCost getC_OrderLandedCost() throws RuntimeException;

  /** Get Sales Order Line. Sales Order Line */
  int getC_OrderLine_ID();

  /** Set Sales Order Line. Sales Order Line */
  void setC_OrderLine_ID(int C_OrderLine_ID);

  I_C_OrderLine getC_OrderLine() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Quantity. Quantity */
  BigDecimal getQty();

  /** Set Quantity. Quantity */
  void setQty(BigDecimal Qty);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
