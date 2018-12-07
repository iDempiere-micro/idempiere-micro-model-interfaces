package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for S_ResourceType
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_S_ResourceType {

    /**
     * TableName=S_ResourceType
     */
    String Table_Name = "S_ResourceType";

    /**
     * AD_Table_ID=480
     */
    int Table_ID = 480;

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
     * Column name AllowUoMFractions
     */
    String COLUMNNAME_AllowUoMFractions = "AllowUoMFractions";
    /**
     * Column name ChargeableQty
     */
    String COLUMNNAME_ChargeableQty = "ChargeableQty";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name C_TaxCategory_ID
     */
    String COLUMNNAME_C_TaxCategory_ID = "C_TaxCategory_ID";
    /**
     * Column name C_UOM_ID
     */
    String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsDateSlot
     */
    String COLUMNNAME_IsDateSlot = "IsDateSlot";
    /**
     * Column name IsSingleAssignment
     */
    String COLUMNNAME_IsSingleAssignment = "IsSingleAssignment";
    /**
     * Column name IsTimeSlot
     */
    String COLUMNNAME_IsTimeSlot = "IsTimeSlot";
    /**
     * Column name M_Product_Category_ID
     */
    String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
    /**
     * Column name OnFriday
     */
    String COLUMNNAME_OnFriday = "OnFriday";
    /**
     * Column name OnMonday
     */
    String COLUMNNAME_OnMonday = "OnMonday";
    /**
     * Column name OnSaturday
     */
    String COLUMNNAME_OnSaturday = "OnSaturday";
    /**
     * Column name OnSunday
     */
    String COLUMNNAME_OnSunday = "OnSunday";
    /**
     * Column name OnThursday
     */
    String COLUMNNAME_OnThursday = "OnThursday";
    /**
     * Column name OnTuesday
     */
    String COLUMNNAME_OnTuesday = "OnTuesday";
    /**
     * Column name OnWednesday
     */
    String COLUMNNAME_OnWednesday = "OnWednesday";
    /**
     * Column name S_ResourceType_ID
     */
    String COLUMNNAME_S_ResourceType_ID = "S_ResourceType_ID";
    /**
     * Column name S_ResourceType_UU
     */
    String COLUMNNAME_S_ResourceType_UU = "S_ResourceType_UU";
    /**
     * Column name TimeSlotEnd
     */
    String COLUMNNAME_TimeSlotEnd = "TimeSlotEnd";
    /**
     * Column name TimeSlotStart
     */
    String COLUMNNAME_TimeSlotStart = "TimeSlotStart";
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
     * Get Allow UoM Fractions. Allow Unit of Measure Fractions
     */
    boolean isAllowUoMFractions();

    /**
     * Set Allow UoM Fractions. Allow Unit of Measure Fractions
     */
    void setAllowUoMFractions(boolean AllowUoMFractions);

    /**
     * Get Chargeable Quantity
     */
    int getChargeableQty();

    /**
     * Set Chargeable Quantity
     */
    void setChargeableQty(int ChargeableQty);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Tax Category. Tax Category
     */
    int getC_TaxCategory_ID();

    /**
     * Set Tax Category. Tax Category
     */
    void setC_TaxCategory_ID(int C_TaxCategory_ID);

    I_C_TaxCategory getC_TaxCategory() throws RuntimeException;

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
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Day Slot. Resource has day slot availability
     */
    void setIsDateSlot(boolean IsDateSlot);

    /**
     * Get Day Slot. Resource has day slot availability
     */
    boolean isDateSlot();

    /**
     * Set Single Assignment only. Only one assignment at a time (no double-booking or overlapping)
     */
    void setIsSingleAssignment(boolean IsSingleAssignment);

    /**
     * Get Single Assignment only. Only one assignment at a time (no double-booking or overlapping)
     */
    boolean isSingleAssignment();

    /**
     * Set Time Slot. Resource has time slot availability
     */
    void setIsTimeSlot(boolean IsTimeSlot);

    /**
     * Get Time Slot. Resource has time slot availability
     */
    boolean isTimeSlot();

    /**
     * Get Product Category. Category of a Product
     */
    int getM_Product_Category_ID();

    /**
     * Set Product Category. Category of a Product
     */
    void setM_Product_Category_ID(int M_Product_Category_ID);

    I_M_Product_Category getM_Product_Category() throws RuntimeException;

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Friday. Available on Fridays
     */
    boolean isOnFriday();

    /**
     * Set Friday. Available on Fridays
     */
    void setOnFriday(boolean OnFriday);

    /**
     * Get Monday. Available on Mondays
     */
    boolean isOnMonday();

    /**
     * Set Monday. Available on Mondays
     */
    void setOnMonday(boolean OnMonday);

    /**
     * Get Saturday. Available on Saturday
     */
    boolean isOnSaturday();

    /**
     * Set Saturday. Available on Saturday
     */
    void setOnSaturday(boolean OnSaturday);

    /**
     * Get Sunday. Available on Sundays
     */
    boolean isOnSunday();

    /**
     * Set Sunday. Available on Sundays
     */
    void setOnSunday(boolean OnSunday);

    /**
     * Get Thursday. Available on Thursdays
     */
    boolean isOnThursday();

    /**
     * Set Thursday. Available on Thursdays
     */
    void setOnThursday(boolean OnThursday);

    /**
     * Get Tuesday. Available on Tuesdays
     */
    boolean isOnTuesday();

    /**
     * Set Tuesday. Available on Tuesdays
     */
    void setOnTuesday(boolean OnTuesday);

    /**
     * Get Wednesday. Available on Wednesdays
     */
    boolean isOnWednesday();

    /**
     * Set Wednesday. Available on Wednesdays
     */
    void setOnWednesday(boolean OnWednesday);

    /**
     * Get Resource Type
     */
    int getS_ResourceType_ID();

    /**
     * Set Resource Type
     */
    void setS_ResourceType_ID(int S_ResourceType_ID);

    /**
     * Get S_ResourceType_UU
     */
    String getS_ResourceType_UU();

    /**
     * Set S_ResourceType_UU
     */
    void setS_ResourceType_UU(String S_ResourceType_UU);

    /**
     * Get Slot End. Time when timeslot ends
     */
    Timestamp getTimeSlotEnd();

    /**
     * Set Slot End. Time when timeslot ends
     */
    void setTimeSlotEnd(Timestamp TimeSlotEnd);

    /**
     * Get Slot Start. Time when timeslot starts
     */
    Timestamp getTimeSlotStart();

    /**
     * Set Slot Start. Time when timeslot starts
     */
    void setTimeSlotStart(Timestamp TimeSlotStart);

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
}
