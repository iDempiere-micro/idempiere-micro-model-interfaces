package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Process_Access
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Process_Access {

    /**
     * AD_Table_ID=197
     */
    int Table_ID = 197;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);



    /**
     * Column name AD_Process_ID
     */
    String COLUMNNAME_AD_Process_ID = "AD_Process_ID";
    /**
     * Column name AD_Role_ID
     */
    String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
    /**
     * Column name IsReadWrite
     */
    String COLUMNNAME_IsReadWrite = "IsReadWrite";

    /**
     * Set Process. Process or Report
     */
    void setProcessId(int AD_Process_ID);

    /**
     * Set Role. Responsibility Role
     */
    void setRoleId(int AD_Role_ID);

    /**
     * Set Read Write. Field is read / write
     */
    void setIsReadWrite(boolean IsReadWrite);

}
