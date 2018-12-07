package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PA_ReportSource
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_ReportSource {

  /** TableName=PA_ReportSource */
  String Table_Name = "PA_ReportSource";

  /** AD_Table_ID=450 */
  int Table_ID = 450;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

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
  /** Column name C_ElementValue_ID */
  String COLUMNNAME_C_ElementValue_ID = "C_ElementValue_ID";
  /** Column name C_Location_ID */
  String COLUMNNAME_C_Location_ID = "C_Location_ID";
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
  /** Column name ElementType */
  String COLUMNNAME_ElementType = "ElementType";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsIncludeNullsActivity */
  String COLUMNNAME_IsIncludeNullsActivity = "IsIncludeNullsActivity";
  /** Column name IsIncludeNullsBPartner */
  String COLUMNNAME_IsIncludeNullsBPartner = "IsIncludeNullsBPartner";
  /** Column name IsIncludeNullsCampaign */
  String COLUMNNAME_IsIncludeNullsCampaign = "IsIncludeNullsCampaign";
  /** Column name IsIncludeNullsElementValue */
  String COLUMNNAME_IsIncludeNullsElementValue = "IsIncludeNullsElementValue";
  /** Column name IsIncludeNullsLocation */
  String COLUMNNAME_IsIncludeNullsLocation = "IsIncludeNullsLocation";
  /** Column name IsIncludeNullsOrg */
  String COLUMNNAME_IsIncludeNullsOrg = "IsIncludeNullsOrg";
  /** Column name IsIncludeNullsOrgTrx */
  String COLUMNNAME_IsIncludeNullsOrgTrx = "IsIncludeNullsOrgTrx";
  /** Column name IsIncludeNullsProduct */
  String COLUMNNAME_IsIncludeNullsProduct = "IsIncludeNullsProduct";
  /** Column name IsIncludeNullsProject */
  String COLUMNNAME_IsIncludeNullsProject = "IsIncludeNullsProject";
  /** Column name IsIncludeNullsSalesRegion */
  String COLUMNNAME_IsIncludeNullsSalesRegion = "IsIncludeNullsSalesRegion";
  /** Column name IsIncludeNullsUserElement1 */
  String COLUMNNAME_IsIncludeNullsUserElement1 = "IsIncludeNullsUserElement1";
  /** Column name IsIncludeNullsUserElement2 */
  String COLUMNNAME_IsIncludeNullsUserElement2 = "IsIncludeNullsUserElement2";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name Org_ID */
  String COLUMNNAME_Org_ID = "Org_ID";
  /** Column name PA_ReportLine_ID */
  String COLUMNNAME_PA_ReportLine_ID = "PA_ReportLine_ID";
  /** Column name PA_ReportSource_ID */
  String COLUMNNAME_PA_ReportSource_ID = "PA_ReportSource_ID";
  /** Column name PA_ReportSource_UU */
  String COLUMNNAME_PA_ReportSource_UU = "PA_ReportSource_UU";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name UserElement1_ID */
  String COLUMNNAME_UserElement1_ID = "UserElement1_ID";
  /** Column name UserElement2_ID */
  String COLUMNNAME_UserElement2_ID = "UserElement2_ID";

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

  /** Get Account Element. Account Element */
  int getC_ElementValue_ID();

  /** Set Account Element. Account Element */
  void setC_ElementValue_ID(int C_ElementValue_ID);

  I_C_ElementValue getC_ElementValue() throws RuntimeException;

  /** Get Address. Location or Address */
  int getC_Location_ID();

  /** Set Address. Location or Address */
  void setC_Location_ID(int C_Location_ID);

  I_C_Location getC_Location() throws RuntimeException;

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

  /** Get Type. Element Type (account or user defined) */
  String getElementType();

  /** Set Type. Element Type (account or user defined) */
  void setElementType(String ElementType);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Include Nulls in Activity. Include nulls in the selection of the activity */
  void setIsIncludeNullsActivity(boolean IsIncludeNullsActivity);

  /** Get Include Nulls in Activity. Include nulls in the selection of the activity */
  boolean isIncludeNullsActivity();

  /** Set Include Nulls in BPartner. Include nulls in the selection of the business partner */
  void setIsIncludeNullsBPartner(boolean IsIncludeNullsBPartner);

  /** Get Include Nulls in BPartner. Include nulls in the selection of the business partner */
  boolean isIncludeNullsBPartner();

  /** Set Include Nulls in Campaign. Include nulls in the selection of the campaign */
  void setIsIncludeNullsCampaign(boolean IsIncludeNullsCampaign);

  /** Get Include Nulls in Campaign. Include nulls in the selection of the campaign */
  boolean isIncludeNullsCampaign();

  /** Set Include Nulls in Account. Include nulls in the selection of the account */
  void setIsIncludeNullsElementValue(boolean IsIncludeNullsElementValue);

  /** Get Include Nulls in Account. Include nulls in the selection of the account */
  boolean isIncludeNullsElementValue();

  /** Set Include Nulls in Location. Include nulls in the selection of the location */
  void setIsIncludeNullsLocation(boolean IsIncludeNullsLocation);

  /** Get Include Nulls in Location. Include nulls in the selection of the location */
  boolean isIncludeNullsLocation();

  /** Set Include Nulls in Org. Include nulls in the selection of the organization */
  void setIsIncludeNullsOrg(boolean IsIncludeNullsOrg);

  /** Get Include Nulls in Org. Include nulls in the selection of the organization */
  boolean isIncludeNullsOrg();

  /**
   * Set Include Nulls in Org Trx. Include nulls in the selection of the organization transaction
   */
  void setIsIncludeNullsOrgTrx(boolean IsIncludeNullsOrgTrx);

  /**
   * Get Include Nulls in Org Trx. Include nulls in the selection of the organization transaction
   */
  boolean isIncludeNullsOrgTrx();

  /** Set Include Nulls in Product. Include nulls in the selection of the product */
  void setIsIncludeNullsProduct(boolean IsIncludeNullsProduct);

  /** Get Include Nulls in Product. Include nulls in the selection of the product */
  boolean isIncludeNullsProduct();

  /** Set Include Nulls in Project. Include nulls in the selection of the project */
  void setIsIncludeNullsProject(boolean IsIncludeNullsProject);

  /** Get Include Nulls in Project. Include nulls in the selection of the project */
  boolean isIncludeNullsProject();

  /** Set Include Nulls in Sales Region. Include nulls in the selection of the sales region */
  void setIsIncludeNullsSalesRegion(boolean IsIncludeNullsSalesRegion);

  /** Get Include Nulls in Sales Region. Include nulls in the selection of the sales region */
  boolean isIncludeNullsSalesRegion();

  /** Set Include Nulls in User Element 1. Include nulls in the selection of the user element 1 */
  void setIsIncludeNullsUserElement1(boolean IsIncludeNullsUserElement1);

  /** Get Include Nulls in User Element 1. Include nulls in the selection of the user element 1 */
  boolean isIncludeNullsUserElement1();

  /** Set Include Nulls in User Element 2. Include nulls in the selection of the user element 2 */
  void setIsIncludeNullsUserElement2(boolean IsIncludeNullsUserElement2);

  /** Get Include Nulls in User Element 2. Include nulls in the selection of the user element 2 */
  boolean isIncludeNullsUserElement2();

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Organization. Organizational entity within client */
  int getOrg_ID();

  /** Set Organization. Organizational entity within client */
  void setOrg_ID(int Org_ID);

  /** Get Report Line */
  int getPA_ReportLine_ID();

  /** Set Report Line */
  void setPA_ReportLine_ID(int PA_ReportLine_ID);

  I_PA_ReportLine getPA_ReportLine() throws RuntimeException;

  /** Get Report Source. Restriction of what will be shown in Report Line */
  int getPA_ReportSource_ID();

  /** Set Report Source. Restriction of what will be shown in Report Line */
  void setPA_ReportSource_ID(int PA_ReportSource_ID);

  /** Get PA_ReportSource_UU */
  String getPA_ReportSource_UU();

  /** Set PA_ReportSource_UU */
  void setPA_ReportSource_UU(String PA_ReportSource_UU);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get User Column 1. User defined accounting Element */
  int getUserElement1_ID();

  /** Set User Column 1. User defined accounting Element */
  void setUserElement1_ID(int UserElement1_ID);

  /** Get User Column 2. User defined accounting Element */
  int getUserElement2_ID();

  /** Set User Column 2. User defined accounting Element */
  void setUserElement2_ID(int UserElement2_ID);
}
