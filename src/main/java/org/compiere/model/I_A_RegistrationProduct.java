package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_RegistrationProduct
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_RegistrationProduct {

  /** TableName=A_RegistrationProduct */
  String Table_Name = "A_RegistrationProduct";

  /** AD_Table_ID=715 */
  int Table_ID = 715;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name A_RegistrationAttribute_ID */
  String COLUMNNAME_A_RegistrationAttribute_ID = "A_RegistrationAttribute_ID";
  /** Column name A_RegistrationProduct_UU */
  String COLUMNNAME_A_RegistrationProduct_UU = "A_RegistrationProduct_UU";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Registration Attribute. Asset Registration Attribute */
  int getA_RegistrationAttribute_ID();

  /** Set Registration Attribute. Asset Registration Attribute */
  void setA_RegistrationAttribute_ID(int A_RegistrationAttribute_ID);

  I_A_RegistrationAttribute getA_RegistrationAttribute() throws RuntimeException;

  /** Get A_RegistrationProduct_UU */
  String getA_RegistrationProduct_UU();

  /** Set A_RegistrationProduct_UU */
  void setA_RegistrationProduct_UU(String A_RegistrationProduct_UU);

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

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
