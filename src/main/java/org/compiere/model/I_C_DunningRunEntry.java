package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_DunningRunEntry
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_DunningRunEntry {

  /** TableName=C_DunningRunEntry */
  String Table_Name = "C_DunningRunEntry";

  /** AD_Table_ID=527 */
  int Table_ID = 527;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name Amt */
  String COLUMNNAME_Amt = "Amt";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BPartner_Location_ID */
  String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
  /** Column name C_Currency_ID */
  String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
  /** Column name C_DunningLevel_ID */
  String COLUMNNAME_C_DunningLevel_ID = "C_DunningLevel_ID";
  /** Column name C_DunningRunEntry_ID */
  String COLUMNNAME_C_DunningRunEntry_ID = "C_DunningRunEntry_ID";
  /** Column name C_DunningRunEntry_UU */
  String COLUMNNAME_C_DunningRunEntry_UU = "C_DunningRunEntry_UU";
  /** Column name C_DunningRun_ID */
  String COLUMNNAME_C_DunningRun_ID = "C_DunningRun_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Note */
  String COLUMNNAME_Note = "Note";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Qty */
  String COLUMNNAME_Qty = "Qty";
  /** Column name SalesRep_ID */
  String COLUMNNAME_SalesRep_ID = "SalesRep_ID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  I_AD_User getAD_User() throws RuntimeException;

  /** Get Amount. Amount */
  BigDecimal getAmt();

  /** Set Amount. Amount */
  void setAmt(BigDecimal Amt);

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Partner Location. Identifies the (ship to) address for this Business Partner */
  int getC_BPartner_Location_ID();

  /** Set Partner Location. Identifies the (ship to) address for this Business Partner */
  void setC_BPartner_Location_ID(int C_BPartner_Location_ID);

  I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException;

  /** Get Currency. The Currency for this record */
  int getC_Currency_ID();

  /** Set Currency. The Currency for this record */
  void setC_Currency_ID(int C_Currency_ID);

  I_C_Currency getC_Currency() throws RuntimeException;

  /** Get Dunning Level */
  int getC_DunningLevel_ID();

  /** Set Dunning Level */
  void setC_DunningLevel_ID(int C_DunningLevel_ID);

  I_C_DunningLevel getC_DunningLevel() throws RuntimeException;

  /** Get Dunning Run Entry. Dunning Run Entry */
  int getC_DunningRunEntry_ID();

  /** Set Dunning Run Entry. Dunning Run Entry */
  void setC_DunningRunEntry_ID(int C_DunningRunEntry_ID);

  /** Get C_DunningRunEntry_UU */
  String getC_DunningRunEntry_UU();

  /** Set C_DunningRunEntry_UU */
  void setC_DunningRunEntry_UU(String C_DunningRunEntry_UU);

  /** Get Dunning Run. Dunning Run */
  int getC_DunningRun_ID();

  /** Set Dunning Run. Dunning Run */
  void setC_DunningRun_ID(int C_DunningRun_ID);

  I_C_DunningRun getC_DunningRun() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Note. Optional additional user defined information */
  String getNote();

  /** Set Note. Optional additional user defined information */
  void setNote(String Note);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Quantity. Quantity */
  BigDecimal getQty();

  /** Set Quantity. Quantity */
  void setQty(BigDecimal Qty);

  /** Get Sales Representative. Sales Representative or Company Agent */
  int getSalesRep_ID();

  /** Set Sales Representative. Sales Representative or Company Agent */
  void setSalesRep_ID(int SalesRep_ID);

  I_AD_User getSalesRep() throws RuntimeException;

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
