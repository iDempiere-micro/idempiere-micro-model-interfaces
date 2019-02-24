package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_ProductDownload
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ProductDownload {

    /**
     * AD_Table_ID=777
     */
    int Table_ID = 777;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);



    /**
     * Column name DownloadURL
     */
    String COLUMNNAME_DownloadURL = "DownloadURL";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";

    /**
     * Get Download URL. URL of the Download files
     */
    String getDownloadURL();

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

}
