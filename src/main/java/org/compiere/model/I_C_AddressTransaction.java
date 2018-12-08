package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_AddressTransaction
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_AddressTransaction {

  /** TableName=C_AddressTransaction */
  String Table_Name = "C_AddressTransaction";

  /** AD_Table_ID=200102 */
  int Table_ID = 200102;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

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
  /** Column name C_AddressTransaction_ID */
  String COLUMNNAME_C_AddressTransaction_ID = "C_AddressTransaction_ID";
  /** Column name C_AddressTransaction_UU */
  String COLUMNNAME_C_AddressTransaction_UU = "C_AddressTransaction_UU";
  /** Column name C_AddressValidation_ID */
  String COLUMNNAME_C_AddressValidation_ID = "C_AddressValidation_ID";
  /** Column name City */
  String COLUMNNAME_City = "City";
  /** Column name C_Location_ID */
  String COLUMNNAME_C_Location_ID = "C_Location_ID";
  /** Column name Comments */
  String COLUMNNAME_Comments = "Comments";
  /** Column name Country */
  String COLUMNNAME_Country = "Country";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsValid */
  String COLUMNNAME_IsValid = "IsValid";
  /** Column name Postal */
  String COLUMNNAME_Postal = "Postal";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Region */
  String COLUMNNAME_Region = "Region";
  /** Column name Result */
  String COLUMNNAME_Result = "Result";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Address 1. Address line 1 for this location */
  String getAddress1();

  /** Set Address 1. Address line 1 for this location */
  void setAddress1(String Address1);

  /** Get Address 2. Address line 2 for this location */
  String getAddress2();

  /** Set Address 2. Address line 2 for this location */
  void setAddress2(String Address2);

  /** Get Address 3. Address Line 3 for the location */
  String getAddress3();

  /** Set Address 3. Address Line 3 for the location */
  void setAddress3(String Address3);

  /** Get Address 4. Address Line 4 for the location */
  String getAddress4();

  /** Set Address 4. Address Line 4 for the location */
  void setAddress4(String Address4);

  /** Get Address 5. Address Line 5 for the location */
  String getAddress5();

  /** Set Address 5. Address Line 5 for the location */
  void setAddress5(String Address5);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Address Transaction */
  int getC_AddressTransaction_ID();

  /** Set Address Transaction */
  void setC_AddressTransaction_ID(int C_AddressTransaction_ID);

  /** Get C_AddressTransaction_UU */
  String getC_AddressTransaction_UU();

  /** Set C_AddressTransaction_UU */
  void setC_AddressTransaction_UU(String C_AddressTransaction_UU);

  /** Get Address Validation */
  int getC_AddressValidation_ID();

  /** Set Address Validation */
  void setC_AddressValidation_ID(int C_AddressValidation_ID);

  I_C_AddressValidation getC_AddressValidation() throws RuntimeException;

  /** Get City. Identifies a City */
  String getCity();

  /** Set City. Identifies a City */
  void setCity(String City);

  /** Get Address. Location or Address */
  int getC_Location_ID();

  /** Set Address. Location or Address */
  void setC_Location_ID(int C_Location_ID);

  I_C_Location getC_Location() throws RuntimeException;

  /** Get Comments. Comments or additional information */
  String getComments();

  /** Set Comments. Comments or additional information */
  void setComments(String Comments);

  /** Get Country */
  String getCountry();

  /** Set Country */
  void setCountry(String Country);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

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

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Region */
  String getRegion();

  /** Set Region */
  void setRegion(String Region);

  /** Get Result. Result of the action taken */
  String getResult();

  /** Set Result. Result of the action taken */
  void setResult(String Result);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
