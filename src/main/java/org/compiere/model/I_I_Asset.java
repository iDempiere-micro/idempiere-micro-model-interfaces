package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for I_Asset
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_I_Asset {

  /** TableName=I_Asset */
  String Table_Name = "I_Asset";

  /** AD_Table_ID=53139 */
  int Table_ID = 53139;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 7 - System - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(7);

  /** Load Meta Data */

  /** Column name A_Accumdepreciation_Acct */
  String COLUMNNAME_A_Accumdepreciation_Acct = "A_Accumdepreciation_Acct";
  /** Column name A_Accumulated_Depr */
  String COLUMNNAME_A_Accumulated_Depr = "A_Accumulated_Depr";
  /** Column name A_Asset_Acct */
  String COLUMNNAME_A_Asset_Acct = "A_Asset_Acct";
  /** Column name A_Asset_Cost */
  String COLUMNNAME_A_Asset_Cost = "A_Asset_Cost";
  /** Column name A_Asset_Group_ID */
  String COLUMNNAME_A_Asset_Group_ID = "A_Asset_Group_ID";
  /** Column name A_Asset_ID */
  String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
  /** Column name A_Asset_Life_Current_Year */
  String COLUMNNAME_A_Asset_Life_Current_Year = "A_Asset_Life_Current_Year";
  /** Column name A_Asset_Life_Years */
  String COLUMNNAME_A_Asset_Life_Years = "A_Asset_Life_Years";
  /** Column name A_Asset_Spread_Type */
  String COLUMNNAME_A_Asset_Spread_Type = "A_Asset_Spread_Type";
  /** Column name A_Base_Amount */
  String COLUMNNAME_A_Base_Amount = "A_Base_Amount";
  /** Column name A_Calc_Accumulated_Depr */
  String COLUMNNAME_A_Calc_Accumulated_Depr = "A_Calc_Accumulated_Depr";
  /** Column name A_Curr_Dep_Exp */
  String COLUMNNAME_A_Curr_Dep_Exp = "A_Curr_Dep_Exp";
  /** Column name A_Current_Period */
  String COLUMNNAME_A_Current_Period = "A_Current_Period";
  /** Column name A_Depreciation_Acct */
  String COLUMNNAME_A_Depreciation_Acct = "A_Depreciation_Acct";
  /** Column name A_Depreciation_Calc_Type */
  String COLUMNNAME_A_Depreciation_Calc_Type = "A_Depreciation_Calc_Type";
  /** Column name A_Depreciation_Manual_Amount */
  String COLUMNNAME_A_Depreciation_Manual_Amount = "A_Depreciation_Manual_Amount";
  /** Column name A_Depreciation_Manual_Period */
  String COLUMNNAME_A_Depreciation_Manual_Period = "A_Depreciation_Manual_Period";
  /** Column name A_Depreciation_Table_Header_ID */
  String COLUMNNAME_A_Depreciation_Table_Header_ID = "A_Depreciation_Table_Header_ID";
  /** Column name A_Depreciation_Variable_Perc */
  String COLUMNNAME_A_Depreciation_Variable_Perc = "A_Depreciation_Variable_Perc";
  /** Column name A_Disposal_Loss */
  String COLUMNNAME_A_Disposal_Loss = "A_Disposal_Loss";
  /** Column name A_Disposal_Revenue */
  String COLUMNNAME_A_Disposal_Revenue = "A_Disposal_Revenue";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_User_ID */
  String COLUMNNAME_AD_User_ID = "AD_User_ID";
  /** Column name A_Life_Period */
  String COLUMNNAME_A_Life_Period = "A_Life_Period";
  /** Column name A_Parent_Asset_ID */
  String COLUMNNAME_A_Parent_Asset_ID = "A_Parent_Asset_ID";
  /** Column name A_Period_End */
  String COLUMNNAME_A_Period_End = "A_Period_End";
  /** Column name A_Period_Posted */
  String COLUMNNAME_A_Period_Posted = "A_Period_Posted";
  /** Column name A_Period_Start */
  String COLUMNNAME_A_Period_Start = "A_Period_Start";
  /** Column name A_Prior_Year_Accumulated_Depr */
  String COLUMNNAME_A_Prior_Year_Accumulated_Depr = "A_Prior_Year_Accumulated_Depr";
  /** Column name A_QTY_Current */
  String COLUMNNAME_A_QTY_Current = "A_QTY_Current";
  /** Column name A_QTY_Original */
  String COLUMNNAME_A_QTY_Original = "A_QTY_Original";
  /** Column name A_Reval_Accumdep_Offset_Cur */
  String COLUMNNAME_A_Reval_Accumdep_Offset_Cur = "A_Reval_Accumdep_Offset_Cur";
  /** Column name A_Reval_Accumdep_Offset_Prior */
  String COLUMNNAME_A_Reval_Accumdep_Offset_Prior = "A_Reval_Accumdep_Offset_Prior";
  /** Column name A_Reval_Cal_Method */
  String COLUMNNAME_A_Reval_Cal_Method = "A_Reval_Cal_Method";
  /** Column name A_Reval_Cost_Offset */
  String COLUMNNAME_A_Reval_Cost_Offset = "A_Reval_Cost_Offset";
  /** Column name A_Reval_Cost_Offset_Prior */
  String COLUMNNAME_A_Reval_Cost_Offset_Prior = "A_Reval_Cost_Offset_Prior";
  /** Column name A_Reval_Depexp_Offset */
  String COLUMNNAME_A_Reval_Depexp_Offset = "A_Reval_Depexp_Offset";
  /** Column name A_Salvage_Value */
  String COLUMNNAME_A_Salvage_Value = "A_Salvage_Value";
  /** Column name A_Split_Percent */
  String COLUMNNAME_A_Split_Percent = "A_Split_Percent";
  /** Column name AssetDepreciationDate */
  String COLUMNNAME_AssetDepreciationDate = "AssetDepreciationDate";
  /** Column name AssetDisposalDate */
  String COLUMNNAME_AssetDisposalDate = "AssetDisposalDate";
  /** Column name AssetMarketValueAmt */
  String COLUMNNAME_AssetMarketValueAmt = "AssetMarketValueAmt";
  /** Column name AssetServiceDate */
  String COLUMNNAME_AssetServiceDate = "AssetServiceDate";
  /** Column name C_AcctSchema_ID */
  String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
  /** Column name C_BPartner_ID */
  String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BPartner_Location_ID */
  String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";
  /** Column name C_Location_ID */
  String COLUMNNAME_C_Location_ID = "C_Location_ID";
  /** Column name ConventionType */
  String COLUMNNAME_ConventionType = "ConventionType";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name DepreciationType */
  String COLUMNNAME_DepreciationType = "DepreciationType";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name GuaranteeDate */
  String COLUMNNAME_GuaranteeDate = "GuaranteeDate";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name I_Asset_ID */
  String COLUMNNAME_I_Asset_ID = "I_Asset_ID";
  /** Column name I_Asset_UU */
  String COLUMNNAME_I_Asset_UU = "I_Asset_UU";
  /** Column name I_ErrorMsg */
  String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
  /** Column name I_IsImported */
  String COLUMNNAME_I_IsImported = "I_IsImported";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsDepreciated */
  String COLUMNNAME_IsDepreciated = "IsDepreciated";
  /** Column name IsDisposed */
  String COLUMNNAME_IsDisposed = "IsDisposed";
  /** Column name IsFullyDepreciated */
  String COLUMNNAME_IsFullyDepreciated = "IsFullyDepreciated";
  /** Column name IsInPosession */
  String COLUMNNAME_IsInPosession = "IsInPosession";
  /** Column name IsOwned */
  String COLUMNNAME_IsOwned = "IsOwned";
  /** Column name LifeUseUnits */
  String COLUMNNAME_LifeUseUnits = "LifeUseUnits";
  /** Column name LocationComment */
  String COLUMNNAME_LocationComment = "LocationComment";
  /** Column name Lot */
  String COLUMNNAME_Lot = "Lot";
  /** Column name M_AttributeSetInstance_ID */
  String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
  /** Column name M_Locator_ID */
  String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name PostingType */
  String COLUMNNAME_PostingType = "PostingType";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name SerNo */
  String COLUMNNAME_SerNo = "SerNo";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name UseLifeMonths */
  String COLUMNNAME_UseLifeMonths = "UseLifeMonths";
  /** Column name UseLifeYears */
  String COLUMNNAME_UseLifeYears = "UseLifeYears";
  /** Column name UseUnits */
  String COLUMNNAME_UseUnits = "UseUnits";
  /** Column name Value */
  String COLUMNNAME_Value = "Value";
  /** Column name VersionNo */
  String COLUMNNAME_VersionNo = "VersionNo";

  /** Get Accumulated Depreciation Account */
  int getA_Accumdepreciation_Acct();

  /** Set Accumulated Depreciation Account */
  void setA_Accumdepreciation_Acct(int A_Accumdepreciation_Acct);

  I_C_ValidCombination getA_Accumdepreciation_A() throws RuntimeException;

  /** Get Accumulated Depreciation */
  BigDecimal getA_Accumulated_Depr();

  /** Set Accumulated Depreciation */
  void setA_Accumulated_Depr(BigDecimal A_Accumulated_Depr);

  /** Get Asset Acct */
  int getA_Asset_Acct();

  /** Set Asset Acct */
  void setA_Asset_Acct(int A_Asset_Acct);

  I_C_ValidCombination getA_Asset_A() throws RuntimeException;

  /** Get Asset Cost */
  BigDecimal getA_Asset_Cost();

  /** Set Asset Cost */
  void setA_Asset_Cost(BigDecimal A_Asset_Cost);

  /** Get Asset Group. Group of Assets */
  int getA_Asset_Group_ID();

  /** Set Asset Group. Group of Assets */
  void setA_Asset_Group_ID(int A_Asset_Group_ID);

  I_A_Asset_Group getA_Asset_Group() throws RuntimeException;

  /** Get Asset. Asset used internally or by customers */
  int getA_Asset_ID();

  /** Set Asset. Asset used internally or by customers */
  void setA_Asset_ID(int A_Asset_ID);

  /** Get A_Asset_Life_Current_Year */
  int getA_Asset_Life_Current_Year();

  /** Set A_Asset_Life_Current_Year */
  void setA_Asset_Life_Current_Year(int A_Asset_Life_Current_Year);

  /** Get Life Years */
  int getA_Asset_Life_Years();

  /** Set Life Years */
  void setA_Asset_Life_Years(int A_Asset_Life_Years);

  /** Get Spread Type */
  int getA_Asset_Spread_Type();

  /** Set Spread Type */
  void setA_Asset_Spread_Type(int A_Asset_Spread_Type);

  I_A_Asset_Spread getA_Asset_Spread_T() throws RuntimeException;

  /** Get A_Base_Amount */
  BigDecimal getA_Base_Amount();

  /** Set A_Base_Amount */
  void setA_Base_Amount(BigDecimal A_Base_Amount);

  /** Get A_Calc_Accumulated_Depr */
  BigDecimal getA_Calc_Accumulated_Depr();

  /** Set A_Calc_Accumulated_Depr */
  void setA_Calc_Accumulated_Depr(BigDecimal A_Calc_Accumulated_Depr);

  /** Get A_Curr_Dep_Exp */
  BigDecimal getA_Curr_Dep_Exp();

  /** Set A_Curr_Dep_Exp */
  void setA_Curr_Dep_Exp(BigDecimal A_Curr_Dep_Exp);

  /** Get Current Period */
  int getA_Current_Period();

  /** Set Current Period */
  void setA_Current_Period(int A_Current_Period);

  /** Get Depreciation Account */
  int getA_Depreciation_Acct();

  /** Set Depreciation Account */
  void setA_Depreciation_Acct(int A_Depreciation_Acct);

  I_C_ValidCombination getA_Depreciation_A() throws RuntimeException;

  /** Get Calculation Type */
  int getA_Depreciation_Calc_Type();

  /** Set Calculation Type */
  void setA_Depreciation_Calc_Type(int A_Depreciation_Calc_Type);

  I_A_Depreciation_Method getA_Depreciation_Calc_T() throws RuntimeException;

  /** Get A_Depreciation_Manual_Amount */
  BigDecimal getA_Depreciation_Manual_Amount();

  /** Set A_Depreciation_Manual_Amount */
  void setA_Depreciation_Manual_Amount(BigDecimal A_Depreciation_Manual_Amount);

  /** Get A_Depreciation_Manual_Period */
  String getA_Depreciation_Manual_Period();

  /** Set A_Depreciation_Manual_Period */
  void setA_Depreciation_Manual_Period(String A_Depreciation_Manual_Period);

  /** Get A_Depreciation_Table_Header_ID */
  int getA_Depreciation_Table_Header_ID();

  /** Set A_Depreciation_Table_Header_ID */
  void setA_Depreciation_Table_Header_ID(int A_Depreciation_Table_Header_ID);

  I_A_Depreciation_Table_Header getA_Depreciation_Table_Header() throws RuntimeException;

  /** Get Variable Percent */
  BigDecimal getA_Depreciation_Variable_Perc();

  /** Set Variable Percent */
  void setA_Depreciation_Variable_Perc(BigDecimal A_Depreciation_Variable_Perc);

  /** Get Loss on Disposal */
  int getA_Disposal_Loss();

  /** Set Loss on Disposal */
  void setA_Disposal_Loss(int A_Disposal_Loss);

  I_C_ValidCombination getA_Disposal_L() throws RuntimeException;

  /** Get Disposal Revenue */
  int getA_Disposal_Revenue();

  /** Set Disposal Revenue */
  void setA_Disposal_Revenue(int A_Disposal_Revenue);

  I_C_ValidCombination getA_Disposal_Reve() throws RuntimeException;

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get User/Contact. User within the system - Internal or Business Partner Contact */
  int getAD_User_ID();

  /** Set User/Contact. User within the system - Internal or Business Partner Contact */
  void setAD_User_ID(int AD_User_ID);

  /** Get Life Periods */
  int getA_Life_Period();

  /** Set Life Periods */
  void setA_Life_Period(int A_Life_Period);

  /** Get Parent Asset */
  int getA_Parent_Asset_ID();

  /** Set Parent Asset */
  void setA_Parent_Asset_ID(int A_Parent_Asset_ID);

  /** Get A_Period_End */
  int getA_Period_End();

  /** Set A_Period_End */
  void setA_Period_End(int A_Period_End);

  /** Get A_Period_Posted */
  int getA_Period_Posted();

  /** Set A_Period_Posted */
  void setA_Period_Posted(int A_Period_Posted);

  /** Get A_Period_Start */
  int getA_Period_Start();

  /** Set A_Period_Start */
  void setA_Period_Start(int A_Period_Start);

  /** Get A_Prior_Year_Accumulated_Depr */
  BigDecimal getA_Prior_Year_Accumulated_Depr();

  /** Set A_Prior_Year_Accumulated_Depr */
  void setA_Prior_Year_Accumulated_Depr(BigDecimal A_Prior_Year_Accumulated_Depr);

  /** Get Current Qty */
  int getA_QTY_Current();

  /** Set Current Qty */
  void setA_QTY_Current(int A_QTY_Current);

  /** Get A_QTY_Original */
  int getA_QTY_Original();

  /** Set A_QTY_Original */
  void setA_QTY_Original(int A_QTY_Original);

  /** Get Revaluation Accumulated Depreciation Offset for Current Year */
  int getA_Reval_Accumdep_Offset_Cur();

  /** Set Revaluation Accumulated Depreciation Offset for Current Year */
  void setA_Reval_Accumdep_Offset_Cur(int A_Reval_Accumdep_Offset_Cur);

  I_C_ValidCombination getA_Reval_Accumdep_Offset_() throws RuntimeException;

  /** Get Revaluation Accumulated Depreciation Offset for Prior Year */
  int getA_Reval_Accumdep_Offset_Prior();

  /** Set Revaluation Accumulated Depreciation Offset for Prior Year */
  void setA_Reval_Accumdep_Offset_Prior(int A_Reval_Accumdep_Offset_Prior);

  I_C_ValidCombination getA_Reval_Accumdep_Offset_Pr() throws RuntimeException;

  /** Get A_Reval_Cal_Method */
  String getA_Reval_Cal_Method();

  /** Set A_Reval_Cal_Method */
  void setA_Reval_Cal_Method(String A_Reval_Cal_Method);

  /** Get Revaluation Cost Offset for Current Year */
  int getA_Reval_Cost_Offset();

  /** Set Revaluation Cost Offset for Current Year */
  void setA_Reval_Cost_Offset(int A_Reval_Cost_Offset);

  I_C_ValidCombination getA_Reval_Cost_Off() throws RuntimeException;

  /** Get Revaluation Cost Offset for Prior Year */
  int getA_Reval_Cost_Offset_Prior();

  /** Set Revaluation Cost Offset for Prior Year */
  void setA_Reval_Cost_Offset_Prior(int A_Reval_Cost_Offset_Prior);

  I_C_ValidCombination getA_Reval_Cost_Offset_Pr() throws RuntimeException;

  /** Get Revaluation Expense Offs */
  int getA_Reval_Depexp_Offset();

  /** Set Revaluation Expense Offs */
  void setA_Reval_Depexp_Offset(int A_Reval_Depexp_Offset);

  I_C_ValidCombination getA_Reval_Depexp_Off() throws RuntimeException;

  /** Get Asset Salvage Value */
  BigDecimal getA_Salvage_Value();

  /** Set Asset Salvage Value */
  void setA_Salvage_Value(BigDecimal A_Salvage_Value);

  /** Get Split Percent */
  BigDecimal getA_Split_Percent();

  /** Set Split Percent */
  void setA_Split_Percent(BigDecimal A_Split_Percent);

  /** Get Asset Depreciation Date. Date of last depreciation */
  Timestamp getAssetDepreciationDate();

  /** Set Asset Depreciation Date. Date of last depreciation */
  void setAssetDepreciationDate(Timestamp AssetDepreciationDate);

  /** Get Asset Disposal Date. Date when the asset is/was disposed */
  Timestamp getAssetDisposalDate();

  /** Set Asset Disposal Date. Date when the asset is/was disposed */
  void setAssetDisposalDate(Timestamp AssetDisposalDate);

  /** Get Market value Amount. Market value of the asset */
  BigDecimal getAssetMarketValueAmt();

  /** Set Market value Amount. Market value of the asset */
  void setAssetMarketValueAmt(BigDecimal AssetMarketValueAmt);

  /** Get In Service Date. Date when Asset was put into service */
  Timestamp getAssetServiceDate();

  /** Set In Service Date. Date when Asset was put into service */
  void setAssetServiceDate(Timestamp AssetServiceDate);

  /** Get Accounting Schema. Rules for accounting */
  int getC_AcctSchema_ID();

  /** Set Accounting Schema. Rules for accounting */
  void setC_AcctSchema_ID(int C_AcctSchema_ID);

  I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

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

  /** Get Address. Location or Address */
  int getC_Location_ID();

  /** Set Address. Location or Address */
  void setC_Location_ID(int C_Location_ID);

  I_C_Location getC_Location() throws RuntimeException;

  /** Get ConventionType */
  int getConventionType();

  /** Set ConventionType */
  void setConventionType(int ConventionType);

  I_A_Depreciation_Convention getConventionT() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get DepreciationType */
  int getDepreciationType();

  /** Set DepreciationType */
  void setDepreciationType(int DepreciationType);

  I_A_Depreciation getDepreciationT() throws RuntimeException;

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Guarantee Date. Date when guarantee expires */
  Timestamp getGuaranteeDate();

  /** Set Guarantee Date. Date when guarantee expires */
  void setGuaranteeDate(Timestamp GuaranteeDate);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Get Asset */
  int getI_Asset_ID();

  /** Set Asset */
  void setI_Asset_ID(int I_Asset_ID);

  /** Get I_Asset_UU */
  String getI_Asset_UU();

  /** Set I_Asset_UU */
  void setI_Asset_UU(String I_Asset_UU);

  /** Get Import Error Message. Messages generated from import process */
  String getI_ErrorMsg();

  /** Set Import Error Message. Messages generated from import process */
  void setI_ErrorMsg(String I_ErrorMsg);

  /** Get Imported. Has this import been processed */
  boolean isI_IsImported();

  /** Set Imported. Has this import been processed */
  void setI_IsImported(boolean I_IsImported);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Depreciate. The asset will be depreciated */
  void setIsDepreciated(boolean IsDepreciated);

  /** Get Depreciate. The asset will be depreciated */
  boolean isDepreciated();

  /** Set Disposed. The asset is disposed */
  void setIsDisposed(boolean IsDisposed);

  /** Get Disposed. The asset is disposed */
  boolean isDisposed();

  /** Set Fully depreciated. The asset is fully depreciated */
  void setIsFullyDepreciated(boolean IsFullyDepreciated);

  /** Get Fully depreciated. The asset is fully depreciated */
  boolean isFullyDepreciated();

  /** Set In Possession. The asset is in the possession of the organization */
  void setIsInPosession(boolean IsInPosession);

  /** Get In Possession. The asset is in the possession of the organization */
  boolean isInPosession();

  /** Set Owned. The asset is owned by the organization */
  void setIsOwned(boolean IsOwned);

  /** Get Owned. The asset is owned by the organization */
  boolean isOwned();

  /** Get Life use. Units of use until the asset is not usable anymore */
  int getLifeUseUnits();

  /** Set Life use. Units of use until the asset is not usable anymore */
  void setLifeUseUnits(int LifeUseUnits);

  /** Get Location comment. Additional comments or remarks concerning the location */
  String getLocationComment();

  /** Set Location comment. Additional comments or remarks concerning the location */
  void setLocationComment(String LocationComment);

  /** Get Lot No. Lot number (alphanumeric) */
  String getLot();

  /** Set Lot No. Lot number (alphanumeric) */
  void setLot(String Lot);

  /** Set Attribute Set Instance. Product Attribute Set Instance */
  void setM_AttributeSetInstance_ID(int M_AttributeSetInstance_ID);

  /** Get Attribute Set Instance. Product Attribute Set Instance */
  int getMAttributeSetInstance_ID();

  I_M_AttributeSetInstance getMAttributeSetInstance() throws RuntimeException;

  /** Get Locator. Warehouse Locator */
  int getM_Locator_ID();

  /** Set Locator. Warehouse Locator */
  void setM_Locator_ID(int M_Locator_ID);

  I_M_Locator getM_Locator() throws RuntimeException;

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get PostingType. The type of posted amount for the transaction */
  String getPostingType();

  /** Set PostingType. The type of posted amount for the transaction */
  void setPostingType(String PostingType);

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Serial No. Product Serial Number */
  String getSerNo();

  /** Set Serial No. Product Serial Number */
  void setSerNo(String SerNo);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Usable Life - Months. Months of the usable life of the asset */
  int getUseLifeMonths();

  /** Set Usable Life - Months. Months of the usable life of the asset */
  void setUseLifeMonths(int UseLifeMonths);

  /** Get Usable Life - Years. Years of the usable life of the asset */
  int getUseLifeYears();

  /** Set Usable Life - Years. Years of the usable life of the asset */
  void setUseLifeYears(int UseLifeYears);

  /** Get Use units. Currently used units of the assets */
  int getUseUnits();

  /** Set Use units. Currently used units of the assets */
  void setUseUnits(int UseUnits);

  /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);

  /** Get Version No. Version Number */
  String getVersionNo();

  /** Set Version No. Version Number */
  void setVersionNo(String VersionNo);
}
