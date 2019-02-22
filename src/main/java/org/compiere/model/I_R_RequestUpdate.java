package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for R_RequestUpdate
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_RequestUpdate {

    /**
     * TableName=R_RequestUpdate
     */
    String Table_Name = "R_RequestUpdate";

    /**
     * AD_Table_ID=802
     */
    int Table_ID = 802;

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /**
     * Column name ConfidentialTypeEntry
     */
    String COLUMNNAME_ConfidentialTypeEntry = "ConfidentialTypeEntry";
    /**
     * Column name EndTime
     */
    String COLUMNNAME_EndTime = "EndTime";
    /**
     * Column name M_ProductSpent_ID
     */
    String COLUMNNAME_M_ProductSpent_ID = "M_ProductSpent_ID";
    /**
     * Column name QtyInvoiced
     */
    String COLUMNNAME_QtyInvoiced = "QtyInvoiced";
    /**
     * Column name QtySpent
     */
    String COLUMNNAME_QtySpent = "QtySpent";
    /**
     * Column name Result
     */
    String COLUMNNAME_Result = "Result";
    /**
     * Column name R_Request_ID
     */
    String COLUMNNAME_R_Request_ID = "R_Request_ID";
    /**
     * Column name R_RequestUpdate_ID
     */
    String COLUMNNAME_R_RequestUpdate_ID = "R_RequestUpdate_ID";
    /**
     * Column name R_RequestUpdate_UU
     */
    String COLUMNNAME_R_RequestUpdate_UU = "R_RequestUpdate_UU";
    /**
     * Column name StartTime
     */
    String COLUMNNAME_StartTime = "StartTime";

    /**
     * Get Entry Confidentiality. Confidentiality of the individual entry
     */
    String getConfidentialTypeEntry();

    /**
     * Set Entry Confidentiality. Confidentiality of the individual entry
     */
    void setConfidentialTypeEntry(String ConfidentialTypeEntry);

    /**
     * Get Product Used. Product/Resource/Service used in Request
     */
    int getM_ProductSpent_ID();

    /**
     * Get Quantity Invoiced. Invoiced Quantity
     */
    BigDecimal getQtyInvoiced();

    /**
     * Get Result. Result of the action taken
     */
    String getResult();

    /**
     * Get Request. Request from a Business Partner or Prospect
     */
    int getR_Request_ID();

    /**
     * Set Request. Request from a Business Partner or Prospect
     */
    void setR_Request_ID(int R_Request_ID);

    /**
     * Get Request Update. Request Updates
     */
    int getR_RequestUpdate_ID();

}
