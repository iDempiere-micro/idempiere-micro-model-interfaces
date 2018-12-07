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

    /**
     * TableName=S_TimeExpenseLine
     */
    String Table_Name = "S_TimeExpenseLine";

    /**
     * AD_Table_ID=488
     */
    int Table_ID = 488;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_Activity_ID
     */
    String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_Campaign_ID
     */
    String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name C_InvoiceLine_ID
     */
    String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";
    /**
     * Column name ConvertedAmt
     */
    String COLUMNNAME_ConvertedAmt = "ConvertedAmt";
    /**
     * Column name C_OrderLine_ID
     */
    String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name C_ProjectPhase_ID
     */
    String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";
    /**
     * Column name C_ProjectTask_ID
     */
    String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_UOM_ID
     */
    String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
    /**
     * Column name DateExpense
     */
    String COLUMNNAME_DateExpense = "DateExpense";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name ExpenseAmt
     */
    String COLUMNNAME_ExpenseAmt = "ExpenseAmt";
    /**
     * Column name InvoicePrice
     */
    String COLUMNNAME_InvoicePrice = "InvoicePrice";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsInvoiced
     */
    String COLUMNNAME_IsInvoiced = "IsInvoiced";
    /**
     * Column name IsTimeReport
     */
    String COLUMNNAME_IsTimeReport = "IsTimeReport";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name Note
     */
    String COLUMNNAME_Note = "Note";
    /**
     * Column name PriceInvoiced
     */
    String COLUMNNAME_PriceInvoiced = "PriceInvoiced";
    /**
     * Column name PriceReimbursed
     */
    String COLUMNNAME_PriceReimbursed = "PriceReimbursed";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";
    /**
     * Column name QtyInvoiced
     */
    String COLUMNNAME_QtyInvoiced = "QtyInvoiced";
    /**
     * Column name QtyReimbursed
     */
    String COLUMNNAME_QtyReimbursed = "QtyReimbursed";
    /**
     * Column name S_ResourceAssignment_ID
     */
    String COLUMNNAME_S_ResourceAssignment_ID = "S_ResourceAssignment_ID";
    /**
     * Column name S_TimeExpense_ID
     */
    String COLUMNNAME_S_TimeExpense_ID = "S_TimeExpense_ID";
    /**
     * Column name S_TimeExpenseLine_ID
     */
    String COLUMNNAME_S_TimeExpenseLine_ID = "S_TimeExpenseLine_ID";
    /**
     * Column name S_TimeExpenseLine_UU
     */
    String COLUMNNAME_S_TimeExpenseLine_UU = "S_TimeExpenseLine_UU";
    /**
     * Column name S_TimeType_ID
     */
    String COLUMNNAME_S_TimeType_ID = "S_TimeType_ID";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Activity. Business Activity
     */
    int getC_Activity_ID();

    /**
     * Set Activity. Business Activity
     */
    void setC_Activity_ID(int C_Activity_ID);

    I_C_Activity getC_Activity() throws RuntimeException;

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setC_BPartner_ID(int C_BPartner_ID);

    I_C_BPartner getC_BPartner() throws RuntimeException;

    /**
     * Get Campaign. Marketing Campaign
     */
    int getC_Campaign_ID();

    /**
     * Set Campaign. Marketing Campaign
     */
    void setC_Campaign_ID(int C_Campaign_ID);

    I_C_Campaign getC_Campaign() throws RuntimeException;

    /**
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

    /**
     * Set Currency. The Currency for this record
     */
    void setC_Currency_ID(int C_Currency_ID);

    I_C_Currency getC_Currency() throws RuntimeException;

    /**
     * Get Invoice Line. Invoice Detail Line
     */
    int getC_InvoiceLine_ID();

    /**
     * Set Invoice Line. Invoice Detail Line
     */
    void setC_InvoiceLine_ID(int C_InvoiceLine_ID);

    I_C_InvoiceLine getC_InvoiceLine() throws RuntimeException;

    /**
     * Get Converted Amount. Converted Amount
     */
    BigDecimal getConvertedAmt();

    /**
     * Set Converted Amount. Converted Amount
     */
    void setConvertedAmt(BigDecimal ConvertedAmt);

    /**
     * Get Sales Order Line. Sales Order Line
     */
    int getC_OrderLine_ID();

    /**
     * Set Sales Order Line. Sales Order Line
     */
    void setC_OrderLine_ID(int C_OrderLine_ID);

    I_C_OrderLine getC_OrderLine() throws RuntimeException;

    /**
     * Get Project. Financial Project
     */
    int getC_Project_ID();

    /**
     * Set Project. Financial Project
     */
    void setC_Project_ID(int C_Project_ID);

    I_C_Project getC_Project() throws RuntimeException;

    /**
     * Get Project Phase. Phase of a Project
     */
    int getC_ProjectPhase_ID();

    /**
     * Set Project Phase. Phase of a Project
     */
    void setC_ProjectPhase_ID(int C_ProjectPhase_ID);

    I_C_ProjectPhase getC_ProjectPhase() throws RuntimeException;

    /**
     * Get Project Task. Actual Project Task in a Phase
     */
    int getC_ProjectTask_ID();

    /**
     * Set Project Task. Actual Project Task in a Phase
     */
    void setC_ProjectTask_ID(int C_ProjectTask_ID);

    I_C_ProjectTask getC_ProjectTask() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get UOM. Unit of Measure
     */
    int getC_UOM_ID();

    /**
     * Set UOM. Unit of Measure
     */
    void setC_UOM_ID(int C_UOM_ID);

    I_C_UOM getC_UOM() throws RuntimeException;

    /**
     * Get Expense Date. Date of expense
     */
    Timestamp getDateExpense();

    /**
     * Set Expense Date. Date of expense
     */
    void setDateExpense(Timestamp DateExpense);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Expense Amount. Amount for this expense
     */
    BigDecimal getExpenseAmt();

    /**
     * Set Expense Amount. Amount for this expense
     */
    void setExpenseAmt(BigDecimal ExpenseAmt);

    /**
     * Get Invoice Price. Unit price to be invoiced or 0 for default price
     */
    BigDecimal getInvoicePrice();

    /**
     * Set Invoice Price. Unit price to be invoiced or 0 for default price
     */
    void setInvoicePrice(BigDecimal InvoicePrice);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Invoiced. Is this invoiced?
     */
    void setIsInvoiced(boolean IsInvoiced);

    /**
     * Get Invoiced. Is this invoiced?
     */
    boolean isInvoiced();

    /**
     * Set Time Report. Line is a time report only (no expense)
     */
    void setIsTimeReport(boolean IsTimeReport);

    /**
     * Get Time Report. Line is a time report only (no expense)
     */
    boolean isTimeReport();

    /**
     * Get Line No. Unique line for this document
     */
    int getLine();

    /**
     * Set Line No. Unique line for this document
     */
    void setLine(int Line);

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    void setM_Product_ID(int M_Product_ID);

    I_M_Product getM_Product() throws RuntimeException;

    /**
     * Get Note. Optional additional user defined information
     */
    String getNote();

    /**
     * Set Note. Optional additional user defined information
     */
    void setNote(String Note);

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

    /**
     * Get Price Reimbursed. The reimbursed price (in currency of the employee's AP price list)
     */
    BigDecimal getPriceReimbursed();

    /**
     * Set Price Reimbursed. The reimbursed price (in currency of the employee's AP price list)
     */
    void setPriceReimbursed(BigDecimal PriceReimbursed);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Quantity. Quantity
     */
    BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    void setQty(BigDecimal Qty);

    /**
     * Get Quantity Invoiced. Invoiced Quantity
     */
    BigDecimal getQtyInvoiced();

    /**
     * Set Quantity Invoiced. Invoiced Quantity
     */
    void setQtyInvoiced(BigDecimal QtyInvoiced);

    /**
     * Get Quantity Reimbursed. The reimbursed quantity
     */
    BigDecimal getQtyReimbursed();

    /**
     * Set Quantity Reimbursed. The reimbursed quantity
     */
    void setQtyReimbursed(BigDecimal QtyReimbursed);

    /**
     * Get Resource Assignment. Resource Assignment
     */
    int getS_ResourceAssignment_ID();

    /**
     * Set Resource Assignment. Resource Assignment
     */
    void setS_ResourceAssignment_ID(int S_ResourceAssignment_ID);

    /**
     * Get Expense Report. Time and Expense Report
     */
    int getS_TimeExpense_ID();

    /**
     * Set Expense Report. Time and Expense Report
     */
    void setS_TimeExpense_ID(int S_TimeExpense_ID);

    I_S_TimeExpense getS_TimeExpense() throws RuntimeException;

    /**
     * Get Expense Line. Time and Expense Report Line
     */
    int getS_TimeExpenseLine_ID();

    /**
     * Set Expense Line. Time and Expense Report Line
     */
    void setS_TimeExpenseLine_ID(int S_TimeExpenseLine_ID);

    /**
     * Get S_TimeExpenseLine_UU
     */
    String getS_TimeExpenseLine_UU();

    /**
     * Set S_TimeExpenseLine_UU
     */
    void setS_TimeExpenseLine_UU(String S_TimeExpenseLine_UU);

    /**
     * Get Time Type. Type of time recorded
     */
    int getS_TimeType_ID();

    /**
     * Set Time Type. Type of time recorded
     */
    void setS_TimeType_ID(int S_TimeType_ID);

    I_S_TimeType getS_TimeType() throws RuntimeException;

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
