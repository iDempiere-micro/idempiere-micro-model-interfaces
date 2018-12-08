package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for AD_Desktop
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_AD_Desktop {

  /** TableName=AD_Desktop */
  String Table_Name = "AD_Desktop";

  /** AD_Table_ID=458 */
  int Table_ID = 458;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 4 - System */
  BigDecimal accessLevel = BigDecimal.valueOf(4);

  /** Load Meta Data */

  /** Column name AD_Color_ID */
  String COLUMNNAME_AD_Color_ID = "AD_Color_ID";
  /** Column name AD_Desktop_ID */
  String COLUMNNAME_AD_Desktop_ID = "AD_Desktop_ID";
  /** Column name AD_Desktop_UU */
  String COLUMNNAME_AD_Desktop_UU = "AD_Desktop_UU";
  /** Column name AD_Image_ID */
  String COLUMNNAME_AD_Image_ID = "AD_Image_ID";
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
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get System Color. Color for backgrounds or indicators */
  String getAD_Color_ID();

  /** Set System Color. Color for backgrounds or indicators */
  void setAD_Color_ID(String AD_Color_ID);

  /** Get Desktop. Collection of Workbenches */
  int getAD_Desktop_ID();

  /** Set Desktop. Collection of Workbenches */
  void setAD_Desktop_ID(int AD_Desktop_ID);

  /** Get AD_Desktop_UU */
  String getAD_Desktop_UU();

  /** Set AD_Desktop_UU */
  void setAD_Desktop_UU(String AD_Desktop_UU);

  /** Get Image. Image or Icon */
  int getAD_Image_ID();

  /** Set Image. Image or Icon */
  void setAD_Image_ID(int AD_Image_ID);

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

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
