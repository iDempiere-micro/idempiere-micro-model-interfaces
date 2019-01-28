package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_CashBook
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_CashBook {

  /** TableName=C_CashBook */
  String Table_Name = "C_CashBook";

  /** AD_Table_ID=408 */
  int Table_ID = 408;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_CashBook_ID */
  String COLUMNNAME_C_CashBook_ID = "C_CashBook_ID";
  /** Column name C_CashBook_UU */
  String COLUMNNAME_C_CashBook_UU = "C_CashBook_UU";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /** Column name Description */
  String COLUMNNAME_Description = "Description";
    /** Column name IsDefault */
  String COLUMNNAME_IsDefault = "IsDefault";

    /** Get Cash Book. Cash Book for recording petty cash transactions */
  int getC_CashBook_ID();

    /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

  /** Set Currency. The Currency for this record */
  void setC_Currency_ID(int C_Currency_ID);

}
