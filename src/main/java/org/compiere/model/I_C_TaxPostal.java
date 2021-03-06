package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_TaxPostal
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_TaxPostal {

    /**
     * TableName=C_TaxPostal
     */
    String Table_Name = "C_TaxPostal";

    /**
     * AD_Table_ID=701
     */
    int Table_ID = 701;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);


    /**
     * Column name C_Tax_ID
     */
    String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
    /**
     * Column name Postal
     */
    String COLUMNNAME_Postal = "Postal";
    /**
     * Column name Postal_To
     */
    String COLUMNNAME_Postal_To = "Postal_To";

    /**
     * Get ZIP. Postal code
     */
    String getPostal();

    /**
     * Get ZIP To. Postal code to
     */
    String getPostalTo();

}
