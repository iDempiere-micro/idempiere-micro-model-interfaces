package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.idempiere.common.util.KeyNamePair;
import org.idempiere.icommon.model.IPO;

/**
 * Generated Interface for C_OrderTax
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_OrderTax extends IPO {

  /** TableName=C_OrderTax */
  String Table_Name = "C_OrderTax";

  /** AD_Table_ID=314 */
  int Table_ID = 314;

    /** AccessLevel = 1 - Org */
  BigDecimal accessLevel = BigDecimal.valueOf(1);

  /** Load Meta Data */

    /** Column name C_Order_ID */
  String COLUMNNAME_C_Order_ID = "C_Order_ID";
  /** Column name C_OrderTax_UU */
  String COLUMNNAME_C_OrderTax_UU = "C_OrderTax_UU";
    /** Column name C_Tax_ID */
  String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
  /** Column name C_TaxProvider_ID */
  String COLUMNNAME_C_TaxProvider_ID = "C_TaxProvider_ID";
    /** Column name IsTaxIncluded */
  String COLUMNNAME_IsTaxIncluded = "IsTaxIncluded";
  /** Column name Processed */
  String COLUMNNAME_Processed = "Processed";
  /** Column name TaxAmt */
  String COLUMNNAME_TaxAmt = "TaxAmt";
  /** Column name TaxBaseAmt */
  String COLUMNNAME_TaxBaseAmt = "TaxBaseAmt";

    /** Get Organization. Organizational entity within client */
  int getOrgId();

    /** Get Tax Provider */
  int getC_TaxProvider_ID();

    /** Get Tax Amount. Tax Amount for a document */
  BigDecimal getTaxAmt();

    /** Get Tax base Amount. Base for calculating the tax amount */
  BigDecimal getTaxBaseAmt();

    I_C_Tax getTax();

  boolean delete(boolean b, String trxName);

  boolean save(String trxName);
}
