package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_ProjectIssueMA
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_ProjectIssueMA {

  /** TableName=C_ProjectIssueMA */
  String Table_Name = "C_ProjectIssueMA";

  /** AD_Table_ID=761 */
  int Table_ID = 761;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_ProjectIssue_ID */
  String COLUMNNAME_C_ProjectIssue_ID = "C_ProjectIssue_ID";
  /** Column name C_ProjectIssueMA_UU */
  String COLUMNNAME_C_ProjectIssueMA_UU = "C_ProjectIssueMA_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_AttributeSetInstance_ID */
  String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
  /** Column name MovementQty */
  String COLUMNNAME_MovementQty = "MovementQty";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Project Issue. Project Issues (Material, Labor) */
  int getC_ProjectIssue_ID();

  /** Set Project Issue. Project Issues (Material, Labor) */
  void setC_ProjectIssue_ID(int C_ProjectIssue_ID);

  I_C_ProjectIssue getC_ProjectIssue() throws RuntimeException;

  /** Get C_ProjectIssueMA_UU */
  String getC_ProjectIssueMA_UU();

  /** Set C_ProjectIssueMA_UU */
  void setC_ProjectIssueMA_UU(String C_ProjectIssueMA_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Attribute Set Instance. Product Attribute Set Instance */
  void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

  /** Get Attribute Set Instance. Product Attribute Set Instance */
  int getMAttributeSetInstance_ID();

  I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

  /** Get Movement Quantity. Quantity of a product moved. */
  BigDecimal getMovementQty();

  /** Set Movement Quantity. Quantity of a product moved. */
  void setMovementQty(BigDecimal MovementQty);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
