package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_PrintLabel
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_PrintLabel {

  /** TableName=AD_PrintLabel */
  String Table_Name = "AD_PrintLabel";

  /** AD_Table_ID=570 */
  int Table_ID = 570;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_LabelPrinter_ID */
  String COLUMNNAME_AD_LabelPrinter_ID = "AD_LabelPrinter_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_PrintLabel_ID */
  String COLUMNNAME_AD_PrintLabel_ID = "AD_PrintLabel_ID";
  /** Column name AD_PrintLabel_UU */
  String COLUMNNAME_AD_PrintLabel_UU = "AD_PrintLabel_UU";
  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsLandscape */
  String COLUMNNAME_IsLandscape = "IsLandscape";
  /** Column name LabelHeight */
  String COLUMNNAME_LabelHeight = "LabelHeight";
  /** Column name LabelWidth */
  String COLUMNNAME_LabelWidth = "LabelWidth";
  /** Column name PrinterName */
  String COLUMNNAME_PrinterName = "PrinterName";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Label printer. Label Printer Definition */
  int getAD_LabelPrinter_ID();

  /** Set Label printer. Label Printer Definition */
  void setAD_LabelPrinter_ID(int AD_LabelPrinter_ID);

  I_AD_LabelPrinter getAD_LabelPrinter() throws RuntimeException;

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Print Label. Label Format to print */
  int getAD_PrintLabel_ID();

  /** Set Print Label. Label Format to print */
  void setAD_PrintLabel_ID(int AD_PrintLabel_ID);

  /** Get AD_PrintLabel_UU */
  String getAD_PrintLabel_UU();

  /** Set AD_PrintLabel_UU */
  void setAD_PrintLabel_UU(String AD_PrintLabel_UU);

  /** Get Table. Database Table information */
  int getAD_Table_ID();

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  I_AD_Table getAD_Table() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Landscape. Landscape orientation */
  void setIsLandscape(boolean IsLandscape);

  /** Get Landscape. Landscape orientation */
  boolean isLandscape();

  /** Get Label Height. Height of the label */
  int getLabelHeight();

  /** Set Label Height. Height of the label */
  void setLabelHeight(int LabelHeight);

  /** Get Label Width. Width of the Label */
  int getLabelWidth();

  /** Set Label Width. Width of the Label */
  void setLabelWidth(int LabelWidth);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Printer Name. Name of the Printer */
  String getPrinterName();

  /** Set Printer Name. Name of the Printer */
  void setPrinterName(String PrinterName);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
