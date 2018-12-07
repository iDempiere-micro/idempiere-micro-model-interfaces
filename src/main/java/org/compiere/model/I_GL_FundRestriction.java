package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for GL_FundRestriction
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_GL_FundRestriction {

  /** TableName=GL_FundRestriction */
  String Table_Name = "GL_FundRestriction";

  /** AD_Table_ID=824 */
  int Table_ID = 824;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_ElementValue_ID */
  String COLUMNNAME_C_ElementValue_ID = "C_ElementValue_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name GL_Fund_ID */
  String COLUMNNAME_GL_Fund_ID = "GL_Fund_ID";
  /** Column name GL_FundRestriction_ID */
  String COLUMNNAME_GL_FundRestriction_ID = "GL_FundRestriction_ID";
  /** Column name GL_FundRestriction_UU */
  String COLUMNNAME_GL_FundRestriction_UU = "GL_FundRestriction_UU";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Account Element. Account Element */
  int getC_ElementValue_ID();

  /** Set Account Element. Account Element */
  void setC_ElementValue_ID(int C_ElementValue_ID);

  I_C_ElementValue getC_ElementValue() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get GL Fund. General Ledger Funds Control */
  int getGL_Fund_ID();

  /** Set GL Fund. General Ledger Funds Control */
  void setGL_Fund_ID(int GL_Fund_ID);

  I_GL_Fund getGL_Fund() throws RuntimeException;

  /** Get Fund Restriction. Restriction of Funds */
  int getGL_FundRestriction_ID();

  /** Set Fund Restriction. Restriction of Funds */
  void setGL_FundRestriction_ID(int GL_FundRestriction_ID);

  /** Get GL_FundRestriction_UU */
  String getGL_FundRestriction_UU();

  /** Set GL_FundRestriction_UU */
  void setGL_FundRestriction_UU(String GL_FundRestriction_UU);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
