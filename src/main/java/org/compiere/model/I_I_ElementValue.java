package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for I_ElementValue
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_I_ElementValue {

  /** TableName=I_ElementValue */
  String Table_Name = "I_ElementValue";

  /** AD_Table_ID=534 */
  int Table_ID = 534;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AccountSign */
  String COLUMNNAME_AccountSign = "AccountSign";
  /** Column name AccountType */
  String COLUMNNAME_AccountType = "AccountType";
  /** Column name AD_Column_ID */
  String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_Element_ID */
  String COLUMNNAME_C_Element_ID = "C_Element_ID";
  /** Column name C_ElementValue_ID */
  String COLUMNNAME_C_ElementValue_ID = "C_ElementValue_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Default_Account */
  String COLUMNNAME_Default_Account = "Default_Account";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name ElementName */
  String COLUMNNAME_ElementName = "ElementName";
  /** Column name I_ElementValue_ID */
  String COLUMNNAME_I_ElementValue_ID = "I_ElementValue_ID";
  /** Column name I_ElementValue_UU */
  String COLUMNNAME_I_ElementValue_UU = "I_ElementValue_UU";
  /** Column name I_ErrorMsg */
  String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
  /** Column name I_IsImported */
  String COLUMNNAME_I_IsImported = "I_IsImported";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsDocControlled */
  String COLUMNNAME_IsDocControlled = "IsDocControlled";
  /** Column name IsSummary */
  String COLUMNNAME_IsSummary = "IsSummary";
  /** Column name ParentElementValue_ID */
  String COLUMNNAME_ParentElementValue_ID = "ParentElementValue_ID";
  /** Column name ParentValue */
  String COLUMNNAME_ParentValue = "ParentValue";
  /** Column name PostActual */
  String COLUMNNAME_PostActual = "PostActual";
  /** Column name PostBudget */
  String COLUMNNAME_PostBudget = "PostBudget";
  /** Column name PostEncumbrance */
  String COLUMNNAME_PostEncumbrance = "PostEncumbrance";
  /** Column name PostStatistical */
  String COLUMNNAME_PostStatistical = "PostStatistical";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name Value */
  String COLUMNNAME_Value = "Value";

  /** Get Account Sign. Indicates the Natural Sign of the Account as a Debit or Credit */
  String getAccountSign();

  /** Set Account Sign. Indicates the Natural Sign of the Account as a Debit or Credit */
  void setAccountSign(String AccountSign);

  /** Get Account Type. Indicates the type of account */
  String getAccountType();

  /** Set Account Type. Indicates the type of account */
  void setAccountType(String AccountType);

  /** Get Column. Column in the table */
  int getAD_Column_ID();

  /** Set Column. Column in the table */
  void setAD_Column_ID(int AD_Column_ID);

  I_AD_Column getAD_Column() throws RuntimeException;

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

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

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Default Account. Name of the Default Account Column */
  String getDefault_Account();

  /** Set Default Account. Name of the Default Account Column */
  void setDefault_Account(String Default_Account);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Element Name. Name of the Element */
  String getElementName();

  /** Set Element Name. Name of the Element */
  void setElementName(String ElementName);

  /** Get Import Account. Import Account Value */
  int getI_ElementValue_ID();

  /** Set Import Account. Import Account Value */
  void setI_ElementValue_ID(int I_ElementValue_ID);

  /** Get I_ElementValue_UU */
  String getI_ElementValue_UU();

  /** Set I_ElementValue_UU */
  void setI_ElementValue_UU(String I_ElementValue_UU);

  /** Get Import Error Message. Messages generated from import process */
  String getI_ErrorMsg();

  /** Set Import Error Message. Messages generated from import process */
  void setI_ErrorMsg(String I_ErrorMsg);

  /** Get Imported. Has this import been processed */
  boolean isI_IsImported();

  /** Set Imported. Has this import been processed */
  void setI_IsImported(boolean I_IsImported);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /**
   * Set Document Controlled. Control account - If an account is controlled by a document, you
   * cannot post manually to it
   */
  void setIsDocControlled(boolean IsDocControlled);

  /**
   * Get Document Controlled. Control account - If an account is controlled by a document, you
   * cannot post manually to it
   */
  boolean isDocControlled();

  /** Set Summary Level. This is a summary entity */
  void setIsSummary(boolean IsSummary);

  /** Get Summary Level. This is a summary entity */
  boolean isSummary();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Parent Account. The parent (summary) account */
  int getParentElementValue_ID();

  /** Set Parent Account. The parent (summary) account */
  void setParentElementValue_ID(int ParentElementValue_ID);

  I_C_ElementValue getParentElementValue() throws RuntimeException;

  /** Get Parent Key. Key if the Parent */
  String getParentValue();

  /** Set Parent Key. Key if the Parent */
  void setParentValue(String ParentValue);

  /** Get Post Actual. Actual Values can be posted */
  boolean isPostActual();

  /** Set Post Actual. Actual Values can be posted */
  void setPostActual(boolean PostActual);

  /** Get Post Budget. Budget values can be posted */
  boolean isPostBudget();

  /** Set Post Budget. Budget values can be posted */
  void setPostBudget(boolean PostBudget);

  /** Get Post Encumbrance. Post commitments to this account */
  boolean isPostEncumbrance();

  /** Set Post Encumbrance. Post commitments to this account */
  void setPostEncumbrance(boolean PostEncumbrance);

  /** Get Post Statistical. Post statistical quantities to this account? */
  boolean isPostStatistical();

  /** Set Post Statistical. Post statistical quantities to this account? */
  void setPostStatistical(boolean PostStatistical);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);
}
