package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;

/**
 * Generated Interface for C_TaxProviderCfg
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_TaxProviderCfg {

  /** TableName=C_TaxProviderCfg */
  String Table_Name = "C_TaxProviderCfg";

  /** AD_Table_ID=200098 */
  int Table_ID = 200098;

    /** Load Meta Data */

    /** Get Tax Provider Class */
  String getTaxProviderClass();

    /** Get URL. Full URL address - e.g. http://www.idempiere.org */
  String getURL();

}
