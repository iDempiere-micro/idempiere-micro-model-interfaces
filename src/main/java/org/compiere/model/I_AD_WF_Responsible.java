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

    /** Load Meta Data */

    /**
     * Column name AD_Role_ID
     */
    String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
    /**
     * Column name AD_WF_Responsible_ID
     */
    String COLUMNNAME_AD_WF_Responsible_ID = "AD_WF_Responsible_ID";
    /**
     * Column name AD_WF_Responsible_UU
     */
    String COLUMNNAME_AD_WF_Responsible_UU = "AD_WF_Responsible_UU";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name EntityType
     */
    String COLUMNNAME_EntityType = "EntityType";
    /**
     * Column name ResponsibleType
     */
    String COLUMNNAME_ResponsibleType = "ResponsibleType";

    /**
     * Get Role. Responsibility Role
     */
    int getAD_Role_ID();

    /**
     * Set Role. Responsibility Role
     */
    void setAD_Role_ID(int AD_Role_ID);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Get Responsible Type. Type of the Responsibility for a workflow
     */
    String getResponsibleType();

}
