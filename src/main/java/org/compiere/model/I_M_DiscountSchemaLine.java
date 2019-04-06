package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_DiscountSchemaLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_DiscountSchemaLine {

    /**
     * AD_Table_ID=477
     */
    int Table_ID = 477;

    /**
     * TableName=M_DiscountSchemaLine
     */
    String Table_Name = "M_DiscountSchemaLine";

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_ConversionType_ID
     */
    String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";
    /**
     * Column name Limit_AddAmt
     */
    String COLUMNNAME_Limit_AddAmt = "Limit_AddAmt";
    /**
     * Column name Limit_Base
     */
    String COLUMNNAME_Limit_Base = "Limit_Base";
    /**
     * Column name Limit_Discount
     */
    String COLUMNNAME_Limit_Discount = "Limit_Discount";
    /**
     * Column name List_AddAmt
     */
    String COLUMNNAME_List_AddAmt = "List_AddAmt";
    /**
     * Column name List_Base
     */
    String COLUMNNAME_List_Base = "List_Base";
    /**
     * Column name List_Discount
     */
    String COLUMNNAME_List_Discount = "List_Discount";
    /**
     * Column name M_DiscountSchema_ID
     */
    String COLUMNNAME_M_DiscountSchema_ID = "M_DiscountSchema_ID";
    /**
     * Column name M_Product_Category_ID
     */
    String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name Std_AddAmt
     */
    String COLUMNNAME_Std_AddAmt = "Std_AddAmt";
    /**
     * Column name Std_Base
     */
    String COLUMNNAME_Std_Base = "Std_Base";
    /**
     * Column name Std_Discount
     */
    String COLUMNNAME_Std_Discount = "Std_Discount";

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

}
