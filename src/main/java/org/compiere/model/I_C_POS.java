package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_POS
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_POS {

  /** TableName=C_POS */
  String Table_Name = "C_POS";

  /** AD_Table_ID=748 */
  int Table_ID = 748;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AutoLogoutDelay */
  String COLUMNNAME_AutoLogoutDelay = "AutoLogoutDelay";
  /** Column name CashDrawer */
  String COLUMNNAME_CashDrawer = "CashDrawer";
  /** Column name C_BankAccount_ID */
  String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";
  /** Column name C_BPartnerCashTrx_ID */
  String COLUMNNAME_C_BPartnerCashTrx_ID = "C_BPartnerCashTrx_ID";
  /** Column name C_CashBook_ID */
  String COLUMNNAME_C_CashBook_ID = "C_CashBook_ID";
  /** Column name C_DocType_ID */
  String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
  /** Column name C_POS_ID */
  String COLUMNNAME_C_POS_ID = "C_POS_ID";
  /** Column name C_POSKeyLayout_ID */
  String COLUMNNAME_C_POSKeyLayout_ID = "C_POSKeyLayout_ID";
  /** Column name C_POS_UU */
  String COLUMNNAME_C_POS_UU = "C_POS_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsModifyPrice */
  String COLUMNNAME_IsModifyPrice = "IsModifyPrice";
  /** Column name M_PriceList_ID */
  String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
  /** Column name M_Warehouse_ID */
  String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
  /** Column name OSK_KeyLayout_ID */
  String COLUMNNAME_OSK_KeyLayout_ID = "OSK_KeyLayout_ID";
  /** Column name OSNP_KeyLayout_ID */
  String COLUMNNAME_OSNP_KeyLayout_ID = "OSNP_KeyLayout_ID";
  /** Column name PrinterName */
  String COLUMNNAME_PrinterName = "PrinterName";
  /** Column name SalesRep_ID */
  String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Auto Logout Delay. Automatically logout if terminal inactive for this period */
  int getAutoLogoutDelay();

  /** Set Auto Logout Delay. Automatically logout if terminal inactive for this period */
  void setAutoLogoutDelay(int AutoLogoutDelay);

  /** Get CashDrawer */
  String getCashDrawer();

  /** Set CashDrawer */
  void setCashDrawer(String CashDrawer);

  /** Get Bank Account. Account at the Bank */
  int getC_BankAccount_ID();

  /** Set Bank Account. Account at the Bank */
  void setC_BankAccount_ID(int C_BankAccount_ID);

  I_C_BankAccount getC_BankAccount() throws RuntimeException;

  /** Get Template B.Partner. Business Partner used for creating new Business Partners on the fly */
  int getC_BPartnerCashTrx_ID();

  /** Set Template B.Partner. Business Partner used for creating new Business Partners on the fly */
  void setC_BPartnerCashTrx_ID(int C_BPartnerCashTrx_ID);

  I_C_BPartner getC_BPartnerCashTrx() throws RuntimeException;

  /** Get Cash Book. Cash Book for recording petty cash transactions */
  int getC_CashBook_ID();

  /** Set Cash Book. Cash Book for recording petty cash transactions */
  void setC_CashBook_ID(int C_CashBook_ID);

  I_C_CashBook getC_CashBook() throws RuntimeException;

  /** Get Document Type. Document type or rules */
  int getC_DocType_ID();

  /** Set Document Type. Document type or rules */
  void setC_DocType_ID(int C_DocType_ID);

  I_C_DocType getC_DocType() throws RuntimeException;

  /** Get POS Terminal. Point of Sales Terminal */
  int getC_POS_ID();

  /** Set POS Terminal. Point of Sales Terminal */
  void setC_POS_ID(int C_POS_ID);

  /** Get POS Key Layout. POS Function Key Layout */
  int getC_POSKeyLayout_ID();

  /** Set POS Key Layout. POS Function Key Layout */
  void setC_POSKeyLayout_ID(int C_POSKeyLayout_ID);

  I_C_POSKeyLayout getC_POSKeyLayout() throws RuntimeException;

  /** Get C_POS_UU */
  String getC_POS_UU();

  /** Set C_POS_UU */
  void setC_POS_UU(String C_POS_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

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

  /** Set Modify Price. Allow modifying the price */
  void setIsModifyPrice(boolean IsModifyPrice);

  /** Get Modify Price. Allow modifying the price */
  boolean isModifyPrice();

  /** Get Price List. Unique identifier of a Price List */
  int getM_PriceList_ID();

  /** Set Price List. Unique identifier of a Price List */
  void setM_PriceList_ID(int M_PriceList_ID);

  I_M_PriceList getM_PriceList() throws RuntimeException;

  /** Get Warehouse. Storage Warehouse and Service Point */
  int getM_Warehouse_ID();

  /** Set Warehouse. Storage Warehouse and Service Point */
  void setM_Warehouse_ID(int M_Warehouse_ID);

  I_M_Warehouse getM_Warehouse() throws RuntimeException;

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /**
   * Get On Screen Keyboard layout. The key layout to use for on screen keyboard for text fields.
   */
  int getOSK_KeyLayout_ID();

  /**
   * Set On Screen Keyboard layout. The key layout to use for on screen keyboard for text fields.
   */
  void setOSK_KeyLayout_ID(int OSK_KeyLayout_ID);

  I_C_POSKeyLayout getOSK_KeyLayout() throws RuntimeException;

  /**
   * Get On Screen Number Pad layout. The key layout to use for on screen number pad for numeric
   * fields.
   */
  int getOSNP_KeyLayout_ID();

  /**
   * Set On Screen Number Pad layout. The key layout to use for on screen number pad for numeric
   * fields.
   */
  void setOSNP_KeyLayout_ID(int OSNP_KeyLayout_ID);

  I_C_POSKeyLayout getOSNP_KeyLayout() throws RuntimeException;

  /** Get Printer Name. Name of the Printer */
  String getPrinterName();

  /** Set Printer Name. Name of the Printer */
  void setPrinterName(String PrinterName);

  /** Get Sales Representative. Sales Representative or Company Agent */
  int getSalesRep_ID();

  /** Set Sales Representative. Sales Representative or Company Agent */
  void setSalesRep_ID(int SalesRep_ID);

  I_AD_User getSalesRep() throws RuntimeException;

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
