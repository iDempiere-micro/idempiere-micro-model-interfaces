package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Attribute_Value
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Attribute_Value {

    /**
     * TableName=AD_Attribute_Value
     */
    String Table_Name = "AD_Attribute_Value";

    /**
     * AD_Table_ID=406
     */
    int Table_ID = 406;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /**
     * Column name AD_Attribute_ID
     */
    String COLUMNNAME_AD_Attribute_ID = "AD_Attribute_ID";
    /**
     * Column name AD_Attribute_Value_UU
     */
    String COLUMNNAME_AD_Attribute_Value_UU = "AD_Attribute_Value_UU";
    /**
     * Column name Record_ID
     */
    String COLUMNNAME_Record_ID = "Record_ID";
    /**
     * Column name V_Date
     */
    String COLUMNNAME_V_Date = "V_Date";
    /**
     * Column name V_Number
     */
    String COLUMNNAME_V_Number = "V_Number";
    /**
     * Column name V_String
     */
    String COLUMNNAME_V_String = "V_String";

    /**
     * Get System Attribute
     */
    int getAD_Attribute_ID();

    /**
     * Set System Attribute
     */
    void setAD_Attribute_ID(int AD_Attribute_ID);

    /**
     * Get AD_Attribute_Value_UU
     */
    String getAD_Attribute_Value_UU();

    /**
     * Set AD_Attribute_Value_UU
     */
    void setAD_Attribute_Value_UU(String AD_Attribute_Value_UU);

    /**
     * Get Record ID. Direct internal record ID
     */
    int getRecord_ID();

    /**
     * Set Record ID. Direct internal record ID
     */
    void setRecord_ID(int Record_ID);

    /**
     * Get Date
     */
    Timestamp getV_Date();

    /**
     * Set Date
     */
    void setV_Date(Timestamp V_Date);

    /**
     * Get Number
     */
    String getV_Number();

    /**
     * Set Number
     */
    void setV_Number(String V_Number);

    /**
     * Get String
     */
    String getV_String();

    /**
     * Set String
     */
    void setV_String(String V_String);
}
