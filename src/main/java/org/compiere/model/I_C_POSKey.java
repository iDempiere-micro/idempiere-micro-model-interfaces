package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_POSKey
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_POSKey {

    /**
     * TableName=C_POSKey
     */
    String Table_Name = "C_POSKey";

    /**
     * AD_Table_ID=750
     */
    int Table_ID = 750;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name AD_Image_ID
     */
    String COLUMNNAME_AD_Image_ID = "AD_Image_ID";
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
     * Column name C_POSKey_ID
     */
    String COLUMNNAME_C_POSKey_ID = "C_POSKey_ID";
    /**
     * Column name C_POSKeyLayout_ID
     */
    String COLUMNNAME_C_POSKeyLayout_ID = "C_POSKeyLayout_ID";
    /**
     * Column name C_POSKey_UU
     */
    String COLUMNNAME_C_POSKey_UU = "C_POSKey_UU";
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
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name SpanX
     */
    String COLUMNNAME_SpanX = "SpanX";
    /**
     * Column name SpanY
     */
    String COLUMNNAME_SpanY = "SpanY";
    /**
     * Column name SubKeyLayout_ID
     */
    String COLUMNNAME_SubKeyLayout_ID = "SubKeyLayout_ID";
    /**
     * Column name Text
     */
    String COLUMNNAME_Text = "Text";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Image. Image or Icon
     */
    int getAD_Image_ID();

    /**
     * Set Image. Image or Icon
     */
    void setAD_Image_ID(int AD_Image_ID);

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
     * Get POS Key. POS Function Key
     */
    int getC_POSKey_ID();

    /**
     * Set POS Key. POS Function Key
     */
    void setC_POSKey_ID(int C_POSKey_ID);

    /**
     * Get POS Key Layout. POS Function Key Layout
     */
    int getC_POSKeyLayout_ID();

    /**
     * Set POS Key Layout. POS Function Key Layout
     */
    void setC_POSKeyLayout_ID(int C_POSKeyLayout_ID);

    I_C_POSKeyLayout getC_POSKeyLayout() throws RuntimeException;

    /**
     * Get C_POSKey_UU
     */
    String getC_POSKey_UU();

    /**
     * Set C_POSKey_UU
     */
    void setC_POSKey_UU(String C_POSKey_UU);

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
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Set Product. Product, Service, Item
     */
    void setM_Product_ID(int M_Product_ID);

    I_M_Product getM_Product() throws RuntimeException;

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Quantity. Quantity
     */
    BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    void setQty(BigDecimal Qty);

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

    /**
     * Get Column span. Number of columns spanned
     */
    int getSpanX();

    /**
     * Set Column span. Number of columns spanned
     */
    void setSpanX(int SpanX);

    /**
     * Get Row Span. Number of rows spanned
     */
    int getSpanY();

    /**
     * Set Row Span. Number of rows spanned
     */
    void setSpanY(int SpanY);

    /**
     * Get Key Layout. Key Layout to be displayed when this key is pressed
     */
    int getSubKeyLayout_ID();

    /**
     * Set Key Layout. Key Layout to be displayed when this key is pressed
     */
    void setSubKeyLayout_ID(int SubKeyLayout_ID);

    I_C_POSKeyLayout getSubKeyLayout() throws RuntimeException;

    /**
     * Get Description
     */
    String getText();

    /**
     * Set Description
     */
    void setText(String Text);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
