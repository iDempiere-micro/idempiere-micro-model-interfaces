package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for R_Status
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_Status {

    /**
     * TableName=R_Status
     */
    String Table_Name = "R_Status";

    /**
     * AD_Table_ID=776
     */
    int Table_ID = 776;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
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
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name IsClosed
     */
    String COLUMNNAME_IsClosed = "IsClosed";
    /**
     * Column name IsDefault
     */
    String COLUMNNAME_IsDefault = "IsDefault";
    /**
     * Column name IsFinalClose
     */
    String COLUMNNAME_IsFinalClose = "IsFinalClose";
    /**
     * Column name IsOpen
     */
    String COLUMNNAME_IsOpen = "IsOpen";
    /**
     * Column name IsWebCanUpdate
     */
    String COLUMNNAME_IsWebCanUpdate = "IsWebCanUpdate";
    /**
     * Column name Next_Status_ID
     */
    String COLUMNNAME_Next_Status_ID = "Next_Status_ID";
    /**
     * Column name R_StatusCategory_ID
     */
    String COLUMNNAME_R_StatusCategory_ID = "R_StatusCategory_ID";
    /**
     * Column name R_Status_ID
     */
    String COLUMNNAME_R_Status_ID = "R_Status_ID";
    /**
     * Column name R_Status_UU
     */
    String COLUMNNAME_R_Status_UU = "R_Status_UU";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name TimeoutDays
     */
    String COLUMNNAME_TimeoutDays = "TimeoutDays";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name Update_Status_ID
     */
    String COLUMNNAME_Update_Status_ID = "Update_Status_ID";
    /**
     * Column name Value
     */
    String COLUMNNAME_Value = "Value";

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

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
     * Get Comment/Help. Comment or Hint
     */
    String getHelp();

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Set Closed Status. The status is closed
     */
    void setIsClosed(boolean IsClosed);

    /**
     * Get Closed Status. The status is closed
     */
    boolean isClosed();

    /**
     * Set Default. Default value
     */
    void setIsDefault(boolean IsDefault);

    /**
     * Get Default. Default value
     */
    boolean isDefault();

    /**
     * Set Final Close. Entries with Final Close cannot be re-opened
     */
    void setIsFinalClose(boolean IsFinalClose);

    /**
     * Get Final Close. Entries with Final Close cannot be re-opened
     */
    boolean isFinalClose();

    /**
     * Set Open Status. The status is closed
     */
    void setIsOpen(boolean IsOpen);

    /**
     * Get Open Status. The status is closed
     */
    boolean isOpen();

    /**
     * Set Web Can Update. Entry can be updated from the Web
     */
    void setIsWebCanUpdate(boolean IsWebCanUpdate);

    /**
     * Get Web Can Update. Entry can be updated from the Web
     */
    boolean isWebCanUpdate();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Next Status. Move to next status automatically after timeout
     */
    int getNext_Status_ID();

    /**
     * Set Next Status. Move to next status automatically after timeout
     */
    void setNext_Status_ID(int Next_Status_ID);

    I_R_Status getNext_Status() throws RuntimeException;

    /**
     * Get Status Category. Request Status Category
     */
    int getR_StatusCategory_ID();

    /**
     * Set Status Category. Request Status Category
     */
    void setR_StatusCategory_ID(int R_StatusCategory_ID);

    I_R_StatusCategory getR_StatusCategory() throws RuntimeException;

    /**
     * Get Status. Request Status
     */
    int getR_Status_ID();

    /**
     * Set Status. Request Status
     */
    void setR_Status_ID(int R_Status_ID);

    /**
     * Get R_Status_UU
     */
    String getR_Status_UU();

    /**
     * Set R_Status_UU
     */
    void setR_Status_UU(String R_Status_UU);

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

    /**
     * Get Timeout in Days. Timeout in Days to change Status automatically
     */
    int getTimeoutDays();

    /**
     * Set Timeout in Days. Timeout in Days to change Status automatically
     */
    void setTimeoutDays(int TimeoutDays);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Update Status. Automatically change the status after entry from web
     */
    int getUpdate_Status_ID();

    /**
     * Set Update Status. Automatically change the status after entry from web
     */
    void setUpdate_Status_ID(int Update_Status_ID);

    I_R_Status getUpdate_Status() throws RuntimeException;

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);
}
