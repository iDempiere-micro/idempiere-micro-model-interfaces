package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_SubAcct
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_SubAcct {

    /**
     * AD_Table_ID=825
     */
    int Table_ID = 825;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name C_ElementValue_ID
     */
    String COLUMNNAME_C_ElementValue_ID = "C_ElementValue_ID";

    /**
     * Get Account Element. Account Element
     */
    int getElementValueId();

}
