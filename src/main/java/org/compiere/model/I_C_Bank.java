package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_Bank
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Bank {

    /**
     * TableName=C_Bank
     */
    String Table_Name = "C_Bank";

    /**
     * AD_Table_ID=296
     */
    int Table_ID = 296;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name C_Bank_ID
     */
    String COLUMNNAME_C_Bank_ID = "C_Bank_ID";
    /**
     * Column name C_Bank_UU
     */
    String COLUMNNAME_C_Bank_UU = "C_Bank_UU";
    /**
     * Column name C_Location_ID
     */
    String COLUMNNAME_C_Location_ID = "C_Location_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsOwnBank
     */
    String COLUMNNAME_IsOwnBank = "IsOwnBank";
    /**
     * Column name RoutingNo
     */
    String COLUMNNAME_RoutingNo = "RoutingNo";
    /**
     * Column name SwiftCode
     */
    String COLUMNNAME_SwiftCode = "SwiftCode";

    /**
     * Get Address. Location or Address
     */
    int getC_Location_ID();

    /**
     * Get Routing No. Bank Routing Number
     */
    String getRoutingNo();

    /**
     * Set Routing No. Bank Routing Number
     */
    void setRoutingNo(String RoutingNo);

    /**
     * Get Swift code. Swift Code or BIC
     */
    String getSwiftCode();

}
