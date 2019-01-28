package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for R_Resolution
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_Resolution {

  /** TableName=R_Resolution */
  String Table_Name = "R_Resolution";

  /** AD_Table_ID=774 */
  int Table_ID = 774;

    /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

    /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
    /** Column name R_Resolution_ID */
  String COLUMNNAME_R_Resolution_ID = "R_Resolution_ID";
  /** Column name R_Resolution_UU */
  String COLUMNNAME_R_Resolution_UU = "R_Resolution_UU";

}
