package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_InvoiceSchedule
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_InvoiceSchedule {

  /** TableName=C_InvoiceSchedule */
  String Table_Name = "C_InvoiceSchedule";

  /** AD_Table_ID=257 */
  int Table_ID = 257;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Amt */
  String COLUMNNAME_Amt = "Amt";
  /** Column name C_InvoiceSchedule_ID */
  String COLUMNNAME_C_InvoiceSchedule_ID = "C_InvoiceSchedule_ID";
  /** Column name C_InvoiceSchedule_UU */
  String COLUMNNAME_C_InvoiceSchedule_UU = "C_InvoiceSchedule_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EvenInvoiceWeek */
  String COLUMNNAME_EvenInvoiceWeek = "EvenInvoiceWeek";
  /** Column name InvoiceDay */
  String COLUMNNAME_InvoiceDay = "InvoiceDay";
  /** Column name InvoiceDayCutoff */
  String COLUMNNAME_InvoiceDayCutoff = "InvoiceDayCutoff";
  /** Column name InvoiceFrequency */
  String COLUMNNAME_InvoiceFrequency = "InvoiceFrequency";
  /** Column name InvoiceWeekDay */
  String COLUMNNAME_InvoiceWeekDay = "InvoiceWeekDay";
  /** Column name InvoiceWeekDayCutoff */
  String COLUMNNAME_InvoiceWeekDayCutoff = "InvoiceWeekDayCutoff";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsAmount */
  String COLUMNNAME_IsAmount = "IsAmount";
  /** Column name IsDefault */
  String COLUMNNAME_IsDefault = "IsDefault";
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

  /** Get Invoice Schedule. Schedule for generating Invoices */
  int getC_InvoiceSchedule_ID();

  /** Set Invoice Schedule. Schedule for generating Invoices */
  void setC_InvoiceSchedule_ID(int C_InvoiceSchedule_ID);

  /** Get C_InvoiceSchedule_UU */
  String getC_InvoiceSchedule_UU();

  /** Set C_InvoiceSchedule_UU */
  void setC_InvoiceSchedule_UU(String C_InvoiceSchedule_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Invoice on even weeks. Send invoices on even weeks */
  boolean isEvenInvoiceWeek();

  /** Set Invoice on even weeks. Send invoices on even weeks */
  void setEvenInvoiceWeek(boolean EvenInvoiceWeek);

  /** Get Invoice Day. Day of Invoice Generation */
  int getInvoiceDay();

  /** Set Invoice Day. Day of Invoice Generation */
  void setInvoiceDay(int InvoiceDay);

  /** Get Invoice day cut-off. Last day for including shipments */
  int getInvoiceDayCutoff();

  /** Set Invoice day cut-off. Last day for including shipments */
  void setInvoiceDayCutoff(int InvoiceDayCutoff);

  /** Get Invoice Frequency. How often invoices will be generated */
  String getInvoiceFrequency();

  /** Set Invoice Frequency. How often invoices will be generated */
  void setInvoiceFrequency(String InvoiceFrequency);

  /** Get Invoice Week Day. Day to generate invoices */
  String getInvoiceWeekDay();

  /** Set Invoice Week Day. Day to generate invoices */
  void setInvoiceWeekDay(String InvoiceWeekDay);

  /** Get Invoice weekday cutoff. Last day in the week for shipments to be included */
  String getInvoiceWeekDayCutoff();

  /** Set Invoice weekday cutoff. Last day in the week for shipments to be included */
  void setInvoiceWeekDayCutoff(String InvoiceWeekDayCutoff);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Amount Limit. Send invoices only if the amount exceeds the limit */
  void setIsAmount(boolean IsAmount);

  /** Get Amount Limit. Send invoices only if the amount exceeds the limit */
  boolean isAmount();

  /** Set Default. Default value */
  void setIsDefault(boolean IsDefault);

  /** Get Default. Default value */
  boolean isDefault();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
