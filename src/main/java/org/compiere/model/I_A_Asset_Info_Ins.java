package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Asset_Info_Ins
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Info_Ins {

  /** TableName=A_Asset_Info_Ins */
  String Table_Name = "A_Asset_Info_Ins";

  /** AD_Table_ID=53135 */
  int Table_ID = 53135;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name A_Asset_ID */
  String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
  /** Column name A_Asset_Info_Ins_ID */
  String COLUMNNAME_A_Asset_Info_Ins_ID = "A_Asset_Info_Ins_ID";
  /** Column name A_Asset_Info_Ins_UU */
  String COLUMNNAME_A_Asset_Info_Ins_UU = "A_Asset_Info_Ins_UU";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name A_Ins_Premium */
  String COLUMNNAME_A_Ins_Premium = "A_Ins_Premium";
  /** Column name A_Insurance_Co */
  String COLUMNNAME_A_Insurance_Co = "A_Insurance_Co";
  /** Column name A_Ins_Value */
  String COLUMNNAME_A_Ins_Value = "A_Ins_Value";
  /** Column name A_Policy_No */
  String COLUMNNAME_A_Policy_No = "A_Policy_No";
  /** Column name A_Renewal_Date */
  String COLUMNNAME_A_Renewal_Date = "A_Renewal_Date";
  /** Column name A_Replace_Cost */
  String COLUMNNAME_A_Replace_Cost = "A_Replace_Cost";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Text */
  String COLUMNNAME_Text = "Text";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Asset. Asset used internally or by customers */
  int getA_Asset_ID();

  /** Set Asset. Asset used internally or by customers */
  void setA_Asset_ID(int A_Asset_ID);

  /** Get A_Asset_Info_Ins_ID */
  int getA_Asset_Info_Ins_ID();

  /** Set A_Asset_Info_Ins_ID */
  void setA_Asset_Info_Ins_ID(int A_Asset_Info_Ins_ID);

  /** Get A_Asset_Info_Ins_UU */
  String getA_Asset_Info_Ins_UU();

  /** Set A_Asset_Info_Ins_UU */
  void setA_Asset_Info_Ins_UU(String A_Asset_Info_Ins_UU);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Asset Insurance Premium */
  BigDecimal getA_Ins_Premium();

  /** Set Asset Insurance Premium */
  void setA_Ins_Premium(BigDecimal A_Ins_Premium);

  /** Get Insurance Company */
  String getA_Insurance_Co();

  /** Set Insurance Company */
  void setA_Insurance_Co(String A_Insurance_Co);

  /** Get Asset Insurance Value */
  BigDecimal getA_Ins_Value();

  /** Set Asset Insurance Value */
  void setA_Ins_Value(BigDecimal A_Ins_Value);

  /** Get Asset Policy No */
  String getA_Policy_No();

  /** Set Asset Policy No */
  void setA_Policy_No(String A_Policy_No);

  /** Get Asset Renewal Date */
  Timestamp getA_Renewal_Date();

  /** Set Asset Renewal Date */
  void setA_Renewal_Date(Timestamp A_Renewal_Date);

  /** Get Asset Replace Cost */
  BigDecimal getA_Replace_Cost();

  /** Set Asset Replace Cost */
  void setA_Replace_Cost(BigDecimal A_Replace_Cost);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Description */
  String getText();

  /** Set Description */
  void setText(String Text);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
