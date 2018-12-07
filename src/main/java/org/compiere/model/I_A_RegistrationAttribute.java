package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_RegistrationAttribute
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_RegistrationAttribute {

    /**
     * TableName=A_RegistrationAttribute
     */
    String Table_Name = "A_RegistrationAttribute";

    /**
     * AD_Table_ID=652
     */
    int Table_ID = 652;

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
     * Column name AD_Reference_ID
     */
    String COLUMNNAME_AD_Reference_ID = "AD_Reference_ID";
    /**
     * Column name AD_Reference_Value_ID
     */
    String COLUMNNAME_AD_Reference_Value_ID = "AD_Reference_Value_ID";
    /**
     * Column name A_RegistrationAttribute_ID
     */
    String COLUMNNAME_A_RegistrationAttribute_ID = "A_RegistrationAttribute_ID";
    /**
     * Column name A_RegistrationAttribute_UU
     */
    String COLUMNNAME_A_RegistrationAttribute_UU = "A_RegistrationAttribute_UU";
    /**
     * Column name ColumnName
     */
    String COLUMNNAME_ColumnName = "ColumnName";
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
     * Column name IsSelfService
     */
    String COLUMNNAME_IsSelfService = "IsSelfService";
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
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Reference. System Reference and Validation
     */
    int getAD_Reference_ID();

    /**
     * Set Reference. System Reference and Validation
     */
    void setAD_Reference_ID(int AD_Reference_ID);

    I_AD_Reference getAD_Reference() throws RuntimeException;

    /**
     * Get Reference Key. Required to specify, if data type is Table or List
     */
    int getAD_Reference_Value_ID();

    /**
     * Set Reference Key. Required to specify, if data type is Table or List
     */
    void setAD_Reference_Value_ID(int AD_Reference_Value_ID);

    I_AD_Reference getAD_Reference_Value() throws RuntimeException;

    /**
     * Get Registration Attribute. Asset Registration Attribute
     */
    int getA_RegistrationAttribute_ID();

    /**
     * Set Registration Attribute. Asset Registration Attribute
     */
    void setA_RegistrationAttribute_ID(int A_RegistrationAttribute_ID);

    /**
     * Get A_RegistrationAttribute_UU
     */
    String getA_RegistrationAttribute_UU();

    /**
     * Set A_RegistrationAttribute_UU
     */
    void setA_RegistrationAttribute_UU(String A_RegistrationAttribute_UU);

    /**
     * Get DB Column Name. Name of the column in the database
     */
    String getColumnName();

    /**
     * Set DB Column Name. Name of the column in the database
     */
    void setColumnName(String ColumnName);

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
     * Set Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
     */
    void setIsSelfService(boolean IsSelfService);

    /**
     * Get Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
     */
    boolean isSelfService();

    /**
     * Get Name. Alphanumeric identifier of the entity
     */
    String getName();

    /**
     * Set Name. Alphanumeric identifier of the entity
     */
    void setName(String Name);

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
}
