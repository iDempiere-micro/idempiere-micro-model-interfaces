package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Table_ScriptValidator
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Table_ScriptValidator {

    /**
     * TableName=AD_Table_ScriptValidator
     */
    String Table_Name = "AD_Table_ScriptValidator";

    /**
     * AD_Table_ID=53059
     */
    int Table_ID = 53059;

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);


    /**
     * Column name AD_Rule_ID
     */
    String COLUMNNAME_AD_Rule_ID = "AD_Rule_ID";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name EventModelValidator
     */
    String COLUMNNAME_EventModelValidator = "EventModelValidator";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";

    /**
     * Get Rule
     */
    int getRuleId();

    /**
     * Get Table. Database Table information
     */
    int getDBTableId();

    /**
     * Get Event Model Validator
     */
    String getEventModelValidator();

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

}
