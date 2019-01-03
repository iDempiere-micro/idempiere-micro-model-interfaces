package org.compiere.model;

import org.idempiere.common.util.KeyNamePair;
import org.idempiere.icommon.model.IPO;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for C_Charge
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Charge extends IPO {

  /** TableName=C_Charge */
  String Table_Name = "C_Charge";

  /** AD_Table_ID=313 */
  int Table_ID = 313;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_Charge_ID */
  String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
  /** Column name C_ChargeType_ID */
  String COLUMNNAME_C_ChargeType_ID = "C_ChargeType_ID";
  /** Column name C_Charge_UU */
  String COLUMNNAME_C_Charge_UU = "C_Charge_UU";
  /** Column name ChargeAmt */
  String COLUMNNAME_ChargeAmt = "ChargeAmt";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_TaxCategory_ID */
  String COLUMNNAME_C_TaxCategory_ID = "C_TaxCategory_ID";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsSameCurrency */
  String COLUMNNAME_IsSameCurrency = "IsSameCurrency";
  /** Column name IsSameTax */
  String COLUMNNAME_IsSameTax = "IsSameTax";
  /** Column name IsTaxIncluded */
  String COLUMNNAME_IsTaxIncluded = "IsTaxIncluded";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Charge. Additional document charges */
  int getC_Charge_ID();

  /** Set Charge. Additional document charges */
  void setC_Charge_ID(int C_Charge_ID);

  /** Get Charge Type */
  int getC_ChargeType_ID();

  /** Set Charge Type */
  void setC_ChargeType_ID(int C_ChargeType_ID);

  I_C_ChargeType getC_ChargeType() throws RuntimeException;

  /** Get C_Charge_UU */
  String getC_Charge_UU();

  /** Set C_Charge_UU */
  void setC_Charge_UU(String C_Charge_UU);

  /** Get Charge amount. Charge Amount */
  BigDecimal getChargeAmt();

  /** Set Charge amount. Charge Amount */
  void setChargeAmt(BigDecimal ChargeAmt);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Tax Category. Tax Category */
  int getC_TaxCategory_ID();

  /** Set Tax Category. Tax Category */
  void setC_TaxCategory_ID(int C_TaxCategory_ID);

  I_C_TaxCategory getC_TaxCategory() throws RuntimeException;

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Same Currency */
  void setIsSameCurrency(boolean IsSameCurrency);

  /** Get Same Currency */
  boolean isSameCurrency();

  /** Set Same Tax. Use the same tax as the main transaction */
  void setIsSameTax(boolean IsSameTax);

  /** Get Same Tax. Use the same tax as the main transaction */
  boolean isSameTax();

  /** Set Price includes Tax. Tax is included in the price */
  void setIsTaxIncluded(boolean IsTaxIncluded);

  /** Get Price includes Tax. Tax is included in the price */
  boolean isTaxIncluded();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
