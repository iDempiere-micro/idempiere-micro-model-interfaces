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


    /**
     * Column name C_Location_ID
     */
    String COLUMNNAME_C_Location_ID = "C_Location_ID";
    /**
     * Column name RoutingNo
     */
    String COLUMNNAME_RoutingNo = "RoutingNo";
    /**
     * Column name SwiftCode
     */
    String COLUMNNAME_SwiftCode = "SwiftCode";

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
