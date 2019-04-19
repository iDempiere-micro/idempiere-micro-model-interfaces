package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Generated Interface for AD_PInstance_Para
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface ProcessInstanceParameter {

    /**
     * TableName=AD_PInstance_Para
     */
    String Table_Name = "AD_PInstance_Para";

    /**
     * AD_Table_ID=283
     */
    int Table_ID = 283;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);


    /**
     * Column name AD_PInstance_ID
     */
    String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
    /**
     * Column name Info
     */
    String COLUMNNAME_Info = "Info";
    /**
     * Column name Info_To
     */
    String COLUMNNAME_Info_To = "Info_To";
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
     * Get Process Instance. Instance of the process
     */
    int getPInstanceId();

    /**
     * Set Process Instance. Instance of the process
     */
    void setPInstanceId(int AD_PInstance_ID);

    /**
     * Set Info. Information
     */
    void setInfo(String Info);

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
    Timestamp getProcessDate();

    /**
     * Set Process Date. Process Parameter
     */
    void setProcessDate(Timestamp P_Date);

    /**
     * Get Process Date To. Process Parameter
     */
    Timestamp getProcessDateTo();

    /**
     * Set Process Date To. Process Parameter
     */
    void setProcessDateTo(Timestamp P_Date_To);

    /**
     * Get Process Number. Process Parameter
     */
    BigDecimal getProcessNumber();

    /**
     * Set Process Number. Process Parameter
     */
    void setProcessNumber(BigDecimal P_Number);

    /**
     * Get Process Number To. Process Parameter
     */
    BigDecimal getProcessNumberTo();

    /**
     * Set Process Number To. Process Parameter
     */
    void setProcessNumberTo(BigDecimal P_Number_To);

    /**
     * Get Process String. Process Parameter
     */
    String getProcessString();

    /**
     * Set Process String. Process Parameter
     */
    void setProcessString(String P_String);

    /**
     * Get Process String To. Process Parameter
     */
    String getProcessStringTo();

    /**
     * Set Process String To. Process Parameter
     */
    void setProcessStringTo(String P_String_To);

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

}
