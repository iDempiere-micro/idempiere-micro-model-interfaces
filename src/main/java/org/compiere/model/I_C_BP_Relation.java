package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_BP_Relation
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_BP_Relation {

  /** TableName=C_BP_Relation */
  String Table_Name = "C_BP_Relation";

  /** AD_Table_ID=678 */
  int Table_ID = 678;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BPartner_Location_ID */
  String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
  /** Column name C_BPartnerRelation_ID */
  String COLUMNNAME_C_BPartnerRelation_ID = "C_BPartnerRelation_ID";
  /** Column name C_BPartnerRelation_Location_ID */
  String COLUMNNAME_C_BPartnerRelation_Location_ID = "C_BPartnerRelation_Location_ID";
  /** Column name C_BP_Relation_ID */
  String COLUMNNAME_C_BP_Relation_ID = "C_BP_Relation_ID";
  /** Column name C_BP_Relation_UU */
  String COLUMNNAME_C_BP_Relation_UU = "C_BP_Relation_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsBillTo */
  String COLUMNNAME_IsBillTo = "IsBillTo";
  /** Column name IsPayFrom */
  String COLUMNNAME_IsPayFrom = "IsPayFrom";
  /** Column name IsRemitTo */
  String COLUMNNAME_IsRemitTo = "IsRemitTo";
  /** Column name IsShipTo */
  String COLUMNNAME_IsShipTo = "IsShipTo";
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

  /** Get Related Partner. Related Business Partner */
  int getC_BPartnerRelation_ID();

  /** Set Related Partner. Related Business Partner */
  void setC_BPartnerRelation_ID(int C_BPartnerRelation_ID);

  I_C_BPartner getC_BPartnerRelation() throws RuntimeException;

  /** Get Related Partner Location. Location of the related Business Partner */
  int getC_BPartnerRelation_Location_ID();

  /** Set Related Partner Location. Location of the related Business Partner */
  void setC_BPartnerRelation_Location_ID(int C_BPartnerRelation_Location_ID);

  I_C_BPartner_Location getC_BPartnerRelation_Location() throws RuntimeException;

  /** Get Partner Relation. Business Partner Relation */
  int getC_BP_Relation_ID();

  /** Set Partner Relation. Business Partner Relation */
  void setC_BP_Relation_ID(int C_BP_Relation_ID);

  /** Get C_BP_Relation_UU */
  String getC_BP_Relation_UU();

  /** Set C_BP_Relation_UU */
  void setC_BP_Relation_UU(String C_BP_Relation_UU);

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

  /** Set Invoice Address. Business Partner Invoice/Bill Address */
  void setIsBillTo(boolean IsBillTo);

  /** Get Invoice Address. Business Partner Invoice/Bill Address */
  boolean isBillTo();

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

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
