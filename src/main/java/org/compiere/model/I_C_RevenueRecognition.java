package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_RevenueRecognition
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_RevenueRecognition {

  /** TableName=C_RevenueRecognition */
  public static final String Table_Name = "C_RevenueRecognition";

  /** AD_Table_ID=336 */
  public static final int Table_ID = 336;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

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

  /** Column name C_RevenueRecognition_ID */
  public static final String COLUMNNAME_C_RevenueRecognition_ID = "C_RevenueRecognition_ID";

  /** Set Revenue Recognition. Method for recording revenue */
  public void setC_RevenueRecognition_ID(int C_RevenueRecognition_ID);

  /** Get Revenue Recognition. Method for recording revenue */
  public int getC_RevenueRecognition_ID();

  /** Column name C_RevenueRecognition_UU */
  public static final String COLUMNNAME_C_RevenueRecognition_UU = "C_RevenueRecognition_UU";

  /** Set C_RevenueRecognition_UU */
  public void setC_RevenueRecognition_UU(String C_RevenueRecognition_UU);

  /** Get C_RevenueRecognition_UU */
  public String getC_RevenueRecognition_UU();

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

  /** Column name IsTimeBased */
  public static final String COLUMNNAME_IsTimeBased = "IsTimeBased";

  /** Set Time based. Time based Revenue Recognition rather than Service Level based */
  public void setIsTimeBased(boolean IsTimeBased);

  /** Get Time based. Time based Revenue Recognition rather than Service Level based */
  public boolean isTimeBased();

  /** Set Name. Alphanumeric identifier of the entity */
  public void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  public String getName();

  /** Column name NoMonths */
  public static final String COLUMNNAME_NoMonths = "NoMonths";

  /** Set Number of Months */
  public void setNoMonths(int NoMonths);

  /** Get Number of Months */
  public int getNoMonths();

  /** Column name RecognitionFrequency */
  public static final String COLUMNNAME_RecognitionFrequency = "RecognitionFrequency";

  /** Set Recognition frequency */
  public void setRecognitionFrequency(String RecognitionFrequency);

  /** Get Recognition frequency */
  public String getRecognitionFrequency();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
