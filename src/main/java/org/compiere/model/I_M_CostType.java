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
     * TableName=M_CostType
     */
    String Table_Name = "M_CostType";

    /**
     * AD_Table_ID=586
     */
    int Table_ID = 586;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name M_CostType_ID
     */
    String COLUMNNAME_M_CostType_ID = "M_CostType_ID";
    /**
     * Column name M_CostType_UU
     */
    String COLUMNNAME_M_CostType_UU = "M_CostType_UU";

    /**
     * Get Cost Type. Type of Cost (e.g. Current, Plan, Future)
     */
    int getM_CostType_ID();

}
