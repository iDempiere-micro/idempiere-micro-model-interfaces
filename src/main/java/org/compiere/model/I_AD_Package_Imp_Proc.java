package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Package_Imp_Proc
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Package_Imp_Proc {

    /**
     * TableName=AD_Package_Imp_Proc
     */
    String Table_Name = "AD_Package_Imp_Proc";

    /**
     * AD_Table_ID=50008
     */
    int Table_ID = 50008;

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
     * Column name AD_Override_Dict
     */
    String COLUMNNAME_AD_Override_Dict = "AD_Override_Dict";
    /**
     * Column name AD_Package_Dir
     */
    String COLUMNNAME_AD_Package_Dir = "AD_Package_Dir";
    /**
     * Column name AD_Package_Imp_Proc_ID
     */
    String COLUMNNAME_AD_Package_Imp_Proc_ID = "AD_Package_Imp_Proc_ID";
    /**
     * Column name AD_Package_Imp_Proc_UU
     */
    String COLUMNNAME_AD_Package_Imp_Proc_UU = "AD_Package_Imp_Proc_UU";
    /**
     * Column name AD_Package_Source
     */
    String COLUMNNAME_AD_Package_Source = "AD_Package_Source";
    /**
     * Column name AD_Package_Source_Type
     */
    String COLUMNNAME_AD_Package_Source_Type = "AD_Package_Source_Type";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name DateProcessed
     */
    String COLUMNNAME_DateProcessed = "DateProcessed";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name P_Msg
     */
    String COLUMNNAME_P_Msg = "P_Msg";
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
     * Set Organization. Organizational entity within client
     */
    void setAD_Org_ID(int AD_Org_ID);

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrgId();

    /**
     * Get Update System Maintained Application Dictionary
     */
    boolean isAD_Override_Dict();

    /**
     * Set Update System Maintained Application Dictionary
     */
    void setAD_Override_Dict(boolean AD_Override_Dict);

    /**
     * Get Package Directory. Package directory, default to AdempiereHome/packages
     */
    String getAD_Package_Dir();

    /**
     * Set Package Directory. Package directory, default to AdempiereHome/packages
     */
    void setAD_Package_Dir(String AD_Package_Dir);

    /**
     * Get Package Imp. Proc.
     */
    int getAD_Package_Imp_Proc_ID();

    /**
     * Set Package Imp. Proc.
     */
    void setAD_Package_Imp_Proc_ID(int AD_Package_Imp_Proc_ID);

    /**
     * Get AD_Package_Imp_Proc_UU
     */
    String getAD_Package_Imp_Proc_UU();

    /**
     * Set AD_Package_Imp_Proc_UU
     */
    void setAD_Package_Imp_Proc_UU(String AD_Package_Imp_Proc_UU);

    /**
     * Get Package Source. Fully qualified package source file name
     */
    String getAD_Package_Source();

    /**
     * Set Package Source. Fully qualified package source file name
     */
    void setAD_Package_Source(String AD_Package_Source);

    /**
     * Get Package Source Type. Type of package source - file, ftp, webservice etc
     */
    String getAD_Package_Source_Type();

    /**
     * Set Package Source Type. Type of package source - file, ftp, webservice etc
     */
    void setAD_Package_Source_Type(String AD_Package_Source_Type);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Date Processed
     */
    Timestamp getDateProcessed();

    /**
     * Set Date Processed
     */
    void setDateProcessed(Timestamp DateProcessed);

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
     * Get Process Message
     */
    String getP_Msg();

    /**
     * Set Process Message
     */
    void setP_Msg(String P_Msg);

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
