package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for GL_DistributionLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_GL_DistributionLine {

  /** TableName=GL_DistributionLine */
  String Table_Name = "GL_DistributionLine";

  /** AD_Table_ID=707 */
  int Table_ID = 707;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name Account_ID */
  String COLUMNNAME_Account_ID = "Account_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_OrgTrx_ID */
  String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
  /** Column name C_Activity_ID */
  String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_Campaign_ID */
  String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
  /** Column name C_LocFrom_ID */
  String COLUMNNAME_C_LocFrom_ID = "C_LocFrom_ID";
  /** Column name C_LocTo_ID */
  String COLUMNNAME_C_LocTo_ID = "C_LocTo_ID";
  /** Column name C_Project_ID */
  String COLUMNNAME_C_Project_ID = "C_Project_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_SalesRegion_ID */
  String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name GL_Distribution_ID */
  String COLUMNNAME_GL_Distribution_ID = "GL_Distribution_ID";
  /** Column name GL_DistributionLine_ID */
  String COLUMNNAME_GL_DistributionLine_ID = "GL_DistributionLine_ID";
  /** Column name GL_DistributionLine_UU */
  String COLUMNNAME_GL_DistributionLine_UU = "GL_DistributionLine_UU";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Line */
  String COLUMNNAME_Line = "Line";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name Org_ID */
  String COLUMNNAME_Org_ID = "Org_ID";
  /** Column name OverwriteAcct */
  String COLUMNNAME_OverwriteAcct = "OverwriteAcct";
  /** Column name OverwriteActivity */
  String COLUMNNAME_OverwriteActivity = "OverwriteActivity";
  /** Column name OverwriteBPartner */
  String COLUMNNAME_OverwriteBPartner = "OverwriteBPartner";
  /** Column name OverwriteCampaign */
  String COLUMNNAME_OverwriteCampaign = "OverwriteCampaign";
  /** Column name OverwriteLocFrom */
  String COLUMNNAME_OverwriteLocFrom = "OverwriteLocFrom";
  /** Column name OverwriteLocTo */
  String COLUMNNAME_OverwriteLocTo = "OverwriteLocTo";
  /** Column name OverwriteOrg */
  String COLUMNNAME_OverwriteOrg = "OverwriteOrg";
  /** Column name OverwriteOrgTrx */
  String COLUMNNAME_OverwriteOrgTrx = "OverwriteOrgTrx";
  /** Column name OverwriteProduct */
  String COLUMNNAME_OverwriteProduct = "OverwriteProduct";
  /** Column name OverwriteProject */
  String COLUMNNAME_OverwriteProject = "OverwriteProject";
  /** Column name OverwriteSalesRegion */
  String COLUMNNAME_OverwriteSalesRegion = "OverwriteSalesRegion";
  /** Column name OverwriteUser1 */
  String COLUMNNAME_OverwriteUser1 = "OverwriteUser1";
  /** Column name OverwriteUser2 */
  String COLUMNNAME_OverwriteUser2 = "OverwriteUser2";
  /** Column name Percent */
  String COLUMNNAME_Percent = "Percent";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name User1_ID */
  String COLUMNNAME_User1_ID = "User1_ID";
  /** Column name User2_ID */
  String COLUMNNAME_User2_ID = "User2_ID";

  /** Get Account. Account used */
  int getAccount_ID();

  /** Set Account. Account used */
  void setAccount_ID(int Account_ID);

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Trx Organization. Performing or initiating organization */
  int getAD_OrgTrx_ID();

  /** Set Trx Organization. Performing or initiating organization */
  void setAD_OrgTrx_ID(int AD_OrgTrx_ID);

  /** Get Activity. Business Activity */
  int getC_Activity_ID();

  /** Set Activity. Business Activity */
  void setC_Activity_ID(int C_Activity_ID);

  I_C_Activity getC_Activity() throws RuntimeException;

  /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

  I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Campaign. Marketing Campaign */
  int getC_Campaign_ID();

  /** Set Campaign. Marketing Campaign */
  void setC_Campaign_ID(int C_Campaign_ID);

  I_C_Campaign getC_Campaign() throws RuntimeException;

  /** Get Location From. Location that inventory was moved from */
  int getC_LocFrom_ID();

  /** Set Location From. Location that inventory was moved from */
  void setC_LocFrom_ID(int C_LocFrom_ID);

  I_C_Location getC_LocFrom() throws RuntimeException;

  /** Get Location To. Location that inventory was moved to */
  int getC_LocTo_ID();

  /** Set Location To. Location that inventory was moved to */
  void setC_LocTo_ID(int C_LocTo_ID);

  I_C_Location getC_LocTo() throws RuntimeException;

  /** Get Project. Financial Project */
  int getC_Project_ID();

  /** Set Project. Financial Project */
  void setC_Project_ID(int C_Project_ID);

  I_C_Project getC_Project() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Sales Region. Sales coverage region */
  int getC_SalesRegion_ID();

  /** Set Sales Region. Sales coverage region */
  void setC_SalesRegion_ID(int C_SalesRegion_ID);

  I_C_SalesRegion getC_SalesRegion() throws RuntimeException;

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get GL Distribution. General Ledger Distribution */
  int getGL_Distribution_ID();

  /** Set GL Distribution. General Ledger Distribution */
  void setGL_Distribution_ID(int GL_Distribution_ID);

  I_GL_Distribution getGL_Distribution() throws RuntimeException;

  /** Get GL Distribution Line. General Ledger Distribution Line */
  int getGL_DistributionLine_ID();

  /** Set GL Distribution Line. General Ledger Distribution Line */
  void setGL_DistributionLine_ID(int GL_DistributionLine_ID);

  /** Get GL_DistributionLine_UU */
  String getGL_DistributionLine_UU();

  /** Set GL_DistributionLine_UU */
  void setGL_DistributionLine_UU(String GL_DistributionLine_UU);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Line No. Unique line for this document */
  int getLine();

  /** Set Line No. Unique line for this document */
  void setLine(int Line);

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Organization. Organizational entity within client */
  int getOrg_ID();

  /** Set Organization. Organizational entity within client */
  void setOrg_ID(int Org_ID);

  /** Get Overwrite Account. Overwrite the account segment Account with the value specified */
  boolean isOverwriteAcct();

  /** Set Overwrite Account. Overwrite the account segment Account with the value specified */
  void setOverwriteAcct(boolean OverwriteAcct);

  /** Get Overwrite Activity. Overwrite the account segment Activity with the value specified */
  boolean isOverwriteActivity();

  /** Set Overwrite Activity. Overwrite the account segment Activity with the value specified */
  void setOverwriteActivity(boolean OverwriteActivity);

  /**
   * Get Overwrite Bus.Partner. Overwrite the account segment Business Partner with the value
   * specified
   */
  boolean isOverwriteBPartner();

  /**
   * Set Overwrite Bus.Partner. Overwrite the account segment Business Partner with the value
   * specified
   */
  void setOverwriteBPartner(boolean OverwriteBPartner);

  /** Get Overwrite Campaign. Overwrite the account segment Campaign with the value specified */
  boolean isOverwriteCampaign();

  /** Set Overwrite Campaign. Overwrite the account segment Campaign with the value specified */
  void setOverwriteCampaign(boolean OverwriteCampaign);

  /**
   * Get Overwrite Location From. Overwrite the account segment Location From with the value
   * specified
   */
  boolean isOverwriteLocFrom();

  /**
   * Set Overwrite Location From. Overwrite the account segment Location From with the value
   * specified
   */
  void setOverwriteLocFrom(boolean OverwriteLocFrom);

  /**
   * Get Overwrite Location To. Overwrite the account segment Location From with the value specified
   */
  boolean isOverwriteLocTo();

  /**
   * Set Overwrite Location To. Overwrite the account segment Location From with the value specified
   */
  void setOverwriteLocTo(boolean OverwriteLocTo);

  /**
   * Get Overwrite Organization. Overwrite the account segment Organization with the value specified
   */
  boolean isOverwriteOrg();

  /**
   * Set Overwrite Organization. Overwrite the account segment Organization with the value specified
   */
  void setOverwriteOrg(boolean OverwriteOrg);

  /**
   * Get Overwrite Trx Organuzation. Overwrite the account segment Transaction Organization with the
   * value specified
   */
  boolean isOverwriteOrgTrx();

  /**
   * Set Overwrite Trx Organuzation. Overwrite the account segment Transaction Organization with the
   * value specified
   */
  void setOverwriteOrgTrx(boolean OverwriteOrgTrx);

  /** Get Overwrite Product. Overwrite the account segment Product with the value specified */
  boolean isOverwriteProduct();

  /** Set Overwrite Product. Overwrite the account segment Product with the value specified */
  void setOverwriteProduct(boolean OverwriteProduct);

  /** Get Overwrite Project. Overwrite the account segment Project with the value specified */
  boolean isOverwriteProject();

  /** Set Overwrite Project. Overwrite the account segment Project with the value specified */
  void setOverwriteProject(boolean OverwriteProject);

  /**
   * Get Overwrite Sales Region. Overwrite the account segment Sales Region with the value specified
   */
  boolean isOverwriteSalesRegion();

  /**
   * Set Overwrite Sales Region. Overwrite the account segment Sales Region with the value specified
   */
  void setOverwriteSalesRegion(boolean OverwriteSalesRegion);

  /** Get Overwrite User1. Overwrite the account segment User 1 with the value specified */
  boolean isOverwriteUser1();

  /** Set Overwrite User1. Overwrite the account segment User 1 with the value specified */
  void setOverwriteUser1(boolean OverwriteUser1);

  /** Get Overwrite User2. Overwrite the account segment User 2 with the value specified */
  boolean isOverwriteUser2();

  /** Set Overwrite User2. Overwrite the account segment User 2 with the value specified */
  void setOverwriteUser2(boolean OverwriteUser2);

  /** Get Percent. Percentage */
  BigDecimal getPercent();

  /** Set Percent. Percentage */
  void setPercent(BigDecimal Percent);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get User Element List 1. User defined list element #1 */
  int getUser1_ID();

  /** Set User Element List 1. User defined list element #1 */
  void setUser1_ID(int User1_ID);

  I_C_ElementValue getUser1() throws RuntimeException;

  /** Get User Element List 2. User defined list element #2 */
  int getUser2_ID();

  /** Set User Element List 2. User defined list element #2 */
  void setUser2_ID(int User2_ID);

  I_C_ElementValue getUser2() throws RuntimeException;
}
