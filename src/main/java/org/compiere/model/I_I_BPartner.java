package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for I_BPartner
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_I_BPartner {

  /** TableName=I_BPartner */
  String Table_Name = "I_BPartner";

  /** AD_Table_ID=533 */
  int Table_ID = 533;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name Address1 */
  String COLUMNNAME_Address1 = "Address1";
  /** Column name Address2 */
  String COLUMNNAME_Address2 = "Address2";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name Birthday */
  String COLUMNNAME_Birthday = "Birthday";
  /** Column name BPContactGreeting */
  String COLUMNNAME_BPContactGreeting = "BPContactGreeting";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BPartner_Location_ID */
  String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
  /** Column name C_BP_Group_ID */
  String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
  /** Column name C_Country_ID */
  String COLUMNNAME_C_Country_ID = "C_Country_ID";
  /** Column name C_Greeting_ID */
  String COLUMNNAME_C_Greeting_ID = "C_Greeting_ID";
  /** Column name City */
  String COLUMNNAME_City = "City";
  /** Column name Comments */
  String COLUMNNAME_Comments = "Comments";
  /** Column name ContactDescription */
  String COLUMNNAME_ContactDescription = "ContactDescription";
  /** Column name ContactName */
  String COLUMNNAME_ContactName = "ContactName";
  /** Column name CountryCode */
  String COLUMNNAME_CountryCode = "CountryCode";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_Region_ID */
  String COLUMNNAME_C_Region_ID = "C_Region_ID";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DUNS */
  String COLUMNNAME_DUNS = "DUNS";
  /** Column name EMail */
  String COLUMNNAME_EMail = "EMail";
  /** Column name Fax */
  String COLUMNNAME_Fax = "Fax";
  /** Column name GroupValue */
  String COLUMNNAME_GroupValue = "GroupValue";
  /** Column name I_BPartner_ID */
  String COLUMNNAME_I_BPartner_ID = "I_BPartner_ID";
  /** Column name I_BPartner_UU */
  String COLUMNNAME_I_BPartner_UU = "I_BPartner_UU";
  /** Column name I_ErrorMsg */
  String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
  /** Column name I_IsImported */
  String COLUMNNAME_I_IsImported = "I_IsImported";
  /** Column name InterestAreaName */
  String COLUMNNAME_InterestAreaName = "InterestAreaName";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsCustomer */
  String COLUMNNAME_IsCustomer = "IsCustomer";
  /** Column name IsEmployee */
  String COLUMNNAME_IsEmployee = "IsEmployee";
  /** Column name IsVendor */
  String COLUMNNAME_IsVendor = "IsVendor";
  /** Column name NAICS */
  String COLUMNNAME_NAICS = "NAICS";
  /** Column name Password */
  String COLUMNNAME_Password = "Password";
  /** Column name Phone */
  String COLUMNNAME_Phone = "Phone";
  /** Column name Phone2 */
  String COLUMNNAME_Phone2 = "Phone2";
  /** Column name Postal */
  String COLUMNNAME_Postal = "Postal";
  /** Column name Postal_Add */
  String COLUMNNAME_Postal_Add = "Postal_Add";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name RegionName */
  String COLUMNNAME_RegionName = "RegionName";
  /** Column name R_InterestArea_ID */
  String COLUMNNAME_R_InterestArea_ID = "R_InterestArea_ID";
  /** Column name TaxID */
  String COLUMNNAME_TaxID = "TaxID";
  /** Column name Title */
  String COLUMNNAME_Title = "Title";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name Value */
  String COLUMNNAME_Value = "Value";

  String COLUMNNAME_I_IsShipTo = "IsShipTo";
  String COLUMNNAME_I_IsBillTo = "IsBillTo";

  /** Get Address 1. Address line 1 for this location */
  String getAddress1();

  /** Set Address 1. Address line 1 for this location */
  void setAddress1(String Address1);

  /** Get Address 2. Address line 2 for this location */
  String getAddress2();

  /** Set Address 2. Address line 2 for this location */
  void setAddress2(String Address2);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  I_AD_User getAD_User() throws RuntimeException;

  /** Get Birthday. Birthday or Anniversary day */
  Timestamp getBirthday();

  /** Set Birthday. Birthday or Anniversary day */
  void setBirthday(Timestamp Birthday);

  /** Get BP Contact Greeting. Greeting for Business Partner Contact */
  String getBPContactGreeting();

  /** Set BP Contact Greeting. Greeting for Business Partner Contact */
  void setBPContactGreeting(String BPContactGreeting);

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Partner Location. Identifies the (ship to) address for this Business Partner */
  int getC_BPartner_Location_ID();

  /** Set Partner Location. Identifies the (ship to) address for this Business Partner */
  void setC_BPartner_Location_ID(int C_BPartner_Location_ID);

  I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException;

  /** Get Business Partner Group. Business Partner Group */
  int getC_BP_Group_ID();

  /** Set Business Partner Group. Business Partner Group */
  void setC_BP_Group_ID(int C_BP_Group_ID);

  I_C_BP_Group getC_BP_Group() throws RuntimeException;

  /** Get Country. Country */
  int getC_Country_ID();

  /** Set Country. Country */
  void setC_Country_ID(int C_Country_ID);

  I_C_Country getC_Country() throws RuntimeException;

  /** Get Greeting. Greeting to print on correspondence */
  int getC_Greeting_ID();

  /** Set Greeting. Greeting to print on correspondence */
  void setC_Greeting_ID(int C_Greeting_ID);

  I_C_Greeting getC_Greeting() throws RuntimeException;

  /** Get City. Identifies a City */
  String getCity();

  /** Set City. Identifies a City */
  void setCity(String City);

  /** Get Comments. Comments or additional information */
  String getComments();

  /** Set Comments. Comments or additional information */
  void setComments(String Comments);

  /** Get Contact Description. Description of Contact */
  String getContactDescription();

  /** Set Contact Description. Description of Contact */
  void setContactDescription(String ContactDescription);

  /** Get Contact Name. Business Partner Contact Name */
  String getContactName();

  /** Set Contact Name. Business Partner Contact Name */
  void setContactName(String ContactName);

  /**
   * Get ISO Country Code. Upper-case two-letter alphanumeric ISO Country code according to ISO
   * 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html
   */
  String getCountryCode();

  /**
   * Set ISO Country Code. Upper-case two-letter alphanumeric ISO Country code according to ISO
   * 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html
   */
  void setCountryCode(String CountryCode);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Region. Identifies a geographical Region */
  int getC_Region_ID();

  /** Set Region. Identifies a geographical Region */
  void setC_Region_ID(int C_Region_ID);

  I_C_Region getC_Region() throws RuntimeException;

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get D-U-N-S. Dun & Bradstreet Number */
  String getDUNS();

  /** Set D-U-N-S. Dun & Bradstreet Number */
  void setDUNS(String DUNS);

  /** Get EMail Address. Electronic Mail Address */
  String getEMail();

  /** Set EMail Address. Electronic Mail Address */
  void setEMail(String EMail);

  /** Get Fax. Facsimile number */
  String getFax();

  /** Set Fax. Facsimile number */
  void setFax(String Fax);

  /** Get Group Key. Business Partner Group Key */
  String getGroupValue();

  /** Set Group Key. Business Partner Group Key */
  void setGroupValue(String GroupValue);

  /** Get Import Business Partner */
  int getI_BPartner_ID();

  /** Set Import Business Partner */
  void setI_BPartner_ID(int I_BPartner_ID);

  /** Get I_BPartner_UU */
  String getI_BPartner_UU();

  /** Set I_BPartner_UU */
  void setI_BPartner_UU(String I_BPartner_UU);

  /** Get Import Error Message. Messages generated from import process */
  String getI_ErrorMsg();

  /** Set Import Error Message. Messages generated from import process */
  void setI_ErrorMsg(String I_ErrorMsg);

  /** Get Imported. Has this import been processed */
  boolean isI_IsImported();

  /** Set Imported. Has this import been processed */
  void setI_IsImported(boolean I_IsImported);

  /** Get Interest Area. Name of the Interest Area */
  String getInterestAreaName();

  /** Set Interest Area. Name of the Interest Area */
  void setInterestAreaName(String InterestAreaName);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Customer. Indicates if this Business Partner is a Customer */
  void setIsCustomer(boolean IsCustomer);

  /** Get Customer. Indicates if this Business Partner is a Customer */
  boolean isCustomer();

  /** Set Employee. Indicates if this Business Partner is an employee */
  void setIsEmployee(boolean IsEmployee);

  /** Get Employee. Indicates if this Business Partner is an employee */
  boolean isEmployee();

  /** Set Vendor. Indicates if this Business Partner is a Vendor */
  void setIsVendor(boolean IsVendor);

  /** Get Vendor. Indicates if this Business Partner is a Vendor */
  boolean isVendor();

  /**
   * Get NAICS/SIC. Standard Industry Code or its successor NAIC -
   * http://www.osha.gov/oshstats/sicser.html
   */
  String getNAICS();

  /**
   * Set NAICS/SIC. Standard Industry Code or its successor NAIC -
   * http://www.osha.gov/oshstats/sicser.html
   */
  void setNAICS(String NAICS);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Name 2. Additional Name */
  String getName2();

  /** Set Name 2. Additional Name */
  void setName2(String Name2);

  /** Get Password. Password of any length (case sensitive) */
  String getPassword();

  /** Set Password. Password of any length (case sensitive) */
  void setPassword(String Password);

  /** Get Phone. Identifies a telephone number */
  String getPhone();

  /** Set Phone. Identifies a telephone number */
  void setPhone(String Phone);

  /** Get 2nd Phone. Identifies an alternate telephone number. */
  String getPhone2();

  /** Set 2nd Phone. Identifies an alternate telephone number. */
  void setPhone2(String Phone2);

  /** Get ZIP. Postal code */
  String getPostal();

  /** Set ZIP. Postal code */
  void setPostal(String Postal);

  /** Get Additional Zip. Additional ZIP or Postal code */
  String getPostal_Add();

  /** Set Additional Zip. Additional ZIP or Postal code */
  void setPostal_Add(String Postal_Add);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Region. Name of the Region */
  String getRegionName();

  /** Set Region. Name of the Region */
  void setRegionName(String RegionName);

  /** Get Interest Area. Interest Area or Topic */
  int getR_InterestArea_ID();

  /** Set Interest Area. Interest Area or Topic */
  void setR_InterestArea_ID(int R_InterestArea_ID);

  I_R_InterestArea getR_InterestArea() throws RuntimeException;

  /** Get Tax ID. Tax Identification */
  String getTaxID();

  /** Set Tax ID. Tax Identification */
  void setTaxID(String TaxID);

  /** Get Title. Name this entity is referred to as */
  String getTitle();

  /** Set Title. Name this entity is referred to as */
  void setTitle(String Title);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);

  /** Set IsShipTo. Indicates if this is a ShipTo address */
  void setIsShipTo(boolean IsShipTo);

  /** Get IsShipTo. Indicates if this is a ShipTo address */
  boolean isShipTo();

  /** Set IsBillTo. Indicates if this is a BillTo address */
  void setIsBillTo(boolean IsBillTo);

  /** Get IsBillTo. Indicates if this is a BillTo address */
  boolean isBillTo();
}
