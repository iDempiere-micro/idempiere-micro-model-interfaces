package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_StyleLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_StyleLine {

    /**
     * TableName=AD_StyleLine
     */
    String Table_Name = "AD_StyleLine";

    /**
     * AD_Table_ID=200208
     */
    int Table_ID = 200208;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Style_ID
     */
    String COLUMNNAME_AD_Style_ID = "AD_Style_ID";
    /**
     * Column name AD_StyleLine_ID
     */
    String COLUMNNAME_AD_StyleLine_ID = "AD_StyleLine_ID";
    /**
     * Column name AD_StyleLine_UU
     */
    String COLUMNNAME_AD_StyleLine_UU = "AD_StyleLine_UU";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DisplayLogic
     */
    String COLUMNNAME_DisplayLogic = "DisplayLogic";
    /**
     * Column name InlineStyle
     */
    String COLUMNNAME_InlineStyle = "InlineStyle";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name Line
     */
    String COLUMNNAME_Line = "Line";
    /**
     * Column name Theme
     */
    String COLUMNNAME_Theme = "Theme";
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
     * Get Style. CSS style for field and label
     */
    int getAD_Style_ID();

    /**
     * Set Style. CSS style for field and label
     */
    void setAD_Style_ID(int AD_Style_ID);

    I_AD_Style getAD_Style() throws RuntimeException;

    /**
     * Get Style Line. CSS Style Line
     */
    int getAD_StyleLine_ID();

    /**
     * Set Style Line. CSS Style Line
     */
    void setAD_StyleLine_ID(int AD_StyleLine_ID);

    /**
     * Get Style Line. CSS Style Line
     */
    String getAD_StyleLine_UU();

    /**
     * Set Style Line. CSS Style Line
     */
    void setAD_StyleLine_UU(String AD_StyleLine_UU);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Display Logic. If the Field is displayed, the result determines if the field is actually
     * displayed
     */
    String getDisplayLogic();

    /**
     * Set Display Logic. If the Field is displayed, the result determines if the field is actually
     * displayed
     */
    void setDisplayLogic(String DisplayLogic);

    /**
     * Get Inline Style. CSS Inline Style
     */
    String getInlineStyle();

    /**
     * Set Inline Style. CSS Inline Style
     */
    void setInlineStyle(String InlineStyle);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Line No. Unique line for this document
     */
    int getLine();

    /**
     * Set Line No. Unique line for this document
     */
    void setLine(int Line);

    /**
     * Get Theme. Theme name
     */
    String getTheme();

    /**
     * Set Theme. Theme name
     */
    void setTheme(String Theme);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
