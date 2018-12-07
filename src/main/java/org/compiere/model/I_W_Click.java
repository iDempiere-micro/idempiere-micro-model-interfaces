package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for W_Click
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_W_Click {

  /** TableName=W_Click */
  String Table_Name = "W_Click";

  /** AD_Table_ID=550 */
  int Table_ID = 550;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AcceptLanguage */
  String COLUMNNAME_AcceptLanguage = "AcceptLanguage";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name EMail */
  String COLUMNNAME_EMail = "EMail";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Referrer */
  String COLUMNNAME_Referrer = "Referrer";
  /** Column name Remote_Addr */
  String COLUMNNAME_Remote_Addr = "Remote_Addr";
  /** Column name Remote_Host */
  String COLUMNNAME_Remote_Host = "Remote_Host";
  /** Column name TargetURL */
  String COLUMNNAME_TargetURL = "TargetURL";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name UserAgent */
  String COLUMNNAME_UserAgent = "UserAgent";
  /** Column name W_ClickCount_ID */
  String COLUMNNAME_W_ClickCount_ID = "W_ClickCount_ID";
  /** Column name W_Click_ID */
  String COLUMNNAME_W_Click_ID = "W_Click_ID";
  /** Column name W_Click_UU */
  String COLUMNNAME_W_Click_UU = "W_Click_UU";

  /** Get Accept Language. Language accepted based on browser information */
  String getAcceptLanguage();

  /** Set Accept Language. Language accepted based on browser information */
  void setAcceptLanguage(String AcceptLanguage);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get EMail Address. Electronic Mail Address */
  String getEMail();

  /** Set EMail Address. Electronic Mail Address */
  void setEMail(String EMail);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Referrer. Referring web address */
  String getReferrer();

  /** Set Referrer. Referring web address */
  void setReferrer(String Referrer);

  /** Get Remote Addr. Remote Address */
  String getRemote_Addr();

  /** Set Remote Addr. Remote Address */
  void setRemote_Addr(String Remote_Addr);

  /** Get Remote Host. Remote host Info */
  String getRemote_Host();

  /** Set Remote Host. Remote host Info */
  void setRemote_Host(String Remote_Host);

  /** Get Target URL. URL for the Target */
  String getTargetURL();

  /** Set Target URL. URL for the Target */
  void setTargetURL(String TargetURL);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get User Agent. Browser Used */
  String getUserAgent();

  /** Set User Agent. Browser Used */
  void setUserAgent(String UserAgent);

  /** Get Click Count. Web Click Management */
  int getW_ClickCount_ID();

  /** Set Click Count. Web Click Management */
  void setW_ClickCount_ID(int W_ClickCount_ID);

  I_W_ClickCount getW_ClickCount() throws RuntimeException;

  /** Get Web Click. Individual Web Click */
  int getW_Click_ID();

  /** Set Web Click. Individual Web Click */
  void setW_Click_ID(int W_Click_ID);

  /** Get W_Click_UU */
  String getW_Click_UU();

  /** Set W_Click_UU */
  void setW_Click_UU(String W_Click_UU);
}
