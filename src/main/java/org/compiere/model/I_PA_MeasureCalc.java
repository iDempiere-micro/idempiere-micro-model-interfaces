package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for PA_MeasureCalc
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_PA_MeasureCalc {

    /**
     * TableName=PA_MeasureCalc
     */
    String Table_Name = "PA_MeasureCalc";

    /**
     * AD_Table_ID=442
     */
    int Table_ID = 442;

    /**
     * AccessLevel = 6 - System - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);



    /**
     * Column name AD_Table_ID
     */
    String COLUMNNAME_AD_Table_ID = "AD_Table_ID";
    /**
     * Column name BPartnerColumn
     */
    String COLUMNNAME_BPartnerColumn = "BPartnerColumn";
    /**
     * Column name DateColumn
     */
    String COLUMNNAME_DateColumn = "DateColumn";
    /**
     * Column name KeyColumn
     */
    String COLUMNNAME_KeyColumn = "KeyColumn";
    /**
     * Column name OrgColumn
     */
    String COLUMNNAME_OrgColumn = "OrgColumn";
    /**
     * Column name ProductColumn
     */
    String COLUMNNAME_ProductColumn = "ProductColumn";
    /**
     * Column name SelectClause
     */
    String COLUMNNAME_SelectClause = "SelectClause";
    /**
     * Column name WhereClause
     */
    String COLUMNNAME_WhereClause = "WhereClause";

    /**
     * Get Table. Database Table information
     */
    int getAD_Table_ID();

    /**
     * Get B.Partner Column. Fully qualified Business Partner key column (C_BPartner_ID)
     */
    String getBPartnerColumn();

    /**
     * Get Date Column. Fully qualified date column
     */
    String getDateColumn();

    /**
     * Get Org Column. Fully qualified Organization column (AD_Org_ID)
     */
    String getOrgColumn();

    /**
     * Get Product Column. Fully qualified Product column (M_Product_ID)
     */
    String getProductColumn();

    /**
     * Get Sql SELECT. SQL SELECT clause
     */
    String getSelectClause();

    /**
     * Get Sql WHERE. Fully qualified SQL WHERE clause
     */
    String getWhereClause();

}
