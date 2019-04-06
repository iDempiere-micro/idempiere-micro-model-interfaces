package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_CostType
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_CostType {

    /**
     * AD_Table_ID=586
     */
    int Table_ID = 586;

    /**
     * TableName=M_CostType
     */
    String Table_Name = "M_CostType";

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);


    /**
     * Column name M_CostType_ID
     */
    String COLUMNNAME_M_CostType_ID = "M_CostType_ID";

    /**
     * Get Cost Type. Type of Cost (e.g. Current, Plan, Future)
     */
    int getCostTypeId();

}
