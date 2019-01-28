package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_CountryGroup
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_CountryGroup {

  /** TableName=C_CountryGroup */
  String Table_Name = "C_CountryGroup";

  /** AD_Table_ID=200146 */
  int Table_ID = 200146;

    /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

    /** Column name C_CountryGroup_ID */
  String COLUMNNAME_C_CountryGroup_ID = "C_CountryGroup_ID";
  /** Column name C_CountryGroup_UU */
  String COLUMNNAME_C_CountryGroup_UU = "C_CountryGroup_UU";
    /** Column name DateFrom */
  String COLUMNNAME_DateFrom = "DateFrom";
  /** Column name DateTo */
  String COLUMNNAME_DateTo = "DateTo";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";

    /** Get Country Group */
  int getC_CountryGroup_ID();

}
