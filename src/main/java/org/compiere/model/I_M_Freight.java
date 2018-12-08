package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_Freight
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Freight {

  /** TableName=M_Freight */
  String Table_Name = "M_Freight";

  /** AD_Table_ID=596 */
  int Table_ID = 596;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_Country_ID */
  String COLUMNNAME_C_Country_ID = "C_Country_ID";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_Region_ID */
  String COLUMNNAME_C_Region_ID = "C_Region_ID";
  /** Column name FreightAmt */
  String COLUMNNAME_FreightAmt = "FreightAmt";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_FreightCategory_ID */
  String COLUMNNAME_M_FreightCategory_ID = "M_FreightCategory_ID";
  /** Column name M_Freight_ID */
  String COLUMNNAME_M_Freight_ID = "M_Freight_ID";
  /** Column name M_Freight_UU */
  String COLUMNNAME_M_Freight_UU = "M_Freight_UU";
  /** Column name M_Shipper_ID */
  String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
  /** Column name To_Country_ID */
  String COLUMNNAME_To_Country_ID = "To_Country_ID";
  /** Column name To_Region_ID */
  String COLUMNNAME_To_Region_ID = "To_Region_ID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name ValidFrom */
  String COLUMNNAME_ValidFrom = "ValidFrom";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Country. Country */
  int getC_Country_ID();

  /** Set Country. Country */
  void setC_Country_ID(int C_Country_ID);

  I_C_Country getC_Country() throws RuntimeException;

  /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

  /** Set Currency. The Currency for this record */
  void setC_Currency_ID(int C_Currency_ID);

  I_C_Currency getC_Currency() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Region. Identifies a geographical Region */
  int getC_Region_ID();

  /** Set Region. Identifies a geographical Region */
  void setC_Region_ID(int C_Region_ID);

  I_C_Region getC_Region() throws RuntimeException;

  /** Get Freight Amount. Freight Amount */
  BigDecimal getFreightAmt();

  /** Set Freight Amount. Freight Amount */
  void setFreightAmt(BigDecimal FreightAmt);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Freight Category. Category of the Freight */
  int getM_FreightCategory_ID();

  /** Set Freight Category. Category of the Freight */
  void setM_FreightCategory_ID(int M_FreightCategory_ID);

  I_M_FreightCategory getM_FreightCategory() throws RuntimeException;

  /** Get Freight. Freight Rate */
  int getM_Freight_ID();

  /** Set Freight. Freight Rate */
  void setM_Freight_ID(int M_Freight_ID);

  /** Get M_Freight_UU */
  String getM_Freight_UU();

  /** Set M_Freight_UU */
  void setM_Freight_UU(String M_Freight_UU);

  /** Get Shipper. Method or manner of product delivery */
  int getM_Shipper_ID();

  /** Set Shipper. Method or manner of product delivery */
  void setM_Shipper_ID(int M_Shipper_ID);

  I_M_Shipper getM_Shipper() throws RuntimeException;

  /** Get To. Receiving Country */
  int getTo_Country_ID();

  /** Set To. Receiving Country */
  void setTo_Country_ID(int To_Country_ID);

  /** Get To. Receiving Region */
  int getTo_Region_ID();

  /** Set To. Receiving Region */
  void setTo_Region_ID(int To_Region_ID);

  I_C_Region getTo_Region() throws RuntimeException;

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Valid from. Valid from including this date (first day) */
  Timestamp getValidFrom();

  /** Set Valid from. Valid from including this date (first day) */
  void setValidFrom(Timestamp ValidFrom);
}
