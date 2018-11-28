package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_OrderLandedCost
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_OrderLandedCost {

  /** TableName=C_OrderLandedCost */
  public static final String Table_Name = "C_OrderLandedCost";

  /** AD_Table_ID=200103 */
  public static final int Table_ID = 200103;

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

  /** Column name Amt */
  public static final String COLUMNNAME_Amt = "Amt";

  /** Set Amount. Amount */
  public void setAmt(BigDecimal Amt);

  /** Get Amount. Amount */
  public BigDecimal getAmt();

  /** Column name C_Order_ID */
  public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";

  /** Set Order. Order */
  public void setC_Order_ID(int C_Order_ID);

  /** Get Order. Order */
  public int getC_Order_ID();

  public I_C_Order getC_Order() throws RuntimeException;

  /** Column name C_OrderLandedCost_ID */
  public static final String COLUMNNAME_C_OrderLandedCost_ID = "C_OrderLandedCost_ID";

  /** Set Estimated Landed Cost */
  public void setC_OrderLandedCost_ID(int C_OrderLandedCost_ID);

  /** Get Estimated Landed Cost */
  public int getC_OrderLandedCost_ID();

  /** Column name C_OrderLandedCost_UU */
  public static final String COLUMNNAME_C_OrderLandedCost_UU = "C_OrderLandedCost_UU";

  /** Set C_OrderLandedCost_UU */
  public void setC_OrderLandedCost_UU(String C_OrderLandedCost_UU);

  /** Get C_OrderLandedCost_UU */
  public String getC_OrderLandedCost_UU();

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

  /** Column name LandedCostDistribution */
  public static final String COLUMNNAME_LandedCostDistribution = "LandedCostDistribution";

  /** Set Cost Distribution. Landed Cost Distribution */
  public void setLandedCostDistribution(String LandedCostDistribution);

  /** Get Cost Distribution. Landed Cost Distribution */
  public String getLandedCostDistribution();

  /** Column name M_CostElement_ID */
  public static final String COLUMNNAME_M_CostElement_ID = "M_CostElement_ID";

  /** Set Cost Element. Product Cost Element */
  public void setM_CostElement_ID(int M_CostElement_ID);

  /** Get Cost Element. Product Cost Element */
  public int getM_CostElement_ID();

  public I_M_CostElement getM_CostElement() throws RuntimeException;

  /** Column name Processed */
  public static final String COLUMNNAME_Processed = "Processed";

  /** Set Processed. The document has been processed */
  public void setProcessed(boolean Processed);

  /** Get Processed. The document has been processed */
  public boolean isProcessed();

  /** Column name Updated */
  public static final String COLUMNNAME_Updated = "Updated";

  /** Get Updated. Date this record was updated */
  public Timestamp getUpdated();

  /** Column name UpdatedBy */
  public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

  /** Get Updated By. User who updated this records */
  public int getUpdatedBy();
}
