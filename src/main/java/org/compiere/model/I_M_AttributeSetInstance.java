package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_AttributeSetInstance
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_AttributeSetInstance {

  /** TableName=M_AttributeSetInstance */
  String Table_Name = "M_AttributeSetInstance";

  /** AD_Table_ID=559 */
  int Table_ID = 559;

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
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name GuaranteeDate */
  String COLUMNNAME_GuaranteeDate = "GuaranteeDate";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Lot */
  String COLUMNNAME_Lot = "Lot";
  /** Column name M_AttributeSet_ID */
  String COLUMNNAME_M_AttributeSet_ID = "M_AttributeSet_ID";
  /** Column name M_AttributeSetInstance_ID */
  String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
  /** Column name M_AttributeSetInstance_UU */
  String COLUMNNAME_M_AttributeSetInstance_UU = "M_AttributeSetInstance_UU";
  /** Column name M_Lot_ID */
  String COLUMNNAME_M_Lot_ID = "M_Lot_ID";
  /** Column name SerNo */
  String COLUMNNAME_SerNo = "SerNo";
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

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Guarantee Date. Date when guarantee expires */
  Timestamp getGuaranteeDate();

  /** Set Guarantee Date. Date when guarantee expires */
  void setGuaranteeDate(Timestamp GuaranteeDate);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Lot No. Lot number (alphanumeric) */
  String getLot();

  /** Set Lot No. Lot number (alphanumeric) */
  void setLot(String Lot);

  /** Set Attribute Set. Product Attribute Set */
  void setM_AttributeSet_ID(int M_AttributeSet_ID);

  /** Get Attribute Set. Product Attribute Set */
  int getMAttributeSet_ID();

  I_M_AttributeSet getMAttributeSet() throws RuntimeException;

  /** Set Attribute Set Instance. Product Attribute Set Instance */
  void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

  /** Get Attribute Set Instance. Product Attribute Set Instance */
  int getMAttributeSetInstance_ID();

  /** Set M_AttributeSetInstance_UU */
  void setM_AttributeSetInstance_UU(String M_AttributeSetInstance_UU);

  /** Get M_AttributeSetInstance_UU */
  String getMAttributeSetInstance_UU();

  /** Get Lot. Product Lot Definition */
  int getM_Lot_ID();

  /** Set Lot. Product Lot Definition */
  void setM_Lot_ID(int M_Lot_ID);

  I_M_Lot getM_Lot() throws RuntimeException;

  /** Get Serial No. Product Serial Number */
  String getSerNo();

  /** Set Serial No. Product Serial Number */
  void setSerNo(String SerNo);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
