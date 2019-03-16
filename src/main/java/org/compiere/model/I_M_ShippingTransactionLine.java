package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for M_ShippingTransactionLine
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_M_ShippingTransactionLine {

    /**
     * AD_Table_ID=200052
     */
    int Table_ID = 200052;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name C_UOM_Length_ID
     */
    String COLUMNNAME_C_UOM_Length_ID = "C_UOM_Length_ID";
    /**
     * Column name C_UOM_Weight_ID
     */
    String COLUMNNAME_C_UOM_Weight_ID = "C_UOM_Weight_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Height
     */
    String COLUMNNAME_Height = "Height";
    /**
     * Column name Length
     */
    String COLUMNNAME_Length = "Length";
    /**
     * Column name M_PackageMPS_ID
     */
    String COLUMNNAME_M_PackageMPS_ID = "M_PackageMPS_ID";
    /**
     * Column name M_ShippingTransaction_ID
     */
    String COLUMNNAME_M_ShippingTransaction_ID = "M_ShippingTransaction_ID";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name Weight
     */
    String COLUMNNAME_Weight = "Weight";
    /**
     * Column name Width
     */
    String COLUMNNAME_Width = "Width";

    /**
     * Set Organization. Organizational entity within client
     */
    void setOrgId(int AD_Org_ID);

    /**
     * Set UOM for Length. Standard Unit of Measure for Length
     */
    void setUOMLengthId(int C_UOM_Length_ID);

    /**
     * Set UOM for Weight. Standard Unit of Measure for Weight
     */
    void setUOMWeightId(int C_UOM_Weight_ID);

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Set Height
     */
    void setHeight(BigDecimal Height);

    /**
     * Set Active. The record is active in the system
     */
    void setIsActive(boolean IsActive);

    /**
     * Set Length
     */
    void setLength(BigDecimal Length);

    /**
     * Set Shipping Transaction
     */
    void setShippingTransactionId(int M_ShippingTransaction_ID);

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

    /**
     * Set Weight. Weight of a product
     */
    void setWeight(BigDecimal Weight);

    /**
     * Set Width
     */
    void setWidth(BigDecimal Width);
}
