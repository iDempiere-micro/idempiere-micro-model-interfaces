package org.compiere.model;

import java.math.BigDecimal;

/**
 * Generated Interface for C_ProjectPhase
 *
 * @author iDempiere (generated)
 * @version Release 5.1
 */
public interface I_C_ProjectPhase {

    /**
     * TableName=C_ProjectPhase
     */
    String Table_Name = "C_ProjectPhase";

    /**
     * AD_Table_ID=576
     */
    int Table_ID = 576;

    /**
     * AccessLevel = 3 - Client - Org
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);


    /**
     * Column name CommittedAmt
     */
    String COLUMNNAME_CommittedAmt = "CommittedAmt";
    /**
     * Column name C_Order_ID
     */
    String COLUMNNAME_C_Order_ID = "C_Order_ID";
    /**
     * Column name C_Phase_ID
     */
    String COLUMNNAME_C_Phase_ID = "C_Phase_ID";
    /**
     * Column name C_Project_ID
     */
    String COLUMNNAME_C_Project_ID = "C_Project_ID";
    /**
     * Column name C_ProjectPhase_ID
     */
    String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";
    /**
     * Column name Description
     */
    String COLUMNNAME_Description = "Description";
    /**
     * Column name Help
     */
    String COLUMNNAME_Help = "Help";
    /**
     * Column name IsCommitCeiling
     */
    String COLUMNNAME_IsCommitCeiling = "IsCommitCeiling";
    /**
     * Column name IsComplete
     */
    String COLUMNNAME_IsComplete = "IsComplete";
    /**
     * Column name M_Product_ID
     */
    String COLUMNNAME_M_Product_ID = "M_Product_ID";
    /**
     * Column name PriceActual
     */
    String COLUMNNAME_PriceActual = "PriceActual";
    /**
     * Column name Qty
     */
    String COLUMNNAME_Qty = "Qty";
    /**
     * Column name SeqNo
     */
    String COLUMNNAME_SeqNo = "SeqNo";

    /**
     * Set Committed Amount. The (legal) commitment amount
     */
    void setCommittedAmt(BigDecimal CommittedAmt);

    /**
     * Set Order. Order
     */
    void setOrderId(int C_Order_ID);

    /**
     * Get Standard Phase. Standard Phase of the Project Type
     */
    int getC_Phase_ID();

    /**
     * Set Standard Phase. Standard Phase of the Project Type
     */
    void setC_Phase_ID(int C_Phase_ID);

    /**
     * Get Project. Financial Project
     */
    int getProjectId();

    /**
     * Set Project. Financial Project
     */
    void setProjectId(int C_Project_ID);

    /**
     * Get Project Phase. Phase of a Project
     */
    int getProjectPhaseId();

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
     * Set Commitment is Ceiling. The commitment amount/quantity is the chargeable ceiling
     */
    void setIsCommitCeiling(boolean IsCommitCeiling);

    /**
     * Set Complete. It is complete
     */
    void setIsComplete(boolean IsComplete);

    /**
     * Get Product. Product, Service, Item
     */
    int getProductId();

    /**
     * Set Product. Product, Service, Item
     */
    void setProductId(int M_Product_ID);

    /**
     * Get Unit Price. Actual Price
     */
    BigDecimal getPriceActual();

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
