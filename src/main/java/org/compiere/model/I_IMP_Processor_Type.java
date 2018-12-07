package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for IMP_Processor_Type
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_IMP_Processor_Type {

    /**
     * TableName=IMP_Processor_Type
     */
    String Table_Name = "IMP_Processor_Type";

    /**
     * AD_Table_ID=53080
     */
    int Table_ID = 53080;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

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
     * Column name IMP_Processor_Type_ID
     */
    String COLUMNNAME_IMP_Processor_Type_ID = "IMP_Processor_Type_ID";
    /**
     * Column name IMP_Processor_Type_UU
     */
    String COLUMNNAME_IMP_Processor_Type_UU = "IMP_Processor_Type_UU";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name JavaClass
     */
    String COLUMNNAME_JavaClass = "JavaClass";
    /**
     * Column name Updated
     */
    String COLUMNNAME_Updated = "Updated";
    /**
     * Column name UpdatedBy
     */
    String COLUMNNAME_UpdatedBy = "UpdatedBy";
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
     * Get Import Processor Type
     */
    int getIMP_Processor_Type_ID();

    /**
     * Set Import Processor Type
     */
    void setIMP_Processor_Type_ID(int IMP_Processor_Type_ID);

    /**
     * Get IMP_Processor_Type_UU
     */
    String getIMP_Processor_Type_UU();

    /**
     * Set IMP_Processor_Type_UU
     */
    void setIMP_Processor_Type_UU(String IMP_Processor_Type_UU);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Java Class
     */
    String getJavaClass();

    /**
     * Set Java Class
     */
    void setJavaClass(String JavaClass);

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

    /**
     * Get Search Key. Search key for the record in the format required - must be unique
     */
    String getValue();

    /**
     * Set Search Key. Search key for the record in the format required - must be unique
     */
    void setValue(String Value);
}
