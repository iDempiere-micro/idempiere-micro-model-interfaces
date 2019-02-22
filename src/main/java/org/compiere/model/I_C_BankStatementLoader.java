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
     * TableName=C_BankStatementLoader
     */
    String Table_Name = "C_BankStatementLoader";

    /**
     * AD_Table_ID=640
     */
    int Table_ID = 640;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AccountNo
     */
    String COLUMNNAME_AccountNo = "AccountNo";
    /**
     * Column name BranchID
     */
    String COLUMNNAME_BranchID = "BranchID";
    /**
     * Column name C_BankAccount_ID
     */
    String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
    /**
     * Column name C_BankStatementLoader_ID
     */
    String COLUMNNAME_C_BankStatementLoader_ID = "C_BankStatementLoader_ID";
    /**
     * Column name C_BankStatementLoader_UU
     */
    String COLUMNNAME_C_BankStatementLoader_UU = "C_BankStatementLoader_UU";
    /**
     * Column name DateFormat
     */
    String COLUMNNAME_DateFormat = "DateFormat";
    /**
     * Column name DateLastRun
     */
    String COLUMNNAME_DateLastRun = "DateLastRun";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name FileName
     */
    String COLUMNNAME_FileName = "FileName";
    /**
     * Column name FinancialInstitutionID
     */
    String COLUMNNAME_FinancialInstitutionID = "FinancialInstitutionID";
    /**
     * Column name HostAddress
     */
    String COLUMNNAME_HostAddress = "HostAddress";
    /**
     * Column name HostPort
     */
    String COLUMNNAME_HostPort = "HostPort";
    /**
     * Column name Password
     */
    String COLUMNNAME_Password = "Password";
    /**
     * Column name PIN
     */
    String COLUMNNAME_PIN = "PIN";
    /**
     * Column name ProxyAddress
     */
    String COLUMNNAME_ProxyAddress = "ProxyAddress";
    /**
     * Column name ProxyLogon
     */
    String COLUMNNAME_ProxyLogon = "ProxyLogon";
    /**
     * Column name ProxyPassword
     */
    String COLUMNNAME_ProxyPassword = "ProxyPassword";
    /**
     * Column name ProxyPort
     */
    String COLUMNNAME_ProxyPort = "ProxyPort";
    /**
     * Column name StmtLoaderClass
     */
    String COLUMNNAME_StmtLoaderClass = "StmtLoaderClass";
    /**
     * Column name UserID
     */
    String COLUMNNAME_UserID = "UserID";

    /**
     * Get Bank Account. Account at the Bank
     */
    int getC_BankAccount_ID();

    /**
     * Get Statement Loader Class. Class name of the bank statement loader
     */
    String getStmtLoaderClass();

}
