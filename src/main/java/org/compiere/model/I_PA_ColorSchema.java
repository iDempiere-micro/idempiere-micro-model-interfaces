package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for PA_ColorSchema
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_ColorSchema {

    /**
     * TableName=PA_ColorSchema
     */
    String Table_Name = "PA_ColorSchema";

    /**
     * AD_Table_ID=831
     */
    int Table_ID = 831;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_PrintColor1_ID
     */
    String COLUMNNAME_AD_PrintColor1_ID = "AD_PrintColor1_ID";
    /**
     * Column name AD_PrintColor2_ID
     */
    String COLUMNNAME_AD_PrintColor2_ID = "AD_PrintColor2_ID";
    /**
     * Column name AD_PrintColor3_ID
     */
    String COLUMNNAME_AD_PrintColor3_ID = "AD_PrintColor3_ID";
    /**
     * Column name AD_PrintColor4_ID
     */
    String COLUMNNAME_AD_PrintColor4_ID = "AD_PrintColor4_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name Mark1Percent
     */
    String COLUMNNAME_Mark1Percent = "Mark1Percent";
    /**
     * Column name Mark2Percent
     */
    String COLUMNNAME_Mark2Percent = "Mark2Percent";
    /**
     * Column name Mark3Percent
     */
    String COLUMNNAME_Mark3Percent = "Mark3Percent";
    /**
     * Column name Mark4Percent
     */
    String COLUMNNAME_Mark4Percent = "Mark4Percent";
    /**
     * Column name PA_ColorSchema_ID
     */
    String COLUMNNAME_PA_ColorSchema_ID = "PA_ColorSchema_ID";
    /**
     * Column name PA_ColorSchema_UU
     */
    String COLUMNNAME_PA_ColorSchema_UU = "PA_ColorSchema_UU";

    /**
     * Get Color 1. First color used
     */
    int getAD_PrintColor1_ID();

    /**
     * Set Color 1. First color used
     */
    void setAD_PrintColor1_ID(int AD_PrintColor1_ID);

    /**
     * Get Color 2. Second color used
     */
    int getAD_PrintColor2_ID();

    /**
     * Set Color 2. Second color used
     */
    void setAD_PrintColor2_ID(int AD_PrintColor2_ID);

    /**
     * Get Color 3. Third color used
     */
    int getAD_PrintColor3_ID();

    /**
     * Set Color 3. Third color used
     */
    void setAD_PrintColor3_ID(int AD_PrintColor3_ID);

    /**
     * Get Color 4. Forth color used
     */
    int getAD_PrintColor4_ID();

    /**
     * Get Mark 1 Percent. Percentage up to this color is used
     */
    int getMark1Percent();

    /**
     * Set Mark 1 Percent. Percentage up to this color is used
     */
    void setMark1Percent(int Mark1Percent);

    /**
     * Get Mark 2 Percent. Percentage up to this color is used
     */
    int getMark2Percent();

    /**
     * Set Mark 2 Percent. Percentage up to this color is used
     */
    void setMark2Percent(int Mark2Percent);

    /**
     * Get Mark 3 Percent. Percentage up to this color is used
     */
    int getMark3Percent();

    /**
     * Set Mark 3 Percent. Percentage up to this color is used
     */
    void setMark3Percent(int Mark3Percent);

    /**
     * Get Mark 4 Percent. Percentage up to this color is used
     */
    int getMark4Percent();

    /**
     * Set Mark 4 Percent. Percentage up to this color is used
     */
    void setMark4Percent(int Mark4Percent);

}
