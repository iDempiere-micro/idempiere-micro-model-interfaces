package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ProductOperation
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ProductOperation {

  /** TableName=M_ProductOperation */
  String Table_Name = "M_ProductOperation";

  /** AD_Table_ID=796 */
  int Table_ID = 796;

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
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";
  /** Column name M_ProductOperation_ID */
  String COLUMNNAME_M_ProductOperation_ID = "M_ProductOperation_ID";
  /** Column name M_ProductOperation_UU */
  String COLUMNNAME_M_ProductOperation_UU = "M_ProductOperation_UU";
  /** Column name SetupTime */
  String COLUMNNAME_SetupTime = "SetupTime";
  /** Column name TeardownTime */
  String COLUMNNAME_TeardownTime = "TeardownTime";
  /** Column name UnitRuntime */
  String COLUMNNAME_UnitRuntime = "UnitRuntime";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

  I_M_Product getM_Product() throws RuntimeException;

  /** Get Product Operation. Product Manufacturing Operation */
  int getM_ProductOperation_ID();

  /** Set Product Operation. Product Manufacturing Operation */
  void setM_ProductOperation_ID(int M_ProductOperation_ID);

  /** Get M_ProductOperation_UU */
  String getM_ProductOperation_UU();

  /** Set M_ProductOperation_UU */
  void setM_ProductOperation_UU(String M_ProductOperation_UU);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Setup Time. Setup time before starting Production */
  BigDecimal getSetupTime();

  /** Set Setup Time. Setup time before starting Production */
  void setSetupTime(BigDecimal SetupTime);

  /** Get Teardown Time. Time at the end of the operation */
  BigDecimal getTeardownTime();

  /** Set Teardown Time. Time at the end of the operation */
  void setTeardownTime(BigDecimal TeardownTime);

  /** Get Runtime per Unit. Time to produce one unit */
  BigDecimal getUnitRuntime();

  /** Set Runtime per Unit. Time to produce one unit */
  void setUnitRuntime(BigDecimal UnitRuntime);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
