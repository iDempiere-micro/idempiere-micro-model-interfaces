package org.compiere.model;

import org.idempiere.icommon.model.PersistentObject;

import java.math.BigDecimal;

/**
 * Generated Interface for M_QualityTest
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_QualityTest extends PersistentObject {

    /**
     * TableName=M_QualityTest
     */
    String Table_Name = "M_QualityTest";

    /**
     * AD_Table_ID=53332
     */
    int Table_ID = 53332;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name M_QualityTest_ID
     */
    String COLUMNNAME_M_QualityTest_ID = "M_QualityTest_ID";

    /**
     * Get Quality Test
     */
    int getQualityTestId();

    I_M_QualityTestResult createResult(int attributeSetInstanceId);
}
