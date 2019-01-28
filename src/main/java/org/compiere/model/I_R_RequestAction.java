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

    /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name A_Asset_ID */
  String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
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
    /** Column name DateCompletePlan */
  String COLUMNNAME_DateCompletePlan = "DateCompletePlan";
  /** Column name DateNextAction */
  String COLUMNNAME_DateNextAction = "DateNextAction";
  /** Column name DateStartPlan */
  String COLUMNNAME_DateStartPlan = "DateStartPlan";
  /** Column name EndDate */
  String COLUMNNAME_EndDate = "EndDate";
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

    /** Get Asset. Asset used internally or by customers */
  int getA_Asset_ID();

    /** Get Role. Responsibility Role */
  int getAD_Role_ID();

    /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

    /** Get Activity. Business Activity */
  int getC_Activity_ID();

    /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

    /** Get Invoice. Invoice Identifier */
  int getC_Invoice_ID();

    /** Get Order. Order */
  int getC_Order_ID();

    /** Get Payment. Payment identifier */
  int getC_Payment_ID();

    /** Get Project. Financial Project */
  int getC_Project_ID();

    /** Get Shipment/Receipt. Material Shipment Document */
  int getM_InOut_ID();

    /** Get Product. Product, Service, Item */
  int getM_Product_ID();

    /** Get Product Used. Product/Resource/Service used in Request */
  int getM_ProductSpent_ID();

    /** Get RMA. Return Material Authorization */
  int getM_RMA_ID();

    /** Get Null Columns. Columns with NULL value */
  String getNullColumns();

  /** Set Null Columns. Columns with NULL value */
  void setNullColumns(String NullColumns);

    /** Get Category. Request Category */
  int getR_Category_ID();

    /** Get Group. Request Group */
  int getR_Group_ID();

    /** Get Request. Request from a Business Partner or Prospect */
  int getR_Request_ID();

  /** Set Request. Request from a Business Partner or Prospect */
  void setR_Request_ID(int R_Request_ID);

    /** Get Request Type. Type of request (e.g. Inquiry, Complaint, ..) */
  int getR_RequestType_ID();

    /** Get Resolution. Request Resolution */
  int getR_Resolution_ID();

    /** Get Status. Request Status */
  int getR_Status_ID();

    /** Get Sales Representative. Sales Representative or Company Agent */
  int getSalesRep_ID();

}
