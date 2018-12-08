package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Registration
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Registration {

  /** TableName=AD_Registration */
  String Table_Name = "AD_Registration";

  /** AD_Table_ID=625 */
  int Table_ID = 625;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Registration_ID */
  String COLUMNNAME_AD_Registration_ID = "AD_Registration_ID";
  /** Column name AD_Registration_UU */
  String COLUMNNAME_AD_Registration_UU = "AD_Registration_UU";
  /** Column name AD_System_ID */
  String COLUMNNAME_AD_System_ID = "AD_System_ID";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name C_Location_ID */
  String COLUMNNAME_C_Location_ID = "C_Location_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IndustryInfo */
  String COLUMNNAME_IndustryInfo = "IndustryInfo";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsAllowPublish */
  String COLUMNNAME_IsAllowPublish = "IsAllowPublish";
  /** Column name IsAllowStatistics */
  String COLUMNNAME_IsAllowStatistics = "IsAllowStatistics";
  /** Column name IsInProduction */
  String COLUMNNAME_IsInProduction = "IsInProduction";
  /** Column name IsRegistered */
  String COLUMNNAME_IsRegistered = "IsRegistered";
  /** Column name NumberEmployees */
  String COLUMNNAME_NumberEmployees = "NumberEmployees";
  /** Column name PlatformInfo */
  String COLUMNNAME_PlatformInfo = "PlatformInfo";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Record_ID */
  String COLUMNNAME_Record_ID = "Record_ID";
  /** Column name Remote_Addr */
  String COLUMNNAME_Remote_Addr = "Remote_Addr";
  /** Column name Remote_Host */
  String COLUMNNAME_Remote_Host = "Remote_Host";
  /** Column name SalesVolume */
  String COLUMNNAME_SalesVolume = "SalesVolume";
  /** Column name StartProductionDate */
  String COLUMNNAME_StartProductionDate = "StartProductionDate";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get System Registration. System Registration */
  int getAD_Registration_ID();

  /** Set System Registration. System Registration */
  void setAD_Registration_ID(int AD_Registration_ID);

  /** Get AD_Registration_UU */
  String getAD_Registration_UU();

  /** Set AD_Registration_UU */
  void setAD_Registration_UU(String AD_Registration_UU);

  /** Get System. System Definition */
  int getAD_System_ID();

  /** Set System. System Definition */
  void setAD_System_ID(int AD_System_ID);

  I_AD_System getAD_System() throws RuntimeException;

  /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

  /** Set Currency. The Currency for this record */
  void setC_Currency_ID(int C_Currency_ID);

  I_C_Currency getC_Currency() throws RuntimeException;

  /** Get Address. Location or Address */
  int getC_Location_ID();

  /** Set Address. Location or Address */
  void setC_Location_ID(int C_Location_ID);

  I_C_Location getC_Location() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /**
   * Get Industry Info. Information of the industry (e.g. professional service, distribution of
   * furnitures, ..)
   */
  String getIndustryInfo();

  /**
   * Set Industry Info. Information of the industry (e.g. professional service, distribution of
   * furnitures, ..)
   */
  void setIndustryInfo(String IndustryInfo);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /**
   * Set Allowed to be Published. You allow to publish the information, not just statistical summary
   * info
   */
  void setIsAllowPublish(boolean IsAllowPublish);

  /**
   * Get Allowed to be Published. You allow to publish the information, not just statistical summary
   * info
   */
  boolean isAllowPublish();

  /** Set Maintain Statistics. Maintain general statistics */
  void setIsAllowStatistics(boolean IsAllowStatistics);

  /** Get Maintain Statistics. Maintain general statistics */
  boolean isAllowStatistics();

  /** Set In Production. The system is in production */
  void setIsInProduction(boolean IsInProduction);

  /** Get In Production. The system is in production */
  boolean isInProduction();

  /** Set Registered. The application is registered. */
  void setIsRegistered(boolean IsRegistered);

  /** Get Registered. The application is registered. */
  boolean isRegistered();

  /** Get Employees. Number of employees */
  int getNumberEmployees();

  /** Set Employees. Number of employees */
  void setNumberEmployees(int NumberEmployees);

  /** Get Platform Info. Information about Server and Client Platform */
  String getPlatformInfo();

  /** Set Platform Info. Information about Server and Client Platform */
  void setPlatformInfo(String PlatformInfo);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Record ID. Direct internal record ID */
  int getRecord_ID();

  /** Set Record ID. Direct internal record ID */
  void setRecord_ID(int Record_ID);

  /** Get Remote Addr. Remote Address */
  String getRemote_Addr();

  /** Set Remote Addr. Remote Address */
  void setRemote_Addr(String Remote_Addr);

  /** Get Remote Host. Remote host Info */
  String getRemote_Host();

  /** Set Remote Host. Remote host Info */
  void setRemote_Host(String Remote_Host);

  /** Get Sales Volume in 1.000. Total Volume of Sales in Thousands of Currency */
  int getSalesVolume();

  /** Set Sales Volume in 1.000. Total Volume of Sales in Thousands of Currency */
  void setSalesVolume(int SalesVolume);

  /**
   * Get Start Implementation/Production. The day you started the implementation (if implementing) -
   * or production (went life) with iDempiere
   */
  Timestamp getStartProductionDate();

  /**
   * Set Start Implementation/Production. The day you started the implementation (if implementing) -
   * or production (went life) with iDempiere
   */
  void setStartProductionDate(Timestamp StartProductionDate);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
