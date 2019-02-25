package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_POSTenderType
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_POSTenderType {

    /**
     * AD_Table_ID=200017
     */
    int Table_ID = 200017;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);



    /**
     * Column name IsGuarantee
     */
    String COLUMNNAME_IsGuarantee = "IsGuarantee";

    /**
     * Get Guarantee. Guarantee for a Credit
     */
    boolean isGuarantee();

}
