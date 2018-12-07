package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for R_RequestAction
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_RequestAction {

  /** TableName=R_RequestAction */
  String Table_Name = "R_RequestAction";

  /** AD_Table_ID=418 */
  int Table_ID = 418;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name A_Asset_ID */
  String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Role_ID */
  String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name C_Activity_ID */
  String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_Invoice_ID */
  String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
  /** Column name ConfidentialType */
  String COLUMNNAME_ConfidentialType = "ConfidentialType";
  /** Column name C_Order_ID */
  String COLUMNNAME_C_Order_ID = "C_Order_ID";
  /** Column name C_Payment_ID */
  String COLUMNNAME_C_Payment_ID = "C_Payment_ID";
  /** Column name C_Project_ID */
  String COLUMNNAME_C_Project_ID = "C_Project_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DateCompletePlan */
  String COLUMNNAME_DateCompletePlan = "DateCompletePlan";
  /** Column name DateNextAction */
  String COLUMNNAME_DateNextAction = "DateNextAction";
  /** Column name DateStartPlan */
  String COLUMNNAME_DateStartPlan = "DateStartPlan";
  /** Column name EndDate */
  String COLUMNNAME_EndDate = "EndDate";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsEscalated */
  String COLUMNNAME_IsEscalated = "IsEscalated";
  /** Column name IsInvoiced */
  String COLUMNNAME_IsInvoiced = "IsInvoiced";
  /** Column name IsSelfService */
  String COLUMNNAME_IsSelfService = "IsSelfService";
  /** Column name M_InOut_ID */
  String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name M_ProductSpent_ID */
  String COLUMNNAME_M_ProductSpent_ID = "M_ProductSpent_ID";
  /** Column name M_RMA_ID */
  String COLUMNNAME_M_RMA_ID = "M_RMA_ID";
  /** Column name NullColumns */
  String COLUMNNAME_NullColumns = "NullColumns";
  /** Column name Priority */
  String COLUMNNAME_Priority = "Priority";
  /** Column name PriorityUser */
  String COLUMNNAME_PriorityUser = "PriorityUser";
  /** Column name QtyInvoiced */
  String COLUMNNAME_QtyInvoiced = "QtyInvoiced";
  /** Column name QtyPlan */
  String COLUMNNAME_QtyPlan = "QtyPlan";
  /** Column name QtySpent */
  String COLUMNNAME_QtySpent = "QtySpent";
  /** Column name R_Category_ID */
  String COLUMNNAME_R_Category_ID = "R_Category_ID";
  /** Column name R_Group_ID */
  String COLUMNNAME_R_Group_ID = "R_Group_ID";
  /** Column name R_RequestAction_ID */
  String COLUMNNAME_R_RequestAction_ID = "R_RequestAction_ID";
  /** Column name R_RequestAction_UU */
  String COLUMNNAME_R_RequestAction_UU = "R_RequestAction_UU";
  /** Column name R_Request_ID */
  String COLUMNNAME_R_Request_ID = "R_Request_ID";
  /** Column name R_RequestType_ID */
  String COLUMNNAME_R_RequestType_ID = "R_RequestType_ID";
  /** Column name R_Resolution_ID */
  String COLUMNNAME_R_Resolution_ID = "R_Resolution_ID";
  /** Column name R_Status_ID */
  String COLUMNNAME_R_Status_ID = "R_Status_ID";
  /** Column name SalesRep_ID */
  String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
  /** Column name StartDate */
  String COLUMNNAME_StartDate = "StartDate";
  /** Column name Summary */
  String COLUMNNAME_Summary = "Summary";
  /** Column name TaskStatus */
  String COLUMNNAME_TaskStatus = "TaskStatus";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Asset. Asset used internally or by customers */
  int getA_Asset_ID();

  /** Set Asset. Asset used internally or by customers */
  void setA_Asset_ID(int A_Asset_ID);

  I_A_Asset getA_Asset() throws RuntimeException;

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Role. Responsibility Role */
  int getAD_Role_ID();

  /** Set Role. Responsibility Role */
  void setAD_Role_ID(int AD_Role_ID);

  I_AD_Role getAD_Role() throws RuntimeException;

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  I_AD_User getAD_User() throws RuntimeException;

  /** Get Activity. Business Activity */
  int getC_Activity_ID();

  /** Set Activity. Business Activity */
  void setC_Activity_ID(int C_Activity_ID);

  I_C_Activity getC_Activity() throws RuntimeException;

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Invoice. Invoice Identifier */
  int getC_Invoice_ID();

  /** Set Invoice. Invoice Identifier */
  void setC_Invoice_ID(int C_Invoice_ID);

  I_C_Invoice getC_Invoice() throws RuntimeException;

  /** Get Confidentiality. Type of Confidentiality */
  String getConfidentialType();

  /** Set Confidentiality. Type of Confidentiality */
  void setConfidentialType(String ConfidentialType);

  /** Get Order. Order */
  int getC_Order_ID();

  /** Set Order. Order */
  void setC_Order_ID(int C_Order_ID);

  I_C_Order getC_Order() throws RuntimeException;

  /** Get Payment. Payment identifier */
  int getC_Payment_ID();

  /** Set Payment. Payment identifier */
  void setC_Payment_ID(int C_Payment_ID);

  I_C_Payment getC_Payment() throws RuntimeException;

  /** Get Project. Financial Project */
  int getC_Project_ID();

  /** Set Project. Financial Project */
  void setC_Project_ID(int C_Project_ID);

  I_C_Project getC_Project() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Complete Plan. Planned Completion Date */
  Timestamp getDateCompletePlan();

  /** Set Complete Plan. Planned Completion Date */
  void setDateCompletePlan(Timestamp DateCompletePlan);

  /** Get Date next action. Date that this request should be acted on */
  Timestamp getDateNextAction();

  /** Set Date next action. Date that this request should be acted on */
  void setDateNextAction(Timestamp DateNextAction);

  /** Get Start Plan. Planned Start Date */
  Timestamp getDateStartPlan();

  /** Set Start Plan. Planned Start Date */
  void setDateStartPlan(Timestamp DateStartPlan);

  /** Get End Date. Last effective date (inclusive) */
  Timestamp getEndDate();

  /** Set End Date. Last effective date (inclusive) */
  void setEndDate(Timestamp EndDate);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Escalated. This request has been escalated */
  String getIsEscalated();

  /** Set Escalated. This request has been escalated */
  void setIsEscalated(String IsEscalated);

  /** Set Invoiced. Is this invoiced? */
  void setIsInvoiced(boolean IsInvoiced);

  /** Get Invoiced. Is this invoiced? */
  boolean isInvoiced();

  /**
   * Get Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
   */
  String getIsSelfService();

  /**
   * Set Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
   */
  void setIsSelfService(String IsSelfService);

  /** Get Shipment/Receipt. Material Shipment Document */
  int getM_InOut_ID();

  /** Set Shipment/Receipt. Material Shipment Document */
  void setM_InOut_ID(int M_InOut_ID);

  I_M_InOut getM_InOut() throws RuntimeException;

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Product Used. Product/Resource/Service used in Request */
  int getM_ProductSpent_ID();

  /** Set Product Used. Product/Resource/Service used in Request */
  void setM_ProductSpent_ID(int M_ProductSpent_ID);

  I_M_Product getM_ProductSpent() throws RuntimeException;

  /** Get RMA. Return Material Authorization */
  int getM_RMA_ID();

  /** Set RMA. Return Material Authorization */
  void setM_RMA_ID(int M_RMA_ID);

  I_M_RMA getM_RMA() throws RuntimeException;

  /** Get Null Columns. Columns with NULL value */
  String getNullColumns();

  /** Set Null Columns. Columns with NULL value */
  void setNullColumns(String NullColumns);

  /** Get Priority. Indicates if this request is of a high, medium or low priority. */
  String getPriority();

  /** Set Priority. Indicates if this request is of a high, medium or low priority. */
  void setPriority(String Priority);

  /** Get User Importance. Priority of the issue for the User */
  String getPriorityUser();

  /** Set User Importance. Priority of the issue for the User */
  void setPriorityUser(String PriorityUser);

  /** Get Quantity Invoiced. Invoiced Quantity */
  BigDecimal getQtyInvoiced();

  /** Set Quantity Invoiced. Invoiced Quantity */
  void setQtyInvoiced(BigDecimal QtyInvoiced);

  /** Get Quantity Plan. Planned Quantity */
  BigDecimal getQtyPlan();

  /** Set Quantity Plan. Planned Quantity */
  void setQtyPlan(BigDecimal QtyPlan);

  /** Get Quantity Used. Quantity used for this event */
  BigDecimal getQtySpent();

  /** Set Quantity Used. Quantity used for this event */
  void setQtySpent(BigDecimal QtySpent);

  /** Get Category. Request Category */
  int getR_Category_ID();

  /** Set Category. Request Category */
  void setR_Category_ID(int R_Category_ID);

  I_R_Category getR_Category() throws RuntimeException;

  /** Get Group. Request Group */
  int getR_Group_ID();

  /** Set Group. Request Group */
  void setR_Group_ID(int R_Group_ID);

  I_R_Group getR_Group() throws RuntimeException;

  /** Get Request History. Request has been changed */
  int getR_RequestAction_ID();

  /** Set Request History. Request has been changed */
  void setR_RequestAction_ID(int R_RequestAction_ID);

  /** Get R_RequestAction_UU */
  String getR_RequestAction_UU();

  /** Set R_RequestAction_UU */
  void setR_RequestAction_UU(String R_RequestAction_UU);

  /** Get Request. Request from a Business Partner or Prospect */
  int getR_Request_ID();

  /** Set Request. Request from a Business Partner or Prospect */
  void setR_Request_ID(int R_Request_ID);

  I_R_Request getR_Request() throws RuntimeException;

  /** Get Request Type. Type of request (e.g. Inquiry, Complaint, ..) */
  int getR_RequestType_ID();

  /** Set Request Type. Type of request (e.g. Inquiry, Complaint, ..) */
  void setR_RequestType_ID(int R_RequestType_ID);

  I_R_RequestType getR_RequestType() throws RuntimeException;

  /** Get Resolution. Request Resolution */
  int getR_Resolution_ID();

  /** Set Resolution. Request Resolution */
  void setR_Resolution_ID(int R_Resolution_ID);

  I_R_Resolution getR_Resolution() throws RuntimeException;

  /** Get Status. Request Status */
  int getR_Status_ID();

  /** Set Status. Request Status */
  void setR_Status_ID(int R_Status_ID);

  I_R_Status getR_Status() throws RuntimeException;

  /** Get Sales Representative. Sales Representative or Company Agent */
  int getSalesRep_ID();

  /** Set Sales Representative. Sales Representative or Company Agent */
  void setSalesRep_ID(int SalesRep_ID);

  I_AD_User getSalesRep() throws RuntimeException;

  /** Get Start Date. First effective day (inclusive) */
  Timestamp getStartDate();

  /** Set Start Date. First effective day (inclusive) */
  void setStartDate(Timestamp StartDate);

  /** Get Summary. Textual summary of this request */
  String getSummary();

  /** Set Summary. Textual summary of this request */
  void setSummary(String Summary);

  /** Get Task Status. Status of the Task */
  String getTaskStatus();

  /** Set Task Status. Status of the Task */
  void setTaskStatus(String TaskStatus);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
