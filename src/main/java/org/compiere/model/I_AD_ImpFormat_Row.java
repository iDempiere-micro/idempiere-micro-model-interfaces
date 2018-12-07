package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_ImpFormat_Row
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ImpFormat_Row {

    /**
     * TableName=AD_ImpFormat_Row
     */
    String Table_Name = "AD_ImpFormat_Row";

    /**
     * AD_Table_ID=382
     */
    int Table_ID = 382;

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
     * Column name AD_ImpFormat_ID
     */
    String COLUMNNAME_AD_ImpFormat_ID = "AD_ImpFormat_ID";
    /**
     * Column name AD_ImpFormat_Row_ID
     */
    String COLUMNNAME_AD_ImpFormat_Row_ID = "AD_ImpFormat_Row_ID";
    /**
     * Column name AD_ImpFormat_Row_UU
     */
    String COLUMNNAME_AD_ImpFormat_Row_UU = "AD_ImpFormat_Row_UU";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name Callout
     */
    String COLUMNNAME_Callout = "Callout";
    /**
     * Column name ConstantValue
     */
    String COLUMNNAME_ConstantValue = "ConstantValue";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DataFormat
     */
    String COLUMNNAME_DataFormat = "DataFormat";
    /**
     * Column name DataType
     */
    String COLUMNNAME_DataType = "DataType";
    /**
     * Column name DecimalPoint
     */
    String COLUMNNAME_DecimalPoint = "DecimalPoint";
    /**
     * Column name DivideBy100
     */
    String COLUMNNAME_DivideBy100 = "DivideBy100";
    /**
     * Column name EndNo
     */
    String COLUMNNAME_EndNo = "EndNo";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name Script
     */
    String COLUMNNAME_Script = "Script";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name StartNo
     */
    String COLUMNNAME_StartNo = "StartNo";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

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
     * Get Import Format
     */
    int getAD_ImpFormat_ID();

    /**
     * Set Import Format
     */
    void setAD_ImpFormat_ID(int AD_ImpFormat_ID);

    I_AD_ImpFormat getAD_ImpFormat() throws RuntimeException;

    /**
     * Get Format Field
     */
    int getAD_ImpFormat_Row_ID();

    /**
     * Set Format Field
     */
    void setAD_ImpFormat_Row_ID(int AD_ImpFormat_Row_ID);

    /**
     * Get AD_ImpFormat_Row_UU
     */
    String getAD_ImpFormat_Row_UU();

    /**
     * Set AD_ImpFormat_Row_UU
     */
    void setAD_ImpFormat_Row_UU(String AD_ImpFormat_Row_UU);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Callout. Fully qualified class names and method - separated by semicolons
     */
    String getCallout();

    /**
     * Set Callout. Fully qualified class names and method - separated by semicolons
     */
    void setCallout(String Callout);

    /**
     * Get Constant Value. Constant value
     */
    String getConstantValue();

    /**
     * Set Constant Value. Constant value
     */
    void setConstantValue(String ConstantValue);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Data Format. Format String in Java Notation, e.g. ddMMyy
     */
    String getDataFormat();

    /**
     * Set Data Format. Format String in Java Notation, e.g. ddMMyy
     */
    void setDataFormat(String DataFormat);

    /**
     * Get Data Type. Type of data
     */
    String getDataType();

    /**
     * Set Data Type. Type of data
     */
    void setDataType(String DataType);

    /**
     * Get Decimal Point. Decimal Point in the data file - if any
     */
    String getDecimalPoint();

    /**
     * Set Decimal Point. Decimal Point in the data file - if any
     */
    void setDecimalPoint(String DecimalPoint);

    /**
     * Get Divide by 100. Divide number by 100 to get correct amount
     */
    boolean isDivideBy100();

    /**
     * Set Divide by 100. Divide number by 100 to get correct amount
     */
    void setDivideBy100(boolean DivideBy100);

    /**
     * Get End No
     */
    int getEndNo();

    /**
     * Set End No
     */
    void setEndNo(int EndNo);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Script. Dynamic Java Language Script to calculate result
     */
    String getScript();

    /**
     * Set Script. Dynamic Java Language Script to calculate result
     */
    void setScript(String Script);

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

    /**
     * Get Start No. Starting number/position
     */
    int getStartNo();

    /**
     * Set Start No. Starting number/position
     */
    void setStartNo(int StartNo);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
