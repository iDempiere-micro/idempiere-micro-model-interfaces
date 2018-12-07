package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Asset_Info_Tax
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Info_Tax {

  /** TableName=A_Asset_Info_Tax */
  String Table_Name = "A_Asset_Info_Tax";

  /** AD_Table_ID=53131 */
  int Table_ID = 53131;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name A_Asset_ID */
  String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
  /** Column name A_Asset_Info_Tax_ID */
  String COLUMNNAME_A_Asset_Info_Tax_ID = "A_Asset_Info_Tax_ID";
  /** Column name A_Asset_Info_Tax_UU */
  String COLUMNNAME_A_Asset_Info_Tax_UU = "A_Asset_Info_Tax_UU";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name A_Finance_Meth */
  String COLUMNNAME_A_Finance_Meth = "A_Finance_Meth";
  /** Column name A_Investment_CR */
  String COLUMNNAME_A_Investment_CR = "A_Investment_CR";
  /** Column name A_New_Used */
  String COLUMNNAME_A_New_Used = "A_New_Used";
  /** Column name A_State */
  String COLUMNNAME_A_State = "A_State";
  /** Column name A_Tax_Entity */
  String COLUMNNAME_A_Tax_Entity = "A_Tax_Entity";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name TextMsg */
  String COLUMNNAME_TextMsg = "TextMsg";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Asset. Asset used internally or by customers */
  int getA_Asset_ID();

  /** Set Asset. Asset used internally or by customers */
  void setA_Asset_ID(int A_Asset_ID);

  /** Get Asset Info Tax */
  int getA_Asset_Info_Tax_ID();

  /** Set Asset Info Tax */
  void setA_Asset_Info_Tax_ID(int A_Asset_Info_Tax_ID);

  /** Get A_Asset_Info_Tax_UU */
  String getA_Asset_Info_Tax_UU();

  /** Set A_Asset_Info_Tax_UU */
  void setA_Asset_Info_Tax_UU(String A_Asset_Info_Tax_UU);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Asset Finance Method */
  String getA_Finance_Meth();

  /** Set Asset Finance Method */
  void setA_Finance_Meth(String A_Finance_Meth);

  /** Get Asset Investment CR */
  int getA_Investment_CR();

  /** Set Asset Investment CR */
  void setA_Investment_CR(int A_Investment_CR);

  /** Get Asset New Used */
  boolean isA_New_Used();

  /** Set Asset New Used */
  void setA_New_Used(boolean A_New_Used);

  /** Get Account State. State of the Credit Card or Account holder */
  String getA_State();

  /** Set Account State. State of the Credit Card or Account holder */
  void setA_State(String A_State);

  /** Get Asset Tax Entity */
  String getA_Tax_Entity();

  /** Set Asset Tax Entity */
  void setA_Tax_Entity(String A_Tax_Entity);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Text Message. Text Message */
  String getTextMsg();

  /** Set Text Message. Text Message */
  void setTextMsg(String TextMsg);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
