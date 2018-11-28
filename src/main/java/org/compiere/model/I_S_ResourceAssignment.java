package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for S_ResourceAssignment
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_S_ResourceAssignment {

  /** TableName=S_ResourceAssignment */
  public static final String Table_Name = "S_ResourceAssignment";

  /** AD_Table_ID=485 */
  public static final int Table_ID = 485;

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

  /** Column name AssignDateFrom */
  public static final String COLUMNNAME_AssignDateFrom = "AssignDateFrom";

  /** Set Assign From. Assign resource from */
  public void setAssignDateFrom(Timestamp AssignDateFrom);

  /** Get Assign From. Assign resource from */
  public Timestamp getAssignDateFrom();

  /** Column name AssignDateTo */
  public static final String COLUMNNAME_AssignDateTo = "AssignDateTo";

  /** Set Assign To. Assign resource until */
  public void setAssignDateTo(Timestamp AssignDateTo);

  /** Get Assign To. Assign resource until */
  public Timestamp getAssignDateTo();

  /** Column name Created */
  public static final String COLUMNNAME_Created = "Created";

  /** Get Created. Date this record was created */
  public Timestamp getCreated();

  /** Column name CreatedBy */
  public static final String COLUMNNAME_CreatedBy = "CreatedBy";

  /** Get Created By. User who created this records */
  public int getCreatedBy();

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

  /** Column name IsConfirmed */
  public static final String COLUMNNAME_IsConfirmed = "IsConfirmed";

  /** Set Confirmed. Assignment is confirmed */
  public void setIsConfirmed(boolean IsConfirmed);

  /** Get Confirmed. Assignment is confirmed */
  public boolean isConfirmed();

  /** Set Name. Alphanumeric identifier of the entity */
  public void setName(String Name);

  /** Get Name. Alphanumeric identifier of the entity */
  public String getName();

  /** Column name Qty */
  public static final String COLUMNNAME_Qty = "Qty";

  /** Set Quantity. Quantity */
  public void setQty(BigDecimal Qty);

  /** Get Quantity. Quantity */
  public BigDecimal getQty();

  /** Column name S_ResourceAssignment_ID */
  public static final String COLUMNNAME_S_ResourceAssignment_ID = "S_ResourceAssignment_ID";

  /** Set Resource Assignment. Resource Assignment */
  public void setS_ResourceAssignment_ID(int S_ResourceAssignment_ID);

  /** Get Resource Assignment. Resource Assignment */
  public int getS_ResourceAssignment_ID();

  /** Column name S_ResourceAssignment_UU */
  public static final String COLUMNNAME_S_ResourceAssignment_UU = "S_ResourceAssignment_UU";

  /** Set S_ResourceAssignment_UU */
  public void setS_ResourceAssignment_UU(String S_ResourceAssignment_UU);

  /** Get S_ResourceAssignment_UU */
  public String getS_ResourceAssignment_UU();

  /** Column name S_Resource_ID */
  public static final String COLUMNNAME_S_Resource_ID = "S_Resource_ID";

  /** Set Resource. Resource */
  public void setS_Resource_ID(int S_Resource_ID);

  /** Get Resource. Resource */
  public int getS_Resource_ID();

  public I_S_Resource getS_Resource() throws RuntimeException;

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
