package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_Task
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_Task {

    /**
     * AD_Table_ID=583
     */
    int Table_ID = 583;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name C_Phase_ID
     */
    String COLUMNNAME_C_Phase_ID = "C_Phase_ID";
    /**
     * Column name C_Task_ID
     */
    String COLUMNNAME_C_Task_ID = "C_Task_ID";
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
     * Get Standard Task. Standard Project Type Task
     */
    int getTaskId();

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
    int getProductId();

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
