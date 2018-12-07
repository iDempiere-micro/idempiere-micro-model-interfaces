package org.eevolution.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for I_HR_Movement
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
@SuppressWarnings("all")
public interface I_I_HR_Movement {

  /** TableName=I_HR_Movement */
  public static final String Table_Name = "I_HR_Movement";

  /** AD_Table_ID=53259 */
  public static final int Table_ID = 53259;

  KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

  /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name AD_Org_ID */
  public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";
  /** Column name Amount */
  public static final String COLUMNNAME_Amount = "Amount";
  /** Column name BPartner_Value */
  public static final String COLUMNNAME_BPartner_Value = "BPartner_Value";
  /** Column name C_BPartner_ID */
  public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
  /** Column name ConceptValue */
  public static final String COLUMNNAME_ConceptValue = "ConceptValue";
  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";
  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";
  /** Column name Description */
  public static final String COLUMNNAME_Description = "Description";
  /** Column name HR_Concept_ID */
  public static final String COLUMNNAME_HR_Concept_ID = "HR_Concept_ID";
  /** Column name HR_Movement_ID */
  public static final String COLUMNNAME_HR_Movement_ID = "HR_Movement_ID";
  /** Column name HR_Process_ID */
  public static final String COLUMNNAME_HR_Process_ID = "HR_Process_ID";
  /** Column name I_ErrorMsg */
  public static final String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";
  /** Column name I_HR_Movement_ID */
  public static final String COLUMNNAME_I_HR_Movement_ID = "I_HR_Movement_ID";
  /** Column name I_HR_Movement_UU */
  public static final String COLUMNNAME_I_HR_Movement_UU = "I_HR_Movement_UU";
  /** Column name I_IsImported */
  public static final String COLUMNNAME_I_IsImported = "I_IsImported";
  /** Column name IsActive */
  public static final String COLUMNNAME_IsActive = "IsActive";
  /** Column name Processed */
  public static final String COLUMNNAME_Processed = "Processed";
  /** Column name Processing */
  public static final String COLUMNNAME_Processing = "Processing";
  /** Column name ProcessName */
  public static final String COLUMNNAME_ProcessName = "ProcessName";
  /** Column name Qty */
  public static final String COLUMNNAME_Qty = "Qty";
  /** Column name ServiceDate */
  public static final String COLUMNNAME_ServiceDate = "ServiceDate";
  /** Column name TextMsg */
  public static final String COLUMNNAME_TextMsg = "TextMsg";
  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";
  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";
  /** Column name ValidFrom */
  public static final String COLUMNNAME_ValidFrom = "ValidFrom";

  /** Set Organization. Organizational entity within client */
  public void setAD_Org_ID(int AD_Org_ID);

  /** Get Organization. Organizational entity within client */
  public int getOrgId();

  /** Get Amount. Amount in a defined currency */
  public BigDecimal getAmount();

  /** Set Amount. Amount in a defined currency */
  public void setAmount(BigDecimal Amount);

  /** Get Business Partner Key. The Key of the Business Partner */
  public String getBPartner_Value();

  /** Set Business Partner Key. The Key of the Business Partner */
  public void setBPartner_Value(String BPartner_Value);

  /** Get Business Partner . Identifies a Business Partner */
  public int getC_BPartner_ID();

  /** Set Business Partner . Identifies a Business Partner */
  public void setC_BPartner_ID(int C_BPartner_ID);

  public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

  /** Get Concept Value. Value of the Concept */
  public String getConceptValue();

  /** Set Concept Value. Value of the Concept */
  public void setConceptValue(String ConceptValue);

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Get Created By. User who created this records */
  public int getCreatedBy();

  /** Get Description. Optional short description of the record */
  public String getDescription();

  /** Set Description. Optional short description of the record */
  public void setDescription(String Description);

  /** Get Payroll Concept */
  public int getHR_Concept_ID();

  /** Set Payroll Concept */
  public void setHR_Concept_ID(int HR_Concept_ID);

  public org.eevolution.model.I_HR_Concept getHR_Concept() throws RuntimeException;

  /** Get Payroll Movement */
  public int getHR_Movement_ID();

  /** Set Payroll Movement */
  public void setHR_Movement_ID(int HR_Movement_ID);

  public org.eevolution.model.I_HR_Movement getHR_Movement() throws RuntimeException;

  /** Get Payroll Process */
  public int getHR_Process_ID();

  /** Set Payroll Process */
  public void setHR_Process_ID(int HR_Process_ID);

  public org.eevolution.model.I_HR_Process getHR_Process() throws RuntimeException;

  /** Get Import Error Message. Messages generated from import process */
  public String getI_ErrorMsg();

  /** Set Import Error Message. Messages generated from import process */
  public void setI_ErrorMsg(String I_ErrorMsg);

  /** Get Payroll Movement Import */
  public int getI_HR_Movement_ID();

  /** Set Payroll Movement Import */
  public void setI_HR_Movement_ID(int I_HR_Movement_ID);

  /** Get I_HR_Movement_UU */
  public String getI_HR_Movement_UU();

  /** Set I_HR_Movement_UU */
  public void setI_HR_Movement_UU(String I_HR_Movement_UU);

  /** Get Imported. Has this import been processed */
  public String getI_IsImported();

  /** Set Imported. Has this import been processed */
  public void setI_IsImported(String I_IsImported);

  /** Set Active. The record is active in the system */
  public void setIsActive(boolean IsActive);

  /** Get Active. The record is active in the system */
  public boolean isActive();

  /** Get Processed. The document has been processed */
  public boolean isProcessed();

  /** Set Processed. The document has been processed */
  public void setProcessed(boolean Processed);

  /** Get Process Now */
  public boolean isProcessing();

  /** Set Process Now */
  public void setProcessing(boolean Processing);

  /** Get Process Name. Name of the Process */
  public String getProcessName();

  /** Set Process Name. Name of the Process */
  public void setProcessName(String ProcessName);

  /** Get Quantity. Quantity */
  public BigDecimal getQty();

  /** Set Quantity. Quantity */
  public void setQty(BigDecimal Qty);

  /** Get Service date. Date service was provided */
  public Timestamp getServiceDate();

  /** Set Service date. Date service was provided */
  public void setServiceDate(Timestamp ServiceDate);

  /** Get Text Message. Text Message */
  public String getTextMsg();

  /** Set Text Message. Text Message */
  public void setTextMsg(String TextMsg);

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();

  /** Get Valid from. Valid from including this date (first day) */
  public Timestamp getValidFrom();

  /** Set Valid from. Valid from including this date (first day) */
  public void setValidFrom(Timestamp ValidFrom);
}
