package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for U_POSTerminal
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_U_POSTerminal {

  /** TableName=U_POSTerminal */
  String Table_Name = "U_POSTerminal";

  /** AD_Table_ID=52004 */
  int Table_ID = 52004;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AutoLock */
  String COLUMNNAME_AutoLock = "AutoLock";
  /** Column name Card_BankAccount_ID */
  String COLUMNNAME_Card_BankAccount_ID = "Card_BankAccount_ID";
  /** Column name CardTransferBankAccount_ID */
  String COLUMNNAME_CardTransferBankAccount_ID = "CardTransferBankAccount_ID";
  /** Column name CardTransferCashBook_ID */
  String COLUMNNAME_CardTransferCashBook_ID = "CardTransferCashBook_ID";
  /** Column name CardTransferType */
  String COLUMNNAME_CardTransferType = "CardTransferType";
  /** Column name CashBookTransferType */
  String COLUMNNAME_CashBookTransferType = "CashBookTransferType";
  /** Column name CashTransferBankAccount_ID */
  String COLUMNNAME_CashTransferBankAccount_ID = "CashTransferBankAccount_ID";
  /** Column name CashTransferCashBook_ID */
  String COLUMNNAME_CashTransferCashBook_ID = "CashTransferCashBook_ID";
  /** Column name C_CashBook_ID */
  String COLUMNNAME_C_CashBook_ID = "C_CashBook_ID";
  /** Column name C_CashBPartner_ID */
  String COLUMNNAME_C_CashBPartner_ID = "C_CashBPartner_ID";
  /** Column name Check_BankAccount_ID */
  String COLUMNNAME_Check_BankAccount_ID = "Check_BankAccount_ID";
  /** Column name CheckTransferBankAccount_ID */
  String COLUMNNAME_CheckTransferBankAccount_ID = "CheckTransferBankAccount_ID";
  /** Column name CheckTransferCashBook_ID */
  String COLUMNNAME_CheckTransferCashBook_ID = "CheckTransferCashBook_ID";
  /** Column name CheckTransferType */
  String COLUMNNAME_CheckTransferType = "CheckTransferType";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_TemplateBPartner_ID */
  String COLUMNNAME_C_TemplateBPartner_ID = "C_TemplateBPartner_ID";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name LastLockTime */
  String COLUMNNAME_LastLockTime = "LastLockTime";
  /** Column name Locked */
  String COLUMNNAME_Locked = "Locked";
  /** Column name LockTime */
  String COLUMNNAME_LockTime = "LockTime";
  /** Column name M_Warehouse_ID */
  String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
  /** Column name PO_PriceList_ID */
  String COLUMNNAME_PO_PriceList_ID = "PO_PriceList_ID";
  /** Column name PrinterName */
  String COLUMNNAME_PrinterName = "PrinterName";
  /** Column name SalesRep_ID */
  String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
  /** Column name SO_PriceList_ID */
  String COLUMNNAME_SO_PriceList_ID = "SO_PriceList_ID";
  /** Column name UnlockingTime */
  String COLUMNNAME_UnlockingTime = "UnlockingTime";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name U_POSTerminal_ID */
  String COLUMNNAME_U_POSTerminal_ID = "U_POSTerminal_ID";
  /** Column name U_POSTerminal_UU */
  String COLUMNNAME_U_POSTerminal_UU = "U_POSTerminal_UU";
  /** Column name Value */
  String COLUMNNAME_Value = "Value";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Auto Lock. Whether to automatically lock the terminal when till is closed */
  boolean isAutoLock();

  /** Set Auto Lock. Whether to automatically lock the terminal when till is closed */
  void setAutoLock(boolean AutoLock);

  /** Get Card Bank Account. Bank Account on which card transactions will be processed */
  int getCard_BankAccount_ID();

  /** Set Card Bank Account. Bank Account on which card transactions will be processed */
  void setCard_BankAccount_ID(int Card_BankAccount_ID);

  I_C_BankAccount getCard_BankAccount() throws RuntimeException;

  /** Get Transfer Card trx to. Bank account on which to transfer Card transactions */
  int getCardTransferBankAccount_ID();

  /** Set Transfer Card trx to. Bank account on which to transfer Card transactions */
  void setCardTransferBankAccount_ID(int CardTransferBankAccount_ID);

  I_C_BankAccount getCardTransferBankAccount() throws RuntimeException;

  /** Get Transfer Card trx to. Cash Book on which to transfer all Card transactions */
  int getCardTransferCashBook_ID();

  /** Set Transfer Card trx to. Cash Book on which to transfer all Card transactions */
  void setCardTransferCashBook_ID(int CardTransferCashBook_ID);

  I_C_CashBook getCardTransferCashBook() throws RuntimeException;

  /** Get Card Transfer Type */
  String getCardTransferType();

  /** Set Card Transfer Type */
  void setCardTransferType(String CardTransferType);

  /**
   * Get Cash Book Transfer Type. Where the money in the cash book should be transfered to. Either a
   * Bank Account or another Cash Book
   */
  String getCashBookTransferType();

  /**
   * Set Cash Book Transfer Type. Where the money in the cash book should be transfered to. Either a
   * Bank Account or another Cash Book
   */
  void setCashBookTransferType(String CashBookTransferType);

  /** Get Transfer Cash trx to. Bank Account on which to transfer all Cash transactions */
  int getCashTransferBankAccount_ID();

  /** Set Transfer Cash trx to. Bank Account on which to transfer all Cash transactions */
  void setCashTransferBankAccount_ID(int CashTransferBankAccount_ID);

  I_C_BankAccount getCashTransferBankAccount() throws RuntimeException;

  /** Get Transfer Cash trx to. Cash Book on which to transfer all Cash transactions */
  int getCashTransferCashBook_ID();

  /** Set Transfer Cash trx to. Cash Book on which to transfer all Cash transactions */
  void setCashTransferCashBook_ID(int CashTransferCashBook_ID);

  I_C_CashBook getCashTransferCashBook() throws RuntimeException;

  /** Get Cash Book. Cash Book for recording petty cash transactions */
  int getC_CashBook_ID();

  /** Set Cash Book. Cash Book for recording petty cash transactions */
  void setC_CashBook_ID(int C_CashBook_ID);

  I_C_CashBook getC_CashBook() throws RuntimeException;

  /** Get Cash BPartner. BPartner to be used for Cash transactions */
  int getC_CashBPartner_ID();

  /** Set Cash BPartner. BPartner to be used for Cash transactions */
  void setC_CashBPartner_ID(int C_CashBPartner_ID);

  I_C_BPartner getC_CashBPartner() throws RuntimeException;

  /** Get Check Bank Account. Bank Account to be used for processing Check transactions */
  int getCheck_BankAccount_ID();

  /** Set Check Bank Account. Bank Account to be used for processing Check transactions */
  void setCheck_BankAccount_ID(int Check_BankAccount_ID);

  I_C_BankAccount getCheck_BankAccount() throws RuntimeException;

  /** Get Tranfer Check trx to. Bank account on which to transfer Check transactions */
  int getCheckTransferBankAccount_ID();

  /** Set Tranfer Check trx to. Bank account on which to transfer Check transactions */
  void setCheckTransferBankAccount_ID(int CheckTransferBankAccount_ID);

  I_C_BankAccount getCheckTransferBankAccount() throws RuntimeException;

  /** Get Transfer Check trx to. Cash Book on which to transfer all Check transactions */
  int getCheckTransferCashBook_ID();

  /** Set Transfer Check trx to. Cash Book on which to transfer all Check transactions */
  void setCheckTransferCashBook_ID(int CheckTransferCashBook_ID);

  I_C_CashBook getCheckTransferCashBook() throws RuntimeException;

  /** Get Check Transfer Type */
  String getCheckTransferType();

  /** Set Check Transfer Type */
  void setCheckTransferType(String CheckTransferType);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /**
   * Get Template BPartner. BPartner that is to be used as template when new customers are created
   */
  int getC_TemplateBPartner_ID();

  /**
   * Set Template BPartner. BPartner that is to be used as template when new customers are created
   */
  void setC_TemplateBPartner_ID(int C_TemplateBPartner_ID);

  I_C_BPartner getC_TemplateBPartner() throws RuntimeException;

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Last Lock Time. Last time at which the terminal was locked */
  Timestamp getLastLockTime();

  /** Set Last Lock Time. Last time at which the terminal was locked */
  void setLastLockTime(Timestamp LastLockTime);

  /** Get Locked. Whether the terminal is locked */
  boolean isLocked();

  /** Set Locked. Whether the terminal is locked */
  void setLocked(boolean Locked);

  /** Get Lock Time. Time in minutes the terminal should be kept in a locked state. */
  int getLockTime();

  /** Set Lock Time. Time in minutes the terminal should be kept in a locked state. */
  void setLockTime(int LockTime);

  /** Get Warehouse. Storage Warehouse and Service Point */
  int getM_Warehouse_ID();

  /** Set Warehouse. Storage Warehouse and Service Point */
  void setM_Warehouse_ID(int M_Warehouse_ID);

  I_M_Warehouse getM_Warehouse() throws RuntimeException;

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Purchase Pricelist. Price List used by this Business Partner */
  int getPO_PriceList_ID();

  /** Set Purchase Pricelist. Price List used by this Business Partner */
  void setPO_PriceList_ID(int PO_PriceList_ID);

  I_M_PriceList getPO_PriceList() throws RuntimeException;

  /** Get Printer Name. Name of the Printer */
  String getPrinterName();

  /** Set Printer Name. Name of the Printer */
  void setPrinterName(String PrinterName);

  /** Get Sales Representative. Sales Representative or Company Agent */
  int getSalesRep_ID();

  /** Set Sales Representative. Sales Representative or Company Agent */
  void setSalesRep_ID(int SalesRep_ID);

  I_AD_User getSalesRep() throws RuntimeException;

  /** Get Sales Pricelist */
  int getSO_PriceList_ID();

  /** Set Sales Pricelist */
  void setSO_PriceList_ID(int SO_PriceList_ID);

  I_M_PriceList getSO_PriceList() throws RuntimeException;

  /** Get UnlockingTime. Time at which the terminal should be unlocked */
  Timestamp getUnlockingTime();

  /** Set UnlockingTime. Time at which the terminal should be unlocked */
  void setUnlockingTime(Timestamp UnlockingTime);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get POS Terminal */
  int getU_POSTerminal_ID();

  /** Set POS Terminal */
  void setU_POSTerminal_ID(int U_POSTerminal_ID);

  /** Get U_POSTerminal_UU */
  String getU_POSTerminal_UU();

  /** Set U_POSTerminal_UU */
  void setU_POSTerminal_UU(String U_POSTerminal_UU);

  /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);
}
