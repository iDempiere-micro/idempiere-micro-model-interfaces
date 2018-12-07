package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for R_RequestType
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_RequestType {

  /** TableName=R_RequestType */
  String Table_Name = "R_RequestType";

  /** AD_Table_ID=529 */
  int Table_ID = 529;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AutoDueDateDays */
  String COLUMNNAME_AutoDueDateDays = "AutoDueDateDays";
  /** Column name ConfidentialType */
  String COLUMNNAME_ConfidentialType = "ConfidentialType";
  /** Column name ContentColor */
  String COLUMNNAME_ContentColor = "ContentColor";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DueDateTolerance */
  String COLUMNNAME_DueDateTolerance = "DueDateTolerance";
  /** Column name HeaderColor */
  String COLUMNNAME_HeaderColor = "HeaderColor";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsAutoChangeRequest */
  String COLUMNNAME_IsAutoChangeRequest = "IsAutoChangeRequest";
  /** Column name IsConfidentialInfo */
  String COLUMNNAME_IsConfidentialInfo = "IsConfidentialInfo";
  /** Column name IsDefault */
  String COLUMNNAME_IsDefault = "IsDefault";
  /** Column name IsEMailWhenDue */
  String COLUMNNAME_IsEMailWhenDue = "IsEMailWhenDue";
  /** Column name IsEMailWhenOverdue */
  String COLUMNNAME_IsEMailWhenOverdue = "IsEMailWhenOverdue";
  /** Column name IsIndexed */
  String COLUMNNAME_IsIndexed = "IsIndexed";
  /** Column name IsInvoiced */
  String COLUMNNAME_IsInvoiced = "IsInvoiced";
  /** Column name IsSelfService */
  String COLUMNNAME_IsSelfService = "IsSelfService";
  /** Column name R_RequestType_ID */
  String COLUMNNAME_R_RequestType_ID = "R_RequestType_ID";
  /** Column name R_RequestType_UU */
  String COLUMNNAME_R_RequestType_UU = "R_RequestType_UU";
  /** Column name R_StatusCategory_ID */
  String COLUMNNAME_R_StatusCategory_ID = "R_StatusCategory_ID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Auto Due Date Days. Automatic Due Date Days */
  int getAutoDueDateDays();

  /** Set Auto Due Date Days. Automatic Due Date Days */
  void setAutoDueDateDays(int AutoDueDateDays);

  /** Get Confidentiality. Type of Confidentiality */
  String getConfidentialType();

  /** Set Confidentiality. Type of Confidentiality */
  void setConfidentialType(String ConfidentialType);

  /** Get Content Color. Content color of calendar dashlet */
  String getContentColor();

  /** Set Content Color. Content color of calendar dashlet */
  void setContentColor(String ContentColor);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /**
   * Get Due Date Tolerance. Tolerance in days between the Date Next Action and the date the request
   * is regarded as overdue
   */
  int getDueDateTolerance();

  /**
   * Set Due Date Tolerance. Tolerance in days between the Date Next Action and the date the request
   * is regarded as overdue
   */
  void setDueDateTolerance(int DueDateTolerance);

  /** Get Header Color. Header color of calendar dashlet */
  String getHeaderColor();

  /** Set Header Color. Header color of calendar dashlet */
  void setHeaderColor(String HeaderColor);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Create Change Request. Automatically create BOM (Engineering) Change Request */
  void setIsAutoChangeRequest(boolean IsAutoChangeRequest);

  /** Get Create Change Request. Automatically create BOM (Engineering) Change Request */
  boolean isAutoChangeRequest();

  /** Set Confidential Info. Can enter confidential information */
  void setIsConfidentialInfo(boolean IsConfidentialInfo);

  /** Get Confidential Info. Can enter confidential information */
  boolean isConfidentialInfo();

  /** Set Default. Default value */
  void setIsDefault(boolean IsDefault);

  /** Get Default. Default value */
  boolean isDefault();

  /** Set EMail when Due. Send EMail when Request becomes due */
  void setIsEMailWhenDue(boolean IsEMailWhenDue);

  /** Get EMail when Due. Send EMail when Request becomes due */
  boolean isEMailWhenDue();

  /** Set EMail when Overdue. Send EMail when Request becomes overdue */
  void setIsEMailWhenOverdue(boolean IsEMailWhenOverdue);

  /** Get EMail when Overdue. Send EMail when Request becomes overdue */
  boolean isEMailWhenOverdue();

  /** Set Indexed. Index the document for the internal search engine */
  void setIsIndexed(boolean IsIndexed);

  /** Get Indexed. Index the document for the internal search engine */
  boolean isIndexed();

  /** Set Invoiced. Is this invoiced? */
  void setIsInvoiced(boolean IsInvoiced);

  /** Get Invoiced. Is this invoiced? */
  boolean isInvoiced();

  /**
   * Set Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
   */
  void setIsSelfService(boolean IsSelfService);

  /**
   * Get Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
   */
  boolean isSelfService();

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Request Type. Type of request (e.g. Inquiry, Complaint, ..) */
  int getR_RequestType_ID();

  /** Set Request Type. Type of request (e.g. Inquiry, Complaint, ..) */
  void setR_RequestType_ID(int R_RequestType_ID);

  /** Get R_RequestType_UU */
  String getR_RequestType_UU();

  /** Set R_RequestType_UU */
  void setR_RequestType_UU(String R_RequestType_UU);

  /** Get Status Category. Request Status Category */
  int getR_StatusCategory_ID();

  /** Set Status Category. Request Status Category */
  void setR_StatusCategory_ID(int R_StatusCategory_ID);

  I_R_StatusCategory getR_StatusCategory() throws RuntimeException;

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
