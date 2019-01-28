package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_CostElement
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_CostElement {

  /** TableName=M_CostElement */
  String Table_Name = "M_CostElement";

  /** AD_Table_ID=770 */
  int Table_ID = 770;

    /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name CostElementType */
  String COLUMNNAME_CostElementType = "CostElementType";
  /** Column name CostingMethod */
  String COLUMNNAME_CostingMethod = "CostingMethod";
    /** Column name Description */
  String COLUMNNAME_Description = "Description";
    /** Column name IsCalculated */
  String COLUMNNAME_IsCalculated = "IsCalculated";
  /** Column name M_CostElement_ID */
  String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";
  /** Column name M_CostElement_UU */
  String COLUMNNAME_M_CostElement_UU = "M_CostElement_UU";

    /** Get Cost Element Type. Type of Cost Element */
  String getCostElementType();

  /** Set Cost Element Type. Type of Cost Element */
  void setCostElementType(String CostElementType);

  /** Get Costing Method. Indicates how Costs will be calculated */
  String getCostingMethod();

  /** Set Costing Method. Indicates how Costs will be calculated */
  void setCostingMethod(String CostingMethod);

    /** Set Calculated. The value is calculated by the system */
  void setIsCalculated(boolean IsCalculated);

  /** Get Calculated. The value is calculated by the system */
  boolean isCalculated();

  /** Get Cost Element. Product Cost Element */
  int getM_CostElement_ID();

    /** Get Name. Alphanumeric identifier of the entity */
  String getName();

}
