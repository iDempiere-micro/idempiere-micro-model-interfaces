package org.compiere.model;

import java.math.BigDecimal;

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

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);



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
     * Column name TimeoutDays
     */
    String COLUMNNAME_TimeoutDays = "TimeoutDays";
    /**
     * Column name Update_Status_ID
     */
    String COLUMNNAME_Update_Status_ID = "Update_Status_ID";

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
     * Get Next Status. Move to next status automatically after timeout
     */
    int getNext_Status_ID();

    /**
     * Set Next Status. Move to next status automatically after timeout
     */
    void setNext_Status_ID(int Next_Status_ID);

    /**
     * Get Status Category. Request Status Category
     */
    int getR_StatusCategory_ID();

    /**
     * Get Status. Request Status
     */
    int getR_Status_ID();

    /**
     * Get Timeout in Days. Timeout in Days to change Status automatically
     */
    int getTimeoutDays();

    /**
     * Get Update Status. Automatically change the status after entry from web
     */
    int getUpdate_Status_ID();

    /**
     * Set Update Status. Automatically change the status after entry from web
     */
    void setUpdate_Status_ID(int Update_Status_ID);

}
