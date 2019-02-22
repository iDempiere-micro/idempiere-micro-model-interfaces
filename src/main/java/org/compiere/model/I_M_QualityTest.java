package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_QualityTest
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_QualityTest {

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
     * Column name M_QualityTest_ID
     */
    String COLUMNNAME_M_QualityTest_ID = "M_QualityTest_ID";
    /**
     * Column name M_QualityTest_UU
     */
    String COLUMNNAME_M_QualityTest_UU = "M_QualityTest_UU";

    /**
     * Get Quality Test
     */
    int getM_QualityTest_ID();

}
