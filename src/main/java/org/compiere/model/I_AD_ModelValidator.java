package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_ModelValidator
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ModelValidator {

    /**
     * TableName=AD_ModelValidator
     */
    String Table_Name = "AD_ModelValidator";

    /**
     * AD_Table_ID=53014
     */
    int Table_ID = 53014;

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /**
     * Column name AD_ModelValidator_ID
     */
    String COLUMNNAME_AD_ModelValidator_ID = "AD_ModelValidator_ID";
    /**
     * Column name AD_ModelValidator_UU
     */
    String COLUMNNAME_AD_ModelValidator_UU = "AD_ModelValidator_UU";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name ModelValidationClass
     */
    String COLUMNNAME_ModelValidationClass = "ModelValidationClass";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";

    /**
     * Get Model Validation Class
     */
    String getModelValidationClass();

}
