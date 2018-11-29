package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_ServiceLevelLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_ServiceLevelLine {

  /** TableName=C_ServiceLevelLine */
  public static final String Table_Name = "C_ServiceLevelLine";

  /** AD_Table_ID=338 */
  public static final int Table_ID = 338;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getOrgId();

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Column name C_ServiceLevel_ID */
  public static final String COLUMNNAME_C_ServiceLevel_ID = "C_ServiceLevel_ID";

  /** Set Service Level. Product Revenue Recognition Service Level */
  public void setC_ServiceLevel_ID(int C_ServiceLevel_ID);

  /** Get Service Level. Product Revenue Recognition Service Level */
  public int getC_ServiceLevel_ID();

  public I_C_ServiceLevel getC_ServiceLevel() throws RuntimeException;

  /** Column name C_ServiceLevelLine_ID */
  public static final String COLUMNNAME_C_ServiceLevelLine_ID = "C_ServiceLevelLine_ID";

  /** Set Service Level Line. Product Revenue Recognition Service Level Line */
  public void setC_ServiceLevelLine_ID(int C_ServiceLevelLine_ID);

  /** Get Service Level Line. Product Revenue Recognition Service Level Line */
  public int getC_ServiceLevelLine_ID();

  /** Column name C_ServiceLevelLine_UU */
  public static final String COLUMNNAME_C_ServiceLevelLine_UU = "C_ServiceLevelLine_UU";

  /** Set C_ServiceLevelLine_UU */
  public void setC_ServiceLevelLine_UU(String C_ServiceLevelLine_UU);

  /** Get C_ServiceLevelLine_UU */
  public String getC_ServiceLevelLine_UU();

  /** Column name Description */
  public static final String COLUMNNAME_Description = "Description";

  /** Set Description. Optional short description of the record */
  public void setDescription(String Description);

  /** Get Description. Optional short description of the record */
  public String getDescription();

  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Column name Processed */
  public static final String COLUMNNAME_Processed = "Processed";

  /** Set Processed. The document has been processed */
  public void setProcessed(boolean Processed);

  /** Get Processed. The document has been processed */
  public boolean isProcessed();

  /** Column name ServiceDate */
  public static final String COLUMNNAME_ServiceDate = "ServiceDate";

  /** Set Service date. Date service was provided */
  public void setServiceDate(Timestamp ServiceDate);

  /** Get Service date. Date service was provided */
  public Timestamp getServiceDate();

  /** Column name ServiceLevelProvided */
  public static final String COLUMNNAME_ServiceLevelProvided = "ServiceLevelProvided";

  /** Set Quantity Provided. Quantity of service or product provided */
  public void setServiceLevelProvided(BigDecimal ServiceLevelProvided);

  /** Get Quantity Provided. Quantity of service or product provided */
  public BigDecimal getServiceLevelProvided();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
