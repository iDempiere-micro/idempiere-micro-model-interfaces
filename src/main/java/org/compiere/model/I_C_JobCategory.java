package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_JobCategory
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_JobCategory {

  /** TableName=C_JobCategory */
  String Table_Name = "C_JobCategory";

  /** AD_Table_ID=790 */
  int Table_ID = 790;

    /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

    /** Column name C_JobCategory_ID */
  String COLUMNNAME_C_JobCategory_ID = "C_JobCategory_ID";
  /** Column name C_JobCategory_UU */
  String COLUMNNAME_C_JobCategory_UU = "C_JobCategory_UU";
    /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";

}
