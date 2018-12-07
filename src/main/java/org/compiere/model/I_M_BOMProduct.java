package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_BOMProduct
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_BOMProduct {

  /** TableName=M_BOMProduct */
  String Table_Name = "M_BOMProduct";

  /** AD_Table_ID=801 */
  int Table_ID = 801;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name BOMProductType */
  String COLUMNNAME_BOMProductType = "BOMProductType";
  /** Column name BOMQty */
  String COLUMNNAME_BOMQty = "BOMQty";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsPhantom */
  String COLUMNNAME_IsPhantom = "IsPhantom";
  /** Column name LeadTimeOffset */
  String COLUMNNAME_LeadTimeOffset = "LeadTimeOffset";
  /** Column name Line */
  String COLUMNNAME_Line = "Line";
  /** Column name M_AttributeSetInstance_ID */
  String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
  /** Column name M_BOMAlternative_ID */
  String COLUMNNAME_M_BOMAlternative_ID = "M_BOMAlternative_ID";
  /** Column name M_BOM_ID */
  String COLUMNNAME_M_BOM_ID = "M_BOM_ID";
  /** Column name M_BOMProduct_ID */
  String COLUMNNAME_M_BOMProduct_ID = "M_BOMProduct_ID";
  /** Column name M_BOMProduct_UU */
  String COLUMNNAME_M_BOMProduct_UU = "M_BOMProduct_UU";
  /** Column name M_ChangeNotice_ID */
  String COLUMNNAME_M_ChangeNotice_ID = "M_ChangeNotice_ID";
  /** Column name M_ProductBOM_ID */
  String COLUMNNAME_M_ProductBOM_ID = "M_ProductBOM_ID";
  /** Column name M_ProductOperation_ID */
  String COLUMNNAME_M_ProductOperation_ID = "M_ProductOperation_ID";
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

  /** Get Component Type. BOM Product Type */
  String getBOMProductType();

  /** Set Component Type. BOM Product Type */
  void setBOMProductType(String BOMProductType);

  /** Get BOM Quantity. Bill of Materials Quantity */
  BigDecimal getBOMQty();

  /** Set BOM Quantity. Bill of Materials Quantity */
  void setBOMQty(BigDecimal BOMQty);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Phantom. Phantom Component */
  void setIsPhantom(boolean IsPhantom);

  /** Get Phantom. Phantom Component */
  boolean isPhantom();

  /** Get Lead Time Offset. Optional Lead Time offset before starting production */
  int getLeadTimeOffset();

  /** Set Lead Time Offset. Optional Lead Time offset before starting production */
  void setLeadTimeOffset(int LeadTimeOffset);

  /** Get Line No. Unique line for this document */
  int getLine();

  /** Set Line No. Unique line for this document */
  void setLine(int Line);

  /** Set Attribute Set Instance. Product Attribute Set Instance */
  void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

  /** Get Attribute Set Instance. Product Attribute Set Instance */
  int getMAttributeSetInstance_ID();

  I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

  /** Get Alternative Group. Product BOM Alternative Group */
  int getM_BOMAlternative_ID();

  /** Set Alternative Group. Product BOM Alternative Group */
  void setM_BOMAlternative_ID(int M_BOMAlternative_ID);

  I_M_BOMAlternative getM_BOMAlternative() throws RuntimeException;

  /** Get BOM. Bill of Material */
  int getM_BOM_ID();

  /** Set BOM. Bill of Material */
  void setM_BOM_ID(int M_BOM_ID);

  I_M_BOM getM_BOM() throws RuntimeException;

  /** Get BOM Component. Bill of Material Component (Product) */
  int getM_BOMProduct_ID();

  /** Set BOM Component. Bill of Material Component (Product) */
  void setM_BOMProduct_ID(int M_BOMProduct_ID);

  /** Get M_BOMProduct_UU */
  String getM_BOMProduct_UU();

  /** Set M_BOMProduct_UU */
  void setM_BOMProduct_UU(String M_BOMProduct_UU);

  /** Get Change Notice. Bill of Materials (Engineering) Change Notice (Version) */
  int getM_ChangeNotice_ID();

  /** Set Change Notice. Bill of Materials (Engineering) Change Notice (Version) */
  void setM_ChangeNotice_ID(int M_ChangeNotice_ID);

  I_M_ChangeNotice getM_ChangeNotice() throws RuntimeException;

  /** Get BOM Product. Bill of Material Component Product */
  int getM_ProductBOM_ID();

  /** Set BOM Product. Bill of Material Component Product */
  void setM_ProductBOM_ID(int M_ProductBOM_ID);

  I_M_Product getM_ProductBOM() throws RuntimeException;

  /** Get Product Operation. Product Manufacturing Operation */
  int getM_ProductOperation_ID();

  /** Set Product Operation. Product Manufacturing Operation */
  void setM_ProductOperation_ID(int M_ProductOperation_ID);

  I_M_ProductOperation getM_ProductOperation() throws RuntimeException;

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
