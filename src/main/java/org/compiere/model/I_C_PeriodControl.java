package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_PeriodControl
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_PeriodControl {

    /**
     * AD_Table_ID=229
     */
    int Table_ID = 229;

    /**
     * TableName=C_PeriodControl
     */
    String Table_Name = "C_PeriodControl";


    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);


    /**
     * Column name C_PeriodControl_ID
     */
    String COLUMNNAME_C_PeriodControl_ID = "C_PeriodControl_ID";
    /**
     * Column name C_Period_ID
     */
    String COLUMNNAME_C_Period_ID = "C_Period_ID";
    /**
     * Column name DocBaseType
     */
    String COLUMNNAME_DocBaseType = "DocBaseType";
    /**
     * Column name PeriodAction
     */
    String COLUMNNAME_PeriodAction = "PeriodAction";
    /**
     * Column name PeriodStatus
     */
    String COLUMNNAME_PeriodStatus = "PeriodStatus";

    /**
     * Get Period. Period of the Calendar
     */
    int getPeriodId();

    /**
     * Set Period. Period of the Calendar
     */
    void setPeriodId(int C_Period_ID);

    /**
     * Get Document BaseType. Logical type of document
     */
    String getDocBaseType();

    /**
     * Set Document BaseType. Logical type of document
     */
    void setDocBaseType(String DocBaseType);

    /**
     * Get Period Action. Action taken for this period
     */
    String getPeriodAction();

    /**
     * Set Period Action. Action taken for this period
     */
    void setPeriodAction(String PeriodAction);

    /**
     * Get Period Status. Current state of this period
     */
    String getPeriodStatus();

    /**
     * Set Period Status. Current state of this period
     */
    void setPeriodStatus(String PeriodStatus);

}
