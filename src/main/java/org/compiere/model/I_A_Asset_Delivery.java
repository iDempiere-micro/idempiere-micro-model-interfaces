package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Asset_Delivery
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Delivery {

  /** TableName=A_Asset_Delivery */
  String Table_Name = "A_Asset_Delivery";

  /** AD_Table_ID=541 */
  int Table_ID = 541;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name A_Asset_Delivery_ID */
  String COLUMNNAME_A_Asset_Delivery_ID = "A_Asset_Delivery_ID";
  /** Column name A_Asset_Delivery_UU */
  String COLUMNNAME_A_Asset_Delivery_UU = "A_Asset_Delivery_UU";
  /** Column name A_Asset_ID */
  String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DeliveryConfirmation */
  String COLUMNNAME_DeliveryConfirmation = "DeliveryConfirmation";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EMail */
  String COLUMNNAME_EMail = "EMail";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Lot */
  String COLUMNNAME_Lot = "Lot";
  /** Column name MessageID */
  String COLUMNNAME_MessageID = "MessageID";
  /** Column name M_InOutLine_ID */
  String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
  /** Column name MovementDate */
  String COLUMNNAME_MovementDate = "MovementDate";
  /** Column name M_ProductDownload_ID */
  String COLUMNNAME_M_ProductDownload_ID = "M_ProductDownload_ID";
  /** Column name Referrer */
  String COLUMNNAME_Referrer = "Referrer";
  /** Column name Remote_Addr */
  String COLUMNNAME_Remote_Addr = "Remote_Addr";
  /** Column name Remote_Host */
  String COLUMNNAME_Remote_Host = "Remote_Host";
  /** Column name SerNo */
  String COLUMNNAME_SerNo = "SerNo";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name URL */
  String COLUMNNAME_URL = "URL";
  /** Column name VersionNo */
  String COLUMNNAME_VersionNo = "VersionNo";

  /** Get Asset Delivery. Delivery of Asset */
  int getA_Asset_Delivery_ID();

  /** Set Asset Delivery. Delivery of Asset */
  void setA_Asset_Delivery_ID(int A_Asset_Delivery_ID);

  /** Get A_Asset_Delivery_UU */
  String getA_Asset_Delivery_UU();

  /** Set A_Asset_Delivery_UU */
  void setA_Asset_Delivery_UU(String A_Asset_Delivery_UU);

  /** Get Asset. Asset used internally or by customers */
  int getA_Asset_ID();

  /** Set Asset. Asset used internally or by customers */
  void setA_Asset_ID(int A_Asset_ID);

  I_A_Asset getA_Asset() throws RuntimeException;

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  I_AD_User getAD_User() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Delivery Confirmation. EMail Delivery confirmation */
  String getDeliveryConfirmation();

  /** Set Delivery Confirmation. EMail Delivery confirmation */
  void setDeliveryConfirmation(String DeliveryConfirmation);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get EMail Address. Electronic Mail Address */
  String getEMail();

  /** Set EMail Address. Electronic Mail Address */
  void setEMail(String EMail);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Lot No. Lot number (alphanumeric) */
  String getLot();

  /** Set Lot No. Lot number (alphanumeric) */
  void setLot(String Lot);

  /** Get Message ID. EMail Message ID */
  String getMessageID();

  /** Set Message ID. EMail Message ID */
  void setMessageID(String MessageID);

  /** Get Shipment/Receipt Line. Line on Shipment or Receipt document */
  int getM_InOutLine_ID();

  /** Set Shipment/Receipt Line. Line on Shipment or Receipt document */
  void setM_InOutLine_ID(int M_InOutLine_ID);

  I_M_InOutLine getM_InOutLine() throws RuntimeException;

  /** Get Movement Date. Date a product was moved in or out of inventory */
  Timestamp getMovementDate();

  /** Set Movement Date. Date a product was moved in or out of inventory */
  void setMovementDate(Timestamp MovementDate);

  /** Get Product Download. Product downloads */
  int getM_ProductDownload_ID();

  /** Set Product Download. Product downloads */
  void setM_ProductDownload_ID(int M_ProductDownload_ID);

  I_M_ProductDownload getM_ProductDownload() throws RuntimeException;

  /** Get Referrer. Referring web address */
  String getReferrer();

  /** Set Referrer. Referring web address */
  void setReferrer(String Referrer);

  /** Get Remote Addr. Remote Address */
  String getRemote_Addr();

  /** Set Remote Addr. Remote Address */
  void setRemote_Addr(String Remote_Addr);

  /** Get Remote Host. Remote host Info */
  String getRemote_Host();

  /** Set Remote Host. Remote host Info */
  void setRemote_Host(String Remote_Host);

  /** Get Serial No. Product Serial Number */
  String getSerNo();

  /** Set Serial No. Product Serial Number */
  void setSerNo(String SerNo);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get URL. Full URL address - e.g. http://www.idempiere.org */
  String getURL();

  /** Set URL. Full URL address - e.g. http://www.idempiere.org */
  void setURL(String URL);

  /** Get Version No. Version Number */
  String getVersionNo();

  /** Set Version No. Version Number */
  void setVersionNo(String VersionNo);
}
