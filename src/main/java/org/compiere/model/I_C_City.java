package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_City
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_City {

  /** TableName=C_City */
  String Table_Name = "C_City";

  /** AD_Table_ID=186 */
  int Table_ID = 186;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AreaCode */
  String COLUMNNAME_AreaCode = "AreaCode";
  /** Column name C_City_ID */
  String COLUMNNAME_C_City_ID = "C_City_ID";
  /** Column name C_City_UU */
  String COLUMNNAME_C_City_UU = "C_City_UU";
  /** Column name C_Country_ID */
  String COLUMNNAME_C_Country_ID = "C_Country_ID";
  /** Column name Coordinates */
  String COLUMNNAME_Coordinates = "Coordinates";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_Region_ID */
  String COLUMNNAME_C_Region_ID = "C_Region_ID";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Locode */
  String COLUMNNAME_Locode = "Locode";
  /** Column name Postal */
  String COLUMNNAME_Postal = "Postal";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Area Code. Phone Area Code */
  String getAreaCode();

  /** Set Area Code. Phone Area Code */
  void setAreaCode(String AreaCode);

  /** Get City. City */
  int getC_City_ID();

  /** Set City. City */
  void setC_City_ID(int C_City_ID);

  /** Get C_City_UU */
  String getC_City_UU();

  /** Set C_City_UU */
  void setC_City_UU(String C_City_UU);

  /** Get Country. Country */
  int getC_Country_ID();

  /** Set Country. Country */
  void setC_Country_ID(int C_Country_ID);

  I_C_Country getC_Country() throws RuntimeException;

  /** Get Coordinates. Location coordinate */
  String getCoordinates();

  /** Set Coordinates. Location coordinate */
  void setCoordinates(String Coordinates);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Region. Identifies a geographical Region */
  int getC_Region_ID();

  /** Set Region. Identifies a geographical Region */
  void setC_Region_ID(int C_Region_ID);

  I_C_Region getC_Region() throws RuntimeException;

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Locode. Location code - UN/LOCODE */
  String getLocode();

  /** Set Locode. Location code - UN/LOCODE */
  void setLocode(String Locode);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get ZIP. Postal code */
  String getPostal();

  /** Set ZIP. Postal code */
  void setPostal(String Postal);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
