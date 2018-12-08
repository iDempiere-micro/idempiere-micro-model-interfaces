package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_SerNoCtlExclude
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_SerNoCtlExclude {

  /** TableName=M_SerNoCtlExclude */
  String Table_Name = "M_SerNoCtlExclude";

  /** AD_Table_ID=811 */
  int Table_ID = 811;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 2 - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(2);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_Table_ID */
  String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsSOTrx */
  String COLUMNNAME_IsSOTrx = "IsSOTrx";
  /** Column name M_SerNoCtlExclude_ID */
  String COLUMNNAME_M_SerNoCtlExclude_ID = "M_SerNoCtlExclude_ID";
  /** Column name M_SerNoCtlExclude_UU */
  String COLUMNNAME_M_SerNoCtlExclude_UU = "M_SerNoCtlExclude_UU";
  /** Column name M_SerNoCtl_ID */
  String COLUMNNAME_M_SerNoCtl_ID = "M_SerNoCtl_ID";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Table. Database Table information */
  int getAD_Table_ID();

  /** Set Table. Database Table information */
  void setAD_Table_ID(int AD_Table_ID);

  I_AD_Table getAD_Table() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Sales Transaction. This is a Sales Transaction */
  void setIsSOTrx(boolean IsSOTrx);

  /** Get Sales Transaction. This is a Sales Transaction */
  boolean isSOTrx();

  /** Get Exclude SerNo. Exclude the ability to create Serial Numbers in Attribute Sets */
  int getM_SerNoCtlExclude_ID();

  /** Set Exclude SerNo. Exclude the ability to create Serial Numbers in Attribute Sets */
  void setM_SerNoCtlExclude_ID(int M_SerNoCtlExclude_ID);

  /** Get M_SerNoCtlExclude_UU */
  String getM_SerNoCtlExclude_UU();

  /** Set M_SerNoCtlExclude_UU */
  void setM_SerNoCtlExclude_UU(String M_SerNoCtlExclude_UU);

  /** Get Serial No Control. Product Serial Number Control */
  int getM_SerNoCtl_ID();

  /** Set Serial No Control. Product Serial Number Control */
  void setM_SerNoCtl_ID(int M_SerNoCtl_ID);

  I_M_SerNoCtl getM_SerNoCtl() throws RuntimeException;

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
