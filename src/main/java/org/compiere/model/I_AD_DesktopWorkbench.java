package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_DesktopWorkbench
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_DesktopWorkbench {

  /** TableName=AD_DesktopWorkbench */
  String Table_Name = "AD_DesktopWorkbench";

  /** AD_Table_ID=459 */
  int Table_ID = 459;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Desktop_ID */
  String COLUMNNAME_AD_Desktop_ID = "AD_Desktop_ID";
  /** Column name AD_DesktopWorkbench_ID */
  String COLUMNNAME_AD_DesktopWorkbench_ID = "AD_DesktopWorkbench_ID";
  /** Column name AD_DesktopWorkbench_UU */
  String COLUMNNAME_AD_DesktopWorkbench_UU = "AD_DesktopWorkbench_UU";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Workbench_ID */
  String COLUMNNAME_AD_Workbench_ID = "AD_Workbench_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Desktop. Collection of Workbenches */
  int getAD_Desktop_ID();

  /** Set Desktop. Collection of Workbenches */
  void setAD_Desktop_ID(int AD_Desktop_ID);

  I_AD_Desktop getAD_Desktop() throws RuntimeException;

  /** Get Desktop Workbench */
  int getAD_DesktopWorkbench_ID();

  /** Set Desktop Workbench */
  void setAD_DesktopWorkbench_ID(int AD_DesktopWorkbench_ID);

  /** Get AD_DesktopWorkbench_UU */
  String getAD_DesktopWorkbench_UU();

  /** Set AD_DesktopWorkbench_UU */
  void setAD_DesktopWorkbench_UU(String AD_DesktopWorkbench_UU);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Workbench. Collection of windows, reports */
  int getAD_Workbench_ID();

  /** Set Workbench. Collection of windows, reports */
  void setAD_Workbench_ID(int AD_Workbench_ID);

  I_AD_Workbench getAD_Workbench() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
