package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;
import org.idempiere.icommon.model.IPO;

/**
 * Generated Interface for C_Tax
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Tax extends IPO {

  /** TableName=C_Tax */
  String Table_Name = "C_Tax";

  /** AD_Table_ID=261 */
  int Table_ID = 261;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Rule_ID */
  String COLUMNNAME_AD_Rule_ID = "AD_Rule_ID";
  /** Column name C_CountryGroupFrom_ID */
  String COLUMNNAME_C_CountryGroupFrom_ID = "C_CountryGroupFrom_ID";
  /** Column name C_CountryGroupTo_ID */
  String COLUMNNAME_C_CountryGroupTo_ID = "C_CountryGroupTo_ID";
  /** Column name C_Country_ID */
  String COLUMNNAME_C_Country_ID = "C_Country_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_Region_ID */
  String COLUMNNAME_C_Region_ID = "C_Region_ID";
  /** Column name C_TaxCategory_ID */
  String COLUMNNAME_C_TaxCategory_ID = "C_TaxCategory_ID";
  /** Column name C_Tax_ID */
  String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
  /** Column name C_TaxProvider_ID */
  String COLUMNNAME_C_TaxProvider_ID = "C_TaxProvider_ID";
  /** Column name C_Tax_UU */
  String COLUMNNAME_C_Tax_UU = "C_Tax_UU";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsDefault */
  String COLUMNNAME_IsDefault = "IsDefault";
  /** Column name IsDocumentLevel */
  String COLUMNNAME_IsDocumentLevel = "IsDocumentLevel";
  /** Column name IsSalesTax */
  String COLUMNNAME_IsSalesTax = "IsSalesTax";
  /** Column name IsSummary */
  String COLUMNNAME_IsSummary = "IsSummary";
  /** Column name IsTaxExempt */
  String COLUMNNAME_IsTaxExempt = "IsTaxExempt";
  /** Column name Parent_Tax_ID */
  String COLUMNNAME_Parent_Tax_ID = "Parent_Tax_ID";
  /** Column name Rate */
  String COLUMNNAME_Rate = "Rate";
  /** Column name RequiresTaxCertificate */
  String COLUMNNAME_RequiresTaxCertificate = "RequiresTaxCertificate";
  /** Column name SOPOType */
  String COLUMNNAME_SOPOType = "SOPOType";
  /** Column name TaxIndicator */
  String COLUMNNAME_TaxIndicator = "TaxIndicator";
  /** Column name To_Country_ID */
  String COLUMNNAME_To_Country_ID = "To_Country_ID";
  /** Column name To_Region_ID */
  String COLUMNNAME_To_Region_ID = "To_Region_ID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name ValidFrom */
  String COLUMNNAME_ValidFrom = "ValidFrom";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Rule */
  int getAD_Rule_ID();

  /** Set Rule */
  void setAD_Rule_ID(int AD_Rule_ID);

  I_AD_Rule getAD_Rule() throws RuntimeException;

  /** Get Country Group From */
  int getC_CountryGroupFrom_ID();

  /** Set Country Group From */
  void setC_CountryGroupFrom_ID(int C_CountryGroupFrom_ID);

  I_C_CountryGroup getC_CountryGroupFrom() throws RuntimeException;

  /** Get Country Group To */
  int getC_CountryGroupTo_ID();

  /** Set Country Group To */
  void setC_CountryGroupTo_ID(int C_CountryGroupTo_ID);

  I_C_CountryGroup getC_CountryGroupTo() throws RuntimeException;

  /** Get Country. Country */
  int getC_Country_ID();

  /** Set Country. Country */
  void setC_Country_ID(int C_Country_ID);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Region. Identifies a geographical Region */
  int getC_Region_ID();

  /** Set Region. Identifies a geographical Region */
  void setC_Region_ID(int C_Region_ID);

  I_C_Region getC_Region() throws RuntimeException;

  /** Get Tax Category. Tax Category */
  int getC_TaxCategory_ID();

  /** Set Tax Category. Tax Category */
  void setC_TaxCategory_ID(int C_TaxCategory_ID);

  I_C_TaxCategory getC_TaxCategory() throws RuntimeException;

  /** Get Tax. Tax identifier */
  int getC_Tax_ID();

  /** Set Tax. Tax identifier */
  void setC_Tax_ID(int C_Tax_ID);

  /** Get Tax Provider */
  int getC_TaxProvider_ID();

  /** Set Tax Provider */
  void setC_TaxProvider_ID(int C_TaxProvider_ID);

  I_C_TaxProvider getC_TaxProvider() throws RuntimeException;

  /** Get C_Tax_UU */
  String getC_Tax_UU();

  /** Set C_Tax_UU */
  void setC_Tax_UU(String C_Tax_UU);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Default. Default value */
  void setIsDefault(boolean IsDefault);

  /** Get Default. Default value */
  boolean isDefault();

  /** Set Document Level. Tax is calculated on document level (rather than line by line) */
  void setIsDocumentLevel(boolean IsDocumentLevel);

  /** Get Document Level. Tax is calculated on document level (rather than line by line) */
  boolean isDocumentLevel();

  /** Set Sales Tax. This is a sales tax (i.e. not a value added tax) */
  void setIsSalesTax(boolean IsSalesTax);

  /** Get Sales Tax. This is a sales tax (i.e. not a value added tax) */
  boolean isSalesTax();

  /** Set Summary Level. This is a summary entity */
  void setIsSummary(boolean IsSummary);

  /** Get Summary Level. This is a summary entity */
  boolean isSummary();

  /** Set SO Tax exempt. Business partner is exempt from tax on sales */
  void setIsTaxExempt(boolean IsTaxExempt);

  /** Get SO Tax exempt. Business partner is exempt from tax on sales */
  boolean isTaxExempt();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Parent Tax. Parent Tax indicates a tax that is made up of multiple taxes */
  int getParent_Tax_ID();

  /** Set Parent Tax. Parent Tax indicates a tax that is made up of multiple taxes */
  void setParent_Tax_ID(int Parent_Tax_ID);

  I_C_Tax getParent_Tax() throws RuntimeException;

  /** Get Rate. Rate or Tax or Exchange */
  BigDecimal getRate();

  /** Set Rate. Rate or Tax or Exchange */
  void setRate(BigDecimal Rate);

  /** Get Requires Tax Certificate. This tax rate requires the Business Partner to be tax exempt */
  boolean isRequiresTaxCertificate();

  /** Set Requires Tax Certificate. This tax rate requires the Business Partner to be tax exempt */
  void setRequiresTaxCertificate(boolean RequiresTaxCertificate);

  /** Get SO/PO Type. Sales Tax applies to sales situations, Purchase Tax to purchase situations */
  String getSOPOType();

  /** Set SO/PO Type. Sales Tax applies to sales situations, Purchase Tax to purchase situations */
  void setSOPOType(String SOPOType);

  /** Get Tax Indicator. Short form for Tax to be printed on documents */
  String getTaxIndicator();

  /** Set Tax Indicator. Short form for Tax to be printed on documents */
  void setTaxIndicator(String TaxIndicator);

  /** Get To. Receiving Country */
  int getTo_Country_ID();

  /** Set To. Receiving Country */
  void setTo_Country_ID(int To_Country_ID);

  /** Get To. Receiving Region */
  int getTo_Region_ID();

  /** Set To. Receiving Region */
  void setTo_Region_ID(int To_Region_ID);

  I_C_Region getTo_Region() throws RuntimeException;

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Valid from. Valid from including this date (first day) */
  Timestamp getValidFrom();

  /** Set Valid from. Valid from including this date (first day) */
  void setValidFrom(Timestamp ValidFrom);

  I_C_Tax[] getChildTaxes(boolean b);

  BigDecimal calculateTax(BigDecimal taxBaseAmt, boolean b, int precision);
}
