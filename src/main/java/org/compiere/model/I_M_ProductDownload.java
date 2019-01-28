package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ProductDownload
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ProductDownload {

  /** TableName=M_ProductDownload */
  String Table_Name = "M_ProductDownload";

  /** AD_Table_ID=777 */
  int Table_ID = 777;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

    /** Column name DownloadURL */
  String COLUMNNAME_DownloadURL = "DownloadURL";
    /** Column name M_ProductDownload_ID */
  String COLUMNNAME_M_ProductDownload_ID = "M_ProductDownload_ID";
  /** Column name M_ProductDownload_UU */
  String COLUMNNAME_M_ProductDownload_UU = "M_ProductDownload_UU";
  /** Column name M_Product_ID */
  String COLUMNNAME_M_Product_ID = "M_Product_ID";

    /** Get Download URL. URL of the Download files */
  String getDownloadURL();

    /** Get Product. Product, Service, Item */
  int getM_Product_ID();

}
