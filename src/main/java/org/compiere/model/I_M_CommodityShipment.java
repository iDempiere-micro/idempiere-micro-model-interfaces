package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_CommodityShipment
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_CommodityShipment {

  /** TableName=M_CommodityShipment */
  String Table_Name = "M_CommodityShipment";

  /** AD_Table_ID=200045 */
  int Table_ID = 200045;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

    /** Column name CountryOfManufacture_ID */
  String COLUMNNAME_CountryOfManufacture_ID = "CountryOfManufacture_ID";
    /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name ExportLicenseNum */
  String COLUMNNAME_ExportLicenseNum = "ExportLicenseNum";
  /** Column name HarmonizedCode */
  String COLUMNNAME_HarmonizedCode = "HarmonizedCode";
    /** Column name M_CommodityShipment_ID */
  String COLUMNNAME_M_CommodityShipment_ID = "M_CommodityShipment_ID";
  /** Column name M_CommodityShipment_UU */
  String COLUMNNAME_M_CommodityShipment_UU = "M_CommodityShipment_UU";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";

    /** Get Country Of Manufacture */
  int getCountryOfManufacture_ID();

    /** Get Description. Optional short description of the record */
  String getDescription();

    /** Get Export License Number */
  String getExportLicenseNum();

    /** Get Harmonized Code */
  String getHarmonizedCode();

    /** Get Commodity Shipment */
  int getM_CommodityShipment_ID();

    /** Get Product. Product, Service, Item */
  int getM_Product_ID();

}
