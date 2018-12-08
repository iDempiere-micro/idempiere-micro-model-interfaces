package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for S_ExpenseType
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_S_ExpenseType {

  /** TableName=S_ExpenseType */
  String Table_Name = "S_ExpenseType";

  /** AD_Table_ID=481 */
  int Table_ID = 481;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name C_TaxCategory_ID */
  String COLUMNNAME_C_TaxCategory_ID = "C_TaxCategory_ID";
  /** Column name C_UOM_ID */
  String COLUMNNAME_C_UOM_ID = "C_UOM_ID";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsInvoiced */
  String COLUMNNAME_IsInvoiced = "IsInvoiced";
  /** Column name M_Product_Category_ID */
  String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
  /** Column name S_ExpenseType_ID */
  String COLUMNNAME_S_ExpenseType_ID = "S_ExpenseType_ID";
  /** Column name S_ExpenseType_UU */
  String COLUMNNAME_S_ExpenseType_UU = "S_ExpenseType_UU";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name Value */
  String COLUMNNAME_Value = "Value";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Tax Category. Tax Category */
  int getC_TaxCategory_ID();

  /** Set Tax Category. Tax Category */
  void setC_TaxCategory_ID(int C_TaxCategory_ID);

  I_C_TaxCategory getC_TaxCategory() throws RuntimeException;

  /** Get UOM. Unit of Measure */
  int getC_UOM_ID();

  /** Set UOM. Unit of Measure */
  void setC_UOM_ID(int C_UOM_ID);

  I_C_UOM getC_UOM() throws RuntimeException;

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Invoiced. Is this invoiced? */
  void setIsInvoiced(boolean IsInvoiced);

  /** Get Invoiced. Is this invoiced? */
  boolean isInvoiced();

  /** Get Product Category. Category of a Product */
  int getM_Product_Category_ID();

  /** Set Product Category. Category of a Product */
  void setM_Product_Category_ID(int M_Product_Category_ID);

  I_M_Product_Category getM_Product_Category() throws RuntimeException;

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Expense Type. Expense report type */
  int getS_ExpenseType_ID();

  /** Set Expense Type. Expense report type */
  void setS_ExpenseType_ID(int S_ExpenseType_ID);

  /** Get S_ExpenseType_UU */
  String getS_ExpenseType_UU();

  /** Set S_ExpenseType_UU */
  void setS_ExpenseType_UU(String S_ExpenseType_UU);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();

  /** Get Search Key. Search key for the record in the format required - must be unique */
  String getValue();

  /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);
}
