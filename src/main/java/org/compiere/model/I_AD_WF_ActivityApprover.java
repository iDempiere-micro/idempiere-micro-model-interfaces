package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_WF_ActivityApprover
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_WF_ActivityApprover {

  /** TableName=AD_WF_ActivityApprover */
  String Table_Name = "AD_WF_ActivityApprover";

  /** AD_Table_ID=200226 */
  int Table_ID = 200226;

    /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

    /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name AD_WF_ActivityApprover_ID */
  String COLUMNNAME_AD_WF_ActivityApprover_ID = "AD_WF_ActivityApprover_ID";
  /** Column name AD_WF_ActivityApprover_UU */
  String COLUMNNAME_AD_WF_ActivityApprover_UU = "AD_WF_ActivityApprover_UU";
  /** Column name AD_WF_Activity_ID */
  String COLUMNNAME_AD_WF_Activity_ID = "AD_WF_Activity_ID";

    /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

    /** Get Workflow Activity. Workflow Activity */
  int getAD_WF_Activity_ID();

}
