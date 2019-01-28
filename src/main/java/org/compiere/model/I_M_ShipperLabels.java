package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ShipperLabels
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ShipperLabels {

  /** TableName=M_ShipperLabels */
  String Table_Name = "M_ShipperLabels";

  /** AD_Table_ID=200040 */
  int Table_ID = 200040;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

    /** Column name IsDefault */
  String COLUMNNAME_IsDefault = "IsDefault";
  /** Column name LabelPrintMethod */
  String COLUMNNAME_LabelPrintMethod = "LabelPrintMethod";
  /** Column name M_Shipper_ID */
  String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
  /** Column name M_ShipperLabelsCfg_ID */
  String COLUMNNAME_M_ShipperLabelsCfg_ID = "M_ShipperLabelsCfg_ID";
  /** Column name M_ShipperLabels_ID */
  String COLUMNNAME_M_ShipperLabels_ID = "M_ShipperLabels_ID";
  /** Column name M_ShipperLabels_UU */
  String COLUMNNAME_M_ShipperLabels_UU = "M_ShipperLabels_UU";

    /** Get Label Print Method */
  String getLabelPrintMethod();

    /** Get Shipper. Method or manner of product delivery */
  int getM_Shipper_ID();

    /** Get Shipper Labels Configuration */
  int getM_ShipperLabelsCfg_ID();

    I_M_ShipperLabelsCfg getM_ShipperLabelsCfg() throws RuntimeException;

}
