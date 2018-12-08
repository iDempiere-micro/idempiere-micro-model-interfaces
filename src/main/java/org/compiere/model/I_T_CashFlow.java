package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for T_CashFlow
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_T_CashFlow {

  /** TableName=T_CashFlow */
  String Table_Name = "T_CashFlow";

  /** AD_Table_ID=53299 */
  int Table_ID = 53299;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_PInstance_ID */
  String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
  /** Column name C_AcctSchema_ID */
  String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
  /** Column name C_Activity_ID */
  String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
  /** Column name CashFlowSource */
  String COLUMNNAME_CashFlowSource = "CashFlowSource";
  /** Column name CashFlowType */
  String COLUMNNAME_CashFlowType = "CashFlowType";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_Campaign_ID */
  String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
  /** Column name C_CashPlanLine_ID */
  String COLUMNNAME_C_CashPlanLine_ID = "C_CashPlanLine_ID";
  /** Column name C_Charge_ID */
  String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
  /** Column name C_ElementValue_ID */
  String COLUMNNAME_C_ElementValue_ID = "C_ElementValue_ID";
  /** Column name C_Invoice_ID */
  String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
  /** Column name C_Order_ID */
  String COLUMNNAME_C_Order_ID = "C_Order_ID";
  /** Column name C_Project_ID */
  String COLUMNNAME_C_Project_ID = "C_Project_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DateTo */
  String COLUMNNAME_DateTo = "DateTo";
  /** Column name DateTrx */
  String COLUMNNAME_DateTrx = "DateTrx";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsSOTrx */
  String COLUMNNAME_IsSOTrx = "IsSOTrx";
  /** Column name LineTotalAmt */
  String COLUMNNAME_LineTotalAmt = "LineTotalAmt";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name Probability */
  String COLUMNNAME_Probability = "Probability";
  /** Column name T_CashFlow_ID */
  String COLUMNNAME_T_CashFlow_ID = "T_CashFlow_ID";
  /** Column name T_CashFlow_UU */
  String COLUMNNAME_T_CashFlow_UU = "T_CashFlow_UU";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Process Instance. Instance of the process */
  int getAD_PInstance_ID();

  /** Set Process Instance. Instance of the process */
  void setAD_PInstance_ID(int AD_PInstance_ID);

  I_AD_PInstance getAD_PInstance() throws RuntimeException;

  /** Get Accounting Schema. Rules for accounting */
  int getC_AcctSchema_ID();

  /** Set Accounting Schema. Rules for accounting */
  void setC_AcctSchema_ID(int C_AcctSchema_ID);

  I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

  /** Get Activity. Business Activity */
  int getC_Activity_ID();

  /** Set Activity. Business Activity */
  void setC_Activity_ID(int C_Activity_ID);

  I_C_Activity getC_Activity() throws RuntimeException;

  /** Get Cash Flow Source */
  String getCashFlowSource();

  /** Set Cash Flow Source */
  void setCashFlowSource(String CashFlowSource);

  /** Get Cash Flow Type */
  String getCashFlowType();

  /** Set Cash Flow Type */
  void setCashFlowType(String CashFlowType);

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Campaign. Marketing Campaign */
  int getC_Campaign_ID();

  /** Set Campaign. Marketing Campaign */
  void setC_Campaign_ID(int C_Campaign_ID);

  I_C_Campaign getC_Campaign() throws RuntimeException;

  /** Get Cash Plan Line */
  int getC_CashPlanLine_ID();

  /** Set Cash Plan Line */
  void setC_CashPlanLine_ID(int C_CashPlanLine_ID);

  I_C_CashPlanLine getC_CashPlanLine() throws RuntimeException;

  /** Get Charge. Additional document charges */
  int getC_Charge_ID();

  /** Set Charge. Additional document charges */
  void setC_Charge_ID(int C_Charge_ID);

  I_C_Charge getC_Charge() throws RuntimeException;

  /** Get Account Element. Account Element */
  int getC_ElementValue_ID();

  /** Set Account Element. Account Element */
  void setC_ElementValue_ID(int C_ElementValue_ID);

  I_C_ElementValue getC_ElementValue() throws RuntimeException;

  /** Get Invoice. Invoice Identifier */
  int getC_Invoice_ID();

  /** Set Invoice. Invoice Identifier */
  void setC_Invoice_ID(int C_Invoice_ID);

  I_C_Invoice getC_Invoice() throws RuntimeException;

  /** Get Order. Order */
  int getC_Order_ID();

  /** Set Order. Order */
  void setC_Order_ID(int C_Order_ID);

  I_C_Order getC_Order() throws RuntimeException;

  /** Get Project. Financial Project */
  int getC_Project_ID();

  /** Set Project. Financial Project */
  void setC_Project_ID(int C_Project_ID);

  I_C_Project getC_Project() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Date To. End date of a date range */
  Timestamp getDateTo();

  /** Set Date To. End date of a date range */
  void setDateTo(Timestamp DateTo);

  /** Get Transaction Date. Transaction Date */
  Timestamp getDateTrx();

  /** Set Transaction Date. Transaction Date */
  void setDateTrx(Timestamp DateTrx);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Sales Transaction. This is a Sales Transaction */
  void setIsSOTrx(boolean IsSOTrx);

  /** Get Sales Transaction. This is a Sales Transaction */
  boolean isSOTrx();

  /** Get Line Total. Total line amount incl. Tax */
  BigDecimal getLineTotalAmt();

  /** Set Line Total. Total line amount incl. Tax */
  void setLineTotalAmt(BigDecimal LineTotalAmt);

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Probability */
  BigDecimal getProbability();

  /** Set Probability */
  void setProbability(BigDecimal Probability);

  /** Get T_CashFlow_ID */
  int getT_CashFlow_ID();

  /** Set T_CashFlow_ID */
  void setT_CashFlow_ID(int T_CashFlow_ID);

  /** Get T_CashFlow_UU */
  String getT_CashFlow_UU();

  /** Set T_CashFlow_UU */
  void setT_CashFlow_UU(String T_CashFlow_UU);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Currency Type. Currency Conversion Rate Type */
  int getC_ConversionType_ID();

  /** Set Currency Type. Currency Conversion Rate Type */
  void setC_ConversionType_ID(int C_ConversionType_ID);

  I_C_ConversionType getC_ConversionType() throws RuntimeException;

  /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

  /** Set Currency. The Currency for this record */
  void setC_Currency_ID(int C_Currency_ID);

  I_C_Currency getC_Currency() throws RuntimeException;
}
