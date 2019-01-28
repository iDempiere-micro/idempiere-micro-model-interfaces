package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Region
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Region {

  /** TableName=C_Region */
  String Table_Name = "C_Region";

  /** AD_Table_ID=164 */
  int Table_ID = 164;

    /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

    /** Column name C_Country_ID */
  String COLUMNNAME_C_Country_ID = "C_Country_ID";
    /** Column name C_Region_ID */
  String COLUMNNAME_C_Region_ID = "C_Region_ID";
  /** Column name C_Region_UU */
  String COLUMNNAME_C_Region_UU = "C_Region_UU";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
    /** Column name IsDefault */
  String COLUMNNAME_IsDefault = "IsDefault";

    /** Get Country. Country */
  int getC_Country_ID();

  /** Set Country. Country */
  void setC_Country_ID(int C_Country_ID);

    /** Get Region. Identifies a geographical Region */
  int getC_Region_ID();

    /** Get Default. Default value */
  boolean isDefault();

}
