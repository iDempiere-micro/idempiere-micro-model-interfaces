package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_Phase
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Phase {

    /**
     * TableName=C_Phase
     */
    String Table_Name = "C_Phase";

    /**
     * AD_Table_ID=577
     */
    int Table_ID = 577;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /**
     * Column name C_Phase_ID
     */
    String COLUMNNAME_C_Phase_ID = "C_Phase_ID";
    /**
     * Column name C_Phase_UU
     */
    String COLUMNNAME_C_Phase_UU = "C_Phase_UU";
    /**
     * Column name C_ProjectType_ID
     */
    String COLUMNNAME_C_ProjectType_ID = "C_ProjectType_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";
    /**
     * Column name StandardQty
     */
    String COLUMNNAME_StandardQty = "StandardQty";

    /**
     * Get Standard Phase. Standard Phase of the Project Type
     */
    int getC_Phase_ID();

    /**
     * Get Project Type. Type of the project
     */
    int getC_ProjectType_ID();

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Get Comment/Help. Comment or Hint
     */
    String getHelp();

    /**
     * Get Product. Product, Service, Item
     */
    int getM_Product_ID();

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

    /**
     * Get Standard Quantity. Standard Quantity
     */
    BigDecimal getStandardQty();

    /**
     * Set Standard Quantity. Standard Quantity
     */
    void setStandardQty(BigDecimal StandardQty);

}
