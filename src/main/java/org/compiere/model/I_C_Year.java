package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Year
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Year {

  /** TableName=C_Year */
  String Table_Name = "C_Year";

  /** AD_Table_ID=177 */
  int Table_ID = 177;

    /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

    /** Column name C_Calendar_ID */
  String COLUMNNAME_C_Calendar_ID = "C_Calendar_ID";
    /** Column name C_Year_ID */
  String COLUMNNAME_C_Year_ID = "C_Year_ID";
  /** Column name C_Year_UU */
  String COLUMNNAME_C_Year_UU = "C_Year_UU";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name FiscalYear */
  String COLUMNNAME_FiscalYear = "FiscalYear";
    /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";

    /** Get Calendar. Accounting Calendar Name */
  int getC_Calendar_ID();

  /** Set Calendar. Accounting Calendar Name */
  void setC_Calendar_ID(int C_Calendar_ID);

    /** Get Year. Calendar Year */
  int getC_Year_ID();

    /** Get Year. The Fiscal Year */
  String getFiscalYear();

  /** Set Year. The Fiscal Year */
  void setFiscalYear(String FiscalYear);

    /** Set Process Now */
  void setProcessing(boolean Processing);

}
