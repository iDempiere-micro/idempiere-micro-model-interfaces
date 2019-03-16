package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_ProjectTask
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_ProjectTask {

    /**
     * AD_Table_ID=584
     */
    int Table_ID = 584;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name C_ProjectPhase_ID
     */
    String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";
    /**
     * Column name C_ProjectTask_ID
     */
    String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";
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
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";

    /**
     * Get Project Phase. Phase of a Project
     */
    int getC_ProjectPhase_ID();

    /**
     * Set Project Phase. Phase of a Project
     */
    void setC_ProjectPhase_ID(int C_ProjectPhase_ID);

    I_C_ProjectPhase getC_ProjectPhase() throws RuntimeException;

    /**
     * Get Project Task. Actual Project Task in a Phase
     */
    int getC_ProjectTask_ID();

    /**
     * Get Standard Task. Standard Project Type Task
     */
    int getC_Task_ID();

    /**
     * Set Standard Task. Standard Project Type Task
     */
    void setC_Task_ID(int C_Task_ID);

    /**
     * Get Description. Optional short description of the record
     */
    String getDescription();

    /**
     * Set Description. Optional short description of the record
     */
    void setDescription(String Description);

    /**
     * Set Comment/Help. Comment or Hint
     */
    void setHelp(String Help);

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

    /**
     * Get Quantity. Quantity
     */
    BigDecimal getQty();

    /**
     * Set Quantity. Quantity
     */
    void setQty(BigDecimal Qty);

    /**
     * Get Sequence. Method of ordering records; lowest number comes first
     */
    int getSeqNo();

    /**
     * Set Sequence. Method of ordering records; lowest number comes first
     */
    void setSeqNo(int SeqNo);

}
