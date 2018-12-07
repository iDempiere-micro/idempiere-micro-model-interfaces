package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_DunningRunLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_DunningRunLine {

  /** TableName=C_DunningRunLine */
  String Table_Name = "C_DunningRunLine";

  /** AD_Table_ID=524 */
  int Table_ID = 524;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Amt */
  String COLUMNNAME_Amt = "Amt";
  /** Column name C_DunningRunEntry_ID */
  String COLUMNNAME_C_DunningRunEntry_ID = "C_DunningRunEntry_ID";
  /** Column name C_DunningRunLine_ID */
  String COLUMNNAME_C_DunningRunLine_ID = "C_DunningRunLine_ID";
  /** Column name C_DunningRunLine_UU */
  String COLUMNNAME_C_DunningRunLine_UU = "C_DunningRunLine_UU";
  /** Column name C_Invoice_ID */
  String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
  /** Column name C_InvoicePaySchedule_ID */
  String COLUMNNAME_C_InvoicePaySchedule_ID = "C_InvoicePaySchedule_ID";
  /** Column name ConvertedAmt */
  String COLUMNNAME_ConvertedAmt = "ConvertedAmt";
  /** Column name C_Payment_ID */
  String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DaysDue */
  String COLUMNNAME_DaysDue = "DaysDue";
  /** Column name FeeAmt */
  String COLUMNNAME_FeeAmt = "FeeAmt";
  /** Column name InterestAmt */
  String COLUMNNAME_InterestAmt = "InterestAmt";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsInDispute */
  String COLUMNNAME_IsInDispute = "IsInDispute";
  /** Column name OpenAmt */
  String COLUMNNAME_OpenAmt = "OpenAmt";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name TimesDunned */
  String COLUMNNAME_TimesDunned = "TimesDunned";
  /** Column name TotalAmt */
  String COLUMNNAME_TotalAmt = "TotalAmt";
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

  /** Get Dunning Run Entry. Dunning Run Entry */
  int getC_DunningRunEntry_ID();

  /** Set Dunning Run Entry. Dunning Run Entry */
  void setC_DunningRunEntry_ID(int C_DunningRunEntry_ID);

  I_C_DunningRunEntry getC_DunningRunEntry() throws RuntimeException;

  /** Get Dunning Run Line. Dunning Run Line */
  int getC_DunningRunLine_ID();

  /** Set Dunning Run Line. Dunning Run Line */
  void setC_DunningRunLine_ID(int C_DunningRunLine_ID);

  /** Get C_DunningRunLine_UU */
  String getC_DunningRunLine_UU();

  /** Set C_DunningRunLine_UU */
  void setC_DunningRunLine_UU(String C_DunningRunLine_UU);

  /** Get Invoice. Invoice Identifier */
  int getC_Invoice_ID();

  /** Set Invoice. Invoice Identifier */
  void setC_Invoice_ID(int C_Invoice_ID);

  I_C_Invoice getC_Invoice() throws RuntimeException;

  /** Get Invoice Payment Schedule. Invoice Payment Schedule */
  int getC_InvoicePaySchedule_ID();

  /** Set Invoice Payment Schedule. Invoice Payment Schedule */
  void setC_InvoicePaySchedule_ID(int C_InvoicePaySchedule_ID);

  I_C_InvoicePaySchedule getC_InvoicePaySchedule() throws RuntimeException;

  /** Get Converted Amount. Converted Amount */
  BigDecimal getConvertedAmt();

  /** Set Converted Amount. Converted Amount */
  void setConvertedAmt(BigDecimal ConvertedAmt);

  /** Get Payment. Payment identifier */
  int getC_Payment_ID();

  /** Set Payment. Payment identifier */
  void setC_Payment_ID(int C_Payment_ID);

  I_C_Payment getC_Payment() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Days due. Number of days due (negative: due in number of days) */
  int getDaysDue();

  /** Set Days due. Number of days due (negative: due in number of days) */
  void setDaysDue(int DaysDue);

  /** Get Fee Amount. Fee amount in invoice currency */
  BigDecimal getFeeAmt();

  /** Set Fee Amount. Fee amount in invoice currency */
  void setFeeAmt(BigDecimal FeeAmt);

  /** Get Interest Amount. Interest Amount */
  BigDecimal getInterestAmt();

  /** Set Interest Amount. Interest Amount */
  void setInterestAmt(BigDecimal InterestAmt);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set In Dispute. Document is in dispute */
  void setIsInDispute(boolean IsInDispute);

  /** Get In Dispute. Document is in dispute */
  boolean isInDispute();

  /** Get Open Amount. Open item amount */
  BigDecimal getOpenAmt();

  /** Set Open Amount. Open item amount */
  void setOpenAmt(BigDecimal OpenAmt);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Times Dunned. Number of times dunned previously */
  int getTimesDunned();

  /** Set Times Dunned. Number of times dunned previously */
  void setTimesDunned(int TimesDunned);

  /** Get Total Amount. Total Amount */
  BigDecimal getTotalAmt();

  /** Set Total Amount. Total Amount */
  void setTotalAmt(BigDecimal TotalAmt);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
