package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;
import org.idempiere.icommon.model.IPO;

/**
 * Generated Interface for C_PaymentTerm
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_PaymentTerm extends IPO {

    /**
     * TableName=C_PaymentTerm
     */
    String Table_Name = "C_PaymentTerm";

    /**
     * AD_Table_ID=113
     */
    int Table_ID = 113;

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
     * Column name AfterDelivery
     */
    String COLUMNNAME_AfterDelivery = "AfterDelivery";
    /**
     * Column name C_PaymentTerm_ID
     */
    String COLUMNNAME_C_PaymentTerm_ID = "C_PaymentTerm_ID";
    /**
     * Column name C_PaymentTerm_UU
     */
    String COLUMNNAME_C_PaymentTerm_UU = "C_PaymentTerm_UU";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Discount
     */
    String COLUMNNAME_Discount = "Discount";
    /**
     * Column name Discount2
     */
    String COLUMNNAME_Discount2 = "Discount2";
    /**
     * Column name DiscountDays
     */
    String COLUMNNAME_DiscountDays = "DiscountDays";
    /**
     * Column name DiscountDays2
     */
    String COLUMNNAME_DiscountDays2 = "DiscountDays2";
    /**
     * Column name DocumentNote
     */
    String COLUMNNAME_DocumentNote = "DocumentNote";
    /**
     * Column name FixMonthCutoff
     */
    String COLUMNNAME_FixMonthCutoff = "FixMonthCutoff";
    /**
     * Column name FixMonthDay
     */
    String COLUMNNAME_FixMonthDay = "FixMonthDay";
    /**
     * Column name FixMonthOffset
     */
    String COLUMNNAME_FixMonthOffset = "FixMonthOffset";
    /**
     * Column name GraceDays
     */
    String COLUMNNAME_GraceDays = "GraceDays";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name IsDueFixed
     */
    String COLUMNNAME_IsDueFixed = "IsDueFixed";
    /**
     * Column name IsNextBusinessDay
     */
    String COLUMNNAME_IsNextBusinessDay = "IsNextBusinessDay";
    /**
     * Column name IsValid
     */
    String COLUMNNAME_IsValid = "IsValid";
    /**
     * Column name NetDay
     */
    String COLUMNNAME_NetDay = "NetDay";
    /**
     * Column name NetDays
     */
    String COLUMNNAME_NetDays = "NetDays";
    /**
     * Column name PaymentTermUsage
     */
    String COLUMNNAME_PaymentTermUsage = "PaymentTermUsage";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get After Delivery. Due after delivery rather than after invoicing
     */
    boolean isAfterDelivery();

    /**
     * Set After Delivery. Due after delivery rather than after invoicing
     */
    void setAfterDelivery(boolean AfterDelivery);

    /**
     * Get Payment Term. The terms of Payment (timing, discount)
     */
    int getC_PaymentTerm_ID();

    /**
     * Set Payment Term. The terms of Payment (timing, discount)
     */
    void setC_PaymentTerm_ID(int C_PaymentTerm_ID);

    /**
     * Get C_PaymentTerm_UU
     */
    String getC_PaymentTerm_UU();

    /**
     * Set C_PaymentTerm_UU
     */
    void setC_PaymentTerm_UU(String C_PaymentTerm_UU);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Discount %. Discount in percent
     */
    BigDecimal getDiscount();

    /**
     * Set Discount %. Discount in percent
     */
    void setDiscount(BigDecimal Discount);

    /**
     * Get Discount 2 %. Discount in percent
     */
    BigDecimal getDiscount2();

    /**
     * Set Discount 2 %. Discount in percent
     */
    void setDiscount2(BigDecimal Discount2);

    /**
     * Get Discount Days. Number of days from invoice date to be eligible for discount
     */
    int getDiscountDays();

    /**
     * Set Discount Days. Number of days from invoice date to be eligible for discount
     */
    void setDiscountDays(int DiscountDays);

    /**
     * Get Discount Days 2. Number of days from invoice date to be eligible for discount
     */
    int getDiscountDays2();

    /**
     * Set Discount Days 2. Number of days from invoice date to be eligible for discount
     */
    void setDiscountDays2(int DiscountDays2);

    /**
     * Get Document Note. Additional information for a Document
     */
    String getDocumentNote();

    /**
     * Set Document Note. Additional information for a Document
     */
    void setDocumentNote(String DocumentNote);

    /**
     * Get Fix month cutoff. Last day to include for next due date
     */
    int getFixMonthCutoff();

    /**
     * Set Fix month cutoff. Last day to include for next due date
     */
    void setFixMonthCutoff(int FixMonthCutoff);

    /**
     * Get Fix month day. Day of the month of the due date
     */
    int getFixMonthDay();

    /**
     * Set Fix month day. Day of the month of the due date
     */
    void setFixMonthDay(int FixMonthDay);

    /**
     * Get Fix month offset. Number of months (0=same, 1=following)
     */
    int getFixMonthOffset();

    /**
     * Set Fix month offset. Number of months (0=same, 1=following)
     */
    void setFixMonthOffset(int FixMonthOffset);

    /**
     * Get Grace Days. Days after due date to send first dunning letter
     */
    int getGraceDays();

    /**
     * Set Grace Days. Days after due date to send first dunning letter
     */
    void setGraceDays(int GraceDays);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    boolean isDefault();

    /**
     * Set Fixed due date. Payment is due on a fixed date
     */
    void setIsDueFixed(boolean IsDueFixed);

    /**
     * Get Fixed due date. Payment is due on a fixed date
     */
    boolean isDueFixed();

    /**
     * Set Next Business Day. Payment due on the next business day
     */
    void setIsNextBusinessDay(boolean IsNextBusinessDay);

    /**
     * Get Next Business Day. Payment due on the next business day
     */
    boolean isNextBusinessDay();

    /**
     * Set Valid. Element is valid
     */
    void setIsValid(boolean IsValid);

    /**
     * Get Valid. Element is valid
     */
    boolean isValid();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Net Day. Day when payment is due net
     */
    String getNetDay();

    /**
     * Set Net Day. Day when payment is due net
     */
    void setNetDay(String NetDay);

    /**
     * Get Net Days. Net Days in which payment is due
     */
    int getNetDays();

    /**
     * Set Net Days. Net Days in which payment is due
     */
    void setNetDays(int NetDays);

    /**
     * Get Payment Term Usage. Payment term usage indicates if this payment term is used for sales,
     * purchases or both.
     */
    String getPaymentTermUsage();

    /**
     * Set Payment Term Usage. Payment term usage indicates if this payment term is used for sales,
     * purchases or both.
     */
    void setPaymentTermUsage(String PaymentTermUsage);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);

    String validate();

    void saveEx();
}
