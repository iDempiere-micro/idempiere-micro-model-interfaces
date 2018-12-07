package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for A_Asset_Class
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_A_Asset_Class {

    /**
     * TableName=A_Asset_Class
     */
    String Table_Name = "A_Asset_Class";

    /**
     * AD_Table_ID=53269
     */
    int Table_ID = 53269;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /**
     * AccessLevel = 7 - System - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /**
     * Column name A_Asset_Class_ID
     */
    String COLUMNNAME_A_Asset_Class_ID = "A_Asset_Class_ID";
    /**
     * Column name A_Asset_Class_UU
     */
    String COLUMNNAME_A_Asset_Class_UU = "A_Asset_Class_UU";
    /**
     * Column name AD_Org_ID
     */
    String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
    /**
     * Column name A_Life_Period_2004
     */
    String COLUMNNAME_A_Life_Period_2004 = "A_Life_Period_2004";
    /**
     * Column name A_Life_Period_Max
     */
    String COLUMNNAME_A_Life_Period_Max = "A_Life_Period_Max";
    /**
     * Column name A_Life_Period_Min
     */
    String COLUMNNAME_A_Life_Period_Min = "A_Life_Period_Min";
    /**
     * Column name A_Value_2004
     */
    String COLUMNNAME_A_Value_2004 = "A_Value_2004";
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
     * Column name MFX_Clasa
     */
    String COLUMNNAME_MFX_Clasa = "MFX_Clasa";
    /**
     * Column name MFX_Grupa
     */
    String COLUMNNAME_MFX_Grupa = "MFX_Grupa";
    /**
     * Column name MFX_SubClasa
     */
    String COLUMNNAME_MFX_SubClasa = "MFX_SubClasa";
    /**
     * Column name MFX_SubGrupa
     */
    String COLUMNNAME_MFX_SubGrupa = "MFX_SubGrupa";
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
     * Get Asset class
     */
    int getA_Asset_Class_ID();

    /**
     * Set Asset class
     */
    void setA_Asset_Class_ID(int A_Asset_Class_ID);

    /**
     * Get A_Asset_Class_UU
     */
    String getA_Asset_Class_UU();

    /**
     * Set A_Asset_Class_UU
     */
    void setA_Asset_Class_UU(String A_Asset_Class_UU);

    /**
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Life Periods 2004 (min)
     */
    int getA_Life_Period_2004();

    /**
     * Set Life Periods 2004 (min)
     */
    void setA_Life_Period_2004(int A_Life_Period_2004);

    /**
     * Get Life periods (max)
     */
    int getA_Life_Period_Max();

    /**
     * Set Life periods (max)
     */
    void setA_Life_Period_Max(int A_Life_Period_Max);

    /**
     * Get Life periods (min)
     */
    int getA_Life_Period_Min();

    /**
     * Set Life periods (min)
     */
    void setA_Life_Period_Min(int A_Life_Period_Min);

    /**
     * Get Value 2004
     */
    String getA_Value_2004();

    /**
     * Set Value 2004
     */
    void setA_Value_2004(String A_Value_2004);

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
     * Get Fixed Asset Class
     */
    int getMFX_Clasa();

    /**
     * Set Fixed Asset Class
     */
    void setMFX_Clasa(int MFX_Clasa);

    /**
     * Get Fixed Asset Group
     */
    int getMFX_Grupa();

    /**
     * Set Fixed Asset Group
     */
    void setMFX_Grupa(int MFX_Grupa);

    /**
     * Get Fixed Asset Subclass
     */
    int getMFX_SubClasa();

    /**
     * Set Fixed Asset Subclass
     */
    void setMFX_SubClasa(int MFX_SubClasa);

    /**
     * Get Fixed Asset Subgroup
     */
    int getMFX_SubGrupa();

    /**
     * Set Fixed Asset Subgroup
     */
    void setMFX_SubGrupa(int MFX_SubGrupa);

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
