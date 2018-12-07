package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_DunningLevel
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_DunningLevel {

    /**
     * TableName=C_DunningLevel
     */
    String Table_Name = "C_DunningLevel";

    /**
     * AD_Table_ID=331
     */
    int Table_ID = 331;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name C_Dunning_ID
     */
    String COLUMNNAME_C_Dunning_ID = "C_Dunning_ID";
    /**
     * Column name C_DunningLevel_ID
     */
    String COLUMNNAME_C_DunningLevel_ID = "C_DunningLevel_ID";
    /**
     * Column name C_DunningLevel_UU
     */
    String COLUMNNAME_C_DunningLevel_UU = "C_DunningLevel_UU";
    /**
     * Column name ChargeFee
     */
    String COLUMNNAME_ChargeFee = "ChargeFee";
    /**
     * Column name ChargeInterest
     */
    String COLUMNNAME_ChargeInterest = "ChargeInterest";
    /**
     * Column name C_PaymentTerm_ID
     */
    String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DaysAfterDue
     */
    String COLUMNNAME_DaysAfterDue = "DaysAfterDue";
    /**
     * Column name DaysBetweenDunning
     */
    String COLUMNNAME_DaysBetweenDunning = "DaysBetweenDunning";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Dunning_PrintFormat_ID
     */
    String COLUMNNAME_Dunning_PrintFormat_ID = "Dunning_PrintFormat_ID";
    /**
     * Column name FeeAmt
     */
    String COLUMNNAME_FeeAmt = "FeeAmt";
    /**
     * Column name InterestPercent
     */
    String COLUMNNAME_InterestPercent = "InterestPercent";
    /**
     * Column name InvoiceCollectionType
     */
    String COLUMNNAME_InvoiceCollectionType = "InvoiceCollectionType";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsSetCreditStop
     */
    String COLUMNNAME_IsSetCreditStop = "IsSetCreditStop";
    /**
     * Column name IsSetPaymentTerm
     */
    String COLUMNNAME_IsSetPaymentTerm = "IsSetPaymentTerm";
    /**
     * Column name IsShowAllDue
     */
    String COLUMNNAME_IsShowAllDue = "IsShowAllDue";
    /**
     * Column name IsShowNotDue
     */
    String COLUMNNAME_IsShowNotDue = "IsShowNotDue";
    /**
     * Column name IsStatement
     */
    String COLUMNNAME_IsStatement = "IsStatement";
    /**
     * Column name Note
     */
    String COLUMNNAME_Note = "Note";
    /**
     * Column name PrintName
     */
    String COLUMNNAME_PrintName = "PrintName";
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
     * Get Dunning. Dunning Rules for overdue invoices
     */
    int getC_Dunning_ID();

    /**
     * Set Dunning. Dunning Rules for overdue invoices
     */
    void setC_Dunning_ID(int C_Dunning_ID);

    I_C_Dunning getC_Dunning() throws RuntimeException;

    /**
     * Get Dunning Level
     */
    int getC_DunningLevel_ID();

    /**
     * Set Dunning Level
     */
    void setC_DunningLevel_ID(int C_DunningLevel_ID);

    /**
     * Get C_DunningLevel_UU
     */
    String getC_DunningLevel_UU();

    /**
     * Set C_DunningLevel_UU
     */
    void setC_DunningLevel_UU(String C_DunningLevel_UU);

    /**
     * Get Charge fee. Indicates if fees will be charged for overdue invoices
     */
    boolean isChargeFee();

    /**
     * Set Charge fee. Indicates if fees will be charged for overdue invoices
     */
    void setChargeFee(boolean ChargeFee);

    /**
     * Get Charge Interest. Indicates if interest will be charged on overdue invoices
     */
    boolean isChargeInterest();

    /**
     * Set Charge Interest. Indicates if interest will be charged on overdue invoices
     */
    void setChargeInterest(boolean ChargeInterest);

    /**
     * Get Payment Term. The terms of Payment (timing, discount)
     */
    int getC_PaymentTerm_ID();

    /**
     * Set Payment Term. The terms of Payment (timing, discount)
     */
    void setC_PaymentTerm_ID(int C_PaymentTerm_ID);

    I_C_PaymentTerm getC_PaymentTerm() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Days after due date. Days after due date to dun (if negative days until due)
     */
    BigDecimal getDaysAfterDue();

    /**
     * Set Days after due date. Days after due date to dun (if negative days until due)
     */
    void setDaysAfterDue(BigDecimal DaysAfterDue);

    /**
     * Get Days between dunning. Days between sending dunning notices
     */
    int getDaysBetweenDunning();

    /**
     * Set Days between dunning. Days between sending dunning notices
     */
    void setDaysBetweenDunning(int DaysBetweenDunning);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Dunning Print Format. Print Format for printing Dunning Letters
     */
    int getDunning_PrintFormat_ID();

    /**
     * Set Dunning Print Format. Print Format for printing Dunning Letters
     */
    void setDunning_PrintFormat_ID(int Dunning_PrintFormat_ID);

    I_AD_PrintFormat getDunning_PrintFormat() throws RuntimeException;

    /**
     * Get Fee Amount. Fee amount in invoice currency
     */
    BigDecimal getFeeAmt();

    /**
     * Set Fee Amount. Fee amount in invoice currency
     */
    void setFeeAmt(BigDecimal FeeAmt);

    /**
     * Get Interest in percent. Percentage interest to charge on overdue invoices
     */
    BigDecimal getInterestPercent();

    /**
     * Set Interest in percent. Percentage interest to charge on overdue invoices
     */
    void setInterestPercent(BigDecimal InterestPercent);

    /**
     * Get Collection Status. Invoice Collection Status
     */
    String getInvoiceCollectionType();

    /**
     * Set Collection Status. Invoice Collection Status
     */
    void setInvoiceCollectionType(String InvoiceCollectionType);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Credit Stop. Set the business partner to credit stop
     */
    void setIsSetCreditStop(boolean IsSetCreditStop);

    /**
     * Get Credit Stop. Set the business partner to credit stop
     */
    boolean isSetCreditStop();

    /**
     * Set Set Payment Term. Set the payment term of the Business Partner
     */
    void setIsSetPaymentTerm(boolean IsSetPaymentTerm);

    /**
     * Get Set Payment Term. Set the payment term of the Business Partner
     */
    boolean isSetPaymentTerm();

    /**
     * Set Show All Due. Show/print all due invoices
     */
    void setIsShowAllDue(boolean IsShowAllDue);

    /**
     * Get Show All Due. Show/print all due invoices
     */
    boolean isShowAllDue();

    /**
     * Set Show Not Due. Show/print all invoices which are not due (yet).
     */
    void setIsShowNotDue(boolean IsShowNotDue);

    /**
     * Get Show Not Due. Show/print all invoices which are not due (yet).
     */
    boolean isShowNotDue();

    /**
     * Set Is Statement. Dunning Level is a definition of a statement
     */
    void setIsStatement(boolean IsStatement);

    /**
     * Get Is Statement. Dunning Level is a definition of a statement
     */
    boolean isStatement();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Note. Optional additional user defined information
     */
    String getNote();

    /**
     * Set Note. Optional additional user defined information
     */
    void setNote(String Note);

    /**
     * Get Print Text. The label text to be printed on a document or correspondence.
     */
    String getPrintName();

    /**
     * Set Print Text. The label text to be printed on a document or correspondence.
     */
    void setPrintName(String PrintName);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
