package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_BankStatementLoader
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BankStatementLoader {

  /** TableName=C_BankStatementLoader */
  String Table_Name = "C_BankStatementLoader";

  /** AD_Table_ID=640 */
  int Table_ID = 640;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AccountNo */
  String COLUMNNAME_AccountNo = "AccountNo";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name BranchID */
  String COLUMNNAME_BranchID = "BranchID";
  /** Column name C_BankAccount_ID */
  String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
  /** Column name C_BankStatementLoader_ID */
  String COLUMNNAME_C_BankStatementLoader_ID = "C_BankStatementLoader_ID";
  /** Column name C_BankStatementLoader_UU */
  String COLUMNNAME_C_BankStatementLoader_UU = "C_BankStatementLoader_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DateFormat */
  String COLUMNNAME_DateFormat = "DateFormat";
  /** Column name DateLastRun */
  String COLUMNNAME_DateLastRun = "DateLastRun";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name FileName */
  String COLUMNNAME_FileName = "FileName";
  /** Column name FinancialInstitutionID */
  String COLUMNNAME_FinancialInstitutionID = "FinancialInstitutionID";
  /** Column name HostAddress */
  String COLUMNNAME_HostAddress = "HostAddress";
  /** Column name HostPort */
  String COLUMNNAME_HostPort = "HostPort";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Password */
  String COLUMNNAME_Password = "Password";
  /** Column name PIN */
  String COLUMNNAME_PIN = "PIN";
  /** Column name ProxyAddress */
  String COLUMNNAME_ProxyAddress = "ProxyAddress";
  /** Column name ProxyLogon */
  String COLUMNNAME_ProxyLogon = "ProxyLogon";
  /** Column name ProxyPassword */
  String COLUMNNAME_ProxyPassword = "ProxyPassword";
  /** Column name ProxyPort */
  String COLUMNNAME_ProxyPort = "ProxyPort";
  /** Column name StmtLoaderClass */
  String COLUMNNAME_StmtLoaderClass = "StmtLoaderClass";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name UserID */
  String COLUMNNAME_UserID = "UserID";

  /** Get Account No. Account Number */
  String getAccountNo();

  /** Set Account No. Account Number */
  void setAccountNo(String AccountNo);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Branch ID. Bank Branch ID */
  String getBranchID();

  /** Set Branch ID. Bank Branch ID */
  void setBranchID(String BranchID);

  /** Get Bank Account. Account at the Bank */
  int getC_BankAccount_ID();

  /** Set Bank Account. Account at the Bank */
  void setC_BankAccount_ID(int C_BankAccount_ID);

  I_C_BankAccount getC_BankAccount() throws RuntimeException;

  /** Get Bank Statement Loader. Definition of Bank Statement Loader (SWIFT, OFX) */
  int getC_BankStatementLoader_ID();

  /** Set Bank Statement Loader. Definition of Bank Statement Loader (SWIFT, OFX) */
  void setC_BankStatementLoader_ID(int C_BankStatementLoader_ID);

  /** Get C_BankStatementLoader_UU */
  String getC_BankStatementLoader_UU();

  /** Set C_BankStatementLoader_UU */
  void setC_BankStatementLoader_UU(String C_BankStatementLoader_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Date Format. Date format used in the input format */
  String getDateFormat();

  /** Set Date Format. Date format used in the input format */
  void setDateFormat(String DateFormat);

  /** Get Date last run. Date the process was last run. */
  Timestamp getDateLastRun();

  /** Set Date last run. Date the process was last run. */
  void setDateLastRun(Timestamp DateLastRun);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get File Name. Name of the local file or URL */
  String getFileName();

  /** Set File Name. Name of the local file or URL */
  void setFileName(String FileName);

  /** Get Financial Institution ID. The ID of the Financial Institution / Bank */
  String getFinancialInstitutionID();

  /** Set Financial Institution ID. The ID of the Financial Institution / Bank */
  void setFinancialInstitutionID(String FinancialInstitutionID);

  /** Get Host Address. Host Address URL or DNS */
  String getHostAddress();

  /** Set Host Address. Host Address URL or DNS */
  void setHostAddress(String HostAddress);

  /** Get Host port. Host Communication Port */
  int getHostPort();

  /** Set Host port. Host Communication Port */
  void setHostPort(int HostPort);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Password. Password of any length (case sensitive) */
  String getPassword();

  /** Set Password. Password of any length (case sensitive) */
  void setPassword(String Password);

  /** Get PIN. Personal Identification Number */
  String getPIN();

  /** Set PIN. Personal Identification Number */
  void setPIN(String PIN);

  /** Get Proxy address. Address of your proxy server */
  String getProxyAddress();

  /** Set Proxy address. Address of your proxy server */
  void setProxyAddress(String ProxyAddress);

  /** Get Proxy logon. Logon of your proxy server */
  String getProxyLogon();

  /** Set Proxy logon. Logon of your proxy server */
  void setProxyLogon(String ProxyLogon);

  /** Get Proxy password. Password of your proxy server */
  String getProxyPassword();

  /** Set Proxy password. Password of your proxy server */
  void setProxyPassword(String ProxyPassword);

  /** Get Proxy port. Port of your proxy server */
  int getProxyPort();

  /** Set Proxy port. Port of your proxy server */
  void setProxyPort(int ProxyPort);

  /** Get Statement Loader Class. Class name of the bank statement loader */
  String getStmtLoaderClass();

  /** Set Statement Loader Class. Class name of the bank statement loader */
  void setStmtLoaderClass(String StmtLoaderClass);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get User ID. User ID or account number */
  String getUserID();

  /** Set User ID. User ID or account number */
  void setUserID(String UserID);
}
