package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_BP_Group
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BP_Group {

  /** TableName=C_BP_Group */
  String Table_Name = "C_BP_Group";

  /** AD_Table_ID=394 */
  int Table_ID = 394;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_PrintColor_ID */
  String COLUMNNAME_AD_PrintColor_ID = "AD_PrintColor_ID";
  /** Column name C_BP_Group_ID */
  String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
  /** Column name C_BP_Group_UU */
  String COLUMNNAME_C_BP_Group_UU = "C_BP_Group_UU";
  /** Column name C_Dunning_ID */
  String COLUMNNAME_C_Dunning_ID = "C_Dunning_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name CreditWatchPercent */
  String COLUMNNAME_CreditWatchPercent = "CreditWatchPercent";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsConfidentialInfo */
  String COLUMNNAME_IsConfidentialInfo = "IsConfidentialInfo";
  /** Column name IsDefault */
  String COLUMNNAME_IsDefault = "IsDefault";
  /** Column name M_DiscountSchema_ID */
  String COLUMNNAME_M_DiscountSchema_ID = "M_DiscountSchema_ID";
  /** Column name M_PriceList_ID */
  String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
  /** Column name PO_DiscountSchema_ID */
  String COLUMNNAME_PO_DiscountSchema_ID = "PO_DiscountSchema_ID";
  /** Column name PO_PriceList_ID */
  String COLUMNNAME_PO_PriceList_ID = "PO_PriceList_ID";
  /** Column name PriceMatchTolerance */
  String COLUMNNAME_PriceMatchTolerance = "PriceMatchTolerance";
  /** Column name PriorityBase */
  String COLUMNNAME_PriorityBase = "PriorityBase";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name Value */
  String COLUMNNAME_Value = "Value";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Print Color. Color used for printing and display */
  int getAD_PrintColor_ID();

  /** Set Print Color. Color used for printing and display */
  void setAD_PrintColor_ID(int AD_PrintColor_ID);

  I_AD_PrintColor getAD_PrintColor() throws RuntimeException;

  /** Get Business Partner Group. Business Partner Group */
  int getC_BP_Group_ID();

  /** Set Business Partner Group. Business Partner Group */
  void setC_BP_Group_ID(int C_BP_Group_ID);

  /** Get C_BP_Group_UU */
  String getC_BP_Group_UU();

  /** Set C_BP_Group_UU */
  void setC_BP_Group_UU(String C_BP_Group_UU);

  /** Get Dunning. Dunning Rules for overdue invoices */
  int getC_Dunning_ID();

  /** Set Dunning. Dunning Rules for overdue invoices */
  void setC_Dunning_ID(int C_Dunning_ID);

  I_C_Dunning getC_Dunning() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Credit Watch %. Credit Watch - Percent of Credit Limit when OK switches to Watch */
  BigDecimal getCreditWatchPercent();

  /** Set Credit Watch %. Credit Watch - Percent of Credit Limit when OK switches to Watch */
  void setCreditWatchPercent(BigDecimal CreditWatchPercent);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Confidential Info. Can enter confidential information */
  void setIsConfidentialInfo(boolean IsConfidentialInfo);

  /** Get Confidential Info. Can enter confidential information */
  boolean isConfidentialInfo();

  /** Set Default. Default value */
  void setIsDefault(boolean IsDefault);

  /** Get Default. Default value */
  boolean isDefault();

  /** Get Discount Schema. Schema to calculate the trade discount percentage */
  int getM_DiscountSchema_ID();

  /** Set Discount Schema. Schema to calculate the trade discount percentage */
  void setM_DiscountSchema_ID(int M_DiscountSchema_ID);

  I_M_DiscountSchema getM_DiscountSchema() throws RuntimeException;

  /** Get Price List. Unique identifier of a Price List */
  int getM_PriceList_ID();

  /** Set Price List. Unique identifier of a Price List */
  void setM_PriceList_ID(int M_PriceList_ID);

  I_M_PriceList getM_PriceList() throws RuntimeException;

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get PO Discount Schema. Schema to calculate the purchase trade discount percentage */
  int getPO_DiscountSchema_ID();

  /** Set PO Discount Schema. Schema to calculate the purchase trade discount percentage */
  void setPO_DiscountSchema_ID(int PO_DiscountSchema_ID);

  I_M_DiscountSchema getPO_DiscountSchema() throws RuntimeException;

  /** Get Purchase Pricelist. Price List used by this Business Partner */
  int getPO_PriceList_ID();

  /** Set Purchase Pricelist. Price List used by this Business Partner */
  void setPO_PriceList_ID(int PO_PriceList_ID);

  I_M_PriceList getPO_PriceList() throws RuntimeException;

  /**
   * Get Price Match Tolerance. PO-Invoice Match Price Tolerance in percent of the purchase price
   */
  BigDecimal getPriceMatchTolerance();

  /**
   * Set Price Match Tolerance. PO-Invoice Match Price Tolerance in percent of the purchase price
   */
  void setPriceMatchTolerance(BigDecimal PriceMatchTolerance);

  /** Get Priority Base. Base of Priority */
  String getPriorityBase();

  /** Set Priority Base. Base of Priority */
  void setPriorityBase(String PriorityBase);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);
}
