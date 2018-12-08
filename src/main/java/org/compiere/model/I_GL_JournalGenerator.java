package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for GL_JournalGenerator
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_GL_JournalGenerator {

  /** TableName=GL_JournalGenerator */
  String Table_Name = "GL_JournalGenerator";

  /** AD_Table_ID=200021 */
  int Table_ID = 200021;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_AcctSchema_ID */
  String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
  /** Column name C_DocType_ID */
  String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
  /** Column name C_ElementValueAdjustCR_ID */
  String COLUMNNAME_C_ElementValueAdjustCR_ID = "C_ElementValueAdjustCR_ID";
  /** Column name C_ElementValueAdjustDR_ID */
  String COLUMNNAME_C_ElementValueAdjustDR_ID = "C_ElementValueAdjustDR_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name GenerateGLJournal */
  String COLUMNNAME_GenerateGLJournal = "GenerateGLJournal";
  /** Column name GL_Category_ID */
  String COLUMNNAME_GL_Category_ID = "GL_Category_ID";
  /** Column name GL_JournalGenerator_ID */
  String COLUMNNAME_GL_JournalGenerator_ID = "GL_JournalGenerator_ID";
  /** Column name GL_JournalGenerator_UU */
  String COLUMNNAME_GL_JournalGenerator_UU = "GL_JournalGenerator_UU";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name PostingType */
  String COLUMNNAME_PostingType = "PostingType";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Accounting Schema. Rules for accounting */
  int getC_AcctSchema_ID();

  /** Set Accounting Schema. Rules for accounting */
  void setC_AcctSchema_ID(int C_AcctSchema_ID);

  I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

  /** Get Document Type. Document type or rules */
  int getC_DocType_ID();

  /** Set Document Type. Document type or rules */
  void setC_DocType_ID(int C_DocType_ID);

  I_C_DocType getC_DocType() throws RuntimeException;

  /** Get Account Adjust CR */
  int getC_ElementValueAdjustCR_ID();

  /** Set Account Adjust CR */
  void setC_ElementValueAdjustCR_ID(int C_ElementValueAdjustCR_ID);

  I_C_ElementValue getC_ElementValueAdjustCR() throws RuntimeException;

  /** Get Account Adjust DR */
  int getC_ElementValueAdjustDR_ID();

  /** Set Account Adjust DR */
  void setC_ElementValueAdjustDR_ID(int C_ElementValueAdjustDR_ID);

  I_C_ElementValue getC_ElementValueAdjustDR() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Generate GL Journal */
  String getGenerateGLJournal();

  /** Set Generate GL Journal */
  void setGenerateGLJournal(String GenerateGLJournal);

  /** Get GL Category. General Ledger Category */
  int getGL_Category_ID();

  /** Set GL Category. General Ledger Category */
  void setGL_Category_ID(int GL_Category_ID);

  I_GL_Category getGL_Category() throws RuntimeException;

  /** Get GL Journal Generator */
  int getGL_JournalGenerator_ID();

  /** Set GL Journal Generator */
  void setGL_JournalGenerator_ID(int GL_JournalGenerator_ID);

  /** Get GL_JournalGenerator_UU */
  String getGL_JournalGenerator_UU();

  /** Set GL_JournalGenerator_UU */
  void setGL_JournalGenerator_UU(String GL_JournalGenerator_UU);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get PostingType. The type of posted amount for the transaction */
  String getPostingType();

  /** Set PostingType. The type of posted amount for the transaction */
  void setPostingType(String PostingType);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
