package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_AttributeUse
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_AttributeUse {

  /** TableName=M_AttributeUse */
  String Table_Name = "M_AttributeUse";

  /** AD_Table_ID=563 */
  int Table_ID = 563;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_Attribute_ID */
  String COLUMNNAME_M_Attribute_ID = "M_Attribute_ID";
  /** Column name M_AttributeSet_ID */
  String COLUMNNAME_M_AttributeSet_ID = "M_AttributeSet_ID";
  /** Column name M_AttributeUse_UU */
  String COLUMNNAME_M_AttributeUse_UU = "M_AttributeUse_UU";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Attribute. Product Attribute */
  void setMAttributeID(int M_Attribute_ID);

  /** Get Attribute. Product Attribute */
  int getMAttribute_ID();

  I_M_Attribute getMAttribute() throws RuntimeException;

  /** Set Attribute Set. Product Attribute Set */
  void setM_AttributeSet_ID(int M_AttributeSet_ID);

  /** Get Attribute Set. Product Attribute Set */
  int getMAttributeSet_ID();

  I_M_AttributeSet getMAttributeSet() throws RuntimeException;

  /** Set M_AttributeUse_UU */
  void setM_AttributeUse_UU(String M_AttributeUse_UU);

  /** Get M_AttributeUse_UU */
  String getMAttributeUse_UU();

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
