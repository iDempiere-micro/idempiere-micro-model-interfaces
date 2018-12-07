package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_PInstance_Para
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_PInstance_Para {

    /**
     * TableName=AD_PInstance_Para
     */
    String Table_Name = "AD_PInstance_Para";

    /**
     * AD_Table_ID=283
     */
    int Table_ID = 283;

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
     * Column name AD_PInstance_ID
     */
    String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
    /**
     * Column name AD_PInstance_Para_UU
     */
    String COLUMNNAME_AD_PInstance_Para_UU = "AD_PInstance_Para_UU";
    /**
     * Column name Created
     */
    String COLUMNNAME_Created = "Created";
    /**
     * Column name CreatedBy
     */
    String COLUMNNAME_CreatedBy = "CreatedBy";
    /**
     * Column name Info
     */
    String COLUMNNAME_Info = "Info";
    /**
     * Column name Info_To
     */
    String COLUMNNAME_Info_To = "Info_To";
    /**
     * Column name IsActive
     */
    String COLUMNNAME_IsActive = "IsActive";
    /**
     * Column name ParameterName
     */
    String COLUMNNAME_ParameterName = "ParameterName";
    /**
     * Column name P_Date
     */
    String COLUMNNAME_P_Date = "P_Date";
    /**
     * Column name P_Date_To
     */
    String COLUMNNAME_P_Date_To = "P_Date_To";
    /**
     * Column name P_Number
     */
    String COLUMNNAME_P_Number = "P_Number";
    /**
     * Column name P_Number_To
     */
    String COLUMNNAME_P_Number_To = "P_Number_To";
    /**
     * Column name P_String
     */
    String COLUMNNAME_P_String = "P_String";
    /**
     * Column name P_String_To
     */
    String COLUMNNAME_P_String_To = "P_String_To";
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
     * Get Process Instance. Instance of the process
     */
    int getAD_PInstance_ID();

    /**
     * Set Process Instance. Instance of the process
     */
    void setAD_PInstance_ID(int AD_PInstance_ID);

    I_AD_PInstance getAD_PInstance() throws RuntimeException;

    /**
     * Get AD_PInstance_Para_UU
     */
    String getAD_PInstance_Para_UU();

    /**
     * Set AD_PInstance_Para_UU
     */
    void setAD_PInstance_Para_UU(String AD_PInstance_Para_UU);

    /**
     * Get Created. Date this record was created
     */
    Timestamp getCreated();

    /**
     * Get Created By. User who created this records
     */
    int getCreatedBy();

    /**
     * Get Info. Information
     */
    String getInfo();

    /**
     * Set Info. Information
     */
    void setInfo(String Info);

    /**
     * Get Info To
     */
    String getInfo_To();

    /**
     * Set Info To
     */
    void setInfo_To(String Info_To);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Get Active. The record is active in the system
     */
    boolean isActive();

    /**
     * Get Parameter Name
     */
    String getParameterName();

    /**
     * Set Parameter Name
     */
    void setParameterName(String ParameterName);

    /**
     * Get Process Date. Process Parameter
     */
    Timestamp getP_Date();

    /**
     * Set Process Date. Process Parameter
     */
    void setP_Date(Timestamp P_Date);

    /**
     * Get Process Date To. Process Parameter
     */
    Timestamp getP_Date_To();

    /**
     * Set Process Date To. Process Parameter
     */
    void setP_Date_To(Timestamp P_Date_To);

    /**
     * Get Process Number. Process Parameter
     */
    BigDecimal getP_Number();

    /**
     * Set Process Number. Process Parameter
     */
    void setP_Number(BigDecimal P_Number);

    /**
     * Get Process Number To. Process Parameter
     */
    BigDecimal getP_Number_To();

    /**
     * Set Process Number To. Process Parameter
     */
    void setP_Number_To(BigDecimal P_Number_To);

    /**
     * Get Process String. Process Parameter
     */
    String getP_String();

    /**
     * Set Process String. Process Parameter
     */
    void setP_String(String P_String);

    /**
     * Get Process String To. Process Parameter
     */
    String getP_String_To();

    /**
     * Set Process String To. Process Parameter
     */
    void setP_String_To(String P_String_To);

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
