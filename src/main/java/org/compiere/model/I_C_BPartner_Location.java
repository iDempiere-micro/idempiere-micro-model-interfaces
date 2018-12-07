package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_BPartner_Location
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BPartner_Location {

  /** TableName=C_BPartner_Location */
  String Table_Name = "C_BPartner_Location";

  /** AD_Table_ID=293 */
  int Table_ID = 293;

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
  /** Column name C_BPartner_Location_UU */
  String COLUMNNAME_C_BPartner_Location_UU = "C_BPartner_Location_UU";
  /** Column name C_Location_ID */
  String COLUMNNAME_C_Location_ID = "C_Location_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_SalesRegion_ID */
  String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
  /** Column name CustomerAddressID */
  String COLUMNNAME_CustomerAddressID = "CustomerAddressID";
  /** Column name Fax */
  String COLUMNNAME_Fax = "Fax";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsBillTo */
  String COLUMNNAME_IsBillTo = "IsBillTo";
  /** Column name ISDN */
  String COLUMNNAME_ISDN = "ISDN";
  /** Column name IsPayFrom */
  String COLUMNNAME_IsPayFrom = "IsPayFrom";
  /** Column name IsPreserveCustomName */
  String COLUMNNAME_IsPreserveCustomName = "IsPreserveCustomName";
  /** Column name IsRemitTo */
  String COLUMNNAME_IsRemitTo = "IsRemitTo";
  /** Column name IsShipTo */
  String COLUMNNAME_IsShipTo = "IsShipTo";
  /** Column name Phone */
  String COLUMNNAME_Phone = "Phone";
  /** Column name Phone2 */
  String COLUMNNAME_Phone2 = "Phone2";
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

  /** Get C_BPartner_Location_UU */
  String getC_BPartner_Location_UU();

  /** Set C_BPartner_Location_UU */
  void setC_BPartner_Location_UU(String C_BPartner_Location_UU);

  /** Get Address. Location or Address */
  int getC_Location_ID();

  /** Set Address. Location or Address */
  void setC_Location_ID(int C_Location_ID);

  I_C_Location getC_Location() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Sales Region. Sales coverage region */
  int getC_SalesRegion_ID();

  /** Set Sales Region. Sales coverage region */
  void setC_SalesRegion_ID(int C_SalesRegion_ID);

  I_C_SalesRegion getC_SalesRegion() throws RuntimeException;

  /** Get Customer Address ID */
  String getCustomerAddressID();

  /** Set Customer Address ID */
  void setCustomerAddressID(String CustomerAddressID);

  /** Get Fax. Facsimile number */
  String getFax();

  /** Set Fax. Facsimile number */
  void setFax(String Fax);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Invoice Address. Business Partner Invoice/Bill Address */
  void setIsBillTo(boolean IsBillTo);

  /** Get Invoice Address. Business Partner Invoice/Bill Address */
  boolean isBillTo();

  /** Get ISDN. ISDN or modem line */
  String getISDN();

  /** Set ISDN. ISDN or modem line */
  void setISDN(String ISDN);

  /**
   * Set Pay-From Address. Business Partner pays from that address and we'll send dunning letters
   * there
   */
  void setIsPayFrom(boolean IsPayFrom);

  /**
   * Get Pay-From Address. Business Partner pays from that address and we'll send dunning letters
   * there
   */
  boolean isPayFrom();

  /** Set Preserve custom name */
  void setIsPreserveCustomName(boolean IsPreserveCustomName);

  /** Get Preserve custom name */
  boolean isPreserveCustomName();

  /** Set Remit-To Address. Business Partner payment address */
  void setIsRemitTo(boolean IsRemitTo);

  /** Get Remit-To Address. Business Partner payment address */
  boolean isRemitTo();

  /** Set Ship Address. Business Partner Shipment Address */
  void setIsShipTo(boolean IsShipTo);

  /** Get Ship Address. Business Partner Shipment Address */
  boolean isShipTo();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Phone. Identifies a telephone number */
  String getPhone();

  /** Set Phone. Identifies a telephone number */
  void setPhone(String Phone);

  /** Get 2nd Phone. Identifies an alternate telephone number. */
  String getPhone2();

  /** Set 2nd Phone. Identifies an alternate telephone number. */
  void setPhone2(String Phone2);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  I_C_Location getLocation();

  boolean save();
}
