package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_Product_Category
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Product_Category {

  /** TableName=M_Product_Category */
  String Table_Name = "M_Product_Category";

  /** AD_Table_ID=209 */
  int Table_ID = 209;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

  /** Column name A_Asset_Group_ID */
  String COLUMNNAME_A_Asset_Group_ID = "A_Asset_Group_ID";
    /** Column name AD_PrintColor_ID */
  String COLUMNNAME_AD_PrintColor_ID = "AD_PrintColor_ID";
    /** Column name Description */
  String COLUMNNAME_Description = "Description";
    /** Column name IsDefault */
  String COLUMNNAME_IsDefault = "IsDefault";
  /** Column name IsSelfService */
  String COLUMNNAME_IsSelfService = "IsSelfService";
  /** Column name MMPolicy */
  String COLUMNNAME_MMPolicy = "MMPolicy";
  /** Column name M_Product_Category_ID */
  String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
  /** Column name M_Product_Category_Parent_ID */
  String COLUMNNAME_M_Product_Category_Parent_ID = "M_Product_Category_Parent_ID";
  /** Column name M_Product_Category_UU */
  String COLUMNNAME_M_Product_Category_UU = "M_Product_Category_UU";
  /** Column name PlannedMargin */
  String COLUMNNAME_PlannedMargin = "PlannedMargin";

    /** Get Asset Group. Group of Assets */
  int getA_Asset_Group_ID();

    I_A_Asset_Group getA_Asset_Group() throws RuntimeException;

    /** Get Print Color. Color used for printing and display */
  int getAD_PrintColor_ID();

    /** Set Default. Default value */
  void setIsDefault(boolean IsDefault);

    /**
   * Set Self-Service. This is a Self-Service entry or this entry can be changed via Self-Service
   */
  void setIsSelfService(boolean IsSelfService);

    /** Get Material Policy. Material Movement Policy */
  String getMMPolicy();

  /** Set Material Policy. Material Movement Policy */
  void setMMPolicy(String MMPolicy);

  /** Get Product Category. Category of a Product */
  int getM_Product_Category_ID();

    /** Get Parent Product Category */
  int getM_Product_Category_Parent_ID();

    /** Get Planned Margin %. Project's planned margin as a percentage */
  BigDecimal getPlannedMargin();

  /** Set Planned Margin %. Project's planned margin as a percentage */
  void setPlannedMargin(BigDecimal PlannedMargin);

    /** Set Search Key. Search key for the record in the format required - must be unique */
  void setValue(String Value);
}
