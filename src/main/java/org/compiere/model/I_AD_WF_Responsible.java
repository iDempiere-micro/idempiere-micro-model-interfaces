package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_WF_Responsible
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_WF_Responsible {

    /**
     * TableName=AD_WF_Responsible
     */
    String Table_Name = "AD_WF_Responsible";

    /**
     * AD_Table_ID=646
     */
    int Table_ID = 646;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);


    /**
     * Column name AD_Role_ID
     */
    String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
    /**
     * Column name ResponsibleType
     */
    String COLUMNNAME_ResponsibleType = "ResponsibleType";

    /**
     * Get Role. Responsibility Role
     */
    int getRoleId();

    /**
     * Set Role. Responsibility Role
     */
    void setRoleId(int AD_Role_ID);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Get Responsible Type. Type of the Responsibility for a workflow
     */
    String getResponsibleType();

}
