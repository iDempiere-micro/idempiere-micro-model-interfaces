package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for R_RequestProcessor_Route
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_RequestProcessor_Route {

    /**
     * TableName=R_RequestProcessor_Route
     */
    String Table_Name = "R_RequestProcessor_Route";

    /**
     * AD_Table_ID=474
     */
    int Table_ID = 474;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name Keyword
     */
    String COLUMNNAME_Keyword = "Keyword";
    /**
     * Column name R_RequestProcessor_ID
     */
    String COLUMNNAME_R_RequestProcessor_ID = "R_RequestProcessor_ID";
    /**
     * Column name R_RequestProcessor_Route_ID
     */
    String COLUMNNAME_R_RequestProcessor_Route_ID = "R_RequestProcessor_Route_ID";
    /**
     * Column name R_RequestProcessor_Route_UU
     */
    String COLUMNNAME_R_RequestProcessor_Route_UU = "R_RequestProcessor_Route_UU";
    /**
     * Column name R_RequestType_ID
     */
    String COLUMNNAME_R_RequestType_ID = "R_RequestType_ID";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Get Request Processor. Processor for Requests
     */
    int getR_RequestProcessor_ID();

    /**
     * Get Request Type. Type of request (e.g. Inquiry, Complaint, ..)
     */
    int getR_RequestType_ID();

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

}
