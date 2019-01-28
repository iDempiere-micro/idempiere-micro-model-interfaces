package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_SalesStage
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_SalesStage {

  /** TableName=C_SalesStage */
  String Table_Name = "C_SalesStage";

  /** AD_Table_ID=53338 */
  int Table_ID = 53338;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

    /** Column name C_SalesStage_ID */
  String COLUMNNAME_C_SalesStage_ID = "C_SalesStage_ID";
  /** Column name C_SalesStage_UU */
  String COLUMNNAME_C_SalesStage_UU = "C_SalesStage_UU";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
    /** Column name IsClosed */
  String COLUMNNAME_IsClosed = "IsClosed";
  /** Column name IsWon */
  String COLUMNNAME_IsWon = "IsWon";
  /** Column name Probability */
  String COLUMNNAME_Probability = "Probability";

}
