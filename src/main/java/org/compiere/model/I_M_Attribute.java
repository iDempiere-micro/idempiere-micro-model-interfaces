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

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

    /** Column name AttributeValueType */
  String COLUMNNAME_AttributeValueType = "AttributeValueType";
    /** Column name Description */
  String COLUMNNAME_Description = "Description";
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

    /** Get Attribute Value Type. Type of Attribute Value */
  String getAttributeValueType();

  /** Set Attribute Value Type. Type of Attribute Value */
  void setAttributeValueType(String AttributeValueType);

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

    /** Get Attribute. Product Attribute */
  int getMAttribute_ID();

    /** Get Attribute Search. Common Search Attribute */
  int getMAttributeSearch_ID();

}
