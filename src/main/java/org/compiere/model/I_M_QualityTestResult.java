package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_QualityTestResult
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_QualityTestResult {

    /**
     * AD_Table_ID=53331
     */
    int Table_ID = 53331;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name IsQCPass
     */
    String COLUMNNAME_IsQCPass = "IsQCPass";
    /**
     * Column name M_AttributeSetInstance_ID
     */
    String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
    /**
     * Column name M_QualityTest_ID
     */
    String COLUMNNAME_M_QualityTest_ID = "M_QualityTest_ID";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";

    /**
     * Set QC Pass
     */
    void setIsQCPass(boolean IsQCPass);

    /**
     * Set Attribute Set Instance. Product Attribute Set Instance
     */
    void setAttributeSetInstanceId(int M_AttributeSetInstance_ID);

    /**
     * Set Quality Test
     */
    void setM_QualityTest_ID(int M_QualityTest_ID);

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

}
