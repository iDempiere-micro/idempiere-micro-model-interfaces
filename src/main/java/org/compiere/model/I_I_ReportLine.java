package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for I_ReportLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_I_ReportLine {

  /** TableName=I_ReportLine */
  String Table_Name = "I_ReportLine";

  /** AD_Table_ID=535 */
  int Table_ID = 535;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name CalculationType */
  String COLUMNNAME_CalculationType = "CalculationType";
  /** Column name C_ElementValue_ID */
  String COLUMNNAME_C_ElementValue_ID = "C_ElementValue_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name ElementValue */
  String COLUMNNAME_ElementValue = "ElementValue";
  /** Column name I_ErrorMsg */
  String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
  /** Column name I_IsImported */
  String COLUMNNAME_I_IsImported = "I_IsImported";
  /** Column name I_ReportLine_ID */
  String COLUMNNAME_I_ReportLine_ID = "I_ReportLine_ID";
  /** Column name I_ReportLine_UU */
  String COLUMNNAME_I_ReportLine_UU = "I_ReportLine_UU";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsPrinted */
  String COLUMNNAME_IsPrinted = "IsPrinted";
  /** Column name IsSummary */
  String COLUMNNAME_IsSummary = "IsSummary";
  /** Column name LineType */
  String COLUMNNAME_LineType = "LineType";
  /** Column name PAAmountType */
  String COLUMNNAME_PAAmountType = "PAAmountType";
  /** Column name PAPeriodType */
  String COLUMNNAME_PAPeriodType = "PAPeriodType";
  /** Column name PA_ReportLine_ID */
  String COLUMNNAME_PA_ReportLine_ID = "PA_ReportLine_ID";
  /** Column name PA_ReportLineSet_ID */
  String COLUMNNAME_PA_ReportLineSet_ID = "PA_ReportLineSet_ID";
  /** Column name PA_ReportSource_ID */
  String COLUMNNAME_PA_ReportSource_ID = "PA_ReportSource_ID";
  /** Column name PostingType */
  String COLUMNNAME_PostingType = "PostingType";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name ReportLineSetName */
  String COLUMNNAME_ReportLineSetName = "ReportLineSetName";
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

  /** Get Calculation */
  String getCalculationType();

  /** Set Calculation */
  void setCalculationType(String CalculationType);

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

  /** Get Element Key. Key of the element */
  String getElementValue();

  /** Set Element Key. Key of the element */
  void setElementValue(String ElementValue);

  /** Get Import Error Message. Messages generated from import process */
  String getI_ErrorMsg();

  /** Set Import Error Message. Messages generated from import process */
  void setI_ErrorMsg(String I_ErrorMsg);

  /** Get Imported. Has this import been processed */
  boolean isI_IsImported();

  /** Set Imported. Has this import been processed */
  void setI_IsImported(boolean I_IsImported);

  /** Get Import Report Line Set. Import Report Line Set values */
  int getI_ReportLine_ID();

  /** Set Import Report Line Set. Import Report Line Set values */
  void setI_ReportLine_ID(int I_ReportLine_ID);

  /** Get I_ReportLine_UU */
  String getI_ReportLine_UU();

  /** Set I_ReportLine_UU */
  void setI_ReportLine_UU(String I_ReportLine_UU);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Printed. Indicates if this document / line is printed */
  void setIsPrinted(boolean IsPrinted);

  /** Get Printed. Indicates if this document / line is printed */
  boolean isPrinted();

  /** Set Summary Level. This is a summary entity */
  void setIsSummary(boolean IsSummary);

  /** Get Summary Level. This is a summary entity */
  boolean isSummary();

  /** Get Line Type */
  String getLineType();

  /** Set Line Type */
  void setLineType(String LineType);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Amount Type. PA Amount Type for reporting */
  String getPAAmountType();

  /** Set Amount Type. PA Amount Type for reporting */
  void setPAAmountType(String PAAmountType);

  /** Get Period Type. PA Period Type */
  String getPAPeriodType();

  /** Set Period Type. PA Period Type */
  void setPAPeriodType(String PAPeriodType);

  /** Get Report Line */
  int getPA_ReportLine_ID();

  /** Set Report Line */
  void setPA_ReportLine_ID(int PA_ReportLine_ID);

  I_PA_ReportLine getPA_ReportLine() throws RuntimeException;

  /** Get Report Line Set */
  int getPA_ReportLineSet_ID();

  /** Set Report Line Set */
  void setPA_ReportLineSet_ID(int PA_ReportLineSet_ID);

  I_PA_ReportLineSet getPA_ReportLineSet() throws RuntimeException;

  /** Get Report Source. Restriction of what will be shown in Report Line */
  int getPA_ReportSource_ID();

  /** Set Report Source. Restriction of what will be shown in Report Line */
  void setPA_ReportSource_ID(int PA_ReportSource_ID);

  I_PA_ReportSource getPA_ReportSource() throws RuntimeException;

  /** Get PostingType. The type of posted amount for the transaction */
  String getPostingType();

  /** Set PostingType. The type of posted amount for the transaction */
  void setPostingType(String PostingType);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Report Line Set Name. Name of the Report Line Set */
  String getReportLineSetName();

  /** Set Report Line Set Name. Name of the Report Line Set */
  void setReportLineSetName(String ReportLineSetName);

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
