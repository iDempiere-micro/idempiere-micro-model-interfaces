package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_RegistrationValue
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_RegistrationValue {

    /**
     * TableName=A_RegistrationValue
     */
    String Table_Name = "A_RegistrationValue";

    /**
     * AD_Table_ID=653
     */
    int Table_ID = 653;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name A_RegistrationAttribute_ID
     */
    String COLUMNNAME_A_RegistrationAttribute_ID = "A_RegistrationAttribute_ID";
    /**
     * Column name A_Registration_ID
     */
    String COLUMNNAME_A_Registration_ID = "A_Registration_ID";
    /**
     * Column name A_RegistrationValue_UU
     */
    String COLUMNNAME_A_RegistrationValue_UU = "A_RegistrationValue_UU";
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
     * Get Registration Attribute. Asset Registration Attribute
     */
    int getA_RegistrationAttribute_ID();

    /**
     * Set Registration Attribute. Asset Registration Attribute
     */
    void setA_RegistrationAttribute_ID(int A_RegistrationAttribute_ID);

    I_A_RegistrationAttribute getA_RegistrationAttribute() throws RuntimeException;

    /**
     * Get Registration. User Asset Registration
     */
    int getA_Registration_ID();

    /**
     * Set Registration. User Asset Registration
     */
    void setA_Registration_ID(int A_Registration_ID);

    I_A_Registration getA_Registration() throws RuntimeException;

    /**
     * Get A_RegistrationValue_UU
     */
    String getA_RegistrationValue_UU();

    /**
     * Set A_RegistrationValue_UU
     */
    void setA_RegistrationValue_UU(String A_RegistrationValue_UU);

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
     * Get Updated. Date this record was updated
     */
    Timestamp getUpdated();

    /**
     * Get Updated By. User who updated this records
     */
    int getUpdatedBy();
}
