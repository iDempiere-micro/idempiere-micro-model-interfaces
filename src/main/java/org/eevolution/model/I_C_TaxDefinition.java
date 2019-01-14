package org.eevolution.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_TaxDefinition
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_C_TaxDefinition {

  /** TableName=C_TaxDefinition */
  public static final String Table_Name = "C_TaxDefinition";

  /** AD_Table_ID=53067 */
  public static final int Table_ID = 53067;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_OrgType_ID */
  public static final String COLUMNNAME_AD_OrgType_ID = "AD_OrgType_ID";
  /** Column name C_BPartner_ID */
  public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name C_BP_Group_ID */
  public static final String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";
  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_TaxBase_ID */
  public static final String COLUMNNAME_C_TaxBase_ID = "C_TaxBase_ID";
  /** Column name C_TaxCategory_ID */
  public static final String COLUMNNAME_C_TaxCategory_ID = "C_TaxCategory_ID";
  /** Column name C_TaxDefinition_ID */
  public static final String COLUMNNAME_C_TaxDefinition_ID = "C_TaxDefinition_ID";
  /** Column name C_TaxDefinition_UU */
  public static final String COLUMNNAME_C_TaxDefinition_UU = "C_TaxDefinition_UU";
  /** Column name C_TaxGroup_ID */
  public static final String COLUMNNAME_C_TaxGroup_ID = "C_TaxGroup_ID";
  /** Column name C_Tax_ID */
  public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
  /** Column name C_TaxType_ID */
  public static final String COLUMNNAME_C_TaxType_ID = "C_TaxType_ID";
  /** Column name Description */
  public static final String COLUMNNAME_Description = "Description";
  /** Column name Help */
  public static final String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsInvoiced */
  public static final String COLUMNNAME_IsInvoiced = "IsInvoiced";
  /** Column name MaxTaxable */
  public static final String COLUMNNAME_MaxTaxable = "MaxTaxable";
  /** Column name MinTaxable */
  public static final String COLUMNNAME_MinTaxable = "MinTaxable";
  /** Column name M_Product_Category_ID */
  public static final String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
  /** Column name M_Product_ID */
  public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name SeqNo */
  public static final String COLUMNNAME_SeqNo = "SeqNo";
  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name ValidFrom */
  public static final String COLUMNNAME_ValidFrom = "ValidFrom";
  /** Column name ValidTo */
  public static final String COLUMNNAME_ValidTo = "ValidTo";
  /** Column name Value */
  public static final String COLUMNNAME_Value = "Value";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getOrgId();

  /** Get Organization Type. Organization Type */
  public int getAD_OrgType_ID();

  /** Set Organization Type. Organization Type */
  public void setAD_OrgType_ID(int AD_OrgType_ID);

  public org.compiere.model.I_AD_OrgType getAD_OrgType() throws RuntimeException;

  /** Get Business Partner . Identifies a Business Partner */
  public int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  public void setC_BPartner_ID(int C_BPartner_ID);

  public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Business Partner Group. Business Partner Group */
  public int getC_BP_Group_ID();

  /** Set Business Partner Group. Business Partner Group */
  public void setC_BP_Group_ID(int C_BP_Group_ID);

  public org.compiere.model.I_C_BP_Group getC_BP_Group() throws RuntimeException;

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Get Tax Base */
  public int getC_TaxBase_ID();

  /** Set Tax Base */
  public void setC_TaxBase_ID(int C_TaxBase_ID);

  public org.eevolution.model.I_C_TaxBase getC_TaxBase() throws RuntimeException;

  /** Get Tax Category. Tax Category */
  public int getC_TaxCategory_ID();

  /** Set Tax Category. Tax Category */
  public void setC_TaxCategory_ID(int C_TaxCategory_ID);

  public org.compiere.model.I_C_TaxCategory getC_TaxCategory() throws RuntimeException;

  /** Get Tax Definition */
  public int getC_TaxDefinition_ID();

  /** Set Tax Definition */
  public void setC_TaxDefinition_ID(int C_TaxDefinition_ID);

  /** Get C_TaxDefinition_UU */
  public String getC_TaxDefinition_UU();

  /** Set C_TaxDefinition_UU */
  public void setC_TaxDefinition_UU(String C_TaxDefinition_UU);

  /** Get Tax Group */
  public int getC_TaxGroup_ID();

  /** Set Tax Group */
  public void setC_TaxGroup_ID(int C_TaxGroup_ID);

  public org.eevolution.model.I_C_TaxGroup getC_TaxGroup() throws RuntimeException;

  /** Get Tax. Tax identifier */
  public int getC_Tax_ID();

  /** Set Tax. Tax identifier */
  public void setC_Tax_ID(int C_Tax_ID);

  public org.compiere.model.I_C_Tax getC_Tax() throws RuntimeException;

  /** Get Tax Type */
  public int getC_TaxType_ID();

  /** Set Tax Type */
  public void setC_TaxType_ID(int C_TaxType_ID);

  public org.eevolution.model.I_C_TaxType getC_TaxType() throws RuntimeException;

  /** Get Description. Optional short description of the record */
  public String getDescription();

  /** Set Description. Optional short description of the record */
  public void setDescription(String Description);

  /** Get Comment/Help. Comment or Hint */
  public String getHelp();

  /** Set Comment/Help. Comment or Hint */
  public void setHelp(String Help);

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Set Invoiced. Is this invoiced? */
  public void setIsInvoiced(boolean IsInvoiced);

  /** Get Invoiced. Is this invoiced? */
  public boolean isInvoiced();

  /** Get Max Taxable */
  public int getMaxTaxable();

  /** Set Max Taxable */
  public void setMaxTaxable(int MaxTaxable);

  /** Get Min Taxable */
  public int getMinTaxable();

  /** Set Min Taxable */
  public void setMinTaxable(int MinTaxable);

  /** Get Product Category. Category of a Product */
  public int getM_Product_Category_ID();

  /** Set Product Category. Category of a Product */
  public void setM_Product_Category_ID(int M_Product_Category_ID);

  public org.compiere.model.I_M_Product_Category getM_Product_Category() throws RuntimeException;

  /** Get Product. Product, Service, Item */
  public int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  public void setM_Product_ID(int M_Product_ID);

  public org.compiere.model.I_M_Product getM_Product() throws RuntimeException;

  /** Get Name. Alphanumeric identifier of the entity */
  public String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  public void setName(String Name);

  /** Get Sequence. Method of ordering records; lowest number comes first */
  public int getSeqNo();

  /** Set Sequence. Method of ordering records; lowest number comes first */
  public void setSeqNo(int SeqNo);

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();

  /** Get Valid from. Valid from including this date (first day) */
  public Timestamp getValidFrom();

  /** Set Valid from. Valid from including this date (first day) */
  public void setValidFrom(Timestamp ValidFrom);

  /** Get Valid to. Valid to including this date (last day) */
  public Timestamp getValidTo();

  /** Set Valid to. Valid to including this date (last day) */
  public void setValidTo(Timestamp ValidTo);

  /** Get Search Key. Search key for the record in the format required - must be unique */
  public String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  public void setValue(String Value);
}