package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ShipperLabelsCfg
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ShipperLabelsCfg {

  /** TableName=M_ShipperLabelsCfg */
  String Table_Name = "M_ShipperLabelsCfg";

  /** AD_Table_ID=200048 */
  int Table_ID = 200048;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Height */
  String COLUMNNAME_Height = "Height";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsDefault */
  String COLUMNNAME_IsDefault = "IsDefault";
  /** Column name LabelPrintMethod */
  String COLUMNNAME_LabelPrintMethod = "LabelPrintMethod";
  /** Column name M_ShipperCfg_ID */
  String COLUMNNAME_M_ShipperCfg_ID = "M_ShipperCfg_ID";
  /** Column name M_ShipperLabelsCfg_ID */
  String COLUMNNAME_M_ShipperLabelsCfg_ID = "M_ShipperLabelsCfg_ID";
  /** Column name M_ShipperLabelsCfg_UU */
  String COLUMNNAME_M_ShipperLabelsCfg_UU = "M_ShipperLabelsCfg_UU";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name Value */
  String COLUMNNAME_Value = "Value";
  /** Column name Width */
  String COLUMNNAME_Width = "Width";

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

  /** Get Height */
  BigDecimal getHeight();

  /** Set Height */
  void setHeight(BigDecimal Height);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Default. Default value */
  void setIsDefault(boolean IsDefault);

  /** Get Default. Default value */
  boolean isDefault();

  /** Get Label Print Method */
  String getLabelPrintMethod();

  /** Set Label Print Method */
  void setLabelPrintMethod(String LabelPrintMethod);

  /** Get Shipper Configuration */
  int getM_ShipperCfg_ID();

  /** Set Shipper Configuration */
  void setM_ShipperCfg_ID(int M_ShipperCfg_ID);

  I_M_ShipperCfg getM_ShipperCfg() throws RuntimeException;

  /** Get Shipper Labels Configuration */
  int getM_ShipperLabelsCfg_ID();

  /** Set Shipper Labels Configuration */
  void setM_ShipperLabelsCfg_ID(int M_ShipperLabelsCfg_ID);

  /** Get M_ShipperLabelsCfg_UU */
  String getM_ShipperLabelsCfg_UU();

  /** Set M_ShipperLabelsCfg_UU */
  void setM_ShipperLabelsCfg_UU(String M_ShipperLabelsCfg_UU);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);

  /** Get Width */
  BigDecimal getWidth();

  /** Set Width */
  void setWidth(BigDecimal Width);
}
