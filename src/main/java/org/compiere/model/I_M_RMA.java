package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Properties;

import org.idempiere.common.util.KeyNamePair;
import org.idempiere.icommon.model.IPO;

/**
 * Generated Interface for M_RMA
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_RMA extends IPO {

    /**
     * TableName=M_RMA
     */
    String Table_Name = "M_RMA";

    /**
     * AD_Table_ID=661
     */
    int Table_ID = 661;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name Amt
     */
    String COLUMNNAME_Amt = "Amt";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name C_DocType_ID
     */
    String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
    /**
     * Column name C_Order_ID
     */
    String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name CreateFrom
     */
    String COLUMNNAME_CreateFrom = "CreateFrom";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DocAction
     */
    String COLUMNNAME_DocAction = "DocAction";
    /**
     * Column name DocStatus
     */
    String COLUMNNAME_DocStatus = "DocStatus";
    /**
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name GenerateTo
     */
    String COLUMNNAME_GenerateTo = "GenerateTo";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name InOut_ID
     */
    String COLUMNNAME_InOut_ID = "InOut_ID";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsApproved
     */
    String COLUMNNAME_IsApproved = "IsApproved";
    /**
     * Column name IsSOTrx
     */
    String COLUMNNAME_IsSOTrx = "IsSOTrx";
    /**
     * Column name M_RMA_ID
     */
    String COLUMNNAME_M_RMA_ID = "M_RMA_ID";
    /**
     * Column name M_RMAType_ID
     */
    String COLUMNNAME_M_RMAType_ID = "M_RMAType_ID";
    /**
     * Column name M_RMA_UU
     */
    String COLUMNNAME_M_RMA_UU = "M_RMA_UU";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Ref_RMA_ID
     */
    String COLUMNNAME_Ref_RMA_ID = "Ref_RMA_ID";
    /**
     * Column name SalesRep_ID
     */
    String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Amount. Amount
     */
    BigDecimal getAmt();

    /**
     * Set Amount. Amount
     */
    void setAmt(BigDecimal Amt);

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Set Business Partner . Identifies a Business Partner
     */
    void setC_BPartner_ID(int C_BPartner_ID);

    I_C_BPartner getC_BPartner() throws RuntimeException;

    /**
     * Get Currency. The Currency for this record
     */
    int getC_Currency_ID();

    /**
     * Set Currency. The Currency for this record
     */
    void setC_Currency_ID(int C_Currency_ID);

    I_C_Currency getC_Currency() throws RuntimeException;

    /**
     * Get Document Type. Document type or rules
     */
    int getC_DocType_ID();

    /**
     * Set Document Type. Document type or rules
     */
    void setC_DocType_ID(int C_DocType_ID);

    I_C_DocType getC_DocType() throws RuntimeException;

    /**
     * Get Order. Order
     */
    int getC_Order_ID();

    /**
     * Set Order. Order
     */
    void setC_Order_ID(int C_Order_ID);

    I_C_Order getC_Order() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Create lines from. Process which will generate a new document lines based on an existing
     * document
     */
    String getCreateFrom();

    /**
     * Set Create lines from. Process which will generate a new document lines based on an existing
     * document
     */
    void setCreateFrom(String CreateFrom);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Document Action. The targeted status of the document
     */
    String getDocAction();

    /**
     * Set Document Action. The targeted status of the document
     */
    void setDocAction(String DocAction);

    /**
     * Get Document Status. The current status of the document
     */
    String getDocStatus();

    /**
     * Set Document Status. The current status of the document
     */
    void setDocStatus(String DocStatus);

    /**
     * Get Document No. Document sequence number of the document
     */
    String getDocumentNo();

    /**
     * Set Document No. Document sequence number of the document
     */
    void setDocumentNo(String DocumentNo);

    /**
     * Get Generate To. Generate To
     */
    String getGenerateTo();

    /**
     * Set Generate To. Generate To
     */
    void setGenerateTo(String GenerateTo);

    /**
     * Get Comment/Help. Comment or Hint
     */
    String getHelp();

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

    /**
     * Get Shipment/Receipt. MaterialShipment Document
     */
    int getInOut_ID();

    /**
     * Set Shipment/Receipt. MaterialShipment Document
     */
    void setInOut_ID(int InOut_ID);

    I_M_InOut getInOut() throws RuntimeException;

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Approved. Indicates if this document requires approval
     */
    void setIsApproved(boolean IsApproved);

    /**
     * Get Approved. Indicates if this document requires approval
     */
    boolean isApproved();

    /**
     * Set Sales Transaction. This is a Sales Transaction
     */
    void setIsSOTrx(boolean IsSOTrx);

    /**
     * Get Sales Transaction. This is a Sales Transaction
     */
    boolean isSOTrx();

    /**
     * Get RMA. Return Material Authorization
     */
    int getM_RMA_ID();

    /**
     * Set RMA. Return Material Authorization
     */
    void setM_RMA_ID(int M_RMA_ID);

    /**
     * Get RMA Type. Return Material Authorization Type
     */
    int getM_RMAType_ID();

    /**
     * Set RMA Type. Return Material Authorization Type
     */
    void setM_RMAType_ID(int M_RMAType_ID);

    I_M_RMAType getM_RMAType() throws RuntimeException;

    /**
     * Get M_RMA_UU
     */
    String getM_RMA_UU();

    /**
     * Set M_RMA_UU
     */
    void setM_RMA_UU(String M_RMA_UU);

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Processed. The document has been processed
     */
    boolean isProcessed();

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Get Process Now
     */
    boolean isProcessing();

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Referenced RMA
     */
    int getRef_RMA_ID();

    /**
     * Set Referenced RMA
     */
    void setRef_RMA_ID(int Ref_RMA_ID);

    I_M_RMA getRef_RMA() throws RuntimeException;

    /**
     * Get Sales Representative. Sales Representative or Company Agent
     */
    int getSalesRep_ID();

    /**
     * Set Sales Representative. Sales Representative or Company Agent
     */
    void setSalesRep_ID(int SalesRep_ID);

    I_AD_User getSalesRep() throws RuntimeException;

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    I_M_RMALine[] getLines(boolean b);

    Properties getCtx();

    String get_TrxName();

    int getPrecision();

    boolean isTaxIncluded();

    I_M_RMATax[] getTaxes(boolean b);

    I_C_Order getOriginalOrder();

    boolean isComplete();

    I_M_InOut getShipment();
}
