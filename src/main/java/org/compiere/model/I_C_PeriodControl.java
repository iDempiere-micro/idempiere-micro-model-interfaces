package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_PeriodControl
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_PeriodControl {

  /** TableName=C_PeriodControl */
  String Table_Name = "C_PeriodControl";

  /** AD_Table_ID=229 */
  int Table_ID = 229;

    /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

    /** Column name C_PeriodControl_ID */
  String COLUMNNAME_C_PeriodControl_ID = "C_PeriodControl_ID";
  /** Column name C_PeriodControl_UU */
  String COLUMNNAME_C_PeriodControl_UU = "C_PeriodControl_UU";
  /** Column name C_Period_ID */
  String COLUMNNAME_C_Period_ID = "C_Period_ID";
    /** Column name DocBaseType */
  String COLUMNNAME_DocBaseType = "DocBaseType";
    /** Column name PeriodAction */
  String COLUMNNAME_PeriodAction = "PeriodAction";
  /** Column name PeriodStatus */
  String COLUMNNAME_PeriodStatus = "PeriodStatus";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";

    /** Get Period Control */
  int getC_PeriodControl_ID();

    /** Get Period. Period of the Calendar */
  int getC_Period_ID();

  /** Set Period. Period of the Calendar */
  void setC_Period_ID(int C_Period_ID);

    /** Get Document BaseType. Logical type of document */
  String getDocBaseType();

  /** Set Document BaseType. Logical type of document */
  void setDocBaseType(String DocBaseType);

    /** Get Period Action. Action taken for this period */
  String getPeriodAction();

  /** Set Period Action. Action taken for this period */
  void setPeriodAction(String PeriodAction);

  /** Get Period Status. Current state of this period */
  String getPeriodStatus();

  /** Set Period Status. Current state of this period */
  void setPeriodStatus(String PeriodStatus);

}
