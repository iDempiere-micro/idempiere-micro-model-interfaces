package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for W_Basket
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_W_Basket {

  /** TableName=W_Basket */
  String Table_Name = "W_Basket";

  /** AD_Table_ID=402 */
  int Table_ID = 402;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name EMail */
  String COLUMNNAME_EMail = "EMail";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_PriceList_ID */
  String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
  /** Column name Session_ID */
  String COLUMNNAME_Session_ID = "Session_ID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name W_Basket_ID */
  String COLUMNNAME_W_Basket_ID = "W_Basket_ID";
  /** Column name W_Basket_UU */
  String COLUMNNAME_W_Basket_UU = "W_Basket_UU";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  I_AD_User getAD_User() throws RuntimeException;

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

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

  /** Get Price List. Unique identifier of a Price List */
  int getM_PriceList_ID();

  /** Set Price List. Unique identifier of a Price List */
  void setM_PriceList_ID(int M_PriceList_ID);

  I_M_PriceList getM_PriceList() throws RuntimeException;

  /** Get Session ID */
  int getSession_ID();

  /** Set Session ID */
  void setSession_ID(int Session_ID);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Basket. Web Basket */
  int getW_Basket_ID();

  /** Set Basket. Web Basket */
  void setW_Basket_ID(int W_Basket_ID);

  /** Get W_Basket_UU */
  String getW_Basket_UU();

  /** Set W_Basket_UU */
  void setW_Basket_UU(String W_Basket_UU);
}
