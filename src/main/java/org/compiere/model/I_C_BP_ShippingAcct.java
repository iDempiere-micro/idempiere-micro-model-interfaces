package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_BP_ShippingAcct
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BP_ShippingAcct {

  /** TableName=C_BP_ShippingAcct */
  String Table_Name = "C_BP_ShippingAcct";

  /** AD_Table_ID=200043 */
  int Table_ID = 200043;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BPartner_Location_ID */
  String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
  /** Column name C_BP_ShippingAcct_ID */
  String COLUMNNAME_C_BP_ShippingAcct_ID = "C_BP_ShippingAcct_ID";
  /** Column name C_BP_ShippingAcct_UU */
  String COLUMNNAME_C_BP_ShippingAcct_UU = "C_BP_ShippingAcct_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DutiesShipperAccount */
  String COLUMNNAME_DutiesShipperAccount = "DutiesShipperAccount";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_ShippingProcessor_ID */
  String COLUMNNAME_M_ShippingProcessor_ID = "M_ShippingProcessor_ID";
  /** Column name ShipperAccount */
  String COLUMNNAME_ShipperAccount = "ShipperAccount";
  /** Column name ShipperMeter */
  String COLUMNNAME_ShipperMeter = "ShipperMeter";
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

  /** Get Partner Location. Identifies the (ship to) address for this Business Partner */
  int getC_BPartner_Location_ID();

  /** Set Partner Location. Identifies the (ship to) address for this Business Partner */
  void setC_BPartner_Location_ID(int C_BPartner_Location_ID);

  I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException;

  /** Get Business Partner Shipping Account */
  int getC_BP_ShippingAcct_ID();

  /** Set Business Partner Shipping Account */
  void setC_BP_ShippingAcct_ID(int C_BP_ShippingAcct_ID);

  /** Get C_BP_ShippingAcct_UU */
  String getC_BP_ShippingAcct_UU();

  /** Set C_BP_ShippingAcct_UU */
  void setC_BP_ShippingAcct_UU(String C_BP_ShippingAcct_UU);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Duties Shipper Account */
  String getDutiesShipperAccount();

  /** Set Duties Shipper Account */
  void setDutiesShipperAccount(String DutiesShipperAccount);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Shipping Processor */
  int getM_ShippingProcessor_ID();

  /** Set Shipping Processor */
  void setM_ShippingProcessor_ID(int M_ShippingProcessor_ID);

  I_M_ShippingProcessor getM_ShippingProcessor() throws RuntimeException;

  /** Get Shipper Account Number */
  String getShipperAccount();

  /** Set Shipper Account Number */
  void setShipperAccount(String ShipperAccount);

  /** Get Shipper Meter */
  String getShipperMeter();

  /** Set Shipper Meter */
  void setShipperMeter(String ShipperMeter);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
