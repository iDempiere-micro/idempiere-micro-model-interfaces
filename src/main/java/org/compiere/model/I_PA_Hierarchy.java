package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PA_Hierarchy
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_Hierarchy {

  /** TableName=PA_Hierarchy */
  String Table_Name = "PA_Hierarchy";

  /** AD_Table_ID=821 */
  int Table_ID = 821;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Tree_Account_ID */
  String COLUMNNAME_AD_Tree_Account_ID = "AD_Tree_Account_ID";
  /** Column name AD_Tree_Activity_ID */
  String COLUMNNAME_AD_Tree_Activity_ID = "AD_Tree_Activity_ID";
  /** Column name AD_Tree_BPartner_ID */
  String COLUMNNAME_AD_Tree_BPartner_ID = "AD_Tree_BPartner_ID";
  /** Column name AD_Tree_Campaign_ID */
  String COLUMNNAME_AD_Tree_Campaign_ID = "AD_Tree_Campaign_ID";
  /** Column name AD_Tree_Org_ID */
  String COLUMNNAME_AD_Tree_Org_ID = "AD_Tree_Org_ID";
  /** Column name AD_Tree_Product_ID */
  String COLUMNNAME_AD_Tree_Product_ID = "AD_Tree_Product_ID";
  /** Column name AD_Tree_Project_ID */
  String COLUMNNAME_AD_Tree_Project_ID = "AD_Tree_Project_ID";
  /** Column name AD_Tree_SalesRegion_ID */
  String COLUMNNAME_AD_Tree_SalesRegion_ID = "AD_Tree_SalesRegion_ID";
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
  /** Column name PA_Hierarchy_ID */
  String COLUMNNAME_PA_Hierarchy_ID = "PA_Hierarchy_ID";
  /** Column name PA_Hierarchy_UU */
  String COLUMNNAME_PA_Hierarchy_UU = "PA_Hierarchy_UU";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Account Tree. Tree for Natural Account Tree */
  int getAD_Tree_Account_ID();

  /** Set Account Tree. Tree for Natural Account Tree */
  void setAD_Tree_Account_ID(int AD_Tree_Account_ID);

  I_AD_Tree getAD_Tree_Account() throws RuntimeException;

  /** Get Activity Tree. Trees are used for (financial) reporting */
  int getAD_Tree_Activity_ID();

  /** Set Activity Tree. Trees are used for (financial) reporting */
  void setAD_Tree_Activity_ID(int AD_Tree_Activity_ID);

  I_AD_Tree getAD_Tree_Activity() throws RuntimeException;

  /** Get BPartner Tree. Trees are used for (financial) reporting */
  int getAD_Tree_BPartner_ID();

  /** Set BPartner Tree. Trees are used for (financial) reporting */
  void setAD_Tree_BPartner_ID(int AD_Tree_BPartner_ID);

  I_AD_Tree getAD_Tree_BPartner() throws RuntimeException;

  /** Get Campaign Tree. Trees are used for (financial) reporting */
  int getAD_Tree_Campaign_ID();

  /** Set Campaign Tree. Trees are used for (financial) reporting */
  void setAD_Tree_Campaign_ID(int AD_Tree_Campaign_ID);

  I_AD_Tree getAD_Tree_Campaign() throws RuntimeException;

  /**
   * Get Organization Tree. Trees are used for (financial) reporting and security access (via role)
   */
  int getAD_Tree_Org_ID();

  /**
   * Set Organization Tree. Trees are used for (financial) reporting and security access (via role)
   */
  void setAD_Tree_Org_ID(int AD_Tree_Org_ID);

  I_AD_Tree getAD_Tree_Org() throws RuntimeException;

  /** Get Product Tree. Trees are used for (financial) reporting */
  int getAD_Tree_Product_ID();

  /** Set Product Tree. Trees are used for (financial) reporting */
  void setAD_Tree_Product_ID(int AD_Tree_Product_ID);

  I_AD_Tree getAD_Tree_Product() throws RuntimeException;

  /** Get Project Tree. Trees are used for (financial) reporting */
  int getAD_Tree_Project_ID();

  /** Set Project Tree. Trees are used for (financial) reporting */
  void setAD_Tree_Project_ID(int AD_Tree_Project_ID);

  I_AD_Tree getAD_Tree_Project() throws RuntimeException;

  /** Get Sales Region Tree. Trees are used for (financial) reporting */
  int getAD_Tree_SalesRegion_ID();

  /** Set Sales Region Tree. Trees are used for (financial) reporting */
  void setAD_Tree_SalesRegion_ID(int AD_Tree_SalesRegion_ID);

  I_AD_Tree getAD_Tree_SalesRegion() throws RuntimeException;

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

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /**
   * Get Reporting Hierarchy. Optional Reporting Hierarchy - If not selected the default hierarchy
   * trees are used.
   */
  int getPA_Hierarchy_ID();

  /**
   * Set Reporting Hierarchy. Optional Reporting Hierarchy - If not selected the default hierarchy
   * trees are used.
   */
  void setPA_Hierarchy_ID(int PA_Hierarchy_ID);

  /** Get PA_Hierarchy_UU */
  String getPA_Hierarchy_UU();

  /** Set PA_Hierarchy_UU */
  void setPA_Hierarchy_UU(String PA_Hierarchy_UU);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
