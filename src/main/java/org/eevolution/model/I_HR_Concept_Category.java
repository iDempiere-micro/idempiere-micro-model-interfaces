package org.eevolution.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for HR_Concept_Category
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_HR_Concept_Category {

  /** TableName=HR_Concept_Category */
  public static final String Table_Name = "HR_Concept_Category";

  /** AD_Table_ID=53097 */
  public static final int Table_ID = 53097;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  public static final String COLUMNNAME_Description = "Description";
  /** Column name HR_Concept_Acct */
  public static final String COLUMNNAME_HR_Concept_Acct = "HR_Concept_Acct";
  /** Column name HR_Concept_Category_ID */
  public static final String COLUMNNAME_HR_Concept_Category_ID = "HR_Concept_Category_ID";
  /** Column name HR_Concept_Category_UU */
  public static final String COLUMNNAME_HR_Concept_Category_UU = "HR_Concept_Category_UU";
  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsDefault */
  public static final String COLUMNNAME_IsDefault = "IsDefault";
  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name Value */
  public static final String COLUMNNAME_Value = "Value";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getOrgId();

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Get Description. Optional short description of the record */
  public String getDescription();

  /** Set Description. Optional short description of the record */
  public void setDescription(String Description);

  /** Get Payroll Concept Account */
  public int getHR_Concept_Acct();

  /** Set Payroll Concept Account */
  public void setHR_Concept_Acct(int HR_Concept_Acct);

  public I_C_ValidCombination getHR_Concept_A() throws RuntimeException;

  /** Get Payroll Concept Category */
  public int getHR_Concept_Category_ID();

  /** Set Payroll Concept Category */
  public void setHR_Concept_Category_ID(int HR_Concept_Category_ID);

  /** Get HR_Concept_Category_UU */
  public String getHR_Concept_Category_UU();

  /** Set HR_Concept_Category_UU */
  public void setHR_Concept_Category_UU(String HR_Concept_Category_UU);

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Set Default. Default value */
  public void setIsDefault(boolean IsDefault);

  /** Get Default. Default value */
  public boolean isDefault();

  /** Get Name. Alphanumeric identifier of the entity */
  public String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  public void setName(String Name);

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();

  /** Get Search Key. Search key for the record in the format required - must be unique */
  public String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  public void setValue(String Value);
}
