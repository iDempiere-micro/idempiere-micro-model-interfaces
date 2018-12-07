package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PA_DocumentStatus
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_DocumentStatus {

    /**
     * TableName=PA_DocumentStatus
     */
    String Table_Name = "PA_DocumentStatus";

    /**
     * AD_Table_ID=200216
     */
    int Table_ID = 200216;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /**
     * Column name AD_Form_ID
     */
    String COLUMNNAME_AD_Form_ID = "AD_Form_ID";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name AD_Role_ID
     */
    String COLUMNNAME_AD_Role_ID = "AD_Role_ID";
    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name AD_User_ID
     */
    String COLUMNNAME_AD_User_ID = "AD_User_ID";
    /**
     * Column name AD_Window_ID
     */
    String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
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
     * Column name Name_PrintColor_ID
     */
    String Name_PrintColor_ID = "Name_PrintColor_ID";
    /**
     * Column name Name_PrintFont_ID
     */
    String Name_PrintFont_ID = "Name_PrintFont_ID";
    /**
     * Column name Number_PrintColor_ID
     */
    String COLUMNNAME_Number_PrintColor_ID = "Number_PrintColor_ID";
    /**
     * Column name Number_PrintFont_ID
     */
    String COLUMNNAME_Number_PrintFont_ID = "Number_PrintFont_ID";
    /**
     * Column name PA_DocumentStatus_ID
     */
    String COLUMNNAME_PA_DocumentStatus_ID = "PA_DocumentStatus_ID";
    /**
     * Column name PA_DocumentStatus_UU
     */
    String COLUMNNAME_PA_DocumentStatus_UU = "PA_DocumentStatus_UU";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
    /**
     * Column name WhereClause
     */
    String COLUMNNAME_WhereClause = "WhereClause";

    /**
     * Get Special Form. Special Form
     */
    int getAD_Form_ID();

    /**
     * Set Special Form. Special Form
     */
    void setAD_Form_ID(int AD_Form_ID);

    I_AD_Form getAD_Form() throws RuntimeException;

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Role. Responsibility Role
     */
    int getAD_Role_ID();

    /**
     * Set Role. Responsibility Role
     */
    void setAD_Role_ID(int AD_Role_ID);

    I_AD_Role getAD_Role() throws RuntimeException;

    /**
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    /**
     * Set Table. Database Table information
     */
    void setAD_Table_ID(int AD_Table_ID);

    I_AD_Table getAD_Table() throws RuntimeException;

    /**
     * Get User/Contact. User within the system - Internal or Business Partner Contact
     */
    int getAD_User_ID();

    /**
     * Set User/Contact. User within the system - Internal or Business Partner Contact
     */
    void setAD_User_ID(int AD_User_ID);

    I_AD_User getAD_User() throws RuntimeException;

    /**
     * Get Window. Data entry or display window
     */
    int getAD_Window_ID();

    /**
     * Set Window. Data entry or display window
     */
    void setAD_Window_ID(int AD_Window_ID);

    I_AD_Window getAD_Window() throws RuntimeException;

    /**
     * Get Project. Financial Project
     */
    int getC_Project_ID();

    /**
     * Set Project. Financial Project
     */
    void setC_Project_ID(int C_Project_ID);

    I_C_Project getC_Project() throws RuntimeException;

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
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

    /**
     * Get Print Color for Name
     */
    int getName_PrintColor_ID();

    /**
     * Set Print Color for Name
     */
    void setName_PrintColor_ID(int Name_PrintColor_ID);

    I_AD_PrintColor getName_PrintColor() throws RuntimeException;

    /**
     * Get Print Font for Name
     */
    int getName_PrintFont_ID();

    /**
     * Set Print Font for Name
     */
    void setName_PrintFont_ID(int Name_PrintFont_ID);

    I_AD_PrintFont getName_PrintFont() throws RuntimeException;

    /**
     * Get Print Color for Number
     */
    int getNumber_PrintColor_ID();

    /**
     * Set Print Color for Number
     */
    void setNumber_PrintColor_ID(int Number_PrintColor_ID);

    I_AD_PrintColor getNumber_PrintColor() throws RuntimeException;

    /**
     * Get Print Font for Number
     */
    int getNumber_PrintFont_ID();

    /**
     * Set Print Font for Number
     */
    void setNumber_PrintFont_ID(int Number_PrintFont_ID);

    I_AD_PrintFont getNumber_PrintFont() throws RuntimeException;

    /**
     * Get Document Status
     */
    int getPA_DocumentStatus_ID();

    /**
     * Set Document Status
     */
    void setPA_DocumentStatus_ID(int PA_DocumentStatus_ID);

    /**
     * Get PA_DocumentStatus_UU
     */
    String getPA_DocumentStatus_UU();

    /**
     * Set PA_DocumentStatus_UU
     */
    void setPA_DocumentStatus_UU(String PA_DocumentStatus_UU);

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

    /**
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();

    /**
     * Get Sql WHERE. Fully qualified SQL WHERE clause
     */
    String getWhereClause();

    /**
     * Set Sql WHERE. Fully qualified SQL WHERE clause
     */
    void setWhereClause(String WhereClause);
}
