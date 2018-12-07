package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for GL_BudgetControl
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_GL_BudgetControl {

  /** TableName=GL_BudgetControl */
  String Table_Name = "GL_BudgetControl";

  /** AD_Table_ID=822 */
  int Table_ID = 822;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name BudgetControlScope */
  String COLUMNNAME_BudgetControlScope = "BudgetControlScope";
  /** Column name C_AcctSchema_ID */
  String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
  /** Column name CommitmentType */
  String COLUMNNAME_CommitmentType = "CommitmentType";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name GL_BudgetControl_ID */
  String COLUMNNAME_GL_BudgetControl_ID = "GL_BudgetControl_ID";
  /** Column name GL_BudgetControl_UU */
  String COLUMNNAME_GL_BudgetControl_UU = "GL_BudgetControl_UU";
  /** Column name GL_Budget_ID */
  String COLUMNNAME_GL_Budget_ID = "GL_Budget_ID";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsBeforeApproval */
  String COLUMNNAME_IsBeforeApproval = "IsBeforeApproval";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Control Scope. Scope of the Budget Control */
  String getBudgetControlScope();

  /** Set Control Scope. Scope of the Budget Control */
  void setBudgetControlScope(String BudgetControlScope);

  /** Get Accounting Schema. Rules for accounting */
  int getC_AcctSchema_ID();

  /** Set Accounting Schema. Rules for accounting */
  void setC_AcctSchema_ID(int C_AcctSchema_ID);

  I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

  /** Get Commitment Type. Create Commitment and/or Reservations for Budget Control */
  String getCommitmentType();

  /** Set Commitment Type. Create Commitment and/or Reservations for Budget Control */
  void setCommitmentType(String CommitmentType);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Budget Control. Budget Control */
  int getGL_BudgetControl_ID();

  /** Set Budget Control. Budget Control */
  void setGL_BudgetControl_ID(int GL_BudgetControl_ID);

  /** Get GL_BudgetControl_UU */
  String getGL_BudgetControl_UU();

  /** Set GL_BudgetControl_UU */
  void setGL_BudgetControl_UU(String GL_BudgetControl_UU);

  /** Get Budget. General Ledger Budget */
  int getGL_Budget_ID();

  /** Set Budget. General Ledger Budget */
  void setGL_Budget_ID(int GL_Budget_ID);

  I_GL_Budget getGL_Budget() throws RuntimeException;

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Before Approval. The Check is before the (manual) approval */
  void setIsBeforeApproval(boolean IsBeforeApproval);

  /** Get Before Approval. The Check is before the (manual) approval */
  boolean isBeforeApproval();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
