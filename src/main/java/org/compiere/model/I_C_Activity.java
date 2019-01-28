package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Activity
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Activity {

  /** TableName=C_Activity */
  String Table_Name = "C_Activity";

  /** AD_Table_ID=316 */
  int Table_ID = 316;

    /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

    /** Column name C_Activity_ID */
  String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
  /** Column name C_Activity_UU */
  String COLUMNNAME_C_Activity_UU = "C_Activity_UU";
    /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
    /** Column name IsSummary */
  String COLUMNNAME_IsSummary = "IsSummary";

}
