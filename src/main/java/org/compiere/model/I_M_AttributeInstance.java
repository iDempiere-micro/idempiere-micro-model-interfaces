package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_AttributeInstance
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_AttributeInstance {

    /**
     * TableName=M_AttributeInstance
     */
    String Table_Name = "M_AttributeInstance";

    /**
     * AD_Table_ID=561
     */
    int Table_ID = 561;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name M_Attribute_ID
     */
    String COLUMNNAME_M_Attribute_ID = "M_Attribute_ID";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_AttributeValue_ID
     */
    String COLUMNNAME_M_AttributeValue_ID = "M_AttributeValue_ID";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";
    /**
     * Column name ValueNumber
     */
    String COLUMNNAME_ValueNumber = "ValueNumber";

    /**
     * Set Attribute. Product Attribute
     */
    void setMAttributeID(int M_Attribute_ID);

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setAttributeSetInstanceId(int M_AttributeSetInstance_ID);

    /**
     * Set Attribute Value. Product Attribute Value
     */
    void setM_AttributeValue_ID(int M_AttributeValue_ID);

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);

    /**
     * Set Value. Numeric Value
     */
    void setValueNumber(BigDecimal ValueNumber);
}
