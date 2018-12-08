package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_Location
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Location {
  /** TableName=C_Location */
  String Table_Name = "C_Location";

  /** AD_Table_ID=162 */
  int Table_ID = 162;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name Address1 */
  String COLUMNNAME_Address1 = "Address1";
  /** Column name Address2 */
  String COLUMNNAME_Address2 = "Address2";
  /** Column name Address3 */
  String COLUMNNAME_Address3 = "Address3";
  /** Column name Address4 */
  String COLUMNNAME_Address4 = "Address4";
  /** Column name Address5 */
  String COLUMNNAME_Address5 = "Address5";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_AddressValidation_ID */
  String COLUMNNAME_C_AddressValidation_ID = "C_AddressValidation_ID";
  /** Column name C_City_ID */
  String COLUMNNAME_C_City_ID = "C_City_ID";
  /** Column name C_Country_ID */
  String COLUMNNAME_C_Country_ID = "C_Country_ID";
  /** Column name City */
  String COLUMNNAME_City = "City";
  /** Column name C_Location_ID */
  String COLUMNNAME_C_Location_ID = "C_Location_ID";
  /** Column name C_Location_UU */
  String COLUMNNAME_C_Location_UU = "C_Location_UU";
  /** Column name Comments */
  String COLUMNNAME_Comments = "Comments";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_Region_ID */
  String COLUMNNAME_C_Region_ID = "C_Region_ID";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsValid */
  String COLUMNNAME_IsValid = "IsValid";
  /** Column name Postal */
  String COLUMNNAME_Postal = "Postal";
  /** Column name Postal_Add */
  String COLUMNNAME_Postal_Add = "Postal_Add";
  /** Column name RegionName */
  String COLUMNNAME_RegionName = "RegionName";
  /** Column name Result */
  String COLUMNNAME_Result = "Result";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name ValidateAddress */
  String COLUMNNAME_ValidateAddress = "ValidateAddress";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Address Validation */
  int getC_AddressValidation_ID();

  /** Set Address Validation */
  void setC_AddressValidation_ID(int C_AddressValidation_ID);

  I_C_AddressValidation getC_AddressValidation() throws RuntimeException;

  /** Get City. City */
  int getC_City_ID();

  /** Set City. City */
  void setC_City_ID(int C_City_ID);

  I_C_City getC_City() throws RuntimeException;

  /** Get Country. Country */
  int getC_Country_ID();

  /** Set Country. Country */
  void setC_Country_ID(int C_Country_ID);

  I_C_Country getC_Country() throws RuntimeException;

  /** Get Address. Location or Address */
  int getC_Location_ID();

  /** Set Address. Location or Address */
  void setC_Location_ID(int C_Location_ID);

  /** Get C_Location_UU */
  String getC_Location_UU();

  /** Set C_Location_UU */
  void setC_Location_UU(String C_Location_UU);

  /** Get Comments. Comments or additional information */
  String getComments();

  /** Set Comments. Comments or additional information */
  void setComments(String Comments);

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

  /** Set Valid. Element is valid */
  void setIsValid(boolean IsValid);

  /** Get Valid. Element is valid */
  boolean isValid();

  /** Get ZIP. Postal code */
  String getPostal();

  /** Set ZIP. Postal code */
  void setPostal(String Postal);

  /** Get Additional Zip. Additional ZIP or Postal code */
  String getPostal_Add();

  /** Set Additional Zip. Additional ZIP or Postal code */
  void setPostal_Add(String Postal_Add);

  /** Get Region. Name of the Region */
  String getRegionName();

  /** Set Region. Name of the Region */
  void setRegionName(String RegionName);

  /** Get Result. Result of the action taken */
  String getResult();

  /** Set Result. Result of the action taken */
  void setResult(String Result);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Validate Address */
  String getValidateAddress();

  /** Set Validate Address */
  void setValidateAddress(String ValidateAddress);

  boolean equals(
      int c_country_id,
      int c_region_id,
      String postal,
      String s,
      String city,
      String address1,
      String address2);

  String getAddress1();

  /** Set Address 1. Address line 1 for this location */
  void setAddress1(String Address1);

  String getAddress2();

  /** Set Address 2. Address line 2 for this location */
  void setAddress2(String Address2);

  String getAddress3();

  /** Set Address 3. Address Line 3 for the location */
  void setAddress3(String Address3);

  String getAddress4();

  /** Set Address 4. Address Line 4 for the location */
  void setAddress4(String Address4);

  String getAddress5();

  /** Set Address 5. Address Line 5 for the location */
  void setAddress5(String Address5);

  String getCity();

  /** Set City. Identifies a City */
  void setCity(String City);

  String getCountryName();
}
