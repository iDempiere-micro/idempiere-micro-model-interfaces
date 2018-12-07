package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ChangeRequest
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ChangeRequest {

  /** TableName=M_ChangeRequest */
  String Table_Name = "M_ChangeRequest";

  /** AD_Table_ID=800 */
  int Table_ID = 800;

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
  /** Column name DetailInfo */
  String COLUMNNAME_DetailInfo = "DetailInfo";
  /** Column name DocumentNo */
  String COLUMNNAME_DocumentNo = "DocumentNo";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name IsApproved */
  String COLUMNNAME_IsApproved = "IsApproved";
  /** Column name M_ChangeNotice_ID */
  String COLUMNNAME_M_ChangeNotice_ID = "M_ChangeNotice_ID";
  /** Column name M_ChangeRequest_ID */
  String COLUMNNAME_M_ChangeRequest_ID = "M_ChangeRequest_ID";
  /** Column name M_ChangeRequest_UU */
  String COLUMNNAME_M_ChangeRequest_UU = "M_ChangeRequest_UU";
  /** Column name M_FixChangeNotice_ID */
  String COLUMNNAME_M_FixChangeNotice_ID = "M_FixChangeNotice_ID";
  /** Column name PP_Product_BOM_ID */
  String COLUMNNAME_PP_Product_BOM_ID = "PP_Product_BOM_ID";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
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

  /** Get Detail Information. Additional Detail Information */
  String getDetailInfo();

  /** Set Detail Information. Additional Detail Information */
  void setDetailInfo(String DetailInfo);

  /** Get Document No. Document sequence number of the document */
  String getDocumentNo();

  /** Set Document No. Document sequence number of the document */
  void setDocumentNo(String DocumentNo);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Set Approved. Indicates if this document requires approval */
  void setIsApproved(boolean IsApproved);

  /** Get Approved. Indicates if this document requires approval */
  boolean isApproved();

  /** Get Change Notice. Bill of Materials (Engineering) Change Notice (Version) */
  int getM_ChangeNotice_ID();

  /** Set Change Notice. Bill of Materials (Engineering) Change Notice (Version) */
  void setM_ChangeNotice_ID(int M_ChangeNotice_ID);

  I_M_ChangeNotice getM_ChangeNotice() throws RuntimeException;

  /** Get Change Request. BOM (Engineering) Change Request */
  int getM_ChangeRequest_ID();

  /** Set Change Request. BOM (Engineering) Change Request */
  void setM_ChangeRequest_ID(int M_ChangeRequest_ID);

  /** Get M_ChangeRequest_UU */
  String getM_ChangeRequest_UU();

  /** Set M_ChangeRequest_UU */
  void setM_ChangeRequest_UU(String M_ChangeRequest_UU);

  /** Get Fixed in. Fixed in Change Notice */
  int getM_FixChangeNotice_ID();

  /** Set Fixed in. Fixed in Change Notice */
  void setM_FixChangeNotice_ID(int M_FixChangeNotice_ID);

  I_M_ChangeNotice getM_FixChangeNotice() throws RuntimeException;

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get BOM & Formula. BOM & Formula */
  int getPP_Product_BOM_ID();

  /** Set BOM & Formula. BOM & Formula */
  void setPP_Product_BOM_ID(int PP_Product_BOM_ID);

  org.eevolution.model.I_PP_Product_BOM getPP_Product_BOM() throws RuntimeException;

  /** Get Processed. The document has been processed */
  boolean isProcessed();

  /** Set Processed. The document has been processed */
  void setProcessed(boolean Processed);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
