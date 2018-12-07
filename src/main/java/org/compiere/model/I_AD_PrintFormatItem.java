package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_PrintFormatItem
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_PrintFormatItem {

    /**
     * TableName=AD_PrintFormatItem
     */
    String Table_Name = "AD_PrintFormatItem";

    /**
     * AD_Table_ID=489
     */
    int Table_ID = 489;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /**
     * Column name AD_Column_ID
     */
    String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_PrintColor_ID
     */
    String COLUMNNAME_AD_PrintColor_ID = "AD_PrintColor_ID";
    /**
     * Column name AD_PrintFont_ID
     */
    String COLUMNNAME_AD_PrintFont_ID = "AD_PrintFont_ID";
    /**
     * Column name AD_PrintFormatChild_ID
     */
    String COLUMNNAME_AD_PrintFormatChild_ID = "AD_PrintFormatChild_ID";
    /**
     * Column name AD_PrintFormat_ID
     */
    String COLUMNNAME_AD_PrintFormat_ID = "AD_PrintFormat_ID";
    /**
     * Column name AD_PrintFormatItem_ID
     */
    String COLUMNNAME_AD_PrintFormatItem_ID = "AD_PrintFormatItem_ID";
    /**
     * Column name AD_PrintFormatItem_UU
     */
    String COLUMNNAME_AD_PrintFormatItem_UU = "AD_PrintFormatItem_UU";
    /**
     * Column name AD_PrintGraph_ID
     */
    String COLUMNNAME_AD_PrintGraph_ID = "AD_PrintGraph_ID";
    /**
     * Column name ArcDiameter
     */
    String COLUMNNAME_ArcDiameter = "ArcDiameter";
    /**
     * Column name BarcodeType
     */
    String COLUMNNAME_BarcodeType = "BarcodeType";
    /**
     * Column name BelowColumn
     */
    String COLUMNNAME_BelowColumn = "BelowColumn";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name FieldAlignmentType
     */
    String COLUMNNAME_FieldAlignmentType = "FieldAlignmentType";
    /**
     * Column name FormatPattern
     */
    String COLUMNNAME_FormatPattern = "FormatPattern";
    /**
     * Column name ImageIsAttached
     */
    String COLUMNNAME_ImageIsAttached = "ImageIsAttached";
    /**
     * Column name ImageURL
     */
    String COLUMNNAME_ImageURL = "ImageURL";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsAveraged
     */
    String COLUMNNAME_IsAveraged = "IsAveraged";
    /**
     * Column name IsCentrallyMaintained
     */
    String COLUMNNAME_IsCentrallyMaintained = "IsCentrallyMaintained";
    /**
     * Column name IsCounted
     */
    String COLUMNNAME_IsCounted = "IsCounted";
    /**
     * Column name IsDesc
     */
    String COLUMNNAME_IsDesc = "IsDesc";
    /**
     * Column name IsDeviationCalc
     */
    String COLUMNNAME_IsDeviationCalc = "IsDeviationCalc";
    /**
     * Column name IsFilledRectangle
     */
    String COLUMNNAME_IsFilledRectangle = "IsFilledRectangle";
    /**
     * Column name IsFixedWidth
     */
    String COLUMNNAME_IsFixedWidth = "IsFixedWidth";
    /**
     * Column name IsGroupBy
     */
    String COLUMNNAME_IsGroupBy = "IsGroupBy";
    /**
     * Column name IsHeightOneLine
     */
    String COLUMNNAME_IsHeightOneLine = "IsHeightOneLine";
    /**
     * Column name IsImageField
     */
    String COLUMNNAME_IsImageField = "IsImageField";
    /**
     * Column name IsMaxCalc
     */
    String COLUMNNAME_IsMaxCalc = "IsMaxCalc";
    /**
     * Column name IsMinCalc
     */
    String COLUMNNAME_IsMinCalc = "IsMinCalc";
    /**
     * Column name IsNextLine
     */
    String COLUMNNAME_IsNextLine = "IsNextLine";
    /**
     * Column name IsNextPage
     */
    String COLUMNNAME_IsNextPage = "IsNextPage";
    /**
     * Column name IsOrderBy
     */
    String COLUMNNAME_IsOrderBy = "IsOrderBy";
    /**
     * Column name IsPageBreak
     */
    String COLUMNNAME_IsPageBreak = "IsPageBreak";
    /**
     * Column name IsPrinted
     */
    String COLUMNNAME_IsPrinted = "IsPrinted";
    /**
     * Column name IsRelativePosition
     */
    String COLUMNNAME_IsRelativePosition = "IsRelativePosition";
    /**
     * Column name IsRunningTotal
     */
    String COLUMNNAME_IsRunningTotal = "IsRunningTotal";
    /**
     * Column name IsSetNLPosition
     */
    String COLUMNNAME_IsSetNLPosition = "IsSetNLPosition";
    /**
     * Column name IsSummarized
     */
    String COLUMNNAME_IsSummarized = "IsSummarized";
    /**
     * Column name IsSuppressNull
     */
    String COLUMNNAME_IsSuppressNull = "IsSuppressNull";
    /**
     * Column name IsSuppressRepeats
     */
    String COLUMNNAME_IsSuppressRepeats = "IsSuppressRepeats";
    /**
     * Column name IsVarianceCalc
     */
    String COLUMNNAME_IsVarianceCalc = "IsVarianceCalc";
    /**
     * Column name LineAlignmentType
     */
    String COLUMNNAME_LineAlignmentType = "LineAlignmentType";
    /**
     * Column name LineWidth
     */
    String COLUMNNAME_LineWidth = "LineWidth";
    /**
     * Column name MaxHeight
     */
    String COLUMNNAME_MaxHeight = "MaxHeight";
    /**
     * Column name MaxWidth
     */
    String COLUMNNAME_MaxWidth = "MaxWidth";
    /**
     * Column name PrintAreaType
     */
    String COLUMNNAME_PrintAreaType = "PrintAreaType";
    /**
     * Column name PrintFormatType
     */
    String COLUMNNAME_PrintFormatType = "PrintFormatType";
    /**
     * Column name PrintName
     */
    String COLUMNNAME_PrintName = "PrintName";
    /**
     * Column name PrintNameSuffix
     */
    String COLUMNNAME_PrintNameSuffix = "PrintNameSuffix";
    /**
     * Column name RunningTotalLines
     */
    String COLUMNNAME_RunningTotalLines = "RunningTotalLines";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name ShapeType
     */
    String COLUMNNAME_ShapeType = "ShapeType";
    /**
     * Column name SortNo
     */
    String COLUMNNAME_SortNo = "SortNo";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name XPosition
     */
    String COLUMNNAME_XPosition = "XPosition";
    /**
     * Column name XSpace
     */
    String COLUMNNAME_XSpace = "XSpace";
    /**
     * Column name YPosition
     */
    String COLUMNNAME_YPosition = "YPosition";
    /**
     * Column name YSpace
     */
    String COLUMNNAME_YSpace = "YSpace";

    /**
     * Get Column. Column in the table
     */
    int getAD_Column_ID();

    /**
     * Set Column. Column in the table
     */
    void setAD_Column_ID(int AD_Column_ID);

    I_AD_Column getAD_Column() throws RuntimeException;

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Print Color. Color used for printing and display
     */
    int getAD_PrintColor_ID();

    /**
     * Set Print Color. Color used for printing and display
     */
    void setAD_PrintColor_ID(int AD_PrintColor_ID);

    I_AD_PrintColor getAD_PrintColor() throws RuntimeException;

    /**
     * Get Print Font. Maintain Print Font
     */
    int getAD_PrintFont_ID();

    /**
     * Set Print Font. Maintain Print Font
     */
    void setAD_PrintFont_ID(int AD_PrintFont_ID);

    I_AD_PrintFont getAD_PrintFont() throws RuntimeException;

    /**
     * Get Included Print Format. Print format that is included here.
     */
    int getAD_PrintFormatChild_ID();

    /**
     * Set Included Print Format. Print format that is included here.
     */
    void setAD_PrintFormatChild_ID(int AD_PrintFormatChild_ID);

    I_AD_PrintFormat getAD_PrintFormatChild() throws RuntimeException;

    /**
     * Get Print Format. Data Print Format
     */
    int getAD_PrintFormat_ID();

    /**
     * Set Print Format. Data Print Format
     */
    void setAD_PrintFormat_ID(int AD_PrintFormat_ID);

    I_AD_PrintFormat getAD_PrintFormat() throws RuntimeException;

    /**
     * Get Print Format Item. Item/Column in the Print format
     */
    int getAD_PrintFormatItem_ID();

    /**
     * Set Print Format Item. Item/Column in the Print format
     */
    void setAD_PrintFormatItem_ID(int AD_PrintFormatItem_ID);

    /**
     * Get AD_PrintFormatItem_UU
     */
    String getAD_PrintFormatItem_UU();

    /**
     * Set AD_PrintFormatItem_UU
     */
    void setAD_PrintFormatItem_UU(String AD_PrintFormatItem_UU);

    /**
     * Get Graph. Graph included in Reports
     */
    int getAD_PrintGraph_ID();

    /**
     * Set Graph. Graph included in Reports
     */
    void setAD_PrintGraph_ID(int AD_PrintGraph_ID);

    I_AD_PrintGraph getAD_PrintGraph() throws RuntimeException;

    /**
     * Get Arc Diameter. Arc Diameter for rounded Rectangles
     */
    int getArcDiameter();

    /**
     * Set Arc Diameter. Arc Diameter for rounded Rectangles
     */
    void setArcDiameter(int ArcDiameter);

    /**
     * Get Barcode Type. Type of barcode
     */
    String getBarcodeType();

    /**
     * Set Barcode Type. Type of barcode
     */
    void setBarcodeType(String BarcodeType);

    /**
     * Get Below Column. Print this column below the column index entered
     */
    int getBelowColumn();

    /**
     * Set Below Column. Print this column below the column index entered
     */
    void setBelowColumn(int BelowColumn);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Field Alignment. Field Text Alignment
     */
    String getFieldAlignmentType();

    /**
     * Set Field Alignment. Field Text Alignment
     */
    void setFieldAlignmentType(String FieldAlignmentType);

    /**
     * Get Format Pattern. The pattern used to format a number or date.
     */
    String getFormatPattern();

    /**
     * Set Format Pattern. The pattern used to format a number or date.
     */
    void setFormatPattern(String FormatPattern);

    /**
     * Get Image attached. The image to be printed is attached to the record
     */
    boolean isImageIsAttached();

    /**
     * Set Image attached. The image to be printed is attached to the record
     */
    void setImageIsAttached(boolean ImageIsAttached);

    /**
     * Get Image URL. URL of image
     */
    String getImageURL();

    /**
     * Set Image URL. URL of image
     */
    void setImageURL(String ImageURL);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Calculate Mean (μ). Calculate Average of numeric content or length
     */
    void setIsAveraged(boolean IsAveraged);

    /**
     * Get Calculate Mean (μ). Calculate Average of numeric content or length
     */
    boolean isAveraged();

    /**
     * Set Centrally maintained. Information maintained in System Element table
     */
    void setIsCentrallyMaintained(boolean IsCentrallyMaintained);

    /**
     * Get Centrally maintained. Information maintained in System Element table
     */
    boolean isCentrallyMaintained();

    /**
     * Set Calculate Count (№). Count number of not empty elements
     */
    void setIsCounted(boolean IsCounted);

    /**
     * Get Calculate Count (№). Count number of not empty elements
     */
    boolean isCounted();

    /**
     * Set Descending. Sort your data using a SQL Desc Order By statement
     */
    void setIsDesc(boolean IsDesc);

    /**
     * Get Descending. Sort your data using a SQL Desc Order By statement
     */
    boolean isDesc();

    /**
     * Set Calculate Deviation (σ). Calculate Standard Deviation
     */
    void setIsDeviationCalc(boolean IsDeviationCalc);

    /**
     * Get Calculate Deviation (σ). Calculate Standard Deviation
     */
    boolean isDeviationCalc();

    /**
     * Set Fill Shape. Fill the shape with the color selected
     */
    void setIsFilledRectangle(boolean IsFilledRectangle);

    /**
     * Get Fill Shape. Fill the shape with the color selected
     */
    boolean isFilledRectangle();

    /**
     * Set Fixed Width. Column has a fixed width
     */
    void setIsFixedWidth(boolean IsFixedWidth);

    /**
     * Get Fixed Width. Column has a fixed width
     */
    boolean isFixedWidth();

    /**
     * Set Group by. After a group change, totals, etc. are printed
     */
    void setIsGroupBy(boolean IsGroupBy);

    /**
     * Get Group by. After a group change, totals, etc. are printed
     */
    boolean isGroupBy();

    /**
     * Set One Line Only. If selected, only one line is printed
     */
    void setIsHeightOneLine(boolean IsHeightOneLine);

    /**
     * Get One Line Only. If selected, only one line is printed
     */
    boolean isHeightOneLine();

    /**
     * Set Image Field. The image is retrieved from the data column
     */
    void setIsImageField(boolean IsImageField);

    /**
     * Get Image Field. The image is retrieved from the data column
     */
    boolean isImageField();

    /**
     * Set Calculate Maximum (↑). Calculate the maximum amount
     */
    void setIsMaxCalc(boolean IsMaxCalc);

    /**
     * Get Calculate Maximum (↑). Calculate the maximum amount
     */
    boolean isMaxCalc();

    /**
     * Set Calculate Minimum (↓). Calculate the minimum amount
     */
    void setIsMinCalc(boolean IsMinCalc);

    /**
     * Get Calculate Minimum (↓). Calculate the minimum amount
     */
    boolean isMinCalc();

    /**
     * Set Next Line. Print item on next line
     */
    void setIsNextLine(boolean IsNextLine);

    /**
     * Get Next Line. Print item on next line
     */
    boolean isNextLine();

    /**
     * Set Next Page. The column is printed on the next page
     */
    void setIsNextPage(boolean IsNextPage);

    /**
     * Get Next Page. The column is printed on the next page
     */
    boolean isNextPage();

    /**
     * Set Order by. Include in sort order
     */
    void setIsOrderBy(boolean IsOrderBy);

    /**
     * Get Order by. Include in sort order
     */
    boolean isOrderBy();

    /**
     * Set Page break. Start with new page
     */
    void setIsPageBreak(boolean IsPageBreak);

    /**
     * Get Page break. Start with new page
     */
    boolean isPageBreak();

    /**
     * Set Printed. Indicates if this document / line is printed
     */
    void setIsPrinted(boolean IsPrinted);

    /**
     * Get Printed. Indicates if this document / line is printed
     */
    boolean isPrinted();

    /**
     * Set Relative Position. The item is relative positioned (not absolute)
     */
    void setIsRelativePosition(boolean IsRelativePosition);

    /**
     * Get Relative Position. The item is relative positioned (not absolute)
     */
    boolean isRelativePosition();

    /**
     * Set Running Total. Create a running total (sum)
     */
    void setIsRunningTotal(boolean IsRunningTotal);

    /**
     * Get Running Total. Create a running total (sum)
     */
    boolean isRunningTotal();

    /**
     * Set Set NL Position. Set New Line Position
     */
    void setIsSetNLPosition(boolean IsSetNLPosition);

    /**
     * Get Set NL Position. Set New Line Position
     */
    boolean isSetNLPosition();

    /**
     * Set Calculate Sum (Σ). Calculate the Sum of numeric content or length
     */
    void setIsSummarized(boolean IsSummarized);

    /**
     * Get Calculate Sum (Σ). Calculate the Sum of numeric content or length
     */
    boolean isSummarized();

    /**
     * Set Suppress Null. Suppress columns or elements with NULL value
     */
    void setIsSuppressNull(boolean IsSuppressNull);

    /**
     * Get Suppress Null. Suppress columns or elements with NULL value
     */
    boolean isSuppressNull();

    /**
     * Set Suppress Repeats. Suppress repeated elements in column.
     */
    void setIsSuppressRepeats(boolean IsSuppressRepeats);

    /**
     * Get Suppress Repeats. Suppress repeated elements in column.
     */
    boolean isSuppressRepeats();

    /**
     * Set Calculate Variance (σ²). Calculate Variance
     */
    void setIsVarianceCalc(boolean IsVarianceCalc);

    /**
     * Get Calculate Variance (σ²). Calculate Variance
     */
    boolean isVarianceCalc();

    /**
     * Get Line Alignment. Line Alignment
     */
    String getLineAlignmentType();

    /**
     * Set Line Alignment. Line Alignment
     */
    void setLineAlignmentType(String LineAlignmentType);

    /**
     * Get Line Width. Width of the lines
     */
    int getLineWidth();

    /**
     * Set Line Width. Width of the lines
     */
    void setLineWidth(int LineWidth);

    /**
     * Get Max Height. Maximum Height in 1/72 if an inch - 0 = no restriction
     */
    int getMaxHeight();

    /**
     * Set Max Height. Maximum Height in 1/72 if an inch - 0 = no restriction
     */
    void setMaxHeight(int MaxHeight);

    /**
     * Get Max Width. Maximum Width in 1/72 if an inch - 0 = no restriction
     */
    int getMaxWidth();

    /**
     * Set Max Width. Maximum Width in 1/72 if an inch - 0 = no restriction
     */
    void setMaxWidth(int MaxWidth);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Area. Print Area
     */
    String getPrintAreaType();

    /**
     * Set Area. Print Area
     */
    void setPrintAreaType(String PrintAreaType);

    /**
     * Get Format Type. Print Format Type
     */
    String getPrintFormatType();

    /**
     * Set Format Type. Print Format Type
     */
    void setPrintFormatType(String PrintFormatType);

    /**
     * Get Print Text. The label text to be printed on a document or correspondence.
     */
    String getPrintName();

    /**
     * Set Print Text. The label text to be printed on a document or correspondence.
     */
    void setPrintName(String PrintName);

    /**
     * Get Print Label Suffix. The label text to be printed on a document or correspondence after the
     * field
     */
    String getPrintNameSuffix();

    /**
     * Set Print Label Suffix. The label text to be printed on a document or correspondence after the
     * field
     */
    void setPrintNameSuffix(String PrintNameSuffix);

    /**
     * Get Running Total Lines. Create Running Total Lines (page break) every x lines
     */
    int getRunningTotalLines();

    /**
     * Set Running Total Lines. Create Running Total Lines (page break) every x lines
     */
    void setRunningTotalLines(int RunningTotalLines);

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

    /**
     * Get Shape Type. Type of the shape to be painted
     */
    String getShapeType();

    /**
     * Set Shape Type. Type of the shape to be painted
     */
    void setShapeType(String ShapeType);

    /**
     * Get Record Sort No. Determines in what order the records are displayed
     */
    int getSortNo();

    /**
     * Set Record Sort No. Determines in what order the records are displayed
     */
    void setSortNo(int SortNo);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get X Position. Absolute X (horizontal) position in 1/72 of an inch
     */
    int getXPosition();

    /**
     * Set X Position. Absolute X (horizontal) position in 1/72 of an inch
     */
    void setXPosition(int XPosition);

    /**
     * Get X Space. Relative X (horizontal) space in 1/72 of an inch
     */
    int getXSpace();

    /**
     * Set X Space. Relative X (horizontal) space in 1/72 of an inch
     */
    void setXSpace(int XSpace);

    /**
     * Get Y Position. Absolute Y (vertical) position in 1/72 of an inch
     */
    int getYPosition();

    /**
     * Set Y Position. Absolute Y (vertical) position in 1/72 of an inch
     */
    void setYPosition(int YPosition);

    /**
     * Get Y Space. Relative Y (vertical) space in 1/72 of an inch
     */
    int getYSpace();

    /**
     * Set Y Space. Relative Y (vertical) space in 1/72 of an inch
     */
    void setYSpace(int YSpace);
}
