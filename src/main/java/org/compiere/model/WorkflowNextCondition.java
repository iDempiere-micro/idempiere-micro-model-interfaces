package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for AD_WF_NextCondition
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface WorkflowNextCondition {

    /**
     * TableName=AD_WF_NextCondition
     */
    String Table_Name = "AD_WF_NextCondition";

    /**
     * AD_Table_ID=706
     */
    int Table_ID = 706;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);


    /**
     * Column name AD_Column_ID
     */
    String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
    /**
     * Column name AD_WF_NodeNext_ID
     */
    String COLUMNNAME_AD_WF_NodeNext_ID = "AD_WF_NodeNext_ID";
    /**
     * Column name AndOr
     */
    String COLUMNNAME_AndOr = "AndOr";
    /**
     * Column name Operation
     */
    String COLUMNNAME_Operation = "Operation";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";
    /**
     * Column name Value2
     */
    String COLUMNNAME_Value2 = "Value2";

    /**
     * Get Column. Column in the table
     */
    int getColumnId();

    /**
     * Get And/Or. Logical operation: AND or OR
     */
    String getAndOr();

    /**
     * Get Operation. Compare Operation
     */
    String getOperation();

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Get Value To. Value To
     */
    String getValue2();

}
