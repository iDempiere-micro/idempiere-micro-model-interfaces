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

  /** TableName=AD_PInstance_Para */
  public static final String Table_Name = "AD_PInstance_Para";

  /** AD_Table_ID=283 */
  public static final int Table_ID = 283;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getOrgId();

  /** Column name AD_PInstance_ID */
  public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";

  /** Set Process Instance. Instance of the process */
  public void setAD_PInstance_ID(int AD_PInstance_ID);

  /** Get Process Instance. Instance of the process */
  public int getAD_PInstance_ID();

  public I_AD_PInstance getAD_PInstance() throws RuntimeException;

  /** Column name AD_PInstance_Para_UU */
  public static final String COLUMNNAME_AD_PInstance_Para_UU = "AD_PInstance_Para_UU";

  /** Set AD_PInstance_Para_UU */
  public void setAD_PInstance_Para_UU(String AD_PInstance_Para_UU);

  /** Get AD_PInstance_Para_UU */
  public String getAD_PInstance_Para_UU();

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name Info */
  public static final String COLUMNNAME_Info = "Info";

  /** Set Info. Information */
  public void setInfo(String Info);

  /** Get Info. Information */
  public String getInfo();

  /** Column name Info_To */
  public static final String COLUMNNAME_Info_To = "Info_To";

  /** Set Info To */
  public void setInfo_To(String Info_To);

  /** Get Info To */
  public String getInfo_To();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name ParameterName */
  public static final String COLUMNNAME_ParameterName = "ParameterName";

  /** Set Parameter Name */
  public void setParameterName(String ParameterName);

  /** Get Parameter Name */
  public String getParameterName();

  /** Column name P_Date */
  public static final String COLUMNNAME_P_Date = "P_Date";

  /** Set Process Date. Process Parameter */
  public void setP_Date(Timestamp P_Date);

  /** Get Process Date. Process Parameter */
  public Timestamp getP_Date();

  /** Column name P_Date_To */
  public static final String COLUMNNAME_P_Date_To = "P_Date_To";

  /** Set Process Date To. Process Parameter */
  public void setP_Date_To(Timestamp P_Date_To);

  /** Get Process Date To. Process Parameter */
  public Timestamp getP_Date_To();

  /** Column name P_Number */
  public static final String COLUMNNAME_P_Number = "P_Number";

  /** Set Process Number. Process Parameter */
  public void setP_Number(BigDecimal P_Number);

  /** Get Process Number. Process Parameter */
  public BigDecimal getP_Number();

  /** Column name P_Number_To */
  public static final String COLUMNNAME_P_Number_To = "P_Number_To";

  /** Set Process Number To. Process Parameter */
  public void setP_Number_To(BigDecimal P_Number_To);

  /** Get Process Number To. Process Parameter */
  public BigDecimal getP_Number_To();

  /** Column name P_String */
  public static final String COLUMNNAME_P_String = "P_String";

  /** Set Process String. Process Parameter */
  public void setP_String(String P_String);

  /** Get Process String. Process Parameter */
  public String getP_String();

  /** Column name P_String_To */
  public static final String COLUMNNAME_P_String_To = "P_String_To";

  /** Set Process String To. Process Parameter */
  public void setP_String_To(String P_String_To);

  /** Get Process String To. Process Parameter */
  public String getP_String_To();

  /** Column name SeqNo */
  public static final String COLUMNNAME_SeqNo = "SeqNo";

  /** Set Sequence. Method of ordering records; lowest number comes first */
  public void setSeqNo(int SeqNo);

  /** Get Sequence. Method of ordering records; lowest number comes first */
  public int getSeqNo();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
