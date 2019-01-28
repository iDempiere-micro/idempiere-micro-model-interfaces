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

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

    /** Column name Amt */
  String COLUMNNAME_Amt = "Amt";
  /** Column name C_InvoiceSchedule_ID */
  String COLUMNNAME_C_InvoiceSchedule_ID = "C_InvoiceSchedule_ID";
  /** Column name C_InvoiceSchedule_UU */
  String COLUMNNAME_C_InvoiceSchedule_UU = "C_InvoiceSchedule_UU";
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
    /** Column name IsAmount */
  String COLUMNNAME_IsAmount = "IsAmount";
  /** Column name IsDefault */
  String COLUMNNAME_IsDefault = "IsDefault";

    /** Get Amount. Amount */
  BigDecimal getAmt();

    /** Get Invoice Day. Day of Invoice Generation */
  int getInvoiceDay();

    /** Get Invoice day cut-off. Last day for including shipments */
  int getInvoiceDayCutoff();

    /** Get Invoice Frequency. How often invoices will be generated */
  String getInvoiceFrequency();

    /** Get Invoice Week Day. Day to generate invoices */
  String getInvoiceWeekDay();

    /** Get Invoice weekday cutoff. Last day in the week for shipments to be included */
  String getInvoiceWeekDayCutoff();

    /** Get Amount Limit. Send invoices only if the amount exceeds the limit */
  boolean isAmount();

    /** Get Name. Alphanumeric identifier of the entity */
  String getName();

}
