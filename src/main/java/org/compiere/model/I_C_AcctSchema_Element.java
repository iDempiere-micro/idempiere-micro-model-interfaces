package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_AcctSchema_Element
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_AcctSchema_Element {

    /**
     * TableName=C_AcctSchema_Element
     */
    String Table_Name = "C_AcctSchema_Element";

    /**
     * AD_Table_ID=279
     */
    int Table_ID = 279;

    /**
     * AccessLevel = 2 - Client
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);



    /**
     * Column name AD_Column_ID
     */
    String COLUMNNAME_AD_Column_ID = "AD_Column_ID";
    /**
     * Column name C_AcctSchema_ID
     */
    String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
    /**
     * Column name C_Activity_ID
     */
    String COLUMNNAME_C_Activity_ID = "C_Activity_ID";
    /**
     * Column name C_BPartner_ID
     */
    String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
    /**
     * Column name C_Campaign_ID
     */
    String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";
    /**
     * Column name C_Element_ID
     */
    String COLUMNNAME_C_Element_ID = "C_Element_ID";
    /**
     * Column name C_ElementValue_ID
     */
    String COLUMNNAME_C_ElementValue_ID = "C_ElementValue_ID";
    /**
     * Column name C_Location_ID
     */
    String COLUMNNAME_C_Location_ID = "C_Location_ID";
    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name C_SalesRegion_ID
     */
    String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";
    /**
     * Column name ElementType
     */
    String COLUMNNAME_ElementType = "ElementType";
    /**
     * Column name IsBalanced
     */
    String COLUMNNAME_IsBalanced = "IsBalanced";
    /**
     * Column name IsMandatory
     */
    String COLUMNNAME_IsMandatory = "IsMandatory";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name Org_ID
     */
    String COLUMNNAME_Org_ID = "Org_ID";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";

    /**
     * Get Column. Column in the table
     */
    int getAD_Column_ID();

    /**
     * Get Accounting Schema. Rules for accounting
     */
    int getC_AcctSchema_ID();

    /**
     * Set Accounting Schema. Rules for accounting
     */
    void setC_AcctSchema_ID(int C_AcctSchema_ID);

    /**
     * Get Activity. Business Activity
     */
    int getC_Activity_ID();

    /**
     * Get Business Partner . Identifies a Business Partner
     */
    int getC_BPartner_ID();

    /**
     * Get Campaign. Marketing Campaign
     */
    int getC_Campaign_ID();

    /**
     * Get Element. Accounting Element
     */
    int getC_Element_ID();

    /**
     * Get Account Element. Account Element
     */
    int getC_ElementValue_ID();

    /**
     * Get Address. Location or Address
     */
    int getC_Location_ID();

    /**
     * Get Project. Financial Project
     */
    int getC_Project_ID();

    /**
     * Get Sales Region. Sales coverage region
     */
    int getC_SalesRegion_ID();

    /**
     * Get Type. Element Type (account or user defined)
     */
    String getElementType();

    /**
     * Set Balanced
     */
    void setIsBalanced(boolean IsBalanced);

    /**
     * Get Balanced
     */
    boolean isBalanced();

    /**
     * Set Mandatory. Data entry is required in this column
     */
    void setIsMandatory(boolean IsMandatory);

    /**
     * Get Mandatory. Data entry is required in this column
     */
    boolean isMandatory();

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Get Organization. Organizational entity within client
     */
    int getOrg_ID();

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

}
