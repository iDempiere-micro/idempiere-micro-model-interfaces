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

  /** TableName=AD_Package_Imp_Proc */
  public static final String Table_Name = "AD_Package_Imp_Proc";

  /** AD_Table_ID=50008 */
  public static final int Table_ID = 50008;

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

  /** Column name AD_Override_Dict */
  public static final String COLUMNNAME_AD_Override_Dict = "AD_Override_Dict";

  /** Set Update System Maintained Application Dictionary */
  public void setAD_Override_Dict(boolean AD_Override_Dict);

  /** Get Update System Maintained Application Dictionary */
  public boolean isAD_Override_Dict();

  /** Column name AD_Package_Dir */
  public static final String COLUMNNAME_AD_Package_Dir = "AD_Package_Dir";

  /** Set Package Directory. Package directory, default to AdempiereHome/packages */
  public void setAD_Package_Dir(String AD_Package_Dir);

  /** Get Package Directory. Package directory, default to AdempiereHome/packages */
  public String getAD_Package_Dir();

  /** Column name AD_Package_Imp_Proc_ID */
  public static final String COLUMNNAME_AD_Package_Imp_Proc_ID = "AD_Package_Imp_Proc_ID";

  /** Set Package Imp. Proc. */
  public void setAD_Package_Imp_Proc_ID(int AD_Package_Imp_Proc_ID);

  /** Get Package Imp. Proc. */
  public int getAD_Package_Imp_Proc_ID();

  /** Column name AD_Package_Imp_Proc_UU */
  public static final String COLUMNNAME_AD_Package_Imp_Proc_UU = "AD_Package_Imp_Proc_UU";

  /** Set AD_Package_Imp_Proc_UU */
  public void setAD_Package_Imp_Proc_UU(String AD_Package_Imp_Proc_UU);

  /** Get AD_Package_Imp_Proc_UU */
  public String getAD_Package_Imp_Proc_UU();

  /** Column name AD_Package_Source */
  public static final String COLUMNNAME_AD_Package_Source = "AD_Package_Source";

  /** Set Package Source. Fully qualified package source file name */
  public void setAD_Package_Source(String AD_Package_Source);

  /** Get Package Source. Fully qualified package source file name */
  public String getAD_Package_Source();

  /** Column name AD_Package_Source_Type */
  public static final String COLUMNNAME_AD_Package_Source_Type = "AD_Package_Source_Type";

  /** Set Package Source Type. Type of package source - file, ftp, webservice etc */
  public void setAD_Package_Source_Type(String AD_Package_Source_Type);

  /** Get Package Source Type. Type of package source - file, ftp, webservice etc */
  public String getAD_Package_Source_Type();

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name DateProcessed */
  public static final String COLUMNNAME_DateProcessed = "DateProcessed";

  /** Set Date Processed */
  public void setDateProcessed(Timestamp DateProcessed);

  /** Get Date Processed */
  public Timestamp getDateProcessed();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Set Name. Alphanumeric identifier of the entity */
  public void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  public String getName();

  /** Column name P_Msg */
  public static final String COLUMNNAME_P_Msg = "P_Msg";

  /** Set Process Message */
  public void setP_Msg(String P_Msg);

  /** Get Process Message */
  public String getP_Msg();

  /** Column name Processing */
  public static final String COLUMNNAME_Processing = "Processing";

  /** Set Process Now */
  public void setProcessing(boolean Processing);

  /** Get Process Now */
  public boolean isProcessing();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
