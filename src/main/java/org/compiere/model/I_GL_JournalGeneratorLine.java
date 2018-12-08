package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for GL_JournalGeneratorLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_GL_JournalGeneratorLine {

  /** TableName=GL_JournalGeneratorLine */
  String Table_Name = "GL_JournalGeneratorLine";

  /** AD_Table_ID=200022 */
  int Table_ID = 200022;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AmtMultiplier */
  String COLUMNNAME_AmtMultiplier = "AmtMultiplier";
  /** Column name BPColumn */
  String COLUMNNAME_BPColumn = "BPColumn";
  /** Column name BPDimensionType */
  String COLUMNNAME_BPDimensionType = "BPDimensionType";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_ElementValueCR_ID */
  String COLUMNNAME_C_ElementValueCR_ID = "C_ElementValueCR_ID";
  /** Column name C_ElementValueDR_ID */
  String COLUMNNAME_C_ElementValueDR_ID = "C_ElementValueDR_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name GL_JournalGenerator_ID */
  String COLUMNNAME_GL_JournalGenerator_ID = "GL_JournalGenerator_ID";
  /** Column name GL_JournalGeneratorLine_ID */
  String COLUMNNAME_GL_JournalGeneratorLine_ID = "GL_JournalGeneratorLine_ID";
  /** Column name GL_JournalGeneratorLine_UU */
  String COLUMNNAME_GL_JournalGeneratorLine_UU = "GL_JournalGeneratorLine_UU";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsCopyAllDimensions */
  String COLUMNNAME_IsCopyAllDimensions = "IsCopyAllDimensions";
  /** Column name IsSameProduct */
  String COLUMNNAME_IsSameProduct = "IsSameProduct";
  /** Column name RoundFactor */
  String COLUMNNAME_RoundFactor = "RoundFactor";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Multiplier Amount. Multiplier Amount for generating commissions */
  BigDecimal getAmtMultiplier();

  /** Set Multiplier Amount. Multiplier Amount for generating commissions */
  void setAmtMultiplier(BigDecimal AmtMultiplier);

  /** Get BP Column */
  String getBPColumn();

  /** Set BP Column */
  void setBPColumn(String BPColumn);

  /** Get Type of BP Dimension */
  String getBPDimensionType();

  /** Set Type of BP Dimension */
  void setBPDimensionType(String BPDimensionType);

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Account CR */
  int getC_ElementValueCR_ID();

  /** Set Account CR */
  void setC_ElementValueCR_ID(int C_ElementValueCR_ID);

  I_C_ElementValue getC_ElementValueCR() throws RuntimeException;

  /** Get Account DR */
  int getC_ElementValueDR_ID();

  /** Set Account DR */
  void setC_ElementValueDR_ID(int C_ElementValueDR_ID);

  I_C_ElementValue getC_ElementValueDR() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get GL Journal Generator */
  int getGL_JournalGenerator_ID();

  /** Set GL Journal Generator */
  void setGL_JournalGenerator_ID(int GL_JournalGenerator_ID);

  I_GL_JournalGenerator getGL_JournalGenerator() throws RuntimeException;

  /** Get Generator Line */
  int getGL_JournalGeneratorLine_ID();

  /** Set Generator Line */
  void setGL_JournalGeneratorLine_ID(int GL_JournalGeneratorLine_ID);

  /** Get GL_JournalGeneratorLine_UU */
  String getGL_JournalGeneratorLine_UU();

  /** Set GL_JournalGeneratorLine_UU */
  void setGL_JournalGeneratorLine_UU(String GL_JournalGeneratorLine_UU);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Copy All Dimensions */
  void setIsCopyAllDimensions(boolean IsCopyAllDimensions);

  /** Get Copy All Dimensions */
  boolean isCopyAllDimensions();

  /** Set Same Product */
  void setIsSameProduct(boolean IsSameProduct);

  /** Get Same Product */
  boolean isSameProduct();

  /** Get Round Factor */
  int getRoundFactor();

  /** Set Round Factor */
  void setRoundFactor(int RoundFactor);

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
