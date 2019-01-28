package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_Lot
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_Lot {

  /** TableName=M_Lot */
  String Table_Name = "M_Lot";

  /** AD_Table_ID=557 */
  int Table_ID = 557;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

    /** Column name DateFrom */
  String COLUMNNAME_DateFrom = "DateFrom";
  /** Column name DateTo */
  String COLUMNNAME_DateTo = "DateTo";
  /** Column name Description */
  String COLUMNNAME_Description = "Description";
  /** Column name Help */
  String COLUMNNAME_Help = "Help";
    /** Column name M_LotCtl_ID */
  String COLUMNNAME_M_LotCtl_ID = "M_LotCtl_ID";
  /** Column name M_Lot_ID */
  String COLUMNNAME_M_Lot_ID = "M_Lot_ID";
  /** Column name M_Lot_UU */
  String COLUMNNAME_M_Lot_UU = "M_Lot_UU";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";

    /** Get Lot Control. Product Lot Control */
  int getM_LotCtl_ID();

  /** Set Lot Control. Product Lot Control */
  void setM_LotCtl_ID(int M_LotCtl_ID);

    /** Get Lot. Product Lot Definition */
  int getM_Lot_ID();

    /** Get Product. Product, Service, Item */
  int getM_Product_ID();

  /** Set Product. Product, Service, Item */
  void setM_Product_ID(int M_Product_ID);

}
