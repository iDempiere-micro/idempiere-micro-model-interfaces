package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for R_Group
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_R_Group {

    /**
     * TableName=R_Group
     */
    String Table_Name = "R_Group";

    /**
     * AD_Table_ID=773
     */
    int Table_ID = 773;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);


    /**
     * Column name M_ChangeNotice_ID
     */
    String COLUMNNAME_M_ChangeNotice_ID = "M_ChangeNotice_ID";
    /**
     * Column name PP_Product_BOM_ID
     */
    String COLUMNNAME_PP_Product_BOM_ID = "PP_Product_BOM_ID";

    /**
     * Get Change Notice. Bill of Materials (Engineering) Change Notice (Version)
     */
    int getChangeNoticeId();

    /**
     * Get BOM & Formula. BOM & Formula
     */
    int getPPProductBOMId();

}
