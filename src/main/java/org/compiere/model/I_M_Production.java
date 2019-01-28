package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_Production
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Production {

  /** TableName=M_Production */
  String Table_Name = "M_Production";

  /** AD_Table_ID=325 */
  int Table_ID = 325;

    /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

    /** Column name AD_OrgTrx_ID */
  String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
  /** Column name C_Activity_ID */
  String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_Campaign_ID */
  String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
  /** Column name C_OrderLine_ID */
  String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";
  /** Column name C_Project_ID */
  String COLUMNNAME_C_Project_ID = "C_Project_ID";
  /** Column name C_ProjectPhase_ID */
  String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";
  /** Column name C_ProjectTask_ID */
  String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";
    /** Column name CreateFrom */
  String COLUMNNAME_CreateFrom = "CreateFrom";
  /** Column name DatePromised */
  String COLUMNNAME_DatePromised = "DatePromised";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name DocAction */
  String COLUMNNAME_DocAction = "DocAction";
  /** Column name DocStatus */
  String COLUMNNAME_DocStatus = "DocStatus";
  /** Column name DocumentNo */
  String COLUMNNAME_DocumentNo = "DocumentNo";
    /** Column name IsComplete */
  String COLUMNNAME_IsComplete = "IsComplete";
  /** Column name IsCreated */
  String COLUMNNAME_IsCreated = "IsCreated";
  /** Column name IsUseProductionPlan */
  String COLUMNNAME_IsUseProductionPlan = "IsUseProductionPlan";
  /** Column name M_Locator_ID */
  String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
  /** Column name MovementDate */
  String COLUMNNAME_MovementDate = "MovementDate";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name M_Production_ID */
  String COLUMNNAME_M_Production_ID = "M_Production_ID";
  /** Column name M_Production_UU */
  String COLUMNNAME_M_Production_UU = "M_Production_UU";
  /** Column name Posted */
  String COLUMNNAME_Posted = "Posted";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name ProcessedOn */
  String COLUMNNAME_ProcessedOn = "ProcessedOn";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name ProductionQty */
  String COLUMNNAME_ProductionQty = "ProductionQty";
  /** Column name Reversal_ID */
  String COLUMNNAME_Reversal_ID = "Reversal_ID";
    /** Column name User1_ID */
  String COLUMNNAME_User1_ID = "User1_ID";
  /** Column name User2_ID */
  String COLUMNNAME_User2_ID = "User2_ID";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

    /** Set Trx Organization. Performing or initiating organization */
  void setAD_OrgTrx_ID(int AD_OrgTrx_ID);

    /** Set Activity. Business Activity */
  void setC_Activity_ID(int C_Activity_ID);

    /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

    /** Set Campaign. Marketing Campaign */
  void setC_Campaign_ID(int C_Campaign_ID);

    /** Set Sales Order Line. Sales Order Line */
  void setC_OrderLine_ID(int C_OrderLine_ID);

    /** Set Project. Financial Project */
  void setC_Project_ID(int C_Project_ID);

    /** Set Date Promised. Date Order was promised */
  void setDatePromised(Timestamp DatePromised);

    /** Set Document Action. The targeted status of the document */
  void setDocAction(String DocAction);

  /** Get Document No. Document sequence number of the document */
  String getDocumentNo();

    /** Get Records created */
  String getIsCreated();

  /** Set Records created */
  void setIsCreated(String IsCreated);

    /** Get Use Production Plan */
  boolean isUseProductionPlan();

    /** Set Locator. Warehouse Locator */
  void setM_Locator_ID(int M_Locator_ID);

    /** Get Movement Date. Date a product was moved in or out of inventory */
  Timestamp getMovementDate();

    /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

    /** Get Production. Plan for producing a product */
  int getM_Production_ID();

    /** Get Processed. The document has been processed */
  boolean isProcessed();

    /** Set Production Quantity. Quantity of products to produce */
  void setProductionQty(BigDecimal ProductionQty);

    /** Set User Element List 1. User defined list element #1 */
  void setUser1_ID(int User1_ID);

    /** Set User Element List 2. User defined list element #2 */
  void setUser2_ID(int User2_ID);

    void saveEx();

  int createLines(boolean mustBeStocked);
}
