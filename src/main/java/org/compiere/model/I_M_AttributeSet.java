package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_AttributeSet
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_AttributeSet {

  /** TableName=M_AttributeSet */
  String Table_Name = "M_AttributeSet";

  /** AD_Table_ID=560 */
  int Table_ID = 560;

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
  /** Column name GuaranteeDays */
  String COLUMNNAME_GuaranteeDays = "GuaranteeDays";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsAutoGenerateLot */
  String COLUMNNAME_IsAutoGenerateLot = "IsAutoGenerateLot";
  /** Column name IsGuaranteeDate */
  String COLUMNNAME_IsGuaranteeDate = "IsGuaranteeDate";
  /** Column name IsGuaranteeDateMandatory */
  String COLUMNNAME_IsGuaranteeDateMandatory = "IsGuaranteeDateMandatory";
  /** Column name IsInstanceAttribute */
  String COLUMNNAME_IsInstanceAttribute = "IsInstanceAttribute";
  /** Column name IsLot */
  String COLUMNNAME_IsLot = "IsLot";
  /** Column name IsLotMandatory */
  String COLUMNNAME_IsLotMandatory = "IsLotMandatory";
  /** Column name IsSerNo */
  String COLUMNNAME_IsSerNo = "IsSerNo";
  /** Column name IsSerNoMandatory */
  String COLUMNNAME_IsSerNoMandatory = "IsSerNoMandatory";
  /** Column name LotCharEOverwrite */
  String COLUMNNAME_LotCharEOverwrite = "LotCharEOverwrite";
  /** Column name LotCharSOverwrite */
  String COLUMNNAME_LotCharSOverwrite = "LotCharSOverwrite";
  /** Column name MandatoryType */
  String COLUMNNAME_MandatoryType = "MandatoryType";
  /** Column name M_AttributeSet_ID */
  String COLUMNNAME_M_AttributeSet_ID = "M_AttributeSet_ID";
  /** Column name M_AttributeSet_UU */
  String COLUMNNAME_M_AttributeSet_UU = "M_AttributeSet_UU";
  /** Column name M_LotCtl_ID */
  String COLUMNNAME_M_LotCtl_ID = "M_LotCtl_ID";
  /** Column name M_SerNoCtl_ID */
  String COLUMNNAME_M_SerNoCtl_ID = "M_SerNoCtl_ID";
  /** Column name SerNoCharEOverwrite */
  String COLUMNNAME_SerNoCharEOverwrite = "SerNoCharEOverwrite";
  /** Column name SerNoCharSOverwrite */
  String COLUMNNAME_SerNoCharSOverwrite = "SerNoCharSOverwrite";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name UseGuaranteeDateForMPolicy */
  String COLUMNNAME_UseGuaranteeDateForMPolicy = "UseGuaranteeDateForMPolicy";

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

  /** Get Guarantee Days. Number of days the product is guaranteed or available */
  int getGuaranteeDays();

  /** Set Guarantee Days. Number of days the product is guaranteed or available */
  void setGuaranteeDays(int GuaranteeDays);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set IsAutoGenerateLot */
  void setIsAutoGenerateLot(boolean IsAutoGenerateLot);

  /** Get IsAutoGenerateLot */
  boolean isAutoGenerateLot();

  /** Set Guarantee Date. Product has Guarantee or Expiry Date */
  void setIsGuaranteeDate(boolean IsGuaranteeDate);

  /** Get Guarantee Date. Product has Guarantee or Expiry Date */
  boolean isGuaranteeDate();

  /**
   * Set Mandatory Guarantee Date. The entry of a Guarantee Date is mandatory when creating a
   * Product Instance
   */
  void setIsGuaranteeDateMandatory(boolean IsGuaranteeDateMandatory);

  /**
   * Get Mandatory Guarantee Date. The entry of a Guarantee Date is mandatory when creating a
   * Product Instance
   */
  boolean isGuaranteeDateMandatory();

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

  /** Set Lot. The product instances have a Lot Number */
  void setIsLot(boolean IsLot);

  /** Get Lot. The product instances have a Lot Number */
  boolean isLot();

  /** Set Mandatory Lot. The entry of Lot info is mandatory when creating a Product Instance */
  void setIsLotMandatory(boolean IsLotMandatory);

  /** Get Mandatory Lot. The entry of Lot info is mandatory when creating a Product Instance */
  boolean isLotMandatory();

  /** Set Serial No. The product instances have Serial Numbers */
  void setIsSerNo(boolean IsSerNo);

  /** Get Serial No. The product instances have Serial Numbers */
  boolean isSerNo();

  /**
   * Set Mandatory Serial No. The entry of a Serial No is mandatory when creating a Product Instance
   */
  void setIsSerNoMandatory(boolean IsSerNoMandatory);

  /**
   * Get Mandatory Serial No. The entry of a Serial No is mandatory when creating a Product Instance
   */
  boolean isSerNoMandatory();

  /** Get Lot Char End Overwrite. Lot/Batch End Indicator overwrite - default » */
  String getLotCharEOverwrite();

  /** Set Lot Char End Overwrite. Lot/Batch End Indicator overwrite - default » */
  void setLotCharEOverwrite(String LotCharEOverwrite);

  /** Get Lot Char Start Overwrite. Lot/Batch Start Indicator overwrite - default « */
  String getLotCharSOverwrite();

  /** Set Lot Char Start Overwrite. Lot/Batch Start Indicator overwrite - default « */
  void setLotCharSOverwrite(String LotCharSOverwrite);

  /** Get Mandatory Type. The specification of a Product Attribute Instance is mandatory */
  String getMandatoryType();

  /** Set Mandatory Type. The specification of a Product Attribute Instance is mandatory */
  void setMandatoryType(String MandatoryType);

  /** Set Attribute Set. Product Attribute Set */
  void setM_AttributeSet_ID(int M_AttributeSet_ID);

  /** Get Attribute Set. Product Attribute Set */
  int getMAttributeSet_ID();

  /** Set M_AttributeSet_UU */
  void setM_AttributeSet_UU(String M_AttributeSet_UU);

  /** Get M_AttributeSet_UU */
  String getMAttributeSet_UU();

  /** Get Lot Control. Product Lot Control */
  int getM_LotCtl_ID();

  /** Set Lot Control. Product Lot Control */
  void setM_LotCtl_ID(int M_LotCtl_ID);

  I_M_LotCtl getM_LotCtl() throws RuntimeException;

  /** Get Serial No Control. Product Serial Number Control */
  int getM_SerNoCtl_ID();

  /** Set Serial No Control. Product Serial Number Control */
  void setM_SerNoCtl_ID(int M_SerNoCtl_ID);

  I_M_SerNoCtl getM_SerNoCtl() throws RuntimeException;

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get SerNo Char End Overwrite. Serial Number End Indicator overwrite - default empty */
  String getSerNoCharEOverwrite();

  /** Set SerNo Char End Overwrite. Serial Number End Indicator overwrite - default empty */
  void setSerNoCharEOverwrite(String SerNoCharEOverwrite);

  /** Get SerNo Char Start Overwrite. Serial Number Start Indicator overwrite - default # */
  String getSerNoCharSOverwrite();

  /** Set SerNo Char Start Overwrite. Serial Number Start Indicator overwrite - default # */
  void setSerNoCharSOverwrite(String SerNoCharSOverwrite);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Use Guarantee Date for Material Policy */
  boolean isUseGuaranteeDateForMPolicy();

  /** Set Use Guarantee Date for Material Policy */
  void setUseGuaranteeDateForMPolicy(boolean UseGuaranteeDateForMPolicy);
}
