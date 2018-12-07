package org.eevolution.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_TaxType
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_C_TaxType {

  /** TableName=C_TaxType */
  public static final String Table_Name = "C_TaxType";

  /** AD_Table_ID=53068 */
  public static final int Table_ID = 53068;

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
  /** Column name C_TaxType_ID */
  public static final String COLUMNNAME_C_TaxType_ID = "C_TaxType_ID";
  /** Column name C_TaxType_UU */
  public static final String COLUMNNAME_C_TaxType_UU = "C_TaxType_UU";
  /** Column name Description */
  public static final String COLUMNNAME_Description = "Description";
  /** Column name Help */
  public static final String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";
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

  /** Get Tax Type */
  public int getC_TaxType_ID();

  /** Set Tax Type */
  public void setC_TaxType_ID(int C_TaxType_ID);

  /** Get C_TaxType_UU */
  public String getC_TaxType_UU();

  /** Set C_TaxType_UU */
  public void setC_TaxType_UU(String C_TaxType_UU);

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
