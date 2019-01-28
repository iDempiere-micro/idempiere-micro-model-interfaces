package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for GL_Distribution
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_GL_Distribution {

  /** TableName=GL_Distribution */
  String Table_Name = "GL_Distribution";

  /** AD_Table_ID=708 */
  int Table_ID = 708;

    /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name Account_ID */
  String COLUMNNAME_Account_ID = "Account_ID";
    /** Column name AD_OrgTrx_ID */
  String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
  /** Column name AnyAcct */
  String COLUMNNAME_AnyAcct = "AnyAcct";
  /** Column name AnyActivity */
  String COLUMNNAME_AnyActivity = "AnyActivity";
  /** Column name AnyBPartner */
  String COLUMNNAME_AnyBPartner = "AnyBPartner";
  /** Column name AnyCampaign */
  String COLUMNNAME_AnyCampaign = "AnyCampaign";
  /** Column name AnyLocFrom */
  String COLUMNNAME_AnyLocFrom = "AnyLocFrom";
  /** Column name AnyLocTo */
  String COLUMNNAME_AnyLocTo = "AnyLocTo";
  /** Column name AnyOrg */
  String COLUMNNAME_AnyOrg = "AnyOrg";
  /** Column name AnyOrgTrx */
  String COLUMNNAME_AnyOrgTrx = "AnyOrgTrx";
  /** Column name AnyProduct */
  String COLUMNNAME_AnyProduct = "AnyProduct";
  /** Column name AnyProject */
  String COLUMNNAME_AnyProject = "AnyProject";
  /** Column name AnySalesRegion */
  String COLUMNNAME_AnySalesRegion = "AnySalesRegion";
  /** Column name AnyUser1 */
  String COLUMNNAME_AnyUser1 = "AnyUser1";
  /** Column name AnyUser2 */
  String COLUMNNAME_AnyUser2 = "AnyUser2";
  /** Column name C_AcctSchema_ID */
  String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
  /** Column name C_Activity_ID */
  String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_Campaign_ID */
  String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
  /** Column name C_DocType_ID */
  String COLUMNNAME_C_DocType_ID = "C_DocType_ID";
  /** Column name C_LocFrom_ID */
  String COLUMNNAME_C_LocFrom_ID = "C_LocFrom_ID";
  /** Column name C_LocTo_ID */
  String COLUMNNAME_C_LocTo_ID = "C_LocTo_ID";
  /** Column name C_Project_ID */
  String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /** Column name C_SalesRegion_ID */
  String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name GL_Distribution_ID */
  String COLUMNNAME_GL_Distribution_ID = "GL_Distribution_ID";
  /** Column name GL_Distribution_UU */
  String COLUMNNAME_GL_Distribution_UU = "GL_Distribution_UU";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
    /** Column name IsCreateReversal */
  String COLUMNNAME_IsCreateReversal = "IsCreateReversal";
  /** Column name IsValid */
  String COLUMNNAME_IsValid = "IsValid";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name Org_ID */
  String COLUMNNAME_Org_ID = "Org_ID";
  /** Column name PercentTotal */
  String COLUMNNAME_PercentTotal = "PercentTotal";
  /** Column name PostingType */
  String COLUMNNAME_PostingType = "PostingType";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
    /** Column name User1_ID */
  String COLUMNNAME_User1_ID = "User1_ID";
  /** Column name User2_ID */
  String COLUMNNAME_User2_ID = "User2_ID";

  /** Get Account. Account used */
  int getAccount_ID();

  /** Set Account. Account used */
  void setAccount_ID(int Account_ID);

    /** Get Trx Organization. Performing or initiating organization */
  int getAD_OrgTrx_ID();

  /** Set Trx Organization. Performing or initiating organization */
  void setAD_OrgTrx_ID(int AD_OrgTrx_ID);

  /** Get Any Account. Match any value of the Account segment */
  boolean isAnyAcct();

  /** Set Any Account. Match any value of the Account segment */
  void setAnyAcct(boolean AnyAcct);

  /** Get Any Activity. Match any value of the Activity segment */
  boolean isAnyActivity();

  /** Set Any Activity. Match any value of the Activity segment */
  void setAnyActivity(boolean AnyActivity);

  /** Get Any Bus.Partner. Match any value of the Business Partner segment */
  boolean isAnyBPartner();

  /** Set Any Bus.Partner. Match any value of the Business Partner segment */
  void setAnyBPartner(boolean AnyBPartner);

  /** Get Any Campaign. Match any value of the Campaign segment */
  boolean isAnyCampaign();

  /** Set Any Campaign. Match any value of the Campaign segment */
  void setAnyCampaign(boolean AnyCampaign);

  /** Get Any Location From. Match any value of the Location From segment */
  boolean isAnyLocFrom();

  /** Set Any Location From. Match any value of the Location From segment */
  void setAnyLocFrom(boolean AnyLocFrom);

  /** Get Any Location To. Match any value of the Location To segment */
  boolean isAnyLocTo();

  /** Set Any Location To. Match any value of the Location To segment */
  void setAnyLocTo(boolean AnyLocTo);

  /** Get Any Organization. Match any value of the Organization segment */
  boolean isAnyOrg();

  /** Set Any Organization. Match any value of the Organization segment */
  void setAnyOrg(boolean AnyOrg);

  /** Get Any Trx Organization. Match any value of the Transaction Organization segment */
  boolean isAnyOrgTrx();

  /** Set Any Trx Organization. Match any value of the Transaction Organization segment */
  void setAnyOrgTrx(boolean AnyOrgTrx);

  /** Get Any Product. Match any value of the Product segment */
  boolean isAnyProduct();

  /** Set Any Product. Match any value of the Product segment */
  void setAnyProduct(boolean AnyProduct);

  /** Get Any Project. Match any value of the Project segment */
  boolean isAnyProject();

  /** Set Any Project. Match any value of the Project segment */
  void setAnyProject(boolean AnyProject);

  /** Get Any Sales Region. Match any value of the Sales Region segment */
  boolean isAnySalesRegion();

  /** Set Any Sales Region. Match any value of the Sales Region segment */
  void setAnySalesRegion(boolean AnySalesRegion);

  /** Get Any User 1. Match any value of the User 1 segment */
  boolean isAnyUser1();

  /** Set Any User 1. Match any value of the User 1 segment */
  void setAnyUser1(boolean AnyUser1);

  /** Get Any User 2. Match any value of the User 2 segment */
  boolean isAnyUser2();

  /** Set Any User 2. Match any value of the User 2 segment */
  void setAnyUser2(boolean AnyUser2);

  /** Get Accounting Schema. Rules for accounting */
  int getC_AcctSchema_ID();

    /** Get Activity. Business Activity */
  int getC_Activity_ID();

  /** Set Activity. Business Activity */
  void setC_Activity_ID(int C_Activity_ID);

    /** Get Business Partner . Identifies a Business Partner */
  int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  void setC_BPartner_ID(int C_BPartner_ID);

    /** Get Campaign. Marketing Campaign */
  int getC_Campaign_ID();

  /** Set Campaign. Marketing Campaign */
  void setC_Campaign_ID(int C_Campaign_ID);

    /** Get Document Type. Document type or rules */
  int getC_DocType_ID();

    /** Get Location From. Location that inventory was moved from */
  int getC_LocFrom_ID();

  /** Set Location From. Location that inventory was moved from */
  void setC_LocFrom_ID(int C_LocFrom_ID);

    /** Get Location To. Location that inventory was moved to */
  int getC_LocTo_ID();

  /** Set Location To. Location that inventory was moved to */
  void setC_LocTo_ID(int C_LocTo_ID);

    /** Get Project. Financial Project */
  int getC_Project_ID();

  /** Set Project. Financial Project */
  void setC_Project_ID(int C_Project_ID);

    /** Get Sales Region. Sales coverage region */
  int getC_SalesRegion_ID();

  /** Set Sales Region. Sales coverage region */
  void setC_SalesRegion_ID(int C_SalesRegion_ID);

    /** Get GL Distribution. General Ledger Distribution */
  int getGL_Distribution_ID();

    /**
   * Get Create Reversal. Indicates that reversal movement will be created, if disabled the original
   * movement will be deleted.
   */
  boolean isCreateReversal();

  /** Set Valid. Element is valid */
  void setIsValid(boolean IsValid);

  /** Get Valid. Element is valid */
  boolean isValid();

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

    /** Get Organization. Organizational entity within client */
  int getOrg_ID();

  /** Set Organization. Organizational entity within client */
  void setOrg_ID(int Org_ID);

  /** Get Total Percent. Sum of the Percent details */
  BigDecimal getPercentTotal();

  /** Set Total Percent. Sum of the Percent details */
  void setPercentTotal(BigDecimal PercentTotal);

  /** Get PostingType. The type of posted amount for the transaction */
  String getPostingType();

    /** Get User Element List 1. User defined list element #1 */
  int getUser1_ID();

  /** Set User Element List 1. User defined list element #1 */
  void setUser1_ID(int User1_ID);

    /** Get User Element List 2. User defined list element #2 */
  int getUser2_ID();

  /** Set User Element List 2. User defined list element #2 */
  void setUser2_ID(int User2_ID);

}
