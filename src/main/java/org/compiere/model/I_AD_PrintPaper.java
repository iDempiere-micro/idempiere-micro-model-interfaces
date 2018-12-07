package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_PrintPaper
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_PrintPaper {

    /**
     * TableName=AD_PrintPaper
     */
    String Table_Name = "AD_PrintPaper";

    /**
     * AD_Table_ID=492
     */
    int Table_ID = 492;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_PrintPaper_ID
     */
    String COLUMNNAME_AD_PrintPaper_ID = "AD_PrintPaper_ID";
    /**
     * Column name AD_PrintPaper_UU
     */
    String COLUMNNAME_AD_PrintPaper_UU = "AD_PrintPaper_UU";
    /**
     * Column name Code
     */
    String COLUMNNAME_Code = "Code";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DimensionUnits
     */
    String COLUMNNAME_DimensionUnits = "DimensionUnits";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name IsLandscape
     */
    String COLUMNNAME_IsLandscape = "IsLandscape";
    /**
     * Column name MarginBottom
     */
    String COLUMNNAME_MarginBottom = "MarginBottom";
    /**
     * Column name MarginLeft
     */
    String COLUMNNAME_MarginLeft = "MarginLeft";
    /**
     * Column name MarginRight
     */
    String COLUMNNAME_MarginRight = "MarginRight";
    /**
     * Column name MarginTop
     */
    String COLUMNNAME_MarginTop = "MarginTop";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name SizeX
     */
    String COLUMNNAME_SizeX = "SizeX";
    /**
     * Column name SizeY
     */
    String COLUMNNAME_SizeY = "SizeY";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Print Paper. Printer paper definition
     */
    int getAD_PrintPaper_ID();

    /**
     * Set Print Paper. Printer paper definition
     */
    void setAD_PrintPaper_ID(int AD_PrintPaper_ID);

    /**
     * Get AD_PrintPaper_UU
     */
    String getAD_PrintPaper_UU();

    /**
     * Set AD_PrintPaper_UU
     */
    void setAD_PrintPaper_UU(String AD_PrintPaper_UU);

    /**
     * Get Validation code. Validation Code
     */
    String getCode();

    /**
     * Set Validation code. Validation Code
     */
    void setCode(String Code);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Dimension Units. Units of Dimension
     */
    String getDimensionUnits();

    /**
     * Set Dimension Units. Units of Dimension
     */
    void setDimensionUnits(String DimensionUnits);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    boolean isDefault();

    /**
     * Set Landscape. Landscape orientation
     */
    void setIsLandscape(boolean IsLandscape);

    /**
     * Get Landscape. Landscape orientation
     */
    boolean isLandscape();

    /**
     * Get Bottom Margin. Bottom Space in 1/72 inch
     */
    int getMarginBottom();

    /**
     * Set Bottom Margin. Bottom Space in 1/72 inch
     */
    void setMarginBottom(int MarginBottom);

    /**
     * Get Left Margin. Left Space in 1/72 inch
     */
    int getMarginLeft();

    /**
     * Set Left Margin. Left Space in 1/72 inch
     */
    void setMarginLeft(int MarginLeft);

    /**
     * Get Right Margin. Right Space in 1/72 inch
     */
    int getMarginRight();

    /**
     * Set Right Margin. Right Space in 1/72 inch
     */
    void setMarginRight(int MarginRight);

    /**
     * Get Top Margin. Top Space in 1/72 inch
     */
    int getMarginTop();

    /**
     * Set Top Margin. Top Space in 1/72 inch
     */
    void setMarginTop(int MarginTop);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Size X. X (horizontal) dimension size
     */
    BigDecimal getSizeX();

    /**
     * Set Size X. X (horizontal) dimension size
     */
    void setSizeX(BigDecimal SizeX);

    /**
     * Get Size Y. Y (vertical) dimension size
     */
    BigDecimal getSizeY();

    /**
     * Set Size Y. Y (vertical) dimension size
     */
    void setSizeY(BigDecimal SizeY);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
