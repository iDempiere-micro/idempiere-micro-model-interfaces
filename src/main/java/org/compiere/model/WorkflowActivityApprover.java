package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_WF_ActivityApprover
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface WorkflowActivityApprover {

    /**
     * TableName=AD_WF_ActivityApprover
     */
    String Table_Name = "AD_WF_ActivityApprover";

    /**
     * AD_Table_ID=200226
     */
    int Table_ID = 200226;

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);


    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name AD_WF_Activity_ID
     */
    String COLUMNNAME_AD_WF_Activity_ID = "AD_WF_Activity_ID";

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getUserId();

}
