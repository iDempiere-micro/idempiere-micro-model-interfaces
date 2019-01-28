package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Workflow_Access
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Workflow_Access {

  /** TableName=AD_Workflow_Access */
  String Table_Name = "AD_Workflow_Access";

  /** AD_Table_ID=202 */
  int Table_ID = 202;

    /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

    /** Column name AD_Role_ID */
  String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
  /** Column name AD_Workflow_Access_UU */
  String COLUMNNAME_AD_Workflow_Access_UU = "AD_Workflow_Access_UU";
  /** Column name AD_Workflow_ID */
  String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
    /** Column name IsReadWrite */
  String COLUMNNAME_IsReadWrite = "IsReadWrite";

    /** Get Role. Responsibility Role */
  int getAD_Role_ID();

  /** Set Role. Responsibility Role */
  void setAD_Role_ID(int AD_Role_ID);

    /** Get Workflow. Workflow or combination of tasks */
  int getAD_Workflow_ID();

  /** Set Workflow. Workflow or combination of tasks */
  void setAD_Workflow_ID(int AD_Workflow_ID);

    /** Set Read Write. Field is read / write */
  void setIsReadWrite(boolean IsReadWrite);

}
