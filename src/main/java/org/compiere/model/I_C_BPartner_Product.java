package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_BPartner_Product
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BPartner_Product {

  /** TableName=C_BPartner_Product */
  String Table_Name = "C_BPartner_Product";

  /** AD_Table_ID=632 */
  int Table_ID = 632;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BPartner_Product_UU */
  String COLUMNNAME_C_BPartner_Product_UU = "C_BPartner_Product_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsManufacturer */
  String COLUMNNAME_IsManufacturer = "IsManufacturer";
  /** Column name Manufacturer */
  String COLUMNNAME_Manufacturer = "Manufacturer";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name QualityRating */
  String COLUMNNAME_QualityRating = "QualityRating";
  /** Column name ShelfLifeMinDays */
  String COLUMNNAME_ShelfLifeMinDays = "ShelfLifeMinDays";
  /** Column name ShelfLifeMinPct */
  String COLUMNNAME_ShelfLifeMinPct = "ShelfLifeMinPct";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name VendorCategory */
  String COLUMNNAME_VendorCategory = "VendorCategory";
  /** Column name VendorProductNo */
  String COLUMNNAME_VendorProductNo = "VendorProductNo";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get C_BPartner_Product_UU */
  String getC_BPartner_Product_UU();

  /** Set C_BPartner_Product_UU */
  void setC_BPartner_Product_UU(String C_BPartner_Product_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Is Manufacturer. Indicate role of this Business partner as Manufacturer */
  void setIsManufacturer(boolean IsManufacturer);

  /** Get Is Manufacturer. Indicate role of this Business partner as Manufacturer */
  boolean isManufacturer();

  /** Get Manufacturer. Manufacturer of the Product */
  String getManufacturer();

  /** Set Manufacturer. Manufacturer of the Product */
  void setManufacturer(String Manufacturer);

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Quality Rating. Method for rating vendors */
  BigDecimal getQualityRating();

  /** Set Quality Rating. Method for rating vendors */
  void setQualityRating(BigDecimal QualityRating);

  /**
   * Get Min Shelf Life Days. Minimum Shelf Life in days based on Product Instance Guarantee Date
   */
  int getShelfLifeMinDays();

  /**
   * Set Min Shelf Life Days. Minimum Shelf Life in days based on Product Instance Guarantee Date
   */
  void setShelfLifeMinDays(int ShelfLifeMinDays);

  /**
   * Get Min Shelf Life %. Minimum Shelf Life in percent based on Product Instance Guarantee Date
   */
  int getShelfLifeMinPct();

  /**
   * Set Min Shelf Life %. Minimum Shelf Life in percent based on Product Instance Guarantee Date
   */
  void setShelfLifeMinPct(int ShelfLifeMinPct);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Partner Category. Product Category of the Business Partner */
  String getVendorCategory();

  /** Set Partner Category. Product Category of the Business Partner */
  void setVendorCategory(String VendorCategory);

  /** Get Partner Product Key. Product Key of the Business Partner */
  String getVendorProductNo();

  /** Set Partner Product Key. Product Key of the Business Partner */
  void setVendorProductNo(String VendorProductNo);
}
