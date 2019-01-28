package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_AttributeValue
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_AttributeValue {

  /** TableName=M_AttributeValue */
  String Table_Name = "M_AttributeValue";

  /** AD_Table_ID=558 */
  int Table_ID = 558;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

    /** Column name Description */
  String COLUMNNAME_Description = "Description";
    /** Column name M_Attribute_ID */
  String COLUMNNAME_M_Attribute_ID = "M_Attribute_ID";
  /** Column name M_AttributeValue_ID */
  String COLUMNNAME_M_AttributeValue_ID = "M_AttributeValue_ID";
  /** Column name M_AttributeValue_UU */
  String COLUMNNAME_M_AttributeValue_UU = "M_AttributeValue_UU";

    /** Get Attribute. Product Attribute */
  int getMAttribute_ID();

    /** Get Attribute Value. Product Attribute Value */
  int getMAttributeValue_ID();

}
