package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for S_Training
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_S_Training {

  /** TableName=S_Training */
  String Table_Name = "S_Training";

  /** AD_Table_ID=538 */
  int Table_ID = 538;

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
  /** Column name DescriptionURL */
  String COLUMNNAME_DescriptionURL = "DescriptionURL";
  /** Column name DocumentNote */
  String COLUMNNAME_DocumentNote = "DocumentNote";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
  /** Column name ImageURL */
  String COLUMNNAME_ImageURL = "ImageURL";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name M_Product_Category_ID */
  String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
  /** Column name Processing */
  String COLUMNNAME_Processing = "Processing";
  /** Column name S_Training_ID */
  String COLUMNNAME_S_Training_ID = "S_Training_ID";
  /** Column name S_Training_UU */
  String COLUMNNAME_S_Training_UU = "S_Training_UU";
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

  /** Get Description URL. URL for the description */
  String getDescriptionURL();

  /** Set Description URL. URL for the description */
  void setDescriptionURL(String DescriptionURL);

  /** Get Document Note. Additional information for a Document */
  String getDocumentNote();

  /** Set Document Note. Additional information for a Document */
  void setDocumentNote(String DocumentNote);

  /** Get Comment/Help. Comment or Hint */
  String getHelp();

  /** Set Comment/Help. Comment or Hint */
  void setHelp(String Help);

  /** Get Image URL. URL of image */
  String getImageURL();

  /** Set Image URL. URL of image */
  void setImageURL(String ImageURL);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Product Category. Category of a Product */
  int getM_Product_Category_ID();

  /** Set Product Category. Category of a Product */
  void setM_Product_Category_ID(int M_Product_Category_ID);

  I_M_Product_Category getM_Product_Category() throws RuntimeException;

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Process Now */
  boolean isProcessing();

  /** Set Process Now */
  void setProcessing(boolean Processing);

  /** Get Training. Repeated Training */
  int getS_Training_ID();

  /** Set Training. Repeated Training */
  void setS_Training_ID(int S_Training_ID);

  /** Get S_Training_UU */
  String getS_Training_UU();

  /** Set S_Training_UU */
  void setS_Training_UU(String S_Training_UU);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
