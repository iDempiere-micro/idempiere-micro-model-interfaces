package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_Movement
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Movement {

  /** TableName=M_Movement */
  String Table_Name = "M_Movement";

  /** AD_Table_ID=323 */
  int Table_ID = 323;

    /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

    /** Column name AD_OrgTrx_ID */
  String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name ApprovalAmt */
  String COLUMNNAME_ApprovalAmt = "ApprovalAmt";
  /** Column name C_Activity_ID */
  String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BPartner_Location_ID */
  String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
  /** Column name C_Campaign_ID */
  String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
  /** Column name C_Charge_ID */
  String COLUMNNAME_C_Charge_ID = "C_Charge_ID";
  /** Column name C_DocType_ID */
  String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
  /** Column name ChargeAmt */
  String COLUMNNAME_ChargeAmt = "ChargeAmt";
  /** Column name C_Project_ID */
  String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /** Column name CreateFrom */
  String COLUMNNAME_CreateFrom = "CreateFrom";
  /** Column name DateReceived */
  String COLUMNNAME_DateReceived = "DateReceived";
  /** Column name DD_Order_ID */
  String COLUMNNAME_DD_Order_ID = "DD_Order_ID";
  /** Column name DeliveryRule */
  String COLUMNNAME_DeliveryRule = "DeliveryRule";
  /** Column name DeliveryViaRule */
  String COLUMNNAME_DeliveryViaRule = "DeliveryViaRule";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DocAction */
  String COLUMNNAME_DocAction = "DocAction";
  /** Column name DocStatus */
  String COLUMNNAME_DocStatus = "DocStatus";
  /** Column name DocumentNo */
  String COLUMNNAME_DocumentNo = "DocumentNo";
  /** Column name FreightAmt */
  String COLUMNNAME_FreightAmt = "FreightAmt";
  /** Column name FreightCostRule */
  String COLUMNNAME_FreightCostRule = "FreightCostRule";
    /** Column name IsApproved */
  String COLUMNNAME_IsApproved = "IsApproved";
  /** Column name IsInTransit */
  String COLUMNNAME_IsInTransit = "IsInTransit";
  /** Column name M_Movement_ID */
  String COLUMNNAME_M_Movement_ID = "M_Movement_ID";
  /** Column name M_Movement_UU */
  String COLUMNNAME_M_Movement_UU = "M_Movement_UU";
  /** Column name MovementDate */
  String COLUMNNAME_MovementDate = "MovementDate";
  /** Column name M_Shipper_ID */
  String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
  /** Column name POReference */
  String COLUMNNAME_POReference = "POReference";
  /** Column name Posted */
  String COLUMNNAME_Posted = "Posted";
  /** Column name PriorityRule */
  String COLUMNNAME_PriorityRule = "PriorityRule";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name ProcessedOn */
  String COLUMNNAME_ProcessedOn = "ProcessedOn";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Reversal_ID */
  String COLUMNNAME_Reversal_ID = "Reversal_ID";
  /** Column name SalesRep_ID */
  String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
    /** Column name User1_ID */
  String COLUMNNAME_User1_ID = "User1_ID";
  /** Column name User2_ID */
  String COLUMNNAME_User2_ID = "User2_ID";

    /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

    /** Get Approval Amount. Document Approval Amount */
  BigDecimal getApprovalAmt();

    /** Get Activity. Business Activity */
  int getC_Activity_ID();

    /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

    /** Get Partner Location. Identifies the (ship to) address for this Business Partner */
  int getC_BPartner_Location_ID();

    /** Get Campaign. Marketing Campaign */
  int getC_Campaign_ID();

    /** Get Charge. Additional document charges */
  int getC_Charge_ID();

    /** Get Document Type. Document type or rules */
  int getC_DocType_ID();

  /** Set Document Type. Document type or rules */
  void setC_DocType_ID(int C_DocType_ID);

    /** Get Project. Financial Project */
  int getC_Project_ID();

    /** Get Distribution Order */
  int getDD_Order_ID();

    /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Document Action. The targeted status of the document */
  String getDocAction();

  /** Set Document Action. The targeted status of the document */
  void setDocAction(String DocAction);

  /** Get Document Status. The current status of the document */
  String getDocStatus();

  /** Set Document Status. The current status of the document */
  void setDocStatus(String DocStatus);

  /** Get Document No. Document sequence number of the document */
  String getDocumentNo();

  /** Set Document No. Document sequence number of the document */
  void setDocumentNo(String DocumentNo);

    /** Set Approved. Indicates if this document requires approval */
  void setIsApproved(boolean IsApproved);

  /** Get Approved. Indicates if this document requires approval */
  boolean isApproved();

  /** Set In Transit. Movement is in transit */
  void setIsInTransit(boolean IsInTransit);

    /** Get Inventory Move. Movement of Inventory */
  int getM_Movement_ID();

    /** Get Movement Date. Date a product was moved in or out of inventory */
  Timestamp getMovementDate();

  /** Set Movement Date. Date a product was moved in or out of inventory */
  void setMovementDate(Timestamp MovementDate);

  /** Get Shipper. Method or manner of product delivery */
  int getM_Shipper_ID();

    /** Set Posted. Posting status */
  void setPosted(boolean Posted);

    /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

    /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Reversal ID. ID of document reversal */
  int getReversal_ID();

  /** Set Reversal ID. ID of document reversal */
  void setReversal_ID(int Reversal_ID);

    /** Get Sales Representative. Sales Representative or Company Agent */
  int getSalesRep_ID();

    /** Get User Element List 1. User defined list element #1 */
  int getUser1_ID();

    /** Get User Element List 2. User defined list element #2 */
  int getUser2_ID();

}
