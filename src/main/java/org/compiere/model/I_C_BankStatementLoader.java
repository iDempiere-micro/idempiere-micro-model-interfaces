package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_BankStatementLoader
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BankStatementLoader {

    /**
     * AD_Table_ID=640
     */
    int Table_ID = 640;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);



    /**
     * Column name C_BankAccount_ID
     */
    String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
    /**
     * Column name StmtLoaderClass
     */
    String COLUMNNAME_StmtLoaderClass = "StmtLoaderClass";

    /**
     * Get Statement Loader Class. Class name of the bank statement loader
     */
    String getStmtLoaderClass();

}
