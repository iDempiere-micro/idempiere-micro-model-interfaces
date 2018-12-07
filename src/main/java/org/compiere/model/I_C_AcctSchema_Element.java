package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_AcctSchema_Element
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_AcctSchema_Element {

  /** TableName=C_AcctSchema_Element */
  String Table_Name = "C_AcctSchema_Element";

  /** AD_Table_ID=279 */
  int Table_ID = 279;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Column_ID */
  String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_AcctSchema_Element_ID */
  String COLUMNNAME_C_AcctSchema_Element_ID = "C_AcctSchema_Element_ID";
  /** Column name C_AcctSchema_Element_UU */
  String COLUMNNAME_C_AcctSchema_Element_UU = "C_AcctSchema_Element_UU";
  /** Column name C_AcctSchema_ID */
  String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
  /** Column name C_Activity_ID */
  String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_Campaign_ID */
  String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
  /** Column name C_Element_ID */
  String COLUMNNAME_C_Element_ID = "C_Element_ID";
  /** Column name C_ElementValue_ID */
  String COLUMNNAME_C_ElementValue_ID = "C_ElementValue_ID";
  /** Column name C_Location_ID */
  String COLUMNNAME_C_Location_ID = "C_Location_ID";
  /** Column name C_Project_ID */
  String COLUMNNAME_C_Project_ID = "C_Project_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_SalesRegion_ID */
  String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
  /** Column name ElementType */
  String COLUMNNAME_ElementType = "ElementType";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsBalanced */
  String COLUMNNAME_IsBalanced = "IsBalanced";
  /** Column name IsMandatory */
  String COLUMNNAME_IsMandatory = "IsMandatory";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name Org_ID */
  String COLUMNNAME_Org_ID = "Org_ID";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Column. Column in the table */
  int getAD_Column_ID();

  /** Set Column. Column in the table */
  void setAD_Column_ID(int AD_Column_ID);

  I_AD_Column getAD_Column() throws RuntimeException;

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Acct.Schema Element */
  int getC_AcctSchema_Element_ID();

  /** Set Acct.Schema Element */
  void setC_AcctSchema_Element_ID(int C_AcctSchema_Element_ID);

  /** Get C_AcctSchema_Element_UU */
  String getC_AcctSchema_Element_UU();

  /** Set C_AcctSchema_Element_UU */
  void setC_AcctSchema_Element_UU(String C_AcctSchema_Element_UU);

  /** Get Accounting Schema. Rules for accounting */
  int getC_AcctSchema_ID();

  /** Set Accounting Schema. Rules for accounting */
  void setC_AcctSchema_ID(int C_AcctSchema_ID);

  I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

  /** Get Activity. Business Activity */
  int getC_Activity_ID();

  /** Set Activity. Business Activity */
  void setC_Activity_ID(int C_Activity_ID);

  I_C_Activity getC_Activity() throws RuntimeException;

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Campaign. Marketing Campaign */
  int getC_Campaign_ID();

  /** Set Campaign. Marketing Campaign */
  void setC_Campaign_ID(int C_Campaign_ID);

  I_C_Campaign getC_Campaign() throws RuntimeException;

  /** Get Element. Accounting Element */
  int getC_Element_ID();

  /** Set Element. Accounting Element */
  void setC_Element_ID(int C_Element_ID);

  I_C_Element getC_Element() throws RuntimeException;

  /** Get Account Element. Account Element */
  int getC_ElementValue_ID();

  /** Set Account Element. Account Element */
  void setC_ElementValue_ID(int C_ElementValue_ID);

  I_C_ElementValue getC_ElementValue() throws RuntimeException;

  /** Get Address. Location or Address */
  int getC_Location_ID();

  /** Set Address. Location or Address */
  void setC_Location_ID(int C_Location_ID);

  I_C_Location getC_Location() throws RuntimeException;

  /** Get Project. Financial Project */
  int getC_Project_ID();

  /** Set Project. Financial Project */
  void setC_Project_ID(int C_Project_ID);

  I_C_Project getC_Project() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Sales Region. Sales coverage region */
  int getC_SalesRegion_ID();

  /** Set Sales Region. Sales coverage region */
  void setC_SalesRegion_ID(int C_SalesRegion_ID);

  I_C_SalesRegion getC_SalesRegion() throws RuntimeException;

  /** Get Type. Element Type (account or user defined) */
  String getElementType();

  /** Set Type. Element Type (account or user defined) */
  void setElementType(String ElementType);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Balanced */
  void setIsBalanced(boolean IsBalanced);

  /** Get Balanced */
  boolean isBalanced();

  /** Set Mandatory. Data entry is required in this column */
  void setIsMandatory(boolean IsMandatory);

  /** Get Mandatory. Data entry is required in this column */
  boolean isMandatory();

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Organization. Organizational entity within client */
  int getOrg_ID();

  /** Set Organization. Organizational entity within client */
  void setOrg_ID(int Org_ID);

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
