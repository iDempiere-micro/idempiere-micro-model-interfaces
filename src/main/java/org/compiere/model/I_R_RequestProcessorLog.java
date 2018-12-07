package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for R_RequestProcessorLog
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_RequestProcessorLog {

    /**
     * TableName=R_RequestProcessorLog
     */
    String Table_Name = "R_RequestProcessorLog";

    /**
     * AD_Table_ID=659
     */
    int Table_ID = 659;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name BinaryData
     */
    String COLUMNNAME_BinaryData = "BinaryData";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsError
     */
    String COLUMNNAME_IsError = "IsError";
    /**
     * Column name Reference
     */
    String COLUMNNAME_Reference = "Reference";
    /**
     * Column name R_RequestProcessor_ID
     */
    String COLUMNNAME_R_RequestProcessor_ID = "R_RequestProcessor_ID";
    /**
     * Column name R_RequestProcessorLog_ID
     */
    String COLUMNNAME_R_RequestProcessorLog_ID = "R_RequestProcessorLog_ID";
    /**
     * Column name R_RequestProcessorLog_UU
     */
    String COLUMNNAME_R_RequestProcessorLog_UU = "R_RequestProcessorLog_UU";
    /**
     * Column name Summary
     */
    String COLUMNNAME_Summary = "Summary";
    /**
     * Column name TextMsg
     */
    String COLUMNNAME_TextMsg = "TextMsg";
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
     * Get Binary Data. Binary Data
     */
    byte[] getBinaryData();

    /**
     * Set Binary Data. Binary Data
     */
    void setBinaryData(byte[] BinaryData);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Error. An Error occurred in the execution
     */
    void setIsError(boolean IsError);

    /**
     * Get Error. An Error occurred in the execution
     */
    boolean isError();

    /**
     * Get Reference. Reference for this record
     */
    String getReference();

    /**
     * Set Reference. Reference for this record
     */
    void setReference(String Reference);

    /**
     * Get Request Processor. Processor for Requests
     */
    int getR_RequestProcessor_ID();

    /**
     * Set Request Processor. Processor for Requests
     */
    void setR_RequestProcessor_ID(int R_RequestProcessor_ID);

    I_R_RequestProcessor getR_RequestProcessor() throws RuntimeException;

    /**
     * Get Request Processor Log. Result of the execution of the Request Processor
     */
    int getR_RequestProcessorLog_ID();

    /**
     * Set Request Processor Log. Result of the execution of the Request Processor
     */
    void setR_RequestProcessorLog_ID(int R_RequestProcessorLog_ID);

    /**
     * Get R_RequestProcessorLog_UU
     */
    String getR_RequestProcessorLog_UU();

    /**
     * Set R_RequestProcessorLog_UU
     */
    void setR_RequestProcessorLog_UU(String R_RequestProcessorLog_UU);

    /**
     * Get Summary. Textual summary of this request
     */
    String getSummary();

    /**
     * Set Summary. Textual summary of this request
     */
    void setSummary(String Summary);

    /**
     * Get Text Message. Text Message
     */
    String getTextMsg();

    /**
     * Set Text Message. Text Message
     */
    void setTextMsg(String TextMsg);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
