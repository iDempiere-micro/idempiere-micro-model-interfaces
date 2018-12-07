package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;
import org.idempiere.icommon.model.IPO;

/**
 * Generated Interface for C_TaxCategory
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_TaxCategory extends IPO {

  /** TableName=C_TaxCategory */
  String Table_Name = "C_TaxCategory";

  /** AD_Table_ID=252 */
  int Table_ID = 252;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name CommodityCode */
  String COLUMNNAME_CommodityCode = "CommodityCode";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_TaxCategory_ID */
  String COLUMNNAME_C_TaxCategory_ID = "C_TaxCategory_ID";
  /** Column name C_TaxCategory_UU */
  String COLUMNNAME_C_TaxCategory_UU = "C_TaxCategory_UU";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsDefault */
  String COLUMNNAME_IsDefault = "IsDefault";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Commodity Code. Commodity code used for tax calculation */
  String getCommodityCode();

  /** Set Commodity Code. Commodity code used for tax calculation */
  void setCommodityCode(String CommodityCode);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Tax Category. Tax Category */
  int getC_TaxCategory_ID();

  /** Set Tax Category. Tax Category */
  void setC_TaxCategory_ID(int C_TaxCategory_ID);

  /** Get C_TaxCategory_UU */
  String getC_TaxCategory_UU();

  /** Set C_TaxCategory_UU */
  void setC_TaxCategory_UU(String C_TaxCategory_UU);

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

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
