package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Workflow_Access
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Workflow_Access {

    /**
     * AD_Table_ID=202
     */
    int Table_ID = 202;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);


    /**
     * Column name AD_Role_ID
     */
    String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
    /**
     * Column name AD_Workflow_ID
     */
    String COLUMNNAME_AD_Workflow_ID = "AD_Workflow_ID";
    /**
     * Column name IsReadWrite
     */
    String COLUMNNAME_IsReadWrite = "IsReadWrite";

    /**
     * Set Role. Responsibility Role
     */
    void setRoleId(int AD_Role_ID);

    /**
     * Set Workflow. Workflow or combination of tasks
     */
    void setWorkflowId(int AD_Workflow_ID);

    /**
     * Set Read Write. Field is read / write
     */
    void setIsReadWrite(boolean IsReadWrite);

}
