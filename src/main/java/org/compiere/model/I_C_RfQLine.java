package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_RfQLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_RfQLine {

  /** TableName=C_RfQLine */
  String Table_Name = "C_RfQLine";

  /** AD_Table_ID=676 */
  int Table_ID = 676;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_RfQ_ID */
  String COLUMNNAME_C_RfQ_ID = "C_RfQ_ID";
  /** Column name C_RfQLine_ID */
  String COLUMNNAME_C_RfQLine_ID = "C_RfQLine_ID";
  /** Column name C_RfQLine_UU */
  String COLUMNNAME_C_RfQLine_UU = "C_RfQLine_UU";
  /** Column name DateWorkComplete */
  String COLUMNNAME_DateWorkComplete = "DateWorkComplete";
  /** Column name DateWorkStart */
  String COLUMNNAME_DateWorkStart = "DateWorkStart";
  /** Column name DeliveryDays */
  String COLUMNNAME_DeliveryDays = "DeliveryDays";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Line */
  String COLUMNNAME_Line = "Line";
  /** Column name M_AttributeSetInstance_ID */
  String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
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

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get RfQ. Request for Quotation */
  int getC_RfQ_ID();

  /** Set RfQ. Request for Quotation */
  void setC_RfQ_ID(int C_RfQ_ID);

  I_C_RfQ getC_RfQ() throws RuntimeException;

  /** Get RfQ Line. Request for Quotation Line */
  int getC_RfQLine_ID();

  /** Set RfQ Line. Request for Quotation Line */
  void setC_RfQLine_ID(int C_RfQLine_ID);

  /** Get C_RfQLine_UU */
  String getC_RfQLine_UU();

  /** Set C_RfQLine_UU */
  void setC_RfQLine_UU(String C_RfQLine_UU);

  /** Get Work Complete. Date when work is (planned to be) complete */
  Timestamp getDateWorkComplete();

  /** Set Work Complete. Date when work is (planned to be) complete */
  void setDateWorkComplete(Timestamp DateWorkComplete);

  /** Get Work Start. Date when work is (planned to be) started */
  Timestamp getDateWorkStart();

  /** Set Work Start. Date when work is (planned to be) started */
  void setDateWorkStart(Timestamp DateWorkStart);

  /** Get Delivery Days. Number of Days (planned) until Delivery */
  int getDeliveryDays();

  /** Set Delivery Days. Number of Days (planned) until Delivery */
  void setDeliveryDays(int DeliveryDays);

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

  /** Get Line No. Unique line for this document */
  int getLine();

  /** Set Line No. Unique line for this document */
  void setLine(int Line);

  /** Set Attribute Set Instance. Product Attribute Set Instance */
  void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

  /** Get Attribute Set Instance. Product Attribute Set Instance */
  int getMAttributeSetInstance_ID();

  I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

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
