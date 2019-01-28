package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_ConversionType
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_ConversionType {

  /** TableName=C_ConversionType */
  String Table_Name = "C_ConversionType";

  /** AD_Table_ID=637 */
  int Table_ID = 637;

    /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

    /** Column name C_ConversionType_ID */
  String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
  /** Column name C_ConversionType_UU */
  String COLUMNNAME_C_ConversionType_UU = "C_ConversionType_UU";
    /** Column name Description */
  String COLUMNNAME_Description = "Description";
    /** Column name IsDefault */
  String COLUMNNAME_IsDefault = "IsDefault";

}
