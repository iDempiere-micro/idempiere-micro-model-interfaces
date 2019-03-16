package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for R_RequestAction
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_RequestAction {

    /**
     * AD_Table_ID=418
     */
    int Table_ID = 418;

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);


    /**
     * Column name A_Asset_ID
     */
    String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
    /**
     * Column name AD_Role_ID
     */
    String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name C_Activity_ID
     */
    String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_Invoice_ID
     */
    String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
    /**
     * Column name C_Order_ID
     */
    String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name C_Payment_ID
     */
    String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name M_InOut_ID
     */
    String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name M_ProductSpent_ID
     */
    String COLUMNNAME_M_ProductSpent_ID = "M_ProductSpent_ID";
    /**
     * Column name M_RMA_ID
     */
    String COLUMNNAME_M_RMA_ID = "M_RMA_ID";
    /**
     * Column name NullColumns
     */
    String COLUMNNAME_NullColumns = "NullColumns";
    /**
     * Column name R_Category_ID
     */
    String COLUMNNAME_R_Category_ID = "R_Category_ID";
    /**
     * Column name R_Group_ID
     */
    String COLUMNNAME_R_Group_ID = "R_Group_ID";
    /**
     * Column name R_Request_ID
     */
    String COLUMNNAME_R_Request_ID = "R_Request_ID";
    /**
     * Column name R_RequestType_ID
     */
    String COLUMNNAME_R_RequestType_ID = "R_RequestType_ID";
    /**
     * Column name R_Resolution_ID
     */
    String COLUMNNAME_R_Resolution_ID = "R_Resolution_ID";
    /**
     * Column name R_Status_ID
     */
    String COLUMNNAME_R_Status_ID = "R_Status_ID";
    /**
     * Column name SalesRep_ID
     */
    String COLUMNNAME_SalesRep_ID = "SalesRep_ID";

    /**
     * Set Request. Request from a Business Partner or Prospect
     */
    void setRequestId(int R_Request_ID);

}
