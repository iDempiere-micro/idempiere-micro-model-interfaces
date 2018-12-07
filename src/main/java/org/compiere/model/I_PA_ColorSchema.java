package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for PA_ColorSchema
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_ColorSchema {

  /** TableName=PA_ColorSchema */
  String Table_Name = "PA_ColorSchema";

  /** AD_Table_ID=831 */
  int Table_ID = 831;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 6 - System - Client */
  BigDecimal accessLevel = BigDecimal.valueOf(6);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name AD_PrintColor1_ID */
  String COLUMNNAME_AD_PrintColor1_ID = "AD_PrintColor1_ID";
  /** Column name AD_PrintColor2_ID */
  String COLUMNNAME_AD_PrintColor2_ID = "AD_PrintColor2_ID";
  /** Column name AD_PrintColor3_ID */
  String COLUMNNAME_AD_PrintColor3_ID = "AD_PrintColor3_ID";
  /** Column name AD_PrintColor4_ID */
  String COLUMNNAME_AD_PrintColor4_ID = "AD_PrintColor4_ID";
  /** Column name Created */
  String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name EntityType */
  String COLUMNNAME_EntityType = "EntityType";
  /** Column name IsActive */
  String COLUMNNAME_IsActive = "IsActive";
  /** Column name Mark1Percent */
  String COLUMNNAME_Mark1Percent = "Mark1Percent";
  /** Column name Mark2Percent */
  String COLUMNNAME_Mark2Percent = "Mark2Percent";
  /** Column name Mark3Percent */
  String COLUMNNAME_Mark3Percent = "Mark3Percent";
  /** Column name Mark4Percent */
  String COLUMNNAME_Mark4Percent = "Mark4Percent";
  /** Column name PA_ColorSchema_ID */
  String COLUMNNAME_PA_ColorSchema_ID = "PA_ColorSchema_ID";
  /** Column name PA_ColorSchema_UU */
  String COLUMNNAME_PA_ColorSchema_UU = "PA_ColorSchema_UU";
  /** Column name Updated */
  String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Set Organization. Organizational entity within client */
  void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  int getOrgId();

  /** Get Color 1. First color used */
  int getAD_PrintColor1_ID();

  /** Set Color 1. First color used */
  void setAD_PrintColor1_ID(int AD_PrintColor1_ID);

  I_AD_PrintColor getAD_PrintColor1() throws RuntimeException;

  /** Get Color 2. Second color used */
  int getAD_PrintColor2_ID();

  /** Set Color 2. Second color used */
  void setAD_PrintColor2_ID(int AD_PrintColor2_ID);

  I_AD_PrintColor getAD_PrintColor2() throws RuntimeException;

  /** Get Color 3. Third color used */
  int getAD_PrintColor3_ID();

  /** Set Color 3. Third color used */
  void setAD_PrintColor3_ID(int AD_PrintColor3_ID);

  I_AD_PrintColor getAD_PrintColor3() throws RuntimeException;

  /** Get Color 4. Forth color used */
  int getAD_PrintColor4_ID();

  /** Set Color 4. Forth color used */
  void setAD_PrintColor4_ID(int AD_PrintColor4_ID);

  I_AD_PrintColor getAD_PrintColor4() throws RuntimeException;

  /** Get Created. Date this record was created */
  Timestamp getCreated();

  /** Get Created By. User who created this records */
  int getCreatedBy();

  /** Get Description. Optional short description of the record */
  String getDescription();

  /** Set Description. Optional short description of the record */
  void setDescription(String Description);

  /** Get Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  String getEntityType();

  /** Set Entity Type. Dictionary Entity Type; Determines ownership and synchronization */
  void setEntityType(String EntityType);

  /** Set Active. The record is active in the system */
  void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  boolean isActive();

  /** Get Mark 1 Percent. Percentage up to this color is used */
  int getMark1Percent();

  /** Set Mark 1 Percent. Percentage up to this color is used */
  void setMark1Percent(int Mark1Percent);

  /** Get Mark 2 Percent. Percentage up to this color is used */
  int getMark2Percent();

  /** Set Mark 2 Percent. Percentage up to this color is used */
  void setMark2Percent(int Mark2Percent);

  /** Get Mark 3 Percent. Percentage up to this color is used */
  int getMark3Percent();

  /** Set Mark 3 Percent. Percentage up to this color is used */
  void setMark3Percent(int Mark3Percent);

  /** Get Mark 4 Percent. Percentage up to this color is used */
  int getMark4Percent();

  /** Set Mark 4 Percent. Percentage up to this color is used */
  void setMark4Percent(int Mark4Percent);

  /** Get Name. Alphanumeric identifier of the entity */
  String getName();

  /** Set Name. Alphanumeric identifier of the entity */
  void setName(String Name);

  /** Get Color Schema. Performance Color Schema */
  int getPA_ColorSchema_ID();

  /** Set Color Schema. Performance Color Schema */
  void setPA_ColorSchema_ID(int PA_ColorSchema_ID);

  /** Get PA_ColorSchema_UU */
  String getPA_ColorSchema_UU();

  /** Set PA_ColorSchema_UU */
  void setPA_ColorSchema_UU(String PA_ColorSchema_UU);

  /** Get Updated. Date this record was updated */
  Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  int getUpdatedBy();
}
