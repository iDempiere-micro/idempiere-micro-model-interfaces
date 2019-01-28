package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for S_TimeExpenseLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_S_TimeExpenseLine {

  /** TableName=S_TimeExpenseLine */
  String Table_Name = "S_TimeExpenseLine";

  /** AD_Table_ID=488 */
  int Table_ID = 488;

    /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

    /** Column name C_Activity_ID */
  String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_Campaign_ID */
  String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name C_InvoiceLine_ID */
  String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
  /** Column name ConvertedAmt */
  String COLUMNNAME_ConvertedAmt = "ConvertedAmt";
  /** Column name C_OrderLine_ID */
  String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
  /** Column name C_Project_ID */
  String COLUMNNAME_C_Project_ID = "C_Project_ID";
  /** Column name C_ProjectPhase_ID */
  String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";
  /** Column name C_ProjectTask_ID */
  String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";
    /** Column name C_UOM_ID */
  String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
  /** Column name DateExpense */
  String COLUMNNAME_DateExpense = "DateExpense";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name ExpenseAmt */
  String COLUMNNAME_ExpenseAmt = "ExpenseAmt";
  /** Column name InvoicePrice */
  String COLUMNNAME_InvoicePrice = "InvoicePrice";
    /** Column name IsInvoiced */
  String COLUMNNAME_IsInvoiced = "IsInvoiced";
  /** Column name IsTimeReport */
  String COLUMNNAME_IsTimeReport = "IsTimeReport";
  /** Column name Line */
  String COLUMNNAME_Line = "Line";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name Note */
  String COLUMNNAME_Note = "Note";
  /** Column name PriceInvoiced */
  String COLUMNNAME_PriceInvoiced = "PriceInvoiced";
  /** Column name PriceReimbursed */
  String COLUMNNAME_PriceReimbursed = "PriceReimbursed";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Qty */
  String COLUMNNAME_Qty = "Qty";
  /** Column name QtyInvoiced */
  String COLUMNNAME_QtyInvoiced = "QtyInvoiced";
  /** Column name QtyReimbursed */
  String COLUMNNAME_QtyReimbursed = "QtyReimbursed";
  /** Column name S_ResourceAssignment_ID */
  String COLUMNNAME_S_ResourceAssignment_ID = "S_ResourceAssignment_ID";
  /** Column name S_TimeExpense_ID */
  String COLUMNNAME_S_TimeExpense_ID = "S_TimeExpense_ID";
  /** Column name S_TimeExpenseLine_ID */
  String COLUMNNAME_S_TimeExpenseLine_ID = "S_TimeExpenseLine_ID";
  /** Column name S_TimeExpenseLine_UU */
  String COLUMNNAME_S_TimeExpenseLine_UU = "S_TimeExpenseLine_UU";
  /** Column name S_TimeType_ID */
  String COLUMNNAME_S_TimeType_ID = "S_TimeType_ID";

    /** Get Activity. Business Activity */
  int getC_Activity_ID();

    /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

    /** Get Campaign. Marketing Campaign */
  int getC_Campaign_ID();

    /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

    /** Get Invoice Line. Invoice Detail Line */
  int getC_InvoiceLine_ID();

  /** Set Invoice Line. Invoice Detail Line */
  void setC_InvoiceLine_ID(int C_InvoiceLine_ID);

    /** Get Converted Amount. Converted Amount */
  BigDecimal getConvertedAmt();

  /** Set Converted Amount. Converted Amount */
  void setConvertedAmt(BigDecimal ConvertedAmt);

  /** Get Sales Order Line. Sales Order Line */
  int getC_OrderLine_ID();

  /** Set Sales Order Line. Sales Order Line */
  void setC_OrderLine_ID(int C_OrderLine_ID);

    /** Get Project. Financial Project */
  int getC_Project_ID();

    /** Get Project Phase. Phase of a Project */
  int getC_ProjectPhase_ID();

    /** Get Project Task. Actual Project Task in a Phase */
  int getC_ProjectTask_ID();

    /** Get UOM. Unit of Measure */
  int getC_UOM_ID();

    /** Get Expense Date. Date of expense */
  Timestamp getDateExpense();

  /** Set Expense Date. Date of expense */
  void setDateExpense(Timestamp DateExpense);

  /** Get Description. Optional short description of the record */
  String getDescription();

    /** Get Expense Amount. Amount for this expense */
  BigDecimal getExpenseAmt();

  /** Set Expense Amount. Amount for this expense */
  void setExpenseAmt(BigDecimal ExpenseAmt);

  /** Get Invoice Price. Unit price to be invoiced or 0 for default price */
  BigDecimal getInvoicePrice();

  /** Set Invoice Price. Unit price to be invoiced or 0 for default price */
  void setInvoicePrice(BigDecimal InvoicePrice);

    /** Set Invoiced. Is this invoiced? */
  void setIsInvoiced(boolean IsInvoiced);

  /** Get Invoiced. Is this invoiced? */
  boolean isInvoiced();

  /** Set Time Report. Line is a time report only (no expense) */
  void setIsTimeReport(boolean IsTimeReport);

  /** Get Time Report. Line is a time report only (no expense) */
  boolean isTimeReport();

  /** Get Line No. Unique line for this document */
  int getLine();

  /** Set Line No. Unique line for this document */
  void setLine(int Line);

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

    /**
   * Get Price Invoiced. The priced invoiced to the customer (in the currency of the customer's AR
   * price list) - 0 for default price
   */
  BigDecimal getPriceInvoiced();

  /**
   * Set Price Invoiced. The priced invoiced to the customer (in the currency of the customer's AR
   * price list) - 0 for default price
   */
  void setPriceInvoiced(BigDecimal PriceInvoiced);

  /** Get Price Reimbursed. The reimbursed price (in currency of the employee's AP price list) */
  BigDecimal getPriceReimbursed();

  /** Set Price Reimbursed. The reimbursed price (in currency of the employee's AP price list) */
  void setPriceReimbursed(BigDecimal PriceReimbursed);

    /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Quantity. Quantity */
  BigDecimal getQty();

  /** Set Quantity. Quantity */
  void setQty(BigDecimal Qty);

  /** Get Quantity Invoiced. Invoiced Quantity */
  BigDecimal getQtyInvoiced();

  /** Set Quantity Invoiced. Invoiced Quantity */
  void setQtyInvoiced(BigDecimal QtyInvoiced);

  /** Get Quantity Reimbursed. The reimbursed quantity */
  BigDecimal getQtyReimbursed();

  /** Set Quantity Reimbursed. The reimbursed quantity */
  void setQtyReimbursed(BigDecimal QtyReimbursed);

  /** Get Resource Assignment. Resource Assignment */
  int getS_ResourceAssignment_ID();

    /** Get Expense Report. Time and Expense Report */
  int getS_TimeExpense_ID();

    /** Get Expense Line. Time and Expense Report Line */
  int getS_TimeExpenseLine_ID();

    /** Get Time Type. Type of time recorded */
  int getS_TimeType_ID();

}
