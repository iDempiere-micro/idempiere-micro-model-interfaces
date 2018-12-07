package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_DocTypeCounter
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_DocTypeCounter {

  /** TableName=C_DocTypeCounter */
  String Table_Name = "C_DocTypeCounter";

  /** AD_Table_ID=718 */
  int Table_ID = 718;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_DocTypeCounter_ID */
  String COLUMNNAME_C_DocTypeCounter_ID = "C_DocTypeCounter_ID";
  /** Column name C_DocTypeCounter_UU */
  String COLUMNNAME_C_DocTypeCounter_UU = "C_DocTypeCounter_UU";
  /** Column name C_DocType_ID */
  String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
  /** Column name Counter_C_DocType_ID */
  String COLUMNNAME_Counter_C_DocType_ID = "Counter_C_DocType_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DocAction */
  String COLUMNNAME_DocAction = "DocAction";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsCreateCounter */
  String COLUMNNAME_IsCreateCounter = "IsCreateCounter";
  /** Column name IsValid */
  String COLUMNNAME_IsValid = "IsValid";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Counter Document. Counter Document Relationship */
  int getC_DocTypeCounter_ID();

  /** Set Counter Document. Counter Document Relationship */
  void setC_DocTypeCounter_ID(int C_DocTypeCounter_ID);

  /** Get C_DocTypeCounter_UU */
  String getC_DocTypeCounter_UU();

  /** Set C_DocTypeCounter_UU */
  void setC_DocTypeCounter_UU(String C_DocTypeCounter_UU);

  /** Get Document Type. Document type or rules */
  int getC_DocType_ID();

  /** Set Document Type. Document type or rules */
  void setC_DocType_ID(int C_DocType_ID);

  I_C_DocType getC_DocType() throws RuntimeException;

  /** Get Counter Document Type. Generated Counter Document Type (To) */
  int getCounter_C_DocType_ID();

  /** Set Counter Document Type. Generated Counter Document Type (To) */
  void setCounter_C_DocType_ID(int Counter_C_DocType_ID);

  I_C_DocType getCounter_C_DocType() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Document Action. The targeted status of the document */
  String getDocAction();

  /** Set Document Action. The targeted status of the document */
  void setDocAction(String DocAction);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Create Counter Document. Create Counter Document */
  void setIsCreateCounter(boolean IsCreateCounter);

  /** Get Create Counter Document. Create Counter Document */
  boolean isCreateCounter();

  /** Set Valid. Element is valid */
  void setIsValid(boolean IsValid);

  /** Get Valid. Element is valid */
  boolean isValid();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
