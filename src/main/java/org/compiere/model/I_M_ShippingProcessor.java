package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for M_ShippingProcessor
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ShippingProcessor {

  /** TableName=M_ShippingProcessor */
  String Table_Name = "M_ShippingProcessor";

  /** AD_Table_ID=200039 */
  int Table_ID = 200039;

    /** AccessLevel = 3 - Client - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(3);

  /** Load Meta Data */

    /** Column name ConnectionKey */
  String COLUMNNAME_ConnectionKey = "ConnectionKey";
  /** Column name ConnectionPassword */
  String COLUMNNAME_ConnectionPassword = "ConnectionPassword";
    /** Column name M_ShippingProcessorCfg_ID */
  String COLUMNNAME_M_ShippingProcessorCfg_ID = "M_ShippingProcessorCfg_ID";
  /** Column name M_ShippingProcessor_ID */
  String COLUMNNAME_M_ShippingProcessor_ID = "M_ShippingProcessor_ID";
  /** Column name M_ShippingProcessor_UU */
  String COLUMNNAME_M_ShippingProcessor_UU = "M_ShippingProcessor_UU";
    /** Column name UserID */
  String COLUMNNAME_UserID = "UserID";

    /** Get Connection Key */
  String getConnectionKey();

    /** Get Connection Password */
  String getConnectionPassword();

    /** Get Shipping Processor Configuration */
  int getM_ShippingProcessorCfg_ID();

    I_M_ShippingProcessorCfg getM_ShippingProcessorCfg() throws RuntimeException;

    /** Get User ID. User ID or account number */
  String getUserID();

}
