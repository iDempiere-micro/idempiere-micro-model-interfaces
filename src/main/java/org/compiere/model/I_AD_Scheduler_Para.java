package org.compiere.model;

import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_Scheduler_Para
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Scheduler_Para extends IPO {

    /**
     * TableName=AD_Scheduler_Para
     */
    String Table_Name = "AD_Scheduler_Para";

    /**
     * AD_Table_ID=698
     */
    int Table_ID = 698;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);


    /**
     * Column name AD_Process_Para_ID
     */
    String COLUMNNAME_AD_Process_Para_ID = "AD_Process_Para_ID";
    /**
     * Column name AD_Scheduler_ID
     */
    String COLUMNNAME_AD_Scheduler_ID = "AD_Scheduler_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name ParameterDefault
     */
    String COLUMNNAME_ParameterDefault = "ParameterDefault";
    /**
     * Column name ParameterToDefault
     */
    String COLUMNNAME_ParameterToDefault = "ParameterToDefault";

    /**
     * Get Process Parameter
     */
    int getProcessParameterId();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Get Default Parameter. Default value of the parameter
     */
    String getParameterDefault();

    /**
     * Get Default To Parameter. Default value of the to parameter
     */
    String getParameterToDefault();

}
