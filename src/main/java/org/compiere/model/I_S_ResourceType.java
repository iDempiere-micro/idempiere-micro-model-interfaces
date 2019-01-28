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

  /** TableName=S_ResourceType */
  String Table_Name = "S_ResourceType";

  /** AD_Table_ID=480 */
  int Table_ID = 480;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

    /** Column name AllowUoMFractions */
  String COLUMNNAME_AllowUoMFractions = "AllowUoMFractions";
  /** Column name ChargeableQty */
  String COLUMNNAME_ChargeableQty = "ChargeableQty";
    /** Column name C_TaxCategory_ID */
  String COLUMNNAME_C_TaxCategory_ID = "C_TaxCategory_ID";
  /** Column name C_UOM_ID */
  String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
    /** Column name IsDateSlot */
  String COLUMNNAME_IsDateSlot = "IsDateSlot";
  /** Column name IsSingleAssignment */
  String COLUMNNAME_IsSingleAssignment = "IsSingleAssignment";
  /** Column name IsTimeSlot */
  String COLUMNNAME_IsTimeSlot = "IsTimeSlot";
  /** Column name M_Product_Category_ID */
  String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
  /** Column name OnFriday */
  String COLUMNNAME_OnFriday = "OnFriday";
  /** Column name OnMonday */
  String COLUMNNAME_OnMonday = "OnMonday";
  /** Column name OnSaturday */
  String COLUMNNAME_OnSaturday = "OnSaturday";
  /** Column name OnSunday */
  String COLUMNNAME_OnSunday = "OnSunday";
  /** Column name OnThursday */
  String COLUMNNAME_OnThursday = "OnThursday";
  /** Column name OnTuesday */
  String COLUMNNAME_OnTuesday = "OnTuesday";
  /** Column name OnWednesday */
  String COLUMNNAME_OnWednesday = "OnWednesday";
  /** Column name S_ResourceType_ID */
  String COLUMNNAME_S_ResourceType_ID = "S_ResourceType_ID";
  /** Column name S_ResourceType_UU */
  String COLUMNNAME_S_ResourceType_UU = "S_ResourceType_UU";
  /** Column name TimeSlotEnd */
  String COLUMNNAME_TimeSlotEnd = "TimeSlotEnd";
  /** Column name TimeSlotStart */
  String COLUMNNAME_TimeSlotStart = "TimeSlotStart";

    /** Get Tax Category. Tax Category */
  int getC_TaxCategory_ID();

    /** Get UOM. Unit of Measure */
  int getC_UOM_ID();

    /** Get Day Slot. Resource has day slot availability */
  boolean isDateSlot();

    /** Get Time Slot. Resource has time slot availability */
  boolean isTimeSlot();

  /** Get Product Category. Category of a Product */
  int getM_Product_Category_ID();

    /** Get Friday. Available on Fridays */
  boolean isOnFriday();

    /** Get Monday. Available on Mondays */
  boolean isOnMonday();

    /** Get Saturday. Available on Saturday */
  boolean isOnSaturday();

    /** Get Sunday. Available on Sundays */
  boolean isOnSunday();

    /** Get Thursday. Available on Thursdays */
  boolean isOnThursday();

    /** Get Tuesday. Available on Tuesdays */
  boolean isOnTuesday();

    /** Get Wednesday. Available on Wednesdays */
  boolean isOnWednesday();

    /** Get Resource Type */
  int getS_ResourceType_ID();

    /** Get Slot End. Time when timeslot ends */
  Timestamp getTimeSlotEnd();

    /** Get Slot Start. Time when timeslot starts */
  Timestamp getTimeSlotStart();

}
