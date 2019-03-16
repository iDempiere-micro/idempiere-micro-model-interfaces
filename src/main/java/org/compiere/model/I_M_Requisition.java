package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for M_Requisition
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Requisition {

    /**
     * AD_Table_ID=702
     */
    int Table_ID = 702;

    /**
     * AccessLevel = 1 - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);


    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name C_DocType_ID
     */
    String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
    /**
     * Column name DateDoc
     */
    String COLUMNNAME_DateDoc = "DateDoc";
    /**
     * Column name DateRequired
     */
    String COLUMNNAME_DateRequired = "DateRequired";
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
     * Column name IsApproved
     */
    String COLUMNNAME_IsApproved = "IsApproved";
    /**
     * Column name M_PriceList_ID
     */
    String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
    /**
     * Column name M_Requisition_ID
     */
    String COLUMNNAME_M_Requisition_ID = "M_Requisition_ID";
    /**
     * Column name M_Warehouse_ID
     */
    String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
    /**
     * Column name Posted
     */
    String COLUMNNAME_Posted = "Posted";
    /**
     * Column name PriorityRule
     */
    String COLUMNNAME_PriorityRule = "PriorityRule";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name TotalLines
     */
    String COLUMNNAME_TotalLines = "TotalLines";

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getUserId();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setUserId(int AD_User_ID);

    /**
     * Get Document Type. Document type or rules
     */
    int getDocumentTypeId();

    /**
     * Set Document Type. Document type or rules
     */
    void setDocumentTypeId(int C_DocType_ID);

    I_C_DocType getDocumentType() throws RuntimeException;

    /**
     * Get Document Date. Date of the Document
     */
    Timestamp getDateDoc();

    /**
     * Set Document Date. Date of the Document
     */
    void setDateDoc(Timestamp DateDoc);

    /**
     * Get Date Required. Date when required
     */
    Timestamp getDateRequired();

    /**
     * Set Date Required. Date when required
     */
    void setDateRequired(Timestamp DateRequired);

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
     * Set Approved. Indicates if this document requires approval
     */
    void setIsApproved(boolean IsApproved);

    /**
     * Get Approved. Indicates if this document requires approval
     */
    boolean isApproved();

    /**
     * Get Price List. Unique identifier of a Price List
     */
    int getPriceListId();

    /**
     * Set Price List. Unique identifier of a Price List
     */
    void setPriceListId(int M_PriceList_ID);

    /**
     * Get Requisition. Material Requisition
     */
    int getM_Requisition_ID();

    /**
     * Get Warehouse. Storage Warehouse and Service Point
     */
    int getWarehouseId();

    /**
     * Set Warehouse. Storage Warehouse and Service Point
     */
    void setWarehouseId(int M_Warehouse_ID);

    /**
     * Set Posted. Posting status
     */
    void setPosted(boolean Posted);

    /**
     * Set Priority. Priority of a document
     */
    void setPriorityRule(String PriorityRule);

    /**
     * Set Processed. The document has been processed
     */
    void setProcessed(boolean Processed);

    /**
     * Set Process Now
     */
    void setProcessing(boolean Processing);

    /**
     * Get Total Lines. Total of all document lines
     */
    BigDecimal getTotalLines();

    /**
     * Set Total Lines. Total of all document lines
     */
    void setTotalLines(BigDecimal TotalLines);

}
