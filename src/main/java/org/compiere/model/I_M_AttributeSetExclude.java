package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_AttributeSetExclude
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_AttributeSetExclude {

  /** TableName=M_AttributeSetExclude */
  String Table_Name = "M_AttributeSetExclude";

  /** AD_Table_ID=809 */
  int Table_ID = 809;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsSOTrx */
  String COLUMNNAME_IsSOTrx = "IsSOTrx";
  /** Column name M_AttributeSetExclude_ID */
  String COLUMNNAME_M_AttributeSetExclude_ID = "M_AttributeSetExclude_ID";
  /** Column name M_AttributeSetExclude_UU */
  String COLUMNNAME_M_AttributeSetExclude_UU = "M_AttributeSetExclude_UU";
  /** Column name M_AttributeSet_ID */
  String COLUMNNAME_M_AttributeSet_ID = "M_AttributeSet_ID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Table. Database Table information */
  int getAD_Table_ID();

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  I_AD_Table getAD_Table() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Sales Transaction. This is a Sales Transaction */
  void setIsSOTrx(boolean IsSOTrx);

  /** Get Sales Transaction. This is a Sales Transaction */
  boolean isSOTrx();

  /** Set Exclude Attribute Set. Exclude the ability to enter Attribute Sets */
  void setM_AttributeSetExclude_ID(int M_AttributeSetExclude_ID);

  /** Get Exclude Attribute Set. Exclude the ability to enter Attribute Sets */
  int getMAttributeSetExclude_ID();

  /** Set M_AttributeSetExclude_UU */
  void setM_AttributeSetExclude_UU(String M_AttributeSetExclude_UU);

  /** Get M_AttributeSetExclude_UU */
  String getMAttributeSetExclude_UU();

  /** Set Attribute Set. Product Attribute Set */
  void setM_AttributeSet_ID(int M_AttributeSet_ID);

  /** Get Attribute Set. Product Attribute Set */
  int getMAttributeSet_ID();

  I_M_AttributeSet getMAttributeSet() throws RuntimeException;

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
