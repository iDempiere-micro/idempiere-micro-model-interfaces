package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_ServiceLevel
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_ServiceLevel {

  /** TableName=C_ServiceLevel */
  String Table_Name = "C_ServiceLevel";

  /** AD_Table_ID=337 */
  int Table_ID = 337;

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
  /** Column name C_RevenueRecognition_Plan_ID */
  String COLUMNNAME_C_RevenueRecognition_Plan_ID = "C_RevenueRecognition_Plan_ID";
  /** Column name C_ServiceLevel_ID */
  String COLUMNNAME_C_ServiceLevel_ID = "C_ServiceLevel_ID";
  /** Column name C_ServiceLevel_UU */
  String COLUMNNAME_C_ServiceLevel_UU = "C_ServiceLevel_UU";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name ServiceLevelInvoiced */
  String COLUMNNAME_ServiceLevelInvoiced = "ServiceLevelInvoiced";
  /** Column name ServiceLevelProvided */
  String COLUMNNAME_ServiceLevelProvided = "ServiceLevelProvided";
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

  /** Get Revenue Recognition Plan. Plan for recognizing or recording revenue */
  int getC_RevenueRecognition_Plan_ID();

  /** Set Revenue Recognition Plan. Plan for recognizing or recording revenue */
  void setC_RevenueRecognition_Plan_ID(int C_RevenueRecognition_Plan_ID);

  I_C_RevenueRecognition_Plan getC_RevenueRecognition_Plan() throws RuntimeException;

  /** Get Service Level. Product Revenue Recognition Service Level */
  int getC_ServiceLevel_ID();

  /** Set Service Level. Product Revenue Recognition Service Level */
  void setC_ServiceLevel_ID(int C_ServiceLevel_ID);

  /** Get C_ServiceLevel_UU */
  String getC_ServiceLevel_UU();

  /** Set C_ServiceLevel_UU */
  void setC_ServiceLevel_UU(String C_ServiceLevel_UU);

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Quantity Invoiced. Quantity of product or service invoiced */
  BigDecimal getServiceLevelInvoiced();

  /** Set Quantity Invoiced. Quantity of product or service invoiced */
  void setServiceLevelInvoiced(BigDecimal ServiceLevelInvoiced);

  /** Get Quantity Provided. Quantity of service or product provided */
  BigDecimal getServiceLevelProvided();

  /** Set Quantity Provided. Quantity of service or product provided */
  void setServiceLevelProvided(BigDecimal ServiceLevelProvided);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
