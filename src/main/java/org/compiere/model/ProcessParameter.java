package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Process_Para
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface ProcessParameter {

    /**
     * TableName=AD_Process_Para
     */
    String Table_Name = "AD_Process_Para";

    /**
     * AD_Table_ID=285
     */
    int Table_ID = 285;

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);


    /**
     * Column name AD_Element_ID
     */
    String COLUMNNAME_AD_Element_ID = "AD_Element_ID";
    /**
     * Column name AD_Process_ID
     */
    String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
    /**
     * Column name AD_Process_Para_ID
     */
    String COLUMNNAME_AD_Process_Para_ID = "AD_Process_Para_ID";
    /**
     * Column name AD_Reference_ID
     */
    String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
    /**
     * Column name AD_Reference_Value_ID
     */
    String COLUMNNAME_AD_Reference_Value_ID = "AD_Reference_Value_ID";
    /**
     * Column name AD_Val_Rule_ID
     */
    String COLUMNNAME_AD_Val_Rule_ID = "AD_Val_Rule_ID";
    /**
     * Column name ColumnName
     */
    String COLUMNNAME_ColumnName = "ColumnName";
    /**
     * Column name DefaultValue
     */
    String COLUMNNAME_DefaultValue = "DefaultValue";
    /**
     * Column name DefaultValue2
     */
    String COLUMNNAME_DefaultValue2 = "DefaultValue2";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DisplayLogic
     */
    String COLUMNNAME_DisplayLogic = "DisplayLogic";
    /**
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name FieldLength
     */
    String COLUMNNAME_FieldLength = "FieldLength";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsCentrallyMaintained
     */
    String COLUMNNAME_IsCentrallyMaintained = "IsCentrallyMaintained";
    /**
     * Column name IsMandatory
     */
    String COLUMNNAME_IsMandatory = "IsMandatory";
    /**
     * Column name IsRange
     */
    String COLUMNNAME_IsRange = "IsRange";
    /**
     * Column name ReadOnlyLogic
     */
    String COLUMNNAME_ReadOnlyLogic = "ReadOnlyLogic";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name ValueMax
     */
    String COLUMNNAME_ValueMax = "ValueMax";
    /**
     * Column name ValueMin
     */
    String COLUMNNAME_ValueMin = "ValueMin";
    /**
     * Column name VFormat
     */
    String COLUMNNAME_VFormat = "VFormat";

    /**
     * Get System Element. System Element enables the central maintenance of column description and
     * help.
     */
    int getElementId();

    /**
     * Set System Element. System Element enables the central maintenance of column description and
     * help.
     */
    void setElementId(int AD_Element_ID);

    /**
     * Set Process. Process or Report
     */
    void setProcessId(int AD_Process_ID);

    /**
     * Get Process Parameter
     */
    int getProcessParameterId();

    /**
     * Get Reference. System Reference and Validation
     */
    int getReferenceId();

    /**
     * Set Reference. System Reference and Validation
     */
    void setReferenceId(int AD_Reference_ID);

    /**
     * Get Reference Key. Required to specify, if data type is Table or List
     */
    int getReferenceValueId();

    /**
     * Set Reference Key. Required to specify, if data type is Table or List
     */
    void setReferenceValueId(int AD_Reference_Value_ID);

    /**
     * Set Dynamic Validation. Dynamic Validation Rule
     */
    void setAdValRuleId(int AD_Val_Rule_ID);

    /**
     * Get Dynamic Validation. Dynamic Validation Rule
     */
    int getValRuleId();

    /**
     * Get DB Column Name. Name of the column in the database
     */
    String getColumnName();

    /**
     * Set DB Column Name. Name of the column in the database
     */
    void setColumnName(String ColumnName);

    /**
     * Get Default Logic. Default value hierarchy, separated by ;
     */
    String getDefaultValue();

    /**
     * Set Default Logic. Default value hierarchy, separated by ;
     */
    void setDefaultValue(String DefaultValue);

    /**
     * Get Default Logic 2. Default value hierarchy, separated by ;
     */
    String getDefaultValue2();

    /**
     * Set Default Logic 2. Default value hierarchy, separated by ;
     */
    void setDefaultValue2(String DefaultValue2);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

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
     * Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization
     */
    void setEntityType(String EntityType);

    /**
     * Get Length. Length of the column in the database
     */
    int getFieldLength();

    /**
     * Set Length. Length of the column in the database
     */
    void setFieldLength(int FieldLength);

    /**
     * Get Comment/Help. Comment or Hint
     */
    String getHelp();

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

    /**
     * Set Centrally maintained. Information maintained in System Element table
     */
    void setIsCentrallyMaintained(boolean IsCentrallyMaintained);

    /**
     * Get Centrally maintained. Information maintained in System Element table
     */
    boolean isCentrallyMaintained();

    /**
     * Set Mandatory. Data entry is required in this column
     */
    void setIsMandatory(boolean IsMandatory);

    /**
     * Get Mandatory. Data entry is required in this column
     */
    boolean isMandatory();

    /**
     * Set Range. The parameter is a range of values
     */
    void setIsRange(boolean IsRange);

    /**
     * Get Range. The parameter is a range of values
     */
    boolean isRange();

    /**
     * Get Read Only Logic. Logic to determine if field is read only (applies only when field is
     * read-write)
     */
    String getReadOnlyLogic();

    /**
     * Set Read Only Logic. Logic to determine if field is read only (applies only when field is
     * read-write)
     */
    void setReadOnlyLogic(String ReadOnlyLogic);

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

    /**
     * Get Max. Value. Maximum Value for a field
     */
    String getValueMax();

    /**
     * Set Max. Value. Maximum Value for a field
     */
    void setValueMax(String ValueMax);

    /**
     * Get Min. Value. Minimum Value for a field
     */
    String getValueMin();

    /**
     * Set Min. Value. Minimum Value for a field
     */
    void setValueMin(String ValueMin);

    /**
     * Get Value Format. Format of the value; Can contain fixed format elements, Variables:
     * "_lLoOaAcCa09"
     */
    String getVFormat();

    /**
     * Set Value Format. Format of the value; Can contain fixed format elements, Variables:
     * "_lLoOaAcCa09"
     */
    void setVFormat(String VFormat);
}
