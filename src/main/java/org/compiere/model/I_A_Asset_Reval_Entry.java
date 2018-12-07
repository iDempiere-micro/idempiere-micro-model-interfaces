package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Asset_Reval_Entry
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Reval_Entry {

    /**
     * TableName=A_Asset_Reval_Entry
     */
    String Table_Name = "A_Asset_Reval_Entry";

    /**
     * AD_Table_ID=53119
     */
    int Table_ID = 53119;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /**
     * Column name A_Asset_Reval_Entry_ID
     */
    String COLUMNNAME_A_Asset_Reval_Entry_ID = "A_Asset_Reval_Entry_ID";
    /**
     * Column name A_Asset_Reval_Entry_UU
     */
    String COLUMNNAME_A_Asset_Reval_Entry_UU = "A_Asset_Reval_Entry_UU";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name A_Effective_Date
     */
    String COLUMNNAME_A_Effective_Date = "A_Effective_Date";
    /**
     * Column name A_Reval_Cal_Method
     */
    String COLUMNNAME_A_Reval_Cal_Method = "A_Reval_Cal_Method";
    /**
     * Column name A_Reval_Effective_Date
     */
    String COLUMNNAME_A_Reval_Effective_Date = "A_Reval_Effective_Date";
    /**
     * Column name A_Reval_Multiplier
     */
    String COLUMNNAME_A_Reval_Multiplier = "A_Reval_Multiplier";
    /**
     * Column name A_Rev_Code
     */
    String COLUMNNAME_A_Rev_Code = "A_Rev_Code";
    /**
     * Column name C_AcctSchema_ID
     */
    String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /**
     * Column name C_Currency_ID
     */
    String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
    /**
     * Column name C_DocType_ID
     */
    String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
    /**
     * Column name C_Period_ID
     */
    String COLUMNNAME_C_Period_ID = "C_Period_ID";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DateAcct
     */
    String COLUMNNAME_DateAcct = "DateAcct";
    /**
     * Column name DateDoc
     */
    String COLUMNNAME_DateDoc = "DateDoc";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name DocumentNo
     */
    String COLUMNNAME_DocumentNo = "DocumentNo";
    /**
     * Column name GL_Category_ID
     */
    String COLUMNNAME_GL_Category_ID = "GL_Category_ID";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name PostingType
     */
    String COLUMNNAME_PostingType = "PostingType";
    /**
     * Column name Processed
     */
    String COLUMNNAME_Processed = "Processed";
    /**
     * Column name Processing
     */
    String COLUMNNAME_Processing = "Processing";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";

    /**
     * Get Asset Reval. Entry
     */
    int getA_Asset_Reval_Entry_ID();

    /**
     * Set Asset Reval. Entry
     */
    void setA_Asset_Reval_Entry_ID(int A_Asset_Reval_Entry_ID);

    /**
     * Get A_Asset_Reval_Entry_UU
     */
    String getA_Asset_Reval_Entry_UU();

    /**
     * Set A_Asset_Reval_Entry_UU
     */
    void setA_Asset_Reval_Entry_UU(String A_Asset_Reval_Entry_UU);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Effective Date
     */
    Timestamp getA_Effective_Date();

    /**
     * Set Effective Date
     */
    void setA_Effective_Date(Timestamp A_Effective_Date);

    /**
     * Get A_Reval_Cal_Method
     */
    String getA_Reval_Cal_Method();

    /**
     * Set A_Reval_Cal_Method
     */
    void setA_Reval_Cal_Method(String A_Reval_Cal_Method);

    /**
     * Get Reval. Effective Date
     */
    String getA_Reval_Effective_Date();

    /**
     * Set Reval. Effective Date
     */
    void setA_Reval_Effective_Date(String A_Reval_Effective_Date);

    /**
     * Get Reval. Multiplier
     */
    String getA_Reval_Multiplier();

    /**
     * Set Reval. Multiplier
     */
    void setA_Reval_Multiplier(String A_Reval_Multiplier);

    /**
     * Get Rev. Code
     */
    String getA_Rev_Code();

    /**
     * Set Rev. Code
     */
    void setA_Rev_Code(String A_Rev_Code);

    /**
     * Get Accounting Schema. Rules for accounting
     */
    int getC_AcctSchema_ID();

    /**
     * Set Accounting Schema. Rules for accounting
     */
    void setC_AcctSchema_ID(int C_AcctSchema_ID);

    I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

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
     * Get Period. Period of the Calendar
     */
    int getC_Period_ID();

    /**
     * Set Period. Period of the Calendar
     */
    void setC_Period_ID(int C_Period_ID);

    I_C_Period getC_Period() throws RuntimeException;

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Account Date. Accounting Date
     */
    Timestamp getDateAcct();

    /**
     * Set Account Date. Accounting Date
     */
    void setDateAcct(Timestamp DateAcct);

    /**
     * Get Document Date. Date of the Document
     */
    Timestamp getDateDoc();

    /**
     * Set Document Date. Date of the Document
     */
    void setDateDoc(Timestamp DateDoc);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Get Document No. Document sequence number of the document
     */
    String getDocumentNo();

    /**
     * Set Document No. Document sequence number of the document
     */
    void setDocumentNo(String DocumentNo);

    /**
     * Get GL Category. General Ledger Category
     */
    int getGL_Category_ID();

    /**
     * Set GL Category. General Ledger Category
     */
    void setGL_Category_ID(int GL_Category_ID);

    I_GL_Category getGL_Category() throws RuntimeException;

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get PostingType. The type of posted amount for the transaction
     */
    String getPostingType();

    /**
     * Set PostingType. The type of posted amount for the transaction
     */
    void setPostingType(String PostingType);

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
