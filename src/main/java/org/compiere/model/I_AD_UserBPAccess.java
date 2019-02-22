package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_UserBPAccess
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_UserBPAccess {

    /**
     * TableName=AD_UserBPAccess
     */
    String Table_Name = "AD_UserBPAccess";

    /**
     * AD_Table_ID=813
     */
    int Table_ID = 813;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name AD_UserBPAccess_ID
     */
    String COLUMNNAME_AD_UserBPAccess_ID = "AD_UserBPAccess_ID";
    /**
     * Column name AD_UserBPAccess_UU
     */
    String COLUMNNAME_AD_UserBPAccess_UU = "AD_UserBPAccess_UU";
    /**
     * Column name BPAccessType
     */
    String COLUMNNAME_BPAccessType = "BPAccessType";
    /**
     * Column name DocBaseType
     */
    String COLUMNNAME_DocBaseType = "DocBaseType";
    /**
     * Column name R_RequestType_ID
     */
    String COLUMNNAME_R_RequestType_ID = "R_RequestType_ID";

    /**
     * Get Request Type. Type of request (e.g. Inquiry, Complaint, ..)
     */
    int getR_RequestType_ID();

}
