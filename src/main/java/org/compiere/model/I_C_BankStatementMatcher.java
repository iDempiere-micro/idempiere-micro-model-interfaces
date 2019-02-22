package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_BankStatementMatcher
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BankStatementMatcher {

    /**
     * TableName=C_BankStatementMatcher
     */
    String Table_Name = "C_BankStatementMatcher";

    /**
     * AD_Table_ID=658
     */
    int Table_ID = 658;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name C_BankStatementMatcher_ID
     */
    String COLUMNNAME_C_BankStatementMatcher_ID = "C_BankStatementMatcher_ID";
    /**
     * Column name C_BankStatementMatcher_UU
     */
    String COLUMNNAME_C_BankStatementMatcher_UU = "C_BankStatementMatcher_UU";
    /**
     * Column name Classname
     */
    String COLUMNNAME_Classname = "Classname";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";

    /**
     * Get Classname. Java Classname
     */
    String getClassname();

}
