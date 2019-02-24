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



    /**
     * Column name ConfidentialTypeEntry
     */
    String COLUMNNAME_ConfidentialTypeEntry = "ConfidentialTypeEntry";
    /**
     * Column name M_ProductSpent_ID
     */
    String COLUMNNAME_M_ProductSpent_ID = "M_ProductSpent_ID";
    /**
     * Column name QtyInvoiced
     */
    String COLUMNNAME_QtyInvoiced = "QtyInvoiced";
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
     * Set Request. Request from a Business Partner or Prospect
     */
    void setR_Request_ID(int R_Request_ID);

}
