package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_OperationResource
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_OperationResource {

  /** TableName=M_OperationResource */
  String Table_Name = "M_OperationResource";

  /** AD_Table_ID=797 */
  int Table_ID = 797;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name A_Asset_ID */
  String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name C_Job_ID */
  String COLUMNNAME_C_Job_ID = "C_Job_ID";
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
  /** Column name M_OperationResource_ID */
  String COLUMNNAME_M_OperationResource_ID = "M_OperationResource_ID";
  /** Column name M_OperationResource_UU */
  String COLUMNNAME_M_OperationResource_UU = "M_OperationResource_UU";
  /** Column name M_ProductOperation_ID */
  String COLUMNNAME_M_ProductOperation_ID = "M_ProductOperation_ID";
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

  /** Get Asset. Asset used internally or by customers */
  int getA_Asset_ID();

  /** Set Asset. Asset used internally or by customers */
  void setA_Asset_ID(int A_Asset_ID);

  I_A_Asset getA_Asset() throws RuntimeException;

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Position. Job Position */
  int getC_Job_ID();

  /** Set Position. Job Position */
  void setC_Job_ID(int C_Job_ID);

  I_C_Job getC_Job() throws RuntimeException;

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

  /** Get Operation Resource. Product Operation Resource */
  int getM_OperationResource_ID();

  /** Set Operation Resource. Product Operation Resource */
  void setM_OperationResource_ID(int M_OperationResource_ID);

  /** Get M_OperationResource_UU */
  String getM_OperationResource_UU();

  /** Set M_OperationResource_UU */
  void setM_OperationResource_UU(String M_OperationResource_UU);

  /** Get Product Operation. Product Manufacturing Operation */
  int getM_ProductOperation_ID();

  /** Set Product Operation. Product Manufacturing Operation */
  void setM_ProductOperation_ID(int M_ProductOperation_ID);

  I_M_ProductOperation getM_ProductOperation() throws RuntimeException;

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
