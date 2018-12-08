package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_PrintTableFormat
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_PrintTableFormat {

  /** TableName=AD_PrintTableFormat */
  String Table_Name = "AD_PrintTableFormat";

  /** AD_Table_ID=523 */
  int Table_ID = 523;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Image_ID */
  String COLUMNNAME_AD_Image_ID = "AD_Image_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_PrintTableFormat_ID */
  String COLUMNNAME_AD_PrintTableFormat_ID = "AD_PrintTableFormat_ID";
  /** Column name AD_PrintTableFormat_UU */
  String COLUMNNAME_AD_PrintTableFormat_UU = "AD_PrintTableFormat_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name FooterCenter */
  String COLUMNNAME_FooterCenter = "FooterCenter";
  /** Column name FooterLeft */
  String COLUMNNAME_FooterLeft = "FooterLeft";
  /** Column name FooterRight */
  String COLUMNNAME_FooterRight = "FooterRight";
  /** Column name FunctBG_PrintColor_ID */
  String COLUMNNAME_FunctBG_PrintColor_ID = "FunctBG_PrintColor_ID";
  /** Column name FunctFG_PrintColor_ID */
  String COLUMNNAME_FunctFG_PrintColor_ID = "FunctFG_PrintColor_ID";
  /** Column name Funct_PrintFont_ID */
  String COLUMNNAME_Funct_PrintFont_ID = "Funct_PrintFont_ID";
  /** Column name HdrLine_PrintColor_ID */
  String COLUMNNAME_HdrLine_PrintColor_ID = "HdrLine_PrintColor_ID";
  /** Column name Hdr_PrintFont_ID */
  String COLUMNNAME_Hdr_PrintFont_ID = "Hdr_PrintFont_ID";
  /** Column name HdrStroke */
  String COLUMNNAME_HdrStroke = "HdrStroke";
  /** Column name HdrStrokeType */
  String COLUMNNAME_HdrStrokeType = "HdrStrokeType";
  /** Column name HdrTextBG_PrintColor_ID */
  String COLUMNNAME_HdrTextBG_PrintColor_ID = "HdrTextBG_PrintColor_ID";
  /** Column name HdrTextFG_PrintColor_ID */
  String COLUMNNAME_HdrTextFG_PrintColor_ID = "HdrTextFG_PrintColor_ID";
  /** Column name HeaderCenter */
  String COLUMNNAME_HeaderCenter = "HeaderCenter";
  /** Column name HeaderLeft */
  String COLUMNNAME_HeaderLeft = "HeaderLeft";
  /** Column name HeaderRight */
  String COLUMNNAME_HeaderRight = "HeaderRight";
  /** Column name ImageIsAttached */
  String COLUMNNAME_ImageIsAttached = "ImageIsAttached";
  /** Column name ImageURL */
  String COLUMNNAME_ImageURL = "ImageURL";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsDefault */
  String COLUMNNAME_IsDefault = "IsDefault";
  /** Column name IsMultiLineHeader */
  String COLUMNNAME_IsMultiLineHeader = "IsMultiLineHeader";
  /** Column name IsPaintBoundaryLines */
  String COLUMNNAME_IsPaintBoundaryLines = "IsPaintBoundaryLines";
  /** Column name IsPaintHeaderLines */
  String COLUMNNAME_IsPaintHeaderLines = "IsPaintHeaderLines";
  /** Column name IsPaintHLines */
  String COLUMNNAME_IsPaintHLines = "IsPaintHLines";
  /** Column name IsPaintVLines */
  String COLUMNNAME_IsPaintVLines = "IsPaintVLines";
  /** Column name IsPrintFunctionSymbols */
  String COLUMNNAME_IsPrintFunctionSymbols = "IsPrintFunctionSymbols";
  /** Column name Line_PrintColor_ID */
  String COLUMNNAME_Line_PrintColor_ID = "Line_PrintColor_ID";
  /** Column name LineStroke */
  String COLUMNNAME_LineStroke = "LineStroke";
  /** Column name LineStrokeType */
  String COLUMNNAME_LineStrokeType = "LineStrokeType";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Image. Image or Icon */
  int getAD_Image_ID();

  /** Set Image. Image or Icon */
  void setAD_Image_ID(int AD_Image_ID);

  I_AD_Image getAD_Image() throws RuntimeException;

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Print Table Format. Table Format in Reports */
  int getAD_PrintTableFormat_ID();

  /** Set Print Table Format. Table Format in Reports */
  void setAD_PrintTableFormat_ID(int AD_PrintTableFormat_ID);

  /** Get AD_PrintTableFormat_UU */
  String getAD_PrintTableFormat_UU();

  /** Set AD_PrintTableFormat_UU */
  void setAD_PrintTableFormat_UU(String AD_PrintTableFormat_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Footer Center. Content of the center portion of the footer. */
  String getFooterCenter();

  /** Set Footer Center. Content of the center portion of the footer. */
  void setFooterCenter(String FooterCenter);

  /** Get Footer Left. Content of the left portion of the footer. */
  String getFooterLeft();

  /** Set Footer Left. Content of the left portion of the footer. */
  void setFooterLeft(String FooterLeft);

  /** Get Footer Right. Content of the right portion of the footer. */
  String getFooterRight();

  /** Set Footer Right. Content of the right portion of the footer. */
  void setFooterRight(String FooterRight);

  /** Get Function BG Color. Function Background Color */
  int getFunctBG_PrintColor_ID();

  /** Set Function BG Color. Function Background Color */
  void setFunctBG_PrintColor_ID(int FunctBG_PrintColor_ID);

  I_AD_PrintColor getFunctBG_PrintColor() throws RuntimeException;

  /** Get Function Color. Function Foreground Color */
  int getFunctFG_PrintColor_ID();

  /** Set Function Color. Function Foreground Color */
  void setFunctFG_PrintColor_ID(int FunctFG_PrintColor_ID);

  I_AD_PrintColor getFunctFG_PrintColor() throws RuntimeException;

  /** Get Function Font. Function row Font */
  int getFunct_PrintFont_ID();

  /** Set Function Font. Function row Font */
  void setFunct_PrintFont_ID(int Funct_PrintFont_ID);

  I_AD_PrintFont getFunct_PrintFont() throws RuntimeException;

  /** Get Header Line Color. Table header row line color */
  int getHdrLine_PrintColor_ID();

  /** Set Header Line Color. Table header row line color */
  void setHdrLine_PrintColor_ID(int HdrLine_PrintColor_ID);

  I_AD_PrintColor getHdrLine_PrintColor() throws RuntimeException;

  /** Get Header Row Font. Header row Font */
  int getHdr_PrintFont_ID();

  /** Set Header Row Font. Header row Font */
  void setHdr_PrintFont_ID(int Hdr_PrintFont_ID);

  I_AD_PrintFont getHdr_PrintFont() throws RuntimeException;

  /** Get Header Stroke. Width of the Header Line Stroke */
  BigDecimal getHdrStroke();

  /** Set Header Stroke. Width of the Header Line Stroke */
  void setHdrStroke(BigDecimal HdrStroke);

  /** Get Header Stroke Type. Type of the Header Line Stroke */
  String getHdrStrokeType();

  /** Set Header Stroke Type. Type of the Header Line Stroke */
  void setHdrStrokeType(String HdrStrokeType);

  /** Get Header Row BG Color. Background color of header row */
  int getHdrTextBG_PrintColor_ID();

  /** Set Header Row BG Color. Background color of header row */
  void setHdrTextBG_PrintColor_ID(int HdrTextBG_PrintColor_ID);

  I_AD_PrintColor getHdrTextBG_PrintColor() throws RuntimeException;

  /** Get Header Row Color. Foreground color if the table header row */
  int getHdrTextFG_PrintColor_ID();

  /** Set Header Row Color. Foreground color if the table header row */
  void setHdrTextFG_PrintColor_ID(int HdrTextFG_PrintColor_ID);

  I_AD_PrintColor getHdrTextFG_PrintColor() throws RuntimeException;

  /** Get Header Center. Content of the center portion of the header. */
  String getHeaderCenter();

  /** Set Header Center. Content of the center portion of the header. */
  void setHeaderCenter(String HeaderCenter);

  /** Get Header Left. Content of the left portion of the header. */
  String getHeaderLeft();

  /** Set Header Left. Content of the left portion of the header. */
  void setHeaderLeft(String HeaderLeft);

  /** Get Header Right. Content of the right portion of the header. */
  String getHeaderRight();

  /** Set Header Right. Content of the right portion of the header. */
  void setHeaderRight(String HeaderRight);

  /** Get Image attached. The image to be printed is attached to the record */
  boolean isImageIsAttached();

  /** Set Image attached. The image to be printed is attached to the record */
  void setImageIsAttached(boolean ImageIsAttached);

  /** Get Image URL. URL of image */
  String getImageURL();

  /** Set Image URL. URL of image */
  void setImageURL(String ImageURL);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Default. Default value */
  void setIsDefault(boolean IsDefault);

  /** Get Default. Default value */
  boolean isDefault();

  /** Set Multi Line Header. Print column headers on mutliple lines if necessary. */
  void setIsMultiLineHeader(boolean IsMultiLineHeader);

  /** Get Multi Line Header. Print column headers on mutliple lines if necessary. */
  boolean isMultiLineHeader();

  /** Set Paint Boundary Lines. Paint table boundary lines */
  void setIsPaintBoundaryLines(boolean IsPaintBoundaryLines);

  /** Get Paint Boundary Lines. Paint table boundary lines */
  boolean isPaintBoundaryLines();

  /** Set Paint Header Lines. Paint Lines over/under the Header Line */
  void setIsPaintHeaderLines(boolean IsPaintHeaderLines);

  /** Get Paint Header Lines. Paint Lines over/under the Header Line */
  boolean isPaintHeaderLines();

  /** Set Paint Horizontal Lines. Paint horizontal lines */
  void setIsPaintHLines(boolean IsPaintHLines);

  /** Get Paint Horizontal Lines. Paint horizontal lines */
  boolean isPaintHLines();

  /** Set Paint Vertical Lines. Paint vertical lines */
  void setIsPaintVLines(boolean IsPaintVLines);

  /** Get Paint Vertical Lines. Paint vertical lines */
  boolean isPaintVLines();

  /** Set Print Function Symbols. Print Symbols for Functions (Sum, Average, Count) */
  void setIsPrintFunctionSymbols(boolean IsPrintFunctionSymbols);

  /** Get Print Function Symbols. Print Symbols for Functions (Sum, Average, Count) */
  boolean isPrintFunctionSymbols();

  /** Get Line Color. Table line color */
  int getLine_PrintColor_ID();

  /** Set Line Color. Table line color */
  void setLine_PrintColor_ID(int Line_PrintColor_ID);

  I_AD_PrintColor getLine_PrintColor() throws RuntimeException;

  /** Get Line Stroke. Width of the Line Stroke */
  BigDecimal getLineStroke();

  /** Set Line Stroke. Width of the Line Stroke */
  void setLineStroke(BigDecimal LineStroke);

  /** Get Line Stroke Type. Type of the Line Stroke */
  String getLineStrokeType();

  /** Set Line Stroke Type. Type of the Line Stroke */
  void setLineStrokeType(String LineStrokeType);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
