package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PA_ReportCube
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_ReportCube {

  /** TableName=PA_ReportCube */
  String Table_Name = "PA_ReportCube";

  /** AD_Table_ID=53202 */
  int Table_ID = 53202;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_Calendar_ID */
  String COLUMNNAME_C_Calendar_ID = "C_Calendar_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsActivityDim */
  String COLUMNNAME_IsActivityDim = "IsActivityDim";
  /** Column name IsBPartnerDim */
  String COLUMNNAME_IsBPartnerDim = "IsBPartnerDim";
  /** Column name IsCampaignDim */
  String COLUMNNAME_IsCampaignDim = "IsCampaignDim";
  /** Column name IsGLBudgetDim */
  String COLUMNNAME_IsGLBudgetDim = "IsGLBudgetDim";
  /** Column name IsLocFromDim */
  String COLUMNNAME_IsLocFromDim = "IsLocFromDim";
  /** Column name IsLocToDim */
  String COLUMNNAME_IsLocToDim = "IsLocToDim";
  /** Column name IsOrgTrxDim */
  String COLUMNNAME_IsOrgTrxDim = "IsOrgTrxDim";
  /** Column name IsProductDim */
  String COLUMNNAME_IsProductDim = "IsProductDim";
  /** Column name IsProjectDim */
  String COLUMNNAME_IsProjectDim = "IsProjectDim";
  /** Column name IsProjectPhaseDim */
  String COLUMNNAME_IsProjectPhaseDim = "IsProjectPhaseDim";
  /** Column name IsProjectTaskDim */
  String COLUMNNAME_IsProjectTaskDim = "IsProjectTaskDim";
  /** Column name IsSalesRegionDim */
  String COLUMNNAME_IsSalesRegionDim = "IsSalesRegionDim";
  /** Column name IsSubAcctDim */
  String COLUMNNAME_IsSubAcctDim = "IsSubAcctDim";
  /** Column name IsUser1Dim */
  String COLUMNNAME_IsUser1Dim = "IsUser1Dim";
  /** Column name IsUser2Dim */
  String COLUMNNAME_IsUser2Dim = "IsUser2Dim";
  /** Column name IsUserElement1Dim */
  String COLUMNNAME_IsUserElement1Dim = "IsUserElement1Dim";
  /** Column name IsUserElement2Dim */
  String COLUMNNAME_IsUserElement2Dim = "IsUserElement2Dim";
  /** Column name LastRecalculated */
  String COLUMNNAME_LastRecalculated = "LastRecalculated";
  /** Column name PA_ReportCube_ID */
  String COLUMNNAME_PA_ReportCube_ID = "PA_ReportCube_ID";
  /** Column name PA_ReportCube_UU */
  String COLUMNNAME_PA_ReportCube_UU = "PA_ReportCube_UU";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Calendar. Accounting Calendar Name */
  int getC_Calendar_ID();

  /** Set Calendar. Accounting Calendar Name */
  void setC_Calendar_ID(int C_Calendar_ID);

  I_C_Calendar getC_Calendar() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Activity Dimension. Include Activity as a cube dimension */
  void setIsActivityDim(boolean IsActivityDim);

  /** Get Activity Dimension. Include Activity as a cube dimension */
  boolean isActivityDim();

  /** Set Business Partner Dimension. Include Business Partner as a cube dimension */
  void setIsBPartnerDim(boolean IsBPartnerDim);

  /** Get Business Partner Dimension. Include Business Partner as a cube dimension */
  boolean isBPartnerDim();

  /** Set Campaign Dimension. Include Campaign as a cube dimension */
  void setIsCampaignDim(boolean IsCampaignDim);

  /** Get Campaign Dimension. Include Campaign as a cube dimension */
  boolean isCampaignDim();

  /** Set GL Budget Dimension. Include GL Budget as a cube dimension */
  void setIsGLBudgetDim(boolean IsGLBudgetDim);

  /** Get GL Budget Dimension. Include GL Budget as a cube dimension */
  boolean isGLBudgetDim();

  /** Set Location From Dimension. Include Location From as a cube dimension */
  void setIsLocFromDim(boolean IsLocFromDim);

  /** Get Location From Dimension. Include Location From as a cube dimension */
  boolean isLocFromDim();

  /** Set Location To Dimension. Include Location To as a cube dimension */
  void setIsLocToDim(boolean IsLocToDim);

  /** Get Location To Dimension. Include Location To as a cube dimension */
  boolean isLocToDim();

  /** Set OrgTrx Dimension. Include OrgTrx as a cube dimension */
  void setIsOrgTrxDim(boolean IsOrgTrxDim);

  /** Get OrgTrx Dimension. Include OrgTrx as a cube dimension */
  boolean isOrgTrxDim();

  /** Set Product Dimension. Include Product as a cube dimension */
  void setIsProductDim(boolean IsProductDim);

  /** Get Product Dimension. Include Product as a cube dimension */
  boolean isProductDim();

  /** Set Project Dimension. Include Project as a cube dimension */
  void setIsProjectDim(boolean IsProjectDim);

  /** Get Project Dimension. Include Project as a cube dimension */
  boolean isProjectDim();

  /** Set Project Phase Dimension. Include Project Phase as a cube dimension */
  void setIsProjectPhaseDim(boolean IsProjectPhaseDim);

  /** Get Project Phase Dimension. Include Project Phase as a cube dimension */
  boolean isProjectPhaseDim();

  /** Set Project Task Dimension. Include Project Task as a cube dimension */
  void setIsProjectTaskDim(boolean IsProjectTaskDim);

  /** Get Project Task Dimension. Include Project Task as a cube dimension */
  boolean isProjectTaskDim();

  /** Set Sales Region Dimension. Include Sales Region as a cube dimension */
  void setIsSalesRegionDim(boolean IsSalesRegionDim);

  /** Get Sales Region Dimension. Include Sales Region as a cube dimension */
  boolean isSalesRegionDim();

  /** Set Sub Acct Dimension. Include Sub Acct as a cube dimension */
  void setIsSubAcctDim(boolean IsSubAcctDim);

  /** Get Sub Acct Dimension. Include Sub Acct as a cube dimension */
  boolean isSubAcctDim();

  /** Set User Element List 1 Dimension. Include User Element List 1 as a cube dimension */
  void setIsUser1Dim(boolean IsUser1Dim);

  /** Get User Element List 1 Dimension. Include User Element List 1 as a cube dimension */
  boolean isUser1Dim();

  /** Set User Element List 2 Dimension. Include User Element List 2 as a cube dimension */
  void setIsUser2Dim(boolean IsUser2Dim);

  /** Get User Element List 2 Dimension. Include User Element List 2 as a cube dimension */
  boolean isUser2Dim();

  /** Set User Column 1 Dimension. Include User Element 1 as a cube dimension */
  void setIsUserElement1Dim(boolean IsUserElement1Dim);

  /** Get User Column 1 Dimension. Include User Element 1 as a cube dimension */
  boolean isUserElement1Dim();

  /** Set User Column 2 Dimension. Include User Element 2 as a cube dimension */
  void setIsUserElement2Dim(boolean IsUserElement2Dim);

  /** Get User Column 2 Dimension. Include User Element 2 as a cube dimension */
  boolean isUserElement2Dim();

  /** Get Last Recalculated. The time last recalculated. */
  Timestamp getLastRecalculated();

  /** Set Last Recalculated. The time last recalculated. */
  void setLastRecalculated(Timestamp LastRecalculated);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Report Cube. Define reporting cube for pre-calculation of summary accounting data. */
  int getPA_ReportCube_ID();

  /** Set Report Cube. Define reporting cube for pre-calculation of summary accounting data. */
  void setPA_ReportCube_ID(int PA_ReportCube_ID);

  /** Get PA_ReportCube_UU */
  String getPA_ReportCube_UU();

  /** Set PA_ReportCube_UU */
  void setPA_ReportCube_UU(String PA_ReportCube_UU);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
