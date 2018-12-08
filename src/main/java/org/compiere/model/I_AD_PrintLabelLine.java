package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_PrintLabelLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_PrintLabelLine {

  /** TableName=AD_PrintLabelLine */
  String Table_Name = "AD_PrintLabelLine";

  /** AD_Table_ID=569 */
  int Table_ID = 569;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Column_ID */
  String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
  /** Column name AD_LabelPrinterFunction_ID */
  String COLUMNNAME_AD_LabelPrinterFunction_ID = "AD_LabelPrinterFunction_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_PrintLabel_ID */
  String COLUMNNAME_AD_PrintLabel_ID = "AD_PrintLabel_ID";
  /** Column name AD_PrintLabelLine_ID */
  String COLUMNNAME_AD_PrintLabelLine_ID = "AD_PrintLabelLine_ID";
  /** Column name AD_PrintLabelLine_UU */
  String COLUMNNAME_AD_PrintLabelLine_UU = "AD_PrintLabelLine_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name LabelFormatType */
  String COLUMNNAME_LabelFormatType = "LabelFormatType";
  /** Column name PrintName */
  String COLUMNNAME_PrintName = "PrintName";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name XPosition */
  String COLUMNNAME_XPosition = "XPosition";
  /** Column name YPosition */
  String COLUMNNAME_YPosition = "YPosition";

  /** Get Column. Column in the table */
  int getAD_Column_ID();

  /** Set Column. Column in the table */
  void setAD_Column_ID(int AD_Column_ID);

  I_AD_Column getAD_Column() throws RuntimeException;

  /** Get Label printer Function. Function of Label Printer */
  int getAD_LabelPrinterFunction_ID();

  /** Set Label printer Function. Function of Label Printer */
  void setAD_LabelPrinterFunction_ID(int AD_LabelPrinterFunction_ID);

  I_AD_LabelPrinterFunction getAD_LabelPrinterFunction() throws RuntimeException;

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Print Label. Label Format to print */
  int getAD_PrintLabel_ID();

  /** Set Print Label. Label Format to print */
  void setAD_PrintLabel_ID(int AD_PrintLabel_ID);

  I_AD_PrintLabel getAD_PrintLabel() throws RuntimeException;

  /** Get Print Label Line. Print Label Line Format */
  int getAD_PrintLabelLine_ID();

  /** Set Print Label Line. Print Label Line Format */
  void setAD_PrintLabelLine_ID(int AD_PrintLabelLine_ID);

  /** Get AD_PrintLabelLine_UU */
  String getAD_PrintLabelLine_UU();

  /** Set AD_PrintLabelLine_UU */
  void setAD_PrintLabelLine_UU(String AD_PrintLabelLine_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Label Format Type. Label Format Type */
  String getLabelFormatType();

  /** Set Label Format Type. Label Format Type */
  void setLabelFormatType(String LabelFormatType);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Print Text. The label text to be printed on a document or correspondence. */
  String getPrintName();

  /** Set Print Text. The label text to be printed on a document or correspondence. */
  void setPrintName(String PrintName);

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get X Position. Absolute X (horizontal) position in 1/72 of an inch */
  int getXPosition();

  /** Set X Position. Absolute X (horizontal) position in 1/72 of an inch */
  void setXPosition(int XPosition);

  /** Get Y Position. Absolute Y (vertical) position in 1/72 of an inch */
  int getYPosition();

  /** Set Y Position. Absolute Y (vertical) position in 1/72 of an inch */
  void setYPosition(int YPosition);
}
