package org.compiere.model;

import org.idempiere.icommon.model.IPO;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

/**
 * Generated Interface for M_CostElement
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_CostElement extends IPO, HasName {

    /**
     * TableName=M_CostElement
     */
    String Table_Name = "M_CostElement";

    /**
     * AD_Table_ID=770
     */
    int Table_ID = 770;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);


    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name CostElementType
     */
    String COLUMNNAME_CostElementType = "CostElementType";
    /**
     * Column name CostingMethod
     */
    String COLUMNNAME_CostingMethod = "CostingMethod";
    /**
     * Column name IsCalculated
     */
    String COLUMNNAME_IsCalculated = "IsCalculated";
    /**
     * Column name M_CostElement_ID
     */
    String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";

    boolean isFifo();

    /**
     * Get Cost Element Type. Type of Cost Element
     */
    String getCostElementType();

    /**
     * Set Cost Element Type. Type of Cost Element
     */
    void setCostElementType(String CostElementType);

    /**
     * Get Costing Method. Indicates how Costs will be calculated
     */
    String getCostingMethod();

    /**
     * Set Costing Method. Indicates how Costs will be calculated
     */
    void setCostingMethod(String CostingMethod);

    /**
     * Set Calculated. The value is calculated by the system
     */
    void setIsCalculated(boolean IsCalculated);

    /**
     * Get Calculated. The value is calculated by the system
     */
    boolean isCalculated();

    /**
     * Get Cost Element. Product Cost Element
     */
    int getCostElementId();

    void setClientOrg(int clientId, int i);

    void saveEx();

    boolean isAverageInvoice();

    boolean isAveragePO();

    boolean isLifo();

    boolean isLastPOPrice();

    boolean isStandardCosting();

    boolean isUserDefined();

    boolean isCostingMethod();

    boolean isLastInvoice();
}
