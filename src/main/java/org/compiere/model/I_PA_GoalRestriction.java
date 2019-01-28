package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PA_GoalRestriction
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_GoalRestriction {

  /** TableName=PA_GoalRestriction */
  String Table_Name = "PA_GoalRestriction";

  /** AD_Table_ID=832 */
  int Table_ID = 832;

    /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

    /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BP_Group_ID */
  String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
    /** Column name GoalRestrictionType */
  String COLUMNNAME_GoalRestrictionType = "GoalRestrictionType";
    /** Column name M_Product_Category_ID */
  String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name Org_ID */
  String COLUMNNAME_Org_ID = "Org_ID";
  /** Column name PA_Goal_ID */
  String COLUMNNAME_PA_Goal_ID = "PA_Goal_ID";
  /** Column name PA_GoalRestriction_ID */
  String COLUMNNAME_PA_GoalRestriction_ID = "PA_GoalRestriction_ID";
  /** Column name PA_GoalRestriction_UU */
  String COLUMNNAME_PA_GoalRestriction_UU = "PA_GoalRestriction_UU";

    /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

    /** Get Business Partner Group. Business Partner Group */
  int getC_BP_Group_ID();

    /** Get Restriction Type. Goal Restriction Type */
  String getGoalRestrictionType();

    /** Get Product Category. Category of a Product */
  int getM_Product_Category_ID();

    /** Get Product. Product, Service, Item */
  int getM_Product_ID();

    /** Get Organization. Organizational entity within client */
  int getOrg_ID();

    /** Get Goal. Performance Goal */
  int getPA_Goal_ID();

}
