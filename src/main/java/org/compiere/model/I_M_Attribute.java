package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_Attribute
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Attribute {

  /** TableName=M_Attribute */
  String Table_Name = "M_Attribute";

  /** AD_Table_ID=562 */
  int Table_ID = 562;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AttributeValueType */
  String COLUMNNAME_AttributeValueType = "AttributeValueType";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsInstanceAttribute */
  String COLUMNNAME_IsInstanceAttribute = "IsInstanceAttribute";
  /** Column name IsMandatory */
  String COLUMNNAME_IsMandatory = "IsMandatory";
  /** Column name M_Attribute_ID */
  String COLUMNNAME_M_Attribute_ID = "M_Attribute_ID";
  /** Column name M_AttributeSearch_ID */
  String COLUMNNAME_M_AttributeSearch_ID = "M_AttributeSearch_ID";
  /** Column name M_Attribute_UU */
  String COLUMNNAME_M_Attribute_UU = "M_Attribute_UU";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Attribute Value Type. Type of Attribute Value */
  String getAttributeValueType();

  /** Set Attribute Value Type. Type of Attribute Value */
  void setAttributeValueType(String AttributeValueType);

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

  /**
   * Set Instance Attribute. The product attribute is specific to the instance (like Serial No, Lot
   * or Guarantee Date)
   */
  void setIsInstanceAttribute(boolean IsInstanceAttribute);

  /**
   * Get Instance Attribute. The product attribute is specific to the instance (like Serial No, Lot
   * or Guarantee Date)
   */
  boolean isInstanceAttribute();

  /** Set Mandatory. Data entry is required in this column */
  void setIsMandatory(boolean IsMandatory);

  /** Get Mandatory. Data entry is required in this column */
  boolean isMandatory();

  /** Set Attribute. Product Attribute */
  void setMAttributeID(int M_Attribute_ID);

  /** Get Attribute. Product Attribute */
  int getMAttribute_ID();

  /** Set Attribute Search. Common Search Attribute */
  void setM_AttributeSearch_ID(int M_AttributeSearch_ID);

  /** Get Attribute Search. Common Search Attribute */
  int getMAttributeSearch_ID();

  I_M_AttributeSearch getMAttributeSearch() throws RuntimeException;

  /** Set M_Attribute_UU */
  void setM_Attribute_UU(String M_Attribute_UU);

  /** Get M_Attribute_UU */
  String getMAttribute_UU();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
