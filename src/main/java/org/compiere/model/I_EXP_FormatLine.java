package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for EXP_FormatLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_EXP_FormatLine {

    /**
     * TableName=EXP_FormatLine
     */
    String Table_Name = "EXP_FormatLine";

    /**
     * AD_Table_ID=53073
     */
    int Table_ID = 53073;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

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
     * Column name AD_Reference_ID
     */
    String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DateFormat
     */
    String COLUMNNAME_DateFormat = "DateFormat";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name EXP_EmbeddedFormat_ID
     */
    String COLUMNNAME_EXP_EmbeddedFormat_ID = "EXP_EmbeddedFormat_ID";
    /**
     * Column name EXP_Format_ID
     */
    String COLUMNNAME_EXP_Format_ID = "EXP_Format_ID";
    /**
     * Column name EXP_FormatLine_ID
     */
    String COLUMNNAME_EXP_FormatLine_ID = "EXP_FormatLine_ID";
    /**
     * Column name EXP_FormatLine_UU
     */
    String COLUMNNAME_EXP_FormatLine_UU = "EXP_FormatLine_UU";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsMandatory
     */
    String COLUMNNAME_IsMandatory = "IsMandatory";
    /**
     * Column name IsPartUniqueIndex
     */
    String COLUMNNAME_IsPartUniqueIndex = "IsPartUniqueIndex";
    /**
     * Column name Position
     */
    String COLUMNNAME_Position = "Position";
    /**
     * Column name Type
     */
    String COLUMNNAME_Type = "Type";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

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
     * Get Reference. System Reference and Validation
     */
    int getAD_Reference_ID();

    /**
     * Set Reference. System Reference and Validation
     */
    void setAD_Reference_ID(int AD_Reference_ID);

    I_AD_Reference getAD_Reference() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Date Format. Date format used in the input format
     */
    String getDateFormat();

    /**
     * Set Date Format. Date format used in the input format
     */
    void setDateFormat(String DateFormat);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Embedded Format
     */
    int getEXP_EmbeddedFormat_ID();

    /**
     * Set Embedded Format
     */
    void setEXP_EmbeddedFormat_ID(int EXP_EmbeddedFormat_ID);

    I_EXP_Format getEXP_EmbeddedFormat() throws RuntimeException;

    /**
     * Get Export Format
     */
    int getEXP_Format_ID();

    /**
     * Set Export Format
     */
    void setEXP_Format_ID(int EXP_Format_ID);

    I_EXP_Format getEXP_Format() throws RuntimeException;

    /**
     * Get Format Line
     */
    int getEXP_FormatLine_ID();

    /**
     * Set Format Line
     */
    void setEXP_FormatLine_ID(int EXP_FormatLine_ID);

    /**
     * Get EXP_FormatLine_UU
     */
    String getEXP_FormatLine_UU();

    /**
     * Set EXP_FormatLine_UU
     */
    void setEXP_FormatLine_UU(String EXP_FormatLine_UU);

    /**
     * Get Comment/Help. Comment or Hint
     */
    String getHelp();

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Mandatory. Data entry is required in this column
     */
    void setIsMandatory(boolean IsMandatory);

    /**
     * Get Mandatory. Data entry is required in this column
     */
    boolean isMandatory();

    /**
     * Set Is Part Unique Index
     */
    void setIsPartUniqueIndex(boolean IsPartUniqueIndex);

    /**
     * Get Is Part Unique Index
     */
    boolean isPartUniqueIndex();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Position
     */
    int getPosition();

    /**
     * Set Position
     */
    void setPosition(int Position);

    /**
     * Get Type. Type of Validation (SQL, Java Script, Java Language)
     */
    String getType();

    /**
     * Set Type. Type of Validation (SQL, Java Script, Java Language)
     */
    void setType(String Type);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);
}
