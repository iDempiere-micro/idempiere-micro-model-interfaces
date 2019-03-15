package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_ModelValidator
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_ModelValidator {

    /** TableName=AD_ModelValidator */
    String Table_Name = "AD_ModelValidator";

    /**
     * AD_Table_ID=53014
     */
    int Table_ID = 53014;

    /**
     * AccessLevel = 4 - System
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);



    /**
     * Column name ModelValidationClass
     */
    String COLUMNNAME_ModelValidationClass = "ModelValidationClass";

    /**
     * Get Model Validation Class
     */
    String getModelValidationClass();

}
