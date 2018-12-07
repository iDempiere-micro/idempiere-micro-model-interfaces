package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_StatusLineUsedIn
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_StatusLineUsedIn {

  /** TableName=AD_StatusLineUsedIn */
  String Table_Name = "AD_StatusLineUsedIn";

  /** AD_Table_ID=200108 */
  int Table_ID = 200108;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_StatusLine_ID */
  String COLUMNNAME_AD_StatusLine_ID = "AD_StatusLine_ID";
  /** Column name AD_StatusLineUsedIn_ID */
  String COLUMNNAME_AD_StatusLineUsedIn_ID = "AD_StatusLineUsedIn_ID";
  /** Column name AD_StatusLineUsedIn_UU */
  String COLUMNNAME_AD_StatusLineUsedIn_UU = "AD_StatusLineUsedIn_UU";
  /** Column name AD_Tab_ID */
  String COLUMNNAME_AD_Tab_ID = "AD_Tab_ID";
  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name AD_Window_ID */
  String COLUMNNAME_AD_Window_ID = "AD_Window_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsStatusLine */
  String COLUMNNAME_IsStatusLine = "IsStatusLine";
  /** Column name SeqNo */
  String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Status Line */
  int getAD_StatusLine_ID();

  /** Set Status Line */
  void setAD_StatusLine_ID(int AD_StatusLine_ID);

  I_AD_StatusLine getAD_StatusLine() throws RuntimeException;

  /** Get AD_StatusLineUsedIn */
  int getAD_StatusLineUsedIn_ID();

  /** Set AD_StatusLineUsedIn */
  void setAD_StatusLineUsedIn_ID(int AD_StatusLineUsedIn_ID);

  /** Get AD_StatusLineUsedIn_UU */
  String getAD_StatusLineUsedIn_UU();

  /** Set AD_StatusLineUsedIn_UU */
  void setAD_StatusLineUsedIn_UU(String AD_StatusLineUsedIn_UU);

  /** Get Tab. Tab within a Window */
  int getAD_Tab_ID();

  /** Set Tab. Tab within a Window */
  void setAD_Tab_ID(int AD_Tab_ID);

  I_AD_Tab getAD_Tab() throws RuntimeException;

  /** Get Table. Database Table information */
  int getAD_Table_ID();

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  I_AD_Table getAD_Table() throws RuntimeException;

  /** Get Window. Data entry or display window */
  int getAD_Window_ID();

  /** Set Window. Data entry or display window */
  void setAD_Window_ID(int AD_Window_ID);

  I_AD_Window getAD_Window() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Status Line. Defines if this record refers to a status line or to a help widget */
  void setIsStatusLine(boolean IsStatusLine);

  /** Get Status Line. Defines if this record refers to a status line or to a help widget */
  boolean isStatusLine();

  /** Get Sequence. Method of ordering records; lowest number comes first */
  int getSeqNo();

  /** Set Sequence. Method of ordering records; lowest number comes first */
  void setSeqNo(int SeqNo);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
