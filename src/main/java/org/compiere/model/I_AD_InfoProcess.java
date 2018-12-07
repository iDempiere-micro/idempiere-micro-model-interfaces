package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_InfoProcess
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_InfoProcess {

    /**
     * TableName=AD_InfoProcess
     */
    String Table_Name = "AD_InfoProcess";

    /**
     * AD_Table_ID=200129
     */
    int Table_ID = 200129;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_InfoColumn_ID
     */
    String COLUMNNAME_AD_InfoColumn_ID = "AD_InfoColumn_ID";
    /**
     * Column name AD_InfoProcess_ID
     */
    String COLUMNNAME_AD_InfoProcess_ID = "AD_InfoProcess_ID";
    /**
     * Column name AD_InfoProcess_UU
     */
    String COLUMNNAME_AD_InfoProcess_UU = "AD_InfoProcess_UU";
    /**
     * Column name AD_InfoWindow_ID
     */
    String COLUMNNAME_AD_InfoWindow_ID = "AD_InfoWindow_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Process_ID
     */
    String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
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
     * Column name ImageURL
     */
    String COLUMNNAME_ImageURL = "ImageURL";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name LayoutType
     */
    String COLUMNNAME_LayoutType = "LayoutType";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Info Column. Info Window Column
     */
    int getAD_InfoColumn_ID();

    /**
     * Set Info Column. Info Window Column
     */
    void setAD_InfoColumn_ID(int AD_InfoColumn_ID);

    I_AD_InfoColumn getAD_InfoColumn() throws RuntimeException;

    /**
     * Get Info Process
     */
    int getAD_InfoProcess_ID();

    /**
     * Set Info Process
     */
    void setAD_InfoProcess_ID(int AD_InfoProcess_ID);

    /**
     * Get AD_InfoProcess_UU
     */
    String getAD_InfoProcess_UU();

    /**
     * Set AD_InfoProcess_UU
     */
    void setAD_InfoProcess_UU(String AD_InfoProcess_UU);

    /**
     * Get Info Window. Info and search/select Window
     */
    int getAD_InfoWindow_ID();

    /**
     * Set Info Window. Info and search/select Window
     */
    void setAD_InfoWindow_ID(int AD_InfoWindow_ID);

    I_AD_InfoWindow getAD_InfoWindow() throws RuntimeException;

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Process. Process or Report
     */
    int getAD_Process_ID();

    /**
     * Set Process. Process or Report
     */
    void setAD_Process_ID(int AD_Process_ID);

    I_AD_Process getAD_Process() throws RuntimeException;

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
     * Get LayoutType. Layout type of info process
     */
    String getLayoutType();

    /**
     * Set LayoutType. Layout type of info process
     */
    void setLayoutType(String LayoutType);

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
